/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a0a4c..0x3a1d60 (4884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a0a4c_3 {
    struct st_3a0a4c_6 *field_0;
} st_3a0a4c_3;

typedef struct st_3a0a4c_6 {
    struct st_3a0a4c_3 *field_0;
} st_3a0a4c_6;

typedef struct st_3a0a4c_0 {
    char field_0;
} st_3a0a4c_0;

typedef struct st_3a0a4c_2 {
    unsigned long long field_0;
} st_3a0a4c_2;

typedef struct st_3a0a4c_1 {
    struct st_3a0a4c_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3a0a4c_1;

extern st_3a0a4c_1 g_f03340;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_3a0a4c(unsigned long a0, unsigned long a1)
{
    unsigned long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v35;  // x7
    unsigned long long v36;  // x5
    unsigned long long v37;  // x7
    unsigned long long v38;  // x5
    unsigned long long v39;  // x7
    unsigned long long v40;  // x5
    unsigned long long v41;  // x7
    unsigned long long v42;  // x5
    unsigned long long v43;  // x7
    unsigned long long *v44;  // x9
    unsigned long long v27;  // x22
    unsigned long long v28;  // x21
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    unsigned long long v31;  // x30
    unsigned long long idx;  // x9
    unsigned int *v33;  // x9
    unsigned long long v34;  // x5
    st_3a0a4c_0 **v0;  // [bp-0x150], Other Possible Types: char
    st_3a0a4c_0 *v1;  // [bp-0x148]
    char v2;  // [bp-0xe0], Other Possible Types: unsigned long
    unsigned long long i;  // [bp-0xd8]
    st_3a0a4c_0 **v4;  // [bp-0xc8], Other Possible Types: char
    st_3a0a4c_0 *v5;  // [bp-0xc0]
    st_3a0a4c_0 **v6;  // [bp-0xb8], Other Possible Types: char
    st_3a0a4c_0 *v7;  // [bp-0xb0]
    st_3a0a4c_6 **v8;  // [bp-0xa8]
    unsigned long long j;  // [bp-0xa0], Other Possible Types: double
    st_3a0a4c_6 **v10;  // [bp-0x70], Other Possible Types: char
    unsigned short v11;  // [bp-0x6c]
    char v12;  // [bp-0x6a]
    unsigned long long v13;  // [bp-0x69]
    unsigned long long v14;  // [bp-0x61]
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
    v2 = 0x2500000000;
    v5 = &v4;
    v4 = &v5;
    v7 = &v6;
    v6 = &v7;
    i = 0;
    if (i)
    {
        idx = 37;
    }
    else
    {
        v33 = &v2 | 4;
        do
        {
            if (g_f033e8 + g_f11c8a * 9 != 3)
            {
                v10 = &v8;
                v8 = &v10;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 35.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v34 = g_f033e9 + 7;
                    if ((unsigned int)(v34 / g_f033ea) != g_f033eb)
                        v34 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v34 = 10;
                }
                v10 = &v8;
                v8 = &v10;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 35.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v35 = g_f033e9 + 7;
                    if ((unsigned int)(v35 / g_f033ea) != g_f033eb)
                        v35 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v35 = 10;
                }
                v33[i] = (unsigned int)v34 + v33[i] - ((unsigned int)v35 & v33[i]) * 2;
            }
            if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
            {
                if (g_f033e8 + g_f11c8a * 24 != 3)
                {
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 36.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v36 = g_f033e9 + 7;
                        if ((unsigned int)(v36 / g_f033ea) != g_f033eb)
                            v36 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v36 = 10;
                    }
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 36.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v37 = g_f033e9 + 7;
                        if ((unsigned int)(v37 / g_f033ea) != g_f033eb)
                            v37 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v37 = 10;
                    }
                    v33[i] = (unsigned int)v36 + v33[i] - ((unsigned int)v37 & v33[i]) * 2;
                }
                if (g_f033e8 + g_f11c8a * 27 != 3)
                {
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 37.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v38 = g_f033e9 + 7;
                        if ((unsigned int)(v38 / g_f033ea) != g_f033eb)
                            v38 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v38 = 10;
                    }
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 37.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v39 = g_f033e9 + 7;
                        if ((unsigned int)(v39 / g_f033ea) != g_f033eb)
                            v39 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v39 = 10;
                    }
                    v33[i] = (unsigned int)v38 + v33[i] - ((unsigned int)v39 & v33[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 0x22);
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v40 = g_f033e9 + 7;
                        if ((unsigned int)(v40 / g_f033ea) != g_f033eb)
                            v40 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v40 = 10;
                    }
                    v10 = &v8;
                    v8 = &v10;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 0x22);
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v41 = g_f033e9 + 7;
                        if ((unsigned int)(v41 / g_f033ea) != g_f033eb)
                            v41 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v41 = 10;
                    }
                    v33[i] = (unsigned int)v40 + v33[i] - ((unsigned int)v41 & v33[i]) * 2;
                }
            }
            if (g_f033e8 + g_f11c8a * 30 != 3)
            {
                v10 = &v8;
                v8 = &v10;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 38.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v42 = g_f033e9 + 7;
                    if ((unsigned int)(v42 / g_f033ea) != g_f033eb)
                        v42 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v42 = 10;
                }
                v10 = &v8;
                v8 = &v10;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 38.0;
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                {
                    v43 = 10;
                }
                else
                {
                    v43 = g_f033e9 + 7;
                    if ((unsigned int)(v43 / g_f033ea) != g_f033eb)
                        v43 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                v33[i] = (unsigned int)v42 + v33[i] - ((unsigned int)v43 & v33[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v2 + 4);
    }
    v2 = 1;
    v44 = (&g_f03340.field_0)[idx];
    v10 = (unsigned int)(1.2013595744e-314 >> 0);
    v11 = 33949;
    v12 = 60;
    v13 = 0;
    v14 = 0;
    j = 0;
    if (16 >= j)
    {
        do
        {
            (&v10)[j] = (char)((char)j + 215 + (&v10)[j] - ((char)j + 215 & (&v10)[j]) * 2) + 31;
            j += 1;
        } while (j < 0x11);
    }
    v44();
}
