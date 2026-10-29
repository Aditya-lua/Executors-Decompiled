/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3130c..0xa313bc (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3130c_0 {
    struct st_a3130c_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_a3130c_0;

typedef struct st_a3130c_1 {
    char padding_0[96];
    long long field_60;
    long long field_68;
} st_a3130c_1;

extern long long g_a3140c;

unsigned long long sub_a3130c(long long a0, st_a3130c_0 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned int v19;  // w8
    unsigned long v20;  // x8
    unsigned long long v21;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x0
    long long *v17;  // x23
    unsigned long long v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (a1->field_18)
        return a1->field_18;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = sub_a2d030(a0);
    v17 = a1->field_0;
    v18 = sub_975ff4(v17[12]);
    if (v18 != sub_a3032c(v16))
    {
        v19 = a1->field_8;
        a1->field_10 = a0;
        if (!sub_a55c1c(v17[12], v17[13], __ROL__(v19, 1) & 2 & 3 | v19, &g_a3140c, a1))
            return 0;
        v20 = &a1->field_20;
    }
    else
    {
        v20 = v17 + 13;
    }
    v21 = *(long long *)v20;
    a1->field_18 = v21;
    return v21;
}
