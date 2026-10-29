/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1386c..0xc138a4 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1386c_0 {
    unsigned long long field_0;
    struct st_c1386c_1 *field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_c1386c_0;

typedef struct st_c1386c_1 {
    unsigned int field_0;
} st_c1386c_1;


st_c1386c_0 * sub_c1386c(st_c1386c_0 *a0, unsigned int *a1, unsigned long a2)
{
    unsigned int v0;  // w9

    if (4 <= a2)
    {
        v0 = *a1;
        a0->field_8 = a1 + 1;
        a0->field_10 = a2 - 4;
        a0->field_18 = v0;
        a0->field_0 = 3;
        return a0;
    }
    a0->field_0 = 1;
    a0->field_8 = a1;
    a0->field_10 = a2;
    a0->field_18 = 23;
    return a0;
}
