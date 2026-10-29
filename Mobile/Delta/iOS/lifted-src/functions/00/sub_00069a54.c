/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69a54..0x6a44c (2552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69a54_1 {
    struct st_69a54_0 *field_0;
} st_69a54_1;

typedef struct st_69a54_0 {
    char field_0;
} st_69a54_0;


unsigned long long * sub_69a54(long long a0)
{
    long long v20;  // x0
    long long v21;  // x0
    long long v30;  // x0
    long long v31;  // x0
    unsigned long long v32;  // 4110
    long long v33;  // x0
    long long v34;  // x0
    unsigned long long v35;  // 4106
    long long v36;  // x23
    long long v37;  // x22
    unsigned long long v38;  // 4106
    long long v39;  // w8
    unsigned long long v22;  // 4106
    long long v40;  // x0
    char *v41;  // x0
    long long v42;  // x0
    long long v43;  // x0
    unsigned long long v44;  // 4110
    long long v45;  // x23
    long long v46;  // x0
    unsigned long long v47;  // x24
    long long v48;  // x0
    unsigned long long v49;  // 4106
    long long v23;  // x21
    unsigned long long v50;  // 4106
    unsigned int v51;  // w8
    unsigned long long v52;  // 4109
    unsigned long long v53;  // 4106
    long long v54;  // x0
    unsigned long long v55;  // x0
    unsigned long long v56;  // 4106
    unsigned long long v57;  // 4106
    long long v58;  // x0
    long long v59;  // x23
    long long v24;  // x0
    long long v60;  // x0
    unsigned long long v61;  // 4106
    long long v62;  // x0
    unsigned long long v63;  // 4106
    long long v64;  // x21
    long long v65;  // x22
    unsigned long long v66;  // 4106
    unsigned long long *v67;  // x0
    unsigned int *v68;  // x8
    unsigned long long v25;  // x0
    unsigned long long v26;  // x0
    long long v28;  // x22
    long long v29;  // x21
    st_69a54_0 **v0;  // [bp-0x170], Other Possible Types: char
    st_69a54_0 *v1;  // [bp-0x168]
    st_69a54_1 **v2;  // [bp-0x160], Other Possible Types: st_69a54_0 *, char
    char v3;  // [bp-0x148]
    unsigned int v4;  // [bp-0x130], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x128]
    unsigned long long v6;  // [bp-0x118]
    unsigned long long v7;  // [bp-0x108]
    unsigned long long v8;  // [bp-0xf8]
    unsigned long long v9;  // [bp-0xe8]
    unsigned long long v10;  // [bp-0xd8]
    unsigned long long v11;  // [bp-0xc8]
    unsigned long long v12;  // [bp-0xb8]
    unsigned long long v13;  // [bp-0xa8]
    unsigned long long v14;  // [bp-0x98]
    unsigned long long v15;  // [bp-0x88]
    unsigned long long v16;  // [bp-0x78]
    st_69a54_0 **v17;  // [bp-0x68], Other Possible Types: st_69a54_1 **
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v1 = &v0;
    v0 = &v1;
    v4 = 1;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v16 = 0;
    v20 = sub_a0c8();
    v21 = sub_c854(v20, sub_6b08(a0), 58, 0);
    v22 = arm64g_calculate_condition(2, v21, 1, 0);
    if (v22 & 1)
    {
        v39 = 2;
        goto LABEL_69c94;
    }
    v23 = v21;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a0, 0, v23, &v2);
    sub_5ccc(&v5, &v3);
    if (sub_69578(&v5) & 1)
    {
        v24 = sub_a0c8(&v5);
        v25 = sub_a0c8(&v5);
        v26 = sub_6b08(&v5);
        sub_693a4(v24, v25 + v26, sub_a0c8(&v5), 0x693a0);
        v28 = v23 + 2;
        if (sub_6b08(a0) > (unsigned long long)v28 && *(char *)sub_2fa10(a0, v23 + 1) == 47 && *(char *)sub_2fa10(a0, v28) == 47)
        {
            v29 = v23 + 3;
            v30 = sub_a0c8(a0);
            v31 = sub_6a44c(v30, sub_6b08(a0), "/?", v29, 2);
            v32 = arm64g_calculate_condition(18, v31, 1, 0);
            if (!(v32 & 1))
                v31 = sub_6b08(a0);
            v33 = sub_a0c8(a0);
            v34 = sub_c854(v33, sub_6b08(a0), 64, v29);
            v35 = arm64g_calculate_condition(2, v34, 1, 0);
            if (v35 & 1 || (v36 = v34, (unsigned long long)v31 <= (unsigned long long)v34))
                goto LABEL_69dd8;
            v37 = v36 + 1;
            v38 = arm64g_calculate_condition(2, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 64, v37), 1, 0);
            if (!(v38 & 1) && (unsigned long long)v31 > std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 64, v37))
            {
                v39 = 16;
                goto LABEL_69c94;
            }
            else
            {
                v40 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 58, v29);
                if ((unsigned long long)v36 > (unsigned long long)v40)
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a0, v29, v40 - v29, &v2);
                    sub_5ccc(&v14, &v3);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a0, v40 + 1, v36 + ~v40, &v2);
                    v41 = &v15 + 1;
                }
                else
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a0, v29, v36 - v29, &v2);
                    v41 = &v14;
                }
                sub_5ccc(v41, &v3);
                v29 = v37;
