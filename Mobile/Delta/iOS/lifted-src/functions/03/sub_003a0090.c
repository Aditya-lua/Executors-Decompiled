/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a0090..0x3a0a4c (2492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a0090_3 {
    struct st_3a0090_6 *field_0;
} st_3a0090_3;

typedef struct st_3a0090_6 {
    struct st_3a0090_3 *field_0;
} st_3a0090_6;

typedef struct st_3a0090_0 {
    char field_0;
} st_3a0090_0;

typedef struct st_3a0090_2 {
    unsigned long long field_0;
} st_3a0090_2;

typedef struct st_3a0090_1 {
    struct st_3a0090_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a0090_1;

extern st_3a0090_1 g_f03070;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern unsigned long long g_f0d3e8;
extern void g_f0d3f0;
extern unsigned long long g_f0d3f8;
extern unsigned long long g_f0d400;
extern unsigned long long g_f0d408;
extern unsigned long long g_f0d410;
extern unsigned long long g_f0d418;
extern unsigned long long g_f0d420;
extern char g_f0d428;
extern char g_f0d429;
extern char g_f11c8a;
extern char g_10002b0;

void sub_3a0090(void)
{
    unsigned long long idx;  // x8
    unsigned int *v18;  // x8
    unsigned long long v27;  // x5
    unsigned long long v28;  // x7
    unsigned long long *v29;  // x8
    unsigned long long v19;  // x5
    unsigned long long v20;  // x7
    unsigned long long v21;  // x5
    unsigned long long v22;  // x7
    unsigned long long v23;  // x5
    unsigned long long v24;  // x7
    unsigned long long v25;  // x5
    unsigned long long v26;  // x7
    st_3a0090_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_3a0090_0 *v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0xb0]
    st_3a0090_0 **v3;  // [bp-0xa8], Other Possible Types: char
    st_3a0090_0 *v4;  // [bp-0xa0]
    st_3a0090_0 **v5;  // [bp-0x98], Other Possible Types: char
    st_3a0090_0 *v6;  // [bp-0x90]
    unsigned int i;  // [bp-0x84]
    st_3a0090_6 **v8;  // [bp-0x80]
    st_3a0090_6 **j;  // [bp-0x78]
    char v10;  // [bp-0x70], Other Possible Types: double
    unsigned int v11;  // [bp-0x60]
    unsigned long v12;  // [bp-0x5c]
    unsigned long v13;  // [bp-0x55]
    unsigned long v14;  // [bp-0x38]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*(long long *)&g_f0d3f0)
    {
        v2 = 0xffffffbf00000000;
        v4 = &v3;
        v3 = &v4;
        v6 = &v5;
        v5 = &v6;
        i = 0;
        if (i)
        {
            idx = 0xffffffbf;
        }
        else
        {
            v18 = &v2 | 4;
            do
            {
                if (g_f033e8 + g_f11c8a * 9 != 3)
                {
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -64.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v19 = g_f033e9 + 7;
                        if ((unsigned int)(v19 / g_f033ea) != g_f033eb)
                            v19 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v19 = 10;
                    }
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -64.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v20 = g_f033e9 + 7;
                        if ((unsigned int)(v20 / g_f033ea) != g_f033eb)
                            v20 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -63.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v21 = g_f033e9 + 7;
                            if ((unsigned int)(v21 / g_f033ea) != g_f033eb)
                                v21 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v21 = 10;
                        }
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -63.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v22 = g_f033e9 + 7;
                            if ((unsigned int)(v22 / g_f033ea) != g_f033eb)
                                v22 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v22 = 10;
                        }
                        v18[i] = (unsigned int)v21 + v18[i] - ((unsigned int)v22 & v18[i]) * 2;
                    }
                    if (g_f033e8 + g_f11c8a * 27 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -62.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v23 = g_f033e9 + 7;
                            if ((unsigned int)(v23 / g_f033ea) != g_f033eb)
                                v23 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v23 = 10;
                        }
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -62.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v24 = g_f033e9 + 7;
                            if ((unsigned int)(v24 / g_f033ea) != g_f033eb)
                                v24 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v24 = 10;
                        }
                        v18[i] = (unsigned int)v23 + v18[i] - ((unsigned int)v24 & v18[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 65);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v25 = g_f033e9 + 7;
                            if ((unsigned int)(v25 / g_f033ea) != g_f033eb)
                                v25 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v25 = 10;
                        }
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 65);
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v26 = g_f033e9 + 7;
                            if ((unsigned int)(v26 / g_f033ea) != g_f033eb)
                                v26 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
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
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -61.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v27 = g_f033e9 + 7;
                        if ((unsigned int)(v27 / g_f033ea) != g_f033eb)
                            v27 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v27 = 10;
                    }
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -61.0;
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                    {
                        v28 = 10;
                    }
                    else
                    {
                        v28 = g_f033e9 + 7;
                        if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                            v28 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    v18[i] = (unsigned int)v27 + v18[i] - ((unsigned int)v28 & v18[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v2 + 4);
        }
        v29 = (&g_f03070.field_0)[idx];
        v10 = 0xb5485c484e6d5857517c44aa505f485a;
        v11 = (unsigned int)(4.287426443e-315 >> 0);
        v12 = 0;
        v13 = 0;
        j = 0;
        if (0x22 >= j)
        {
            do
            {
                *(char *)(&v10 + j) = (char)((char)j + 166 + *(char *)(&v10 + j) - ((char)j + 166 & *(char *)(&v10 + j)) * 2) + 118;
                j = (char *)j + 1;
            } while (j < 35);
        }
        v29();
    }
    else
    {
        *(unsigned long long *)&g_f0d3f0 = 0;
        g_f0d3f8 = 0;
        g_f0d400 = 0;
        g_f0d408 = 0;
        g_f0d410 = 0;
        g_f0d3e8 = 0;
        g_f0d418 = 0;
        g_f0d420 = 0;
        g_f0d428 = 0;
        g_f0d429 = 0;
        if (*(long long *)&g_10002b0 == v14)
            return;
        ___stack_chk_fail();
    }
}
