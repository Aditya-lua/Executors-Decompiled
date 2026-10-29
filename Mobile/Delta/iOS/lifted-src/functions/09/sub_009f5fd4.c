/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5fd4..0x9f6240 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f5fd4_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_9f5fd4_0;

extern unsigned long long g_f127e8;
extern long long g_f127f0;

long long sub_9f5fd4(unsigned long a0, long long a1)
{
    long long v5;  // x1
    long long v6;  // x19
    long long v15;  // x0
    long long v16;  // x23
    long long *v17;  // x28
    unsigned long long v18;  // x24
    long long i;  // x27
    long long v20;  // x19
    long long v21;  // x24
    long long *v22;  // x0
    long long *v23;  // x20
    unsigned long v24;  // cc_op
    unsigned long long v7;  // x0
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // cc_ndep
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4110
    long long v8;  // w21
    unsigned long long v31;  // 4102
    long long v32;  // x19
    unsigned long v9;  // x19
    long long v10;  // x1
    long long v11;  // x0
    long long v12;  // x21
    st_9f5fd4_0 *v13;  // x0
    st_9f5fd4_0 *v14;  // x24
    long long v0;  // [bp-0x80], Other Possible Types: unsigned long
    long long v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_c4ba8();
    v6 = sub_9f4bd0(a1, v5);
    if ((int)sub_ad69e4(v6, v5) > 0)
    {
        v2 = v6;
        v7 = sub_ad69e4(v6);
        v8 = (unsigned int)v7;
        v9 = v8;
        sub_9f6240(v7);
        v11 = sub_a6bffc((v9 + v8 * 2) * 8, "crypto/conf/conf_ssl.c", 80);
        g_f127e8 = v11;
        if (!v11)
        {
            sub_9f6240(v11, "crypto/conf/conf_ssl.c");
            return 0;
        }
        g_f127f0 = v9;
        if (!(unsigned int)v9)
            return 1;
        v12 = 0;
        while (1)
        {
            v13 = sub_ad69f8(v2, v12);
            v14 = v13;
            v15 = sub_9f4bd0(a1, v14->field_10);
            v16 = v15;
            if ((int)sub_ad69e4(v15, v13->field_10) <= 0)
                break;
            v17 = g_f127e8 + 24 * v12;
            v11 = sub_a6d9b4(v14->field_8, "crypto/conf/conf_ssl.c", 98);
            *v17 = v11;
            if (!v11)
            {
                sub_9f6240(v11, "crypto/conf/conf_ssl.c");
                return 0;
            }
            v18 = sub_ad69e4(v16);
            v11 = sub_a6bffc((long long)(v18 * 0x100000000) >> 63 & 0xfffffff000000000 | __ROL__(v18, 4) & 0xffffffff0 & 0xfffffffff, "crypto/conf/conf_ssl.c", 0x66);
            v17[1] = v11;
            if (!v11)
            {
                sub_9f6240(v11, "crypto/conf/conf_ssl.c");
                return 0;
            }
            i = (int)v18;
            v17[2] = i;
            if ((int)i)
            {
                v20 = 0;
                v21 = 0;
                do
                {
                    v22 = sub_ad69f8(v16, v21);
                    v23 = v17[1] + v20;
                    *v23 = sub_a6d9b4();
                    v11 = sub_a6d9b4(v22[2], "crypto/conf/conf_ssl.c", 118);
                    v23[1] = v11;
                    if (*v23)
                    {
                        v28 = arm64g_calculate_condition(v24 | 16, v25, v26, v27);
                        v29 = arm64g_calculate_condition(4, (v28 & 1 ? v11 : 0x40000000), 0, 0);
                        if (v29 & 1)
                        {
                            sub_9f6240(v11, "crypto/conf/conf_ssl.c");
                            return 0;
                        }
                    }
                    else
                    {
                        v30 = arm64g_calculate_condition(v24 | 16, v25, v26, v27);
                        v31 = arm64g_calculate_condition(0, (v30 & 1 ? v11 : 0x40000000), 0, 0);
                        if (v31 & 1)
                        {
                            sub_9f6240(v11, "crypto/conf/conf_ssl.c");
                            return 0;
                        }
                    }
                    v21 += 1;
                    v20 += 16;
                } while (i != v21);
            }
            v12 += 1;
            if ((unsigned long long)g_f127f0 <= (unsigned long long)v12)
                return 1;
        }
        if (v16)
            v32 = 117;
        else
            v32 = 118;
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_ssl.c", 94, "ssl_module_init");
        v0 = v14->field_8;
        v1 = v14->field_10;
    }
    else
    {
        if (v6)
            v32 = 0x77;
        else
            v32 = 120;
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_ssl.c", 75, "ssl_module_init");
        v0 = v5;
    }
    v10 = v32;
    sub_9f6240(sub_a36abc(14, v10), v10);
    return 0;
}
