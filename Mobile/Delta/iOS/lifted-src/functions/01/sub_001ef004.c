/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef004..0x1ef050 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef004_1 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[12];
    unsigned int field_14;
} st_1ef004_1;

typedef struct st_1ef004_0 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[12];
    unsigned int field_14;
} st_1ef004_0;


unsigned int sub_1ef004(st_1ef004_0 *a0, st_1ef004_1 *a1)
{
    if (a0->field_0 != a1->padding_0)
    {
        return 0;
    }
    else if (a0->field_4 != a1->field_4)
    {
        return 0;
    }
    else if (a0->field_0)
    {
        return 1;
    }
    else
    {
        return !((a1->field_14 ^ a0->field_14) & 2);
    }
}
