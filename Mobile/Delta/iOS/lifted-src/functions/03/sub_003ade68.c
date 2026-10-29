/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ade68..0x3ae710 (2216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ade68_3 {
    struct st_3ade68_6 *field_0;
} st_3ade68_3;

typedef struct st_3ade68_6 {
    struct st_3ade68_3 *field_0;
} st_3ade68_6;

typedef struct st_3ade68_0 {
    char field_0;
} st_3ade68_0;

typedef struct st_3ade68_2 {
    unsigned long long field_0;
} st_3ade68_2;

typedef struct st_3ade68_1 {
    struct st_3ade68_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3ade68_1;

extern st_3ade68_1 g_f03590;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;

void sub_3ade68(void)
{
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v26;  // x19
    unsigned long long v27;  // x6
    unsigned long long v28;  // x19
    unsigned long long v29;  // x6
    unsigned long long v30;  // x19
    unsigned long long v31;  // x6
    unsigned long long v32;  // x19
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    unsigned long long v21;  // x8
    unsigned int *v22;  // x8
    unsigned long long v23;  // x6
    unsigned long long v24;  // x19
    unsigned long long v25;  // x6
    unsigned long v0;  // [bp-0x78]
    st_3ade68_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_3ade68_0 *v2;  // [bp-0x68]
    st_3ade68_0 **v3;  // [bp-0x60], Other Possible Types: char
    st_3ade68_0 *v4;  // [bp-0x58]
    int i;  // [bp-0x4c]
    st_3ade68_6 **v6;  // [bp-0x48]
    st_3ade68_6 **v7;  // [bp-0x40]
    double v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v9 = v16;
    v10 = v17;
    v11 = v18;
    v12 = v19;
    v13 = &v15;
    v14 = v20;
    v0 = 0xffffff8800000000;
    v2 = &v1;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        v21 = 0xffffff88;
    }
    else
    {
        v22 = &v0 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                v7 = &v6;
                v6 = &v7;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -118.0;
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
                v7 = &v6;
                v6 = &v7;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -118.0;
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
                v22[i] = (unsigned int)v23 + v22[i] - ((unsigned int)v24 & v22[i]) * 2;
            }
            if ((g_f03819 + 7) / g_f0381a != g_f0381b)
            {
                if (g_f03818 + g_f11cfa * 27 != 3)
                {
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -117.0;
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
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -117.0;
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
                    v22[i] = (unsigned int)v25 + v22[i] - ((unsigned int)v26 & v22[i]) * 2;
                }
                if (g_f03818 + g_f11cfa * 12 != 3)
                {
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
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
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
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
                    v22[i] = (unsigned int)v27 + v22[i] - ((unsigned int)v28 & v22[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(i - 0x77);
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
                    v7 = &v6;
                    v6 = &v7;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(i - 0x77);
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
                    v22[i] = (unsigned int)v29 + v22[i] - ((unsigned int)v30 & v22[i]) * 2;
                }
            }
            if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
            {
                v7 = &v6;
                v6 = &v7;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -115.0;
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
                v7 = &v6;
                v6 = &v7;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -115.0;
                if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                {
                    v32 = 1;
                }
                else
                {
                    v32 = g_f03819 + 7;
                    if ((unsigned int)(v32 / g_f0381a) != g_f0381b)
                        v32 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                v22[i] = (unsigned int)v31 + v22[i] - ((unsigned int)v32 & v22[i]) * 2;
            }
            i += 1;
        } while (!i);
        v21 = *(unsigned int *)((void*)&v0 + 4);
    }
    (&g_f03590.field_0)[v21]();
}
