/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa26cc0..0xa26f30 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a26cc0_0 {
    char padding_0[32];
    char field_20;
    char padding_21[31];
    uint128_t field_40;
    uint128_t field_50;
} st_a26cc0_0;

extern char g_10002b0;

void* sub_a26cc0(void* a0, st_a26cc0_0 *a1, void* a2)
{
    uint128_t *v19;  // x22
    uint128_t v20;  // q0
    unsigned long v29;  // d0
    unsigned long long v30;  // x8
    unsigned long v22;  // d0
    void* v23;  // x0
    uint128_t v24;  // q0
    unsigned long v26;  // d0
    uint128_t v27;  // q0
    uint128_t v0;  // [bp-0x140]
    uint128_t v1;  // [bp-0x130]
    uint128_t v2;  // [bp-0x120]
    uint128_t v3;  // [bp-0x110]
    unsigned long v4;  // [bp-0x100]
    unsigned long v5;  // [bp-0xf8]
    unsigned long v6;  // [bp-0xf0]
    unsigned long v7;  // [bp-0xe8]
    uint128_t v8;  // [bp-0xe0]
    uint128_t v9;  // [bp-0xd0]
    uint128_t v10;  // [bp-0xc0]
    uint128_t v11;  // [bp-0xb0]
    uint128_t v12;  // [bp-0xa0]
    uint128_t v13;  // [bp-0x90]
    uint128_t v14;  // [bp-0x80]
    uint128_t v15;  // [bp-0x70]
    unsigned long v16;  // [bp-0x48]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v14 = 0;
    v15 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    v19 = &a1->field_40;
    v20 = a1->field_40 | a1->field_50;
    v22 = __dirty_unsupported_Iop_ZeroHI64ofV128(v20 | __dirty_unsupported_Iop_SliceV128(v20, v20, 8));
    if (__double_as_longlong(v22))
    {
        sub_a25aa0(&v14, v19);
        sub_a257a0(&v12, &v14, v19);
        sub_a257a0(&v14, &v14, a2);
        sub_a257a0(&v12, &v12, a2 + 32);
        sub_a256a0(&v14, &v14, a1);
        v23 = sub_a256a0(&v12, &v12, &a1->field_20);
        v24 = v14 | v15;
        v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(v24 | __dirty_unsupported_Iop_SliceV128(v24, v24, 8));
        if (__double_as_longlong(v26))
        {
            sub_a257a0(a0 + 64, v19, &v14);
            sub_a25aa0(&v10, &v14);
            sub_a257a0(&v8, &v10, &v14);
            sub_a257a0(&v10, &v10, a1);
            sub_a25620(&v14, &v10, &v10);
            sub_a25aa0(a0, &v12);
            sub_a256a0(a0, a0, &v14);
            sub_a256a0(a0, a0, &v8);
            sub_a256a0(&v10, &v10, a0);
            sub_a257a0(&v10, &v10, &v12);
            sub_a257a0(&v8, &v8, &a1->field_20);
            a0 = sub_a256a0(a0 + 32, &v10, &v8);
        }
        else
        {
            v27 = v12 | v13;
            v29 = __dirty_unsupported_Iop_ZeroHI64ofV128(v27 | __dirty_unsupported_Iop_SliceV128(v27, v27, 8));
            if (__double_as_longlong(v29))
            {
                *(uint128_t *)&a0[64] = 0;
                *(uint128_t *)&a0[80] = 0;
                a0 = v23;
            }
            else
            {
                v0 = *(int128_t *)a2;
                v1 = (int128_t)a2[16];
                v2 = (int128_t)a2[32];
                v3 = (int128_t)a2[48];
                v6 = 0;
                v7 = 0;
                v4 = 1;
                v5 = 0;
                a0 = sub_a26f30(a0, &v0);
            }
        }
    }
    else
    {
        *(long long *)a0 = *(long long *)a2;
        *(long long *)&a0[32] = (long long)a2[32];
        *(unsigned long long *)&a0[64] = 0;
        *(long long *)&a0[8] = (long long)a2[8];
        *(long long *)&a0[40] = (long long)a2[40];
        *(unsigned long long *)&a0[72] = 0;
        *(long long *)&a0[16] = (long long)a2[16];
        *(long long *)&a0[48] = (long long)a2[48];
        *(unsigned long long *)&a0[80] = 0;
        *(long long *)&a0[24] = (long long)a2[24];
        v30 = (long long)a2[56];
        *(unsigned long long *)&a0[88] = 0;
        *(unsigned long long *)&a0[56] = v30;
        *(unsigned long long *)&a0[64] = 1;
    }
    if (*(long long *)&g_10002b0 == v16)
        return a0;
    ___stack_chk_fail();
}
