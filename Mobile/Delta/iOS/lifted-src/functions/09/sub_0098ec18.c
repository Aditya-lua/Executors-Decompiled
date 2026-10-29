/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ec18..0x98ecc8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ec18_0 {
    struct st_98ec18_1 *field_0;
    struct st_98ec18_2 *field_8;
} st_98ec18_0;

typedef struct st_98ec18_2 {
    unsigned int field_0;
} st_98ec18_2;

typedef struct st_98ec18_1 {
    char field_0;
} st_98ec18_1;


unsigned int * sub_98ec18(st_98ec18_0 *a0, unsigned long long *a1, unsigned int *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int *v12;  // x19
    unsigned long long v13;  // x0
    unsigned int *v14;  // x9
    unsigned int *v15;  // x10
    unsigned int *v16;  // x11
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
    if (v12 > a0->field_8)
        return 0;
    v13 = sub_a7b0d8(a0->field_0);
    *a1 = v13;
    if (!a2)
        return 1;
    v14 = 1;
    v15 = 2;
    v16 = 4;
    if (v13 > 0x3fffffff)
        v16 = ((v13 <= 0x3fffffffffffffff) * 8 | (char)(v13 <= 0x3fffffffffffffff) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    if (v13 >= 0x4000)
        v15 = v16;
    if (v13 >= 64)
        v14 = v15;
    *a2 = v14 == v12;
    return 1;
}
