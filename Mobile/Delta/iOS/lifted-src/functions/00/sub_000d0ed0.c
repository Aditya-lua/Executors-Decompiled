/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd0ed0..0xd1860 (2448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d0ed0_3 {
    struct st_d0ed0_6 *field_0;
} st_d0ed0_3;

typedef struct st_d0ed0_6 {
    struct st_d0ed0_3 *field_0;
} st_d0ed0_6;

typedef struct st_d0ed0_0 {
    char field_0;
} st_d0ed0_0;

typedef struct st_d0ed0_2 {
    unsigned long long field_0;
} st_d0ed0_2;

typedef struct st_d0ed0_1 {
    struct st_d0ed0_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_d0ed0_1;

extern st_d0ed0_1 g_f01220;
extern char g_f012a8;
extern char g_f012a9;
extern char g_f012aa;
extern char g_f012ab;
extern char g_f012ac;
extern char g_f0dc70;

void sub_d0ed0(long long a0, long long a1)
{
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    long long v28;  // x0
    unsigned long long v29;  // x8
    unsigned int *v30;  // x8
    unsigned long long v31;  // x5
    unsigned long long v32;  // x7
    unsigned long long v33;  // x5
    unsigned long long v34;  // x7
    unsigned long long v35;  // x5
    unsigned long long v36;  // x7
    unsigned long long v37;  // x5
    unsigned long long v20;  // x20
    unsigned long long v38;  // x7
    unsigned long long v39;  // x5
    unsigned long long v40;  // x7
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    long long v23;  // x21
    long long v24;  // x22
    long long v26;  // x20
    long long v27;  // x0
    unsigned long v0;  // [bp-0xa0]
    double v1;  // [bp-0x98]
    char v2;  // [bp-0x98]
    char v3;  // [bp-0x80]
    st_d0ed0_0 **v4;  // [bp-0x68], Other Possible Types: char
    st_d0ed0_0 *v5;  // [bp-0x60]
    st_d0ed0_0 **v6;  // [bp-0x58], Other Possible Types: char
    st_d0ed0_0 *v7;  // [bp-0x50]
    st_d0ed0_6 **i;  // [bp-0x44]
    st_d0ed0_6 **v9;  // [bp-0x40]
    st_d0ed0_6 **v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v11 = v18;
    v12 = v19;
    v13 = v20;
    v14 = v21;
    v15 = &v17;
    v16 = v22;
    v23 = sub_6b08();
    sub_64128(&v2, v23 + 1, &v10);
    v24 = sub_a0c8(&v2);
    sub_12478(v24, sub_a0c8(a0), v23);
    v26 = v24 + v23;
    sub_12478(v26, "/", 1);
    v10 = (st_d0ed0_6 **)0;
    sub_348a4(v26 + 1, 1, &v10);
    v27 = sub_a0c8(a1);
    v28 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, v27, sub_6b08(a1));
    sub_5c38(&v3, v28);
    v0 = 0xffffff8e00000000;
    v5 = &v4;
    v4 = &v5;
    v7 = &v6;
    v6 = &v7;
    i = (st_d0ed0_6 **)0;
    if (i)
    {
        v29 = 0xffffff8e;
    }
    else
    {
        v30 = &v0 | 4;
        do
        {
            if (g_f012a8 + g_f0dc70 * 9 != 3)
            {
                v9 = &v10;
                v10 = &v9;
                v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -121.0;
                if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                {
                    v31 = g_f012a9 + 7;
                    if ((unsigned int)(v31 / g_f012aa) != g_f012ab)
                        v31 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                }
                else
                {
                    v31 = 10;
                }
                v9 = &v10;
                v10 = &v9;
                v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -121.0;
                if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                {
                    v32 = g_f012a9 + 7;
                    if ((unsigned int)(v32 / g_f012aa) != g_f012ab)
                        v32 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                }
                else
                {
                    v32 = 10;
                }
                *(unsigned int *)((char *)v30 + 0x4 * i) = (unsigned int)v31 + *(int *)((char *)v30 + 0x4 * i) - ((unsigned int)v32 & *(int *)((char *)v30 + 0x4 * i)) * 2;
            }
            if ((g_f012a9 + 7) / g_f012aa != g_f012ab)
            {
                if (g_f012a8 + g_f0dc70 * 24 != 3)
                {
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -120.0;
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v33 = g_f012a9 + 7;
                        if ((unsigned int)(v33 / g_f012aa) != g_f012ab)
                            v33 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v33 = 10;
                    }
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -120.0;
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v34 = g_f012a9 + 7;
                        if ((unsigned int)(v34 / g_f012aa) != g_f012ab)
                            v34 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v34 = 10;
                    }
                    *(unsigned int *)((char *)v30 + 0x4 * i) = (unsigned int)v33 + *(int *)((char *)v30 + 0x4 * i) - ((unsigned int)v34 & *(int *)((char *)v30 + 0x4 * i)) * 2;
                }
                if (g_f012a8 + g_f0dc70 * 27 != 3)
                {
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -119.0;
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v35 = g_f012a9 + 7;
                        if ((unsigned int)(v35 / g_f012aa) != g_f012ab)
                            v35 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v35 = 10;
                    }
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -119.0;
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v36 = g_f012a9 + 7;
                        if ((unsigned int)(v36 / g_f012aa) != g_f012ab)
                            v36 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v36 = 10;
                    }
                    *(unsigned int *)((char *)v30 + 0x4 * i) = (unsigned int)v35 + *(int *)((char *)v30 + 0x4 * i) - ((unsigned int)v36 & *(int *)((char *)v30 + 0x4 * i)) * 2;
                }
                if ((g_f012a9 + 7) / g_f012aa != g_f012ab)
                {
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * (double)(int)(st_d0ed0_6 **)((char *)i - 122);
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v37 = g_f012a9 + 7;
                        if ((unsigned int)(v37 / g_f012aa) != g_f012ab)
                            v37 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v37 = 10;
                    }
                    v9 = &v10;
                    v10 = &v9;
                    v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * (double)(int)(st_d0ed0_6 **)((char *)i - 122);
                    if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                    {
                        v38 = g_f012a9 + 7;
                        if ((unsigned int)(v38 / g_f012aa) != g_f012ab)
                            v38 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                    }
                    else
                    {
                        v38 = 10;
                    }
                    *(unsigned int *)((char *)v30 + 0x4 * i) = (unsigned int)v37 + *(int *)((char *)v30 + 0x4 * i) - ((unsigned int)v38 & *(int *)((char *)v30 + 0x4 * i)) * 2;
                }
            }
            if (g_f012a8 + g_f0dc70 * 30 != 3)
            {
                v9 = &v10;
                v10 = &v9;
                v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -118.0;
                if ((g_f012a9 + 7) / g_f012aa == g_f012ab || g_f012a8 + g_f0dc70 * 3 == 3)
                {
                    v39 = g_f012a9 + 7;
                    if ((unsigned int)(v39 / g_f012aa) != g_f012ab)
                        v39 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                }
                else
                {
                    v39 = 10;
                }
                v9 = &v10;
                v10 = &v9;
                v1 = ((double)g_f012a8 * -2.0 + (double)g_f012ac) * -118.0;
                if ((g_f012a9 + 7) / g_f012aa != g_f012ab && g_f012a8 + g_f0dc70 * 3 != 3)
                {
                    v40 = 10;
                }
                else
                {
                    v40 = g_f012a9 + 7;
                    if ((unsigned int)(v40 / g_f012aa) != g_f012ab)
                        v40 = (int)(v1 * (double)(unsigned int)((g_f012a9 + 7) / g_f012aa - g_f012ab));
                }
                *(unsigned int *)((char *)v30 + 0x4 * i) = (unsigned int)v39 + *(int *)((char *)v30 + 0x4 * i) - ((unsigned int)v40 & *(int *)((char *)v30 + 0x4 * i)) * 2;
            }
            i = (char *)i + 1;
        } while (!i);
        v29 = *(unsigned int *)((void*)&v0 + 4);
    }
    sub_a0c8(&v3);
    (&g_f01220.field_0)[v29]();
}
