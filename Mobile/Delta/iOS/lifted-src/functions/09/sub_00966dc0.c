/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966dc0..0x966df0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966dc0_0 {
    char padding_0[592];
    unsigned long long field_250;
    char padding_258[88];
    unsigned int field_2b0;
    char padding_2b4[124];
    unsigned long long field_330;
} st_966dc0_0;


long long sub_966dc0(st_966dc0_0 *a0)
{
    if (a0->field_2b0)
    {
        return 0;
    }
    else if (a0->field_250)
    {
        return 1;
    }
    else
    {
        return a0->field_330 != 0;
    }
}
