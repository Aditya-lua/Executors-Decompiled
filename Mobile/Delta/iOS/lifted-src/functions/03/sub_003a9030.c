/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a9030..0x3a9970 (2368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a9030_3 {
    struct st_3a9030_6 *field_0;
} st_3a9030_3;

typedef struct st_3a9030_6 {
    struct st_3a9030_3 *field_0;
} st_3a9030_6;

typedef struct st_3a9030_0 {
    char field_0;
} st_3a9030_0;

typedef struct st_3a9030_2 {
    unsigned long long field_0;
} st_3a9030_2;

typedef struct st_3a9030_1 {
    struct st_3a9030_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a9030_1;

extern st_3a9030_1 g_f02fd0;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3a9030(unsigned long long a0)
{
    unsigned long long idx;  // x8
    unsigned int *v17;  // x8
    unsigned long long v26;  // x6
    unsigned long long v27;  // x20
    unsigned long long *v28;  // x8
    unsigned long long v18;  // x6
    unsigned long long v19;  // x20
    unsigned long long v20;  // x6
    unsigned long long v21;  // x20
    unsigned long long v22;  // x6
    unsigned long long v23;  // x20
    unsigned long long v24;  // x6
    unsigned long long v25;  // x20
    unsigned long v0;  // [bp-0xa0]
    st_3a9030_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_3a9030_0 *v2;  // [bp-0x90]
    st_3a9030_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_3a9030_0 *v4;  // [bp-0x80]
    unsigned long long i;  // [bp-0x74]
    st_3a9030_6 **v6;  // [bp-0x70]
    st_3a9030_6 **j;  // [bp-0x68], Other Possible Types: unsigned long long
    double v8;  // [bp-0x60]
    unsigned short v9;  // [bp-0x58]
    char v10;  // [bp-0x56]
    unsigned long long v11;  // [bp-0x55]
    unsigned long long v12;  // [bp-0x4e]
    unsigned long v13;  // [bp-0x38]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    if (a0)
    {
        v0 = 0xffffff8900000000;
        v2 = &v1;
        v1 = &v2;
        v4 = &v3;
        v3 = &v4;
        i = 0;
        if (i)
        {
            idx = 0xffffff89;
        }
        else
        {
            v17 = &v0 | 4;
            do
            {
                if (g_f03818 + g_f11cfa * 24 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -126.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v18 = g_f03819 + 7;
                        if ((unsigned int)(v18 / g_f0381a) != g_f0381b)
                            v18 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v18 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -126.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v19 = g_f03819 + 7;
                        if ((unsigned int)(v19 / g_f0381a) != g_f0381b)
                            v19 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v19 = 1;
                    }
                    v17[i] = (unsigned int)v18 + v17[i] - ((unsigned int)v19 & v17[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    if (g_f03818 + g_f11cfa * 27 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -125.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v20 = g_f03819 + 7;
                            if ((unsigned int)(v20 / g_f0381a) != g_f0381b)
                                v20 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v20 = 1;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -125.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v21 = g_f03819 + 7;
                            if ((unsigned int)(v21 / g_f0381a) != g_f0381b)
                                v21 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v21 = 1;
                        }
                        v17[i] = (unsigned int)v20 + v17[i] - ((unsigned int)v21 & v17[i]) * 2;
                    }
                    if (g_f03818 + g_f11cfa * 12 != 3)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v22 = g_f03819 + 7;
                            if ((unsigned int)(v22 / g_f0381a) != g_f0381b)
                                v22 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v22 = 1;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v23 = g_f03819 + 7;
                            if ((unsigned int)(v23 / g_f0381a) != g_f0381b)
                                v23 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v23 = 1;
                        }
                        v17[i] = (unsigned int)v22 + v17[i] - ((unsigned int)v23 & v17[i]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 127);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v24 = g_f03819 + 7;
                            if ((unsigned int)(v24 / g_f0381a) != g_f0381b)
                                v24 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v24 = 1;
                        }
                        v6 = &j;
                        j = &v6;
                        v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 127);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v25 = g_f03819 + 7;
                            if ((unsigned int)(v25 / g_f0381a) != g_f0381b)
                                v25 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v25 = 1;
                        }
                        v17[i] = (unsigned int)v24 + v17[i] - ((unsigned int)v25 & v17[i]) * 2;
                    }
                }
                if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -123.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v26 = g_f03819 + 7;
                        if ((unsigned int)(v26 / g_f0381a) != g_f0381b)
                            v26 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v26 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -123.0;
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                    {
                        v27 = 1;
                    }
                    else
                    {
                        v27 = g_f03819 + 7;
                        if ((unsigned int)(v27 / g_f0381a) != g_f0381b)
                            v27 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    v17[i] = (unsigned int)v26 + v17[i] - ((unsigned int)v27 & v17[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v28 = (&g_f02fd0.field_0)[idx];
        v8 = -6.7056399451578244e+274;
        v9 = 1276;
        v10 = 108;
        v11 = 0;
        v12 = 0;
        j = 0;
        if (21 >= j)
        {
            do
            {
                *((char *)&v8 + j) = (char)((char)j + 241 + *((char *)&v8 + j) - ((char)j + 241 & *((char *)&v8 + j)) * 2) + 105;
                j += 1;
            } while (j < 22);
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
