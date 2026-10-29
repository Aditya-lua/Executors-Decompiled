/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24a68..0x24ae4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_24a68_1 {
    char padding_0[8];
    uint128_t field_8;
} st_24a68_1;

typedef struct st_24a68_0 {
    char field_0;
} st_24a68_0;


long long sub_24a68(unsigned long long *a0, unsigned long a1, uint128_t *a2)
{
    unsigned long long v5;  // x21
    unsigned long long v6;  // x0
    st_24a68_1 *v7;  // x0
    st_24a68_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_24a68_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = *a0;
    v6 = sub_1e8b8(v5 + 0x200, &v2);
    if (!v6)
    {
        sub_1e44c(v5 + 0x200, &v2);
        v7 = sub_104ac(v5 + 0x200, &v2);
        *(uint128_t *)(v7->padding_0)[1] = *a2;
    }
    return !v6;
}
