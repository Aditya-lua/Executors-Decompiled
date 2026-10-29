/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c62c..0xa2c654 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c62c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a2c62c_0;


st_a2c62c_0 * sub_a2c62c(st_a2c62c_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66a20();
        return 0;
    }
    a0->field_8 = a1;
    return 1;
}
