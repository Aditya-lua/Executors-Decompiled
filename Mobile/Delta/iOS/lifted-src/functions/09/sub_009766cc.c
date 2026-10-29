/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9766cc..0x9766f4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9766cc_0 {
    char padding_0[80];
    char field_50;
} st_9766cc_0;


char sub_9766cc(unsigned long a0, st_9766cc_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1->field_50 & 1)
    {
        v0 = &v2;
        v1 = v3;
        sub_9765e4();
        return 1;
    }
    return 0;
}
