/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8bf4..0xab8c18 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8bf4_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_ab8bf4_0;


double sub_ab8bf4(st_ab8bf4_0 *a0)
{
    unsigned long long v0;  // d0

    if (a0)
    {
        a0->field_10 = 1;
        v0 = 3912715206720;
        a0->field_0 = 0x14000000400000038f00000040;
    }
    return v0;
}
