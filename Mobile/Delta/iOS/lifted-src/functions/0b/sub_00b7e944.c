/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7e944..0xb7ea10 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7e944_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
} st_b7e944_0;


unsigned long long * sub_b7e944(unsigned long long *a0, st_b7e944_0 *a1)
{
    unsigned long long v12;  // x9
    unsigned long long v13;  // 4154
    unsigned long v14;  // x20
    unsigned long v15;  // x10
    char v0;  // [bp-0x80], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x60]
    unsigned long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a1->field_0 ^ 0x8000000000000000;
    v13 = arm64g_calculate_condition(0x44, a1->field_0, 0, 0);
    if (!(v13 & 1))
        v12 = 1;
    if (v12 && v12 != 1)
    {
        sub_b82a08(&v0, a1->field_8);
        v14 = v2;
        sub_b82a08(&v0, a1->field_10);
        v15 = v2;
        v1 = v14;
        v2 = v14;
        v3 = v0;
        v5 = v14 + v4 * 8;
        v6 = v15;
        v7 = v15;
        v8 = v0;
        v9 = v15 + v4 * 8;
        return sub_b77430(a0, &v1);
    }
    *a0 = 0;
    a0[1] = 8;
    a0[2] = 0;
    return a0;
}
