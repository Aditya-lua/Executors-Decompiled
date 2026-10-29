/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea530..0xaea720 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aea530_0 {
    struct st_aea530_0 *field_0;
    struct st_aea530_0 *field_8;
} st_aea530_0;

extern long long g_aea72c;
extern long long g_eb8418;

st_aea530_0 * sub_aea530(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v3;  // x21
    st_aea530_0 *v4;  // x19
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    st_aea530_0 *v5;  // x24
    st_aea530_0 *v18;  // x0
    st_aea530_0 *v19;  // x2
    long long v20;  // x1
    st_aea530_0 **v6;  // x26
    st_aea530_0 *v7;  // x22
    st_aea530_0 *v8;  // x0
    st_aea530_0 *v9;  // x23
    st_aea530_0 *v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_ad69e4(a2);
    v4 = sub_ad61e0(0, v3);
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_pmaps.c", 75, "v2i_POLICY_MAPPINGS");
        sub_a36abc(0x22, 0x8000f, 0);
        return v4;
    }
    else if ((int)v3 >= 1)
    {
        v5 = 0;
        while (1)
        {
            v6 = sub_ad69f8(a2, v5);
            if (!v6[2] || !v6[1])
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pmaps.c", 82, "v2i_POLICY_MAPPINGS");
                v0 = v6[1];
                sub_a36abc(0x22, 110, "%s");
                v9 = 0;
                v7 = 0;
                break;
            }
            v7 = sub_a997a4(v6[1], 0);
            v8 = sub_a997a4(v6[2], 0);
            v9 = v8;
            if (v7)
            {
                v11 = arm64g_calculate_condition(v13 | 16, v14, v15, v10);
                v12 = arm64g_calculate_condition(4, (v11 & 1 ? v8 : 0x40000000), 0, 0);
                if (v12 & 1)
                    goto LABEL_aea674;
            }
            else
            {
                v16 = arm64g_calculate_condition(v13 | 16, v14, v15, v10);
                v17 = arm64g_calculate_condition(0, (v16 & 1 ? v8 : 0x40000000), 0, 0);
                if (v17 & 1)
                {
LABEL_aea674:
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_pmaps.c", 89, "v2i_POLICY_MAPPINGS");
                    v0 = v6[1];
                    v19 = "%s";
                    v20 = 110;
                    goto LABEL_aea6d8;
                }
            }
            v18 = sub_9cde20(&g_eb8418);
            if (v18)
            {
                v18->field_0 = v7;
                v18->field_8 = v9;
                sub_ad68a0(v4, v18);
                v5 = (unsigned int)v5 + 1;
                if ((unsigned int)v3 == (unsigned int)v5)
                    return v4;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_pmaps.c", 95, "v2i_POLICY_MAPPINGS");
                v20 = 524301;
                v19 = 0;
LABEL_aea6d8:
                sub_a36abc(0x22, v20, v19);
                break;
            }
        }
        sub_9c3580(v7);
        sub_9c3580(v9);
        sub_ad6958(v4, &g_aea72c);
        return 0;
    }
    else
    {
        return v4;
    }
}
