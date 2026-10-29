/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ae784..0x3afccc (5448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ae784_3 {
    struct st_3ae784_6 *field_0;
} st_3ae784_3;

typedef struct st_3ae784_6 {
    struct st_3ae784_3 *field_0;
} st_3ae784_6;

typedef struct st_3ae784_0 {
    char field_0;
} st_3ae784_0;

typedef struct st_3ae784_2 {
    unsigned long long field_0;
} st_3ae784_2;

typedef struct st_3ae784_1 {
    struct st_3ae784_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3ae784_1;

extern st_3ae784_1 g_f02f30;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

unsigned long long sub_3ae784(void)
{
    long long v15;  // x0
    unsigned long long str;  // x0
    unsigned long long v25;  // x6
    unsigned long long v26;  // x21
    unsigned long long v27;  // x6
    unsigned long long v28;  // x21
    unsigned long long *v29;  // x8
    unsigned long long idx;  // x8
    unsigned int *v18;  // x8
    unsigned long long v19;  // x6
    unsigned long long v20;  // x21
    unsigned long long v21;  // x6
    unsigned long long v22;  // x21
    unsigned long long v23;  // x6
    unsigned long long v24;  // x21
    unsigned long v0;  // [bp-0xd8], Other Possible Types: unsigned long long
    st_3ae784_0 **v1;  // [bp-0xd0], Other Possible Types: char
    st_3ae784_0 *v2;  // [bp-0xc8]
    st_3ae784_0 **v3;  // [bp-0xc0], Other Possible Types: char
    st_3ae784_0 *v4;  // [bp-0xb8]
    unsigned long long i;  // [bp-0xac]
    st_3ae784_6 **v6;  // [bp-0xa8]
    double v7;  // [bp-0xa0]
    char v8;  // [bp-0x98]
    unsigned long long v9;  // [bp-0x97]
    unsigned long long v10;  // [bp-0x8f]
    st_3ae784_6 **j;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v15 = _objc_autoreleasePoolPush();
    if (sub_3bafec(v15))
    {
        if (sub_3a9030())
            str = _strdup();
        else
            str = 0;
        _objc_autoreleasePoolPop(v15);
        if (*(long long *)&g_10002b0 == v12)
            return str;
        ___stack_chk_fail();
    }
    else
    {
        v0 = 0xffffffa500000000;
        v2 = &v1;
        v1 = &v2;
        v4 = &v3;
        v3 = &v4;
        i = 0;
        if (i)
        {
            idx = 0xffffffa5;
        }
        else
        {
            v18 = &v0 | 4;
            do
            {
                if (g_f03818 + g_f11cfa * 24 != 3)
                {
                    j = &v6;
                    v6 = &j;
                    v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -94.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v19 = g_f03819 + 7;
                        if ((unsigned int)(v19 / g_f0381a) != g_f0381b)
                            v19 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v19 = 1;
                    }
                    j = &v6;
                    v6 = &j;
                    v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -94.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v20 = g_f03819 + 7;
                        if ((unsigned int)(v20 / g_f0381a) != g_f0381b)
                            v20 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v20 = 1;
                    }
                    v18[i] = (unsigned int)v19 + v18[i] - ((unsigned int)v20 & v18[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    if (g_f03818 + g_f11cfa * 27 != 3)
                    {
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -93.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v21 = g_f03819 + 7;
                            if ((unsigned int)(v21 / g_f0381a) != g_f0381b)
                                v21 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v21 = 1;
                        }
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -93.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v22 = g_f03819 + 7;
                            if ((unsigned int)(v22 / g_f0381a) != g_f0381b)
                                v22 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v22 = 1;
                        }
                        v18[i] = (unsigned int)v21 + v18[i] - ((unsigned int)v22 & v18[i]) * 2;
                    }
                    if (g_f03818 + g_f11cfa * 12 != 3)
                    {
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -92.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v23 = g_f03819 + 7;
                            if ((unsigned int)(v23 / g_f0381a) != g_f0381b)
                                v23 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v23 = 1;
                        }
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -92.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v24 = g_f03819 + 7;
                            if ((unsigned int)(v24 / g_f0381a) != g_f0381b)
                                v24 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v24 = 1;
                        }
                        v18[i] = (unsigned int)v23 + v18[i] - ((unsigned int)v24 & v18[i]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 95);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v25 = g_f03819 + 7;
                            if ((unsigned int)(v25 / g_f0381a) != g_f0381b)
                                v25 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v25 = 1;
                        }
                        j = &v6;
                        v6 = &j;
                        v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 95);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v26 = g_f03819 + 7;
                            if ((unsigned int)(v26 / g_f0381a) != g_f0381b)
                                v26 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v26 = 1;
                        }
                        v18[i] = (unsigned int)v25 + v18[i] - ((unsigned int)v26 & v18[i]) * 2;
                    }
                }
                if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
                {
                    j = &v6;
                    v6 = &j;
                    v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -91.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v27 = g_f03819 + 7;
                        if ((unsigned int)(v27 / g_f0381a) != g_f0381b)
                            v27 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v27 = 1;
                    }
                    j = &v6;
                    v6 = &j;
                    v7 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -91.0;
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                    {
                        v28 = 1;
                    }
                    else
                    {
                        v28 = g_f03819 + 7;
                        if ((unsigned int)(v28 / g_f0381a) != g_f0381b)
                            v28 = (int)(v7 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    v18[i] = (unsigned int)v27 + v18[i] - ((unsigned int)v28 & v18[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v0 = 1;
        v29 = (&g_f02f30.field_0)[idx];
        v7 = -2.4285799838703325e-54;
        v8 = 206;
        v9 = 0;
        v10 = 0;
        j = 0;
        if (0x11 >= j)
        {
            do
            {
                *((char *)&v7 + j) = (char)((char)j + 57 + *((char *)&v7 + j) - ((char)j + 57 & *((char *)&v7 + j)) * 2) + 113;
                j += 1;
            } while (j < 18);
        }
        v29();
    }
}
