/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x637b8..0x637d4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_637b8_0 {
    struct st_637b8_0 *field_0;
    struct st_637b8_0 *field_8;
} st_637b8_0;


st_637b8_0 * sub_637b8(st_637b8_0 *a0)
{
    st_637b8_0 *v0;  // x8

    while (1)
    {
        v0 = a0;
        a0 = v0->field_0;
        if (v0->field_0)
            continue;
        a0 = v0->field_8;
        if (!v0->field_8)
            break;
    }
    return v0;
}
