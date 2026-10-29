/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6c64..0x9e6cc0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6c64_0 {
    char padding_0[96];
    char field_60;
} st_9e6c64_0;


st_9e6c64_0 * sub_9e6c64(st_9e6c64_0 *a0)
{
    st_9e6c64_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    sub_9e4838(&a0->padding_0[8]);
    sub_9e4838(&a0->padding_0[32]);
    v2 = sub_9e4838(&a0->padding_0[56]);
    if (!(a0->field_60 & 1))
        return v2;
}
