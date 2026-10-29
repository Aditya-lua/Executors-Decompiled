/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17584..0xa177b4 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a17584_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_a17584_0 *field_10;
} st_a17584_0;

extern unsigned int g_e8ef40;
extern unsigned int g_e8ef50;
extern unsigned int g_e8ef60;

st_a17584_0 * sub_a17584(st_a17584_0 *a0, long long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v18;  // 4118
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_a17584_0 *v13;  // x0
    unsigned int v14;  // w0
    st_a17584_0 *v15;  // x0
    st_a17584_0 *v16;  // x20
    unsigned int *v17;  // x8
    st_a17584_0 *v0;  // [bp-0x38], Other Possible Types: unsigned int
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
        if (!sub_a6fbc4(a1, "use-cofactor-flag"))
        {
LABEL_a17604:
            if (sub_a6fbc4(a1, "include-public"))
            {
                v0 = (st_a17584_0 *)1;
                v13 = sub_a6fc2c();
                if (!(unsigned int)v13)
                    goto LABEL_a177a0;
                v14 = sub_a198c4(a0);
                sub_a198cc(a0, v14 & 0xfffffffc | (v14 & 0xfffffffd | __ROL__(!v0, 1) & 2) & 3);
            }
            v0 = 0xffffffff;
            if (sub_a6fbc4(a1, "point-format"))
            {
                if (sub_a17aa0())
                {
                    sub_a198d4(a0, v0);
                    goto LABEL_a17684;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_backend.c", 524, "ec_key_point_format_fromdata");
                    sub_a36abc(16, 104, 0);
                }
            }
            else
            {
LABEL_a17684:
                v15 = sub_a6fbc4(a1, "group-check");
                if (!v15)
                {
                    v13 = 1;
                    goto LABEL_a177a0;
                }
                v0 = 0;
                if (v15->field_8 != 6)
                {
                    if (v15->field_8 == 4 && !(v0 = v15->field_10, !v15->field_10))
                        goto LABEL_a1770c;
                }
                else
                {
                    if (sub_a7168c())
                    {
LABEL_a1770c:
                        v16 = v0;
                        if (v16)
                        {
                            if (sub_a6e200(v16, "default"))
                            {
                                if (sub_a6e200(v16, "named"))
                                {
                                    if (!sub_a6e200(v16, "named-nist"))
                                    {
                                        v17 = &g_e8ef60;
                                        goto LABEL_a17770;
                                    }
                                }
                                else
                                {
                                    v17 = &g_e8ef50;
LABEL_a17770:
                                    v16 = *v17;
                                    v18 = arm64g_calculate_condition(1, v16 & 0xffffffff, 1, 0);
                                    if (!(v18 & 1))
                                        goto LABEL_a1777c;
                                }
                            }
                            else
                            {
                                v17 = &g_e8ef40;
                                goto LABEL_a17770;
                            }
                        }
                        else
                        {
LABEL_a1777c:
                            sub_a198f0(a0, 0x6000);
                            sub_a197a8(a0, v16);
                            v13 = 1;
                            goto LABEL_a177a0;
                        }
                    }
                }
            }
        }
        else if (sub_a6fc2c() && !(sub_9ffdd0(a0), 1 < v0 || !sub_9ffdd0()) && !sub_9e5b90())
        {
            if (v0 == 1)
            {
                sub_a197a8(a0, 0x1000);
                goto LABEL_a17604;
            }
            else
            {
                sub_a198f0(a0, 0x1000);
            }
        }
        v13 = 0;
LABEL_a177a0:
        a0 = v13;
    }
    return (unsigned int)a0;
}
