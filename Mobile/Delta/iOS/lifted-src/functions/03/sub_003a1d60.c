/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a1d60..0x3a3870 (6928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a1d60_3 {
    struct st_3a1d60_6 *field_0;
} st_3a1d60_3;

typedef struct st_3a1d60_6 {
    struct st_3a1d60_3 *field_0;
} st_3a1d60_6;

typedef struct st_3a1d60_0 {
    char field_0;
} st_3a1d60_0;

typedef struct st_3a1d60_2 {
    unsigned long long field_0;
} st_3a1d60_2;

typedef struct st_3a1d60_1 {
    struct st_3a1d60_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a1d60_1;

extern st_3a1d60_1 g_f032f0;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern void g_f11ca0;
extern char g_10002b0;

void sub_3a1d60(void)
{
    unsigned long long idx;  // x8
    unsigned int *v18;  // x8
    unsigned long long v27;  // x1
    unsigned long long v28;  // x3
    unsigned long long *v29;  // x8
    unsigned long long v19;  // x1
    unsigned long long v20;  // x3
    unsigned long long v21;  // x1
    unsigned long long v22;  // x3
    unsigned long long v23;  // x1
    unsigned long long v24;  // x3
    unsigned long long v25;  // x1
    unsigned long long v26;  // x3
    char v0;  // [bp-0xa0], Other Possible Types: unsigned long
    st_3a1d60_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_3a1d60_0 *v2;  // [bp-0x90]
    st_3a1d60_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_3a1d60_0 *v4;  // [bp-0x80]
    unsigned int i;  // [bp-0x74]
    st_3a1d60_6 **v6;  // [bp-0x70]
    st_3a1d60_6 **j;  // [bp-0x68]
    char v8;  // [bp-0x60], Other Possible Types: double
    unsigned int v9;  // [bp-0x50]
    char v10;  // [bp-0x4c]
    unsigned long v11;  // [bp-0x4b]
    unsigned long v12;  // [bp-0x43]
    unsigned long v13;  // [bp-0x3b]
    unsigned long v14;  // [bp-0x28]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    if (!*(long long *)&g_f11ca0)
    {
        v2 = &v1;
        v0 = 73014444032;
        v1 = &v2;
        v4 = &v3;
        v3 = &v4;
        i = 0;
        if (i)
        {
            idx = 0x11;
        }
        else
        {
            v18 = &v0 | 4;
            do
            {
                if (g_f033e8 + g_f11c8a * 9 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 20.0;
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
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 20.0;
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
                    v18[i] = (unsigned int)v19 + v18[i] - ((unsigned int)v20 & v18[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    if (g_f033e8 + g_f11c8a * 24 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 21.0;
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
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 21.0;
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
                        v18[i] = (unsigned int)v21 + v18[i] - ((unsigned int)v22 & v18[i]) * 2;
                    }
                    if (g_f033e8 + g_f11c8a * 27 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 22.0;
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
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 22.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v24 = g_f033e9 + 7;
                            if ((unsigned int)(v24 / g_f033ea) != g_f033eb)
                                v24 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v24 = 10;
                        }
                        v18[i] = (unsigned int)v23 + v18[i] - ((unsigned int)v24 & v18[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 19);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v25 = g_f033e9 + 7;
                            if ((unsigned int)(v25 / g_f033ea) != g_f033eb)
                                v25 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v25 = 10;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 19);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v26 = g_f033e9 + 7;
                            if ((unsigned int)(v26 / g_f033ea) != g_f033eb)
                                v26 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v26 = 10;
                        }
                        v18[i] = (unsigned int)v25 + v18[i] - ((unsigned int)v26 & v18[i]) * 2;
                    }
                }
                if (g_f033e8 + g_f11c8a * 30 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 23.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v27 = g_f033e9 + 7;
                        if ((unsigned int)(v27 / g_f033ea) != g_f033eb)
                            v27 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v27 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 23.0;
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                    {
                        v28 = 10;
                    }
                    else
                    {
                        v28 = g_f033e9 + 7;
                        if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                            v28 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    v18[i] = (unsigned int)v27 + v18[i] - ((unsigned int)v28 & v18[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v0 = 1;
        v29 = (&g_f032f0.field_0)[idx];
        v8 = 0xaabdafd3aeb6aa819493938def8281f1;
        v9 = (unsigned int)(1.4725916937e-314 >> 0);
        v10 = 4;
        v11 = 0;
        v13 = 0;
        v12 = 0;
        j = 0;
        if (44 >= j)
        {
            do
            {
                *(char *)(&v8 + j) = (char)((char)j + 216 + *(char *)(&v8 + j) - ((char)j + 216 & *(char *)(&v8 + j)) * 2) + 24;
                j = (char *)j + 1;
            } while (j < 45);
        }
        v29();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v14)
            return;
        ___stack_chk_fail();
    }
}
