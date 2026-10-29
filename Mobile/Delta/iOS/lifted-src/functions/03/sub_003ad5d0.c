/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ad5d0..0x3ade68 (2200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ad5d0_3 {
    struct st_3ad5d0_6 *field_0;
} st_3ad5d0_3;

typedef struct st_3ad5d0_6 {
    struct st_3ad5d0_3 *field_0;
} st_3ad5d0_6;

typedef struct st_3ad5d0_0 {
    char field_0;
} st_3ad5d0_0;

typedef struct st_3ad5d0_2 {
    unsigned long long field_0;
} st_3ad5d0_2;

typedef struct st_3ad5d0_1 {
    struct st_3ad5d0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3ad5d0_1;

extern st_3ad5d0_1 g_f02f80;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;

void sub_3ad5d0(unsigned long a0, unsigned long a1)
{
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v28;  // x21
    unsigned long long v29;  // x7
    unsigned long long v30;  // x21
    unsigned long long v31;  // x7
    unsigned long long v32;  // x21
    unsigned long long v33;  // x7
    unsigned long long v34;  // x21
    unsigned long long v35;  // x7
    unsigned long long v36;  // x21
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    unsigned long long v25;  // x8
    unsigned int *v26;  // x8
    unsigned long long v27;  // x7
    unsigned long v0;  // [bp-0x88]
    st_3ad5d0_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_3ad5d0_0 *v2;  // [bp-0x78]
    st_3ad5d0_0 **v3;  // [bp-0x70], Other Possible Types: char
    st_3ad5d0_0 *v4;  // [bp-0x68]
    int i;  // [bp-0x5c]
    st_3ad5d0_6 **v6;  // [bp-0x58]
    st_3ad5d0_6 **v7;  // [bp-0x50]
    double v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = v22;
    v14 = v23;
    v15 = &v17;
    v16 = v24;
    v0 = 0xffffff8700000000;
    v2 = &v1;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        v25 = 0xffffff87;
    }
    else
    {
        v26 = &v0 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -127.0;
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
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -127.0;
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -126.0;
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -126.0;
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -125.0;
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -125.0;
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(i - 128);
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
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(i - 128);
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
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
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
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -124.0;
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
        v25 = *(unsigned int *)((void*)&v0 + 4);
    }
    (&g_f02f80.field_0)[v25]();
}
