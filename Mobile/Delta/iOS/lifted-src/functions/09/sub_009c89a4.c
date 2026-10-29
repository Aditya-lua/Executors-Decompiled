/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c89a4..0x9c8d20 (892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aef19c;

int sub_9c89a4(unsigned long a0, long long a1)
{
    unsigned long v8;  // x0
    unsigned long v9;  // x19
    long long num;  // x24
    long long num1;  // x25
    unsigned long long *v20;  // x26
    unsigned long v21;  // x21
    unsigned long v22;  // x19
    unsigned long v23;  // x9
    unsigned long v24;  // x2
    long long v25;  // x1
    long long v27;  // x1
    unsigned long v10;  // x20
    unsigned long long *v11;  // x0
    unsigned long v12;  // x21
    unsigned long v13;  // x22
    unsigned long long v14;  // x0
    unsigned long v15;  // x0
    unsigned long v16;  // x28
    unsigned long v17;  // x23
    unsigned long v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = sub_9f4bd0(a1, sub_c4ba8());
    if (v8)
    {
        v9 = v8;
        if ((int)sub_ad69e4() < 1)
            return 1;
        v10 = 0;
        v2 = v9;
        while (1)
        {
            v11 = sub_ad69f8(v9, v10);
            v12 = v11[1];
            v13 = v11[2];
            v4 = 0;
            v14 = sub_a998f4(v12);
            if ((unsigned int)v14 || (v14 = sub_a99a1c(v12), (unsigned int)v14))
            {
                v15 = sub_aef8d8(v13);
                if (!v15)
                    goto LABEL_9c8cb4;
                v16 = v15;
                if ((int)sub_ad69e4() >= 1)
                {
                    v3 = v13;
                    v17 = 0;
                    num = -0x1;
                    num1 = -0x1;
                    do
                    {
                        v20 = sub_ad69f8(v16, v17);
                        v21 = v20[2];
                        if (v21)
                        {
                            v22 = v20[1];
                            if (_strcmp(v22, "min"))
                            {
                                if (!_strcmp(v22, "max"))
                                {
                                    num = _strtoul(v21, &v5, 0);
                                    if (!*v5)
                                        continue;
                                }
                                else if (_strcmp(v22, "mask"))
                                {
                                    if (!_strcmp(v22, "flags"))
                                    {
                                        if (!_strcmp(v21, "nomask"))
                                        {
                                            continue;
                                        }
                                        else if (!_strcmp(v21, "none"))
                                        {
                                            continue;
                                        }
                                    }
                                }
                                else
                                {
                                    if (sub_9c6a80(v21, &v4) && v4)
                                        continue;
                                }
                                goto LABEL_9c8c08;
                            }
                            num1 = _strtoul(v21, &v5, 0);
                            if (*v5)
                                goto LABEL_9c8c08;
                        }
                        else
                        {
LABEL_9c8c08:
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/asn_mstbl.c", 0x66, "do_tcreate");
                            v23 = v20[2];
                            if (!v20[2])
                                v23 = v3;
                            v0 = v20[1];
                            v1 = v23;
                            v24 = "field=%s, value=%s";
                            v25 = 218;
                            goto LABEL_9c8c48;
                        }
                    } while ((v17 = (unsigned int)v17 + 1, (int)sub_ad69e4(v16) > (int)v17));
                    v9 = v2;
                }
                else
                {
                    num1 = -0x1;
                    num = -0x1;
                }
                if (sub_9c45c4(v14, num1, num))
                {
                    sub_ad6958(v16, &g_aef19c);
                    v10 = (unsigned int)v10 + 1;
                    if ((int)v10 >= (int)sub_ad69e4(v9))
                        return 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/asn_mstbl.c", 113, "do_tcreate");
                    v25 = 524301;
                    v24 = 0;
LABEL_9c8c48:
                    sub_a36abc(13, v25, v24);
                    break;
                }
            }
            else
            {
LABEL_9c8cb4:
                sub_a368c8();
                sub_a369bc("crypto/asn1/asn_mstbl.c", 107, "do_tcreate");
                v0 = v12;
                v1 = v13;
                sub_a36abc(13, 218, "name=%s, value=%s");
                v16 = 0;
                break;
            }
        }
        sub_a368c8(sub_ad6958(v16, &g_aef19c), &g_aef19c);
        sub_a369bc("crypto/asn1/asn_mstbl.c", 35, "stbl_module_init");
        v27 = 219;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn_mstbl.c", 29, "stbl_module_init");
        v27 = 172;
    }
    sub_a36abc(13, v27, 0);
    return 0;
}
