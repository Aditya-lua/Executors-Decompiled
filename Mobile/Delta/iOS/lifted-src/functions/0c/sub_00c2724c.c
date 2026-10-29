/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2724c..0xc27384 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2724c_1 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_c2724c_1;

typedef struct st_c2724c_0 {
    uint128_t field_0;
    unsigned long long field_10;
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    unsigned long long field_100;
} st_c2724c_0;


double sub_c2724c(st_c2724c_0 *a0, st_c2724c_1 *a1, long long a2, long long a3)
{
    long long v19;  // x22
    st_c2724c_0 *ptr;  // x0
    unsigned long long v21;  // x24
    uint128_t v0;  // [bp-0x160]
    uint128_t v1;  // [bp-0x150]
    uint128_t v2;  // [bp-0x140]
    uint128_t v3;  // [bp-0x130]
    uint128_t v4;  // [bp-0x120]
    uint128_t v5;  // [bp-0x110]
    uint128_t v6;  // [bp-0x100]
    uint128_t v7;  // [bp-0xf0]
    uint128_t v8;  // [bp-0xe0]
    uint128_t v9;  // [bp-0xd0]
    uint128_t v10;  // [bp-0xc0]
    uint128_t v11;  // [bp-0xb0]
    uint128_t v12;  // [bp-0xa0]
    uint128_t v13;  // [bp-0x90]
    unsigned long v14;  // [bp-0x80]
    uint128_t v15;  // [bp-0x70]
    unsigned long v16;  // [bp-0x60]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a1->field_10;
    if ((unsigned long long)v19 > (unsigned long long)a2)
    {
        ptr = a1->field_8 + 264 * a2;
        v15 = ptr->field_0;
        v21 = ptr->field_18;
        v16 = ptr->field_10;
        v12 = ptr->field_e0;
        v13 = ptr->field_f0;
        v14 = ptr->field_100;
        v8 = ptr->field_a0;
        v9 = ptr->field_b0;
        v10 = ptr->field_c0;
        v11 = ptr->field_d0;
        v4 = ptr->field_60;
        v5 = ptr->field_70;
        v6 = ptr->field_80;
        v7 = ptr->field_90;
        v0 = ptr->field_20;
        v1 = ptr->field_30;
        v2 = ptr->field_40;
        v3 = ptr->field_50;
        _memmove(ptr, ptr + 1, (v19 + ~a2) * 264);
        v19 -= 1;
        a1->field_10 = v19;
        if (v21 != 33)
        {
            a0->field_0 = v15;
            a0->field_10 = v16;
            a0->field_18 = v21;
            a0->field_e0 = v12;
            a0->field_f0 = v13;
            a0->field_100 = v14;
            a0->field_a0 = v8;
            a0->field_b0 = v9;
            a0->field_c0 = v10;
            a0->field_d0 = v11;
            a0->field_60 = v4;
            a0->field_70 = v5;
            a0->field_80 = v6;
            a0->field_90 = v7;
            a0->field_20 = v0;
            a0->field_30 = v1;
            a0->field_40 = v2;
            a0->field_50 = v3;
            return *(unsigned long long *)&v3;
        }
    }
    sub_c6bb3c(a2, v19, a3);
}
