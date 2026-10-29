/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaebe8c..0xaec0c4 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aebe8c_0 {
    char padding_0[8];
    long long field_8;
} st_aebe8c_0;

extern long long g_ae75b0;

unsigned long long sub_aebe8c(long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x19
    long long v12;  // x20
    long long v13;  // x21
    unsigned long long v4;  // x24
    st_aebe8c_0 *v5;  // x27
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x27
    unsigned long long v9;  // x28
    unsigned long long v10;  // x26
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a2);
    v3 = sub_ad61e0(0, v2);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 310, "v2i_issuer_alt");
        sub_a36abc(0x22, 0x8000f, 0);
        return v3;
    }
    else if ((int)v2 >= 1)
    {
        v4 = 0;
        while (1)
        {
            v5 = sub_ad69f8(a2, v4);
            if (sub_aefce4(v5->field_8, "issuer") || !v5[1].padding_0 || _strcmp(v5[1].padding_0, "copy"))
            {
                v6 = sub_aec7c8(0, a0, a1, v5, 0);
                if (!v6)
                    break;
                sub_ad68a0(v3, v6);
            }
            else
            {
                if (!a1)
                {
LABEL_aec030:
                    v8 = 0;
                    v12 = 127;
                    v13 = 346;
                    goto LABEL_aec05c;
                }
                if (!(*(char *)a1 & 1))
                {
                    if (!*(long long *)(a1 + 8))
                        goto LABEL_aec030;
                    v7 = sub_af26f0(*(long long *)(a1 + 8), 0x55, 0xffffffff);
                    if (!(v7 >> 31 & 1))
                    {
                        if (sub_af26f8(*(long long *)(a1 + 8), v7))
                        {
                            v8 = sub_ae8248();
                            if (!v8)
                                goto LABEL_aec044;
                            v9 = sub_ad69e4(v8);
                            if (sub_ad6458(v3, v9))
                            {
                                if ((int)v9 >= 1)
                                {
                                    v10 = 0;
                                    do
                                    {
                                        sub_ad68a0(v3, sub_ad69f8(v8, v10));
                                        v10 = (unsigned int)v10 + 1;
                                    } while ((unsigned int)v9 != (unsigned int)v10);
                                }
                                sub_ad6020(v8);
                            }
                            else
                            {
                                v12 = 524303;
                                v13 = 360;
LABEL_aec05c:
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_san.c", v13, "copy_issuer");
                                sub_a36abc(0x22, v12, 0);
                                sub_ad6020(v8);
                                break;
                            }
                        }
                        else
                        {
                            v8 = 0;
LABEL_aec044:
                            v12 = 126;
                            v13 = 354;
                            goto LABEL_aec05c;
                        }
                    }
                }
            }
            v4 = (unsigned int)v4 + 1;
            if ((unsigned int)v4 == (unsigned int)v2)
                return v3;
        }
        sub_ad6958(v3, &g_ae75b0);
        return 0;
    }
    else
    {
        return v3;
    }
}
