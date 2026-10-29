/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f6d90..0x9f7078 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f6d90_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[36];
    unsigned long long field_38;
    char padding_40[16];
    unsigned long long field_50;
} st_9f6d90_0;

typedef struct st_9f6d90_1 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[32];
    unsigned long long field_38;
    char padding_40[16];
    unsigned long long field_50;
} st_9f6d90_1;


unsigned long long sub_9f6d90(long long a0, unsigned long long a1)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x24
    unsigned long long v13;  // x21
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4112
    unsigned long long v17;  // x1
    st_9f6d90_1 *v18;  // x23
    unsigned long long v19;  // 4127
    unsigned long long v20;  // 4116
    unsigned long long v21;  // x9
    unsigned long long v5;  // x22
    unsigned long long v6;  // x21
    unsigned long long v7;  // x1
    st_9f6d90_0 *v8;  // x23
    unsigned int v9;  // w8
    unsigned long long v10;  // 4127
    unsigned long long v11;  // 4118
    unsigned long long v12;  // x22
    unsigned long iter;  // [bp-0x48], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    iter = 0;
    if (a1)
    {
        v3 = *(long long *)a1;
        v4 = v3 != 0;
        if (!v3)
        {
            if ((int)sub_ad69e4(a0) >= 1)
            {
                v5 = 0;
                v6 = 2;
                do
                {
                    v7 = v5;
                    v8 = sub_ad69f8(a0, v7);
                    if (!sub_9f7850(v8, v7))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ct/ct_oct.c", 0xcc, "i2o_SCT");
                        sub_a36abc(50, 106, 0);
                        sub_a6c2e4(0, "crypto/ct/ct_oct.c", 249);
                        goto LABEL_9f700c;
                    }
                    else if (!*(int *)&v8->padding_0[0])
                    {
                        v9 = (unsigned int)v8->field_38 + (unsigned int)v8->field_50 + 47;
                        v10 = arm64g_calculate_condition(1, v9, 1, 0);
                        if (!(v10 & 1))
                            continue;
                    }
                    else
                    {
                        v9 = v8->field_10;
                        v11 = arm64g_calculate_condition(0x11, v8->field_10, 1, 0);
                        if (v11 & 1)
                            goto LABEL_9f6ed0;
                        else
                            goto LABEL_9f700c;
                    }
LABEL_9f6ed0:
                } while ((v6 += v9 + 2, v5 = (unsigned int)v5 + 1, (int)sub_ad69e4(a0) > (int)v5));
                if (v6 > 0xffff)
                {
LABEL_9f700c:
                    sub_a368c8();
                    sub_a369bc("crypto/ct/ct_oct.c", 326, "i2o_SCT_LIST");
                    sub_a36abc(50, 105, 0);
                    goto LABEL_9f7058;
                }
            }
            else
            {
                v6 = 2;
            }
            v3 = sub_a6bf4c(v6, "crypto/ct/ct_oct.c", 329);
            *(unsigned long long *)a1 = v3;
            if (!v3)
                goto LABEL_9f7058;
        }
        iter = v3 + 2;
    }
    else
    {
        v4 = 1;
    }
    if ((int)sub_ad69e4(a0) >= 1)
    {
        v12 = 0;
        v13 = 2;
        do
        {
            if (a1)
            {
                iter += 2;
                v14 = sub_9f6a1c(sub_ad69f8(a0, v12), &iter);
                v15 = arm64g_calculate_condition(1, v14 & 0xffffffff, 1, 0);
                if (v15 & 1)
                    goto LABEL_9f6fa0;
                *(unsigned short *)iter = (((((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v14 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v14 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                continue;
            }
            else
            {
                v17 = v12;
                v18 = sub_ad69f8(a0, v17);
                if (!sub_9f7850(v18, v17))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ct/ct_oct.c", 0xcc, "i2o_SCT");
                    sub_a36abc(50, 106, 0);
                    sub_a6c2e4(0, "crypto/ct/ct_oct.c", 249);
                }
                else if (!*(int *)&v18->padding_0[0])
                {
                    v14 = v18->field_38 + v18->field_50 + 47;
                    v19 = arm64g_calculate_condition(1, v14 & 0xffffffff, 1, 0);
                    if (!(v19 & 1))
                        continue;
                }
                else
                {
                    v14 = v18->field_10;
                    v20 = arm64g_calculate_condition(0x11, v14 & 0xffffffff, 1, 0);
                    if (v20 & 1)
                        goto LABEL_9f6e0c;
                    else
                        goto LABEL_9f6fa0;
                }
            }
LABEL_9f6e0c:
        } while ((v13 += (unsigned int)v14 + 2, v12 = (unsigned int)v12 + 1, (int)sub_ad69e4(a0) > (int)v12));
        if (v13 <= 0xffff)
            goto LABEL_9f6f24;
LABEL_9f6fa0:
        if (!(v4 & 1))
        {
            sub_a6c2e4(*(long long *)a1, "crypto/ct/ct_oct.c", 364);
            *(unsigned long long *)a1 = 0;
        }
LABEL_9f7058:
        v13 = 0xffffffff;
    }
    else
    {
        v13 = 2;
LABEL_9f6f24:
        if (a1)
        {
            iter = *(long long *)a1;
            v21 = v13 - 2;
            *(char *)*(long long *)a1 = v21 >> 8;
            *(char *)(iter + 1) = v21;
            if ((unsigned int)v4)
                *(unsigned long long *)a1 = *(long long *)a1 + v13;
        }
    }
    return v13;
}
