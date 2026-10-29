/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c7260..0x9c7328 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c7260_0 {
    struct st_9c7260_0 *field_0;
} st_9c7260_0;


int sub_9c7260(st_9c7260_0 **a0, int a1, long long a2)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v10;  // x20
    long long v24;  // x19
    long long v25;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_9c7260_0 **num;  // x0
    st_9c7260_0 **v14;  // x8
    st_9c7260_0 **v15;  // x10
    st_9c7260_0 **v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (a0)
    {
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = v11;
        v5 = &v7;
        v6 = v12;
        num = _strtoul();
        v14 = v0;
        if (v14)
        {
            v15 = (char *)a0 + a1;
            if (*(char *)v14)
            {
                v18 = arm64g_calculate_condition(v20 | 16, v21, v16, v17);
                v19 = arm64g_calculate_condition(20, (v18 & 1 ? v14 : 0x40000000), (v18 & 1 ? v15 : 0), 0);
                if (v19 & 1)
                    goto LABEL_9c7310;
            }
            else
            {
                v22 = arm64g_calculate_condition(v20 | 16, v21, v16, v17);
                v23 = arm64g_calculate_condition(16, (v22 & 1 ? v14 : 0x40000000), (v22 & 1 ? v15 : 0), 0);
                if (v23 & 1)
                    goto LABEL_9c7310;
            }
        }
        if (num >= 0)
        {
            a0 = 1;
            if (sub_9c0540(a2))
                goto LABEL_9c7314;
            v24 = 524301;
            v25 = 764;
        }
        else
        {
            v24 = 0xbb;
            v25 = 760;
        }
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_gen.c", v25, "bitstr_cb");
        sub_a36abc(13, v24, 0);
LABEL_9c7310:
        a0 = 0;
LABEL_9c7314:
    }
    return (unsigned int)a0;
}
