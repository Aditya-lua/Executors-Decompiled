/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x353904..0x354258 (2388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_353904_3 {
    struct st_353904_6 *field_0;
} st_353904_3;

typedef struct st_353904_6 {
    struct st_353904_3 *field_0;
} st_353904_6;

typedef struct st_353904_0 {
    char field_0;
} st_353904_0;

typedef struct st_353904_2 {
    unsigned long long field_0;
} st_353904_2;

typedef struct st_353904_1 {
    struct st_353904_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_353904_1;

extern st_353904_1 g_f03070;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern void g_f0d410;
extern char g_f11c8a;
extern char g_10002b0;

void sub_353904(void)
{
    unsigned long long idx;  // x8
    unsigned int *v14;  // x8
    unsigned long long v23;  // x5
    unsigned long long v24;  // x7
    unsigned long long *v25;  // x8
    unsigned long long v15;  // x5
    unsigned long long v16;  // x7
    unsigned long long v17;  // x5
    unsigned long long v18;  // x7
    unsigned long long v19;  // x5
    unsigned long long v20;  // x7
    unsigned long long v21;  // x5
    unsigned long long v22;  // x7
    unsigned long v0;  // [bp-0xa0]
    st_353904_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_353904_0 *v2;  // [bp-0x90]
    st_353904_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_353904_0 *v4;  // [bp-0x80]
    unsigned int i;  // [bp-0x74]
    st_353904_6 **v6;  // [bp-0x70]
    st_353904_6 **j;  // [bp-0x68]
    char v8;  // [bp-0x60], Other Possible Types: double
    unsigned int v9;  // [bp-0x50]
    unsigned long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    if (*(long long *)&g_f0d410)
    {
        v0 = 0xffffffd800000000;
        v2 = &v1;
        v1 = &v2;
        v4 = &v3;
        v3 = &v4;
        i = 0;
        if (i)
        {
            idx = 0xffffffd8;
        }
        else
        {
            v14 = &v0 | 4;
            do
            {
                if (g_f033e8 + g_f11c8a * 9 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -39.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v15 = g_f033e9 + 7;
                        if ((unsigned int)(v15 / g_f033ea) != g_f033eb)
                            v15 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v15 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -39.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v16 = g_f033e9 + 7;
                        if ((unsigned int)(v16 / g_f033ea) != g_f033eb)
                            v16 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v16 = 10;
                    }
                    v14[i] = (unsigned int)v15 + v14[i] - ((unsigned int)v16 & v14[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    if (g_f033e8 + g_f11c8a * 24 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -38.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v17 = g_f033e9 + 7;
                            if ((unsigned int)(v17 / g_f033ea) != g_f033eb)
                                v17 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v17 = 10;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -38.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v18 = g_f033e9 + 7;
                            if ((unsigned int)(v18 / g_f033ea) != g_f033eb)
                                v18 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v18 = 10;
                        }
                        v14[i] = (unsigned int)v17 + v14[i] - ((unsigned int)v18 & v14[i]) * 2;
                    }
                    if (g_f033e8 + g_f11c8a * 27 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -37.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v19 = g_f033e9 + 7;
                            if ((unsigned int)(v19 / g_f033ea) != g_f033eb)
                                v19 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v19 = 10;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -37.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v20 = g_f033e9 + 7;
                            if ((unsigned int)(v20 / g_f033ea) != g_f033eb)
                                v20 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v20 = 10;
                        }
                        v14[i] = (unsigned int)v19 + v14[i] - ((unsigned int)v20 & v14[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 40);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v21 = g_f033e9 + 7;
                            if ((unsigned int)(v21 / g_f033ea) != g_f033eb)
                                v21 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v21 = 10;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 40);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v22 = g_f033e9 + 7;
                            if ((unsigned int)(v22 / g_f033ea) != g_f033eb)
                                v22 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v22 = 10;
                        }
                        v14[i] = (unsigned int)v21 + v14[i] - ((unsigned int)v22 & v14[i]) * 2;
                    }
                }
                if (g_f033e8 + g_f11c8a * 30 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -36.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v23 = g_f033e9 + 7;
                        if ((unsigned int)(v23 / g_f033ea) != g_f033eb)
                            v23 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v23 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -36.0;
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                    {
                        v24 = 10;
                    }
                    else
                    {
                        v24 = g_f033e9 + 7;
                        if ((unsigned int)(v24 / g_f033ea) != g_f033eb)
                            v24 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    v14[i] = (unsigned int)v23 + v14[i] - ((unsigned int)v24 & v14[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v25 = (&g_f03070.field_0)[idx];
        v8 = 0x571e2925d72020252b2424391bcc3ecb;
        v9 = 0;
        j = 0;
        if (19 >= j)
        {
            do
            {
                *(char *)(&v8 + j) = (char)((char)j + 203 + *(char *)(&v8 + j) - ((char)j + 203 & *(char *)(&v8 + j)) * 2) + 115;
                j = (char *)j + 1;
            } while (j < 20);
        }
        v25();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v10)
            return;
        ___stack_chk_fail();
    }
}
