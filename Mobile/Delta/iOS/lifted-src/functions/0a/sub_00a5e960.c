/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5e960..0xa5ead4 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5e960_2 {
    unsigned int field_0;
    char padding_4[116];
    struct st_a5e960_0 *field_78;
} st_a5e960_2;

typedef struct st_a5e960_0 {
    unsigned int field_0;
    char padding_4[188];
    struct st_a5e960_1 *field_c0;
} st_a5e960_0;

typedef struct st_a5e960_1 {
    unsigned long long field_0;
} st_a5e960_1;


unsigned int sub_a5e960(st_a5e960_2 *a0, unsigned int a1, unsigned int a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    st_a5e960_0 *v2;  // x8
    unsigned long v3;  // x9
    unsigned long long v4;  // 4112
    long long v5;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_78;
    if (!v2 || !*(long long *)&v2[1].padding_4[44])
    {
        v3 = a0->field_0;
        if ((unsigned int)v3)
        {
            if ((unsigned int)v3 & a2)
                goto LABEL_a5e9e0;
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_lib.c", 1314, "evp_pkey_ctx_ctrl_int");
            v5 = 148;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_lib.c", 1309, "evp_pkey_ctx_ctrl_int");
            v5 = 149;
        }
        sub_a36abc(6, v5, 0);
        return 0xffffffff;
    }
    v3 = a0->field_0;
    if ((unsigned int)v3)
    {
LABEL_a5e9e0:
        if (!v2)
            goto LABEL_a5ea9c;
    }
    if (v2->field_c0)
    {
        v4 = arm64g_calculate_condition(1, a1, 1, 0);
        if (!(v4 & 1) && v2->field_0 != a1)
            return 0xffffffff;
        v2->field_c0();
    }
LABEL_a5ea9c:
    sub_a368c8();
    sub_a369bc("crypto/evp/pmeth_lib.c", 1325, "evp_pkey_ctx_ctrl_int");
    sub_a36abc(6, 147, 0);
    return 0xfffffffe;
}
