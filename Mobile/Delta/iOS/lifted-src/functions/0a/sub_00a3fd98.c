/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3fd98..0xa3fe04 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3fd98_0 {
    char padding_0[40];
    struct st_a3fd98_0 *field_28;
} st_a3fd98_0;


void sub_a3fd98(st_a3fd98_0 *a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0)
    {
        if (!sub_a50db0(a0, 0x400))
        {
            sub_a5d6b0(a0->field_28);
            a0->field_28 = 0;
        }
        sub_a3f3d0(a0, 0, 0);
        sub_a66ec0(a0, 72);
    }
}
