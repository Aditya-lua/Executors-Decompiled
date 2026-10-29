/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19df4..0x19f1c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19df4_0 {
    unsigned int field_0;
    unsigned long long field_4;
} st_19df4_0;

typedef struct st_19df4_3 {
    uint128_t field_0;
    char field_10;
} st_19df4_3;

typedef struct st_19df4_1 {
    char padding_0[160];
    unsigned long long field_a0;
    char padding_a8[48];
    long long field_d8;
} st_19df4_1;

typedef struct st_19df4_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_19df4_2;

typedef struct st_19df4_5 {
    struct st_19df4_4 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_19df4_5;

typedef struct st_19df4_4 {
    unsigned long long field_0;
    struct st_19df4_2 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned int field_20;
    uint128_t field_24;
    char field_34;
} st_19df4_4;


double sub_19df4(st_19df4_1 *a0, unsigned int a1, st_19df4_3 *a2, st_19df4_0 *a3)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x26
    unsigned long long v7;  // x27
    st_19df4_2 *v8;  // x25
    unsigned long v9;  // x24
    unsigned long long v10;  // x28
    st_19df4_4 *v11;  // x0
    unsigned long v12;  // x8
    st_19df4_5 *v13;  // x8
    uint128_t v0;  // [bp-0x80], Other Possible Types: unsigned int
    unsigned long v1;  // [bp-0x7c]
    char v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_12740();
    v0 = a3->field_0;
    v1 = *(long long *)&(&a3->field_0)[1];
    if (sub_1ef30(a0, 93, &v0, 0))
    {
        v6 = a0->field_a0;
        if (sub_1f3d4(a0, 58, "table field"))
            goto LABEL_19e9c;
LABEL_19e78:
        v7 = 0xffffffffffffffff;
    }
    else
    {
        v6 = 0xffffffffffffffff;
        if (!sub_1f3d4(a0, 58, "table field"))
            goto LABEL_19e78;
LABEL_19e9c:
        v7 = a0->field_a0;
    }
    v8 = sub_12740(a0, 0);
    v9 = *(long long *)&(&a3->field_0)[1];
    v10 = *(long long *)&(v8->padding_0)[1];
    v0 = a2->field_0;
    v2 = a2->field_10;
    v11 = sub_404c(a0->field_d8, 56);
    v11->field_0 = v5;
    v11->field_8 = v8;
    v11->field_10 = v9;
    v11->field_18 = v10;
    v11->field_20 = a1;
    *(uint128_t *)&(&v11->field_20)[1] = v0;
    *((char *)&v11->field_24 + 4) = v2;
    v12 = *(long long *)&(&a3->field_0)[1];
    v13->field_0 = v11;
    v13->field_8 = v12;
    v13->field_10 = v6;
    v13->field_18 = v7;
    return *(unsigned long long *)&v0;
}
