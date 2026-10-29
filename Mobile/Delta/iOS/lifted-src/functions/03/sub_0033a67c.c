/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x33a67c..0x33d3d8 (11612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_33a67c_3 {
    struct st_33a67c_6 *field_0;
} st_33a67c_3;

typedef struct st_33a67c_6 {
    struct st_33a67c_3 *field_0;
} st_33a67c_6;

typedef struct st_33a67c_0 {
    char field_0;
} st_33a67c_0;

typedef struct st_33a67c_2 {
    unsigned long long field_0;
} st_33a67c_2;

typedef struct st_33a67c_1 {
    struct st_33a67c_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_33a67c_1;

extern st_33a67c_1 g_f032f0;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_33a67c(void)
{
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v32;  // x7
    unsigned long long v33;  // x5
    unsigned long long v34;  // x7
    unsigned long long v35;  // x5
    unsigned long long v36;  // x7
    unsigned long long v37;  // x5
    unsigned long long v38;  // x7
    unsigned long long v39;  // x5
    unsigned long long v40;  // x7
    unsigned long long *v41;  // x8
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    unsigned long long v28;  // x30
    unsigned long long idx;  // x8
    unsigned int *v30;  // x8
    unsigned long long v31;  // x5
    char v0;  // [bp-0xc0], Other Possible Types: unsigned long
    st_33a67c_0 **v1;  // [bp-0xb8], Other Possible Types: char
    st_33a67c_0 *v2;  // [bp-0xb0]
    st_33a67c_0 **v3;  // [bp-0xa8], Other Possible Types: char
    st_33a67c_0 *v4;  // [bp-0xa0]
    unsigned long long i;  // [bp-0x94]
    st_33a67c_6 **v6;  // [bp-0x90]
    st_33a67c_6 **j;  // [bp-0x88], Other Possible Types: unsigned long long
    char v8;  // [bp-0x80], Other Possible Types: double
    uint128_t v9;  // [bp-0x70]
    unsigned long long v10;  // [bp-0x60]
    unsigned long long v11;  // [bp-0x5e]
    unsigned long v12;  // [bp-0x48]
    unsigned long long v13;  // [bp-0x40]
    unsigned long long v14;  // [bp-0x38]
    unsigned long long v15;  // [bp-0x30]
    unsigned long long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v13 = v22;
    v14 = v23;
    v15 = v24;
    v16 = v25;
    v17 = v26;
    v18 = v27;
    v19 = &v21;
    v20 = v28;
    v12 = *(long long *)&g_10002b0;
    _objc_autoreleasePoolPush();
    v2 = &v1;
    v0 = 0xffffffc000000000;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        idx = 0xffffffc0;
    }
    else
    {
        v30 = &v0 | 4;
        do
        {
            if (g_f033e8 + g_f11c8a * 9 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -61.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v31 = g_f033e9 + 7;
                    if ((unsigned int)(v31 / g_f033ea) != g_f033eb)
                        v31 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v31 = 10;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -61.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v32 = g_f033e9 + 7;
                    if ((unsigned int)(v32 / g_f033ea) != g_f033eb)
                        v32 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v32 = 10;
                }
                v30[i] = (unsigned int)v31 + v30[i] - ((unsigned int)v32 & v30[i]) * 2;
            }
            if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
            {
                if (g_f033e8 + g_f11c8a * 24 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -60.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v33 = g_f033e9 + 7;
                        if ((unsigned int)(v33 / g_f033ea) != g_f033eb)
                            v33 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v33 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -60.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v34 = g_f033e9 + 7;
                        if ((unsigned int)(v34 / g_f033ea) != g_f033eb)
                            v34 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v34 = 10;
                    }
                    v30[i] = (unsigned int)v33 + v30[i] - ((unsigned int)v34 & v30[i]) * 2;
                }
                if (g_f033e8 + g_f11c8a * 27 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -59.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v35 = g_f033e9 + 7;
                        if ((unsigned int)(v35 / g_f033ea) != g_f033eb)
                            v35 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v35 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -59.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v36 = g_f033e9 + 7;
                        if ((unsigned int)(v36 / g_f033ea) != g_f033eb)
                            v36 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v36 = 10;
                    }
                    v30[i] = (unsigned int)v35 + v30[i] - ((unsigned int)v36 & v30[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 62);
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v37 = g_f033e9 + 7;
                        if ((unsigned int)(v37 / g_f033ea) != g_f033eb)
                            v37 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v37 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 62);
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v38 = g_f033e9 + 7;
                        if ((unsigned int)(v38 / g_f033ea) != g_f033eb)
                            v38 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v38 = 10;
                    }
                    v30[i] = (unsigned int)v37 + v30[i] - ((unsigned int)v38 & v30[i]) * 2;
                }
            }
            if (g_f033e8 + g_f11c8a * 30 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -58.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v39 = g_f033e9 + 7;
                    if ((unsigned int)(v39 / g_f033ea) != g_f033eb)
                        v39 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v39 = 10;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -58.0;
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                {
                    v40 = 10;
                }
                else
                {
                    v40 = g_f033e9 + 7;
                    if ((unsigned int)(v40 / g_f033ea) != g_f033eb)
                        v40 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                v30[i] = (unsigned int)v39 + v30[i] - ((unsigned int)v40 & v30[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v0 + 4);
    }
    v41 = (&g_f032f0.field_0)[idx];
    v0 = 1;
    v8 = 0xdcfa2323dc18eaebe0e2e61e1af6cafd;
    v9 = 0xa7363036c42ad62cd4f1d4dfdcd2d1dd;
    v10 = 0;
    v11 = 0;
    j = 0;
    if (0x22 >= j)
    {
        do
        {
            (&v8)[j] = (char)((char)j + 21 + (&v8)[j] - ((char)j + 21 & (&v8)[j]) * 2) + 109;
            j += 1;
        } while (j < 35);
    }
    v41();
}
