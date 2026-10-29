/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98db68..0x98de80 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98db68_3 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[24];
    unsigned int field_30;
    char field_34;
    char padding_35[11];
    char field_40;
    char padding_41[55];
    char field_78;
    char padding_79[15];
    struct st_98db68_2 *field_88;
    char padding_90[132];
    char field_114;
    char field_115;
} st_98db68_3;

typedef struct st_98db68_0 {
    char padding_0[184];
    long long field_b8;
    char padding_c0[296];
    unsigned short field_1e8;
    char padding_1ea[6];
    char field_1f0;
    char padding_1f1[47];
    unsigned long long field_220;
    char padding_228[152];
    struct st_98db68_1 *field_2c0;
} st_98db68_0;

typedef struct st_98db68_1 {
    unsigned long long field_0;
} st_98db68_1;

typedef struct st_98db68_2 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[89];
    char field_79;
} st_98db68_2;


unsigned long long sub_98db68(st_98db68_0 *a0, st_98db68_3 *a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long v11;  // x19
    unsigned long long v12;  // x23
    unsigned long long idx;  // x21
    st_98db68_0 *v22;  // x24
    st_98db68_3 *v23;  // x19
    unsigned long long v24;  // x0
    unsigned long long v25;  // x8
    st_98db68_2 *v13;  // x22
    st_98db68_0 *v14;  // x0
    unsigned long long v15;  // x9
    unsigned long v16;  // x8
    st_98db68_0 *v17;  // x24
    st_98db68_3 *v18;  // x20
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    char v0;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0xb8]
    uint128_t v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa0]
    unsigned long long v4;  // [bp-0x98]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    uint128_t v7;  // [bp-0x70]
    char v8;  // [bp-0x60], Other Possible Types: unsigned long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a1->field_30;
    if (1 < (int)v11)
    {
        if ((unsigned int)v11 == 3 || (unsigned int)v11 != 2)
            goto LABEL_98db94;
        v12 = 0;
        v11 = 1;
    }
    else if ((unsigned int)v11)
    {
LABEL_98db94:
        v11 = 2;
        v12 = 1;
    }
    else
    {
        v12 = 0;
    }
    v13 = a1->field_88;
    v13->field_18 = 0xffffffffffffffff;
    v14 = a0;
    if (a1->field_114 & 1)
    {
        if (!(a1->field_34 & 1))
            v15 = *(long long *)&a1->padding_18[8];
        else
            v15 = 0;
        v14 = a0;
        if (a1->field_8 - (v15 + a1->field_10) >= 5)
        {
            v16 = a0->field_1e8;
            v14 = a0;
            if (((v16 * 0x1000000000000000 | v16 >> 4) & 7) >> ((char)v11 & 63) & 1 || (a2 = a2, a3 = a3, a1 = a1, v14 = a0, sub_975900(a0->field_b8, v11)))
            {
                v17 = v14;
                v18 = a1;
                v19 = a3;
                v20 = a2;
                a2 = v20;
                a3 = v19;
                a1 = v18;
                idx = sub_975c9c(v14->field_b8, v11);
                v14 = v17;
                if (idx)
                {
                    if (sub_c63818(a1))
                    {
                        v8 = *(long long *)(idx + 48);
                        v6 = *(int128_t *)(idx + 16);
                        v7 = *(int128_t *)(idx + 32);
                        v5 = *(int128_t *)idx;
                        v8 = (char)*(long long *)(idx + 48) & 254;
                        if (!sub_98e3e8())
                        {
                            a1 = v18;
                            a3 = v19;
                            v14 = v17;
                            a2 = v20;
                            if (v18->field_78 & 1)
                            {
                                sub_a6ed4c(&a1->field_40);
                                a2 = v20;
                                v14 = v17;
                                a3 = v19;
                                a1 = v18;
                                v18->field_78 = v18->field_78 & 254;
                                *(unsigned long long *)&v18->padding_35[3] = 0;
                            }
                        }
                        else if (sub_98d9b4(v18))
                        {
                            v13->field_79 = v13->field_79 | 16;
                            a3 = v19;
                            a2 = v20;
                            if (*(long long *)(idx + 8))
                                v13->field_18 = *(long long *)(*(long long *)idx + 8);
                            v14 = v17;
                            a1 = v18;
                            if (v17->field_2c0)
                                v17->field_2c0();
                        }
                        else
                        {
                            return 0;
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }
    }
    if (!(a1->field_115 >> 2 & 1))
    {
        return 1;
    }
    else if (!(unsigned int)a2)
    {
        return 1;
    }
    else if (!(v14->field_1e8 >> 10 & 1))
    {
        return 1;
    }
    else
    {
        v22 = v14;
        v23 = a1;
        v24 = sub_c63818(a1);
        if (!v24)
            return 0;
        if (!(v12 & 1) && v22->field_1f0 & 1)
        {
            v1 = 0;
            v2 = 12;
            v3 = 0;
            v4 = 0;
        }
        if (sub_98ea3c() && sub_c68eb8(v24, &v0))
        {
            if (*(long long *)&v22->padding_1f1[39])
            {
                v25 = v22->field_220 + v0;
                if (v25 > (unsigned long long)(*(long long *)&v22->padding_1f1[39] * 3))
                    goto LABEL_98dd44;
                v22->field_220 = v25;
            }
            if (!sub_98d9b4(v23))
                return 0;
            v13->field_79 = v13->field_79 | 32;
            *(unsigned int *)a3 = 0;
            return 1;
        }
        else
        {
LABEL_98dd44:
            if (v23->field_78 & 1)
            {
                sub_a6ed4c(&v23->field_40);
                v23->field_78 = v23->field_78 & 254;
                *(unsigned long long *)&v23->padding_35[3] = 0;
                return 1;
            }
            return 1;
        }
    }
}
