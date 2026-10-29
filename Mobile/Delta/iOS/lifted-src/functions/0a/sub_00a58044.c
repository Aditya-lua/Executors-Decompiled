/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58044..0xa58104 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58044_2 {
    char padding_0[112];
    struct st_a58044_0 *field_70;
    struct st_a58044_0 *field_78;
} st_a58044_2;

typedef struct st_a58044_1 {
    struct st_a58044_2 *field_0;
    struct st_a58044_0 *field_8;
} st_a58044_1;

typedef struct st_a58044_0 {
    struct st_a58044_0 *field_0;
} st_a58044_0;

extern char g_10002b0;

st_a58044_0 ** sub_a58044(st_a58044_1 *a0)
{
    st_a58044_0 **v9;  // x9
    st_a58044_0 **v0;  // [bp-0x88]
    st_a58044_0 **v1;  // [bp-0x80]
    st_a58044_0 **v2;  // [bp-0x70]
    st_a58044_0 **v3;  // [bp-0x60]
    st_a58044_0 **v4;  // [bp-0x50]
    st_a58044_0 **v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v0 = 0;
    if (a0->field_8)
    {
        v4 = (st_a58044_0 **)0;
        v5 = (st_a58044_0 **)0;
        v2 = (st_a58044_0 **)0;
        v3 = (st_a58044_0 **)0;
        v1 = (st_a58044_0 **)0;
        sub_a70ed8("size", &v0);
        v9 = a0->field_0;
        if (v9[15])
        {
            v9[15]();
        }
        else if (v9[14])
        {
            v9[14]();
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    ___stack_chk_fail();
}
