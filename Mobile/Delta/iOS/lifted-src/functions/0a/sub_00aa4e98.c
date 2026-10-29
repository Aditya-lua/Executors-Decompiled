/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4e98..0xaa4f30 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4e98_0 {
    char padding_0[224];
    unsigned long long field_e0;
    struct st_aa4e98_1 *field_e8;
    struct st_aa4e98_1 *field_f0;
} st_aa4e98_0;

typedef struct st_aa4e98_1 {
    unsigned long long field_0;
} st_aa4e98_1;


void sub_aa4e98(st_aa4e98_0 *a0, unsigned long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x8
    unsigned long long *v17;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_e0;
    if (!v16)
        a0->field_f0();
    v17 = a0->field_e8;
    a0->padding_0[208 + v16] = 1;
    if (15 >= v16 + 1)
        _bzero(&a0->padding_0[v16 + 209], 15 - v16);
    v17();
}
