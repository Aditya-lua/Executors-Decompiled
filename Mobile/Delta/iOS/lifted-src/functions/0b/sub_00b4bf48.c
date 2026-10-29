/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bf48..0xb4c090 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bf48_0 {
    struct st_b4bf48_0 *field_0;
} st_b4bf48_0;

extern char g_10002b0;

st_b4bf48_0 ** sub_b4bf48(st_b4bf48_0 **a0, st_b4bf48_0 **a1)
{
    st_b4bf48_0 **v25;  // x0
    st_b4bf48_0 **v26;  // x0
    st_b4bf48_0 **v27;  // x20
    st_b4bf48_0 **v0;  // [bp-0x180]
    st_b4bf48_0 **v1;  // [bp-0x178]
    st_b4bf48_0 **v2;  // [bp-0x170]
    st_b4bf48_0 **v3;  // [bp-0x160]
    st_b4bf48_0 **v4;  // [bp-0x150]
    st_b4bf48_0 **v5;  // [bp-0x140]
    st_b4bf48_0 **v6;  // [bp-0x130]
    st_b4bf48_0 **v7;  // [bp-0x120]
    st_b4bf48_0 **v8;  // [bp-0x110]
    st_b4bf48_0 **v9;  // [bp-0x100]
    st_b4bf48_0 **v10;  // [bp-0xf0]
    st_b4bf48_0 **v11;  // [bp-0xe0]
    st_b4bf48_0 **v12;  // [bp-0xd0]
    st_b4bf48_0 **v13;  // [bp-0xc0]
    st_b4bf48_0 **v14;  // [bp-0xb0]
    st_b4bf48_0 **v15;  // [bp-0xa0]
    st_b4bf48_0 **v16;  // [bp-0x90]
    st_b4bf48_0 **v17;  // [bp-0x80]
    st_b4bf48_0 **v18;  // [bp-0x70]
    st_b4bf48_0 **v19;  // [bp-0x60]
    st_b4bf48_0 **v20;  // [bp-0x50]
    st_b4bf48_0 **v21;  // [bp-0x40]
    unsigned long v22;  // [bp-0x38]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v22 = *(long long *)&g_10002b0;
    v25 = a0;
    if (v25)
    {
        if (!a1 || !*a1)
        {
LABEL_b4c054:
            v25 = 1;
        }
        else if (!sub_a6fbc4(a1, "nonce-type") || !(v25 = sub_a6ffcc(), !(unsigned int)v25))
        {
            v26 = sub_a6fbc4(a1, "digest");
            if (!v26)
                goto LABEL_b4c054;
            v21 = (st_b4bf48_0 **)0;
            v19 = (st_b4bf48_0 **)0;
            v20 = (st_b4bf48_0 **)0;
            v18 = (st_b4bf48_0 **)0;
            v1 = &v18;
            v16 = (st_b4bf48_0 **)0;
            v17 = (st_b4bf48_0 **)0;
            v14 = (st_b4bf48_0 **)0;
            v15 = (st_b4bf48_0 **)0;
            v12 = (st_b4bf48_0 **)0;
            v13 = (st_b4bf48_0 **)0;
            v10 = (st_b4bf48_0 **)0;
            v11 = (st_b4bf48_0 **)0;
            v8 = (st_b4bf48_0 **)0;
            v9 = (st_b4bf48_0 **)0;
            v6 = (st_b4bf48_0 **)0;
            v7 = (st_b4bf48_0 **)0;
            v4 = (st_b4bf48_0 **)0;
            v5 = (st_b4bf48_0 **)0;
            v2 = (st_b4bf48_0 **)0;
            v3 = (st_b4bf48_0 **)0;
            v0 = &v2;
            v27 = sub_a6fbc4(a1, "properties");
            if (sub_a71220(v26, &v1, 50) && (!v27 || sub_a71220(v27, &v0, 0x100)))
            {
                v25 = sub_b4c884(a0, &v18, &v2);
                if ((unsigned int)v25)
                    goto LABEL_b4c054;
            }
            else
            {
                v25 = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v22)
        return v25;
    ___stack_chk_fail();
}
