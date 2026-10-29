/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x33d3d8..0x34099c (13764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_33d3d8_3 {
    struct st_33d3d8_6 *field_0;
} st_33d3d8_3;

typedef struct st_33d3d8_6 {
    struct st_33d3d8_3 *field_0;
} st_33d3d8_6;

typedef struct st_33d3d8_0 {
    char field_0;
} st_33d3d8_0;

typedef struct st_33d3d8_2 {
    unsigned long long field_0;
} st_33d3d8_2;

typedef struct st_33d3d8_1 {
    struct st_33d3d8_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_33d3d8_1;

extern st_33d3d8_1 g_f03250;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c88;
extern char g_f11c8a;
extern char g_10002b0;

void sub_33d3d8(void)
{
    unsigned long long idx;  // x9
    unsigned int *v19;  // x9
    unsigned long long v28;  // x2
    unsigned long long v29;  // x4
    unsigned long long *v30;  // x8
    unsigned long long v20;  // x2
    unsigned long long v21;  // x4
    unsigned long long v22;  // x2
    unsigned long long v23;  // x4
    unsigned long long v24;  // x2
    unsigned long long v25;  // x4
    unsigned long long v26;  // x2
    unsigned long long v27;  // x4
    st_33d3d8_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_33d3d8_0 *v1;  // [bp-0xc8]
    char v2;  // [bp-0xc0], Other Possible Types: unsigned long
    st_33d3d8_0 **v3;  // [bp-0xb8], Other Possible Types: char
    st_33d3d8_0 *v4;  // [bp-0xb0]
    st_33d3d8_0 **v5;  // [bp-0xa8], Other Possible Types: char
    st_33d3d8_0 *v6;  // [bp-0xa0]
    char i;  // [bp-0x94]
    st_33d3d8_6 **v8;  // [bp-0x90]
    st_33d3d8_6 **j;  // [bp-0x88]
    double v10;  // [bp-0x80]
    unsigned int v11;  // [bp-0x78]
    unsigned short v12;  // [bp-0x74]
    char v13;  // [bp-0x72]
    char v14;  // [bp-0x6b]
    unsigned long v15;  // [bp-0x28]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(g_f11c88 & 1))
    {
        g_f11c88 = 1;
        v4 = &v3;
        v2 = 0xa00000000;
        v3 = &v4;
        v6 = &v5;
        v5 = &v6;
        i = 0;
        if (i)
        {
            idx = 10;
        }
        else
        {
            v19 = &v2 | 4;
            do
            {
                if (g_f033e8 + g_f11c8a * 9 != 3)
                {
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 13.0;
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
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 13.0;
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
                    v19[i] = (unsigned int)v20 + v19[i] - ((unsigned int)v21 & v19[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    if (g_f033e8 + g_f11c8a * 24 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 14.0;
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 14.0;
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
                        v19[i] = (unsigned int)v22 + v19[i] - ((unsigned int)v23 & v19[i]) * 2;
                    }
                    if (g_f033e8 + g_f11c8a * 27 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 15.0;
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 15.0;
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
                        v19[i] = (unsigned int)v24 + v19[i] - ((unsigned int)v25 & v19[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 12);
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 12);
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
                        v19[i] = (unsigned int)v26 + v19[i] - ((unsigned int)v27 & v19[i]) * 2;
                    }
                }
                if (g_f033e8 + g_f11c8a * 30 != 3)
                {
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 16.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v28 = g_f033e9 + 7;
                        if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                            v28 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v28 = 10;
                    }
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 16.0;
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                    {
                        v29 = 10;
                    }
                    else
                    {
                        v29 = g_f033e9 + 7;
                        if ((unsigned int)(v29 / g_f033ea) != g_f033eb)
                            v29 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    v19[i] = (unsigned int)v28 + v19[i] - ((unsigned int)v29 & v19[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v2 + 4);
        }
        v2 = 1;
        v30 = (&g_f03250.field_0)[idx];
        v10 = 2.8873448491952364e+253;
        v11 = (unsigned int)(1.098674686e-314 >> 0);
        v12 = 3482;
        v13 = 0;
        v14 = 0;
        j = 0;
        if (28 >= j)
        {
            do
            {
                *(char *)(&v10 + j) = (char)((char)j + 132 + *(char *)(&v10 + j) - ((char)j + 132 & *(char *)(&v10 + j)) * 2) + 100;
                j = (char *)j + 1;
            } while (j < 29);
        }
        v30();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v15)
            return;
        ___stack_chk_fail();
    }
}
