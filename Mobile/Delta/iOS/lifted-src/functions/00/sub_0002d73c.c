/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d73c..0x2d798 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d73c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_2d73c_0;


long long sub_2d73c(st_2d73c_0 *a0, st_2d73c_0 *a1)
{
    if (a0->field_0 != a1->field_0)
    {
        return 0;
    }
    else if (a0->field_8 != a1->field_8)
    {
        return 0;
    }
    else if (a0->field_10 != a1->field_10)
    {
        return 0;
    }
    else if (a0->field_18 == a1->field_18)
    {
        return a0->field_20 == a1->field_20;
    }
    else
    {
        return 0;
    }
}
