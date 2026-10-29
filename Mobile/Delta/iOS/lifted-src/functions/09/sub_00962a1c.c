/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962a1c..0x962a34 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962a1c_0 {
    struct st_962a1c_0 *field_0;
    char padding_8[124];
    unsigned int field_84;
} st_962a1c_0;


st_962a1c_0 * sub_962a1c(st_962a1c_0 *a0, unsigned int a1)
{
    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_0)
    {
        return a0;
    }
    else
    {
        a0->field_84 = a1;
        return a0;
    }
}
