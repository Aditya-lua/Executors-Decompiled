/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2dc28..0xa2dc94 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2dc28_0 {
    char padding_0[40];
    char field_28;
} st_a2dc28_0;


int sub_a2dc28(long long *a0, long long a1, st_a2dc28_0 *a2)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68f38(sub_a7a42c(a1));
    if (!sub_a6924c(v2, 0, *a0, 58) || (v3 = sub_a2d0f8(), !v3))
    {
        v3 = 0;
        a2->field_28 = a2->field_28 | 1;
    }
    return v3;
}
