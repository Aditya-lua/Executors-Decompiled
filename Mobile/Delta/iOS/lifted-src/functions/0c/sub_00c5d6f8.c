/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5d6f8..0xc5d794 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5d6f8_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c5d6f8_0;


unsigned long long sub_c5d6f8(long long *a0, unsigned long long a1, st_c5d6f8_0 *a2)
{
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x40]
    uint128_t v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = a1;
    v1 = a2->field_0;
    v2 = a2->field_10;
    v5 = sub_c5d7b8();
    if (*a0 < 1)
        return v5;
    _free(a0[1]);
    return v5;
}
