/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x352f80..0x3538f4 (2420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_352f80_1 {
    struct st_352f80_4 *field_0;
} st_352f80_1;

typedef struct st_352f80_4 {
    struct st_352f80_1 *field_0;
} st_352f80_4;

typedef struct st_352f80_0 {
    char field_0;
} st_352f80_0;

typedef struct st_352f80_6 {
    unsigned long long field_0;
} st_352f80_6;

typedef struct st_352f80_5 {
    struct st_352f80_6 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_352f80_5;

extern st_352f80_5 g_f02e40;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_352f80(unsigned long a0)
{
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v31;  // x7
    unsigned long long v32;  // x5
    unsigned long long v33;  // x7
    unsigned long long v34;  // x5
    unsigned long long v35;  // x7
    unsigned long long v36;  // x5
    unsigned long long v37;  // x7
    unsigned long long *v38;  // x8
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    unsigned long long idx;  // x8
    unsigned int *v27;  // x8
    unsigned long long v28;  // x5
    unsigned long long v29;  // x7
    unsigned long long v30;  // x5
    unsigned long j;  // [bp-0xd0], Other Possible Types: double
    unsigned long v1;  // [bp-0x98]
    st_352f80_0 **v2;  // [bp-0x90], Other Possible Types: char
    st_352f80_0 *v3;  // [bp-0x88]
    st_352f80_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_352f80_0 *v5;  // [bp-0x78]
    unsigned int i;  // [bp-0x6c]
    st_352f80_4 **v7;  // [bp-0x68]
    st_352f80_4 **v8;  // [bp-0x60]
    unsigned int v9;  // [bp-0x58]
    unsigned short v10;  // [bp-0x54]
    unsigned long v11;  // [bp-0x52]
    unsigned short v12;  // [bp-0x4a]
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
    v3 = &v2;
    v1 = 0x2100000000;
    v2 = &v3;
    v5 = &v4;
    v4 = &v5;
    i = 0;
    if (i)
    {
        idx = 33;
    }
    else
    {
        v27 = &v1 | 4;
        do
        {
            if (g_f033e8 + g_f11c8a * 9 != 3)
            {
                v7 = &v8;
                v8 = &v7;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 37.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v28 = g_f033e9 + 7;
                    if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                        v28 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                else
                {
                    v28 = 10;
                }
                v7 = &v8;
                v8 = &v7;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 37.0;
                if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                {
                    v29 = g_f033e9 + 7;
                    if ((unsigned int)(v29 / g_f033ea) != g_f033eb)
                        v29 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
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
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 38.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v30 = g_f033e9 + 7;
                        if ((unsigned int)(v30 / g_f033ea) != g_f033eb)
                            v30 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v30 = 10;
                    }
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 38.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v31 = g_f033e9 + 7;
                        if ((unsigned int)(v31 / g_f033ea) != g_f033eb)
                            v31 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v31 = 10;
                    }
                    v27[i] = (unsigned int)v30 + v27[i] - ((unsigned int)v31 & v27[i]) * 2;
                }
                if (g_f033e8 + g_f11c8a * 27 != 3)
                {
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 39.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v32 = g_f033e9 + 7;
                        if ((unsigned int)(v32 / g_f033ea) != g_f033eb)
                            v32 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v32 = 10;
                    }
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 39.0;
                    if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                    {
                        v33 = g_f033e9 + 7;
                        if ((unsigned int)(v33 / g_f033ea) != g_f033eb)
                            v33 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                    }
                    else
                    {
                        v33 = 10;
                    }
                    v27[i] = (unsigned int)v32 + v27[i] - ((unsigned int)v33 & v27[i]) * 2;
                }
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                {
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 36);
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
                    v7 = &v8;
                    v8 = &v7;
                    j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 36);
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
                    v27[i] = (unsigned int)v34 + v27[i] - ((unsigned int)v35 & v27[i]) * 2;
                }
            }
            if (g_f033e8 + g_f11c8a * 30 != 3)
            {
                v7 = &v8;
                v8 = &v7;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 40.0;
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
                v7 = &v8;
                v8 = &v7;
                j = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 40.0;
                if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                {
                    v37 = 10;
                }
                else
                {
                    v37 = g_f033e9 + 7;
                    if ((unsigned int)(v37 / g_f033ea) != g_f033eb)
                        v37 = (int)(j * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                }
                v27[i] = (unsigned int)v36 + v27[i] - ((unsigned int)v37 & v27[i]) * 2;
            }
            i += 1;
        } while (!i);
        idx = *(unsigned int *)((void*)&v1 + 4);
    }
    v38 = (&g_f02e40.field_0)[idx];
    strncpy(&v8, "[HVwV@TP", 8);
    v9 = (unsigned int)(5.827049584e-315 >> 0);
    v10 = 47478;
    v11 = 0;
    v12 = 0;
    j = 0;
    if (23 >= j)
    {
        do
        {
            *((char *)&v8 + j) = (char)j + 230 + *((char *)&v8 + j) - ((char)j + 230 & *((char *)&v8 + j)) * 2 - 74;
            j += 1;
        } while (j < 24);
    }
    v38();
}
