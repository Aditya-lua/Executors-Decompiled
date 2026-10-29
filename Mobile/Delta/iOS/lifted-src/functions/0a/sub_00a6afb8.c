/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6afb8..0xa6b4b4 (1276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a6b4b4;
extern long long g_a6b57c;
extern long long g_a6b5e8;
extern long long g_a6b644;
extern long long g_a6b674;
extern long long g_a6b6a4;
extern long long g_a6b6c4;
extern long long g_a6b6e4;
extern long long g_a6b704;
extern long long g_a6b728;
extern long long g_a6b75c;
extern long long g_a6b77c;
extern long long g_a6b79c;
extern long long g_a6b7bc;
extern long long g_f08f10;
extern long long g_f08f30;
extern long long g_f08f40;
extern long long g_f08f50;
extern long long g_f08f60;
extern long long g_f08f70;
extern long long g_f08f80;
extern long long g_f08f90;
extern long long g_f08fa0;
extern long long g_f08fb0;
extern long long g_f08fc0;
extern long long g_f08fd0;
extern char g_f12dfc;
extern long long g_f12e08;
extern long long g_f12e10;
extern long long g_f12e18;
extern long long g_f12e28;
extern char g_f12e30;
extern char g_f12e34;
extern char g_f12e38;
extern char g_f12e3c;
extern char g_f12e40;
extern char g_f12e44;
extern char g_f12e48;
extern char g_f12e4c;
extern unsigned long long g_f12e50;
extern char g_f12e58;
extern char g_f12e5c;
extern char g_f12e60;
extern char g_f12e64;
extern char g_f12e68;

unsigned long long sub_a6afb8(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v3;  // w0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // w0
    unsigned long long v9;  // w21
    unsigned long long v10;  // x0
    char v0;  // [bp-0x48], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (g_f12dfc != 1)
    {
        v3 = (unsigned int)sub_a7c2a0(&g_f12e28, &v0, 0);
        if (v3 && !(a0 & ~v0))
            return 1;
        if (!sub_a7c208(&g_f08f10, &g_a6b4b4))
            return 0;
        if (!*(int *)&g_f12e30)
            return 0;
        if (!(a0 >> 18 & 1))
        {
            if (v3)
            {
LABEL_a6b080:
                if (!sub_a7c208())
                    return 0;
                if (*(int *)&g_f12e34)
                {
                    if (sub_a7c208(&g_f08f30, &g_a6b57c))
                    {
                        if (*(int *)&g_f12e38)
                        {
                            if (a0 & 1)
                            {
                                if (sub_a7c208(&g_f08f40, "(%"))
                                {
                                    if (!*(int *)&g_f12e3c)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 1 & 1)
                            {
                                if (sub_a7c208(&g_f08f40, &g_a6b5e8))
                                {
                                    if (!*(int *)&g_f12e3c)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 20 & 1)
                            {
                                if (sub_a7c208(&g_f08f50, "(%"))
                                {
                                    if (!g_f12e40)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 21 & 1)
                            {
                                if (sub_a7c208(&g_f08f50, &g_a6b644))
                                {
                                    if (!g_f12e40)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 4 & 1)
                            {
                                if (sub_a7c208(&g_f08f60, "(%"))
                                {
                                    if (!g_f12e44)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 2 & 1)
                            {
                                if (sub_a7c208(&g_f08f60, &g_a6b674))
                                {
                                    if (!g_f12e44)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 5 & 1)
                            {
                                if (sub_a7c208(&g_f08f70, "(%"))
                                {
                                    if (!g_f12e48)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 3 & 1)
                            {
                                if (sub_a7c208(&g_f08f70, &g_a6b6a4))
                                {
                                    if (!g_f12e48)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 0x11 & 1)
                            {
                                v5 = sub_a2f9e0();
                                if (!(unsigned int)v5)
                                    return v5;
                            }
                            if (a0 >> 7 & 1)
                            {
                                if (sub_a7c208(&g_f08f80, &g_a6b6c4))
                                {
                                    if (!*(int *)&g_f12e4c)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 6 & 1 && !sub_a7bbe0(&g_f12e18))
                            {
                                v6 = sub_a7bbe8(&g_f12e18, -0x1);
                                if (!(unsigned int)v6)
                                    return v6;
                                if (a1)
                                {
                                    v7 = sub_a7c198(g_f12e10);
                                    if (!(unsigned int)v7)
                                        return v7;
                                    g_f12e50 = a1;
                                    v8 = (unsigned int)sub_a7c208(&g_f08f80, &g_a6b704);
                                    v9 = *(int *)&g_f12e4c;
                                    g_f12e50 = 0;
                                    sub_a7c1b4(g_f12e10);
                                    if (!v8)
                                        return 0;
                                }
                                else
                                {
                                    v10 = sub_a7c208(&g_f08f80, &g_a6b6e4);
                                    if (!(unsigned int)v10)
                                        return v10;
                                    v9 = *(int *)&g_f12e4c;
                                }
                                if (1 > v9)
                                    return 0;
                            }
                            if (a0 >> 8 & 1)
                            {
                                if (sub_a7c208(&g_f08f90, &g_a6b728))
                                {
                                    if (!*(int *)&g_f12e58)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 11 & 1)
                            {
                                if (sub_a7c208(&g_f08fa0, &g_a6b75c))
                                {
                                    if (!g_f12e5c)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 9 & 1)
                            {
                                if (sub_a7c208(&g_f08fb0, &g_a6b77c))
                                {
                                    if (!g_f12e60)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 10 & 1)
                            {
                                if (sub_a7c208(&g_f08fc0, &g_a6b79c))
                                {
                                    if (!g_f12e64)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (a0 >> 14 & 1)
                            {
                                if (sub_a7c208(&g_f08fd0, &g_a6b7bc))
                                {
                                    if (!g_f12e68)
                                        return 0;
                                }
                                else
                                {
                                    return 0;
                                }
                            }
                            if (!(a0 & 0xfe00))
                                return sub_a7c284(&g_f12e28, a0, &v0, g_f12e08) != 0;
                            sub_a32b84();
                            return sub_a7c284(&g_f12e28, a0, &v0, g_f12e08) != 0;
                        }
                        else
                        {
                            return 0;
                        }
                    }
                    else
                    {
                        return 0;
                    }
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                v4 = sub_a7c2a0(&g_f12e28, &v0, g_f12e08);
                if (!(unsigned int)v4)
                    return v4;
                if (a0 & ~v0)
                    goto LABEL_a6b080;
            }
        }
        return 1;
    }
    else if (!(a0 >> 18 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/init.c", 504, "OPENSSL_init_crypto");
        sub_a36abc(15, 0xc0105, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
