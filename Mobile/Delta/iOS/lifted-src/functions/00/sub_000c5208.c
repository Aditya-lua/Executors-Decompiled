/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5208..0xc52e8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5208_0 {
    char field_0;
} st_c5208_0;


long long sub_c5208(long long idx)
{
    long long v9;  // x0
    st_c5208_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_c5208_0 *v1;  // [bp-0x68]
    st_c5208_0 *v2;  // [bp-0x60], Other Possible Types: uint128_t
    unsigned long long v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x30]
    st_c5208_0 **v6;  // [bp-0x28], Other Possible Types: char
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if (!idx)
    {
        return idx;
    }
    else if (*(long long *)(idx + 30168))
    {
        return -0x40;
    }
    else
    {
        v4 = *(int128_t *)(idx + 30128);
        v5 = *(long long *)(idx + 30144);
        v2 = &v6;
        v6 = &v2;
        sub_c4b20(*(long long *)(idx + 30184));
        *(unsigned int *)(idx + 0x7600) = 0;
        *(uint128_t *)(idx + 30184) = 0;
        sub_80164(*(long long *)(idx + 30240), &v4);
        v9 = idx;
        *(unsigned long long *)(idx + 30240) = 0;
        if (*(long long *)(idx + 30216))
        {
            v2 = v4;
            v3 = v5;
            sub_c4c48(*(long long *)(idx + 30216), &v2);
            v9 = idx;
            *(unsigned long long *)(idx + 30216) = 0;
        }
        sub_80164(v9, &v4);
        return 0;
    }
}
