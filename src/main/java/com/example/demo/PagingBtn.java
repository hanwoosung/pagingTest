package com.example.demo;

/**
 * totalCount : 총개수 , totalPage : 총 페이지 , @currentPage : 현제페이지 , startPage : 시작 페이지
 * endPage : 끝 페이지 , pageSize : 한 페이지에 보여줄 개수 , btnSize : 페이지 버튼 최대 개수
 * prevBtn : 이전버튼 . nextBtn : 다음버튼
 */
public class PagingBtn { // 총개수 ,총페이지,현재페이지,시작페이지,끝페이지, 한페이지 개수, 버튼개수,이전버튼,다음버튼
    private int totalCount;
    private int totalPage;
    private int currentPage;
    private int startPage;
    private int endPage;
    private int pageSize = 10;
    private int btnSize = 10;
    private boolean prevBtn;
    private boolean nextBtn;

    public PagingBtn(int totalCount, int currentPage) {
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        createPagingBtn(totalCount);
    }

    public void createPagingBtn(int totalCount) {

        this.totalPage = (int) Math.ceil(totalCount / (double) pageSize); //총 페이지(버튼)
        this.startPage = currentPage / btnSize * btnSize + 1;   // 시작페이지
        this.endPage = Math.min((startPage + btnSize - 1), totalPage); // 끝페이지 (버튼개수가 토탈카운터보다 작으면 토탈카운터가 들어감)
        this.prevBtn = startPage != 1;  // 이전버튼 활성화
        this.nextBtn = endPage != totalPage; // 다음버튼 활성화

    }


    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getBtnSize() {
        return btnSize;
    }

    public boolean isPrevBtn() {
        return prevBtn;
    }

    public boolean isNextBtn() {
        return nextBtn;
    }


}
