/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26c80..0xb26cb0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b26c80_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_b26c80_0;


long long sub_b26c80(st_b26c80_0 *a0)
{
    unsigned long long *iter;  // x8
    unsigned int i;  // w9

    iter = &a0->field_8;
    i = *(int *)((char *)iter - 8);
    if (!*(int *)((char *)iter - 8))
        return 0;
    while (i != 42)
    {
        iter += 2;
        i = *(int *)((char *)iter - 8);
        if (!*(int *)((char *)iter - 8))
            return 0;
    }
    return *iter;
}
