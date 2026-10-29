/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46cc4..0xb46e2c (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b46cc4_0 {
    struct st_b46cc4_0 *field_0;
} st_b46cc4_0;

extern char g_10002b0;

st_b46cc4_0 ** sub_b46cc4(st_b46cc4_0 **a0)
{
    st_b46cc4_0 **v0;  // [bp-0x80]
    st_b46cc4_0 **v1;  // [bp-0x70]
    st_b46cc4_0 **v2;  // [bp-0x60]
    st_b46cc4_0 **v3;  // [bp-0x50]
    st_b46cc4_0 **v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v3 = (st_b46cc4_0 **)0;
    v4 = (st_b46cc4_0 **)0;
    v1 = (st_b46cc4_0 **)0;
    v2 = (st_b46cc4_0 **)0;
    v0 = (st_b46cc4_0 **)0;
    if (a0[10])
    {
        sub_a70404("strength");
        if (a0[6] && a0[8])
            a0[8]();
        a0[10]();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/drbg.c", 91, "get_parent_strength");
        sub_a36abc(57, 199, 0);
        if (*(long long *)&g_10002b0 == v5)
            return 0;
        ___stack_chk_fail();
    }
}
