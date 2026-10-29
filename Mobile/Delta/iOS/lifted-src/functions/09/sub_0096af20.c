/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96af20..0x96afdc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96af20_0 {
    struct st_96af20_0 *field_0;
} st_96af20_0;

typedef struct st_96af20_1 {
    long long field_0;
    char padding_8[592];
    struct st_96af20_0 *field_258;
    struct st_96af20_0 *field_260;
    char padding_268[520];
    long long field_470;
} st_96af20_1;


st_96af20_0 ** sub_96af20(st_96af20_1 *a0)
{
    st_96af20_0 **v2;  // x19
    st_96af20_0 **v3;  // x20
    st_96af20_0 **v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "ssl/t1_lib.c", 0x12ac);
    if (!v2)
        return v2;
    if (a0->field_260 || !a0->field_258)
    {
        v3 = sub_a58724(a0->field_0, "HMAC", a0->field_470);
        if (v3)
        {
            v4 = sub_a57e48(v3);
            *v2 = v4;
            if (v4)
            {
                sub_a58aa4(v3);
                return v2;
            }
        }
    }
    else if (!sub_97066c(v2))
    {
        v3 = 0;
    }
    else
    {
        return v2;
    }
    sub_a57f0c(*v2);
    sub_a58aa4(v3);
    sub_a6c2e4(v2, "ssl/t1_lib.c", 0x12c1);
    return 0;
}
