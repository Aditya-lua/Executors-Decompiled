/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ecc8..0x98ed44 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ecc8_0 {
    struct st_98ecc8_1 *field_0;
    unsigned long long field_8;
} st_98ecc8_0;

typedef struct st_98ecc8_1 {
    char field_0;
} st_98ecc8_1;


unsigned long long sub_98ecc8(st_98ecc8_0 *a0, unsigned long long *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x19
    unsigned long long v13;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (v12 <= a0->field_8)
    {
        *a1 = sub_a7b0d8(a0->field_0);
        v13 = a0->field_8 - v12;
        a0->field_0 = &a0->field_0[v12];
        a0->field_8 = v13;
        return 1;
    }
    return 0;
}
