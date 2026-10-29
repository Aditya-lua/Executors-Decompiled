/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50c70..0xa50d68 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50c70_0 {
    struct st_a50c70_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
} st_a50c70_0;

extern char g_10002b0;

unsigned long long sub_a50c70(st_a50c70_0 *a0)
{
    unsigned int v9;  // w0
    unsigned long v10;  // cc_op
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4107
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long long v18;  // x0
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4107
    st_a50c70_0 *v0;  // [bp-0x88]
    st_a50c70_0 *v1;  // [bp-0x80]
    st_a50c70_0 *v2;  // [bp-0x70]
    st_a50c70_0 *v3;  // [bp-0x60]
    st_a50c70_0 *v4;  // [bp-0x50]
    st_a50c70_0 *v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (sub_a40db0() && sub_a6fbc4())
    {
        v4 = (st_a50c70_0 *)0;
        v5 = (st_a50c70_0 *)0;
        v2 = (st_a50c70_0 *)0;
        v3 = (st_a50c70_0 *)0;
        v1 = (st_a50c70_0 *)0;
        v0 = 0;
        sub_a70ed8("size", &v0);
        v9 = sub_a40d14(a0, &v1);
        if (2 <= (char *)&v0->field_0 + 1)
        {
            v11 = arm64g_calculate_condition(v10 | 32, v16, v17, v13);
            v12 = arm64g_calculate_condition(3, (v11 & 1 ? v9 : 0), v11 & 1, 0);
            if (!(v12 & 1))
                goto LABEL_a50cf2;
LABEL_a50cf1:
            v18 = v0 & 0xffffffff;
        }
        else
        {
            v14 = arm64g_calculate_condition(v10 | 32, v16, v17, v13);
            v15 = arm64g_calculate_condition(0, (v14 & 1 ? v9 : 0), v14 & 1, 0);
            if (v15 & 1)
                goto LABEL_a50cf1;
LABEL_a50cf2:
            v18 = 0xffffffff;
        }
    }
    else if (a0 && a0->field_0)
    {
        v18 = *(int *)&a0->field_0->field_1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_lib.c", 807, "EVP_MD_get_size");
        sub_a36abc(6, 159, 0);
        v18 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v18;
    ___stack_chk_fail();
}
