/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3aae34..0x3ab958 (2852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3aae34_3 {
    struct st_3aae34_6 *field_0;
} st_3aae34_3;

typedef struct st_3aae34_6 {
    struct st_3aae34_3 *field_0;
} st_3aae34_6;

typedef struct st_3aae34_0 {
    char field_0;
} st_3aae34_0;

typedef struct st_3aae34_2 {
    unsigned long long field_0;
} st_3aae34_2;

typedef struct st_3aae34_1 {
    struct st_3aae34_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3aae34_1;

extern st_3aae34_1 g_f03250;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3aae34(void)
{
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long v32;  // x7
    unsigned long v33;  // x5
    unsigned long v34;  // x7
    unsigned long v35;  // x5
    unsigned long v36;  // x7
    unsigned long v37;  // x5
    unsigned long v38;  // x7
    unsigned long long *v39;  // x8
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    unsigned long long v26;  // x30
    unsigned long long idx;  // x8
    unsigned int *v28;  // x8
    unsigned long v29;  // x5
    unsigned long v30;  // x7
    unsigned long v31;  // x5
    st_3aae34_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_3aae34_0 *v1;  // [bp-0xd0]
    char v2;  // [bp-0xc8], Other Possible Types: unsigned long
    st_3aae34_0 **v3;  // [bp-0xc0], Other Possible Types: char
    st_3aae34_0 *v4;  // [bp-0xb8]
    st_3aae34_0 **v5;  // [bp-0xb0], Other Possible Types: char
    st_3aae34_0 *v6;  // [bp-0xa8]
    unsigned long long i;  // [bp-0x9c]
    st_3aae34_6 **v8;  // [bp-0x98]
    double v9;  // [bp-0x90]
    unsigned long long v10;  // [bp-0x87]
    unsigned long long v11;  // [bp-0x7f]
    unsigned long long v12;  // [bp-0x77]
    st_3aae34_6 **j;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long v14;  // [bp-0x38]
    unsigned long long v15;  // [bp-0x30]
    unsigned long long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v15 = v22;
    v16 = v23;
    v17 = v24;
    v18 = v25;
    v19 = &v21;
    v20 = v26;
    v14 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xffffff9500000000;
    v4 = &v3;
    v3 = &v4;
    v6 = &v5;
    v5 = &v6;
    i = 0;
    if (i)
    {
        idx = 0xffffff95;
    }
    else
    {
        v28 = &v2 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -108.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v29 = g_f03819 + 7;
                    if ((unsigned int)(v29 / g_f0381a) != g_f0381b)
                        v29 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v29 = 1;
                }
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -108.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v30 = g_f03819 + 7;
                    if ((unsigned int)(v30 / g_f0381a) != g_f0381b)
                        v30 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v30 = 1;
                }
                v28[i] = (unsigned int)v29 + v28[i] - ((unsigned int)v30 & v28[i]) * 2;
            }
            if ((g_f03819 + 7) / g_f0381a != g_f0381b)
            {
                if (g_f03818 + g_f11cfa * 27 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -107.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v31 = g_f03819 + 7;
                        if ((unsigned int)(v31 / g_f0381a) != g_f0381b)
                            v31 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v31 = 1;
                    }
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -107.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v32 = g_f03819 + 7;
                        if ((unsigned int)(v32 / g_f0381a) != g_f0381b)
                            v32 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v32 = 1;
                    }
                    v28[i] = (unsigned int)v31 + v28[i] - ((unsigned int)v32 & v28[i]) * 2;
                }
                if (g_f03818 + g_f11cfa * 12 != 3)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -106.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v33 = g_f03819 + 7;
                        if ((unsigned int)(v33 / g_f0381a) != g_f0381b)
                            v33 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v33 = 1;
                    }
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
                    v28[i] = (unsigned int)v33 + v28[i] - ((unsigned int)v34 & v28[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 109);
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
                    j = &v8;
                    v8 = &j;
                    v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 109);
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
                    v28[i] = (unsigned int)v35 + v28[i] - ((unsigned int)v36 & v28[i]) * 2;
                }
            }
            if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
            {
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
                j = &v8;
                v8 = &j;
                v9 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -105.0;
                if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                {
                    v38 = 1;
                }
                else
                {
                    v38 = g_f03819 + 7;
                    if ((unsigned int)(v38 / g_f0381a) != g_f0381b)
                        v38 = (int)(v9 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                v28[i] = (unsigned int)v37 + v28[i] - ((unsigned int)v38 & v28[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v2 + 4);
    }
    v39 = (&g_f03250.field_0)[idx];
    v2 = 1;
    strncpy(&v9, "~zdVREZB$", 9);
    v11 = 0;
    v10 = 0;
    v12 = 0;
    j = 0;
    if (26 >= j)
    {
        do
        {
            *((char *)&v9 + j) = (char)j + 38 + *((char *)&v9 + j) - ((char)j + 38 & *((char *)&v9 + j)) * 2 - 10;
            j += 1;
        } while (j < 27);
    }
    v39();
}
