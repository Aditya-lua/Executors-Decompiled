/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f7a4..0xa3f7f0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f7a4_0 {
    unsigned long long field_0;
    char padding_8[168];
    struct st_a3f7a4_0 *field_b0;
} st_a3f7a4_0;


st_a3f7a4_0 * sub_a3f7a4(st_a3f7a4_0 **a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[7])
    {
        if (!a0[1])
        {
            sub_c67268();
            return 0;
        }
        else if (a0[1]->field_b0)
        {
            a0[1]->field_b0();
        }
        else
        {
            a0[7] = 0;
        }
    }
    return 1;
}
