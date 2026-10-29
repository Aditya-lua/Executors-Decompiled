/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a7248..0x1a7278 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a7248_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_1a7248_0;


st_1a7248_0 * sub_1a7248(st_1a7248_0 *a0)
{
    unsigned long long *v0;  // x9
    unsigned long v1;  // x8

    v0 = a0->field_0;
    if (a0->field_8 == *v0)
    {
        v1 = *(long long *)((char *)v0 - 8) + 4032;
        a0->field_0 = (char *)v0 - 8;
        a0->field_8 = v1 - 96;
        return a0;
    }
    a0->field_8 = a0->field_8 - 96;
    return a0;
}
