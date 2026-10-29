/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1ff4..0xaf2284 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_af1ff4(unsigned long long a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v6;  // x21
    unsigned long long v7;  // x24
    unsigned long v16;  // 4112
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // 4112
    unsigned long long v20;  // 4110
    unsigned int v8;  // w0
    unsigned long long v9;  // w0
    long long v10;  // x0
    unsigned long long v11;  // x1
    unsigned int v12;  // w0
    unsigned long long v13;  // x8
    unsigned int v14;  // w8
    unsigned long v15;  // cc_dep1
    unsigned long long v0;  // [bp-0xb8]
    char v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = a3;
    if (a3 & 0x30000)
    {
        if (a1)
        {
            v6 = 0;
            goto LABEL_af2060;
        }
        a1 = sub_ad69f8(a2, 0);
        if (a1)
        {
            v6 = 1;
LABEL_af2060:
            v7 = sub_afb440(*(long long *)(a1 + 80));
            if (a2)
            {
                if (sub_af3ae0(a1) != 2)
                {
LABEL_af2144:
                    v6 = 0;
                    v9 = 56;
                    goto LABEL_af2180;
                }
                if (!v7 || !sub_a5b3bc(v7, "EC"))
                    goto LABEL_af213c;
                if (sub_a5b508(v7, &v2, 80, &v1))
                {
                    sub_a99eb4(&v2);
                    switch (v8)
                    {
                    case 415:
                        if (a3 >> 16 & 1)
                            goto LABEL_af2210;
LABEL_af2178:
                        v9 = 60;
                        break;
                    case 715:
                        if (!(a3 >> 0x11 & 1))
                            goto LABEL_af2178;
                        v0 = a3 & 0xfffffffffffeffff;
                        while (1)
                        {
LABEL_af2210:
                            if ((int)v6 < (int)sub_ad69e4(a2))
                            {
                                v10 = sub_afc604(a1);
                                v11 = v6;
                                a1 = sub_ad69f8(a2, v11);
                                if (sub_af3ae0(a1, v11) == 2)
                                {
                                    if (a1)
                                        v7 = sub_afb440(*(long long *)(a1 + 80));
                                    else
                                        v7 = 0;
                                    v9 = (unsigned int)sub_af2284(v7, v10, &v0);
                                    if (v9)
                                        break;
                                    v6 = (unsigned int)v6 + 1;
                                }
                                else
                                {
                                    v9 = 56;
                                    break;
                                }
                            }
                            else
                            {
                                v9 = (unsigned int)sub_af2284(v7, sub_afc604(a1), &v0);
                                if (v9)
                                    break;
                                else
                                    goto LABEL_af223c;
                            }
                        }
                        goto LABEL_af2180;
                    default:
                        goto LABEL_af2160;
                    }
                    goto LABEL_af217c;
                }
                else
                {
LABEL_af2160:
                    v9 = 58;
                    goto LABEL_af217c;
                }
            }
            else
            {
                if (!v7 || !sub_a5b3bc(v7, "EC"))
                    goto LABEL_af2150;
                if (sub_a5b508(v7, &v2, 80, &v1))
                {
                    sub_a99eb4(&v2);
                    switch (v12)
                    {
                    case 415:
                        if (a3 >> 16 & 1)
                            goto LABEL_af223c;
LABEL_af216c:
                        v13 = 60;
                        break;
                    case 715:
                        if (!(a3 >> 0x11 & 1))
                            goto LABEL_af216c;
                        goto LABEL_af223c;
                    default:
                        goto LABEL_af2158;
                    }
                }
                else
                {
LABEL_af2158:
                    if (*(long long *)&g_10002b0 == v3)
                        return 58;
                    ___stack_chk_fail();
                }
            }
        }
        else if (a2)
        {
            if (sub_af3ae0(0) != 2)
                goto LABEL_af2144;
LABEL_af213c:
            v9 = 57;
LABEL_af217c:
            v6 = 0;
LABEL_af2180:
            if (v0 == a3)
                v14 = 60;
            else
                v14 = 61;
            v15 = v9;
            if (v9 == 60)
                v13 = v14;
            else
                v13 = v9;
            if (a0)
            {
                if (v9 - 59 < 2)
                {
                    v16 = arm64g_calculate_condition(0x33, v15, 60, 0);
                    v17 = 3;
                    v18 = (v16 & 1 ? v6 & 0xffffffff : 0x40000000);
                }
                else
                {
                    v19 = arm64g_calculate_condition(0x33, v15, 60, 0);
                    v17 = 0;
                    v18 = (v19 & 1 ? v6 & 0xffffffff : 0x40000000);
                }
                v20 = arm64g_calculate_condition(v17, v18, 0, 0);
                *(unsigned int *)a0 = v6 - !(v20 & 1);
            }
        }
        else
        {
LABEL_af2150:
            v13 = 57;
        }
    }
    else
    {
LABEL_af223c:
        v13 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v13;
    ___stack_chk_fail();
}
