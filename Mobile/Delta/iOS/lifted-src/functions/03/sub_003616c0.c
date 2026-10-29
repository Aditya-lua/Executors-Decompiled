/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3616c0..0x3629b0 (4848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3616c0_3 {
    struct st_3616c0_6 *field_0;
} st_3616c0_3;

typedef struct st_3616c0_6 {
    struct st_3616c0_3 *field_0;
} st_3616c0_6;

typedef struct st_3616c0_0 {
    char field_0;
} st_3616c0_0;

typedef struct st_3616c0_2 {
    unsigned long long field_0;
} st_3616c0_2;

typedef struct st_3616c0_1 {
    struct st_3616c0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3616c0_1;

extern st_3616c0_1 g_f030c0;
extern char g_f033e8;
extern char g_f033e9;
extern char g_f033ea;
extern char g_f033eb;
extern char g_f033ec;
extern char g_f11c8a;
extern char g_10002b0;

void sub_3616c0(unsigned long long a0)
{
    unsigned long long v22;  // x0
    unsigned int *v23;  // x26
    unsigned long long v32;  // x11
    unsigned long long v33;  // x9
    unsigned long long v34;  // x11
    unsigned long long *v35;  // x8
    unsigned long long idx;  // x8
    unsigned long long v25;  // x9
    unsigned long long v26;  // x11
    unsigned long long v27;  // x9
    unsigned long long v28;  // x11
    unsigned long long v29;  // x9
    unsigned long long v30;  // x11
    unsigned long long v31;  // x9
    unsigned long long v0;  // [bp-0x140]
    unsigned long long v1;  // [bp-0x138]
    char v2;  // [bp-0x130]
    unsigned long long v3;  // [bp-0x118]
    st_3616c0_0 **v4;  // [bp-0x110], Other Possible Types: char
    st_3616c0_0 *v5;  // [bp-0x108]
    unsigned long long v6;  // [bp-0x100], Other Possible Types: char
    st_3616c0_0 **v7;  // [bp-0xf8], Other Possible Types: char
    st_3616c0_0 *v8;  // [bp-0xf0]
    st_3616c0_0 **v9;  // [bp-0xe8], Other Possible Types: char
    st_3616c0_0 *v10;  // [bp-0xe0]
    unsigned long long i;  // [bp-0xd4]
    st_3616c0_6 **v12;  // [bp-0xd0]
    st_3616c0_6 **j;  // [bp-0xc8], Other Possible Types: unsigned long long
    char v14;  // [bp-0xc0], Other Possible Types: double
    double v15;  // [bp-0xb0]
    unsigned long long v16;  // [bp-0xa8]
    unsigned long long v17;  // [bp-0xa0]
    unsigned long long v18;  // [bp-0x99]
    unsigned long v19;  // [bp-0x80]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v19 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    if (a0)
    {
        v22 = sub_39f728();
        if (v22)
        {
            v0 = a0;
            v1 = 0xffffff92;
            v23 = &v6 | 4;
            v2 = 0x5f924f300fb170204fcf309fe0ffbf6;
            v6 = 0xffffff9800000000;
            v8 = &v7;
            v7 = &v8;
            v10 = &v9;
            v9 = &v10;
            i = 0;
            if (i)
            {
                idx = 0xffffff98;
            }
            else
            {
                do
                {
                    if (g_f033e8 + g_f11c8a * 9 != 3)
                    {
                        v12 = &j;
                        j = &v12;
                        v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -102.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v25 = g_f033e9 + 7;
                            if ((unsigned int)(v25 / g_f033ea) != g_f033eb)
                                v25 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v25 = 10;
                        }
                        v12 = &j;
                        j = &v12;
                        v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -102.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v26 = g_f033e9 + 7;
                            if ((unsigned int)(v26 / g_f033ea) != g_f033eb)
                                v26 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v26 = 10;
                        }
                        v23[i] = (unsigned int)v25 + v23[i] - ((unsigned int)v26 & v23[i]) * 2;
                    }
                    if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                    {
                        if (g_f033e8 + g_f11c8a * 24 != 3)
                        {
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -101.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v27 = g_f033e9 + 7;
                                if ((unsigned int)(v27 / g_f033ea) != g_f033eb)
                                    v27 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v27 = 10;
                            }
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -101.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v28 = g_f033e9 + 7;
                                if ((unsigned int)(v28 / g_f033ea) != g_f033eb)
                                    v28 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v28 = 10;
                            }
                            v23[i] = (unsigned int)v27 + v23[i] - ((unsigned int)v28 & v23[i]) * 2;
                        }
                        if (g_f033e8 + g_f11c8a * 27 != 3)
                        {
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -100.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v29 = g_f033e9 + 7;
                                if ((unsigned int)(v29 / g_f033ea) != g_f033eb)
                                    v29 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v29 = 10;
                            }
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -100.0;
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v30 = g_f033e9 + 7;
                                if ((unsigned int)(v30 / g_f033ea) != g_f033eb)
                                    v30 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v30 = 10;
                            }
                            v23[i] = (unsigned int)v29 + v23[i] - ((unsigned int)v30 & v23[i]) * 2;
                        }
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb)
                        {
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 103);
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v31 = g_f033e9 + 7;
                                if ((unsigned int)(v31 / g_f033ea) != g_f033eb)
                                    v31 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v31 = 10;
                            }
                            v12 = &j;
                            j = &v12;
                            v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * (double)(int)(i - 103);
                            if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                            {
                                v32 = g_f033e9 + 7;
                                if ((unsigned int)(v32 / g_f033ea) != g_f033eb)
                                    v32 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                            }
                            else
                            {
                                v32 = 10;
                            }
                            v23[i] = (unsigned int)v31 + v23[i] - ((unsigned int)v32 & v23[i]) * 2;
                        }
                    }
                    if (g_f033e8 + g_f11c8a * 30 != 3)
                    {
                        v12 = &j;
                        j = &v12;
                        v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -99.0;
                        if ((g_f033e9 + 7) / g_f033ea == g_f033eb || g_f033e8 + g_f11c8a * 3 == 3)
                        {
                            v33 = g_f033e9 + 7;
                            if ((unsigned int)(v33 / g_f033ea) != g_f033eb)
                                v33 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        else
                        {
                            v33 = 10;
                        }
                        v12 = &j;
                        j = &v12;
                        v14 = ((double)g_f033e8 * -2.0 + (double)g_f033ec) * -99.0;
                        if ((g_f033e9 + 7) / g_f033ea != g_f033eb && g_f033e8 + g_f11c8a * 3 != 3)
                        {
                            v34 = 10;
                        }
                        else
                        {
                            v34 = g_f033e9 + 7;
                            if ((unsigned int)(v34 / g_f033ea) != g_f033eb)
                                v34 = (int)(v14 * (double)(unsigned int)((g_f033e9 + 7) / g_f033ea - g_f033eb));
                        }
                        v23[i] = (unsigned int)v33 + v23[i] - ((unsigned int)v34 & v23[i]) * 2;
                    }
                    i += 1;
                } while (!i);
                idx = *(unsigned int *)((void*)&v6 + 4);
            }
            v3 = v22;
            v6 = 1;
            v35 = (&g_f030c0.field_0)[idx];
            v14 = v2;
            v15 = -4.4066323043523126e-159;
            v16 = 0;
            v17 = 0;
            v18 = 0;
            j = 0;
            if (42 >= j)
            {
                do
                {
                    (&v14)[j] = (char)j + 113 + (&v14)[j] - ((char)j + 113 & (&v14)[j]) * 2 - 23;
                    j += 1;
                } while (j < 43);
            }
            v35();
        }
    }
    if (*(long long *)&g_10002b0 == v19)
        return;
    ___stack_chk_fail();
}
