/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa67080..0xa6738c (780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0d568;
extern char g_f0d56c;
extern char g_f0d570;
extern char g_f12a88;
extern char g_10002b0;

char sub_a67080(void)
{
    char v5;  // w0
    unsigned int v6;  // w0
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4107
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    char v15;  // w8
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4107
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4107
    char v20;  // w8
    unsigned long long v21;  // x8
    unsigned int v22;  // w11
    unsigned int v23;  // w12
    unsigned int v24;  // w11
    unsigned int v25;  // w10
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4107
    char v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (!(g_f12a88 & 1))
    {
        g_f12a88 = 1;
        *(unsigned int *)&g_f0d568 = 0;
        if (_getenv("OPENSSL_armcap"))
        {
            v5 = _strtoul();
            goto LABEL_a670d8;
        }
        else
        {
            *(unsigned int *)&g_f0d568 = 61;
            v0 = 0;
            v1 = 4;
            v6 = _sysctlbyname("hw.optional.armv8_2_sha512", &v0, &v1, 0, 0);
            if (v0 == 1)
            {
                v7 = arm64g_calculate_condition(v13, v14, v9, v10);
                v8 = arm64g_calculate_condition(3, (v7 & 1 ? v6 : 0), 0, 0);
                if (!(v8 & 1))
                    goto LABEL_a67122;
LABEL_a67121:
                v15 = 64;
            }
            else
            {
                v11 = arm64g_calculate_condition(v13, v14, v9, v10);
                v12 = arm64g_calculate_condition(0, (v11 & 1 ? v6 : 0), 0, 0);
                if (v12 & 1)
                    goto LABEL_a67121;
LABEL_a67122:
                v15 = 0;
            }
            *(int *)&g_f0d568 = *(int *)&g_f0d568 | v15;
            v0 = 0;
            v1 = 4;
            v5 = _sysctlbyname();
            if (v0 == 1)
            {
                v16 = arm64g_calculate_condition(v13, v14, v9, v10);
                v17 = arm64g_calculate_condition(3, (v16 & 1 ? v5 : 0), 0, 0);
                if (!(v17 & 1))
                    goto LABEL_a67166;
LABEL_a67165:
                v20 = 0x800;
            }
            else
            {
                v18 = arm64g_calculate_condition(v13, v14, v9, v10);
                v19 = arm64g_calculate_condition(0, (v18 & 1 ? v5 : 0), 0, 0);
                if (v19 & 1)
                    goto LABEL_a67165;
LABEL_a67166:
                v20 = 0;
            }
            v21 = *(int *)&g_f0d568 | v20;
            *(unsigned int *)&g_f0d568 = v21;
            if (v21 >> 11 & 1)
            {
                v0 = 64;
                v5 = _sysctlbyname("machdep.cpu.brand_string", &v1, &v0, 0, 0);
                if (!v5 && (v1 == 3552531301048283201 || v1 == 3624588895086211137 || v1 == 3696646489124139073 || v1 == 3768704083162067009))
                    *(unsigned int *)&g_f0d568 = *(int *)&g_f0d568 | 0x9000;
                v21 = *(int *)&g_f0d568;
            }
            if (v21 >> 7 & 1)
            {
                v5 = sub_a66e98();
                *(unsigned int *)&g_f0d56c = v5;
                v21 = *(int *)&g_f0d568;
            }
            if (v21 & 1 && (*(int *)&g_f0d56c & 0xff0ffff0 | 64) == 1091555520)
                *(unsigned int *)&g_f0d570 = 1;
            if (v21 >> 11 & 1)
            {
                v22 = *(int *)&g_f0d56c & 0xff0ffff0;
                if (1091556591 >= (int)v22)
                {
                    if (v22 != 0x410fd400)
                    {
                        v23 = 1091556496;
                        goto LABEL_a672bc;
                    }
                }
                else
                {
                    if (v22 != 1091556592)
                    {
                        v23 = 1829754000;
LABEL_a672bc:
                        if (v22 != v23 && (*(int *)&g_f0d56c & 0xff000000) != 0xc0000000)
                            goto LABEL_a672cc;
                    }
                }
                v21 = (unsigned int)v21 | 0x1000;
                *(unsigned int *)&g_f0d568 = v21;
LABEL_a672cc:
                v24 = *(int *)&g_f0d56c & 0xff0ffff0;
                if (v24 == 0x410fd400 || v24 == 1091556592 || (*(int *)&g_f0d56c & 0xff000000) == 0xc0000000)
                {
                    v25 = (unsigned int)v21 | 0x10000;
                    *(unsigned int *)&g_f0d568 = v25;
                    if (v21 >> 11 & 1)
                        goto LABEL_a67348;
                }
                else
                {
                    v25 = v21;
LABEL_a67348:
                    if (23 >= (*(int *)&g_f0d56c & 0xff0ffff0) + 2666593760 >> 4 && 1 << ((char)((*(int *)&g_f0d56c & 0xff0ffff0) + 2666593760 >> 4) & 31) & 13566159)
                    {
                        v5 = v25 | 0x8000;
LABEL_a670d8:
                        *(unsigned int *)&g_f0d568 = v5;
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
