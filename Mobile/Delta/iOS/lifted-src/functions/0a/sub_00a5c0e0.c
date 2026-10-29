/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c0e0..0xa5c27c (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5c0e0_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
    char padding_28[136];
    struct st_a5c0e0_0 *field_b0;
} st_a5c0e0_0;

typedef struct st_a5c0e0_1 {
    char padding_0[8];
    struct st_a5c0e0_0 *field_8;
    char padding_10[80];
    struct st_a5c0e0_0 *field_60;
    long long field_68;
} st_a5c0e0_1;

extern char g_10002b0;

st_a5c0e0_0 * sub_a5c0e0(st_a5c0e0_1 *a0, unsigned int a1, st_a5c0e0_0 **a2)
{
    st_a5c0e0_0 *v9;  // x9
    st_a5c0e0_0 *v10;  // x0
    long long v11;  // x20
    long long v12;  // x0
    long long v13;  // x20
    unsigned long long v14;  // x0
    st_a5c0e0_0 *v0;  // [bp-0x94]
    st_a5c0e0_0 *v1;  // [bp-0x90]
    st_a5c0e0_0 *v2;  // [bp-0x80]
    st_a5c0e0_0 *v3;  // [bp-0x70]
    st_a5c0e0_0 *v4;  // [bp-0x60]
    st_a5c0e0_0 *v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (!a0->field_60)
    {
LABEL_a5c234:
        v10 = 0;
    }
    else if (a1 == 3)
    {
        v4 = (st_a5c0e0_0 *)0;
        v5 = (st_a5c0e0_0 *)0;
        v2 = (st_a5c0e0_0 *)0;
        v3 = (st_a5c0e0_0 *)0;
        v1 = (st_a5c0e0_0 *)0;
        v9 = a0->field_8;
        if (v9)
        {
            v0 = (st_a5c0e0_0 *)0;
            if (v9->field_b0)
                v9->field_b0();
            v10 = 0xfffffffe;
            if (1)
                goto LABEL_a5c1b0;
        }
        else
        {
            v10 = sub_a55054(a0->field_60, a0->field_68, &v1, 80);
            if ((int)(unsigned int)v10 >= 1)
            {
LABEL_a5c1b0:
                v11 = sub_a7a42c(a0->field_60->field_20);
                v0 = (st_a5c0e0_0 *)0;
                sub_a36c8c(v11);
                v12 = sub_a40ca8(v11, &v1, 0);
                sub_a36cd4(v12, &v1, 0);
                v13 = sub_a68f38(v11);
                sub_a3f52c(v12);
                v14 = sub_a68e7c(v13, &v1);
                if (!(unsigned int)v14 || !sub_a68da4(v13, v14, "(", &v0))
                    goto LABEL_a5c234;
                *(unsigned int *)a2 = (unsigned int)v0;
            }
        }
    }
    else
    {
        v10 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v10;
    ___stack_chk_fail();
}
