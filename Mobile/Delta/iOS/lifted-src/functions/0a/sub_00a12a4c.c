/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12a4c..0xa12ab0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12a4c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a12a4c_0;


unsigned long long sub_a12a4c(st_a12a4c_0 *a0, st_a12a4c_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(a0->field_10, a1->field_10);
    if (!v2)
        return v2;
    v3 = sub_9e4c34(a0->field_18, a1->field_18);
    if (!v3)
        return v3;
    v4 = sub_9e4c34(a0->field_20, a1->field_20);
    if (!v4)
        return v4;
    a0->field_28 = a1->field_28;
    a0->field_8 = a1->field_8;
    return 1;
}
