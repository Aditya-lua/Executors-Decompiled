/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc62240..0xc624f0 (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c62240_1 {
    char padding_0[168];
    char field_a8;
    char padding_a9[839];
    unsigned long long field_3f0;
    unsigned long long field_3f8;
} st_c62240_1;

typedef struct st_c62240_0 {
    char padding_0[80];
    struct st_c62240_0 *field_50;
    char padding_58[8];
    unsigned int field_60;
    unsigned int field_64;
    char field_68;
} st_c62240_0;

extern char g_10002b0;

st_c62240_0 * sub_c62240(st_c62240_1 *a0, long long a1, long long a2, unsigned long a3, unsigned long long *a4, long long a5, long long a6, unsigned long long a7, unsigned long a8, st_c62240_0 **a9)
{
    unsigned long v5;  // x28
    st_c62240_0 *v6;  // x26
    uint128_t v15;  // q0
    uint128_t v16;  // q0
    uint128_t v17;  // q0
    uint128_t v18;  // q0
    uint128_t v19;  // q0
    unsigned long long *v20;  // x8
    uint128_t v21;  // q0
    unsigned long v22;  // d0
    unsigned long v23;  // x2
    st_c62240_0 *v7;  // w0
    unsigned long long v8;  // x0
    st_c62240_0 *v9;  // w9
    st_c62240_0 *v10;  // x9
    st_c62240_0 *v11;  // x19
    st_c62240_0 *v12;  // x10
    unsigned int v13;  // w0
    unsigned long v0;  // [bp-0x90]
    st_c62240_0 *v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]

    v4 = &a8;
    v5 = (unsigned int)a8;
    v3 = *(long long *)&g_10002b0;
    v1 = 0;
    v6 = sub_c624f0(&a0->field_a8, v5, 1);
    if ((a6 | a3) > 0x7fffffff)
    {
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else if (v6)
    {
        if (a3 <= v6->field_64 || !(v8 = sub_985e28(v6->field_60), sub_985e28(v6->field_60) > a0->field_3f0))
        {
LABEL_c6249c:
            if (*(long long *)&g_10002b0 == v3)
                return 0;
            ___stack_chk_fail();
        }
        if ((unsigned int)v5 == 3)
        {
            v9 = (st_c62240_0 *)v6->field_68;
            if (v9 == 3)
            {
                v10 = v6->field_50;
                v11 = v6->field_50 & 1;
            }
            else
            {
                v11 = *(char *)((void*)&a8 + 4);
                if (v9 != 2)
                {
                    if (v9 != 1)
                        goto LABEL_c62314;
                    v10 = &v6->field_50->padding_0[v6->field_50 & 1 ^ v11];
                }
                else
                {
                    v12 = v6->field_50 & 1;
                    *a9 = &v6->field_50->padding_0[-1 * (v12 ^ v11)];
                    if (v12 != v11 && a7 >= a0->field_3f8)
                        goto LABEL_c6249c;
LABEL_c62314:
                    v0 = *(long long *)(&v6->padding_0[0] + 0x8 * v11 + 48);
                    v13 = sub_a4fbf0(*(long long *)(&v6->padding_0[0] + 0x8 * v11 + 48));
                    if ((int)v13 >= 8)
                    {
                        ___memcpy_chk(&v2, (char *)v6 + 0x10 * v11 + 106, v13, 16);
                        v15 = _INSERT(_INSERT(__float_as_int(__int_as_float((unsigned int)(a7 >> 56))), 1, a7 >> 48), 2, a7 >> 40);
                        v16 = _INSERT(v15, 3, a7 >> 32);
                        v17 = _INSERT(v16, 4, (char)a7 * 0 | (char)(a7 >> 24));
                        v18 = _INSERT(v17, 5, (char)a7 * 0 | (char)(a7 >> 16));
                        v19 = _INSERT(v18, 6, (char)a7 * 0 | (char)(a7 >> 8));
                        v20 = (char *)&v2 + v13;
                        v21 = _INSERT(v19, 7, a7);
                        v22 = __dirty_unsupported_Iop_ZeroHI64ofV128(v21 ^ *(unsigned long long *)&*(double *)((char *)v20 - 8));
                        *(unsigned long *)((char *)v20 - 8) = v22;
                        if (sub_a4c694(v0, 0, 0, 0, &v2, 0) == 1)
                        {
                            v23 = v6->field_64;
                            if (sub_a4d5dc(v0, 0x11, v23, a2 + a3 - v23) == 1 && sub_a4c6a0(v0, 0, (char *)&v1 + 4, a5, a6) == 1 && sub_a4c6a0(v0, a1, (char *)&v1 + 4, a2, a3 - v6->field_64) == 1)
                            {
                                v7 = (st_c62240_0 *)(unsigned int)sub_a4ca14(v0, 0, &v1);
                                if (v7 == 1)
                                {
                                    *a4 = *(unsigned int *)((void*)&v1 + 4);
                                    if (*(long long *)&g_10002b0 == v3)
                                        return v7;
                                    ___stack_chk_fail();
                                }
                                else
                                {
                                    a0->field_3f0 = a0->field_3f0 + 1;
                                    if (*(long long *)&g_10002b0 == v3)
                                        return 0;
                                    ___stack_chk_fail();
                                }
                            }
                        }
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v3)
                            return 0;
                        ___stack_chk_fail();
                    }
                    goto LABEL_c6249c;
                }
            }
        }
        else
        {
            v10 = 0;
            v11 = 0;
        }
        *a9 = v10;
        goto LABEL_c62314;
    }
    else
    {
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
}
