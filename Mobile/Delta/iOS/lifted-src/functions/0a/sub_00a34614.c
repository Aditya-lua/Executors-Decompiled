/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34614..0xa34844 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a34a94;
extern long long g_a34a9c;
extern long long g_f0d560;

char * sub_a34614(char **a0, long long a1, char *a2, unsigned int *a3, char *a4, char *a5)
{
    char *v3;  // w21
    unsigned int *iter;  // x22
    char *v5;  // x0
    char *v6;  // x24
    char *v7;  // x26
    char *v8;  // x0
    char *v9;  // x0
    char *v10;  // x0
    long long v11;  // x2
    unsigned int v0;  // [bp-0x80]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a4;
    iter = a3;
    if (!sub_a7c198(g_f0d560))
        return 0;
    if (*a0)
    {
LABEL_a34668:
        v6 = 1;
        if (v3)
        {
            do
            {
                v0 = *iter;
                v7 = sub_a66b6c(*a0, &v0);
                if (!v7)
                {
                    v8 = sub_a6bf4c(32, "crypto/engine/eng_table.c", 106);
                    if (!v8)
                        goto LABEL_a34814;
                    v7 = v8;
                    *(unsigned int *)&v8[24] = 1;
                    *(unsigned int *)v8 = *iter;
                    v9 = sub_ad61b4();
                    *(char **)&v7[8] = v9;
                    if (v9)
                    {
                        *(unsigned long long *)&v7[16] = 0;
                        sub_a66794(*a0, v7);
                        if (sub_a66b6c(*a0, &v0) == v7)
                            goto LABEL_a34700;
                        sub_ad6020(*(long long *)&v7[8]);
                        v10 = v7;
                        v11 = 120;
                    }
                    else
                    {
                        v10 = v7;
                        v11 = 113;
                    }
                    sub_a6c2e4(v10, "crypto/engine/eng_table.c", v11);
                    goto LABEL_a34814;
                }
                else
                {
LABEL_a34700:
                    sub_ad65b4(*(long long *)&v7[8], a2);
                    if (!sub_ad68a0(*(long long *)&v7[8], a2))
                        goto LABEL_a34814;
                    *(unsigned int *)&v7[24] = 0;
                    if (!a5)
                        continue;
                    if (sub_a32c08(a2))
                    {
                        if (*(long long *)&v7[16])
                            sub_a32c78(*(long long *)&v7[16], 0);
                        *(char **)&v7[16] = a2;
                        *(unsigned int *)&v7[24] = 1;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/engine/eng_table.c", 135, "engine_table_register");
                        sub_a36abc(38, 109, 0);
                        goto LABEL_a34814;
                    }
                }
            } while ((iter += 1, v3 -= 1, v3));
            v6 = 1;
        }
    }
    else
    {
        v5 = sub_a66520(sub_a66530(&g_a34a94, &g_a34a9c), " ", "@", " ", "@");
        if (v5)
        {
            *a0 = v5;
            if (sub_a330f0(a1))
                goto LABEL_a34668;
            sub_a66664(*a0);
            v6 = 0;
            *a0 = 0;
        }
        else
        {
LABEL_a34814:
            v6 = 0;
        }
    }
    sub_a7c1b4(g_f0d560);
    return v6;
}
