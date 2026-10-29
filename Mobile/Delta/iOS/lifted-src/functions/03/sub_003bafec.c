/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3bafec..0x3bdf14 (12072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3bafec_3 {
    struct st_3bafec_6 *field_0;
} st_3bafec_3;

typedef struct st_3bafec_6 {
    struct st_3bafec_3 *field_0;
} st_3bafec_6;

typedef struct st_3bafec_0 {
    char field_0;
} st_3bafec_0;

typedef struct st_3bafec_2 {
    unsigned long long field_0;
} st_3bafec_2;

typedef struct st_3bafec_1 {
    struct st_3bafec_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3bafec_1;

extern st_3bafec_1 g_f03340;
extern char g_f03818;
extern char g_f03819;
extern char g_f0381a;
extern char g_f0381b;
extern char g_f0381c;
extern char g_f11cfa;
extern char g_10002b0;
extern char g_1000388;
extern char g_1000390;
extern char g_1000398;
extern char g_10003b0;
extern char g_10003b8;
extern char g_10003c0;
extern char g_10003c8;
extern char g_10003d0;
extern char g_10003d8;
extern char g_10003e0;

int sub_3bafec(void)
{
    unsigned long v33;  // x19
    unsigned long v34;  // x8
    unsigned long v43;  // x6
    unsigned long v44;  // x19
    unsigned long v45;  // x6
    unsigned long v46;  // x19
    unsigned long v47;  // x6
    unsigned long v48;  // x19
    unsigned long long *v49;  // x8
    long long v35;  // x0
    unsigned int v36;  // w0
    unsigned long long idx;  // x8
    unsigned int *v38;  // x8
    unsigned long v39;  // x6
    unsigned long v40;  // x19
    unsigned long v41;  // x6
    unsigned long v42;  // x19
    st_3bafec_0 **v0;  // [bp-0x150], Other Possible Types: char
    st_3bafec_0 *v1;  // [bp-0x148]
    char v2;  // [bp-0x138], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x130]
    unsigned int j;  // [bp-0x128]
    st_3bafec_0 **v5;  // [bp-0x120], Other Possible Types: char
    st_3bafec_0 *v6;  // [bp-0x118]
    st_3bafec_0 **v7;  // [bp-0x110], Other Possible Types: char
    st_3bafec_0 *v8;  // [bp-0x100]
    st_3bafec_6 **v9;  // [bp-0xf8]
    double v10;  // [bp-0xf0]
    char v11[8];  // [bp-0xf0]
    char v12;  // [bp-0xe8]
    unsigned long v13;  // [bp-0xe7]
    char v14;  // [bp-0xe6]
    unsigned int v15;  // [bp-0xe5]
    char v16;  // [bp-0xe1]
    unsigned long v17;  // [bp-0xdf]
    unsigned int v18;  // [bp-0xd8]
    st_3bafec_6 **k;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned long v20;  // [bp-0x98]
    unsigned long v21;  // [bp-0x90]
    unsigned long v22;  // [bp-0x88]
    unsigned long v23;  // [bp-0x80]
    unsigned long v24;  // [bp-0x78]
    unsigned long i;  // [bp-0x70]
    unsigned long v26;  // [bp-0x68]
    unsigned long v27;  // [bp-0x60]
    unsigned long v28;  // [bp-0x58]
    unsigned long v29;  // [bp-0x50]
    unsigned long v30;  // [bp-0x48]
    char *v31;  // [bp-0x10]
    char v32;  // [bp+0x0]

    v31 = &v32;
    v30 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v33 = sub_3a9970();
    strncpy(v11, "HH(ZGDsr}a", 10);
    v14 = 186;
    v15 = 0;
    v16 = 0;
    i = 0;
    if (15 >= i)
    {
        do
        {
            v11[i] = (unsigned int)i + 1601454822 + v11[i] - ((unsigned int)i + 1601454822 & v11[i]) * 2 - 74;
            i += 1;
        } while (i < 16);
    }
    v34 = sub_3b9cac(v11);
    if (v33 && v34)
    {
        i = *(long long *)&g_10003c0;
        v26 = *(long long *)&g_10003b8;
        v27 = *(long long *)&g_10003b0;
        v28 = *(long long *)&g_10003e0;
        v29 = *(long long *)&g_10003d0;
        v20 = *(long long *)&g_10003c8;
        v21 = v33;
        v22 = v34;
        v23 = *(long long *)&g_1000388;
        v24 = *(long long *)&g_10003d8;
        v35 = _CFDictionaryCreate(0, &i, &v20, 5, &g_1000390, &g_1000398);
        v3 = 0;
        v36 = _SecItemCopyMatching(v35, &v3, &v20, 5, &g_1000390, &g_1000398);
        _CFRelease(v35);
        if (!v36 && v3)
        {
            v2 = 0xffffff9d00000000;
            v6 = &v5;
            v5 = &v6;
            v8 = &v7;
            v7 = &v8;
            j = 0;
            if (j)
            {
                idx = 0xffffff9d;
            }
            else
            {
                v38 = &v2 | 4;
                do
                {
                    if (g_f03818 + g_f11cfa * 24 != 3)
                    {
                        k = &v9;
                        v9 = &k;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -101.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v39 = g_f03819 + 7;
                            if ((unsigned int)(v39 / g_f0381a) != g_f0381b)
                                v39 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v39 = 1;
                        }
                        k = &v9;
                        v9 = &k;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -101.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v40 = g_f03819 + 7;
                            if ((unsigned int)(v40 / g_f0381a) != g_f0381b)
                                v40 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v40 = 1;
                        }
                        v38[j] = (unsigned int)v39 + v38[j] - ((unsigned int)v40 & v38[j]) * 2;
                    }
                    if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                    {
                        if (g_f03818 + g_f11cfa * 27 != 3)
                        {
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -100.0;
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v41 = g_f03819 + 7;
                                if ((unsigned int)(v41 / g_f0381a) != g_f0381b)
                                    v41 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v41 = 1;
                            }
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -100.0;
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v42 = g_f03819 + 7;
                                if ((unsigned int)(v42 / g_f0381a) != g_f0381b)
                                    v42 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v42 = 1;
                            }
                            v38[j] = (unsigned int)v41 + v38[j] - ((unsigned int)v42 & v38[j]) * 2;
                        }
                        if (g_f03818 + g_f11cfa * 12 != 3)
                        {
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -99.0;
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v43 = g_f03819 + 7;
                                if ((unsigned int)(v43 / g_f0381a) != g_f0381b)
                                    v43 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v43 = 1;
                            }
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -99.0;
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v44 = g_f03819 + 7;
                                if ((unsigned int)(v44 / g_f0381a) != g_f0381b)
                                    v44 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v44 = 1;
                            }
                            v38[j] = (unsigned int)v43 + v38[j] - ((unsigned int)v44 & v38[j]) * 2;
                        }
                        if ((g_f03819 + 7) / g_f0381a != g_f0381b)
                        {
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(j - 0x66);
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v45 = g_f03819 + 7;
                                if ((unsigned int)(v45 / g_f0381a) != g_f0381b)
                                    v45 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v45 = 1;
                            }
                            k = &v9;
                            v9 = &k;
                            v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * (double)(int)(j - 0x66);
                            if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                            {
                                v46 = g_f03819 + 7;
                                if ((unsigned int)(v46 / g_f0381a) != g_f0381b)
                                    v46 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                            }
                            else
                            {
                                v46 = 1;
                            }
                            v38[j] = (unsigned int)v45 + v38[j] - ((unsigned int)v46 & v38[j]) * 2;
                        }
                    }
                    if (g_f03818 - g_f11cfa + g_f11cfa * 16 != 3)
                    {
                        k = &v9;
                        v9 = &k;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -98.0;
                        if ((g_f03819 + 7) / g_f0381a == g_f0381b || g_f03818 + g_f11cfa * 18 == 3)
                        {
                            v47 = g_f03819 + 7;
                            if ((unsigned int)(v47 / g_f0381a) != g_f0381b)
                                v47 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        else
                        {
                            v47 = 1;
                        }
                        k = &v9;
                        v9 = &k;
                        v10 = ((double)g_f03818 * -2.0 + (double)g_f0381c) * -98.0;
                        if ((g_f03819 + 7) / g_f0381a != g_f0381b && g_f03818 + g_f11cfa * 18 != 3)
                        {
                            v48 = 1;
                        }
                        else
                        {
                            v48 = g_f03819 + 7;
                            if ((unsigned int)(v48 / g_f0381a) != g_f0381b)
                                v48 = (int)(v10 * (double)(unsigned int)((g_f03819 + 7) / g_f0381a - g_f0381b));
                        }
                        v38[j] = (unsigned int)v47 + v38[j] - ((unsigned int)v48 & v38[j]) * 2;
                    }
                    j += 1;
                } while (!j);
                idx = *(unsigned int *)((void*)&v2 + 4);
            }
            v49 = (&g_f03340.field_0)[idx];
            v2 = 1;
            v10 = 3.138020570150241e+185;
            v12 = 14;
            v17 = 0;
            v13 = 0;
            v18 = 0;
            k = 0;
            if (27 >= k)
            {
                do
                {
                    *((char *)&v10 + k) = (char)k + 1 + *((char *)&v10 + k) - ((char)k + 1 & *((char *)&v10 + k)) * 2 - 7;
                    k += 1;
                } while (k < 28);
            }
            v49();
        }
    }
    if (*(long long *)&g_10002b0 == v30)
        return 0;
    ___stack_chk_fail();
}
