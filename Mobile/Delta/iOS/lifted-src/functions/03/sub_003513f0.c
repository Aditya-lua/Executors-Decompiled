/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3513f0..0x351ce0 (2288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3513f0_2 {
    char padding_0[256];
    unsigned long long field_100;
} st_3513f0_2;

typedef struct st_3513f0_1 {
    struct st_3513f0_0 *field_0;
} st_3513f0_1;

typedef struct st_3513f0_0 {
    char field_0;
} st_3513f0_0;

typedef struct st_3513f0_3 {
    char padding_0[96];
    struct st_3513f0_2 *field_60;
} st_3513f0_3;

extern long long g_e7d070;
extern st_3513f0_3 *g_f0d198;
extern long long g_f11cb0;
extern long long g_f11cc8;
extern long long g_f11ce0;
extern char g_10002b0;
extern char g_10002c8;

char * sub_3513f0(unsigned long long a0, unsigned long long a1)
{
    long long v29;  // x0
    unsigned long long v39;  // x15
    unsigned long long v40;  // x14
    unsigned long long v41;  // w16
    unsigned int v42;  // w21
    char *v43;  // x0
    unsigned long long v44;  // w8
    unsigned long long v45;  // x10
    unsigned int v46;  // x9
    unsigned long long v47;  // x10
    unsigned long long v31;  // x0
    unsigned long long v49;  // w14
    unsigned long long v50;  // x11
    unsigned int v51;  // x15
    unsigned long long v52;  // x14
    unsigned long long v53;  // w16
    unsigned long long v54;  // x0
    unsigned long long v55;  // w8
    unsigned long long v56;  // x9
    unsigned long long v57;  // x9
    unsigned long long v58;  // x9
    unsigned long long v32;  // w8
    unsigned long long v59;  // x9
    unsigned long long v60;  // w14
    unsigned long long v61;  // x12
    unsigned int v62;  // x15
    unsigned long long v63;  // x14
    unsigned long long v64;  // w16
    st_3513f0_2 *v65;  // x8
    long long v67;  // x0
    long long v68;  // x0
    unsigned long long v33;  // x10
    long long v69;  // x0
    unsigned int v34;  // x9
    unsigned long long v35;  // x10
    unsigned long long v37;  // w14
    unsigned long long v38;  // x12
    uint128_t v0;  // [bp-0x100]
    st_3513f0_0 **v1;  // [bp-0xe8], Other Possible Types: char
    st_3513f0_0 *v2;  // [bp-0xe0]
    char v3;  // [bp-0xd8]
    char *v4;  // [bp-0xc0]
    st_3513f0_0 **v5;  // [bp-0xb8], Other Possible Types: st_3513f0_1 **, char
    char *v6;  // [bp-0xb0], Other Possible Types: st_3513f0_0 *, st_3513f0_1 **
    st_3513f0_0 **j;  // [bp-0xa8]
    uint128_t v8;  // [bp-0xa0], Other Possible Types: char
    double v9;  // [bp-0xa0]
    unsigned int v10;  // [bp-0x98], Other Possible Types: unsigned long long
    char v11;  // [bp-0x94]
    unsigned long long v12;  // [bp-0x93]
    unsigned long long v13;  // [bp-0x90], Other Possible Types: uint128_t
    unsigned long long v14;  // [bp-0x8e]
    unsigned long long v15;  // [bp-0x89]
    char v16[8];  // [bp-0x80], Other Possible Types: double
    unsigned int v17;  // [bp-0x78]
    unsigned long long v18;  // [bp-0x74]
    unsigned long long v19;  // [bp-0x6e]
    unsigned long long v20;  // [bp-0x6c]
    unsigned long long v21;  // [bp-0x64]
    st_3513f0_0 *iter;  // [bp-0x60], Other Possible Types: double, unsigned long long
    unsigned int v23;  // [bp-0x58]
    unsigned long long v24;  // [bp-0x54]
    unsigned long long v25;  // [bp-0x50]
    unsigned long v26;  // [bp-0x38]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v26 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v29 = sub_3aae34();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, v29, _strlen(v29));
    v31 = sub_a0c8(&v3);
    v9 = -5.553459481960023e-137;
    v10 = (unsigned int)(1.4813269635e-314 >> 0);
    v11 = 42;
    v12 = 0;
    v14 = 0;
    iter = 0;
    if (25 >= iter)
    {
        do
        {
            *((char *)&v9 + iter) = (unsigned int)iter + 2957879593 + *((char *)&v9 + iter) - ((unsigned int)iter + 2957879593 & *((char *)&v9 + iter)) * 2 - 31;
            iter += 1;
        } while (iter < 26);
    }
    v6 = &v5;
    v5 = &v6;
    v32 = *(char *)&v9;
    if (v32)
    {
        v33 = &v9 | 1;
        v34 = 1;
        do
        {
            v35 = v33;
            v34 -= 1;
            v33 = v35 + 1;
        } while (*(char *)v35);
        while (1)
        {
            do
            {
                v37 = *(char *)v31;
                if (!v37)
                    goto LABEL_351564;
            } while ((v38 = v31, v31 += 1, v37 != v32));
            iter = &j;
            j = &iter;
            v39 = 1;
            v40 = v34;
            while (1)
            {
                if (!v40)
                {
LABEL_351554:
                    if (v38)
                        goto LABEL_351558;
                    goto LABEL_351564;
                }
                v41 = *(char *)(v38 + v39);
                if (v41 != *((char *)&v9 + v39))
                    break;
                v39 += 1;
                v40 += 1;
                if (!v41)
                    goto LABEL_351554;
            }
        }
    }
    else
    {
        if (v31)
        {
LABEL_351558:
            v42 = 1;
            goto LABEL_351674;
        }
LABEL_351564:
        v43 = sub_a0c8(&v3);
        iter = -5.781157349111546e-17;
        v23 = (unsigned int)(2.292324717e-315 >> 0);
        v24 = 0;
        v25 = 0;
        j = 0;
        if (16 >= (unsigned long long)j)
        {
            do
            {
                *(char *)(&iter + j) = (char)((unsigned int)(unsigned long long)j + 1535713963 + *(char *)(&iter + j) - ((unsigned int)(unsigned long long)j + 1535713963 & *(char *)(&iter + j)) * 2) + 83;
                j = (unsigned long long)j + 1;
            } while ((unsigned long long)j < 0x11);
        }
        v5 = &v4;
        v4 = &v5;
        v44 = *(char *)&iter;
        if (v44)
        {
            v45 = &iter | 1;
            v46 = 1;
            do
            {
                v47 = v45;
                v46 -= 1;
                v45 = v47 + 1;
            } while (*(char *)v47);
            while (1)
            {
                v49 = *v43;
                if (!v49)
                    break;
                v50 = v43;
                v43 += 1;
                if (v49 == v44)
                {
                    v6 = &j;
                    j = &v6;
                    v51 = 1;
                    v52 = v46;
                    while (1)
                    {
                        if (!v52)
                            goto LABEL_35166c;
                        v53 = *(char *)(v50 + v51);
                        if (v53 != *((char *)&iter + v51))
                            break;
                        v51 += 1;
                        v52 += 1;
                        if (!v53)
                            goto LABEL_35166c;
                    }
                }
            }
            v50 = 0;
        }
        else
        {
            v50 = v43;
        }
LABEL_35166c:
        v42 = v50 != 0;
LABEL_351674:
        v8 = 0x516b170b0f0801714e4d470f030c0d7e;
        v13 = 0x5a2056675a616058126e6e161f111012;
        strncpy(v16, ")%S/#/jW", 8);
        v17 = (unsigned int)(1.5514821276e-314 >> 0);
        v18 = 0;
        v20 = 0;
        iter = 0;
        if (52 >= iter)
        {
            do
            {
                (&v8)[iter] = (char)((unsigned int)iter + 2203413827 + (&v8)[iter] - ((unsigned int)iter + 2203413827 & (&v8)[iter]) * 2) + 43;
                iter += 1;
            } while (iter < 53);
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11cb0, &v8);
        v8 = 0x155b57535f5c65551e19275f5ba0a1ae;
        v13 = 0x524c56570245440c4a5e5e464f55545a;
        v16 = 2.136037743146989e+266;
        v0 = 3278929530;
        v17 = 3278929530;
        v18 = 0;
        v20 = 0;
        iter = 0;
        if (53 >= iter)
        {
            do
            {
                (&v8)[iter] = (char)((unsigned int)iter + 1703598333 + (&v8)[iter] - ((unsigned int)iter + 1703598333 & (&v8)[iter]) * 2) + 21;
                iter += 1;
            } while (iter < 54);
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11cc8, &v8);
        v8 = 0x955b57535f5c65559e99a75f5b20212e;
        v8 = _INSERT(CONCAT(v8, 0), 16, 0x524c56578245448c4a5e5e464f55545a);
        v16 = 5.468256622456292e+268;
        v17 = v0;
        v20 = 0;
        v18 = 0;
        v21 = 0;
        iter = 0;
        if (61 >= iter)
        {
            do
            {
                (&v8)[iter] = (char)((unsigned int)iter + 810420029 + (&v8)[iter] - ((unsigned int)iter + 810420029 & (&v8)[iter]) * 2) + 0x55;
                iter += 1;
            } while (iter < 62);
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11ce0, &v8);
        v54 = sub_a0c8(&v3);
        v8 = _INSERT(CONCAT(v8, 0), 0, 3.9746479685666376e+170);
        *(unsigned int *)&(&v8)[8] = (unsigned int)(6.657513654e-315 >> 0);
        (&v8)[12] = 248;
        *(unsigned long long *)&(&v8)[13] = 0;
        *(unsigned int *)&(&v8)[21] = 0;
        iter = 0;
        if (24 >= iter)
        {
            do
            {
                (&v8)[iter] = (char)((unsigned int)iter + 0xbb5e33fe + (&v8)[iter] - ((unsigned int)iter + 0xbb5e33fe & (&v8)[iter]) * 2) + 14;
                iter += 1;
            } while (iter < 25);
        }
        v6 = &v5;
        v5 = &v6;
        v55 = *&v8;
        if (v55)
        {
            v56 = 0;
            do
            {
                v57 = v56;
                v58 = v57 + 1;
                v56 = v58;
            } while ((&v8)[1 + v57]);
            v59 = 1 - v58;
        }
        else
        {
            if (v54)
                goto LABEL_35197c;
LABEL_351b5c:
            if ((v42 | (unsigned int)a0) == 1)
            {
                v65 = g_f0d198->field_60;
                v9 = -7.574891962493696e+269;
                v10 = 0;
                v13 = 0;
                v15 = 0;
                iter = 0;
                if (30 >= iter)
                {
                    do
                    {
                        *((char *)&v9 + iter) = (unsigned int)iter + 3292001662 + *((char *)&v9 + iter) - ((unsigned int)iter + 3292001662 & *((char *)&v9 + iter)) * 2 - 114;
                        iter += 1;
                    } while (iter < 31);
                }
                v65->field_100 = v65->field_100 | *(unsigned long long *)&v9;
                _dispatch_after(_dispatch_time(), &g_10002c8, &g_e7d070);
            }
            if (*(long long *)&g_10002b0 == v26)
                return &v3;
            v67 = __Unwind_Resume(___stack_chk_fail());
            v68 = __Unwind_Resume(__Unwind_Resume(v67));
            v69 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v68)));
            __Unwind_Resume(v69);
        }
    }
    while (1)
    {
        v60 = *(char *)v54;
        if (!v60)
            goto LABEL_351b5c;
        v61 = v54;
        v54 += 1;
        if (v60 != v55)
            continue;
        iter = &j;
        j = &iter;
        v62 = 1;
        v63 = v59;
        while (1)
        {
            if (!v63)
            {
LABEL_351970:
                if (!v61)
                    goto LABEL_351b5c;
LABEL_35197c:
                if (!(a0 & 1))
                {
                    v8 = 0x908df881eff6f8f8b4b5afe7fbe6e1f4;
                    v13 = 0x8097c285808dc79a849a9487869280c9;
                    v16 = -2.3924522766045286e-155;
                    v17 = (unsigned int)(2.97422815e-316 >> 0);
                    v18 = 0;
                    v20 = 0;
                    iter = 0;
                    if (53 >= iter)
                    {
                        do
                        {
                            (&v8)[iter] = (unsigned int)iter + 2252181042 + (&v8)[iter] - ((unsigned int)iter + 2252181042 & (&v8)[iter]) * 2 - 94;
                            iter += 1;
                        } while (iter < 54);
                    }
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11cb0, &v8);
                    v8 = 0xbcb1b48dbfb68c8c68697fa7a3a6a5a8;
                    v13 = 0x8c87428184b9478ab8b2b08786aa847d;
                    v16 = -4.821830322574525e-235;
                    v17 = (unsigned int)(9.6055166e-316 >> 0);
                    v18 = 0;
                    iter = 0;
                    if (47 >= iter)
                    {
                        do
                        {
                            (&v8)[iter] = (unsigned int)iter + 488468488 + (&v8)[iter] - ((unsigned int)iter + 488468488 & (&v8)[iter]) * 2 - 56;
                            iter += 1;
                        } while (iter < 48);
                    }
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11cc8, &v8);
                    v8 = CONCAT(0xf8e7bae5f8edb7f2f4f2f4e7e6fa1851, 0x80d10190f16101044454f0703061904);
                    v16 = -7.340380300595368e+306;
                    v17 = (unsigned int)(1.292798872e-314 >> 0);
                    v18 = 0;
                    v19 = 0;
                    iter = 0;
                    if (57 >= iter)
                    {
                        do
                        {
                            (&v8)[iter] = (char)((unsigned int)iter + 3691966702 + (&v8)[iter] - ((unsigned int)iter + 3691966702 & (&v8)[iter]) * 2) + 126;
                            iter += 1;
                        } while (iter < 58);
                    }
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&g_f11ce0, &v8);
                }
            }
            v64 = *(char *)(v61 + v62);
            if (v64 != (&v8)[v62])
                break;
            v62 += 1;
            v63 += 1;
            if (!v64)
                goto LABEL_351970;
        }
    }
}
