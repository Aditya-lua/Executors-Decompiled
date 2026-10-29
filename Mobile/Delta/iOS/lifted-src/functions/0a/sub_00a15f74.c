/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa15f74..0xa16038 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a15f74_0 {
    struct st_a15f74_0 *field_0;
    char padding_8[32];
    unsigned int field_28;
} st_a15f74_0;

extern long long g_e8e950;

st_a15f74_0 * sub_a15f74(st_a15f74_0 *a0, unsigned long long *a1)
{
    st_a15f74_0 *v3;  // x0
    st_a15f74_0 *v4;  // x22
    st_a15f74_0 *v5;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    v3 = sub_9cae2c(0, &v0);
    if (!v3)
    {
        sub_9cd960();
        return 0;
    }
    v4 = v3;
    v5 = sub_a15e58();
    if (!v5)
    {
        sub_9cd960(v4, &g_e8e950);
        return v5;
    }
    if ((int)v4->field_0 == 1)
        v5->field_28 = (int)v4->field_0;
    if (a0)
    {
        sub_a1a174(a0->field_0);
        a0->field_0 = v5;
    }
    sub_9cd960(v4, &g_e8e950);
    *a1 = v0;
    return v5;
}
