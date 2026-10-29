/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d73c..0xa2d780 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d73c_0 {
    long long field_0;
    unsigned int field_8;
} st_a2d73c_0;


long long sub_a2d73c(st_a2d73c_0 *a0, long long a1)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    if (!v2)
        return v2;
    v3 = sub_a68e7c(sub_a68f38(sub_a7a42c(v2)), a1);
    return v3 == a0->field_8;
}
