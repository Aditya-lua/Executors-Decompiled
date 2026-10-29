/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16104..0xa1633c (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a16104_0 {
    struct st_a16104_0 *field_0;
    struct st_a16104_0 *field_8;
    struct st_a16104_0 *field_10;
    struct st_a16104_0 *field_18;
    struct st_a16104_0 *field_20;
    unsigned int field_28;
    char padding_2c[52];
    unsigned long long field_60;
    char padding_68[240];
    struct st_a16104_0 *field_158;
} st_a16104_0;

extern long long g_e8ee48;

st_a16104_0 * sub_a16104(st_a16104_0 *a0, unsigned long long *a1)
{
    st_a16104_0 *v3;  // x0
    st_a16104_0 *v4;  // x19
    long long v5;  // x22
    st_a16104_0 *v6;  // x21
    st_a16104_0 *v7;  // x0
    st_a16104_0 *v8;  // x24
    long long v9;  // x0
    st_a16104_0 *v10;  // x0
    long long v11;  // x0
    long long v12;  // x23
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a1;
    v3 = sub_9cae2c(0, &v0);
    if (!v3)
    {
LABEL_a162c0:
        return 0;
    }
    v4 = v3;
    v5 = 524304;
    if (a0 && !(v6 = a0->field_0, !a0->field_0) || !(v6 = sub_a18b6c(), !v6))
    {
        if (!v4->field_10)
        {
            if (!v6->field_18)
                goto LABEL_a1624c;
            goto LABEL_a161a8;
        }
        sub_a1a174(v6->field_18);
        v7 = sub_a15e58(v4->field_10);
        v6->field_18 = v7;
        if (v7)
        {
            if ((int)v4->field_10->field_0 == 1)
                v7->field_28 = (int)v4->field_10->field_0;
LABEL_a161a8:
            *(int *)&v6->field_10 = (int)v4->field_0;
            v8 = v4->field_8;
            if (v8)
            {
                v9 = sub_c4c40(v8);
                if (!sub_a19a8c(v6, v9, sub_9c7b68(v8)))
                    goto LABEL_a16298;
                if (sub_a1abcc(v6->field_18) == 1172)
                    sub_a197a8(v6, 4);
                sub_a1a298(v6->field_20);
                v10 = sub_a1a56c(v6->field_18);
                v6->field_20 = v10;
                if (!v10)
                {
                    v12 = 970;
                }
                else if (v4->field_18)
                {
                    v11 = sub_c4c40(v4->field_18);
                    if (!sub_a19954(v6, v11, sub_9c7b68(v4->field_18), 0))
                    {
                        v12 = 981;
                    }
                    else
                    {
                        if (a0)
                            a0->field_0 = v6;
                        sub_9cd960(v4, &g_e8ee48);
                        *a1 = v0;
                        v6->field_60 = v6->field_60 + 1;
                        return v6;
                    }
                }
                else
                {
                    if (v6->field_18->field_0->field_158)
                        v6->field_18->field_0->field_158();
LABEL_a16298:
                    if (!a0 || a0->field_0 != v6)
                        sub_a18c08(v6);
                    sub_9cd960(v4, &g_e8ee48);
                    goto LABEL_a162c0;
                }
            }
            else
            {
                v5 = 125;
                v12 = 960;
            }
        }
        else
        {
LABEL_a1624c:
            v12 = 947;
        }
    }
    else
    {
        v12 = 932;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_asn1.c", v12, "d2i_ECPrivateKey");
    sub_a36abc(16, v5, 0);
    goto LABEL_a16298;
}
