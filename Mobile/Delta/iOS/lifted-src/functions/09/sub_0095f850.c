/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f850..0x95f8bc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95f850_0 {
    unsigned int field_0;
    char padding_4[76];
    struct st_95f850_0 *field_50;
} st_95f850_0;


st_95f850_0 * sub_95f850(st_95f850_0 *a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = a0->field_0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            v3 = 0;
        else
            v3 = sub_980dc8();
        a0 = v3;
        if (!a0)
            return 0;
    }
    return a0->field_50;
}
