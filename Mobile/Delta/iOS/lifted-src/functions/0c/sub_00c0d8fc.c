/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0d8fc..0xc0d938 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0d8fc_0 {
    unsigned long long field_0;
    struct st_c0d8fc_1 *field_8;
    unsigned long long field_10;
    char field_18;
} st_c0d8fc_0;

typedef struct st_c0d8fc_1 {
    char field_0;
} st_c0d8fc_1;


st_c0d8fc_0 * sub_c0d8fc(st_c0d8fc_0 *a0, char *a1, unsigned long a2)
{
    char v0;  // x8

    if (!a2)
    {
        a0->field_0 = 1;
        a0->field_8 = a1;
        a0->field_10 = 0;
        a0->field_18 = 23;
        return a0;
    }
    v0 = *a1;
    a0->field_0 = 3;
    a0->field_8 = a1 + 1;
    a0->field_10 = a2 - 1;
    a0->field_18 = v0;
    return a0;
}
