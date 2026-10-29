/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2cfe4..0xa2d00c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2cfe4_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_a2cfe4_0;


st_a2cfe4_0 * sub_a2cfe4(st_a2cfe4_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66b40();
        return 0;
    }
    a0->field_28 = a1;
    return 1;
}
