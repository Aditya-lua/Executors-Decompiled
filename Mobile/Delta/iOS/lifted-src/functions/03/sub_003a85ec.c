/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a85ec..0x3a9030 (2628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a85ec_3 {
    struct st_3a85ec_6 *field_0;
} st_3a85ec_3;

typedef struct st_3a85ec_6 {
    struct st_3a85ec_3 *field_0;
} st_3a85ec_6;

typedef struct st_3a85ec_0 {
    char field_0;
} st_3a85ec_0;

typedef struct st_3a85ec_2 {
    unsigned long long field_0;
} st_3a85ec_2;

typedef struct st_3a85ec_1 {
    struct st_3a85ec_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a85ec_1;

extern st_3a85ec_1 g_f03390;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3a85ec(void)
{
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v30;  // x19
    unsigned long long v31;  // x6
    unsigned long long v32;  // x19
    unsigned long long v33;  // x6
    unsigned long long v34;  // x19
    unsigned long long v35;  // x6
    unsigned long long v36;  // x19
    unsigned long long *v37;  // x8
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    unsigned long long idx;  // x8
    unsigned int *v26;  // x8
    unsigned long long v27;  // x6
    unsigned long long v28;  // x19
    unsigned long long v29;  // x6
    unsigned long v0;  // [bp-0xb8], Other Possible Types: unsigned long long
    st_3a85ec_0 **v1;  // [bp-0xb0], Other Possible Types: char
    st_3a85ec_0 *v2;  // [bp-0xa8]
    st_3a85ec_0 **v3;  // [bp-0xa0], Other Possible Types: char
    st_3a85ec_0 *v4;  // [bp-0x98]
    unsigned long long i;  // [bp-0x8c]
    st_3a85ec_6 **v6;  // [bp-0x88]
    st_3a85ec_6 **j;  // [bp-0x80], Other Possible Types: unsigned long long
    double v8;  // [bp-0x60]
    char v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x57]
    unsigned long long v11;  // [bp-0x4f]
    unsigned long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v13 = v20;
    v14 = v21;
    v15 = v22;
    v16 = v23;
    v17 = &v19;
    v18 = v24;
    v12 = *(long long *)&g_10002b0;
    v0 = 0xffffff8d00000000;
    v2 = &v1;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        idx = 0xffffff8d;
    }
    else
    {
        v26 = &v0 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -119.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v27 = g_f03819 + 7;
                    if ((unsigned int)(v27 / g_f0381a) != g_f0381b)
                        v27 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v27 = 1;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -119.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v28 = g_f03819 + 7;
                    if ((unsigned int)(v28 / g_f0381a) != g_f0381b)
                        v28 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v28 = 1;
                }
                v26[i] = (unsigned int)v27 + v26[i] - ((unsigned int)v28 & v26[i]) * 2;
            }
            if ((g_f03819 + 7) / g_f0381a != g_f0381b)
            {
                if (g_f03818 + g_f11cfa * 27 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -118.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v29 = g_f03819 + 7;
                        if ((unsigned int)(v29 / g_f0381a) != g_f0381b)
                            v29 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v29 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -118.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v30 = g_f03819 + 7;
                        if ((unsigned int)(v30 / g_f0381a) != g_f0381b)
                            v30 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v30 = 1;
                    }
                    v26[i] = (unsigned int)v29 + v26[i] - ((unsigned int)v30 & v26[i]) * 2;
                }
                if (g_f03818 + g_f11cfa * 12 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -117.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v31 = g_f03819 + 7;
                        if ((unsigned int)(v31 / g_f0381a) != g_f0381b)
                            v31 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v31 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -117.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v32 = g_f03819 + 7;
                        if ((unsigned int)(v32 / g_f0381a) != g_f0381b)
                            v32 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v32 = 1;
                    }
                    v26[i] = (unsigned int)v31 + v26[i] - ((unsigned int)v32 & v26[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 120);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v33 = g_f03819 + 7;
                        if ((unsigned int)(v33 / g_f0381a) != g_f0381b)
                            v33 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v33 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 120);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v34 = g_f03819 + 7;
                        if ((unsigned int)(v34 / g_f0381a) != g_f0381b)
                            v34 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v34 = 1;
                    }
                    v26[i] = (unsigned int)v33 + v26[i] - ((unsigned int)v34 & v26[i]) * 2;
                }
            }
            if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v35 = g_f03819 + 7;
                    if ((unsigned int)(v35 / g_f0381a) != g_f0381b)
                        v35 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v35 = 1;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
                if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                {
                    v36 = 1;
                }
                else
                {
                    v36 = g_f03819 + 7;
                    if ((unsigned int)(v36 / g_f0381a) != g_f0381b)
                        v36 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                v26[i] = (unsigned int)v35 + v26[i] - ((unsigned int)v36 & v26[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v0 + 4);
    }
    v0 = 1;
    v37 = (&g_f03390.field_0)[idx];
    v8 = 5.993234971041752e-212;
    v9 = 142;
    v10 = 0;
    v11 = 0;
    j = 0;
    if (0x11 >= j)
    {
        do
        {
            *((char *)&v8 + j) = (char)j + 237 + *((char *)&v8 + j) - ((char)j + 237 & *((char *)&v8 + j)) * 2 - 123;
            j += 1;
        } while (j < 18);
    }
    v37();
}
