/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47798..0xb47918 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47798_0 {
    long long field_0;
    char padding_8[44];
    uint128_t field_34;
    uint128_t field_44;
    char field_54[8];
    char field_55;
    char field_56;
    char field_57;
    char field_58;
    char field_59;
    char field_5a;
    char field_5b;
    char field_5c[8];
    char field_5d;
    char field_5e;
    char field_5f;
    char field_60;
    char field_61;
    char field_62;
    char field_63;
} st_b47798_0;

typedef struct st_b47798_1 {
    char padding_0[240];
    struct st_b47798_0 *field_f0;
} st_b47798_1;


int sub_b47798(st_b47798_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    st_b47798_0 *v2;  // x26
    st_b47798_0 *v3;  // x3
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    unsigned int v4;  // w8
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = a0->field_f0;
    *(uint128_t *)((char *)&v2->field_34 + 4) = 0;
    v3 = v2;
    *(uint128_t *)&(v3->padding_8)[1] = 0;
    *(unsigned long long *)((char *)&v2->field_44 + 12) = 0;
    *(unsigned long long *)((char *)&v2->field_44 + 4) = 0;
    if (!sub_a4c694(v2->field_0, 0, 0, (v3->padding_8)[1], 0, 0xffffffff))
        return 0;
    v4 = v2->field_54[3] + 1;
    v2->field_54[3] = v4;
    v5 = v2->field_54[2] + (v4 >> 8);
    v2->field_54[2] = v5;
    v6 = v2->field_54[1] + (v5 >> 8);
    v2->field_54[1] = v6;
    v7 = v2->field_54[0] + (v6 >> 8);
    v2->field_54[0] = v7;
    v8 = *((char *)&v2->field_44 + 15) + (v7 >> 8);
    *((char *)&v2->field_44 + 15) = v8;
    v9 = *((char *)&v2->field_44 + 14) + (v8 >> 8);
    *((char *)&v2->field_44 + 14) = v9;
    v10 = *((char *)&v2->field_44 + 13) + (v9 >> 8);
    *((char *)&v2->field_44 + 13) = v10;
    v11 = *((char *)&v2->field_44 + 12) + (v10 >> 8);
    *((char *)&v2->field_44 + 12) = v11;
    v12 = *((char *)&v2->field_44 + 11) + (v11 >> 8);
    *((char *)&v2->field_44 + 11) = v12;
    v13 = *((char *)&v2->field_44 + 10) + (v12 >> 8);
    *((char *)&v2->field_44 + 10) = v13;
    v14 = *((char *)&v2->field_44 + 9) + (v13 >> 8);
    *((char *)&v2->field_44 + 9) = v14;
    v15 = *((char *)&v2->field_44 + 8) + (v14 >> 8);
    *((char *)&v2->field_44 + 8) = v15;
    v16 = *((char *)&v2->field_44 + 7) + (v15 >> 8);
    *((char *)&v2->field_44 + 7) = v16;
    v17 = *((char *)&v2->field_44 + 6) + (v16 >> 8);
    *((char *)&v2->field_44 + 6) = v17;
    v18 = *((char *)&v2->field_44 + 5) + (v17 >> 8);
    *((char *)&v2->field_44 + 5) = v18;
    *((char *)&v2->field_44 + 4) = *((char *)&v2->field_44 + 4) + (char)(v18 >> 8);
}
