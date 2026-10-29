/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5520..0x9c554c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5520_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9c5520_0 *field_8;
} st_9c5520_0;


st_9c5520_0 * sub_9c5520(unsigned long a0, st_9c5520_0 *a1)
{
    if (!a1)
    {
        return 0;
    }
    else if (a1->field_0 != 16)
    {
        return 0;
    }
    else if (!a1->field_8)
    {
        return 0;
    }
}
