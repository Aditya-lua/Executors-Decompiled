/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x978d84..0x9790e4 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_978d84_0 {
    long long field_0;
    char padding_8[64];
    long long field_48;
    char padding_50[136];
    long long field_d8;
    char padding_e0[824];
    long long field_418;
    char padding_420[88];
    char field_478[21];
    char field_485;
    char padding_486[314];
    uint128_t field_5c0;
    unsigned long long field_5d0;
    unsigned long long field_5d8;
    char field_5e0;
    char padding_5e1[7];
    unsigned long long field_5e8;
    char padding_5f0[48];
    unsigned long long field_620;
    char padding_628[24];
    unsigned long long field_640;
} st_978d84_0;

typedef struct st_978d84_1 {
    uint128_t field_0;
    char padding_10[16];
    char field_20;
} st_978d84_1;

typedef struct st_978d84_2 {
    char field_0[21];
    char field_d;
    char padding_e[314];
    uint128_t field_148;
    unsigned long long field_158;
    unsigned long long field_160;
    char field_168;
    char padding_169[7];
    unsigned long long field_170;
    char padding_178[48];
    unsigned long long field_1a8;
    char padding_1b0[24];
    unsigned long long field_1c8;
} st_978d84_2;

extern unsigned long long g_978464;
extern char g_1000000;
extern char g_10002b0;

