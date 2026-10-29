/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b508..0xa5b5fc (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b508_0 {
    struct st_a5b508_0 *field_0;
} st_a5b508_0;

extern char g_10002b0;

st_a5b508_0 ** sub_a5b508(long long a0, st_a5b508_0 **a1, unsigned long a2, st_a5b508_0 **a3)
{
    st_a5b508_0 **v12;  // w0
    st_a5b508_0 **v13;  // w0
    st_a5b508_0 **v14;  // w8
    st_a5b508_0 **v15;  // x0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x68]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    sub_a71bbc(sub_a71618("group"));
    v5 = v0;
    v6 = v1;
    v7 = v2;
    v12 = (st_a5b508_0 **)(unsigned int)sub_a5bfbc(a0, &v3);
    if (v12)
    {
        v13 = (st_a5b508_0 **)(unsigned int)sub_a6fc18(&v3);
        v14 = (st_a5b508_0 **)(v13 != 0);
        if (a3 && v13)
            *a3 = v4;
        if (v13 && v4 == a2)
        {
            v15 = 0;
        }
        else
        {
            if (a1 && v13)
            {
                *((char *)a1 + v4) = 0;
                v14 = (st_a5b508_0 **)1;
            }
LABEL_a5b5c4:
            if (!v12)
                v15 = 0;
            else
                v15 = v14;
        }
    }
    else
    {
        v14 = (st_a5b508_0 **)0;
        goto LABEL_a5b5c4;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v15;
    ___stack_chk_fail();
}
