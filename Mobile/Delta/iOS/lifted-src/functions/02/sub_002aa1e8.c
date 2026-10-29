/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa1e8..0x2aa29c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa1e8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_2aa1e8_1;

typedef struct st_2aa1e8_0 {
    char field_0;
} st_2aa1e8_0;

typedef struct st_2aa1e8_2 {
    unsigned long long field_0;
    unsigned int field_8;
} st_2aa1e8_2;


long long sub_2aa1e8(st_2aa1e8_1 *a0, st_2aa1e8_2 *a1, st_2aa1e8_2 *a2, unsigned long a3)
{
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long idx;  // x9
    st_2aa1e8_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_2aa1e8_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned int v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x58]
    unsigned int v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x48]
    unsigned int v7;  // [bp-0x40]
    char v8;  // [bp-0x31]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = a0->field_8;
    v12 = v11 + a3;
    a0->field_8 = v12;
    if (!v11 || (v12 - 1 ^ v11 - 1) >= 64)
    {
        if (v12 < 65)
            idx = 0;
        else
            idx = v12 - 1 >> 6;
        *(unsigned long long *)(a0->field_0 + idx * 8) = 0;
    }
    v6 = a1->field_0;
    v7 = a1->field_8;
    v4 = a2->field_0;
    v5 = a2->field_8;
    v2 = a0->field_0 + (v11 >> 6) * 8;
    v3 = (unsigned int)v11 & 63;
    return sub_2a9f58(&v8, &v6, &v4, &v2);
}
