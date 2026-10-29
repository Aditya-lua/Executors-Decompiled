/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x47e14..0x47e48 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_47e14_0 {
    char padding_0[152];
    struct st_47e14_0 *field_98;
} st_47e14_0;

typedef struct st_47e14_1 {
    char padding_0[1560];
    struct st_47e14_0 *field_618;
    struct st_47e14_0 *field_620;
    char padding_628[80];
    unsigned long long field_678;
    unsigned long long field_680;
} st_47e14_1;


st_47e14_0 * sub_47e14(st_47e14_1 *a0)
{
    if (!a0->field_618)
    {
        return 0;
    }
    else if (a0->field_618->field_98)
    {
        return 0;
    }
    else if (a0->field_620)
    {
        return 0;
    }
    else
    {
        return a0->field_678 == a0->field_680;
    }
}
