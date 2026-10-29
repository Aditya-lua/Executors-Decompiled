/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7814..0x9f7850 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7814_0 {
    unsigned int field_0;
    char padding_4[60];
    char field_40;
    char field_41;
} st_9f7814_0;


unsigned int sub_9f7814(st_9f7814_0 *a0)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9

    if (a0->field_0)
    {
        return 0;
    }
    else if (a0->field_40 == 4)
    {
        v0 = a0->field_41;
        if (v0 == 1)
            v1 = 668;
        else
            v1 = 0;
        if (v0 != 3)
            return v1;
        return 794;
    }
    else
    {
        return 0;
    }
}
