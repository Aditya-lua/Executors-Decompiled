/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3a14..0x1f3a30 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3a14_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned int field_10;
} st_1f3a14_0;


long long sub_1f3a14(st_1f3a14_0 *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 24;
    v1 = 32;
    if (!a0->field_10)
        v0 = v1;
    return *(long long *)((char *)a0 + v0);
}
