package com.example.market

fun itemList(): List<Item> {
    return listOf(
        Item(
            photo = (R.drawable.sample1),
            title = "산진 한달된 선풍기 팝니다",
            introduce = "이사가서 필요가 없어졌어요 급하게 내놓습니다",
            seller = "대현동",
            price = 1000,
            place = "서울 서대문구 창천동",
            good = 13,
            chat = 25,
            viewtype = 1
        ),
        Item(
            photo = (R.drawable.sample2),
            title = "김치냉장고",
            introduce = "이사로인해 내놔요",
            seller = "안마담",
            price = 20000,
            place = "인천 계양구 귤현동",
            good = 8,
            chat = 28,
            viewtype = 2
        ),
        Item(
            photo = (R.drawable.sample3),
            title = "샤넬 카드지갑",
            introduce = "고퀄지갑이구요\n사용감이 있어서 싸게 내어둡니다",
            seller = "코코유",
            price = 10000,
            place = "수성구 범어동",
            good = 23,
            chat = 5,
            viewtype = 3
        ),
        Item(
            photo = (R.drawable.sample4),
            title = "금고",
            introduce = "금고 \n떼서 가져가야함 대우월드마크센텀\n미국이주관계로 싸게 팝니다",
            seller = "Nicole",
            price = 10000,
            place = "해운대구 우제2동",
            good = 14,
            chat = 17,
            viewtype = 4
        ),
        Item(
            photo = (R.drawable.sample5),
            title = "갤럭시Z플립3 팝니다",
            introduce = "갤럭시 Z플립3 그린 팝니다\n항시 케이스 씌워서 썻고 필름 한장챙겨드립니다\n화면에 살짝 스크래치난거 말고 크게 이상은없습니다!\n",
            seller = "절명",
            price = 50000,
            place = "연제구 연산제8동",
            good = 22,
            chat = 9,
            viewtype = 5
        ),
        Item(
            (R.drawable.sample6),
            "",
            "",
            "",
            2,
            "",
            2,
            2,
            6
        )

    )
}