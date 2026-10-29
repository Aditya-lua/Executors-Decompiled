/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x975df4..0x975f2c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_975df4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
    char padding_20[368];
    unsigned long long field_190;
    unsigned long long field_198;
} st_975df4_0;

typedef struct st_975df4_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    char field_20;
    char padding_21[7];
    struct st_975df4_2 *field_28;
} st_975df4_1;

typedef struct st_975df4_2 {
    unsigned long long field_0;
} st_975df4_2;


unsigned long long sub_975df4(st_975df4_0 *a0, int a1, unsigned long a2)
{
    st_975df4_0 *v4;  // x21
    unsigned long long v5;  // x0
    st_975df4_1 *v6;  // x20
    unsigned long long idx;  // x0
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long v10;  // x0
    st_975df4_1 *v11;  // x8
    unsigned long long v12;  // x9
    unsigned long v13;  // x10
    unsigned long v0;  // [bp-0x100]
    unsigned long v1;  // [bp-0x98]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (char *)a0 + a1 * 48;
    v1 = a2;
    v5 = sub_a66b6c(v4->field_18, &v1);
    if (!v5)
        return 0;
    v6 = v5;
    v0 = *(long long *)v5;
    v1 = *(long long *)v5;
    idx = sub_a66b6c(v4->field_18, &v1);
    if (idx)
    {
        if (v4->field_0 == idx)
            v4->field_0 = *(long long *)(idx + 72);
        v8 = *(long long *)(idx + 80);
        if (v4->field_8 == idx)
            v4->field_8 = v8;
        v9 = *(long long *)(idx + 72);
        v10 = idx + 72;
        if (v8)
            *(unsigned long long *)(v8 + 72) = v9;
        if (v9)
            *(unsigned long long *)(v9 + 80) = v8;
        v4->field_10 = v4->field_10 - 1;
        *(unsigned long long *)v10 = 0;
        *(unsigned long long *)(v10 + 8) = 0;
        sub_a66994(v4->field_18, &v0);
    }
    *(unsigned long long *)v6[2].padding_0 = 0;
    v11 = v6;
    if (v11->field_20 >> 2 & 1)
    {
        v12 = v11->field_8;
        a0->field_190 = a0->field_190 - v12;
        v13 = v11->field_20;
        if (v13 >> 3 & 1)
            (&a0->field_198)[v13 & 3] = (&a0->field_198)[v13 & 3] - v12;
    }
    v11->field_28();
}
