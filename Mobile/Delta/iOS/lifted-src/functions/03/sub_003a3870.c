/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a3870..0x3a53c8 (7000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a3870_3 {
    struct st_3a3870_6 *field_0;
} st_3a3870_3;

typedef struct st_3a3870_6 {
    struct st_3a3870_3 *field_0;
} st_3a3870_6;

typedef struct st_3a3870_0 {
    char field_0;
} st_3a3870_0;

typedef struct st_3a3870_2 {
    unsigned long long field_0;
} st_3a3870_2;

typedef struct st_3a3870_1 {
    struct st_3a3870_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a3870_1;

extern st_3a3870_1 g_f02f30;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_3a3870(void)
{
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v31;  // x6
    unsigned long long v32;  // x4
    unsigned long long v33;  // x6
    unsigned long long v34;  // x4
    unsigned long long v35;  // x6
    unsigned long long v36;  // x4
    unsigned long long v37;  // x6
    unsigned long long *v38;  // x8
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    unsigned long long idx;  // x8
    unsigned int *v27;  // x8
    unsigned long long v28;  // x4
    unsigned long long v29;  // x6
    unsigned long long v30;  // x4
    char v0;  // [bp-0xa0], Other Possible Types: unsigned long
    st_3a3870_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_3a3870_0 *v2;  // [bp-0x90]
    st_3a3870_0 **v3;  // [bp-0x88], Other Possible Types: char
    st_3a3870_0 *v4;  // [bp-0x80]
    unsigned long long i;  // [bp-0x74]
    st_3a3870_6 **v6;  // [bp-0x70]
    st_3a3870_6 **j;  // [bp-0x68], Other Possible Types: unsigned long long
    double v8;  // [bp-0x60]
    char v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x57]
    unsigned long long v11;  // [bp-0x4f]
    unsigned long long v12;  // [bp-0x47]
    unsigned long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v14 = v21;
    v15 = v22;
    v16 = v23;
    v17 = v24;
    v18 = &v20;
    v19 = v25;
    v13 = *(long long *)&g_10002b0;
    v2 = &v1;
    v0 = 0x1a00000000;
    v1 = &v2;
    v4 = &v3;
    v3 = &v4;
    i = 0;
    if (i)
    {
        idx = 26;
    }
    else
    {
        v27 = &v0 | 4;
        do
        {
            if (g_f033e8 + g_f11c8a * 9 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 31.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v28 = g_f033e9 + 7;
                    if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                        v28 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v28 = 10;
                }
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 31.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v29 = g_f033e9 + 7;
                    if ((unsigned int)(v29 / g_f033ea) != g_f033eb)
                        v29 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v29 = 10;
                }
                v27[i] = (unsigned int)v28 + v27[i] - ((unsigned int)v29 & v27[i]) * 2;
            }
            if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
            {
                if (g_f033e8 + g_f11c8a * 24 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 32.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v30 = g_f033e9 + 7;
                        if ((unsigned int)(v30 / g_f033ea) != g_f033eb)
                            v30 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v30 = 10;
                    }
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 32.0;
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
                    v27[i] = (unsigned int)v30 + v27[i] - ((unsigned int)v31 & v27[i]) * 2;
                }
                if (g_f033e8 + g_f11c8a * 27 != 3)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 33.0;
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
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 33.0;
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
                    v27[i] = (unsigned int)v32 + v27[i] - ((unsigned int)v33 & v27[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 30);
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
                    v6 = &j;
                    j = &v6;
                    v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 30);
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
                    v27[i] = (unsigned int)v34 + v27[i] - ((unsigned int)v35 & v27[i]) * 2;
                }
            }
            if (g_f033e8 + g_f11c8a * 30 != 3)
            {
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 34.0;
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
                v6 = &j;
                j = &v6;
                v8 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 34.0;
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                {
                    v37 = 10;
                }
                else
                {
                    v37 = g_f033e9 + 7;
                    if ((unsigned int)(v37 / g_f033ea) != g_f033eb)
                        v37 = (int)(v8 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                v27[i] = (unsigned int)v36 + v27[i] - ((unsigned int)v37 & v27[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v0 + 4);
    }
    v38 = (&g_f02f30.field_0)[idx];
    v0 = 1;
    v8 = -9.669459970324167e+143;
    v9 = 78;
    v11 = 0;
    v10 = 0;
    v12 = 0;
    j = 0;
    if (25 >= j)
    {
        do
        {
            *((char *)&v8 + j) = (char)j + 13 + *((char *)&v8 + j) - ((char)j + 13 & *((char *)&v8 + j)) * 2 - 91;
            j += 1;
        } while (j < 26);
    }
    v38();
}
