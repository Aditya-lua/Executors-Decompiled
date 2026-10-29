/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5ccc..0x5d40 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5ccc_0 {
    char field_0;
} st_5ccc_0;


double sub_5ccc(void* a0, void* a1)
{
    uint128_t v4;  // q0
    st_5ccc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_5ccc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((char)a0[23] < 0)
        sub_4e14(*(long long *)a0, (long long)a0[16] & 0x7fffffffffffffff, 1);
    sub_6b08(a1);
    v4 = *(int128_t *)a1;
    *(long long *)&a0[16] = (long long)a1[16];
    *(uint128_t *)a0 = v4;
    *(char *)&a1[23] = 0;
    *(char *)a1 = 0;
    return *(unsigned long long *)&v4;
}
