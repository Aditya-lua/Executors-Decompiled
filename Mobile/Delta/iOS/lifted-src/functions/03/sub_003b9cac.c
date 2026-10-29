/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b9cac..0x3baf04 (4696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b9cac_3 {
    struct st_3b9cac_6 *field_0;
} st_3b9cac_3;

typedef struct st_3b9cac_6 {
    struct st_3b9cac_3 *field_0;
} st_3b9cac_6;

typedef struct st_3b9cac_0 {
    char field_0;
} st_3b9cac_0;

typedef struct st_3b9cac_2 {
    unsigned long long field_0;
} st_3b9cac_2;

typedef struct st_3b9cac_1 {
    struct st_3b9cac_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3b9cac_1;

extern st_3b9cac_1 g_f032a0;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3b9cac(unsigned long long a0)
{
    unsigned long long idx;  // x9
    unsigned int *v17;  // x9
    unsigned long long v26;  // x7
    unsigned long long v27;  // x22
    unsigned long long *v28;  // x9
    unsigned long long v18;  // x7
    unsigned long long v19;  // x22
    unsigned long long v20;  // x7
    unsigned long long v21;  // x22
    unsigned long long v22;  // x7
    unsigned long long v23;  // x22
    unsigned long long v24;  // x7
    unsigned long long v25;  // x22
    unsigned long v0;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long long i;  // [bp-0xd8]
    st_3b9cac_0 **v2;  // [bp-0xd0], Other Possible Types: char
    st_3b9cac_0 *v3;  // [bp-0xc8]
    st_3b9cac_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_3b9cac_0 *v5;  // [bp-0xb0]
    st_3b9cac_6 **v6;  // [bp-0xa8]
    unsigned long long j;  // [bp-0xa0], Other Possible Types: double
    st_3b9cac_6 **v8;  // [bp-0x70]
    double v9;  // [bp-0x70]
    char v10;  // [bp-0x68]
    unsigned long long v11;  // [bp-0x67]
    unsigned long long v12;  // [bp-0x5f]
    unsigned long v13;  // [bp-0x48]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    if (a0)
    {
        v0 = 0xffffff8a00000000;
        v3 = &v2;
        v2 = &v3;
        v5 = &v4;
        v4 = &v5;
        i = 0;
        if (i)
        {
            idx = 0xffffff8a;
        }
        else
        {
            v17 = &v0 | 4;
            do
            {
                if (g_f03818 + g_f11cfa * 24 != 3)
                {
                    v8 = &v6;
                    v6 = &v8;
                    j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v18 = g_f03819 + 7;
                        if ((unsigned int)(v18 / g_f0381a) != g_f0381b)
                            v18 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v18 = 1;
                    }
                    v8 = &v6;
                    v6 = &v8;
                    j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v19 = g_f03819 + 7;
                        if ((unsigned int)(v19 / g_f0381a) != g_f0381b)
                            v19 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
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
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -123.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v20 = g_f03819 + 7;
                            if ((unsigned int)(v20 / g_f0381a) != g_f0381b)
                                v20 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v20 = 1;
                        }
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -123.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v21 = g_f03819 + 7;
                            if ((unsigned int)(v21 / g_f0381a) != g_f0381b)
                                v21 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v21 = 1;
                        }
                        v17[i] = (unsigned int)v20 + v17[i] - ((unsigned int)v21 & v17[i]) * 2;
                    }
                    if (g_f03818 + g_f11cfa * 12 != 3)
                    {
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -122.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v22 = g_f03819 + 7;
                            if ((unsigned int)(v22 / g_f0381a) != g_f0381b)
                                v22 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v22 = 1;
                        }
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -122.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v23 = g_f03819 + 7;
                            if ((unsigned int)(v23 / g_f0381a) != g_f0381b)
                                v23 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v23 = 1;
                        }
                        v17[i] = (unsigned int)v22 + v17[i] - ((unsigned int)v23 & v17[i]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 125);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v24 = g_f03819 + 7;
                            if ((unsigned int)(v24 / g_f0381a) != g_f0381b)
                                v24 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v24 = 1;
                        }
                        v8 = &v6;
                        v6 = &v8;
                        j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 125);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v25 = g_f03819 + 7;
                            if ((unsigned int)(v25 / g_f0381a) != g_f0381b)
                                v25 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
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
                    v8 = &v6;
                    v6 = &v8;
                    j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -121.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v26 = g_f03819 + 7;
                        if ((unsigned int)(v26 / g_f0381a) != g_f0381b)
                            v26 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v26 = 1;
                    }
                    v8 = &v6;
                    v6 = &v8;
                    j = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -121.0;
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                    {
                        v27 = 1;
                    }
                    else
                    {
                        v27 = g_f03819 + 7;
                        if ((unsigned int)(v27 / g_f0381a) != g_f0381b)
                            v27 = (int)(j * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    v17[i] = (unsigned int)v26 + v17[i] - ((unsigned int)v27 & v17[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v0 + 4);
        }
        v0 = 1;
        v28 = (&g_f032a0.field_0)[idx];
        v9 = -8.683881839935943e-200;
        v10 = 14;
        v11 = 0;
        v12 = 0;
        j = 0;
        if (20 >= j)
        {
            do
            {
                *((char *)&v9 + j) = (char)j + 45 + *((char *)&v9 + j) - ((char)j + 45 & *((char *)&v9 + j)) * 2 - 59;
                j += 1;
            } while (j < 21);
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
