/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d7c94..0x3d9744 (6832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d7c94_1 {
    struct st_3d7c94_2 *field_0;
} st_3d7c94_1;

typedef struct st_3d7c94_2 {
    struct st_3d7c94_1 *field_0;
} st_3d7c94_2;

typedef struct st_3d7c94_0 {
    char field_0;
} st_3d7c94_0;

extern char g_f03900;
extern char g_f03901;
extern char g_f03902;
extern char g_f03903;
extern char g_f03904;
extern char g_f11d5c;

char * sub_3d7c94(long long a0)
{
    unsigned long v17;  // x8
    unsigned long long v27;  // x11
    unsigned long long v28;  // x9
    unsigned long long v29;  // x11
    unsigned long long v30;  // x9
    unsigned long long v31;  // x11
    unsigned long long v32;  // x9
    unsigned long long v33;  // x11
    char v34;  // x19
    char v35;  // x8
    unsigned long long v36;  // x9
    long long i;  // x21
    unsigned long long v37;  // x11
    unsigned long long v38;  // x9
    unsigned long long v39;  // x11
    unsigned long long v40;  // x9
    unsigned long long v41;  // x11
    unsigned long long v42;  // x9
    unsigned long long v43;  // x11
    unsigned long long v44;  // x9
    unsigned long long v45;  // x11
    char v46;  // x9
    unsigned int *v20;  // x22
    unsigned long long v47;  // x10
    unsigned long long v48;  // x12
    unsigned long long v49;  // x10
    unsigned long long v50;  // x12
    unsigned long long v51;  // x10
    unsigned long long v52;  // x12
    unsigned long long v53;  // x10
    unsigned long long v54;  // x12
    unsigned long long v55;  // x10
    unsigned long long v56;  // x12
    unsigned int *v21;  // x23
    unsigned int v22;  // w0
    char v23;  // x8
    unsigned long long v24;  // x9
    unsigned long long v25;  // x11
    unsigned long long v26;  // x9
    st_3d7c94_0 **v0;  // [bp-0xaa8], Other Possible Types: char
    st_3d7c94_0 *v1;  // [bp-0xaa0]
    unsigned long long iter;  // [bp-0xa98], Other Possible Types: long long
    char v3;  // [bp-0xa90], Other Possible Types: unsigned long long
    double v4;  // [bp-0xa88]
    char v5;  // [bp-0xa80]
    char v6;  // [bp-0xb8]
    long long k;  // [bp-0xb4]
    st_3d7c94_2 **v8;  // [bp-0xb0]
    st_3d7c94_2 **v9;  // [bp-0xa8]
    st_3d7c94_2 **v10;  // [bp-0xa0]
    st_3d7c94_2 **v11;  // [bp-0x98]
    st_3d7c94_0 *v12;  // [bp-0x90], Other Possible Types: st_3d7c94_2 **
    st_3d7c94_2 **v13;  // [bp-0x88], Other Possible Types: st_3d7c94_0 **
    double v14;  // [bp-0x80]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v1 = &v0;
    v0 = &v1;
    memset(v17, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(v17, a0, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "/dev/urandom", 12);
    std::__1::random_device::random_device(&v6, &v5);
    sub_63e0c(&v5, std::__1::random_device::operator()(&v6));
    v4 = 1.08221785339e-312;
    if (!a0)
        return &v6;
    i = 0;
    v20 = &v3 | 4;
    v21 = &iter | 4;
    do
    {
        v22 = sub_3d98f8(&v4, &v5, &v4);
        if (25 >= (int)v22)
        {
            v3 = 0xffffffc800000000;
            v9 = &v8;
            v8 = &v9;
            v11 = &v10;
            v10 = &v11;
            iter = 0;
            if (iter)
            {
                v23 = 200;
            }
            else
            {
                do
                {
                    if (g_f03900 - g_f11d5c + g_f11d5c * 16 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v24 = g_f03901 + 7;
                            if ((unsigned int)(v24 / g_f03902) != g_f03903)
                                v24 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v24 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v25 = g_f03901 + 7;
                            if ((unsigned int)(v25 / g_f03902) != g_f03903)
                                v25 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v25 = 8;
                        }
                        v20[iter] = (unsigned int)v24 + v20[iter] - ((unsigned int)v25 & v20[iter]) * 2;
                    }
                    if ((g_f03901 + 7) / g_f03902 != g_f03903)
                    {
                        if (g_f03900 + g_f11d5c * 18 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v26 = g_f03901 + 7;
                                if ((unsigned int)(v26 / g_f03902) != g_f03903)
                                    v26 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v26 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v27 = g_f03901 + 7;
                                if ((unsigned int)(v27 / g_f03902) != g_f03903)
                                    v27 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v27 = 8;
                            }
                            v20[iter] = (unsigned int)v26 + v20[iter] - ((unsigned int)v27 & v20[iter]) * 2;
                        }
                        if (g_f03900 + g_f11d5c * 3 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v28 = g_f03901 + 7;
                                if ((unsigned int)(v28 / g_f03902) != g_f03903)
                                    v28 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v28 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v29 = g_f03901 + 7;
                                if ((unsigned int)(v29 / g_f03902) != g_f03903)
                                    v29 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v29 = 8;
                            }
                            v20[iter] = (unsigned int)v28 + v20[iter] - ((unsigned int)v29 & v20[iter]) * 2;
                        }
                        if ((g_f03901 + 7) / g_f03902 != g_f03903)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(iter - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v30 = g_f03901 + 7;
                                if ((unsigned int)(v30 / g_f03902) != g_f03903)
                                    v30 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v30 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(iter - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v31 = g_f03901 + 7;
                                if ((unsigned int)(v31 / g_f03902) != g_f03903)
                                    v31 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v31 = 8;
                            }
                            v20[iter] = (unsigned int)v30 + v20[iter] - ((unsigned int)v31 & v20[iter]) * 2;
                        }
                    }
                    if (g_f03900 + g_f11d5c * 6 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v32 = g_f03901 + 7;
                            if ((unsigned int)(v32 / g_f03902) != g_f03903)
                                v32 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v32 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 != g_f03903 && g_f03900 + g_f11d5c * 9 != 3)
                        {
                            v33 = 8;
                        }
                        else
                        {
                            v33 = g_f03901 + 7;
                            if ((unsigned int)(v33 / g_f03902) != g_f03903)
                                v33 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        v20[iter] = (unsigned int)v32 + v20[iter] - ((unsigned int)v33 & v20[iter]) * 2;
                    }
                    iter += 1;
                } while (!iter);
                v23 = *(unsigned int *)((void*)&v3 + 4);
            }
            v34 = v23 + (char)v22;
        }
        else
        {
            v3 = 0xffffffe800000000;
            v9 = &v8;
            v8 = &v9;
            v11 = &v10;
            v10 = &v11;
            iter = 0;
            if (iter)
            {
                v35 = 232;
            }
            else
            {
                do
                {
                    if (g_f03900 - g_f11d5c + g_f11d5c * 16 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v36 = g_f03901 + 7;
                            if ((unsigned int)(v36 / g_f03902) != g_f03903)
                                v36 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v36 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v37 = g_f03901 + 7;
                            if ((unsigned int)(v37 / g_f03902) != g_f03903)
                                v37 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v37 = 8;
                        }
                        v20[iter] = (unsigned int)v36 + v20[iter] - ((unsigned int)v37 & v20[iter]) * 2;
                    }
                    if ((g_f03901 + 7) / g_f03902 != g_f03903)
                    {
                        if (g_f03900 + g_f11d5c * 18 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v38 = g_f03901 + 7;
                                if ((unsigned int)(v38 / g_f03902) != g_f03903)
                                    v38 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v38 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v39 = g_f03901 + 7;
                                if ((unsigned int)(v39 / g_f03902) != g_f03903)
                                    v39 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v39 = 8;
                            }
                            v20[iter] = (unsigned int)v38 + v20[iter] - ((unsigned int)v39 & v20[iter]) * 2;
                        }
                        if (g_f03900 + g_f11d5c * 3 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v40 = g_f03901 + 7;
                                if ((unsigned int)(v40 / g_f03902) != g_f03903)
                                    v40 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v40 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v41 = g_f03901 + 7;
                                if ((unsigned int)(v41 / g_f03902) != g_f03903)
                                    v41 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v41 = 8;
                            }
                            v20[iter] = (unsigned int)v40 + v20[iter] - ((unsigned int)v41 & v20[iter]) * 2;
                        }
                        if ((g_f03901 + 7) / g_f03902 != g_f03903)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(iter - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v42 = g_f03901 + 7;
                                if ((unsigned int)(v42 / g_f03902) != g_f03903)
                                    v42 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v42 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(iter - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v43 = g_f03901 + 7;
                                if ((unsigned int)(v43 / g_f03902) != g_f03903)
                                    v43 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v43 = 8;
                            }
                            v20[iter] = (unsigned int)v42 + v20[iter] - ((unsigned int)v43 & v20[iter]) * 2;
                        }
                    }
                    if (g_f03900 + g_f11d5c * 6 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v44 = g_f03901 + 7;
                            if ((unsigned int)(v44 / g_f03902) != g_f03903)
                                v44 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v44 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 != g_f03903 && g_f03900 + g_f11d5c * 9 != 3)
                        {
                            v45 = 8;
                        }
                        else
                        {
                            v45 = g_f03901 + 7;
                            if ((unsigned int)(v45 / g_f03902) != g_f03903)
                                v45 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        v20[iter] = (unsigned int)v44 + v20[iter] - ((unsigned int)v45 & v20[iter]) * 2;
                    }
                    iter += 1;
                } while (!iter);
                v35 = *(unsigned int *)((void*)&v3 + 4);
            }
            v3 = 1;
            iter = 0xffffff9300000000;
            v9 = &v8;
            v8 = &v9;
            v11 = &v10;
            v10 = &v11;
            k = 0;
            if (k)
            {
                v46 = 147;
            }
            else
            {
                do
                {
                    if (g_f03900 - g_f11d5c + g_f11d5c * 16 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v47 = g_f03901 + 7;
                            if ((unsigned int)(v47 / g_f03902) != g_f03903)
                                v47 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v47 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -118.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v48 = g_f03901 + 7;
                            if ((unsigned int)(v48 / g_f03902) != g_f03903)
                                v48 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v48 = 8;
                        }
                        v21[k] = (unsigned int)v47 + v21[k] - ((unsigned int)v48 & v21[k]) * 2;
                    }
                    if ((g_f03901 + 7) / g_f03902 != g_f03903)
                    {
                        if (g_f03900 + g_f11d5c * 18 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v49 = g_f03901 + 7;
                                if ((unsigned int)(v49 / g_f03902) != g_f03903)
                                    v49 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v49 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -117.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v50 = g_f03901 + 7;
                                if ((unsigned int)(v50 / g_f03902) != g_f03903)
                                    v50 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v50 = 8;
                            }
                            v21[k] = (unsigned int)v49 + v21[k] - ((unsigned int)v50 & v21[k]) * 2;
                        }
                        if (g_f03900 + g_f11d5c * 3 != 3)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v51 = g_f03901 + 7;
                                if ((unsigned int)(v51 / g_f03902) != g_f03903)
                                    v51 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v51 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -116.0;
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v52 = g_f03901 + 7;
                                if ((unsigned int)(v52 / g_f03902) != g_f03903)
                                    v52 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v52 = 8;
                            }
                            v21[k] = (unsigned int)v51 + v21[k] - ((unsigned int)v52 & v21[k]) * 2;
                        }
                        if ((g_f03901 + 7) / g_f03902 != g_f03903)
                        {
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(k - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v53 = g_f03901 + 7;
                                if ((unsigned int)(v53 / g_f03902) != g_f03903)
                                    v53 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v53 = 8;
                            }
                            v12 = &v13;
                            v13 = &v12;
                            v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * (double)(int)(k - 0x77);
                            if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                            {
                                v54 = g_f03901 + 7;
                                if ((unsigned int)(v54 / g_f03902) != g_f03903)
                                    v54 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                            }
                            else
                            {
                                v54 = 8;
                            }
                            v21[k] = (unsigned int)v53 + v21[k] - ((unsigned int)v54 & v21[k]) * 2;
                        }
                    }
                    if (g_f03900 + g_f11d5c * 6 != 3)
                    {
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 == g_f03903 || g_f03900 + g_f11d5c * 9 == 3)
                        {
                            v55 = g_f03901 + 7;
                            if ((unsigned int)(v55 / g_f03902) != g_f03903)
                                v55 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        else
                        {
                            v55 = 8;
                        }
                        v12 = &v13;
                        v13 = &v12;
                        v14 = ((double)g_f03900 * -2.0 + (double)g_f03904) * -115.0;
                        if ((g_f03901 + 7) / g_f03902 != g_f03903 && g_f03900 + g_f11d5c * 9 != 3)
                        {
                            v56 = 8;
                        }
                        else
                        {
                            v56 = g_f03901 + 7;
                            if ((unsigned int)(v56 / g_f03902) != g_f03903)
                                v56 = (int)(v14 * (double)(unsigned int)((g_f03901 + 7) / g_f03902 - g_f03903));
                        }
                        v21[k] = (unsigned int)v55 + v21[k] - ((unsigned int)v56 & v21[k]) * 2;
                    }
                    k += 1;
                } while (!k);
                v46 = *(unsigned int *)((void*)&iter + 4);
            }
            v34 = v35 + v22 - v46;
        }
        *(char *)sub_9c78(v17, i) = v34;
        i += 1;
    } while (i != a0);
    return &v6;
}
