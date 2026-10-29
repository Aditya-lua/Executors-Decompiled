/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaee950..0xaeeb78 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aee950_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_aee950_1;

extern st_aee950_1 g_eb9570;

unsigned long long sub_aee950(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v7;  // x19
    unsigned long long v8;  // x21
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long *v9;  // x24
    unsigned long long idx;  // x8
    unsigned long long v22;  // x24
    unsigned long long v10;  // x25
    long long num;  // x0
    unsigned long long *v12;  // x8
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    unsigned long long *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_ad61b4();
    if (!v7)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_tlsf.c", 97, "v2i_TLS_FEATURE");
        sub_a36abc(0x22, 0x8000f, 0);
        return v7;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v8 = 0;
        while (1)
        {
            v9 = sub_ad69f8(a2, v8);
            v10 = v9[2];
            if (!v9[2])
                v10 = v9[1];
            if (!sub_a6e200(v10, "status_request"))
            {
                idx = 0;
                goto LABEL_aeea28;
            }
            if (sub_a6e200(v10, "status_request_v2"))
                break;
            idx = 1;
LABEL_aeea28:
            num = (&g_eb9570.field_0)[2 * idx];
LABEL_aeea30:
            v22 = sub_9cf11c();
            if (v22 && sub_9c19dc(v22, num) && (int)sub_ad68a0(v7, v22) > 0)
            {
                v8 = (unsigned int)v8 + 1;
                if ((int)v8 >= (int)sub_ad69e4(a2))
                    return v7;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_tlsf.c", 125, "v2i_TLS_FEATURE");
                sub_a36abc(0x22, 0x8000d, 0);
                sub_ad6958(v7, sub_9cf124);
                goto LABEL_aeeb48;
            }
        }
        num = _strtol(v10, &v4, 10);
        v12 = v4;
        if (!*(char *)v12)
        {
            v13 = arm64g_calculate_condition(v15, v16, v17, v18);
            v14 = arm64g_calculate_condition(4, (v13 & 1 ? v10 : 0x40000000), (v13 & 1 ? v12 : 0), 0);
            if (!(v14 & 1))
                goto LABEL_aeea0c;
        }
        else
        {
            v19 = arm64g_calculate_condition(v15, v16, v17, v18);
            v20 = arm64g_calculate_condition(0, (v19 & 1 ? v10 : 0x40000000), (v19 & 1 ? v12 : 0), 0);
            if (!(v20 & 1))
            {
LABEL_aeea0c:
                if ((unsigned long long)num < 0x10000)
                    goto LABEL_aeea30;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_tlsf.c", 116, "v2i_TLS_FEATURE");
        sub_a36abc(0x22, 143, 0);
        v2 = ", value=";
        v3 = v9[2];
        v0 = "name=";
        v1 = v9[1];
        sub_a364a0(4);
        sub_ad6958(v7, sub_9cf124);
LABEL_aeeb48:
        sub_9cf124(0);
        return 0;
        sub_9cf124(v22);
        return 0;
    }
    else
    {
        return v7;
    }
}
