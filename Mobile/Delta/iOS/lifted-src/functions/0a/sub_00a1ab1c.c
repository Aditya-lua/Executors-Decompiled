/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ab1c..0xa1ab64 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ab1c_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_a1ab1c_0;


unsigned long long sub_a1ab1c(st_a1ab1c_0 *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_10)
        return 0;
    v2 = sub_9e4c34(a1);
    if (!v2)
        return v2;
    return !sub_9e4828(a1);
}
