/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e989c..0x9e98ec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e989c_0 {
    char padding_0[56];
    char field_38;
} st_9e989c_0;


st_9e989c_0 * sub_9e989c(st_9e989c_0 *a0)
{
    st_9e989c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    sub_9e48d4();
    v2 = sub_9e48d4(&a0->padding_0[24]);
    if (!(a0->field_38 & 1))
        return v2;
}
