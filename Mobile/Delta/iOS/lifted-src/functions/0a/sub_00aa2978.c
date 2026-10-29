/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa2978..0xaa29e4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa2978_0 {
    char padding_0[24];
    long long field_18;
    struct st_aa2978_1 *field_20;
} st_aa2978_0;

typedef struct st_aa2978_1 {
    unsigned int field_0;
} st_aa2978_1;


unsigned int * sub_aa2978(st_aa2978_0 *a0)
{
    unsigned long v2;  // x8
    unsigned int *v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0->field_18) == 21)
    {
        v2 = &a0->field_20;
    }
    else if (sub_a99eac(a0->field_18) - 21 >= 6 && (v3 = a0->field_20, v3 && *v3 == 4))
    {
        v2 = v3 + 2;
    }
    else
    {
        return 0;
    }
    return *(long long *)v2;
}
