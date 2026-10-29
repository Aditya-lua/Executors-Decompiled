/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2990c..0xb29b5c (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char * sub_b2990c(char *a0, char *a1)
{
    char *v15;  // x0
    char *v16;  // w8
    unsigned long long v17;  // 4124
    char *v18;  // x8
    char *v19;  // w9
    char *v20;  // x0
    unsigned long v0;  // [bp-0xe0]
    char *v1;  // [bp-0xd8], Other Possible Types: char **
    char *v2;  // [bp-0xd0]
    char *v3;  // [bp-0xc0]
    char *v4;  // [bp-0xb0]
    char *v5;  // [bp-0xa0]
    char *v6;  // [bp-0x90]
    char *v7;  // [bp-0x80]
    char *v8;  // [bp-0x70]
    char *v9;  // [bp-0x60]
    char *v10;  // [bp-0x50]
    char *v11;  // [bp-0x40]
    unsigned long v12;  // [bp-0x28]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v10 = (char *)0;
    v11 = (char *)0;
    v8 = (char *)0;
    v9 = (char *)0;
    v7 = (char *)0;
    v1 = 0;
    v15 = a0;
    if (v15)
    {
        if (a1 && *(long long *)a1)
        {
            if (sub_a6fbc4(a1, "ecdh-cofactor-mode"))
            {
                if (sub_a6fc2c() && !(v16 = (char *)(unsigned int)v2, v17 = arm64g_calculate_condition(49, (unsigned long long)(v16 - 2), 3, 0), v17 & 1))
                {
                    *(unsigned int *)&a0[24] = (unsigned int)v16;
                    goto LABEL_b2998c;
                }
                goto LABEL_b29ab0;
            }
LABEL_b2998c:
            if (sub_a6fbc4(a1, "kdf-type"))
            {
                v1 = &v7;
                v15 = sub_a71220();
                if ((unsigned int)v15)
                {
                    if (!(char)v7)
                    {
                        v19 = (char *)0;
                        v18 = a0;
                        goto LABEL_b299f0;
                    }
                    if ((unsigned long long)v7 == 19778338142173528)
                    {
                        v18 = a0;
                        v19 = (char *)1;
LABEL_b299f0:
                        *(unsigned int *)&v18[28] = (unsigned int)v19;
                        goto LABEL_b299f4;
                    }
LABEL_b29ab0:
                    v15 = 0;
                }
            }
            else
            {
LABEL_b299f4:
                if (sub_a6fbc4(a1, "kdf-digest"))
                {
                    v5 = (char *)0;
                    v6 = (char *)0;
                    v3 = (char *)0;
                    v4 = (char *)0;
                    v2 = (char *)0;
                    v1 = &v7;
                    if (sub_a71220() && !(v1 = &v2, sub_a6fbc4(a1, "kdf-digest-props") && !sub_a71220()))
                    {
                        sub_a3f52c(*(long long *)&a0[32]);
                        v20 = sub_a40ca8(*(long long *)a0, &v7, &v2);
                        *(char **)&a0[32] = v20;
                        if (v20)
                        {
                            if (!sub_a50b14())
                                goto LABEL_b29ab8;
                            sub_a368c8();
                            sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 312, "ecdh_set_ctx_params");
                            sub_a36abc(57, 183, 0);
                        }
                    }
                }
                else
                {
LABEL_b29ab8:
                    if (sub_a6fbc4(a1, "kdf-outlen"))
                    {
                        v15 = sub_a70ef8();
                        if ((unsigned int)v15)
                        {
                            *(unsigned long long *)&a0[56] = v2;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v12)
                                return (unsigned int)v15;
                            ___stack_chk_fail();
                        }
                    }
                    if (sub_a6fbc4(a1, "kdf-ukm"))
                    {
                        v2 = 0;
                        v15 = sub_a71440();
                        if ((unsigned int)v15)
                        {
                            sub_a6c2e4(*(long long *)&a0[40], "providers/implementations/exchange/ecdh_exch.c", 342);
                            *(char **)&a0[40] = v2;
                            *(unsigned long *)&a0[48] = v0;
                            goto LABEL_b29b2c;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v12)
                                return (unsigned int)v15;
                            ___stack_chk_fail();
                        }
                    }
                }
                goto LABEL_b29ab0;
            }
        }
        else
        {
LABEL_b29b2c:
            v15 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v12)
        return (unsigned int)v15;
    ___stack_chk_fail();
}
