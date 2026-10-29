/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d374..0xc0d3d4 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d374_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_c0d374_0;


st_c0d374_0 * sub_c0d374(st_c0d374_0 *a0)
{
    unsigned long i;  // x22
    unsigned long v3;  // x21
    st_c0d374_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_10;
    v3 = a0->field_8;
    v4 = a0;
    if (v4->field_10)
    {
        do
        {
            v4 = sub_bffd28(v3);
            v3 += 144;
            i -= 1;
        } while (i);
    }
    if (!a0->field_0)
        return v4;
}
