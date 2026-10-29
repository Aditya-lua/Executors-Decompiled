/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a5fa4..0x3a7ec0 (7964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a5fa4_4 {
    struct st_3a5fa4_7 *field_0;
} st_3a5fa4_4;

typedef struct st_3a5fa4_7 {
    struct st_3a5fa4_4 *field_0;
} st_3a5fa4_7;

typedef struct st_3a5fa4_0 {
    char field_0;
} st_3a5fa4_0;

typedef struct st_3a5fa4_3 {
    unsigned long long field_0;
} st_3a5fa4_3;

typedef struct st_3a5fa4_1 {
    char padding_0[17];
    char field_11;
} st_3a5fa4_1;

typedef struct st_3a5fa4_2 {
    struct st_3a5fa4_3 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a5fa4_2;

extern st_3a5fa4_2 g_f033f0;
extern char g_f03538;
extern char g_f03539;
extern char g_f0353a;
extern char g_f0353b;
extern char g_f0353c;
extern st_3a5fa4_1 *g_f0d538;
extern char g_f11cf8;
extern char g_f11cf9;
extern char g_10002b0;

void sub_3a5fa4(void)
{
    unsigned long long v14;  // x8
    unsigned int *v15;  // x8
    unsigned long long v24;  // x5
    unsigned long long v25;  // x7
    long long v26;  // x0
    long long v27;  // x0
    unsigned long long v16;  // x5
    unsigned long long v17;  // x7
    unsigned long long v18;  // x5
    unsigned long long v19;  // x7
    unsigned long long v20;  // x5
    unsigned long long v21;  // x7
    unsigned long long v22;  // x5
    unsigned long long v23;  // x7
    st_3a5fa4_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_3a5fa4_0 *v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0xc8]
    st_3a5fa4_0 **v3;  // [bp-0xa8], Other Possible Types: char
    st_3a5fa4_0 *v4;  // [bp-0xa0]
    st_3a5fa4_0 **v5;  // [bp-0x98], Other Possible Types: char
    st_3a5fa4_0 *v6;  // [bp-0x90]
    char i;  // [bp-0x84]
    st_3a5fa4_7 **v8;  // [bp-0x80]
    st_3a5fa4_7 **v9;  // [bp-0x78]
    double v10;  // [bp-0x70]
    unsigned long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(g_f11cf8 & 1))
    {
        g_f11cf8 = 1;
        if (!(g_f0d538->field_11 & 1))
        {
            v2 = 0xffffff8800000000;
            v4 = &v3;
            v3 = &v4;
            v6 = &v5;
            v5 = &v6;
            i = 0;
            v14 = 0xffffff88;
            if (!i)
            {
                v15 = &v2 | 4;
                do
                {
                    if (g_f03538 + g_f11cf9 * 9 != 3)
                    {
                        v8 = &v9;
                        v9 = &v8;
                        v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -118.0;
                        if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                        {
                            v16 = g_f03539 + 7;
                            if ((unsigned int)(v16 / g_f0353a) != g_f0353b)
                                v16 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                        }
                        else
                        {
                            v16 = 10;
                        }
                        v8 = &v9;
                        v9 = &v8;
                        v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -118.0;
                        if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                        {
                            v17 = g_f03539 + 7;
                            if ((unsigned int)(v17 / g_f0353a) != g_f0353b)
                                v17 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                        }
                        else
                        {
                            v17 = 10;
                        }
                        v15[i] = (unsigned int)v16 + v15[i] - ((unsigned int)v17 & v15[i]) * 2;
                    }
                    if ((g_f03539 + 7) / g_f0353a != g_f0353b)
                    {
                        if (g_f03538 + g_f11cf9 * 24 != 3)
                        {
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -117.0;
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v18 = g_f03539 + 7;
                                if ((unsigned int)(v18 / g_f0353a) != g_f0353b)
                                    v18 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v18 = 10;
                            }
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -117.0;
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v19 = g_f03539 + 7;
                                if ((unsigned int)(v19 / g_f0353a) != g_f0353b)
                                    v19 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v19 = 10;
                            }
                            v15[i] = (unsigned int)v18 + v15[i] - ((unsigned int)v19 & v15[i]) * 2;
                        }
                        if (g_f03538 + g_f11cf9 * 27 != 3)
                        {
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -116.0;
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v20 = g_f03539 + 7;
                                if ((unsigned int)(v20 / g_f0353a) != g_f0353b)
                                    v20 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v20 = 10;
                            }
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -116.0;
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v21 = g_f03539 + 7;
                                if ((unsigned int)(v21 / g_f0353a) != g_f0353b)
                                    v21 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v21 = 10;
                            }
                            v15[i] = (unsigned int)v20 + v15[i] - ((unsigned int)v21 & v15[i]) * 2;
                        }
                        if ((g_f03539 + 7) / g_f0353a != g_f0353b)
                        {
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * (double)(int)(i - 0x77);
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v22 = g_f03539 + 7;
                                if ((unsigned int)(v22 / g_f0353a) != g_f0353b)
                                    v22 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v22 = 10;
                            }
                            v8 = &v9;
                            v9 = &v8;
                            v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * (double)(int)(i - 0x77);
                            if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                            {
                                v23 = g_f03539 + 7;
                                if ((unsigned int)(v23 / g_f0353a) != g_f0353b)
                                    v23 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                            }
                            else
                            {
                                v23 = 10;
                            }
                            v15[i] = (unsigned int)v22 + v15[i] - ((unsigned int)v23 & v15[i]) * 2;
                        }
                    }
                    if (g_f03538 + g_f11cf9 * 30 != 3)
                    {
                        v8 = &v9;
                        v9 = &v8;
                        v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -115.0;
                        if ((g_f03539 + 7) / g_f0353a == g_f0353b || g_f03538 + g_f11cf9 * 3 == 3)
                        {
                            v24 = g_f03539 + 7;
                            if ((unsigned int)(v24 / g_f0353a) != g_f0353b)
                                v24 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                        }
                        else
                        {
                            v24 = 10;
                        }
                        v8 = &v9;
                        v9 = &v8;
                        v10 = ((double)g_f03538 * -2.0 + (double)g_f0353c) * -115.0;
                        if ((g_f03539 + 7) / g_f0353a != g_f0353b && g_f03538 + g_f11cf9 * 3 != 3)
                        {
                            v25 = 10;
                        }
                        else
                        {
                            v25 = g_f03539 + 7;
                            if ((unsigned int)(v25 / g_f0353a) != g_f0353b)
                                v25 = (int)(v10 * (double)(unsigned int)((g_f03539 + 7) / g_f0353a - g_f0353b));
                        }
                        v15[i] = (unsigned int)v24 + v15[i] - ((unsigned int)v25 & v15[i]) * 2;
                    }
                    i += 1;
                } while (!i);
                v14 = *(unsigned int *)((void*)&v2 + 4);
            }
            (&g_f033f0.field_0)[v14]();
        }
    }
    if (*(long long *)&g_10002b0 == v11)
        return;
    v26 = __Unwind_Resume(___stack_chk_fail());
    v27 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v26)));
    __Unwind_Resume(v27);
}