LABEL_69dd8:
                v42 = sub_a0c8(a0);
                v43 = sub_6a44c(v42, sub_6b08(a0), "/?", v29, 2);
                v44 = arm64g_calculate_condition(18, v43, 1, 0);
                if (!(v44 & 1))
                    v43 = sub_6b08(a0);
                v45 = v43 - v29;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, a0, v29, v45, &v2);
                v46 = sub_a0c8(&v3);
                v47 = sub_c854(v46, sub_6b08(&v3), 91, 0);
                v48 = sub_a0c8(&v3);
                v49 = arm64g_calculate_condition(2, sub_c854(v48, sub_6b08(&v3), 93, 0), 1, 0);
                if (!(v49 & 1) && (v50 = arm64g_calculate_condition(18, v47, 1, 0), !(v50 & 1)))
                {
                    v51 = 10;
                    goto LABEL_69eb8;
                }
                v52 = arm64g_calculate_condition(130, v47 - 1, 3, 0);
                if (!(v52 & 1))
                {
                    v51 = 11;
                    goto LABEL_69eb8;
                }
                v53 = arm64g_calculate_condition(18, v47, 1, 0);
                if (!(v53 & 1))
                {
                    v54 = sub_a0c8(&v3);
                    v55 = sub_a0c8(&v3);
                    v17 = (st_69a54_0 **)58;
                    if (sub_6a520(v54, v55 + sub_6b08(&v3), &v17, &v2) < 2)
                        goto LABEL_69f84;
                    v56 = arm64g_calculate_condition(18, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(&v3, 46, 0), 1, 0);
                    if (v56 & 1 || (v57 = arm64g_calculate_condition(2, sub_699f8(&v3, "0123456789abcdefABCDEF:", 0), 1, 0), !(v57 & 1)))
                    {
                        v51 = 12;
                        goto LABEL_69eb8;
                    }
                    else
                    {
                        v51 = 15;
                        goto LABEL_69eb8;
                    }
                }
