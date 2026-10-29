/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xefa18..0xefa3c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_efa18_0 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[112];
    unsigned int field_98;
} st_efa18_0;


unsigned long long sub_efa18(st_efa18_0 *a0, unsigned long long a1)
{
    if (a1 >> 31 & 1)
    {
        return 0;
    }
    else if ((int)a1 > (int)a0->field_98)
    {
        return 0;
    }
    else
    {
        return a0->field_20 + (a1 & 0xffffffff) * 16;
    }
}