st_978d84_0 * sub_978d84(st_978d84_0 *a0, st_978d84_1 *a1, unsigned long long a2)
{
    unsigned long long v14;  // w8
    char v15;  // x9
    st_978d84_0 *v24;  // x19
    st_978d84_1 *v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x8
    unsigned long long v28;  // x8
    unsigned long long v29;  // 4110
    char v30;  // x9
    unsigned long long v31;  // x9
    unsigned long long v32;  // 4112
    unsigned long long v33;  // x19
    unsigned long long v16;  // x9
    unsigned long long v34;  // x8
    unsigned long long v17;  // 4112
    unsigned long long v18;  // x19
    unsigned long long v19;  // x8
    st_978d84_0 *v20;  // x0
    unsigned long v21;  // x8
    unsigned long v22;  // x8
    st_978d84_2 *v23;  // x9
    uint128_t v0;  // [bp-0xa0], Other Possible Types: char, unsigned long long
    uint128_t v1;  // [bp-0x98]
    unsigned long v2;  // [bp-0x93]
    unsigned long long v3;  // [bp-0x90]
    unsigned long v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x78]
    unsigned int v7;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v8;  // [bp-0x68]
    st_978d84_0 *v9;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v10;  // [bp-0x50]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    if (!(*(long long *)&a0->padding_5f0[32] & 32))
        a2 = 1;
    v14 = (int)*(long long *)&a0->padding_5f0[32] & 7;
    if (2 >= v14)
    {
        if (v14 != 1)
        {
            if (v14 != 2)
                goto LABEL_978e10;
            if (a2)
                goto LABEL_978f58;
            if (a1->field_20 >> 1 & 1)
            {
                if (*(long long *)&g_10002b0 == v11)
                    return sub_978b1c();
                ___stack_chk_fail();
            }
        }
        else
        {
            *(uint128_t *)&a0->padding_486[306] = a1->field_0;
            v15 = (char)a0->field_5d0 & 0xfffffffe | a1->field_20 & 1;
            *(char *)&a0->field_5d0 = v15;
            *(char *)&a0->field_5d0 = v15 & 253 | a1->field_20 & 2;
            a0->field_5c0 = 0;
            if (*(long long *)&a1->padding_10[0])
            {
                v16 = *(long long *)&a1->padding_10[8];
                if (v16)
                {
                    v17 = arm64g_calculate_condition(18, v16, 1, 0);
                    if (v17 & 1)
                        v18 = v16;
                    else
                        v18 = 0xfffffffffffffffe;
                    v19 = sub_a6dac4();
                    v20 = a0;
                    *(unsigned long long *)&a0->field_5c0 = v19;
                    a0 = v20;
                    if (v19)
                    {
                        *(char *)(v19 + v18) = 0;
                        *(unsigned long long *)((char *)&v20->field_5c0 + 8) = v18;
                        a0 = v20;
                    }
                }
            }
            v10 = 0;
            v7 = 0;
            v9 = 0;
            v3 = 0;
            v5 = 0;
            v21 = a0->field_48;
            if (!v21)
            {
                v22 = *(long long *)&a0->padding_5f0[32];
                if (!(v22 >> 41 & 1) || v22 >> 25 & 1 && !a0->field_478[0])
                {
                    v21 = 0;
                }
                else
                {
                    v23 = a0->field_478;
                    v0 = *(int128_t *)&v23->field_0[0];
                    v2 = *(long long *)&v23->field_0[13];
                    v5 = 0;
                    v6 = 0;
                    v4 = *(long long *)&a0->padding_628[8];
                    v7 = __ROL__((unsigned int)v22, 7) & 0xffffff81 & 1;
                    v8 = &g_978464;
                    v9 = a0;
                    v21 = sub_972f44(&v0);
                    a0->field_48 = v21;
                    if (!v21)
                        *(unsigned long long *)&a0->padding_5f0[32] = *(long long *)&a0->padding_5f0[32] & 0xfffffdffffffffff;
                }
            }
            v24 = a0;
            v25 = a1;
            sub_973d5c(v21);
            if (a2)
            {
                a0 = sub_978b1c(v24, 4);
            }
            else
            {
                sub_978b1c();
                v26 = sub_981238(v24->field_0);
                a0 = sub_975f2c(v24->field_418);
                if (a0 * 3 <= 0xffffffffffffffff)
                    v27 = a0 * 3;
                else
                    v27 = 0xffffffffffffffff;
                v28 = v26 + v27;
                v29 = arm64g_calculate_condition(50, v26, v27, 0);
                if (!(v29 & 1))
                    v28 = 0xffffffffffffffff;
                v24->field_5d8 = v28;
                if (!(v25->field_20 >> 1 & 1))
                {
                    v0 = 0;
                    v1 = *(int128_t *)&v24->padding_486[306];
                    v0 = (char)v24->field_5d0 & 1;
                    v4 = v24->field_5c0;
                    v5 = *(long long *)((char *)&v24->field_5c0 + 8);
                    a0 = sub_98d808(v24->field_d8, &v0);
                    *(unsigned long *)&v24->padding_5f0[32] = *(long long *)&v24->padding_5f0[32] | &g_1000000;
                }
            }
        }
    }
    else
    {
        if (v14 != 3)
        {
            if (v14 != 4)
            {
LABEL_978e10:
                *(uint128_t *)&a0->padding_486[306] = a1->field_0;
                v30 = (char)a0->field_5d0 & 0xfffffffe | a1->field_20 & 1;
                *(char *)&a0->field_5d0 = v30;
                *(char *)&a0->field_5d0 = v30 & 253 | a1->field_20 & 2;
                a0->field_5c0 = 0;
                if (*(long long *)&a1->padding_10[0])
                {
                    v31 = *(long long *)&a1->padding_10[8];
                    if (v31)
                    {
                        v32 = arm64g_calculate_condition(18, v31, 1, 0);
                        if (v32 & 1)
                            v33 = v31;
                        else
                            v33 = 0xfffffffffffffffe;
                        v34 = sub_a6dac4();
                        *(unsigned long long *)&a0->field_5c0 = v34;
                        if (v34)
                        {
                            *(char *)(v34 + v33) = 0;
                            *(unsigned long long *)((char *)&a0->field_5c0 + 8) = v33;
                        }
                    }
                }
LABEL_978f58:
                if (*(long long *)&g_10002b0 == v11)
                    return sub_978b1c();
                ___stack_chk_fail();
            }
        }
        else
        {
            if (a2)
                goto LABEL_978f58;
        }
    }
    if (*(long long *)&g_10002b0 == v11)
        return a0;
    ___stack_chk_fail();
}
