/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a55f0..0x3a5e90 (2208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a55f0_3 {
    struct st_3a55f0_6 *field_0;
} st_3a55f0_3;

typedef struct st_3a55f0_6 {
    struct st_3a55f0_3 *field_0;
} st_3a55f0_6;

typedef struct st_3a55f0_0 {
    char field_0;
} st_3a55f0_0;

typedef struct st_3a55f0_2 {
    unsigned long long field_0;
} st_3a55f0_2;

typedef struct st_3a55f0_1 {
    struct st_3a55f0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a55f0_1;

extern st_3a55f0_1 g_f034e0;
extern char g_f03538;
extern char g_f03539;
extern char g_f0353a;
extern char g_f0353b;
extern char g_f0353c;
extern char g_f11cf9;

void sub_3a55f0(void)
{
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v24;  // x7
    unsigned long long v25;  // x5
    unsigned long long v26;  // x7
    unsigned long long v27;  // x5
    unsigned long long v28;  // x7
    unsigned long long v16;  // x30
    unsigned long long v17;  // x8
    unsigned int *v18;  // x8
    unsigned long long v19;  // x5
    unsigned long long v20;  // x7
    unsigned long long v21;  // x5
    unsigned long long v22;  // x7
    unsigned long long v23;  // x5
    unsigned long v0;  // [bp-0x68]
    st_3a55f0_0 **v1;  // [bp-0x60], Other Possible Types: char
    st_3a55f0_0 *v2;  // [bp-0x58]
    st_3a55f0_0 **v3;  // [bp-0x50], Other Possible Types: char
    st_3a55f0_0 *v4;  // [bp-0x48]
    int i;  // [bp-0x3c]
    st_3a55f0_6 **v6;  // [bp-0x38]
    st_3a55f0_6 **v7;  // [bp-0x30]
    double v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v9 = v14;
    v10 = v15;
    v11 = &v13;
    v12 = v16;
    v0 = 0xffffff8800000000;
    v2 = &v1;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        v17 = 0xffffff88;
    }
    else
    {
        v18 = &v0 | 4;
        do
        {
            if (g_f03538 + g_f11cf9 * 9 != 3)
            {
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -114.0;
                if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                {
                    v19 = g_f03539 + 7;
                    if ((unsigned int)(v19 / g_f0353a) != g_f0353b)
                        v19 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                }
                else
                {
                    v19 = 10;
                }
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -114.0;
                if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                {
                    v20 = g_f03539 + 7;
                    if ((unsigned int)(v20 / g_f0353a) != g_f0353b)
                        v20 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                }
                else
                {
                    v20 = 10;
                }
                v18[i] = (unsigned int)v19 + v18[i] - ((unsigned int)v20 & v18[i]) * 2;
            }
            if ((g_f03539 + 7) / g_f0353a != g_f0353b)
            {
                if (g_f03538 + g_f11cf9 * 24 != 3)
                {
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -113.0;
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v21 = g_f03539 + 7;
                        if ((unsigned int)(v21 / g_f0353a) != g_f0353b)
                            v21 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v21 = 10;
                    }
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -113.0;
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v22 = g_f03539 + 7;
                        if ((unsigned int)(v22 / g_f0353a) != g_f0353b)
                            v22 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v22 = 10;
                    }
                    v18[i] = (unsigned int)v21 + v18[i] - ((unsigned int)v22 & v18[i]) * 2;
                }
                if (g_f03538 + g_f11cf9 * 27 != 3)
                {
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -112.0;
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v23 = g_f03539 + 7;
                        if ((unsigned int)(v23 / g_f0353a) != g_f0353b)
                            v23 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v23 = 10;
                    }
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -112.0;
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v24 = g_f03539 + 7;
                        if ((unsigned int)(v24 / g_f0353a) != g_f0353b)
                            v24 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v24 = 10;
                    }
                    v18[i] = (unsigned int)v23 + v18[i] - ((unsigned int)v24 & v18[i]) * 2;
                }
                if ((g_f03539 + 7) / g_f0353a != g_f0353b)
                {
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * (double)(i - 115);
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v25 = g_f03539 + 7;
                        if ((unsigned int)(v25 / g_f0353a) != g_f0353b)
                            v25 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v25 = 10;
                    }
                    v6 = &v7;
                    v7 = &v6;
                    v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * (double)(i - 115);
                    if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                    {
                        v26 = g_f03539 + 7;
                        if ((unsigned int)(v26 / g_f0353a) != g_f0353b)
                            v26 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                    }
                    else
                    {
                        v26 = 10;
                    }
                    v18[i] = (unsigned int)v25 + v18[i] - ((unsigned int)v26 & v18[i]) * 2;
                }
            }
            if (g_f03538 + g_f11cf9 * 30 != 3)
            {
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -111.0;
                if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                {
                    v27 = g_f03539 + 7;
                    if ((unsigned int)(v27 / g_f0353a) != g_f0353b)
                        v27 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                }
                else
                {
                    v27 = 10;
                }
                v6 = &v7;
                v7 = &v6;
                v8 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -111.0;
                if ((g_f03539 + 7) / g_f0353a != g_f0353b && g_f03538 + g_f11cf9 * 3 != 3)
                {
                    v28 = 10;
                }
                else
                {
                    v28 = g_f03539 + 7;
                    if ((unsigned int)(v28 / g_f0353a) != g_f0353b)
                        v28 = (int)(v8 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                }
                v18[i] = (unsigned int)v27 + v18[i] - ((unsigned int)v28 & v18[i]) * 2;
            }
            i += 1;
        } while (!i);
        v17 = *(unsigned int *)((void*)&v0 + 4);
    }
    (&g_f034e0.field_0)[v17]();
}
