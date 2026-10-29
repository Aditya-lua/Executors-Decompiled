/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a720..0x95a770 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95a720_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_95a720_0;


unsigned long long sub_95a720(st_95a720_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_95a770(&a0[1].padding_0[8]);
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (!a0->field_10)
    {
        return 1;
    }
}
