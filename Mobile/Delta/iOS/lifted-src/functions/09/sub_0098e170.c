/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e170..0x98e19c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e170_0 {
    char padding_0[128];
    struct st_98e170_0 *field_80;
    struct st_98e170_0 *field_88;
} st_98e170_0;

typedef struct st_98e170_1 {
    struct st_98e170_0 *field_0;
    struct st_98e170_0 *field_8;
    unsigned long long field_10;
} st_98e170_1;


st_98e170_1 * sub_98e170(st_98e170_1 *a0, st_98e170_0 *a1)
{
    st_98e170_0 *v0;  // x8
    unsigned long long v1;  // x9

    v0 = a0->field_8;
    v1 = a0->field_10;
    a1->field_80 = v0;
    a1->field_88 = 0;
    a0->field_8 = a1;
    a0->field_10 = v1 - 1;
    if (v0)
        v0->field_88 = a1;
    if (!a0->field_0)
    {
        a0->field_0 = a1;
        return a0;
    }
    return a0;
}
