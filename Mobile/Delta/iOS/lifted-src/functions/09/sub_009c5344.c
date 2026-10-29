/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5344..0x9c536c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5344_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_9c5344_0;


long long sub_9c5344(st_9c5344_0 *a0)
{
    unsigned long v0;  // x0

    v0 = a0->field_0;
    if (((unsigned int)v0 | 4) == 5)
    {
        return v0;
    }
    else if (a0->field_8)
    {
        return v0;
    }
    else
    {
        return 0;
    }
}
