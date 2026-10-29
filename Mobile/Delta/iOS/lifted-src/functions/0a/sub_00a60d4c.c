/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60d4c..0xa60d78 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60d4c_0 {
    char padding_0[24];
    long long field_18;
} st_a60d4c_0;


unsigned long long sub_a60d4c(st_a60d4c_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e48d4(a0->field_18);
    a0->field_18 = a1;
    return v2;
}
