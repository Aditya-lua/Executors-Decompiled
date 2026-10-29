/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3b0e8..0xc3b710 (1576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3b0e8_0 {
    char padding_0[8];
    struct st_c3b0e8_1 *field_8;
    unsigned int field_10;
} st_c3b0e8_0;

typedef struct st_c3b0e8_1 {
    char padding_0[24];
    struct st_c3b0e8_2 *field_18;
} st_c3b0e8_1;

typedef struct st_c3b0e8_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    struct st_c3b0e8_0 *field_20;
} st_c3b0e8_3;

typedef struct st_c3b0e8_2 {
    unsigned long long field_0;
} st_c3b0e8_2;

extern long long g_e0eb40;

unsigned int sub_c3b0e8(st_c3b0e8_3 *a0, long long a1)
{
    unsigned long long v9;  // x8
    unsigned int v10;  // w9
    unsigned long long v19;  // x20
    unsigned int v20;  // x21
    unsigned long long v21;  // 4111
    unsigned int v22;  // w21
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4107
    unsigned long long v25;  // 4107
    st_c3b0e8_0 *v26;  // x8
    unsigned long long v27;  // 4111
    unsigned long v11;  // x10
    unsigned long v12;  // x9
    unsigned int v13;  // w21
    unsigned long v14;  // x11
    unsigned long v15;  // x8
    unsigned int v16;  // x10
    unsigned long long v17;  // 4140
    unsigned int v18;  // x22
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    uint128_t v6;  // [bp-0x40]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0->field_0;
    if (!v9)
    {
LABEL_c3b5a0:
        if (!a0->field_20)
            return 0;
        return sub_be7850();
    }
    v10 = a0->field_18 + 1;
    a0->field_18 = v10;
    if (v10 < 501)
    {
        v11 = a0->field_8;
        v12 = a0->field_10;
        if (v11 > v12)
        {
            v13 = *(char *)(v9 + v12);
            v14 = v12 + 1;
            a0->field_10 = v14;
            if ((int)v13 > 76)
            {
                if (87 >= (int)v13)
                {
                    if (v13 == 77)
                        goto LABEL_c3b32c;
                    if (v13 != 78)
                        goto LABEL_c3b2f8;
                    if (v11 > v14)
                    {
                        v15 = *(char *)(v9 + v14);
                        a0->field_10 = v12 + 2;
                        v16 = 0x11000000000000;
                        v17 = arm64g_calculate_condition(33, (unsigned int)v15 - 123, 26, 0);
                        if (!(v17 & 1))
                            v16 = 1;
                        if ((unsigned int)v15 - 65 < 26)
                            v18 = v15 * 0x100000000;
                        else
                            v18 = v16;
                        if (v18 == 1)
                            goto LABEL_c3b484;
                        if (!(sub_c3b0e8(a0, a1) & 1))
                        {
                            if (a0->field_0)
                            {
LABEL_c3b1dc:
                                sub_c3b814(&v2, a0, 115);
                                if (*(char *)&v2 == 1)
                                    goto LABEL_c3b348;
                                if (!a0->field_0)
                                    goto LABEL_c3b5a0;
                                sub_c3b8ac(&v2, a0);
                                if (!*(unsigned long long *)&v2)
                                    goto LABEL_c3b574;
                                v19 = v18 >> 32;
                                v5 = v2;
                                v6 = v4;
                                if (v19 == 0x110000)
                                {
                                    if (!*(unsigned long long *)((void*)&v5 + 8) && !*(unsigned long long *)((void*)&v6 + 8) || !a0->field_20 || !(sub_be7850(a0->field_20, "::", 2) & 1) && (!a0->field_20 || !(sub_c3bac4(&v5) & 1)))
                                        goto LABEL_c3b6d8;
                                }
                                else
                                {
                                    if (!a0->field_20 || !(sub_be7850(a0->field_20, "::{closure:#", 3) & 1))
                                    {
                                        if ((unsigned int)v19 != 67)
                                        {
                                            if ((unsigned int)v19 == 83)
                                                goto LABEL_c3b644;
                                            v3 = v19;
                                            if (!a0->field_20 || !(sub_bee42c(&v3) & 1))
                                                goto LABEL_c3b644;
                                        }
                                        else
                                        {
                                            if (!a0->field_20 || !(sub_be7850() & 1))
                                            {
LABEL_c3b644:
                                                if (!*(unsigned long long *)((void*)&v5 + 8) && !*(unsigned long long *)((void*)&v6 + 8))
                                                {
                                                    if (a0->field_20)
                                                        goto LABEL_c3b65c;
                                                    goto LABEL_c3b6d8;
                                                }
                                                if (a0->field_20)
                                                {
                                                    if (sub_be7850() & 1)
                                                        return 1;
                                                    if (!a0->field_20)
                                                        goto LABEL_c3b6d8;
                                                    if (!(sub_c3bac4(&v5) & 1))
                                                    {
                                                        if (!a0->field_20)
                                                            goto LABEL_c3b6d8;
LABEL_c3b65c:
                                                        if (sub_be7850() & 1)
                                                            return 1;
                                                        v2 = *(unsigned long long *)((void*)&v2 + 8);
                                                        if (!a0->field_20)
                                                            goto LABEL_c3b6d8;
                                                        if (!(sub_bef1c8(&v2) & 1))
                                                        {
                                                            if (a0->field_20)
                                                            {
LABEL_c3b408:
                                                                if (sub_be7850() & 1)
                                                                    return 1;
                                                            }
                                                            goto LABEL_c3b6d8;
                                                        }
                                                    }
                                                }
                                                else
                                                {
LABEL_c3b6d8:
                                                    if (!a0->field_0)
                                                        return 0;
                                                    a0->field_18 = a0->field_18 - 1;
                                                    return 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if (!a0->field_20)
                                    return 0;
                                if (!(sub_be7850(a0->field_20, "::", 2) & 1))
                                {
                                    if (a0->field_0)
                                        goto LABEL_c3b1dc;
                                    goto LABEL_c3b5a0;
                                }
                            }
                        }
                    }
                    else
                    {
                        v18 = 1;
LABEL_c3b484:
                        v20 = v18 & 0x100;
                        if (!a0->field_20)
                        {
                            a0->field_0 = 0;
                            *(char *)&a0->field_8 = v20 >> 8;
                            return 0;
                        }
                        v21 = arm64g_calculate_condition(4, v20, 0, 0);
                        if (!(sub_be7850() & 1))
                        {
                            a0->field_0 = 0;
                            *(char *)&a0->field_8 = v20 >> 8;
                            return 0;
                        }
                    }
                }
                else
                {
                    if (v13 != 88)
                    {
                        if (v13 == 89)
                            goto LABEL_c3b398;
                        goto LABEL_c3b2f8;
                    }
LABEL_c3b32c:
                    sub_c3b814(&v2, a0, 115);
                    if (*(char *)&v2 == 1)
                    {
LABEL_c3b348:
                        v22 = *(char *)((void*)&v2 + 1);
                        goto LABEL_c3b34c;
                    }
                    sub_c3bf0c(a0);
LABEL_c3b398:
                    if (a0->field_20 && sub_be7850(a0->field_20, "<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
                        return 1;
                    if (!(sub_c3bf6c(a0) & 1) && (v13 == 77 || (!a0->field_20 || !(sub_be7850(a0->field_20, " as mut dyn  is trueboolchari128u128Zero", 4) & 1)) && !(sub_c3b0e8(a0, 0) & 1)))
                    {
LABEL_c3b3f8:
                        if (a0->field_20)
                            goto LABEL_c3b408;
                        goto LABEL_c3b6d8;
                    }
                }
            }
            else
            {
                switch (v13)
                {
                case 66:
                    if (!(sub_c3b728(a0, a1) & 1))
                        goto LABEL_c3b6d8;
                    break;
                case 67:
                    sub_c3b814(&v2, a0, 115);
                    if (*(char *)&v2 == 1)
                    {
                        v22 = *(char *)((void*)&v2 + 1);
                        if (!a0->field_20)
                        {
                            a0->field_0 = 0;
                            *(char *)&a0->field_8 = v22;
                            return 0;
                        }
                        v23 = v22 & 0xff;
                        if (v22)
                        {
                            v24 = arm64g_calculate_condition(19, v23, 0, 0);
                            if (!(v24 & 1))
                                goto LABEL_c3b466;
LABEL_c3b465:
                        }
                        else
                        {
                            v25 = arm64g_calculate_condition(19, v23, 0, 0);
                            if (v25 & 1)
                                goto LABEL_c3b465;
LABEL_c3b466:
                        }
LABEL_c3b468:
                        if (!(sub_be7850() & 1))
                        {
                            a0->field_0 = 0;
                            *(char *)&a0->field_8 = v22;
                            return 0;
                        }
                    }
                    else
                    {
                        if (!a0->field_0)
                            goto LABEL_c3b5a0;
                        sub_c3b8ac(&v2, a0);
                        if (!*(unsigned long long *)&v2)
                        {
LABEL_c3b574:
                            v22 = *(char *)((void*)&v2 + 8);
LABEL_c3b34c:
                            if (!a0->field_20)
                            {
                                a0->field_0 = 0;
                                *(char *)&a0->field_8 = v22;
                                return 0;
                            }
                            v27 = arm64g_calculate_condition(19, v22, 0, 0);
                            goto LABEL_c3b468;
                        }
                        v0 = v2;
                        v1 = v4;
                        if (!a0->field_20)
                            goto LABEL_c3b6d8;
                        if (!(sub_c3bac4(&v0) & 1))
                        {
                            v26 = a0->field_20;
                            if (v26 && *(unsigned long long *)((void*)&v2 + 8) && !(v26->field_10 >> 23 & 1))
                                v26->field_8->field_18();
                            goto LABEL_c3b6d8;
                        }
                    }
                case 73:
                    if (!(sub_c3b0e8(a0, a1) & 1) && (!(a1 & 1) || !a0->field_20 || !(sub_be7850(a0->field_20, "::", 2) & 1)))
                    {
                        if (a0->field_20 && sub_be7850(a0->field_20, "<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
                            return 1;
                        if (!(sub_c3c458(a0) & 1))
                            goto LABEL_c3b3f8;
                        break;
                    }
                    break;
                default:
                    goto LABEL_c3b2f8;
                }
            }
        }
        else
        {
LABEL_c3b2f8:
            if (!a0->field_20 || !(sub_be7850(a0->field_20, &g_e0eb40, 16) & 1))
            {
                a0->field_0 = 0;
                *(char *)&a0->field_8 = 0;
                return 0;
            }
        }
    }
    else if (!a0->field_20 || !(sub_be7850(a0->field_20, "{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]", 25) & 1))
    {
        a0->field_0 = 0;
        *(char *)&a0->field_8 = 1;
        return 0;
    }
    return 1;
}
