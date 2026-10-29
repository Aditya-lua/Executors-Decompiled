/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa95d28..0xa95e44 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a95d28_0 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[296];
    struct st_a95d28_1 *field_168;
    struct st_a95d28_1 *field_170;
    unsigned int field_178;
    unsigned int field_17c;
} st_a95d28_0;

typedef struct st_a95d28_1 {
    unsigned long long field_0;
} st_a95d28_1;


void sub_a95d28(st_a95d28_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long long v21;  // x25
    unsigned long v22;  // x8
    unsigned long long v23;  // x9
    unsigned long long v24;  // x10
    unsigned long long *v25;  // x11
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long v20;  // x8
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a0->field_178;
    if ((unsigned int)v20)
    {
        v21 = (unsigned int)v20 + 15 & 0xfffffff0;
        _bzero(&a0[1].padding_0[16 + v20], v21 - v20);
        if ((unsigned int)v21 == 48)
            a0->field_168();
        v22 = v21 & 0xffffffff;
    }
    else if (a0->field_17c)
    {
        a0->field_170();
    }
    else
    {
        v22 = 0;
    }
    v23 = __builtin_bswap64(a0->field_30 * 8);
    v24 = __builtin_bswap64(a0->field_38 * 8);
    v25 = &a0[1].padding_0[16 + v22];
    *v25 = v23;
    v25[1] = v24;
    a0->field_168();
}
