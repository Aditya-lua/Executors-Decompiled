/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd26e4..0xd2724 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d26e4_0 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
} st_d26e4_0;


double sub_d26e4(st_d26e4_0 *a0)
{
    unsigned long long v4;  // x30
    unsigned long v5;  // d0
    uint128_t v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (!*(long long *)((char *)&a0->field_8 + 8))
        return v5;
    v1 = &v3;
    v2 = v4;
    v0 = *(int128_t *)(a0->padding_0)[1];
    sub_d50b8(&v0);
    return *(unsigned long long *)&*(int128_t *)(a0->padding_0)[1];
}
