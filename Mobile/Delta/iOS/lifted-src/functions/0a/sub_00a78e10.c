/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78e10..0xa79078 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a78e10_0 {
    char *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned long long field_20;
    struct st_a78e10_1 *field_28;
} st_a78e10_0;

typedef struct st_a78e10_1 {
    struct st_a78e10_1 *field_0;
    char field_8;
    char padding_9[7];
    unsigned long long field_10[2];
    struct st_a78e10_1 *field_18;
    unsigned long long field_20;
    struct st_a78e10_1 *field_28;
    struct st_a78e10_1 *field_30;
    struct st_a78e10_1 *field_38;
    char padding_40[16];
    unsigned long long field_50;
    char padding_58[8];
    unsigned int field_60;
} st_a78e10_1;

extern long long g_a78698;
extern long long g_a79078;
extern st_a78e10_0 g_ea0508;

char * sub_a78e10(unsigned long a0, long long a1, char *a2, char *a3)
{
    char *v6;  // x0
    char *v7;  // x22
    char *v16;  // x21
    char *v17;  // x21
    char *v18;  // x20
    char *v19;  // x21
    char *v20;  // x0
    st_a78e10_0 *v8;  // x24
    st_a78e10_0 *v9;  // x24
    char *v10;  // w23
    char *v11;  // x25
    char *iter;  // x24
    char *v13;  // x25
    char *v14;  // x0
    char *v15;  // x21
    char *v0;  // [bp-0x80]
    char *v1;  // [bp-0x70], Other Possible Types: uint128_t
    char *v2;  // [bp-0x68]
    char *v3;  // [bp-0x60], Other Possible Types: unsigned long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_a6820c();
    if (v6)
    {
        v3 = 0;
        v0 = (char *)0;
        v1 = (char *)0;
        if (a2)
        {
            *(char **)&v1 = a2;
            if (a3)
                goto LABEL_a78f48;
            goto LABEL_a78fa8;
        }
        else
        {
            v7 = v6;
            if (g_ea0508.field_0)
            {
                v8 = &g_ea0508.field_0;
                do
                {
                    v9 = v8;
                    if (!_strcmp())
                    {
                        v10 = (char *)0;
                        v0 = (char *)*(int128_t *)&v9->field_0;
                        v1 = v9->field_10;
                        v3 = v9->field_20;
                        goto LABEL_a78ee8;
                    }
                } while ((v8 = &v9->field_28, v9->field_28));
            }
            v10 = (char *)1;
LABEL_a78ee8:
            if (sub_a7c17c(*(long long *)&v7[32]))
            {
                v11 = *(long long *)&v7[56];
                if (*(long long *)&v7[56])
                {
                    iter = *(long long *)&v7[48];
                    while (1)
                    {
                        v13 = v11;
                        if (!_strcmp(*(long long *)iter, a1))
                            break;
                        iter += 40;
                        v11 = v13 - 1;
                        if (v13 == 1)
                            goto LABEL_a78f3c;
                    }
                    if (v10)
                    {
                        v0 = (char *)*(int128_t *)iter;
                        v1 = *(int128_t *)&iter[16];
                        v3 = *(long long *)&iter[32];
                    }
                    if (a3 || !*(long long *)&iter[24])
                    {
                        v2 = 0;
                        goto LABEL_a78f3c;
                    }
                    else
                    {
                        v2 = sub_ad606c(*(long long *)&iter[24], &g_a79078, &g_a78698);
                        if (v2)
                            goto LABEL_a78f3c;
                        sub_a7c1b4(*(long long *)&v7[32]);
                    }
                }
                else
                {
LABEL_a78f3c:
                    sub_a7c1b4(*(long long *)&v7[32]);
                    if (!a3)
                        goto LABEL_a78fa8;
LABEL_a78f48:
                    if (*(unsigned long long *)((void*)&v1 + 8) || (v14 = sub_ad61b4(), *(char **)((char *)&v1 + 8) = v14, v14))
                    {
                        if (*(long long *)a3)
                        {
                            v15 = a3 + 40;
                            do
                            {
                                v16 = v15;
                                if (*(int *)(v16 - 32) == 4 && !sub_a7955c((char *)&v1 + 8))
                                {
                                    sub_ad6958(*(unsigned long long *)((void*)&v1 + 8), &g_a78698);
                                    return 0;
                                }
                            } while ((v15 = v16 + 40, *(long long *)v16));
                        }
LABEL_a78fa8:
                        v17 = *(unsigned long long *)((void*)&v1 + 8);
                        v18 = sub_a79128(a1, *(unsigned long long *)&v1, v17);
                        if (v17)
                            sub_ad6958(v17, &g_a78698);
                        if (!v18)
                            return v18;
                        v19 = *(unsigned long long *)((void*)&v0 + 8);
                        sub_a6c2e4(*(long long *)&v18[48], "crypto/provider_core.c", 794);
                        *(unsigned long long *)&v18[48] = 0;
                        if (!v19 || !(v20 = sub_a6d9b4(v19, "crypto/provider_core.c", 798), *(char **)&v18[48] = v20, !v20))
                        {
                            *(unsigned long *)&v18[80] = a0;
                            *(unsigned int *)&v18[96] = sub_a3642c();
                            return v18;
                        }
                        sub_a78ccc(v18);
                    }
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
    }
    return 0;
}
