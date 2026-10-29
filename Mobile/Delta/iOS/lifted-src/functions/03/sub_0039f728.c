/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39f728..0x3a0090 (2408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39f728_3 {
    struct st_39f728_6 *field_0;
} st_39f728_3;

typedef struct st_39f728_6 {
    struct st_39f728_3 *field_0;
} st_39f728_6;

typedef struct st_39f728_0 {
    char field_0;
} st_39f728_0;

typedef struct st_39f728_2 {
    unsigned long long field_0;
} st_39f728_2;

typedef struct st_39f728_1 {
    struct st_39f728_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_39f728_1;

extern st_39f728_1 g_f03070;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_39f728(void)
{
    unsigned long long idx;  // x8
    unsigned int *v17;  // x8
    unsigned long long v26;  // x5
    unsigned long long v27;  // x7
    unsigned long long *v28;  // x8
    unsigned long long v18;  // x5
    unsigned long long v19;  // x7
    unsigned long long v20;  // x5
    unsigned long long v21;  // x7
    unsigned long long v22;  // x5
    unsigned long long v23;  // x7
    unsigned long long v24;  // x5
    unsigned long long v25;  // x7
    unsigned long v0;  // [bp-0xb0]
    st_39f728_0 **v1;  // [bp-0xa8], Other Possible Types: char
    st_39f728_0 *v2;  // [bp-0xa0]
    st_39f728_0 **v3;  // [bp-0x98], Other Possible Types: char
    st_39f728_0 *v4;  // [bp-0x90]
    unsigned long long i;  // [bp-0x84]
    st_39f728_6 **v6;  // [bp-0x80]
    st_39f728_6 **j;  // [bp-0x78], Other Possible Types: unsigned long long
    char v8;  // [bp-0x70], Other Possible Types: double
    unsigned short v9;  // [bp-0x60]
    char v10;  // [bp-0x5e]
    unsigned long long v11;  // [bp-0x5d]
    unsigned long long v12;  // [bp-0x56]
    unsigned long v13;  // [bp-0x38]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    if (sub_3629b0())
    {
        v0 = 0xffffff9800000000;
        v2 = &v1;
        v1 = &v2;
        v4 = &v3;
        v3 = &v4;
        i = 0;
        if (i)
        {
            idx = 0xffffff98;
        }
        else
        {
            v17 = &v0 | 4;
            do
            {
                if (g_f033e8 + g_f11c8a * 9 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -103.0;
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
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -103.0;
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
                    v17[i] = (unsigned int)v18 + v17[i] - ((unsigned int)v19 & v17[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    if (g_f033e8 + g_f11c8a * 24 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -102.0;
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
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -102.0;
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
                        v17[i] = (unsigned int)v20 + v17[i] - ((unsigned int)v21 & v17[i]) * 2;
                    }
                    if (g_f033e8 + g_f11c8a * 27 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -101.0;
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
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -101.0;
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
                        v17[i] = (unsigned int)v22 + v17[i] - ((unsigned int)v23 & v17[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 104);
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
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 104);
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
                        v17[i] = (unsigned int)v24 + v17[i] - ((unsigned int)v25 & v17[i]) * 2;
                    }
                }
                if (g_f033e8 + g_f11c8a * 30 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -100.0;
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
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -100.0;
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                    {
                        v27 = 10;
                    }
                    else
                    {
                        v27 = g_f033e9 + 7;
                        if ((unsigned int)(v27 / g_f033ea) != g_f033eb)
                            v27 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    v17[i] = (unsigned int)v26 + v17[i] - ((unsigned int)v27 & v17[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v28 = (&g_f03070.field_0)[idx];
        v8 = 0xd3d2cacecfc8c633ccd3d82ac7c1deda;
        v9 = 52185;
        v10 = 66;
        v11 = 0;
        v12 = 0;
        j = 0;
        if (33 >= j)
        {
            do
            {
                (&v8)[j] = (char)j + 78 + (&v8)[j] - ((char)j + 78 & (&v8)[j]) * 2 - 0x22;
                j += 1;
            } while (j < 0x22);
        }
        v28();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v13)
            return;
        ___stack_chk_fail();
    }
}
