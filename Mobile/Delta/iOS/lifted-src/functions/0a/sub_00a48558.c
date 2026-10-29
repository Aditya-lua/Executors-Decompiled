/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48558..0xa48648 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a48558_1 {
    char padding_0[384];
    struct st_a48558_0 *field_180;
} st_a48558_1;

typedef struct st_a48558_0 {
    struct st_a48558_0 *field_0;
} st_a48558_0;


int sub_a48558(long long a0, long long a1, long long a2, st_a48558_0 **a3)
{
    st_a48558_0 **i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    st_a48558_1 *v5;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    v5 = sub_9ffdd8();
    if (v5->field_180)
        v5->field_180();
    if (i > 0x3fffffff)
    {
        do
        {
            sub_9fb9ac(v3, v4, 0x40000000, v5, &v5->padding_0[128], &v5->padding_0[0x100], a0 + 40, sub_a50720(a0));
            i += 0x1ffffffff8000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while (i > 0x3fffffff);
    }
    if (!i)
        return 1;
    sub_9fb9ac(v3, v4, i, v5, &v5->padding_0[128], &v5->padding_0[0x100], a0 + 40, sub_a50720(a0));
    return 1;
}
