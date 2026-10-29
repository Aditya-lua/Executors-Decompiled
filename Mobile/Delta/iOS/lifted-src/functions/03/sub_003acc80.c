/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3acc80..0x3ad5d0 (2384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3acc80_3 {
    struct st_3acc80_6 *field_0;
} st_3acc80_3;

typedef struct st_3acc80_6 {
    struct st_3acc80_3 *field_0;
} st_3acc80_6;

typedef struct st_3acc80_0 {
    char field_0;
} st_3acc80_0;

typedef struct st_3acc80_2 {
    unsigned long long field_0;
} st_3acc80_2;

typedef struct st_3acc80_1 {
    struct st_3acc80_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3acc80_1;

extern st_3acc80_1 g_f02f80;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3acc80(unsigned long long a0)
{
    unsigned long long idx;  // x8
    unsigned int *v19;  // x8
    unsigned long long v28;  // x6
    unsigned long long v29;  // x20
    unsigned long long *v30;  // x8
    unsigned long long v20;  // x6
    unsigned long long v21;  // x20
    unsigned long long v22;  // x6
    unsigned long long v23;  // x20
    unsigned long long v24;  // x6
    unsigned long long v25;  // x20
    unsigned long long v26;  // x6
    unsigned long long v27;  // x20
    st_3acc80_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_3acc80_0 *v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    st_3acc80_0 **v3;  // [bp-0x98], Other Possible Types: char
    st_3acc80_0 *v4;  // [bp-0x90]
    st_3acc80_0 **v5;  // [bp-0x88], Other Possible Types: char
    st_3acc80_0 *v6;  // [bp-0x80]
    unsigned long long i;  // [bp-0x74]
    st_3acc80_6 **v8;  // [bp-0x70]
    st_3acc80_6 **j;  // [bp-0x68], Other Possible Types: unsigned long long
    char v10;  // [bp-0x60], Other Possible Types: double
    unsigned short v11;  // [bp-0x5c]
    char v12;  // [bp-0x5a]
    unsigned long long v13;  // [bp-0x59]
    unsigned long long v14;  // [bp-0x53]
    unsigned long v15;  // [bp-0x38]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a0)
    {
        v2 = 0xffffff8200000000;
        v4 = &v3;
        v3 = &v4;
        v6 = &v5;
        v5 = &v6;
        i = 0;
        if (i)
        {
            idx = 0xffffff82;
        }
        else
        {
            v19 = &v2 | 4;
            do
            {
                if (g_f03818 + g_f11cfa * 24 != 3)
                {
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -122.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v20 = g_f03819 + 7;
                        if ((unsigned int)(v20 / g_f0381a) != g_f0381b)
                            v20 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v20 = 1;
                    }
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -122.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v21 = g_f03819 + 7;
                        if ((unsigned int)(v21 / g_f0381a) != g_f0381b)
                            v21 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v21 = 1;
                    }
                    v19[i] = (unsigned int)v20 + v19[i] - ((unsigned int)v21 & v19[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    if (g_f03818 + g_f11cfa * 27 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -121.0;
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -121.0;
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
                        v19[i] = (unsigned int)v22 + v19[i] - ((unsigned int)v23 & v19[i]) * 2;
                    }
                    if (g_f03818 + g_f11cfa * 12 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -120.0;
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -120.0;
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
                        v19[i] = (unsigned int)v24 + v19[i] - ((unsigned int)v25 & v19[i]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 123);
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
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 123);
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
                        v19[i] = (unsigned int)v26 + v19[i] - ((unsigned int)v27 & v19[i]) * 2;
                    }
                }
                if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
                {
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -119.0;
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
                    v8 = &j;
                    j = &v8;
                    v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -119.0;
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                    {
                        v29 = 1;
                    }
                    else
                    {
                        v29 = g_f03819 + 7;
                        if ((unsigned int)(v29 / g_f0381a) != g_f0381b)
                            v29 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    v19[i] = (unsigned int)v28 + v19[i] - ((unsigned int)v29 & v19[i]) * 2;
                }
                i += 1;
            } while (!i);
            idx = *(unsigned int *)((void*)&v2 + 4);
        }
        v30 = (&g_f02f80.field_0)[idx];
        v10 = (unsigned int)(1.2640967885e-314 >> 0);
        v11 = 39300;
        v12 = 118;
        v13 = 0;
        v14 = 0;
        j = 0;
        if (20 >= j)
        {
            do
            {
                (&v10)[j] = (char)j + 46 + (&v10)[j] - ((char)j + 46 & (&v10)[j]) * 2 - 66;
                j += 1;
            } while (j < 21);
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
