/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d9f4..0x7da2c (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d9f4_0 {
    char padding_0[140];
    struct st_7d9f4_0 *field_8c;
} st_7d9f4_0;

typedef struct st_7d9f4_1 {
    char padding_0[24];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[216];
    struct st_7d9f4_0 *field_f8;
} st_7d9f4_1;


st_7d9f4_0 * sub_7d9f4(st_7d9f4_1 *a0)
{
    if (a0->field_18 > a0->field_1c)
    {
        return 1;
    }
    else if (!a0->field_f8)
    {
        return 0;
    }
    else if (!*(int *)&(a0->field_f8->padding_0)[1])
    {
        return 2;
    }
    else
    {
        return 3;
    }
}
