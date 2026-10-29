/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa536d0..0xa53798 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a536d0_0 {
    struct st_a536d0_1 *field_0;
} st_a536d0_0;

typedef struct st_a536d0_1 {
    char padding_0[104];
    struct st_a536d0_0 *field_68;
    struct st_a536d0_0 *field_70;
} st_a536d0_1;

extern char g_10002b0;

int sub_a536d0(st_a536d0_1 **a0)
{
    st_a536d0_0 **v9;  // x8
    st_a536d0_1 **v0;  // [bp-0x88]
    st_a536d0_1 **v1;  // [bp-0x80]
    st_a536d0_1 **v2;  // [bp-0x70]
    st_a536d0_1 **v3;  // [bp-0x60]
    st_a536d0_1 **v4;  // [bp-0x50]
    st_a536d0_1 **v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v4 = (st_a536d0_1 **)0;
    v5 = (st_a536d0_1 **)0;
    v2 = (st_a536d0_1 **)0;
    v3 = (st_a536d0_1 **)0;
    v1 = (st_a536d0_1 **)0;
    v0 = 0;
    if (a0)
    {
        sub_a70ed8("size", &v0);
        v9 = *a0;
        if (v9[14])
        {
            v9[14]();
        }
        else if (v9[13])
        {
            v9[13]();
        }
        else
        {
            a0 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return (unsigned int)a0;
    ___stack_chk_fail();
}
