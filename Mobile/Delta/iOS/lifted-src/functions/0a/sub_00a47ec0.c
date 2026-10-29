/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa47ec0..0xa47fb4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a47ec0_1 {
    char padding_0[128];
    struct st_a47ec0_0 *field_80;
} st_a47ec0_1;

typedef struct st_a47ec0_0 {
    struct st_a47ec0_0 *field_0;
} st_a47ec0_0;


int sub_a47ec0(long long a0, long long a1, long long a2, st_a47ec0_0 **a3)
{
    st_a47ec0_0 **i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    st_a47ec0_1 *v5;  // x0
    long long v6;  // x0
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    v5 = sub_9ffdd8();
    if (v5->field_80)
        v5->field_80();
    if (i > 0x3fffffff)
    {
        do
        {
            v6 = sub_9ffdd8(a0);
            sub_9fb5f8(v3, v4, 0x40000000, v6, a0 + 40, sub_a50720(a0));
            i += 0x1ffffffff8000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while (i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v8 = sub_9ffdd8(a0);
    sub_9fb5f8(v3, v4, i, v8, a0 + 40, sub_a50720(a0));
    return 1;
}
