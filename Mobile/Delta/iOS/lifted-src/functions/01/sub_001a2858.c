/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2858..0x1a296c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2858_1 {
    struct st_1a2858_2 *field_0;
} st_1a2858_1;

typedef struct st_1a2858_2 {
    struct st_1a2858_1 *field_0;
} st_1a2858_2;

typedef struct st_1a2858_0 {
    char field_0;
} st_1a2858_0;


char * sub_1a2858(unsigned long long a0)
{
    unsigned long long v8;  // x20
    unsigned long long *v9;  // x8
    unsigned long long i;  // x20
    long long v11;  // x21
    long long v12;  // x0
    long long v13;  // x22
    st_1a2858_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1a2858_0 *v1;  // [bp-0x88]
    char v2;  // [bp-0x80]
    st_1a2858_2 **v3;  // [bp-0x68]
    st_1a2858_2 **v4;  // [bp-0x60]
    char v5;  // [bp-0x51]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a0;
    v1 = &v0;
    v0 = &v1;
    v9[1] = 0;
    v9[2] = 0;
    *v9 = 0;
    do
    {
        i = v8;
        v3 = &v4;
        v4 = &v3;
        v11 = sub_6b08(v9);
        sub_64128(&v2, v11 + 1, &v5);
        v12 = sub_a0c8(&v2);
        v5 = *(char *)((i & 15) + 0xc7fcaf);
        sub_348a4(v12, 1, &v5);
        v13 = v12 + 1;
        sub_12478(v13, sub_a0c8(v9), v11);
        v5 = 0;
        sub_348a4(v13 + v11, 1, &v5);
        sub_5ccc(v9, &v2);
        v8 = i >> 4;
    } while (16 <= i);
    return &v2;
}
