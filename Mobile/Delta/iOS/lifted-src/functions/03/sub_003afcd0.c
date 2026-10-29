/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3afcd0..0x3b08b8 (3048 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3afcd0_3 {
    struct st_3afcd0_6 *field_0;
} st_3afcd0_3;

typedef struct st_3afcd0_6 {
    struct st_3afcd0_3 *field_0;
} st_3afcd0_6;

typedef struct st_3afcd0_0 {
    char field_0;
} st_3afcd0_0;

typedef struct st_3afcd0_2 {
    unsigned long long field_0;
} st_3afcd0_2;

typedef struct st_3afcd0_1 {
    struct st_3afcd0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3afcd0_1;

extern st_3afcd0_1 g_f02fd0;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

unsigned long long sub_3afcd0(unsigned long long a0)
{
    unsigned long long idx;  // x8
    unsigned int *v21;  // x8
    unsigned long long v30;  // x6
    unsigned long long v31;  // x20
    unsigned long long *v32;  // x8
    unsigned long long v22;  // x6
    unsigned long long v23;  // x20
    unsigned long long v24;  // x6
    unsigned long long v25;  // x20
    unsigned long long v26;  // x6
    unsigned long long v27;  // x20
    unsigned long long v28;  // x6
    unsigned long long v29;  // x20
    st_3afcd0_0 **v0;  // [bp-0x150], Other Possible Types: char
    st_3afcd0_0 *v1;  // [bp-0x148]
    unsigned long v2;  // [bp-0x140], Other Possible Types: unsigned long long
    st_3afcd0_0 **v3;  // [bp-0x138], Other Possible Types: char
    unsigned long long i;  // [bp-0x12c]
    st_3afcd0_0 *v5;  // [bp-0x128]
    st_3afcd0_0 **v6;  // [bp-0x118], Other Possible Types: char
    st_3afcd0_0 *v7;  // [bp-0x108]
    st_3afcd0_6 **v8;  // [bp-0xf0]
    st_3afcd0_6 **j;  // [bp-0xd8], Other Possible Types: unsigned long long
    char v10;  // [bp-0xb0], Other Possible Types: double
    unsigned short v11;  // [bp-0xa0]
    char v12;  // [bp-0x9e]
    unsigned long long v13;  // [bp-0x9d]
    unsigned long long v14;  // [bp-0x95]
    unsigned long long v15;  // [bp-0x8d]
    unsigned long long v16;  // [bp-0x85]
    unsigned long v17;  // [bp-0x78]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a0)
    {
        v2 = 0xffffff9700000000;
        v5 = &v3;
        v3 = &v5;
        v7 = &v6;
        v6 = &v7;
        i = 0;
        if (i)
        {
            idx = 0xffffff97;
        }
        else
        {
            v21 = &v2 | 4;
            do
            {
                if (g_f03818 + g_f11cfa * 24 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -96.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v22 = g_f03819 + 7;
                        if ((unsigned int)(v22 / g_f0381a) != g_f0381b)
                            v22 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v22 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -96.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v23 = g_f03819 + 7;
                        if ((unsigned int)(v23 / g_f0381a) != g_f0381b)
                            v23 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v23 = 1;
                    }
                    v21[i] = (unsigned int)v22 + v21[i] - ((unsigned int)v23 & v21[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    if (g_f03818 + g_f11cfa * 27 != 3)
                    {
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -95.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v24 = g_f03819 + 7;
                            if ((unsigned int)(v24 / g_f0381a) != g_f0381b)
                                v24 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v24 = 1;
                        }
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -95.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v25 = g_f03819 + 7;
                            if ((unsigned int)(v25 / g_f0381a) != g_f0381b)
                                v25 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v25 = 1;
                        }
                        v21[i] = (unsigned int)v24 + v21[i] - ((unsigned int)v25 & v21[i]) * 2;
                    }
                    if (g_f03818 + g_f11cfa * 12 != 3)
                    {
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -94.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v26 = g_f03819 + 7;
                            if ((unsigned int)(v26 / g_f0381a) != g_f0381b)
                                v26 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v26 = 1;
                        }
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -94.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v27 = g_f03819 + 7;
                            if ((unsigned int)(v27 / g_f0381a) != g_f0381b)
                                v27 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v27 = 1;
                        }
                        v21[i] = (unsigned int)v26 + v21[i] - ((unsigned int)v27 & v21[i]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 97);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v28 = g_f03819 + 7;
                            if ((unsigned int)(v28 / g_f0381a) != g_f0381b)
                                v28 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v28 = 1;
                        }
                        j = &v8;
                        v8 = &j;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 97);
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v29 = g_f03819 + 7;
                            if ((unsigned int)(v29 / g_f0381a) != g_f0381b)
                                v29 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v29 = 1;
                        }
                        v21[i] = (unsigned int)v28 + v21[i] - ((unsigned int)v29 & v21[i]) * 2;
                    }
                }
                if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -93.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v30 = g_f03819 + 7;
                        if ((unsigned int)(v30 / g_f0381a) != g_f0381b)
                            v30 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v30 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -93.0;
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                    {
                        v31 = 1;
                    }
                    else
                    {
                        v31 = g_f03819 + 7;
                        if ((unsigned int)(v31 / g_f0381a) != g_f0381b)
                            v31 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    v21[i] = (unsigned int)v30 + v21[i] - ((unsigned int)v31 & v21[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v2 + 4);
        }
        v2 = 1;
        v32 = (&g_f02fd0.field_0)[idx];
        v10 = 0x116f690b760e56770977006d700c727a;
        v11 = 23407;
        v12 = 128;
        v13 = 0;
        v15 = 0;
        v14 = 0;
        v16 = 0;
        j = 0;
        if (43 >= j)
        {
            do
            {
                (&v10)[j] = (char)j + 195 + (&v10)[j] - ((char)j + 195 & (&v10)[j]) * 2 - 0x55;
                j += 1;
            } while (j < 44);
        }
        v32();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v17)
            return 0;
        ___stack_chk_fail();
    }
}
