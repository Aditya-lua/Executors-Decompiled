/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69758..0x699f8 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69758_1 {
    struct st_69758_0 *field_0;
} st_69758_1;

typedef struct st_69758_0 {
    char field_0;
} st_69758_0;


long long sub_69758(unsigned long a0, long long a1, long long a2, long long a3, long long a4, unsigned int *a5, char *a6)
{
    unsigned int v13;  // w23
    unsigned int v14;  // w8
    long long v15;  // x21
    long long v16;  // x0
    long long v17;  // x22
    long long v19;  // x0
    st_69758_0 **v0;  // [bp-0x168], Other Possible Types: char
    st_69758_0 *v1;  // [bp-0x160]
    char *v2;  // [bp-0x158], Other Possible Types: st_69758_1 **
    unsigned int v3;  // [bp-0x140]
    char v4;  // [bp-0x138]
    char v5;  // [bp-0x120]
    char v6;  // [bp-0xf0]
    char v7;  // [bp-0xd8]
    char *v8;  // [bp-0x78]
    char v9;  // [bp-0x69]
    st_69758_0 **v10;  // [bp-0x68], Other Possible Types: st_69758_1 **, char
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v1 = &v0;
    v0 = &v1;
    sub_69a54();
    if (v3)
        return !v3;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a1, &v4);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a2, &v5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a3, &v6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a4, &v7);
    v13 = sub_69420(a1);
    if (sub_696cc(&v3, a5))
    {
        v14 = *a5;
    }
    else
    {
        *a5 = v13;
        v14 = v13;
    }
    *a6 = v14 == v13;
    v2 = &v10;
    v10 = &v2;
    if (!sub_6b08(a3))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a3, "/");
    }
    else if (*(char *)sub_9c78(a3, 0) != 47)
    {
        v10 = &v8;
        v8 = &v10;
        v15 = sub_6b08(a3);
        sub_64128(&v2, v15 + 1, &v9);
        v16 = sub_a0c8(&v2);
        v9 = 47;
        sub_348a4(v16, 1, &v9);
        v17 = v16 + 1;
        sub_12478(v17, sub_a0c8(a3), v15);
        v9 = 0;
        sub_348a4(v17 + v15, 1, &v9);
        sub_5ccc(a3, &v2);
    }
    v2 = &v10;
    v10 = &v2;
    if (sub_6b08(a4))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a3, L"?&界畡浅瑩慃汬敆摥慢正䰀慵噵物畴污捂畂汩敤r界畡祂整潣敤潃瑳潍敤l界畡潃灭汩䕥業噴捥潴䑲畯汢e氥摬─㤮Ⱨ┠㤮Ⱨ┠㤮g⸥朹\u202c⸥朹\u202c⸥朹\u202c⸥朹─ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷─ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g┧⨮❳⸮.'硜〥堲─c⸧⸮─⨮s┮⨮s㴠 ⌠甥\u2000挨湯汦捩⥴紀猠穩湥摯㵥甥笀⸮紮挀慬獳┠⨮\u2073瀨潲獰›稥Ⱶ洠瑥潨獤›稥⥵\u0a00戀潯敬湡椀瑮来牥琀扡敬琀牨慥d獵牥慤慴戀晵敦r湡y敄畢䱧慵呵浩呥慲楣杮瀀i畨敧渀湡攀瀀楨猀牱㉴琀畡䰀慵䥵瑮来牥慆瑳慣汬s界畡湉整敧䉲晵敦䙲獡捴污獬愀獳牥t慲獷瑥爀睡敧t慲敷畱污爀睡敬n湵慰正猀汥捥t敧浴瑥瑡扡敬猀瑥敭慴慴汢e潴畮扭牥琀獯牴湩g慭桴愀獢愀潣s獡湩愀慴㉮愀慴n散汩挀獯h潣s敤g硥p汦潯r浦摯昀敲灸氀敤灸氀杯〱氀杯洀硡洀湩洀摯f潰w慲d楳桮猀湩猀牱t慴桮琀湡挀慬灭猀杩n潲湵d敬灲椀湳湡椀楳普椀晳湩瑩e楢㍴2牡桳晩t慢摮戀潮t潢r硢牯戀整瑳攀瑸慲瑣氀潲慴整氀桳晩t敲汰捡e牲瑯瑡e獲楨瑦挀畯瑮穬挀畯瑮穲戀瑹獥慷p祢整挀慨r敬n畳b湩敳瑲爀慥楤8敲摡㡵眀楲整㡩眀楲整㡵爀慥楤㘱爀慥畤㘱眀楲整ㅩ6牷瑩略㘱爀慥楤㈳爀慥畤㈳眀楲整㍩2牷瑩略㈳爀慥晤㈳眀楲整㍦2敲摡㙦4牷瑩晥㐶爀慥楤瑮来牥眀楲整湩整敧r牣慥整洀条", 1);
        v19 = sub_a0c8(a4);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a3, v19, sub_6b08(a4));
    }
    return !v3;
}
