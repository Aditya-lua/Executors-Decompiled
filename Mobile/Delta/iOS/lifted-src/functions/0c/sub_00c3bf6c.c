/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3bf6c..0xc3c458 (1260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3bf6c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_c3bf6c_0;

extern long long g_e0eb40;

char sub_c3bf6c(st_c3bf6c_0 *a0, char a1)
{
    unsigned long v5;  // x22
    unsigned long v6;  // x23
    unsigned long v7;  // x21
    unsigned long v8;  // x20
    unsigned long v9;  // x24
    unsigned int v10;  // w8
    unsigned long v11;  // x9
    char v12;  // x20
    char v13;  // w20
    unsigned long long v14;  // 4111
    char v0;  // [bp-0x50]
    char v1;  // [bp-0x4f]
    char v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_0;
    if (v5)
    {
        v6 = a0->field_8;
        v7 = a0->field_10;
        if (v6 > v7)
        {
            v8 = *(char *)(v5 + v7);
            v9 = v7 + 1;
            a0->field_10 = v9;
            if (sub_c3dfd0(v8))
            {
                if (*(long long *)((char *)&a0[1].field_0 + 4))
                    return sub_be7850();
                return 0;
            }
            v10 = a0->field_18 + 1;
            a0->field_18 = v10;
            if (v10 > 500)
            {
                if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn()", 25) & 1))
                {
                    a0->field_0 = 0;
                    *(char *)&a0->field_8 = 1;
                    return 0;
                }
            }
            else
            {
                if (80 >= (int)v8)
                {
                    if (69 >= (int)v8)
                    {
                        if ((unsigned int)v8 == 65)
                            goto LABEL_c3c288;
                        if ((unsigned int)v8 != 66)
                        {
                            if ((unsigned int)v8 != 0x44)
                                goto LABEL_c3c3a0;
                            if ((!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "dyn ", 4) & 1)) && !(sub_c3e340(a0) & 1))
                            {
                                if (!a0->field_0 || (v11 = a0->field_10, a0->field_8 <= v11 || *(char *)(a0->field_0 + v11) != 76))
                                    goto LABEL_c3c100;
                                a0->field_10 = v11 + 1;
                                sub_c3c5c8(&v0, a0);
                                if (v0 & 1)
                                    goto LABEL_c3c1a4;
                                v12 = v2;
                                if (!v12 || (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), " + : punycode{}.llvm.0", 3) & 1)) && !(sub_c3ccb4(a0, v12) & 1))
                                    goto LABEL_c3c41c;
                            }
                        }
                        else
                        {
                            if (!(sub_c3e1b0(a0) & 1))
                                goto LABEL_c3c41c;
                        }
                    }
                    else
                    {
                        if (2 > (unsigned int)v8 - 79)
                        {
                            if (*(long long *)((char *)&a0[1].field_0 + 4))
                            {
                                a1 = (char)"*";
                                if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "*", 1) & 1)
                                    return 1;
                            }
                            if ((unsigned int)v8 != 80)
                                goto LABEL_c3c3f4;
                            if (*(long long *)((char *)&a0[1].field_0 + 4))
                            {
                                a1 = (char)"const ";
                                goto LABEL_c3c408;
                            }
                            goto LABEL_c3c410;
                        }
                        if ((unsigned int)v8 == 70)
                        {
                            if (!(sub_c3e008(a0) & 1))
                                goto LABEL_c3c41c;
                        }
                        else
                        {
LABEL_c3c3a0:
                            a0->field_10 = v7;
                            if (!(sub_c3b0e8(a0, 0) & 1))
                                goto LABEL_c3c41c;
                        }
                    }
                }
                else
                {
                    if (83 >= (int)v8)
                    {
                        if (2 > (unsigned int)v8 - 81)
                        {
                            if (*(long long *)((char *)&a0[1].field_0 + 4))
                            {
                                a1 = (char)"&";
                                if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "&", 1) & 1)
                                    return 1;
                                v5 = a0->field_0;
                                if (v5)
                                {
                                    v6 = a0->field_8;
                                    v9 = a0->field_10;
                                    goto LABEL_c3c174;
                                }
                                goto LABEL_c3c3ec;
                            }
LABEL_c3c174:
                            if (v6 > v9 && *(char *)(v5 + v9) == 76)
                            {
                                a0->field_10 = v9 + 1;
                                sub_c3c5c8(&v0, a0);
                                if (v0 & 1)
                                {
LABEL_c3c1a4:
                                    v13 = v1;
                                    if (!*(long long *)((char *)&a0[1].field_0 + 4))
                                    {
                                        a0->field_0 = 0;
                                        *(char *)&a0->field_8 = v13;
                                        return 0;
                                    }
                                    v14 = arm64g_calculate_condition(19, v13 & 0xff, 0, 0);
                                    if (!(sub_be7850() & 1))
                                    {
                                        a0->field_0 = 0;
                                        *(char *)&a0->field_8 = v13;
                                        return 0;
                                    }
                                }
                                else
                                {
                                    a1 = v2;
                                    if (!a1)
                                        goto LABEL_c3c3ec;
                                    if (!(sub_c3ccb4(a0) & 1))
                                    {
                                        if (*(long long *)((char *)&a0[1].field_0 + 4))
                                        {
                                            a1 = (char)" ";
                                            if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), " ", 1) & 1)
                                                return 1;
                                        }
                                        goto LABEL_c3c3ec;
                                    }
                                }
                            }
                            else
                            {
LABEL_c3c3ec:
                                if ((unsigned int)v8 != 82)
                                {
LABEL_c3c3f4:
                                    if (!*(long long *)((char *)&a0[1].field_0 + 4))
                                        goto LABEL_c3c410;
                                    a1 = (char)"mut ";
LABEL_c3c408:
                                    if (!(sub_be7850() & 1))
                                        goto LABEL_c3c410;
                                }
                                else
                                {
LABEL_c3c410:
                                    if (!(sub_c3bf6c(a0, a1) & 1))
                                    {
LABEL_c3c41c:
                                        if (!a0->field_0)
                                            return 0;
                                        a0->field_18 = a0->field_18 - 1;
                                        return 0;
                                    }
                                }
                            }
                        }
                        else
                        {
                            if ((unsigned int)v8 != 83)
                                goto LABEL_c3c3a0;
LABEL_c3c288:
                            if (*(long long *)((char *)&a0[1].field_0 + 4))
                            {
                                a1 = (char)"[]::::{closure:#<>";
                                if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "[]::::{closure:#<>", 1) & 1)
                                    return 1;
                            }
                            if (!(sub_c3bf6c(a0, a1) & 1))
                            {
                                if ((unsigned int)v8 == 65)
                                {
                                    if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "; ", 2) & 1))
                                    {
                                        if (sub_c3c6a0(a0, 1) & 1)
                                            return 1;
                                        goto LABEL_c3c2ec;
                                    }
                                }
                                else
                                {
LABEL_c3c2ec:
                                    if (*(long long *)((char *)&a0[1].field_0 + 4))
                                        goto LABEL_c3c37c;
                                    goto LABEL_c3c41c;
                                }
                            }
                        }
                    }
                    else
                    {
                        if ((unsigned int)v8 != 84)
                        {
                            if ((unsigned int)v8 != 87)
                                goto LABEL_c3c3a0;
                            if (!(sub_c3bf6c(a0, a1) & 1) && (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), " is trueboolchari128u128Zero", 4) & 1)) && !(sub_c3e4d0(a0) & 1))
                                goto LABEL_c3c41c;
                        }
                        else
                        {
                            if (*(long long *)((char *)&a0[1].field_0 + 4))
                            {
                                a1 = (char)"(";
                                if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "(", 1) & 1)
                                    return 1;
                            }
                            if (!(sub_c3e294(a0) & 1))
                            {
                                if (a1 == 1)
                                {
                                    if (*(long long *)((char *)&a0[1].field_0 + 4))
                                    {
                                        if (sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), ",_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
                                            return 1;
                                        goto LABEL_c3c36c;
                                    }
                                }
                                else
                                {
LABEL_c3c36c:
                                    if (*(long long *)((char *)&a0[1].field_0 + 4))
                                    {
LABEL_c3c37c:
                                        if (sub_be7850() & 1)
                                            return 1;
                                    }
                                }
                                goto LABEL_c3c41c;
                            }
                        }
                    }
                }
            }
        }
        else
        {
LABEL_c3c100:
            if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), &g_e0eb40, 16) & 1))
            {
                a0->field_0 = 0;
                *(char *)&a0->field_8 = 0;
                return 0;
            }
        }
        return 1;
    }
    else if (*(long long *)((char *)&a0[1].field_0 + 4))
    {
        return sub_be7850();
    }
    else
    {
        return 0;
    }
}
