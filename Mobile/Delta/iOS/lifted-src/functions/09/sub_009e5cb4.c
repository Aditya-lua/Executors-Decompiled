/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5cb4..0x9e5ce8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5cb4_1 {
    unsigned long long field_0;
    double field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_9e5cb4_1;

typedef struct st_9e5cb4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
} st_9e5cb4_0;


double sub_9e5cb4(st_9e5cb4_0 *a0, st_9e5cb4_1 *a1, unsigned int a2)
{
    double v0;  // d0
    unsigned int v1;  // w8
    unsigned int v2;  // w10

    a0->field_0 = a1->field_0;
    v0 = a1->field_8;
    *(double *)&a0->field_8 = v0;
    v1 = a0->field_14 & 1;
    v2 = a1->field_14;
    a0->field_10 = a1->field_10;
    a0->field_14 = v1 | a2 | v2 & 0xfffffffc | 2;
    return v0;
}
