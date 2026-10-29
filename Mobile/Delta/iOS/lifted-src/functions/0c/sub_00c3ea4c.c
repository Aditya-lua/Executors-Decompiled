/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3ea4c..0xc3eda0 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e0eb40;
extern unsigned long long g_e0ed18[3];
extern long long g_efca50;

unsigned long long sub_c3ea4c(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long v14;  // x8
    unsigned long v15;  // x10
    unsigned long long v24;  // 4107
    unsigned long long v25;  // x20
    unsigned long long v26;  // x0
    unsigned long long *v27;  // x1
    unsigned long long v28;  // x22
    unsigned long long v30;  // x8
    unsigned long long v31;  // x25
    unsigned long v33;  // x8
    unsigned long v16;  // x9
    unsigned long long v17;  // x20
    unsigned long v18;  // x11
    unsigned long long v19;  // x21
    unsigned long long v20;  // x22
    unsigned long long v21;  // w21
    unsigned long v22;  // cc_dep1
    unsigned long long v23;  // 4107
    uint128_t v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xd8]
    uint128_t v2;  // [bp-0xc8]
    uint128_t v3;  // [bp-0xb8], Other Possible Types: uint128_t
    unsigned long long v4;  // [bp-0xa8]
    uint128_t v5;  // [bp-0xa0], Other Possible Types: char
    unsigned long long v6;  // [bp-0x98]
    uint128_t v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x88]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x60]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = *a0;
    if (v14)
    {
        v15 = a0[1];
        v16 = a0[2];
        if (v15 > v16 && *(char *)(v14 + v16) == 0x55)
        {
            v16 += 1;
            a0[2] = v16;
            v17 = 1;
        }
        else
        {
            v17 = 0;
        }
        if (v15 > v16 && *(char *)(v14 + v16) == 75)
        {
            v18 = v16 + 1;
            a0[2] = v18;
            if (v15 > v18 && *(char *)(v14 + v18) == 67)
            {
                a0[2] = v16 + 2;
                v19 = "C";
                v20 = 1;
LABEL_c3eb38:
                if (!(v17 & 1))
                    goto LABEL_c3eb3c;
                goto LABEL_c3eaf0;
            }
            else
            {
                a1 = a0;
                sub_c3b8ac(&v5, a1);
                v19 = v5;
                if (!v19)
                {
                    v21 = (char)v6;
                    if (!a0[4])
                    {
                        *a0 = 0;
                        *(char *)&a0[1] = v21;
                        return 0;
                    }
                    v22 = v21 & 0xff;
                    if (v21)
                    {
                        v23 = arm64g_calculate_condition(19, v22, 0, 0);
                        if (!(v23 & 1))
                            goto LABEL_c3ed4e;
LABEL_c3ed4d:
                    }
                    else
                    {
                        v24 = arm64g_calculate_condition(19, v22, 0, 0);
                        if (v24 & 1)
                            goto LABEL_c3ed4d;
LABEL_c3ed4e:
                    }
                    if (!(sub_be7850() & 1))
                    {
                        *a0 = 0;
                        *(char *)&a0[1] = v21;
                        return 0;
                    }
                    return 1;
                }
                v20 = v6;
                if (v20 && !v8)
                    goto LABEL_c3eb38;
                if (!a0[4] || !(sub_be7850(a0[4], &g_e0eb40, 16) & 1))
                {
                    *a0 = 0;
                    *(char *)&a0[1] = 0;
                    return 0;
                }
            }
        }
        else
        {
            if (!(v17 & 1))
                goto LABEL_c3ec48;
            v19 = 0;
LABEL_c3eaf0:
            if (!a0[4] || !(a1 = "unsafe ", sub_be7850(a0[4], "unsafe ", 7) & 1))
            {
                if (!v19)
                    goto LABEL_c3ec48;
LABEL_c3eb3c:
                v25 = a0[4];
                if (!v25 || (a1 = &g_e0ed18[0], !(sub_be7850(v25, &g_e0ed18[0], 8) & 1)))
                {
                    v0 = CONCAT(v20, 0);
                    v1 = CONCAT(v20, v19);
                    v2 = CONCAT(v20, 0);
                    *(unsigned long long *)&v3 = 408021893215;
                    *((char *)&v3 + 8) = 1;
                    *(unsigned short *)&v4 = 1;
                    v26 = sub_c3eda0(&v0);
                    if (!v26)
                        sub_c73c64(&g_efca50);
                    v27 = a1;
                    if (!v25 || (v27 = v26, !(sub_be7850(v25, v27, a1) & 1)))
                    {
                        v9 = v2;
                        v10 = v3;
                        v11 = v4;
                        v5 = v0;
                        v7 = v1;
                        v28 = v25;
                        while (1)
                        {
                            v30 = v28;
                            while (1)
                            {
                                v31 = v30;
                                if (sub_c3eda0(&v5))
                                {
                                    v30 = 0;
                                    if (v31)
                                        break;
                                }
                                else
                                {
                                    if (v28 && sub_be7850(v28, "\" ", 2) & 1)
                                        goto LABEL_c3ec70;
                                    else
                                        goto LABEL_c3ec48;
                                }
                            }
                            v27 = "-";
                        }
                    }
                }
            }
        }
    }
    else
    {
LABEL_c3ec48:
        if ((!a0[4] || !(sub_be7850(a0[4], "fn(", 3) & 1)) && !(sub_c3e294(a0) & 1))
        {
            if (a0[4] && sub_be7850(a0[4], ") + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
                return 1;
            if (*a0)
            {
                v33 = a0[2];
                if (a0[1] > v33 && *(char *)(*a0 + v33) == 117)
                {
                    a0[2] = v33 + 1;
                    return 0;
                }
            }
        }
    }
LABEL_c3ec70:
    return 1;
}
