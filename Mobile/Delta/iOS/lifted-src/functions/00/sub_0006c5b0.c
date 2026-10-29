/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6c5b0..0x6c5f4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6c5b0_0 {
    char padding_0[40];
    long long field_28;
} st_6c5b0_0;


st_6c5b0_0 * sub_6c5b0(st_6c5b0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_62aa0(&a0->padding_0[32], a0->field_28);
    return a0;
}
