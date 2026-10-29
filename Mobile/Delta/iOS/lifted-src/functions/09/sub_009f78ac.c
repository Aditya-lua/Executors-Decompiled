/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f78ac..0x9f78f0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f78ac_0 {
    unsigned int field_0;
    char padding_4[60];
    char field_40;
    char field_41;
    char padding_42[6];
    unsigned long long field_48;
    unsigned long long field_50;
} st_9f78ac_0;


long long sub_9f78ac(st_9f78ac_0 *a0)
{
    if (a0->field_0)
    {
        return 0;
    }
    else if (a0->field_40 != 4)
    {
        return 0;
    }
    else if ((a0->field_41 & 253) != 1)
    {
        return 0;
    }
    else if (a0->field_48)
    {
        return a0->field_50 != 0;
    }
    else
    {
        return 0;
    }
}
