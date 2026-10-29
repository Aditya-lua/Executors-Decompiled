/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c53f0..0x9c5460 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c53f0_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned int field_8;
} st_9c53f0_0;


st_9c53f0_0 * sub_9c53f0(st_9c53f0_0 *a0, st_9c53f0_0 *a1)
{
    unsigned int v0;  // w8

    if (!a0)
    {
        return 0xffffffff;
    }
    else if (a1)
    {
        v0 = a0->field_0;
        if (v0 != a1->field_0)
            return 0xffffffff;
        switch (v0)
        {
        case 1:
            return a0->field_8 - a1->field_8;
        case 5:
            return 0;
        default:
            break;
        }
    }
    else
    {
        return 0xffffffff;
    }
}
