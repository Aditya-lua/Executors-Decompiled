/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b08b8..0x3b3ce8 (13360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b08b8_3 {
    struct st_3b08b8_6 *field_0;
} st_3b08b8_3;

typedef struct st_3b08b8_6 {
    struct st_3b08b8_3 *field_0;
} st_3b08b8_6;

typedef struct st_3b08b8_0 {
    char field_0;
} st_3b08b8_0;

typedef struct st_3b08b8_2 {
    unsigned long long field_0;
} st_3b08b8_2;

typedef struct st_3b08b8_1 {
    struct st_3b08b8_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3b08b8_1;

extern st_3b08b8_1 g_f032f0;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;

void sub_3b08b8(unsigned long a0)
{
    unsigned long long v25;  // x26
    unsigned long long v26;  // x25
    unsigned int *v35;  // x8
    unsigned long long v36;  // x6
    unsigned long long v37;  // x20
    unsigned long long v38;  // x6
    unsigned long long v39;  // x20
    unsigned long long v40;  // x6
    unsigned long long v41;  // x20
    unsigned long long v42;  // x6
    unsigned long long v43;  // x20
    unsigned long long v44;  // x6
    unsigned long long v27;  // x24
    unsigned long long v45;  // x20
    unsigned long long *v46;  // x8
    unsigned long long v28;  // x23
    unsigned long long v29;  // x22
    unsigned long long v30;  // x21
    unsigned long long v31;  // x20
    unsigned long long v32;  // x19
    unsigned long long v33;  // x30
    unsigned long long idx;  // x8
    unsigned long v0;  // [bp-0xc0], Other Possible Types: unsigned long long
    st_3b08b8_0 **v1;  // [bp-0xb8], Other Possible Types: char
    st_3b08b8_0 *v2;  // [bp-0xb0]
    st_3b08b8_0 **v3;  // [bp-0xa8], Other Possible Types: char
    st_3b08b8_0 *v4;  // [bp-0xa0]
    unsigned long long i;  // [bp-0x94]
    st_3b08b8_6 **v6;  // [bp-0x90]
    st_3b08b8_6 **j;  // [bp-0x88], Other Possible Types: unsigned long long
    double v8;  // [bp-0x80]
    unsigned int v9;  // [bp-0x78]
    char v10;  // [bp-0x74]
    unsigned long long v11;  // [bp-0x73]
    unsigned long long v12;  // [bp-0x6b]
    unsigned long v13;  // [bp-0x58]
    unsigned long long v14;  // [bp-0x50]
    unsigned long long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v14 = v25;
    v15 = v26;
    v16 = v27;
    v17 = v28;
    v18 = v29;
    v19 = v30;
    v20 = v31;
    v21 = v32;
    v22 = &v24;
    v23 = v33;
    v13 = *(long long *)&g_10002b0;
    _objc_autoreleasePoolPush();
    v0 = 0xffffff8900000000;
    v2 = &v1;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        idx = 0xffffff89;
    }
    else
    {
        v35 = &v0 | 4;
        do
        {
            if (g_f03818 + g_f11cfa * 24 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v36 = g_f03819 + 7;
                    if ((unsigned int)(v36 / g_f0381a) != g_f0381b)
                        v36 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v36 = 1;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -116.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v37 = g_f03819 + 7;
                    if ((unsigned int)(v37 / g_f0381a) != g_f0381b)
                        v37 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v37 = 1;
                }
                v35[i] = (unsigned int)v36 + v35[i] - ((unsigned int)v37 & v35[i]) * 2;
            }
            if ((g_f03819 + 7) / g_f0381a != g_f0381b)
            {
                if (g_f03818 + g_f11cfa * 27 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -115.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v38 = g_f03819 + 7;
                        if ((unsigned int)(v38 / g_f0381a) != g_f0381b)
                            v38 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v38 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -115.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v39 = g_f03819 + 7;
                        if ((unsigned int)(v39 / g_f0381a) != g_f0381b)
                            v39 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v39 = 1;
                    }
                    v35[i] = (unsigned int)v38 + v35[i] - ((unsigned int)v39 & v35[i]) * 2;
                }
                if (g_f03818 + g_f11cfa * 12 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -114.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v40 = g_f03819 + 7;
                        if ((unsigned int)(v40 / g_f0381a) != g_f0381b)
                            v40 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v40 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -114.0;
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v41 = g_f03819 + 7;
                        if ((unsigned int)(v41 / g_f0381a) != g_f0381b)
                            v41 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v41 = 1;
                    }
                    v35[i] = (unsigned int)v40 + v35[i] - ((unsigned int)v41 & v35[i]) * 2;
                }
                if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 117);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v42 = g_f03819 + 7;
                        if ((unsigned int)(v42 / g_f0381a) != g_f0381b)
                            v42 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v42 = 1;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(i - 117);
                    if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                    {
                        v43 = g_f03819 + 7;
                        if ((unsigned int)(v43 / g_f0381a) != g_f0381b)
                            v43 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                    }
                    else
                    {
                        v43 = 1;
                    }
                    v35[i] = (unsigned int)v42 + v35[i] - ((unsigned int)v43 & v35[i]) * 2;
                }
            }
            if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -113.0;
                if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                {
                    v44 = g_f03819 + 7;
                    if ((unsigned int)(v44 / g_f0381a) != g_f0381b)
                        v44 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                else
                {
                    v44 = 1;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -113.0;
                if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                {
                    v45 = 1;
                }
                else
                {
                    v45 = g_f03819 + 7;
                    if ((unsigned int)(v45 / g_f0381a) != g_f0381b)
                        v45 = (int)(v8 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                }
                v35[i] = (unsigned int)v44 + v35[i] - ((unsigned int)v45 & v35[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v0 + 4);
    }
    v0 = 1;
    v46 = (&g_f032f0.field_0)[idx];
    v8 = -5.0243088275681225e-70;
    v9 = (unsigned int)(1.521127318e-314 >> 0);
    v10 = 10;
    v11 = 0;
    v12 = 0;
    j = 0;
    if (22 >= j)
    {
        do
        {
            *((char *)&v8 + j) = (char)j + 89 + *((char *)&v8 + j) - ((char)j + 89 & *((char *)&v8 + j)) * 2 - 111;
            j += 1;
        } while (j < 23);
    }
    v46();
}
