/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a988..0x3a9b4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a988_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
} st_3a988_0;


long long sub_3a988(st_3a988_0 *a0)
{
    if (a0->field_0 == 1)
    {
        return 0;
    }
    else if (a0->field_0 == 2)
    {
        return a0->field_8;
    }
    else
    {
        return 1;
    }
}
