/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a9004..0x1a917c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a9004_5 {
    char padding_0[16];
    struct st_1a9004_1 *field_10;
} st_1a9004_5;

typedef struct st_1a9004_1 {
    struct st_1a9004_0 *field_0;
} st_1a9004_1;

typedef struct st_1a9004_0 {
    char field_0;
} st_1a9004_0;


char * sub_1a9004(st_1a9004_5 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v7;  // x8
    st_1a9004_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1a9004_0 *v1;  // [bp-0x70]
    st_1a9004_0 *v2;  // [bp-0x68], Other Possible Types: st_1a9004_1 **
    char v3;  // [bp-0x50]
    st_1a9004_0 **v4;  // [bp-0x38], Other Possible Types: st_1a9004_1 **, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    sub_181f0(&v3);
    memset(v7, 0, 24);
    v2 = &v4;
    v4 = &v2;
    if (sub_6b08(&v3))
    {
        std::__1::__get_collation_name(sub_a0c8(&v3));
        sub_5ccc(v7, &v2);
        v2 = &v4;
        v4 = &v2;
        if (!sub_6b08(v7) && 2 >= sub_6b08(&v3))
        {
            sub_a0c8(&v3);
            sub_a0c8(&v3);
            sub_6b08(&v3);
            (*(long long *)(*(long long *)a0->field_10 + 32))();
        }
    }
    return &v3;
}
