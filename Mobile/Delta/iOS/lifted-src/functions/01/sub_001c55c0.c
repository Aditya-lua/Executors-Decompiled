/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c55c0..0x1c56cc (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c55c0_0 {
    char field_0;
} st_1c55c0_0;


void* sub_1c55c0(void* a0, long long a1, long long a2, long long a3, unsigned int a4)
{
    st_1c55c0_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_1c55c0_0 *v1;  // [bp-0xc8]
    uint128_t v2;  // [bp-0xc0]
    uint128_t v3;  // [bp-0xb0]
    uint128_t v4;  // [bp-0xa7]
    unsigned long v5;  // [bp-0x90]
    unsigned long v6;  // [bp-0x88]
    char v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x78]
    unsigned long v9;  // [bp-0x70]
    char v10;  // [bp-0x68]
    char v11;  // [bp-0x60]
    unsigned long v12;  // [bp-0x58]
    char *v13;  // [bp-0x48]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    *(long long *)a0 = a1;
    *(long long *)&a0[8] = a2;
    *(long long *)&a0[16] = a3;
    *(unsigned int *)&a0[24] = a4;
    *(uint128_t *)&a0[32] = 0;
    *(unsigned long long *)&a0[80] = 0;
    *(unsigned long long *)&a0[88] = 0;
    *(char *)&a0[96] = 0;
    *(unsigned long long *)&a0[104] = 0;
    *(unsigned long long *)&a0[112] = 0;
    *(char *)&a0[120] = 0;
    *(char *)&a0[128] = 0;
    *(unsigned long long *)&a0[0x88] = 0;
    *(uint128_t *)&a0[48] = 0;
    *(uint128_t *)&a0[57] = 0;
    v1 = &v0;
    v0 = &v1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    sub_1ac850(a3);
    sub_1b44f8(a0 + 32, a1, a2, &v2, __ROL__(a4, 21) & 0xffe00001 & 1);
    v13 = &v2;
    sub_127c0(&v13);
    return a0;
}
