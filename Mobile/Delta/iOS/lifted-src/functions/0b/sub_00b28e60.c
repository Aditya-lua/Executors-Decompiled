/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28e60..0xb29158 (760 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28e60_0 {
    struct st_b28e60_0 *field_0;
    char padding_8[8];
    struct st_b28e60_0 *field_10;
    struct st_b28e60_0 *field_18;
    struct st_b28e60_0 *field_1c;
    struct st_b28e60_0 *field_20;
    struct st_b28e60_0 *field_28;
    struct st_b28e60_0 *field_30;
    struct st_b28e60_0 *field_38;
    struct st_b28e60_0 *field_40;
} st_b28e60_0;

extern char g_10002b0;

st_b28e60_0 * sub_b28e60(st_b28e60_0 *a0, st_b28e60_0 *a1)
{
    st_b28e60_0 *v15;  // x0
    st_b28e60_0 *v16;  // w8
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    st_b28e60_0 *v25;  // x0
    st_b28e60_0 *v26;  // x0
    st_b28e60_0 *v27;  // x21
    char v28;  // x8
    st_b28e60_0 *v29;  // x0
    st_b28e60_0 *v30;  // x20
    st_b28e60_0 *v31;  // x0
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    st_b28e60_0 *v0;  // [bp-0xf0], Other Possible Types: char
    char *v1;  // [bp-0xe8], Other Possible Types: st_b28e60_0 *, st_b28e60_0 **
    st_b28e60_0 *v2;  // [bp-0xe0]
    st_b28e60_0 *v3;  // [bp-0xd0]
    st_b28e60_0 *v4;  // [bp-0xc0]
    st_b28e60_0 *v5;  // [bp-0xb0]
    st_b28e60_0 *v6;  // [bp-0xa0]
    st_b28e60_0 *v7;  // [bp-0x90]
    st_b28e60_0 *v8;  // [bp-0x80]
    st_b28e60_0 *v9;  // [bp-0x70]
    st_b28e60_0 *v10;  // [bp-0x60]
    st_b28e60_0 *v11;  // [bp-0x50]
    unsigned long v12;  // [bp-0x38]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v10 = (st_b28e60_0 *)0;
    v11 = (st_b28e60_0 *)0;
    v8 = (st_b28e60_0 *)0;
    v9 = (st_b28e60_0 *)0;
    v7 = (st_b28e60_0 *)0;
    v1 = 0;
    v15 = a0;
    if (v15)
    {
        if (!a1 || !a1->field_0)
        {
LABEL_b29124:
            v15 = 1;
        }
        else if (sub_a6fbc4(a1, "kdf-type"))
        {
            v1 = &v7;
            v15 = sub_a71220();
            if (!(unsigned int)v15)
            {
                if (*(long long *)&g_10002b0 == v12)
                    return v15;
                ___stack_chk_fail();
            }
            v16 = (st_b28e60_0 *)(char)v7;
            if (!v16)
            {
LABEL_b28f1c:
                *(unsigned int *)((char *)&a0->field_18 + 4) = (unsigned int)v16;
                goto LABEL_b28f20;
            }
            else if (v7 == 0x2d46444b32343958)
            {
                v17 = arm64g_calculate_condition(v23, v24, v19, v20);
                v18 = arm64g_calculate_condition(20, (v17 & 1 ? *(unsigned long long *)((void*)&v7 + 5) : 0), (v17 & 1 ? 13878393341560388 : 0), 0);
                if (!(v18 & 1))
                    goto LABEL_b28f18;
                goto LABEL_b28fdc;
            }
            else
            {
                v21 = arm64g_calculate_condition(v23, v24, v19, v20);
                v22 = arm64g_calculate_condition(16, (v21 & 1 ? *(unsigned long long *)((void*)&v7 + 5) : 0), (v21 & 1 ? 13878393341560388 : 0), 0);
                if (!(v22 & 1))
                {
LABEL_b28f18:
                    v16 = (st_b28e60_0 *)1;
                    goto LABEL_b28f1c;
                }
            }
        }
        else
        {
LABEL_b28f20:
            if (sub_a6fbc4(a1, "kdf-digest"))
            {
                v5 = (st_b28e60_0 *)0;
                v6 = (st_b28e60_0 *)0;
                v3 = (st_b28e60_0 *)0;
                v4 = (st_b28e60_0 *)0;
                v2 = (st_b28e60_0 *)0;
                v1 = &v7;
                if (sub_a71220() && !(v1 = &v2, sub_a6fbc4(a1, "kdf-digest-props") && !sub_a71220()))
                {
                    sub_a3f52c(a0->field_1c);
                    v25 = sub_a40ca8(a0->field_0, &v7, &v2);
                    a0->field_1c = v25;
                    if (v25)
                    {
                        if (!sub_a50b14())
                            goto LABEL_b28fe4;
                        sub_a368c8();
                        sub_a369bc("providers/implementations/exchange/dh_exch.c", 399, "dh_set_ctx_params");
                        sub_a36abc(57, 183, 0);
                    }
                }
LABEL_b28fdc:
                v15 = 0;
            }
            else
            {
LABEL_b28fe4:
                if (sub_a6fbc4(a1, "kdf-outlen"))
                {
                    v15 = sub_a70ef8();
                    if ((unsigned int)v15)
                    {
                        a0->field_30 = v2;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v12)
                            return v15;
                        ___stack_chk_fail();
                    }
                }
                v26 = sub_a6fbc4(a1, "kdf-ukm");
                if (v26)
                {
                    v27 = v26;
                    v2 = 0;
                    sub_a6c2e4(a0->field_20, "providers/implementations/exchange/dh_exch.c", 425);
                    a0->field_20 = 0;
                    a0->field_28 = 0;
                    if (v27->field_10 && v27->field_18)
                    {
                        v15 = sub_a71440(v27, &v2, 0, &v0);
                        if ((unsigned int)v15)
                        {
                            a0->field_20 = v2;
                            a0->field_28 = v0;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v12)
                                return v15;
                            ___stack_chk_fail();
                        }
                    }
                }
                if (sub_a6fbc4(a1, "pad"))
                {
                    v15 = sub_a6ffcc();
                    if ((unsigned int)v15)
                    {
                        v28 = (char)a0->field_18 & 254;
                        if ((unsigned int)v2)
                            v28 += 1;
                        *(char *)&a0->field_18 = v28;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v12)
                            return v15;
                        ___stack_chk_fail();
                    }
                }
                v29 = sub_a6fbc4(a1, "cekalg");
                if (!v29 || (v30 = v29, v1 = &v7, sub_a6c2e4(a0->field_38, "providers/implementations/exchange/dh_exch.c", 448), a0->field_38 = 0, !v30->field_10 || !v30->field_18 || (v15 = sub_a71220(v30, &v1, 80), (unsigned int)v15 && !(v31 = sub_a6d9b4(&v7, "providers/implementations/exchange/dh_exch.c", 453), a0->field_38 = v31, v15 = v31, !v15))))
                    goto LABEL_b29124;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v12)
        return v15;
    ___stack_chk_fail();
}
