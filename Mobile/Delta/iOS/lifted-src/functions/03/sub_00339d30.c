/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x339d30..0x33a67c (2380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_339d30_3 {
    struct st_339d30_6 *field_0;
} st_339d30_3;

typedef struct st_339d30_6 {
    struct st_339d30_3 *field_0;
} st_339d30_6;

typedef struct st_339d30_0 {
    char field_0;
} st_339d30_0;

typedef struct st_339d30_2 {
    unsigned long long field_0;
} st_339d30_2;

typedef struct st_339d30_1 {
    struct st_339d30_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_339d30_1;

extern st_339d30_1 g_f030c0;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern void g_f11ca0;
extern void g_f11ca8;
extern char g_10002b0;

long long sub_339d30(void)
{
    unsigned long v14;  // x0
    unsigned long long idx;  // x8
    unsigned long long v24;  // x3
    unsigned long long v25;  // x1
    unsigned long long v26;  // x3
    unsigned long long *v27;  // x8
    unsigned int *v16;  // x8
    unsigned long long v17;  // x1
    unsigned long long v18;  // x3
    unsigned long long v19;  // x1
    unsigned long long v20;  // x3
    unsigned long long v21;  // x1
    unsigned long long v22;  // x3
    unsigned long long v23;  // x1
    unsigned long v0;  // [bp-0x90]
    st_339d30_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_339d30_0 *v2;  // [bp-0x80]
    st_339d30_0 **v3;  // [bp-0x78], Other Possible Types: char
    st_339d30_0 *v4;  // [bp-0x70]
    unsigned int i;  // [bp-0x64]
    st_339d30_6 **v6;  // [bp-0x60]
    st_339d30_6 **j;  // [bp-0x58]
    char v8;  // [bp-0x50], Other Possible Types: unsigned long, double
    unsigned long v9;  // [bp-0x48]
    unsigned int v10;  // [bp-0x40]
    unsigned long v11;  // [bp-0x28]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    sub_3a1d60();
    if (*(long long *)&g_f11ca0)
    {
        v14 = *(long long *)&g_f11ca8;
        if (!*(long long *)&g_f11ca8)
        {
            v2 = &v1;
            v0 = 0x1700000000;
            v1 = &v2;
            v4 = &v3;
            v3 = &v4;
            i = 0;
            if (i)
            {
                idx = 23;
            }
            else
            {
                v16 = &v0 | 4;
                do
                {
                    if (g_f033e8 + g_f11c8a * 9 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 23.0;
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
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 23.0;
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
                        v16[i] = (unsigned int)v17 + v16[i] - ((unsigned int)v18 & v16[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        if (g_f033e8 + g_f11c8a * 24 != 3)
                        {
                            v6 = &j;
                            j = &v6;
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 24.0;
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
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 24.0;
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
                            v16[i] = (unsigned int)v19 + v16[i] - ((unsigned int)v20 & v16[i]) * 2;
                        }
                        if (g_f033e8 + g_f11c8a * 27 != 3)
                        {
                            v6 = &j;
                            j = &v6;
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 25.0;
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
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 25.0;
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
                            v16[i] = (unsigned int)v21 + v16[i] - ((unsigned int)v22 & v16[i]) * 2;
                        }
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                        {
                            v6 = &j;
                            j = &v6;
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 22);
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
                            v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 22);
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
                            v16[i] = (unsigned int)v23 + v16[i] - ((unsigned int)v24 & v16[i]) * 2;
                        }
                    }
                    if (g_f033e8 + g_f11c8a * 30 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 26.0;
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
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 26.0;
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                        {
                            v26 = 10;
                        }
                        else
                        {
                            v26 = g_f033e9 + 7;
                            if ((unsigned int)(v26 / g_f033ea) != g_f033eb)
                                v26 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        v16[i] = (unsigned int)v25 + v16[i] - ((unsigned int)v26 & v16[i]) * 2;
                    }
                    i += 1;
                } while (!i);
                idx = *(unsigned int *)((void*)&v0 + 4);
            }
            v27 = (&g_f030c0.field_0)[idx];
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v8 = (unsigned int)(2.955978307e-315 >> 0);
            j = 0;
            if (19 >= j)
            {
                do
                {
                    *(char *)(&v8 + j) = (char)((char)j + 166 + *(char *)(&v8 + j) - ((char)j + 166 & *(char *)(&v8 + j)) * 2) + 118;
                    j = (char *)j + 1;
                } while (j < 20);
            }
            v27();
        }
    }
    else
    {
        v14 = 0;
    }
    if (*(long long *)&g_10002b0 == v11)
        return v14;
    ___stack_chk_fail();
}
