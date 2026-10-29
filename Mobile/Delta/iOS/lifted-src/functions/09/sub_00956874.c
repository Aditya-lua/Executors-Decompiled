/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956874..0x9568a0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956874_0 {
    unsigned long long field_0;
    char padding_8[104];
    unsigned long long field_70;
    char padding_78[340];
    unsigned long long field_1cc;
} st_956874_0;


unsigned long long sub_956874(st_956874_0 *a0)
{
    unsigned long long v0;  // x0
    unsigned long long v1;  // x0

    v0 = a0;
    if (v0)
    {
        if ((int)a0->field_0)
            return 0;
        v1 = 1;
        v0 = 1;
        if (a0->field_70)
        {
            *(unsigned int *)&(a0->padding_78)[1] = 1;
            v0 = v1;
        }
    }
    return (unsigned int)v0;
}
