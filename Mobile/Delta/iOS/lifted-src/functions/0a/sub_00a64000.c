/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64000..0xa64290 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a64000_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
} st_a64000_0;

extern char g_10002b0;

unsigned long long sub_a64000(st_a64000_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, long long a4)
{
    unsigned long long v22;  // x23
    unsigned long long v23;  // x21
    unsigned long long v24;  // x0
    unsigned int v25;  // w0
    uint128_t v26;  // q2
    unsigned int v27;  // w0
    uint128_t v28;  // q2
    unsigned int v29;  // w0
    char v0;  // [bp-0x184], Other Possible Types: unsigned int
    uint128_t v1;  // [bp-0x180]
    uint128_t v2;  // [bp-0x170]
    uint128_t v3;  // [bp-0x160]
    uint128_t v4;  // [bp-0x150]
    uint128_t v5;  // [bp-0x140]
    uint128_t v6;  // [bp-0x130]
    uint128_t v7;  // [bp-0x120]
    uint128_t v8;  // [bp-0x110]
    uint128_t v9;  // [bp-0x100]
    uint128_t v10;  // [bp-0xf0]
    uint128_t v11;  // [bp-0xe0]
    uint128_t v12;  // [bp-0xd0]
    uint128_t v13;  // [bp-0xc0]
    uint128_t v14;  // [bp-0xb0]
    uint128_t v15;  // [bp-0xa0]
    uint128_t v16;  // [bp-0x90]
    uint128_t v17;  // [bp-0x80]
    uint128_t v18;  // [bp-0x70]
    unsigned long v19;  // [bp-0x58]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = a2;
    v19 = *(long long *)&g_10002b0;
    if (a3)
    {
        v23 = a3;
        if (a0->field_0 != a3 && !(v24 = 0, a1 && !(v22 >> 31 & 1)))
            goto LABEL_a6407c;
        a0->field_0 = v23;
LABEL_a6406c:
        if (!sub_a50b14(v23))
        {
            if (!a1)
            {
LABEL_a64254:
                v24 = sub_a40520(a0->field_8, a0->field_10) != 0;
                if (!a1)
                {
                    if (*(long long *)&g_10002b0 == v19)
                        return v24;
                    ___stack_chk_fail();
                }
LABEL_a64268:
                sub_a66ec0(&v1, 144);
                sub_a66ec0(&v10, 144);
                if (*(long long *)&g_10002b0 == v19)
                    return v24;
                ___stack_chk_fail();
            }
            v25 = sub_a50a7c(v23);
            if (144 >= v25)
            {
                if ((int)v22 > (int)v25)
                {
                    v24 = sub_a3fe04(a0->field_8, v23, a4);
                    if (!(unsigned int)v24)
                    {
                        if (*(long long *)&g_10002b0 == v19)
                            return v24;
                        ___stack_chk_fail();
                    }
                    v24 = sub_a3fe10(a0->field_8, a1, v22 & 0xffffffff);
                    if (!(unsigned int)v24 || !(v24 = sub_a3ff7c(a0->field_8, &v1, &v0), (unsigned int)v24))
                    {
LABEL_a6407c:
                        if (*(long long *)&g_10002b0 == v19)
                            return v24;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        v22 = v0;
                        goto LABEL_a6412c;
                    }
                    goto LABEL_a6412c;
                }
                else if (!(v22 >> 31 & 1))
                {
                    ___memcpy_chk(&v1, a1, v22 & 0xffffffff, 144);
                    v0 = v22;
LABEL_a6412c:
                    if ((unsigned int)v22 != 144)
                        _bzero((char *)&v1 + (v22 & 0xffffffff), 144 - v22);
                    v26 = CONCAT(0x3636363636363636, 0x3636363636363636);
                    v10 = v26 ^ v1;
                    v11 = v26 ^ v2;
                    v12 = v26 ^ v3;
                    v13 = v26 ^ v4;
                    v14 = v26 ^ v5;
                    v15 = v26 ^ v6;
                    v16 = v26 ^ v7;
                    v17 = v26 ^ v8;
                    v18 = v26 ^ v9;
                    v24 = sub_a3fe04(a0->field_10, v23, a4);
                    if ((unsigned int)v24)
                    {
                        v27 = sub_a50a7c(v23);
                        v24 = sub_a3fe10(a0->field_10, &v10, v27);
                        if ((unsigned int)v24)
                        {
                            v28 = CONCAT(0x5c5c5c5c5c5c5c5c, 0x5c5c5c5c5c5c5c5c);
                            v10 = v28 ^ v1;
                            v11 = v28 ^ v2;
                            v12 = v28 ^ v3;
                            v13 = v28 ^ v4;
                            v14 = v28 ^ v5;
                            v15 = v28 ^ v6;
                            v16 = v28 ^ v7;
                            v17 = v28 ^ v8;
                            v18 = v28 ^ v9;
                            v24 = sub_a3fe04(a0->field_18, v23, a4);
                            if ((unsigned int)v24)
                            {
                                v29 = sub_a50a7c(v23);
                                v24 = sub_a3fe10(a0->field_18, &v10, v29);
                                if ((unsigned int)v24)
                                    goto LABEL_a64254;
                                goto LABEL_a64268;
                            }
                        }
                    }
                }
            }
        }
    }
    else
    {
        v23 = a0->field_0;
        if (v23)
            goto LABEL_a6406c;
    }
    if (*(long long *)&g_10002b0 == v19)
        return 0;
    ___stack_chk_fail();
}
