/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b0298..0x1b0320 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b0298_0 {
    char field_0;
} st_1b0298_0;


double sub_1b0298(void* a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    uint128_t v4;  // q0
    st_1b0298_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b0298_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long *)&a0[24] = a3;
    *(unsigned long *)&a0[32] = a3;
    *(char *)&a0[40] = 0;
    sub_1a7d34();
    *(unsigned long *)&a0[48] = a2;
    *(unsigned long *)&a0[56] = a2;
    *(char *)&a0[64] = 0;
    v4 = (int128_t)a0[24];
    *(uint128_t *)&a0[72] = v4;
    *(char *)&a0[88] = (char)a0[40];
    if (!(a4 & 1))
        *(unsigned long *)&a0[104] = a2;
    *(char *)&a0[96] = 1;
    return *(unsigned long long *)&v4;
}
