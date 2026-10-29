/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x75958..0x762b4 (2396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_75958_1 {
    char padding_0[8];
    struct st_75958_1 *field_8;
} st_75958_1;

typedef struct st_75958_2 {
    char padding_0[56];
    void* field_38;
    unsigned long long field_40;
    char padding_48[104];
    struct st_75958_1 *field_b0;
    char padding_b8[8];
    unsigned long long field_c0;
    unsigned int field_c8;
    char field_cc;
} st_75958_2;

typedef struct st_75958_4 {
    struct st_75958_1 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned int field_18;
    char field_1c;
} st_75958_4;

typedef struct st_75958_3 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_75958_3;

typedef struct st_75958_0 {
    char field_0;
} st_75958_0;

extern unsigned long long g_e6a988;
extern unsigned long long g_e6aa98;
extern unsigned long long g_e6aab0;
extern unsigned long long g_e6abd8;
extern long long g_f0d120;
extern long long g_f0d138;
extern long long g_f0d180;
extern char g_10002b0;

void sub_75958(st_75958_2 *a0, unsigned long a1, long long a2)
{
    unsigned long long v43;  // x28
    unsigned long long v44;  // x27
    unsigned long long v53;  // x30
    void* v54;  // x21
    unsigned long long v55;  // x8
    unsigned long v56;  // x28
    unsigned long v57;  // x24
    unsigned long long v58;  // x25
    unsigned long long v59;  // w11
    unsigned long long v60;  // x9
    unsigned long long v61;  // x27
    unsigned long long v62;  // x8
    unsigned long long v45;  // x26
    unsigned long v63;  // x8
    st_75958_3 *v64;  // x8
    unsigned long long v65;  // x8
    unsigned long long *v66;  // x9
    unsigned long long *v67;  // x8
    unsigned long long v68;  // 4118
    unsigned long long *v69;  // x9
    unsigned long long *v70;  // x8
    long long v71;  // x1
    st_75958_1 *v72;  // x8
    unsigned long long v46;  // x25
    unsigned long long v73;  // w21
    char *v74;  // x8
    unsigned short v76;  // x23
    unsigned long v78;  // x1
    unsigned long long *v80;  // x8
    unsigned long long v81;  // w9
    unsigned long long v82;  // w8
    unsigned long long v47;  // x24
    unsigned long long *v83;  // x9
    unsigned long long *v84;  // x9
    unsigned long long v48;  // x23
    unsigned long long v49;  // x22
    unsigned long long v50;  // x21
    unsigned long long v51;  // x20
    unsigned long long v52;  // x19
    unsigned int v0;  // [bp-0x228]
    unsigned int v1;  // [bp-0x224]
    unsigned long long v2;  // [bp-0x220]
    st_75958_4 *v3;  // [bp-0x218]
    st_75958_0 **v4;  // [bp-0x208], Other Possible Types: char
    st_75958_0 *v5;  // [bp-0x200]
    st_75958_0 **v6;  // [bp-0x1f8], Other Possible Types: char, unsigned long
    unsigned long long v7;  // [bp-0x1f0]
    st_75958_0 *v8;  // [bp-0x1e0], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0x1d8]
    unsigned long long v10;  // [bp-0x1d0]
    char v11;  // [bp-0x1c8]
    unsigned int v12;  // [bp-0x1b0]
    unsigned long long v13;  // [bp-0x1ac]
    char v14;  // [bp-0x1ab]
    char v15;  // [bp-0x1aa]
    char v16;  // [bp-0x1a9]
    unsigned long long v17;  // [bp-0x1a8]
    unsigned long long v18;  // [bp-0x1a4]
    unsigned int v19;  // [bp-0x1a0]
    unsigned long long v20;  // [bp-0x198]
    unsigned long long v21;  // [bp-0x190], Other Possible Types: unsigned short
    char v22;  // [bp-0x18e], Other Possible Types: unsigned long long
    char v23;  // [bp-0x18d], Other Possible Types: unsigned long long
    char v24;  // [bp-0x188], Other Possible Types: unsigned long long
    unsigned long long v25;  // [bp-0x180]
    st_75958_1 *v26;  // [bp-0x178], Other Possible Types: unsigned long long
    unsigned long long v27;  // [bp-0x178]
    unsigned long long v28;  // [bp-0x170]
    unsigned long v29;  // [bp-0x70]
    unsigned long long v30;  // [bp-0x60]
    unsigned long long v31;  // [bp-0x58]
    unsigned long long v32;  // [bp-0x50]
    unsigned long long v33;  // [bp-0x48]
    unsigned long long v34;  // [bp-0x40]
    unsigned long long v35;  // [bp-0x38]
    unsigned long long v36;  // [bp-0x30]
    unsigned long long v37;  // [bp-0x28]
    unsigned long long v38;  // [bp-0x20]
    unsigned long long v39;  // [bp-0x18]
    char *v40;  // [bp-0x10]
    unsigned long long v41;  // [bp-0x8]
    char v42;  // [bp+0x0]

    v30 = v43;
    v31 = v44;
    v32 = v45;
    v33 = v46;
    v34 = v47;
    v35 = v48;
    v36 = v49;
    v37 = v50;
    v38 = v51;
    v39 = v52;
    v40 = &v42;
    v41 = v53;
    v29 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    v1 = 1005;
    v0 = 1007;
    v2 = 2;
    v3 = &a0->field_b0;
    v54 = a0->field_38;
    v55 = a0->field_40 - v54;
    if (v55 < 2)
    {
LABEL_75a64:
        v82 = 3;
        goto LABEL_75a68;
    }
    v56 = *(char *)v54;
    v13 = (char)((unsigned int)v56 >> 7);
    v14 = ((char)v56 * 0 | (char)((unsigned int)v56 >> 6)) & 1;
    v15 = ((char)v56 * 0 | (char)((unsigned int)v56 >> 5)) & 1;
    v16 = ((char)v56 * 0 | (char)((unsigned int)v56 >> 4)) & 1;
    v57 = (char)v54[1];
    v17 = (char)v57 * 0 | (char)(v57 >> 7);
    v58 = v57 & 127;
    v18 = (unsigned int)v56 & 15;
    v19 = v58;
    if ((unsigned int)v58 == 126)
        v59 = 4;
    else
        v59 = 2;
    if (v17)
        v60 = 4;
    else
        v60 = 0;
    v61 = (v59 | ((unsigned int)v58 == 127) * 8) + v60;
    v12 = v61;
    if (v61 > v55)
        goto LABEL_75a64;
    if (v56 >> 6 & 1 && !sub_60768(&a0[2].padding_48[27], 5) || v56 >> 5 & 1 || v56 >> 4 & 1)
    {
        sub_74f58(a0, 1002, "Reserved bit used", a0->field_40 - a0->field_38, 0);
        v83 = &g_e6a988;
        v83 = &g_e6aab0;
        goto *((void *)(*v83));
    }
    if (125 >= (unsigned int)v58)
    {
        v62 = 2;
        v20 = v58;
        if (((unsigned int)v57 & 0xffffff80) == 128)
            goto LABEL_75ba4;
    }
    else if ((unsigned int)v58 == 126)
    {
        v63 = (short)v54[2];
        v58 = (unsigned int)((v63 & 0xff00) >> 8) | (unsigned int)v63 * 0x100 & 0xff00ff00;
        v62 = 4;
        v20 = v58;
        if (((unsigned int)v57 & 0xffffff80) == 128)
            goto LABEL_75ba4;
    }
    else
    {
        v58 = __builtin_bswap64((long long)v54[2]);
        v62 = 10;
        v20 = v58;
        if (((unsigned int)v57 & 0xffffff80) == 128)
        {
LABEL_75ba4:
            v64 = v54 + v62;
            v21 = v64->field_0;
            v22 = v64->field_2;
            v23 = v64->field_3;
            if (v58 > 0x8000000000000000)
            {
LABEL_75bcc:
                v82 = 1;
LABEL_75a68:
                v84 = &g_e6a988;
                if (v82 == 3)
                    v84 = &g_e6abd8;
                if (v82 == 1)
                    v84 = &g_e6aab0;
                goto *((void *)(*v84));
            }
LABEL_75b38:
            v65 = v58 + v61;
            if (v65 > a0->field_40 - a0->field_38)
            {
                *(unsigned long long *)&a0->padding_48[8] = v65;
                v66 = &g_e6a988;
                v67 = &g_e6aab0;
                goto *((void *)(*v67));
            }
            else
            {
                *(unsigned long long *)&a0->padding_48[8] = 0;
                if (!(v56 >> 7 & 1))
                {
                    v68 = arm64g_calculate_condition(49, v18 - 11, 3, 0);
                    if (!(v68 & 1))
                    {
                        sub_74f58(a0, 1002, &g_f0d138, 0, 0);
                        v69 = &g_e6a988;
                        v70 = &g_e6aab0;
                        goto *((void *)(*v70));
                    }
                }
                sub_74cf0(a0, &v12);
                v71 = a0->field_38 + v61;
                sub_64b60(&v11, v71, v71 + v58, v58);
                if (2 >= v18)
                {
                    if (v18)
                    {
                        a0->field_c8 = v18 != 1;
                        a0->field_cc = (char)sub_60768(&a0[2].padding_48[27], 5) & (char)((unsigned int)v56 >> 6);
                        if (!a0->field_c0)
                            goto LABEL_75d28;
                        goto LABEL_75d0c;
                    }
                    else if (!a0->field_c0)
                    {
LABEL_75d0c:
                        sub_74f58(a0, 1002);
                    }
LABEL_75d28:
                    if (v13 != 1 || a0->field_c0)
                    {
                        v8 = &v6;
                        v6 = &v8;
                        v25 = 1;
                        v26 = sub_166ec(&v24, 1);
                        *(unsigned long long *)v26->padding_0 = 0;
                        v26->field_8 = 0;
                        sub_5c38(v26 + 1, &v11);
                        v27 = 0;
                        sub_60c14(&v24);
                        v26->field_8 = v3;
                        v72 = a0->field_b0;
                        *(st_75958_1 **)v26->padding_0 = v72;
                        v72->field_8 = v26;
                        a0->field_b0 = v26;
                        a0->field_c0 = a0->field_c0 + 1;
                        if (v13 == 1)
                        {
                            sub_72384(a0);
                            sub_73560(a0, a0->field_c8, &v24, a0->field_cc, a2);
                            sub_737e0(v3);
                            a0->field_cc = 0;
                        }
                        else
                        {
                            v24 = 0;
                            v25 = 0;
                            v26 = 0;
                            sub_73560(a0, 4, &v24, 0, a2);
LABEL_760c4:
                        }
                    }
                    else
                    {
                        sub_73560(a0, a0->field_c8, &v11, a0->field_cc, a2);
                        a0->field_cc = 0;
                    }
                }
                else
                {
                    if (v18 == 8)
                    {
                        v8 = 0;
                        v9 = 0;
                        v10 = 0;
                        if (v58 >= 2)
                        {
                            v74 = a0->field_38 + v61;
                            if (v58 != 2)
                            {
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v24, &v11, 2, sub_6b08(&v11), &v6);
                                sub_5ccc(&v8, &v24);
                            }
                            if (sub_6bb1c(&v8) & 1)
                            {
                                v76 = v74[1] | *v74 * 0x100;
                            }
                            else
                            {
                                v8 = (char)g_f0d180;
                                v76 = v0;
                            }
                            if (v76 - 1014 < 1986 || v76 < 1000 || (v76 & 0xfffd) == 1004)
                            {
                                sub_62748(&v24);
                                v78 = v76;
                                std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(sub_60404(sub_63dc4(&v26, "Invalid close code"), ": ", 2), v78, 2);
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, sub_62368(&v28), v78, v78);
                                sub_5ccc(&v8, &v6);
                                sub_623b8(&v24);
                                v76 = 1002;
                            }
                        }
                        else
                        {
                            v8 = *"No status code";
                            v76 = v1;
                        }
                        if (sub_740a4(&a0[1].padding_48[3], 5))
                        {
                            sub_72ecc(a0, 0);
                            sub_762b4(a0, v76, &v8);
                            sub_74950(a0, v2);
                            sub_73700(a0, v76, &v8, a0->field_40 - a0->field_38, 1);
                        }
                        else if (sub_724dc((char *)&a0[2].field_38 + 6, 5) == v76)
                        {
                            std::__1::mutex::lock((char *)&a0[1].field_c8 + 3);
                            std::__1::mutex::unlock((char *)&a0[1].field_c8 + 3);
                            if (sub_20b98((char *)&a0[1].field_b0 + 3, &v8))
                                sub_73700(a0, v76, &v8, a0->field_40 - a0->field_38, 0);
                        }
                        goto LABEL_760c4;
                    }
                    if (v18 == 10)
                    {
                        sub_60b20(&a0[3].padding_48[97], 1, 5);
                        goto LABEL_75f48;
                    }
                    else if (v18 == 9)
                    {
                        if (sub_6b08(&v11) >= 126)
                        {
                            sub_74f58(a0, 1002, &g_f0d120, 0, 0);
                            v73 = 0;
                            goto LABEL_760e0;
                        }
                        else if (sub_60768(&a0[3].padding_48[89], 5))
                        {
                            v6 = sub_a0c8(&v11);
                            v7 = sub_6b08(&v11);
                            v28 = 0;
                            sub_749a8(a0, 10, &v6, 0, &v24);
                            sub_181a8(&v24);
                        }
LABEL_75f48:
                        sub_73560(a0);
                    }
                    else
                    {
                        sub_74f58(a0, 1002, "Protocol error", a0->field_40 - a0->field_38, 0);
                    }
                }
                sub_75490(&a0->field_38, a0->field_38, v61 + a0->field_38 + v58);
                v73 = 1;
LABEL_760e0:
                v80 = &g_e6a988;
                v81 = v73 ^ 1;
                if (v73)
                    v80 = &g_e6aa98;
                if (v81 == 3)
                    v80 = &g_e6abd8;
                if (v81 == 1)
                    v80 = &g_e6aab0;
                goto *((void *)(*v80));
            }
        }
    }
    v21 = 0;
    v22 = 0;
    v23 = 0;
    if (0x8000000000000000 < v58)
        goto LABEL_75bcc;
    goto LABEL_75b38;
}
