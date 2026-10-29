/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c91b8..0x9c93f4 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c91b8_0 {
    struct st_9c91b8_0 *field_0;
} st_9c91b8_0;

extern char g_10002b0;

st_9c91b8_0 ** sub_9c91b8(st_9c91b8_0 **a0, st_9c91b8_0 **a1, unsigned long long *a2, long long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v8;  // x25
    st_9c91b8_0 **v9;  // x0
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    st_9c91b8_0 **v10;  // x24
    st_9c91b8_0 **v20;  // x24
    st_9c91b8_0 **v21;  // x0
    st_9c91b8_0 **v22;  // w0
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    char v0;  // [bp-0xb0], Other Possible Types: unsigned long
    st_9c91b8_0 **v2;  // [bp-0xa0]
    long long v3;  // [bp-0x98]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v2 = 0;
    v3 = a3;
    v8 = *a2;
    if (a0)
    {
        v9 = sub_a5b298();
        if (!v9)
        {
            if (*(long long *)&g_10002b0 == v5)
                return v9;
            ___stack_chk_fail();
        }
    }
    else
    {
        v9 = 0;
    }
    sub_a36c8c();
    v10 = sub_9ca7fc(0, a2, a3);
    sub_a36cd4(v10, a2, a3);
    if (v10)
    {
        if (sub_9c1674(&v0, *v10))
        {
            v12 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
            v13 = arm64g_calculate_condition(148, (v12 & 1 ? v0 : 0x20000000), v12 & 1, 0);
            if (v13 & 1)
                goto LABEL_9c92dc;
LABEL_9c9254:
            *a2 = v8;
            sub_a368c8();
            sub_a369bc("crypto/asn1/d2i_pr.c", 61, "d2i_PrivateKey_decoder");
            sub_a36abc(13, 203, 0);
            sub_9ca820(v10);
            if (*(long long *)&g_10002b0 == v5)
                return 0;
            ___stack_chk_fail();
        }
        v18 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v19 = arm64g_calculate_condition(144, (v18 & 1 ? v0 : 0x20000000), v18 & 1, 0);
        if (!(v19 & 1))
            goto LABEL_9c9254;
LABEL_9c92dc:
        sub_9ca820(v10);
        *a2 = v8;
        if (!a1)
            goto LABEL_9c933c;
LABEL_9c92a0:
        if (!*a1)
            v20 = &v2;
        else
            v20 = a1;
        v21 = sub_a2e274();
        *a1 = *a1;
        if (v21)
            goto LABEL_9c9364;
    }
    else
    {
        *a2 = v8;
        if (a1)
            goto LABEL_9c92a0;
LABEL_9c933c:
        v20 = &v2;
        v21 = sub_a2e274(&v2, "DER");
        if (v21)
        {
LABEL_9c9364:
            v22 = (st_9c91b8_0 **)(unsigned int)sub_a2c518();
            sub_a2d974(v21);
            if (v22 && *v20 && sub_a54c94(*v20, 1))
            {
                v9 = *v20;
                if (a1)
                    *a1 = v9;
                if (*(long long *)&g_10002b0 == v5)
                    return v9;
                ___stack_chk_fail();
            }
        }
    }
    if (v20 != a1)
    {
        sub_a5a4c8(*v20);
        if (*(long long *)&g_10002b0 == v5)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v5)
            return 0;
        ___stack_chk_fail();
    }
}
