/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ae30..0xa9ae64 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9ae30_0 {
    char padding_0[20];
    int field_14;
} st_a9ae30_0;


long long sub_a9ae30(st_a9ae30_0 *a0, st_a9ae30_0 *a1)
{
    unsigned long v0;  // x2
    unsigned long v1;  // x8

    v0 = a0->field_14;
    v1 = a1->field_14;
    if ((unsigned int)v0 != (unsigned int)v1)
    {
        return v0 - v1;
    }
    else if (!(unsigned int)v0)
    {
        return 0;
    }
}