LABEL_69f84:
                if ((unsigned long long)v43 > (unsigned long long)v29 && *(char *)sub_2fa10(a0, v29) == 91)
                {
                    v58 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 93, v29 + 1);
                    if ((unsigned long long)v43 > (unsigned long long)v58)
                    {
                        v59 = v58;
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v29 + 1, v59 + ~v29, &v17);
                        sub_5ccc(&v6 + 1, &v2);
                        v2 = &v17;
                        v17 = &v2;
                        if (sub_6b08(&v6 + 1))
                        {
                            if ((unsigned long long)v43 <= (unsigned long long)(v59 + 1))
                                goto LABEL_6a14c;
                            if (*(char *)sub_2fa10(a0) == 58)
                            {
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v59 + 2, v43 - v59 - 2, &v17);
                                sub_5ccc(&v8, &v2);
                                v2 = &v17;
                                v17 = &v2;
                                goto LABEL_6a10c;
                            }
                            else
                            {
                                v51 = 7;
                                goto LABEL_69eb8;
                            }
                        }
                        else
                        {
                            v51 = 14;
                            goto LABEL_69eb8;
                        }
                    }
                    else
                    {
                        v51 = 6;
                        goto LABEL_69eb8;
                    }
                    goto LABEL_69eb8;
                }
                v60 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 58, v29);
                if ((unsigned long long)v43 > (unsigned long long)v60)
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v29, v60 - v29, &v17);
                    sub_5ccc(&v6 + 1, &v2);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v60 + 1, v43 + ~v60, &v17);
                    sub_5ccc(&v8, &v2);
                    v2 = &v17;
                    v17 = &v2;
LABEL_6a10c:
                    if (sub_6b08(&v8))
                        goto LABEL_6a14c;
                    v51 = 13;
                    goto LABEL_69eb8;
                }
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v29, v45, &v17);
                sub_5ccc(&v6 + 1, &v2);
LABEL_6a14c:
                v2 = &v17;
                v17 = &v2;
                if (sub_6b08(&v6 + 1))
                {
                    v61 = arm64g_calculate_condition(2, sub_699f8(&v8, "0123456789", 0), 1, 0);
                    if (!(v61 & 1))
                    {
                        v51 = 9;
                        goto LABEL_69eb8;
                    }
                    if (sub_6b08(a0) > (unsigned long long)v43)
                    {
                        if (*(char *)sub_2fa10(a0, v43) == 47 || *(char *)sub_2fa10(a0, v43) == 63)
                        {
                            if (*(char *)sub_2fa10(a0, v43) == 47)
                                v43 += 1;
                            v62 = sub_6a4c4();
                            v63 = arm64g_calculate_condition(2, v62, 1, 0);
                            if (!(v63 & 1))
                            {
                                v64 = v62;
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v43, v62 - v43, &v17);
                                sub_5ccc(&v9 + 1, &v2);
                                if (sub_6b08(a0) > (unsigned long long)v64 && *(char *)sub_2fa10(a0, v64) == 63)
                                {
                                    v65 = v64 + 1;
                                    v64 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::find(a0, 35, v65);
                                    v66 = arm64g_calculate_condition(2, v64, 1, 0);
                                    if (!(v66 & 1))
                                    {
                                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v65, v64 - v65, &v17);
                                        sub_5ccc(&v11, &v2);
                                        goto LABEL_6a2b8;
                                    }
                                    else
                                    {
                                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v65, -0x1, &v17);
                                        v67 = &v11;
                                    }
                                }
                                else
                                {
LABEL_6a2b8:
                                    if (sub_6b08(a0) <= (unsigned long long)v64 || *(char *)sub_2fa10(a0, v64) != 35)
                                        goto LABEL_6a34c;
                                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v64 + 1, -0x1, &v17);
                                    v67 = &v12 + 1;
                                }
                            }
                            else
                            {
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a0, v43, -0x1, &v17);
                                v67 = &v9 + 1;
                            }
                            sub_5ccc(v67, &v2);
                            goto LABEL_6a34c;
                        }
                        else
                        {
                            v51 = 5;
                        }
LABEL_69eb8:
                        *v68 = v51;
                        memset(v68 + 2, 0, 192);
                    }
                    else
                    {
LABEL_6a34c:
                        v4 = 0;
                        sub_694dc(v68, &v4);
                    }
                }
                else
                {
                    v51 = 8;
                    goto LABEL_69eb8;
                }
            }
        }
        else
        {
            v39 = 4;
LABEL_69c94:
            *v68 = v39;
            memset(v68 + 2, 0, 192);
        }
    }
    else
    {
        v39 = 3;
        goto LABEL_69c94;
    }
    return &v5;
}
