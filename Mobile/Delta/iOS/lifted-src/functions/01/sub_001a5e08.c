/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5e08..0x1a5ea0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5e08_0 {
    char field_0;
} st_1a5e08_0;

typedef struct st_1a5e08_1 {
    char padding_0[8];
    unsigned int field_8;
} st_1a5e08_1;


unsigned long long sub_1a5e08(st_1a5e08_1 *a0, unsigned long a1, unsigned long a2)
{
    st_1a5e08_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1a5e08_0 *v1;  // [bp-0x78]
    char *v2;  // [bp-0x70]
    char *v3;  // [bp-0x68]
    char *v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned int v6;  // [bp-0x4c]
    unsigned long v7;  // [bp-0x48]
    unsigned long v8;  // [bp-0x40]
    unsigned int v9;  // [bp-0x34]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    if (!sub_1a6f3c())
        return 0xffffffffffffffff;
    v9 = a0->field_8;
    v8 = a1;
    v7 = a2;
    v6 = 0;
    v2 = &v9;
    v3 = &v8;
    v4 = &v7;
    v5 = &v6;
    return sub_1b6994(&v2);
}
