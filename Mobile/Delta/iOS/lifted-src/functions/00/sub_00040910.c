/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40910..0x40950 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40910_0 {
    char padding_0[120];
    unsigned long long field_78;
    char padding_80[16];
    unsigned long long field_90;
    unsigned long long field_98;
    char padding_a0[12];
    char field_ac;
} st_40910_0;


char sub_40910(st_40910_0 *a0)
{
    if (a0->field_ac & 1)
    {
        return 0;
    }
    else if (*(long long *)&a0->padding_0[80])
    {
        return 0;
    }
    else if (a0->field_78)
    {
        return 0;
    }
    else
    {
        return a0->field_90 == a0->field_98;
    }
}
