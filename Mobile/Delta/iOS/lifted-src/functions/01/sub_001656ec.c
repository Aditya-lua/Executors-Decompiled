/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1656ec..0x1657bc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1656ec_0 {
    char field_0;
} st_1656ec_0;


void* sub_1656ec(void* a0, long long a1, long long a2)
{
    st_1656ec_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1656ec_0 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50], Other Possible Types: char
    uint128_t v3;  // [bp-0x50]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    *(unsigned int *)&a0[24] = 0;
    *(uint128_t *)&a0[32] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)&a0[60] = 0;
    *(unsigned long long *)&a0[64] = sub_91ed04(a2);
    *(unsigned long long *)&a0[16] = sub_8b4808(a2, a0 + 24);
    sub_61070(&v2, a1);
    v3 = *(int128_t *)a0;
    *(uint128_t *)a0 = v2;
    sub_60b78(&v3);
    return a0;
}
