/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80680..0xa8092c (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a80680_1 {
    char padding_0[8];
    struct st_a80680_0 *field_8;
    char padding_10[8];
    long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    char field_40;
    char padding_41[63];
    uint128_t field_80;
    uint128_t field_90;
    long long field_a0;
    char padding_a8[8];
    struct st_a80680_2 *field_b0;
    char field_b8;
    char padding_b9[7];
    char field_c0;
    char padding_c1[7];
    unsigned long long field_c8;
    unsigned long long field_d0;
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    char field_f0;
    char padding_f1[7];
    unsigned long long field_f8;
} st_a80680_1;

typedef struct st_a80680_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_a80680_2;

typedef struct st_a80680_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    char padding_34[20];
    long long field_48;
} st_a80680_0;

extern char g_10002b0;

char sub_a80680(st_a80680_1 *a0)
{
    st_a80680_0 *v12;  // x25
    char v13;  // x0
    unsigned long v22;  // x24
    char v23;  // x0
    unsigned long long v24;  // x8
    st_a80680_1 *v25;  // x23
    unsigned long long *v26;  // x23
    unsigned long long *v27;  // x24
    char v28;  // x21
    uint128_t *v29;  // x8
    st_a80680_1 *v14;  // x21
    char v15;  // x20
    unsigned long v16;  // x23
    char v17;  // x0
    st_a80680_1 *v18;  // x22
    char v19;  // x8
    unsigned long long *v20;  // x22
    unsigned long v21;  // x26
    uint128_t v0;  // [bp-0x110]
    uint128_t v1;  // [bp-0x100]
    char v2;  // [bp-0xf0]
    uint128_t v3;  // [bp-0xb0]
    uint128_t v4;  // [bp-0xa0]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    char v7;  // [bp-0x70]
    char v8;  // [bp-0x6f]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    if (a0->field_b0)
    {
        v12 = a0->field_8;
        v13 = sub_a3f728();
        if (!v13 || !(v14 = a0, !*(long long *)&v14->field_c0))
        {
            v28 = 0;
            v29 = &a0->field_b0->field_0;
            if (v29)
                goto LABEL_a80738;
        }
        else
        {
            v15 = v13;
            v16 = a0->field_8->field_20;
            v17 = sub_a6bf4c(v16 * 0x400, "crypto/ml_dsa/ml_dsa_vector.h", 35);
            *(unsigned long long *)&a0->field_c0 = v17;
            if (!v17 || (v18 = a0, v19 = *(long long *)&v18->field_f0, v20 = &v18->field_f0, *(unsigned long *)((char *)v20 - 40) = v16, *(long long *)&v18->field_f0 || (v21 = *(long long *)(*(long long *)((char *)v20 - 232) + 32), v22 = *(long long *)(*(long long *)((char *)v20 - 232) + 40), v23 = sub_a6bf4c(v22 * 0x400 + v21 * 0x800, "crypto/ml_dsa/ml_dsa_vector.h", 35), *v20 = v23, !v23)))
            {
LABEL_a80728:
                v28 = 0;
            }
            else
            {
                v24 = v23 + v22 * 0x400;
                v25 = a0;
                v25->field_d0 = v24 + v21 * 0x400;
                v26 = &v25->field_d0;
                v26[5] = v22;
                v27 = v26;
                v27[2] = v24;
                v26[3] = v21;
                v26[1] = v21;
                v5 = *(int128_t *)*(long long *)((char *)v26 - 32);
                v6 = *(int128_t *)(*(long long *)((char *)v26 - 32) + 16);
                v7 = v12->field_20;
                v8 = v12->field_28;
                if (sub_a3f7f0(v15, *(long long *)((char *)v26 - 184), 0) != 1 || sub_a3fe10(v15, &v5, 0x22) != 1 || sub_a403bc(v15, &v0, 128) != 1 || (a0->field_20 = v0, a0->field_30 = v1, a0->field_80 = v3, a0->field_90 = v4, !sub_a8117c(v15, a0->field_18, v12->field_30, &v2, v20, v27 + 2) || !sub_a801cc(a0, v15, &v14->field_c0, v26) || !sub_a7dca0(a0) || sub_a3f7f0(v15, a0->field_18, 0) != 1 || sub_a3fe10(v15, a0->field_a0, a0->field_8->field_48) != 1 || sub_a403bc(v15, &a0->field_40, 64) != 1))
                    goto LABEL_a80728;
                v28 = sub_a7e268(a0) != 0;
            }
            v13 = v15;
            v29 = &a0->field_b0->field_0;
            if (a0->field_b0)
            {
LABEL_a80738:
                if (!(a0->field_b8 >> 1 & 1))
                {
                    sub_a6c4e8(v29, 32, "crypto/ml_dsa/ml_dsa_key.c", 460);
                    a0->field_b0 = 0;
                }
            }
        }
    }
    else
    {
        v13 = 0;
        v28 = 0;
    }
    sub_a3f73c(v13);
    sub_a66ec0(&v5, 0x22);
    sub_a66ec0(&v0, 128);
    if (*(long long *)&g_10002b0 == v9)
        return v28;
    ___stack_chk_fail();
}
