/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a9970..0x3aae34 (5316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a9970_3 {
    struct st_3a9970_6 *field_0;
} st_3a9970_3;

typedef struct st_3a9970_6 {
    struct st_3a9970_3 *field_0;
} st_3a9970_6;

typedef struct st_3a9970_0 {
    char field_0;
} st_3a9970_0;

typedef struct st_3a9970_2 {
    unsigned long long field_0;
} st_3a9970_2;

typedef struct st_3a9970_1 {
    struct st_3a9970_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a9970_1;

extern st_3a9970_1 g_f03200;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3a9970(void)
{
    unsigned long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v35;  // x19
    unsigned long long v36;  // x6
    unsigned long long v37;  // x19
    unsigned long long v38;  // x6
    unsigned long long v39;  // x19
    unsigned long long v40;  // x6
    unsigned long long v41;  // x19
    unsigned long long v42;  // x6
    unsigned long long v43;  // x19
    unsigned long long *v44;  // x8
    unsigned long long v27;  // x22
    unsigned long long v28;  // x21
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    unsigned long long v31;  // x30
    unsigned long long idx;  // x8
    unsigned int *v33;  // x8
    unsigned long long v34;  // x6
    st_3a9970_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_3a9970_0 *v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0xc8], Other Possible Types: unsigned long long
    st_3a9970_0 **v3;  // [bp-0xc0], Other Possible Types: char
    st_3a9970_0 *v4;  // [bp-0xb8]
    st_3a9970_0 **v5;  // [bp-0xb0], Other Possible Types: char
    st_3a9970_0 *v6;  // [bp-0xa8]
    unsigned long long i;  // [bp-0x9c]
    st_3a9970_6 **v8;  // [bp-0x98]
    double v9;  // [bp-0x90]
    char v10;  // [bp-0x88]
    unsigned long long v11;  // [bp-0x87]
    unsigned long long v12;  // [bp-0x7f]
    unsigned long long v13;  // [bp-0x77]
    st_3a9970_6 **j;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v16 = v25;
    v17 = v26;
    v18 = v27;
    v19 = v28;
    v20 = v29;
    v21 = v30;
    v22 = &v24;
    v23 = v31;
    v15 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xffffff9d00000000;
    v4 = &v3;
    v3 = &v4;
    v6 = &v5;
    v5 = &v6;
    i = 0;
    if (i)
    {
        idx = 0xffffff9d;
    }
    else
    {
        v33 = &v2 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -106.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v34 = g_f03819 + 7;
                    if ((unsigned int)(v34 / g_f0381a) != g_f0381b)
                        v34 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v34 = 1;
                }
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -106.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v35 = g_f03819 + 7;
                    if ((unsigned int)(v35 / g_f0381a) != g_f0381b)
                        v35 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v35 = 1;
                }
                v33[i] = (unsigned int)v34 + v33[i] - ((unsigned int)v35 & v33[i]) * 2;
            }
            if ((g_f03819 + 7) / g_f0381a != g_f0381b)
            {
                if (g_f03818 + g_f11cfa * 27 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -105.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v36 = g_f03819 + 7;
                        if ((unsigned int)(v36 / g_f0381a) != g_f0381b)
                            v36 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v36 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -105.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v37 = g_f03819 + 7;
                        if ((unsigned int)(v37 / g_f0381a) != g_f0381b)
                            v37 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v37 = 1;
                    }
                    v33[i] = (unsigned int)v36 + v33[i] - ((unsigned int)v37 & v33[i]) * 2;
                }
                if (g_f03818 + g_f11cfa * 12 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -104.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v38 = g_f03819 + 7;
                        if ((unsigned int)(v38 / g_f0381a) != g_f0381b)
                            v38 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v38 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -104.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v39 = g_f03819 + 7;
                        if ((unsigned int)(v39 / g_f0381a) != g_f0381b)
                            v39 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v39 = 1;
                    }
                    v33[i] = (unsigned int)v38 + v33[i] - ((unsigned int)v39 & v33[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 107);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v40 = g_f03819 + 7;
                        if ((unsigned int)(v40 / g_f0381a) != g_f0381b)
                            v40 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v40 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 107);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v41 = g_f03819 + 7;
                        if ((unsigned int)(v41 / g_f0381a) != g_f0381b)
                            v41 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v41 = 1;
                    }
                    v33[i] = (unsigned int)v40 + v33[i] - ((unsigned int)v41 & v33[i]) * 2;
                }
            }
            if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
            {
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -103.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v42 = g_f03819 + 7;
                    if ((unsigned int)(v42 / g_f0381a) != g_f0381b)
                        v42 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v42 = 1;
                }
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -103.0;
                if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                {
                    v43 = 1;
                }
                else
                {
                    v43 = g_f03819 + 7;
                    if ((unsigned int)(v43 / g_f0381a) != g_f0381b)
                        v43 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                v33[i] = (unsigned int)v42 + v33[i] - ((unsigned int)v43 & v33[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v2 + 4);
    }
    v44 = (&g_f03200.field_0)[idx];
    v2 = 1;
    v9 = -4.738320045807995e-28;
    v10 = 212;
    v12 = 0;
    v11 = 0;
    v13 = 0;
    j = 0;
    if (28 >= j)
    {
        do
        {
            *((char *)&v9 + j) = (char)j + 186 + *((char *)&v9 + j) - ((char)j + 186 & *((char *)&v9 + j)) * 2 - 22;
            j += 1;
        } while (j < 29);
    }
    v44();
}
