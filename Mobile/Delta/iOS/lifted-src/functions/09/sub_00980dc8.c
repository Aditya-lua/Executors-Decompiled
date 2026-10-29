/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980dc8..0x980df4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980dc8_1 {
    unsigned int field_0;
    char padding_4[116];
    struct st_980dc8_0 *field_78;
} st_980dc8_1;

typedef struct st_980dc8_0 {
    struct st_980dc8_0 *field_0;
} st_980dc8_0;


st_980dc8_0 ** sub_980dc8(st_980dc8_1 *a0)
{
    st_980dc8_0 **v0;  // x8

    if (a0->field_0 != 128)
        return 0;
    v0 = a0->field_78;
    if (!v0)
    {
        return 0;
    }
    else if (!*(int *)v0)
    {
        return v0;
    }
    else
    {
        return 0;
    }
}
