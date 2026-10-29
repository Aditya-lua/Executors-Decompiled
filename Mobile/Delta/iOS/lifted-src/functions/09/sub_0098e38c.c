/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e38c..0x98e3d4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e38c_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_98e38c_0;


unsigned long long sub_98e38c(st_98e38c_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x8
    unsigned long long *v1;  // x9
    unsigned long long v2;  // x8

    v0 = a0->field_8;
    if (!a0->field_8)
        return 0;
    v1 = a0->field_0 + 1;
    while (1)
    {
        v2 = v0;
        if (a1 >= (unsigned long long)*(long long *)((char *)v1 - 8) && *v1 >= a1)
            return 1;
        v1 += 2;
        v0 = v2 - 1;
        if (v2 == 1)
            return 0;
    }
}
