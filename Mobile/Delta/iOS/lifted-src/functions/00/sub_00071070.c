/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71070..0x71434 (964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71070_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_71070_1;

typedef struct st_71070_0 {
    char field_0;
} st_71070_0;

extern long long g_cbed28;
extern unsigned long long g_e6a7f8;
extern unsigned long long g_e6a808;
extern unsigned long long g_e6a810;
extern char g_10002b0;

void sub_71070(long long *a0, long long a1)
{
    unsigned long long v27;  // x28
    unsigned long long v28;  // x27
    unsigned long long v37;  // x30
    st_71070_1 *v38;  // x8
    unsigned long v39;  // x26
    unsigned long long v40;  // x25
    unsigned long long v41;  // w24
    unsigned long v42;  // cc_op
    unsigned long long v43;  // cc_dep1
    unsigned long v44;  // cc_dep2
    unsigned int v45;  // w8
    char *v46;  // x28
    unsigned long long v29;  // x26
    unsigned int v47;  // w8
    unsigned long v49;  // cc_op
    unsigned long v50;  // cc_dep1
    unsigned long v51;  // cc_dep2
    unsigned long v52;  // cc_ndep
    unsigned long long v53;  // 4112
    unsigned int v54;  // w8
    unsigned long long v55;  // 4114
    unsigned long long v30;  // x25
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4114
    unsigned long long v31;  // x24
    char v58;  // x9
    unsigned long long v59;  // 4112
    unsigned long long *v60;  // x8
    unsigned long long v32;  // x23
    unsigned long long v61;  // 4105
    unsigned long long v62;  // 4112
    unsigned long long v63;  // 4105
    unsigned long v65;  // x25
    unsigned long v66;  // x8
    unsigned long v67;  // x24
    unsigned long long v68;  // x24
    unsigned long long v69;  // x25
    long long v70;  // x0
    unsigned long long v33;  // x22
    long long v71;  // x1
    unsigned long long v72;  // x0
    unsigned long long v73;  // x0
    unsigned long long v34;  // x21
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    st_71070_0 *v0;  // [bp-0x500]
    st_71070_0 **v1;  // [bp-0x4f8], Other Possible Types: char
    char *v2;  // [bp-0x4f0], Other Possible Types: char
    char v3;  // [bp-0x4d8], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x4d0]
    unsigned long long v5;  // [bp-0x4c8]
    char v6;  // [bp-0x4c0]
    char v7;  // [bp-0x4a8]
    unsigned long long *v8;  // [bp-0x490]
    unsigned long long v9;  // [bp-0x488]
    unsigned long long v10;  // [bp-0x480]
    char v11;  // [bp-0x471]
    char v12;  // [bp-0x470]
    unsigned long v13;  // [bp-0x70]
    unsigned long long v14;  // [bp-0x60]
    unsigned long long v15;  // [bp-0x58]
    unsigned long long v16;  // [bp-0x50]
    unsigned long long v17;  // [bp-0x48]
    unsigned long long v18;  // [bp-0x40]
    unsigned long long v19;  // [bp-0x38]
    unsigned long long v20;  // [bp-0x30]
    unsigned long long v21;  // [bp-0x28]
    unsigned long long v22;  // [bp-0x20]
    unsigned long long v23;  // [bp-0x18]
    char *v24;  // [bp-0x10]
    unsigned long long v25;  // [bp-0x8]
    char v26;  // [bp+0x0]

    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = &v26;
    v25 = v37;
    v13 = *(long long *)&g_10002b0;
    v0 = &v1;
    v1 = &v0;
    v9 = 0;
    v10 = 0;
    v39 = v38 + 1;
    v8 = &v9;
    if (sub_66170(*a0, &v12, a1) && sub_66170(*a0, &v12 + 1, a1))
    {
        v40 = 0;
        v41 = *&(&v12)[1] == 58;
        v42 = 4;
        v43 = 2;
        v44 = 0x3fe;
        while (1)
        {
            v45 = (&v12)[v40];
            v42 = 3;
            v43 = v45 & 0xff;
            v44 = 13;
            if (v45 == 13)
                break;
            v46 = &(&v12)[v40];
            v47 = v46[1];
            v42 = 3;
            v43 = v47 & 0xff;
            v44 = 10;
            if (v47 == 10)
                break;
            if (!(sub_66170(*a0, v46 + 2, a1) & 1))
                goto LABEL_71304;
            if (!v41)
            {
                v53 = arm64g_calculate_condition(v49, v50, v51, v52);
                v54 = (unsigned int)v40 + 2;
                v55 = arm64g_calculate_condition(3, (v53 & 1 ? v46[2] : 0), (v53 & 1 ? 58 : 0), 0);
                if (!(v55 & 1))
                    goto LABEL_7115a;
LABEL_71159:
                v41 = v54;
                goto LABEL_7115c;
            }
            else
            {
                v56 = arm64g_calculate_condition(v49, v50, v51, v52);
                v54 = (unsigned int)v40 + 2;
                v57 = arm64g_calculate_condition(0, (v56 & 1 ? v46[2] : 0), (v56 & 1 ? 58 : 0), 0);
                if (v57 & 1)
                    goto LABEL_71159;
LABEL_7115a:
LABEL_7115c:
                v40 += 1;
                v43 = v40 + 2;
                v42 = 4;
                v44 = 0x3fe;
                if (v43 > 0x3fe)
                    break;
            }
        }
        v58 = *&(&v12)[1];
        if (*&v12 == 13)
        {
            v59 = arm64g_calculate_condition(v42, v43, v44, 0);
            v60 = &g_e6a7f8;
            v61 = arm64g_calculate_condition(3, (v59 & 1 ? v58 : 0), (v59 & 1 ? 10 : 0), 0);
            if (!(v61 & 1))
                goto LABEL_71188;
        }
        else
        {
            v62 = arm64g_calculate_condition(v42, v43, v44, 0);
            v60 = &g_e6a7f8;
            v63 = arm64g_calculate_condition(0, (v62 & 1 ? v58 : 0), (v62 & 1 ? 10 : 0), 0);
            if (!(v63 & 1))
            {
LABEL_71188:
                if (v41 >= 1)
                {
                    (&v12)[2 + v40] = 0;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, &v12, _strlen(&v12));
                    v65 = v41;
                    v66 = v65 + 1;
                    do
                    {
                        v67 = v66;
                    } while ((int)sub_6b08(&v7) > (int)v67 && (v66 = v67 + 1, *(char *)sub_9c78(&v7, v67) == 32));
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v6, &v7, 0, v65, &v3);
                    v3 = 0;
                    v4 = 0;
                    v5 = 0;
                    if ((int)sub_6b08(&v7) > (int)v67)
                    {
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, &v7, v67 & 0xffffffff, -0x1, &v11);
                        sub_5ccc(&v3, &v2);
                        v68 = sub_a0c8(&v3);
                        v69 = sub_6b08(&v3);
                        v70 = sub_a0c8(&v3);
                        v71 = v68 + v69;
                        sub_71004(v68 + v69, v71, v70, v70);
                        v72 = sub_a0c8(&v3);
                        v73 = sub_6b08(&v3);
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::erase(&v3, v71 - sub_a0c8(&v3), v72 + v73 - v71);
                    }
                    v2 = &v6;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(sub_70f04(&v8, &v6, &g_cbed28, &v2, &v11) + 56, &v3);
                    goto *((void *)(g_e6a810));
                }
                else
                {
                    goto *((void *)(g_e6a810));
                }
            }
        }
    }
    else
    {
LABEL_71304:
        v38->padding_0[0] = 0;
        *(unsigned long long *)v39 = 0;
        *(unsigned long long *)(v39 + 8) = 0;
        v38->field_8 = v39;
        sub_62144(&v38->field_8, v8, &v9);
        v60 = &g_e6a808;
    }
    goto *((void *)(*v60));
}
