/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa47b7c..0xa47bb0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a47b7c_0 {
    char padding_0[120];
    long long field_78;
} st_a47b7c_0;


int sub_a47b7c(st_a47b7c_0 *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_78)
        return 1;
    v2 = sub_aa4d58();
    sub_a66ec0(a0->field_78, v2 + 208);
    return 1;
}
