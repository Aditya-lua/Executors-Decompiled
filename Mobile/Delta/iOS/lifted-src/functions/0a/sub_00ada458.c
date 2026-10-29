/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xada458..0xada474 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ada458_0 {
    unsigned int field_0;
    char padding_4[36];
    unsigned long long field_28;
} st_ada458_0;


long long sub_ada458(st_ada458_0 *a0)
{
    if (a0->field_0 != 3)
        return 0;
    return a0->field_28;
}
