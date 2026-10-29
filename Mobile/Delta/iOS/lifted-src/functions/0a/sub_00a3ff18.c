/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ff18..0xa3ff7c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ff18_0 {
    char padding_0[40];
    struct st_a3ff18_0 *field_28;
} st_a3ff18_0;


unsigned long long sub_a3ff18(st_a3ff18_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3ff7c();
    if (!a0)
        return v2;
    if (!sub_a50db0(a0, 0x400))
    {
        sub_a5d6b0(a0->field_28);
        a0->field_28 = 0;
    }
    sub_a3f3d0(a0, 0, 0);
    sub_a66ec0(a0, 72);
    return v2;
}
