/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4c124..0xb4c1e0 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4c124_0 {
    char padding_0[368];
    struct st_b4c124_0 *field_170;
} st_b4c124_0;

extern char g_10002b0;

st_b4c124_0 * sub_b4c124(st_b4c124_0 *a0, st_b4c124_0 *a1, long long a2, long long a3)
{
    st_b4c124_0 *v5;  // w0
    st_b4c124_0 *v6;  // x0
    st_b4c124_0 *v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = (st_b4c124_0 *)0;
    v5 = (st_b4c124_0 *)(unsigned int)sub_a2f9e0();
    v6 = 0;
    if (a0 && v5)
    {
        v6 = a0->field_170;
        if (a0->field_170)
        {
            if (a1)
            {
                v6 = sub_a3ff7c();
                if (!(unsigned int)v6)
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return v6;
                    ___stack_chk_fail();
                }
            }
            v6 = sub_b4c6c0(a0, a1, a2, a3, &v1);
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
