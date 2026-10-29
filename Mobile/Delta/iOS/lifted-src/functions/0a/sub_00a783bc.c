/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa783bc..0xa78648 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a783bc(unsigned long long a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long len;  // x24
    unsigned long long v5;  // x0
    unsigned long long v6;  // x23
    unsigned long long v7;  // x26
    unsigned long long v8;  // x25
    long long *v9;  // x26
    unsigned long long v10;  // x0
    char v0;  // [bp-0x268]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    len = a2;
    v1 = *(long long *)&g_10002b0;
    v5 = sub_9f4bd0(a4, a3);
    if (v5)
    {
        v6 = v5;
        if ((int)sub_ad69e4(a5) >= 1)
        {
            v7 = 0;
            do
            {
                if (sub_ad69f8(a5, v7) == a3)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/provider_conf.c", 100, "provider_conf_params_internal");
                    sub_a36abc(14, 126, 0);
                    goto LABEL_a785a0;
                }
            } while ((v7 = (unsigned int)v7 + 1, (int)v7 < (int)sub_ad69e4(a5)));
        }
        if (sub_ad68a0(a5, a3))
        {
            if (len)
            {
                sub_a6db20(&v0, len, 0x200);
                sub_a6db94(&v0, L".?&界畡浅瑩慃汬敆摥慢正䰀慵噵物畴污捂畂汩敤r界畡祂整潣敤潃瑳潍敤l界畡潃灭汩䕥業噴捥潴䑲畯汢e氥摬─㤮Ⱨ┠㤮Ⱨ┠㤮g⸥朹\u202c⸥朹\u202c⸥朹\u202c⸥朹─ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷─ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g┧⨮❳⸮.'硜〥堲─c⸧⸮─⨮s┮⨮s㴠 ⌠甥\u2000挨湯汦捩⥴紀猠穩湥摯㵥甥笀⸮紮挀慬獳┠⨮\u2073瀨潲獰›稥Ⱶ洠瑥潨獤›稥⥵\u0a00戀潯敬湡椀瑮来牥琀扡敬琀牨慥d獵牥慤慴戀晵敦r湡y敄畢䱧慵呵浩呥慲楣杮瀀i畨敧渀湡攀瀀楨猀牱㉴琀畡䰀慵䥵瑮来牥慆瑳慣汬s界畡湉整敧䉲晵敦䙲獡捴污獬愀獳牥t慲獷瑥爀睡敧t慲敷畱污爀睡敬n湵慰正猀汥捥t敧浴瑥瑡扡敬猀瑥敭慴慴汢e潴畮扭牥琀獯牴湩g慭桴愀獢愀潣s獡湩愀慴㉮愀慴n散汩挀獯h潣s敤g硥p汦潯r浦摯昀敲灸氀敤灸氀杯〱氀杯洀硡洀湩洀摯f潰w慲d楳桮猀湩猀牱t慴桮琀湡挀慬灭猀杩n潲湵d敬灲椀湳湡椀楳普椀晳湩瑩e楢㍴2牡桳晩t慢摮戀潮t潢r硢牯戀整瑳攀瑸慲瑣氀潲慴整氀桳晩t敲汰捡e牲瑯瑡e獲楨瑦挀畯瑮穬挀畯瑮穲戀瑹獥慷p祢整挀慨r敬n畳b湩敳瑲爀慥楤8敲摡㡵眀楲整㡩眀楲整㡵爀慥楤㘱爀慥畤㘱眀楲整ㅩ6牷瑩略㘱爀慥楤㈳爀慥畤㈳眀楲整㍩2牷瑩略㈳爀慥晤㈳眀楲整㍦2敲摡㙦4牷瑩晥㐶爀慥楤瑮来牥眀楲整湩整敧r牣慥整洀", 0x200);
                len = _strlen(&v0);
            }
            if ((int)sub_ad69e4(v6) >= 1)
            {
                v8 = 0;
                do
                {
                    v9 = sub_ad69f8(v6, v8);
                    if (0x200 > _strlen(v9[1]) + len)
                    {
                        (&v0)[len] = 0;
                        sub_a6db94(&v0, v9[1], 0x200);
                        v10 = sub_a783bc(a0, a1, &v0, v9[2], a4, a5);
                        if (v10 >> 31 & 1)
                        {
                            sub_ad692c(a5);
                            goto LABEL_a785a4;
                        }
                    }
                    else
                    {
                        sub_ad692c(a5);
                        v10 = 0xffffffff;
                        goto LABEL_a785a4;
                    }
                } while ((v8 = (unsigned int)v8 + 1, (int)v8 < (int)sub_ad69e4(v6)));
            }
            sub_ad692c(a5);
            v10 = 1;
        }
        else
        {
LABEL_a785a0:
            v10 = 0xffffffff;
        }
LABEL_a785a4:
        if (*(long long *)&g_10002b0 == v1)
            return v10;
    }
    ___stack_chk_fail();
}
