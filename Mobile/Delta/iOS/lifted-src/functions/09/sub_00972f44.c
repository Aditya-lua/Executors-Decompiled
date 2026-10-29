/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972f44..0x973154 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_972f44(unsigned long long a0)
{
    unsigned long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long i;  // x25
    unsigned long v14;  // x21
    unsigned long long v15;  // x21
    unsigned long long v16;  // x8
    unsigned long long v17;  // x19
    unsigned long long v18;  // x0
    unsigned long long v19;  // x21
    unsigned long long v5;  // x24
    unsigned long long len;  // x0
    unsigned long long v7;  // x21
    unsigned long long v8;  // x25
    unsigned long long v9;  // x26
    long long v10;  // x23
    unsigned long long v11;  // x0
    unsigned long long *v12;  // x20
    unsigned long v0;  // [bp-0x60], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6ac44("QLOGDIR");
    v4 = sub_a6ac44("OSSL_QFILTER");
    if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        v5 = v4;
        len = _strlen(v3);
        if (!len)
            return len;
        v7 = len;
        if (*(char *)v3 && *(char *)(v3 + _strlen(v3) - 1) == 47)
        {
            v8 = 0;
            v9 = 1;
        }
        else
        {
            v9 = 0;
            v8 = 47;
        }
        v10 = v7 + *(char *)a0 * 2 + 15;
        v11 = sub_a6bf4c(v10, "ssl/quic/qlog.c", 125);
        if (!v11)
            return v11;
        v12 = v11;
        _memcpy();
        if (!(v9 & 1))
            *((char *)v12 + v7) = v8;
        if (*(char *)a0)
        {
            i = 0;
            do
            {
                v0 = *(char *)(a0 + i + 1);
                v15 = v14 + sub_9d5b44((char *)v12 + v14, v10 - v14, "%02x");
                i += 1;
            } while (i < *(char *)a0);
        }
        if (!*(int *)(a0 + 48))
            v16 = "client";
        else
            v16 = "server";
        v0 = v16;
        sub_9d5b44();
        v17 = sub_972dd4(a0);
        if (v17)
        {
            v18 = sub_9d8180(v12, "wb");
            if (v18)
            {
                v19 = v18;
                sub_971da8(v17 + 152);
                sub_9d5018(*(long long *)(v17 + 88));
                *(unsigned long long *)(v17 + 88) = v19;
                sub_971e40(v17 + 152, v19);
                if (!v5 || !*(char *)v5)
                    v5 = L"*/⼯愀摮漀r攼景>㴧✽✀㴼'㸧✽✀㵾'⸧✮✀⸮✮✀㸭'㨧✺✀⼯'⬧✽✀㴭'⨧✽✀㴯'⼧㴯'┧✽✀㵞'⸧㴮'┢⨮≳猀牴湩g╠⨮筳琀敨戠来湩楮杮漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪{桴\u2065業摤敬漠\u2066湡椠瑮牥潰慬整\u2064瑳楲杮紀⸥猪`桴\u2065湥\u2064景愠\u206e湩整灲汯瑡摥猠牴湩g╠⨮恳椀瑮牥潰慬整\u2064瑳楲杮✀⸥猪'畮扭牥✀猥'摩湥楴楦牥挀浯敭瑮愀瑴楲畢整✀孀'慭晬牯敭\u2064瑳楲杮甀普湩獩敨\u2064潣浭湥t笧❻\u202c桷捩\u2068獩椠癮污摩⠠楤\u2064潹⁵敭湡✠筜㼧)湕捩摯\u2065档牡捡整\u2072⭕砥⠠楤\u2064潹⁵敭湡✠猥㼧)湕捩摯\u2065档牡捡整\u2072⭕砥椀癮污摩唠䙔㠭猠煥敵据e┧❣㰀湵湫睯㹮戀敲歡搀o汥敳攀獬楥f湥d慦獬e潦r畦据楴湯椀f湩氀捯污渀汩爀灥慥t敲畴湲琀敨n牴敵甀瑮汩眀楨敬瘀捥潴r界畡敒畣獲潩䱮浩瑩䰀慵呵灹䱥湥瑧䱨浩瑩䰀慵偵牡敳牅潲䱲浩瑩䰀慵卵汯敶噲2敄畢䱧慵創灥牯剴瑥牵呮灹噥牡慩楤坣瑩周灹卥晵楦x界畡湉整敧呲灹㉥䰀慵䕵灸牯噴污敵祓瑮硡䐀扥杵界畡潎湉楬敮䐀扥杵界畡獕牥敄楦敮䍤慬獳獥䰀慵䅵汬睯汇扯污敄汣牡瑡潩呮䉯䍥污敬䍤慬獳䰀慵䑵獩污潬䕷瑸牥䍮慬獳湉祔数敄楦楮楴湯s界畡瑓牯䍥湯瑳敋睹牯䉤来湩䰀慵呵慲正牐晥硩潌慣l界畡潎畄汰捩瑡䉥湩牡偹敲楦x摀灥敲慣整\u2064慣\u206e敢瀠牡浡瑥楲敺\u2064湯祬";
                if (sub_973154(v17, v5))
                {
                    sub_a6c2e4(v12, "ssl/quic/qlog.c", 152);
                    return v17;
                }
            }
        }
        sub_a6c2e4(v12, "ssl/quic/qlog.c", 156);
        sub_973994(v17);
        return 0;
    }
    else
    {
        return 0;
    }
}
