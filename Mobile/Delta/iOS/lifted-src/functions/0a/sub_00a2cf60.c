/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2cf60..0xa2cf88 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2cf60_0 {
    char padding_0[36];
    unsigned int field_24;
    unsigned int field_28;
} st_a2cf60_0;


unsigned long long sub_a2cf60(st_a2cf60_0 **a0, st_a2cf60_0 **a1)
{
    unsigned long v0;  // x10
    unsigned long v1;  // x11
    unsigned long long v2;  // x0

    v0 = *a0->field_28;
    v1 = *a1->field_28;
    v2 = v0 - v1;
    if ((unsigned int)v0 == (unsigned int)v1)
        v2 = *a0->field_24 - *a1->field_24;
    return v2;
}
