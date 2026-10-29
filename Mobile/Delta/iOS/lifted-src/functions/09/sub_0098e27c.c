/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e27c..0x98e2c4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e27c_0 {
    char padding_0[144];
    long long field_90;
    long long field_98;
    char padding_a0[8];
    char field_a8;
} st_98e27c_0;

extern long long g_98e2c4;

long long sub_98e27c(st_98e27c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_a8 & 1)
    {
        _qsort(a0->field_90, a0->field_98, 32, &g_98e2c4);
        a0->field_a8 = a0->field_a8 & 254;
    }
    return a0->field_90;
}
