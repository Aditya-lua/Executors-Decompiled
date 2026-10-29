/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa27188..0xa271e4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a27188_0 {
    char padding_0[64];
    long long field_40;
    char padding_48[24];
    long long field_60;
    long long field_68;
    unsigned int field_70;
} st_a27188_0;


unsigned long long sub_a27188(st_a27188_0 *a0, st_a27188_0 *a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4c34(a0->field_40, a1->field_40);
    if (!v2)
        return v2;
    v3 = sub_9e4c34(a0->field_60, a1->field_60);
    if (!v3)
        return v3;
    v4 = sub_9e4c34(a0->field_68, a1->field_68);
    if (!v4)
        return v4;
    a0->field_70 = a1->field_70;
    return 1;
}
