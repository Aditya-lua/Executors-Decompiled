/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a4ef8..0x1a50d8 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1a4ef8(long long a0, long long a1, unsigned int a2)
{
    long long v8;  // x23
    long long v9;  // x24
    long long v11;  // x22
    long long v12;  // x0
    long long v13;  // x0
    long long v15;  // x8
    long long v17;  // x8
    char v0;  // [bp-0xb0], Other Possible Types: long long
    char v1;  // [bp-0xa8]
    char v2;  // [bp-0x90]
    char v3;  // [bp-0x78]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x41]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = sub_6b08();
    sub_64128(&v2, v8 + 1, &v5);
    v9 = sub_a0c8(&v2);
    sub_12478(v9, sub_a0c8(a0), v8);
    v11 = v9 + v8;
    sub_12478(v11, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺)\n潢汯慥n湩整敧r慴汢e桴敲摡甀敳摲瑡a畢晦牥愀祮䐀扥杵界畡楔敭牔捡湩g楰栀杵e慮ne桰i煳瑲2慴u界畡湉整敧䙲獡捴污獬䰀慵䥵瑮来牥畂晦牥慆瑳慣汬s獡敳瑲爀睡敳t慲杷瑥爀睡煥慵l慲汷湥甀灮捡k敳敬瑣最瑥敭慴慴汢e敳浴瑥瑡扡敬琀湯浵敢r潴瑳楲杮洀瑡h扡s捡獯愀楳n瑡湡2瑡湡挀楥l潣桳挀獯搀来攀灸昀潬牯昀潭d牦硥p摬硥p潬ㅧ0潬g慭x業n潭晤瀀睯爀摡猀湩h楳n煳瑲琀湡h慴n汣浡p楳湧爀畯摮氀牥p獩慮n獩湩f獩楦楮整戀瑩㈳愀獲楨瑦戀湡d湢瑯戀牯戀潸r瑢獥t硥牴捡t牬瑯瑡e獬楨瑦爀灥慬散爀潲慴整爀桳晩t潣湵汴z潣湵牴z祢整睳灡戀瑹e档牡氀湥猀扵椀獮牥t敲摡㡩爀慥畤8牷瑩楥8牷瑩略8敲摡ㅩ6敲摡ㅵ6牷瑩楥㘱眀楲整ㅵ6敲摡㍩2敲摡㍵2牷瑩楥㈳眀楲整㍵2敲摡㍦2牷瑩晥㈳爀慥晤㐶眀楲整㙦4敲摡湩整敧r牷瑩", 1);
    v5 = 0;
    sub_348a4(v11 + 1, 1, &v5);
    v12 = sub_a0c8(a1);
    v13 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, v12, sub_6b08(a1));
    sub_5c38(&v3, v13);
    sub_1a4b74(&v3);
    sub_5c38(&v4, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::insert(&v0, 0, "Basic ", 6));
    v15 = "Authorization";
    if (a2)
        v15 = "Proxy-Authorization";
    v0 = v15;
    sub_5c38();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v17, v0, _strlen(v0));
    sub_5c38(v17 + 24, &v1);
    return &v4;
}
