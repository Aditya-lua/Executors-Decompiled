/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa26f30..0xa270b8 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a26f30_0 {
    char padding_0[32];
    char field_20;
    char padding_21[31];
    uint128_t field_40;
    uint128_t field_50;
} st_a26f30_0;

extern char g_10002b0;

uint128_t * sub_a26f30(uint128_t *a0, st_a26f30_0 *a1)
{
    uint128_t *v7;  // x21
    uint128_t v8;  // q0
    unsigned long v10;  // d0
    uint128_t *v11;  // x0
    char v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    char v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = &a1->field_40;
    v8 = a1->field_40 | a1->field_50;
    v10 = __dirty_unsupported_Iop_ZeroHI64ofV128(v8 | __dirty_unsupported_Iop_SliceV128(v8, v8, 8));
    if (__double_as_longlong(v10))
    {
        sub_a25aa0(&v3, v7);
        sub_a256a0(&v1, a1, &v3);
        sub_a25620(&v3, a1, &v3);
        sub_a257a0(&v1, &v1, &v3);
        sub_a25540(&v1, &v1);
        sub_a25620(a0 + 2, &a1->field_20, &a1->field_20);
        sub_a257a0(a0 + 4, a0 + 2, v7);
        sub_a25aa0(a0 + 2, a0 + 2);
        sub_a257a0(&v0, a0 + 2, a1);
        sub_a25aa0(a0 + 2, a0 + 2);
        sub_a25480(a0 + 2, a0 + 2);
        sub_a25aa0(a0, &v1);
        sub_a25620(&v3, &v0, &v0);
        sub_a256a0(a0, a0, &v3);
        sub_a256a0(&v3, &v0, a0);
        sub_a257a0(&v3, &v3, &v1);
        v11 = sub_a256a0(&v1, &v3, a0 + 2);
        a0[2] = v1;
        a0[3] = v2;
        a0 = v11;
    }
    else
    {
        a0[4] = 0;
        a0[5] = 0;
    }
    if (*(long long *)&g_10002b0 == v4)
        return a0;
    ___stack_chk_fail();
}
