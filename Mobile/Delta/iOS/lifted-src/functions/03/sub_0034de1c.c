/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x34de1c..0x3513f0 (13780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_34de1c_3 {
    struct st_34de1c_6 *field_0;
} st_34de1c_3;

typedef struct st_34de1c_6 {
    struct st_34de1c_3 *field_0;
} st_34de1c_6;

typedef struct st_34de1c_0 {
    char field_0;
} st_34de1c_0;

typedef struct st_34de1c_2 {
    unsigned long long field_0;
} st_34de1c_2;

typedef struct st_34de1c_1 {
    struct st_34de1c_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_34de1c_1;

extern st_34de1c_1 g_f032f0;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c89;
extern char g_f11c8a;
extern char g_10002b0;

void sub_34de1c(void)
{
    unsigned long long idx;  // x8
    unsigned int *v20;  // x8
    unsigned long long v29;  // x1
    unsigned long long v30;  // x3
    unsigned long long *v31;  // x8
    unsigned long long v21;  // x1
    unsigned long long v22;  // x3
    unsigned long long v23;  // x1
    unsigned long long v24;  // x3
    unsigned long long v25;  // x1
    unsigned long long v26;  // x3
    unsigned long long v27;  // x1
    unsigned long long v28;  // x3
    st_34de1c_0 **v0;  // [bp-0x118], Other Possible Types: char
    st_34de1c_0 *v1;  // [bp-0x110]
    char v2;  // [bp-0x100], Other Possible Types: unsigned long
    char i;  // [bp-0xf8]
    st_34de1c_0 **v4;  // [bp-0xf0], Other Possible Types: char
    st_34de1c_0 *v5;  // [bp-0xe8]
    st_34de1c_0 **v6;  // [bp-0xe0], Other Possible Types: char
    st_34de1c_0 *v7;  // [bp-0xd0]
    st_34de1c_6 **v8;  // [bp-0xc8]
    st_34de1c_6 **j;  // [bp-0xc0]
    char v10;  // [bp-0x90], Other Possible Types: double
    unsigned int v11;  // [bp-0x80]
    char v12;  // [bp-0x7c]
    char v13;  // [bp-0x7b]
    char v14;  // [bp-0x73]
    char v15;  // [bp-0x6c]
    unsigned long v16;  // [bp-0x48]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v16 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(g_f11c89 & 1))
    {
        g_f11c89 = 1;
        if (sub_339d30())
        {
            v2 = 0x1500000000;
            v5 = &v4;
            v4 = &v5;
            v7 = &v6;
            v6 = &v7;
            i = 0;
            if (i)
            {
                idx = 21;
            }
            else
            {
                v20 = &v2 | 4;
                do
                {
                    if (g_f033e8 + g_f11c8a * 9 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 24.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v21 = g_f033e9 + 7;
                            if ((unsigned int)(v21 / g_f033ea) != g_f033eb)
                                v21 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v21 = 10;
                        }
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 24.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v22 = g_f033e9 + 7;
                            if ((unsigned int)(v22 / g_f033ea) != g_f033eb)
                                v22 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v22 = 10;
                        }
                        v20[i] = (unsigned int)v21 + v20[i] - ((unsigned int)v22 & v20[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        if (g_f033e8 + g_f11c8a * 24 != 3)
                        {
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 25.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v23 = g_f033e9 + 7;
                                if ((unsigned int)(v23 / g_f033ea) != g_f033eb)
                                    v23 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v23 = 10;
                            }
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 25.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v24 = g_f033e9 + 7;
                                if ((unsigned int)(v24 / g_f033ea) != g_f033eb)
                                    v24 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v24 = 10;
                            }
                            v20[i] = (unsigned int)v23 + v20[i] - ((unsigned int)v24 & v20[i]) * 2;
                        }
                        if (g_f033e8 + g_f11c8a * 27 != 3)
                        {
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 26.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v25 = g_f033e9 + 7;
                                if ((unsigned int)(v25 / g_f033ea) != g_f033eb)
                                    v25 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v25 = 10;
                            }
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 26.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v26 = g_f033e9 + 7;
                                if ((unsigned int)(v26 / g_f033ea) != g_f033eb)
                                    v26 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v26 = 10;
                            }
                            v20[i] = (unsigned int)v25 + v20[i] - ((unsigned int)v26 & v20[i]) * 2;
                        }
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                        {
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 23);
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v27 = g_f033e9 + 7;
                                if ((unsigned int)(v27 / g_f033ea) != g_f033eb)
                                    v27 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v27 = 10;
                            }
                            v8 = &j;
                            j = &v8;
                            v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i + 23);
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v28 = g_f033e9 + 7;
                                if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                                    v28 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v28 = 10;
                            }
                            v20[i] = (unsigned int)v27 + v20[i] - ((unsigned int)v28 & v20[i]) * 2;
                        }
                    }
                    if (g_f033e8 + g_f11c8a * 30 != 3)
                    {
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 27.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v29 = g_f033e9 + 7;
                            if ((unsigned int)(v29 / g_f033ea) != g_f033eb)
                                v29 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v29 = 10;
                        }
                        v8 = &j;
                        j = &v8;
                        v10 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * 27.0;
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                        {
                            v30 = 10;
                        }
                        else
                        {
                            v30 = g_f033e9 + 7;
                            if ((unsigned int)(v30 / g_f033ea) != g_f033eb)
                                v30 = (int)(v10 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        v20[i] = (unsigned int)v29 + v20[i] - ((unsigned int)v30 & v20[i]) * 2;
                    }
                    i += 1;
                } while (!i);
                idx = *(unsigned int *)((void*)&v2 + 4);
            }
            v2 = 1;
            v31 = (&g_f032f0.field_0)[idx];
            v10 = 0xda39cbcbd2ced4d3dedcd8c4c0203a3e;
            v11 = (unsigned int)(2.0383213776e-314 >> 0);
            v12 = 64;
            v14 = 0;
            v13 = 0;
            v15 = 0;
            j = 0;
            if (39 >= j)
            {
                do
                {
                    *(char *)(&v10 + j) = (char)j + 78 + *(char *)(&v10 + j) - ((char)j + 78 & *(char *)(&v10 + j)) * 2 - 0x22;
                    j = (char *)j + 1;
                } while (j < 40);
            }
            v31();
        }
    }
    if (*(long long *)&g_10002b0 == v16)
        return;
    ___stack_chk_fail();
}
