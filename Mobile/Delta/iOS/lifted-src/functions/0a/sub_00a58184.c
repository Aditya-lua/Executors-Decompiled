/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58184..0xa58410 (652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58184_0 {
    struct st_a58184_0 *field_0;
    struct st_a58184_0 *field_8;
    char padding_10[64];
    struct st_a58184_0 *field_50;
    char padding_58[24];
    struct st_a58184_0 *field_70;
    struct st_a58184_0 *field_78;
    struct st_a58184_0 *field_80;
} st_a58184_0;

extern char g_10002b0;

st_a58184_0 * sub_a58184(st_a58184_0 *a0, st_a58184_0 *a1, st_a58184_0 *a2, st_a58184_0 *a3, st_a58184_0 *a4)
{
    st_a58184_0 *v14;  // w1
    st_a58184_0 *v15;  // x9
    long long v17;  // x1
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb0]
    st_a58184_0 *v3;  // [bp-0xa0]
    st_a58184_0 *v4;  // [bp-0x90]
    st_a58184_0 *v5;  // [bp-0x80]
    uint128_t v6;  // [bp-0x78]
    st_a58184_0 *v7;  // [bp-0x70]
    uint128_t v8;  // [bp-0x68]
    st_a58184_0 *v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x58]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    if (!a0 || !a0->field_0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/mac_lib.c", 150, "evp_mac_final");
        v17 = 218;
    }
    else if (a0->field_0->field_50)
    {
        *(unsigned long long *)&v0 = 0;
        v14 = a1;
        if (a0->field_8)
        {
            v7 = (st_a58184_0 *)0;
            v9 = (st_a58184_0 *)0;
            v4 = (st_a58184_0 *)0;
            v5 = (st_a58184_0 *)0;
            v3 = (st_a58184_0 *)0;
            sub_a70ed8("size", &v0);
            v15 = a0->field_0;
            if (v15->field_78)
            {
                v15->field_78();
            }
            else if (v15->field_70)
            {
                v15->field_70();
            }
            else
            {
                v14 = a1;
            }
        }
        if (!a2)
        {
            if (a3)
            {
                a3->field_0 = 0;
                if (*(long long *)&g_10002b0 == v11)
                    return 1;
                ___stack_chk_fail();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/mac_lib.c", 161, "evp_mac_final");
                v17 = 786690;
            }
        }
        else
        {
            if (0 > a4)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/mac_lib.c", 168, "evp_mac_final");
                v17 = 155;
            }
            else
            {
                if (v14)
                {
                    sub_a71bbc(sub_a6ffac("xof", &a1), &a1);
                    v6 = v0;
                    v8 = v1;
                    v10 = v2;
                    if (a0->field_0->field_80)
                        a0->field_0->field_80();
                }
                a0->field_0->field_50();
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/mac_lib.c", 154, "evp_mac_final");
        v17 = 188;
    }
    sub_a36abc(6, v17, 0);
    if (*(long long *)&g_10002b0 == v11)
        return 0;
    ___stack_chk_fail();
}
