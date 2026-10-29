/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8c70..0x1a8d98 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a8c70_1 {
    long long field_0;
    char padding_8[80];
    char field_58;
} st_1a8c70_1;

typedef struct st_1a8c70_0 {
    char field_0;
} st_1a8c70_0;


int sub_1a8c70(long long a0, long long a1, st_1a8c70_1 *a2, long long a3, unsigned int a4)
{
    unsigned int v18;  // w0
    st_1a8c70_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_1a8c70_0 *v1;  // [bp-0xd8]
    st_1a8c70_0 **v2;  // [bp-0xd0], Other Possible Types: char
    st_1a8c70_0 *v3;  // [bp-0xc8]
    uint128_t v4;  // [bp-0xc0]
    uint128_t v5;  // [bp-0xb0]
    uint128_t v6;  // [bp-0xa7]
    unsigned long v7;  // [bp-0x90]
    unsigned long v8;  // [bp-0x88]
    char v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x78]
    unsigned long v11;  // [bp-0x70]
    char v12;  // [bp-0x68]
    char v13;  // [bp-0x60]
    unsigned long v14;  // [bp-0x58]
    char *v15;  // [bp-0x48]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v18 = sub_1ac850(a3, a0, a1, &v4, a4 | 4160);
    sub_1b44f8(a2, a0, a1, &v4, __ROL__(a4, 21) & 0xffe00001 & 1);
    v15 = &v4;
    sub_127c0(&v15);
    if (!v18)
    {
        return 0;
    }
    else if (a2->field_58 == 1)
    {
        sub_c84c(a2, a2->field_0);
        return 0;
    }
    else
    {
        return 1;
    }
}
