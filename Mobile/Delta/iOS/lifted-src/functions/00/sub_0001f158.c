/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f158..0x1f174 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f158_0 {
    uint128_t field_0;
    char field_10;
} st_1f158_0;


double sub_1f158(st_1f158_0 *a0, uint128_t *a1)
{
    unsigned long v0;  // x8
    uint128_t v1;  // q0

    v0 = a0->field_10;
    v1 = *a1;
    a0->field_0 = v1;
    if (!(v0 & 1))
        a0->field_10 = 1;
    return (unsigned long long)v1;
}
