/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c3594..0x3c3dec (2136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c3594_2 {
    struct st_3c3594_3 *field_0;
    char field_3;
    char field_4;
    char field_5;
    char field_6;
    char field_7;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[24];
    unsigned long long field_38;
    char padding_40[16];
    struct st_3c3594_4 *field_50;
    char padding_58[24];
    unsigned long long field_70;
    struct st_3c3594_4 *field_78;
    char padding_80[12];
    unsigned int field_8c;
    unsigned int field_90;
    char padding_94[8];
    unsigned int field_9c;
    char padding_a0[4];
    unsigned int field_a4;
    char padding_a8[4];
    unsigned int field_ac;
} st_3c3594_2;

typedef struct st_3c3594_1 {
    char padding_0[208];
    unsigned int field_d0;
} st_3c3594_1;

typedef struct st_3c3594_5 {
    unsigned int field_0;
} st_3c3594_5;

typedef struct st_3c3594_4 {
    unsigned long long field_0;
} st_3c3594_4;

typedef struct st_3c3594_3 {
    struct st_3c3594_2 *field_0;
} st_3c3594_3;

typedef struct st_3c3594_0 {
    char field_0;
} st_3c3594_0;

extern long long g_cbed28;

unsigned long long sub_3c3594(long long a0, st_3c3594_1 *a1, st_3c3594_2 *a2)
{
    unsigned long v8;  // x21
    long long v9;  // x0
    char *v18;  // x0
    st_3c3594_5 **v19;  // x22
    unsigned int v20;  // w24
    unsigned int v21;  // w25
    unsigned int i;  // w25
    unsigned int *j;  // x25
    unsigned int *v24;  // x26
    unsigned int *v25;  // x25
    long long v26;  // x0
    unsigned int *v27;  // x0
    char *v10;  // x0
    unsigned int v28;  // w22
    unsigned int k;  // w22
    st_3c3594_2 *v30;  // x8
    unsigned long long v31;  // x22
    unsigned long long v32;  // x0
    unsigned int v33;  // w28
    unsigned int i3;  // w28
    unsigned int v35;  // w21
    unsigned int l;  // w21
    unsigned int v37;  // w21
    long long v11;  // x0
    unsigned int m;  // w21
    st_3c3594_2 *v39;  // x8
    unsigned int v40;  // w10
    unsigned long v41;  // cc_dep1
    unsigned long long v42;  // x22
    unsigned int v43;  // w8
    unsigned int v44;  // w9
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4102
    unsigned long long v47;  // 4112
    char *v12;  // x0
    unsigned long long v48;  // 4102
    long long v49;  // x0
    long long v50;  // x0
    char *v51;  // x0
    unsigned long long n;  // x26
    unsigned long long v53;  // x9
    unsigned long v54;  // x10
    long long v55;  // x0
    char *v56;  // x0
    st_3c3594_2 *v57;  // x8
    long long v13;  // x0
    unsigned long long i0;  // x23
    unsigned long long v59;  // w9
    unsigned long v60;  // x10
    long long v61;  // x0
    unsigned int *v62;  // x0
    long long v63;  // x0
    unsigned long long v64;  // x23
    unsigned long long v65;  // x22
    long long v66;  // x0
    unsigned long long v67;  // x21
    char *v14;  // x0
    unsigned long long v68;  // x21
    unsigned long long i1;  // x24
    unsigned int v70;  // w21
    unsigned int i4;  // w21
    unsigned int v72;  // w21
    unsigned int i5;  // w21
    unsigned int v74;  // w21
    unsigned int i6;  // w21
    long long v76;  // x0
    char *v77;  // x0
    long long v15;  // x0
    unsigned long long v78;  // x21
    unsigned long long v79;  // x21
    unsigned long long v80;  // x0
    unsigned long long i2;  // x23
    unsigned int v82;  // w21
    unsigned int i7;  // w21
    unsigned long long v84;  // x0
    long long v85;  // x0
    unsigned long long v86;  // x0
    char *v16;  // x0
    long long v17;  // x0
    unsigned long long v0;  // [bp-0x90]
    st_3c3594_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_3c3594_0 *v2;  // [bp-0x80]
    st_3c3594_2 *v3;  // [bp-0x78]
    st_3c3594_3 **v4;  // [bp-0x70], Other Possible Types: st_3c3594_2 *
    st_3c3594_3 **v5;  // [bp-0x68], Other Possible Types: st_3c3594_2 **
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = &v1;
    v3 = a2;
    v1 = &v2;
    v5 = &v3;
    v8 = *(int *)(sub_3c0b44(&a1->padding_0[24], &v3, &g_cbed28, &v5, &v4) + 24);
    v4 = &v5;
    v5 = &v4;
    v9 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v9 + 1, 0);
    v10 = sub_9c78(a0, v9);
    *v10 = *((char *)&v3->field_0 + 7);
    v4 = &v5;
    v5 = &v4;
    v11 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v11 + 1, 0);
    v12 = sub_9c78(a0, v11);
    *v12 = *((char *)&v3->field_0 + 4);
    v4 = &v5;
    v5 = &v4;
    v13 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v13 + 1, 0);
    v14 = sub_9c78(a0, v13);
    *v14 = *((char *)&v3->field_0 + 5);
    v4 = &v5;
    v5 = &v4;
    v15 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v15 + 1, 0);
    v16 = sub_9c78(a0, v15);
    *v16 = *((char *)&v3->field_0 + 3);
    v4 = &v5;
    v5 = &v4;
    v17 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v17 + 1, 0);
    v18 = sub_9c78(a0, v17);
    *v18 = *((char *)&v3->field_0 + 6);
    v4 = &v5;
    v5 = &v4;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, 0);
    v5 = &v3;
    v19 = sub_3c0ecc(&a1->padding_0[128], &v3, &g_cbed28, &v5, &v4);
    v0 = v19[4] - v19[3];
    v20 = v0 >> 2;
    v4 = &v5;
    v5 = &v4;
    v21 = v20;
    do
    {
        i = v21;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i & 127 | (i > 127) * 128);
        v21 = i >> 7;
    } while (127 < i);
    j = v19[3];
    v24 = v19[4];
    if (j != v24)
    {
        do
        {
            v25 = j + 1;
            v4 = &v5;
            v5 = &v4;
            v26 = sub_6b08(a0);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v26 + 4, 0);
            v27 = sub_9c78(a0, v26);
            *v27 = *j;
            j = v25;
        } while (j != v24);
    }
    sub_3c2784(a0, a1, v3, v8);
    v28 = *(int *)&v3->padding_94[0];
    v5 = &v4;
    v4 = &v5;
    do
    {
        k = v28;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)k & 127 | (k > 127) * 128);
        v28 = k >> 7;
    } while (127 < k);
    v30 = v3;
    if (*(int *)&v30->padding_94[0] >= 1)
    {
        v31 = 0;
        do
        {
            v32 = sub_3c1888(&a1->padding_0[24], v30->field_10 + v31 * 8);
            if (!v32 || (v33 = *(int *)(v32 + 24), (unsigned int)v8 <= (unsigned int)*(int *)(v32 + 24)))
            {
                *(char *)&a1->field_d0 = 1;
                v4 = &v5;
                v5 = &v4;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, 0);
            }
            else
            {
                v4 = &v5;
                v5 = &v4;
                do
                {
                    i3 = v33;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i3 & 127 | (i3 > 127) * 128);
                    v33 = i3 >> 7;
                } while (127 < i3);
            }
        } while ((v31 += 1, v30 = v3, *(int *)&v30->padding_94[0] > (long long)v31));
    }
    v35 = *(int *)&v30->padding_94[4];
    v5 = &v4;
    v4 = &v5;
    do
    {
        l = v35;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)l & 127 | (l > 127) * 128);
        v35 = l >> 7;
    } while (127 < l);
    v37 = sub_3c25f8(a1, *(long long *)&v3->padding_8[3]);
    v5 = &v4;
    v4 = &v5;
    do
    {
        m = v37;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)m & 127 | (m > 127) * 128);
        v37 = m >> 7;
    } while (127 < m);
    v39 = v3;
    if (*(long long *)&v39->padding_58[16] && (int)v20 >= 1 && *(long long *)&v39->padding_20[16] && !(v40 = v39->field_9c, v41 = v40, 31 < v40))
    {
        v42 = v20 - 1 >> ((char)v40 & 31);
        v43 = *(int *)&v39->padding_80[4];
        v44 = (v20 + 3 & 0x7ffffffc) + (unsigned int)v42 * 4 + 4;
        if (1 <= (int)v43)
        {
            v45 = arm64g_calculate_condition(163, v41, 31, 0);
            v46 = arm64g_calculate_condition(179, (v45 & 1 ? v43 : 0), (v45 & 1 ? v44 : 0), 0);
            if (!(v46 & 1))
                goto LABEL_3c39a4;
        }
        else
        {
            v47 = arm64g_calculate_condition(163, v41, 31, 0);
            v48 = arm64g_calculate_condition(176, (v47 & 1 ? v43 : 0), (v47 & 1 ? v44 : 0), 0);
            if (!(v48 & 1))
            {
LABEL_3c39a4:
                v4 = &v5;
                v5 = &v4;
                v49 = sub_6b08(a0);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v49 + 1, 0);
                *(char *)sub_9c78(a0, v49) = 1;
                v4 = &v5;
                v5 = &v4;
                v50 = sub_6b08(a0);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v50 + 1, 0);
                v51 = sub_9c78(a0, v50);
                n = 0;
                v53 = 0;
                *v51 = v3->field_9c;
                v54 = *(long long *)&v3->padding_58[16];
                do
                {
                    v4 = &v5;
                    v5 = &v4;
                    v55 = sub_6b08(a0);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v55 + 1, 0);
                    v56 = sub_9c78(a0, v55);
                    *v56 = *(char *)(v54 + n) - v53;
                    v57 = v3;
                    v54 = *(long long *)&v57->padding_58[16];
                    v53 = *(char *)(v54 + n);
                    n += 1;
                } while (((v0 * 0x4000000000000000 | v0 >> 2) & 0x7fffffff) != n);
                if (!(v42 >> 31 & 1))
                {
                    i0 = 0;
                    v59 = 0;
                    v60 = *(long long *)&v57->padding_20[16];
                    do
                    {
                        v4 = &v5;
                        v5 = &v4;
                        v61 = sub_6b08(a0);
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v61 + 4, 0);
                        v62 = sub_9c78(a0, v61);
                        *v62 = *(int *)(v60 + i0) - v59;
                        v57 = v3;
                        v60 = *(long long *)&v57->padding_20[16];
                        v59 = *(int *)(v60 + i0);
                        i0 += 4;
                    } while (((((unsigned int)v42 + 1) * 4 | (unsigned int)v42 + 1 >> 62) & 0x3fffffffc) != i0);
                }
                goto LABEL_3c3b34;
            }
        }
    }
    v5 = &v4;
    v4 = &v5;
    v63 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v63 + 1, 0);
    *(char *)sub_9c78(a0, v63) = 0;
    v57 = v3;
LABEL_3c3b34:
    if (!*(long long *)&v57->padding_40[8])
        v64 = 0;
    else
        v64 = v57->field_a4 & ~((int)(v57->field_a4) >> 31);
    if (!v57->field_70)
        v65 = 0;
    else
        v65 = *(int *)&v57->padding_80[8] & ~(*(int *)&v57->padding_80[8] >> 31);
    if (!(unsigned int)v64 && !(unsigned int)v65)
    {
        v5 = &v4;
        v4 = &v5;
        v85 = sub_6b08(a0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v85 + 1, 0);
        v86 = sub_9c78(a0, v85);
        *(char *)v86 = 0;
        return v86;
    }
    v4 = &v5;
    v5 = &v4;
    v66 = sub_6b08(a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v66 + 1, 0);
    *(char *)sub_9c78(a0, v66) = 1;
    v4 = &v5;
    v5 = &v4;
    v67 = v64;
    do
    {
        v68 = v67;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)v68 & 127 | ((unsigned int)v68 > 127) * 128);
        v67 = (unsigned int)v68 >> 7;
    } while (127 < (unsigned int)v68);
    if ((unsigned int)v64)
    {
        i1 = 0;
        do
        {
            v70 = sub_3c25f8(a1, *(long long *)(*(long long *)&v3->padding_40[8] + 24 * i1));
            v4 = &v5;
            v5 = &v4;
            do
            {
                i4 = v70;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i4 & 127 | (i4 > 127) * 128);
                v70 = i4 >> 7;
            } while (127 < i4);
            v72 = *(int *)(*(long long *)&v3->padding_40[8] + 24 * i1 + 8);
            v4 = &v5;
            v5 = &v4;
            do
            {
                i5 = v72;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i5 & 127 | (i5 > 127) * 128);
                v72 = i5 >> 7;
            } while (127 < i5);
            v74 = *(int *)(*(long long *)&v3->padding_40[8] + 24 * i1 + 12);
            v4 = &v5;
            v5 = &v4;
            do
            {
                i6 = v74;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i6 & 127 | (i6 > 127) * 128);
                v74 = i6 >> 7;
            } while (127 < i6);
            v4 = &v5;
            v5 = &v4;
            v76 = sub_6b08(a0);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v76 + 1, 0);
            v77 = sub_9c78(a0, v76);
            *v77 = *(char *)(*(long long *)&v3->padding_40[8] + 24 * i1 + 16);
            i1 += 1;
        } while (i1 != v64);
    }
    v5 = &v4;
    v4 = &v5;
    v78 = v65;
    do
    {
        v79 = v78;
        v80 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)v79 & 127 | ((unsigned int)v79 > 127) * 128);
        v78 = (unsigned int)v79 >> 7;
    } while (127 < (unsigned int)v79);
    if (!(unsigned int)v65)
        return v80;
    i2 = 0;
    do
    {
        v82 = sub_3c25f8(a1, *(long long *)(v3->field_70 + i2 * 8));
        v4 = &v5;
        v5 = &v4;
        do
        {
            i7 = v82;
            v84 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i7 & 127 | (i7 > 127) * 128);
            v82 = i7 >> 7;
        } while (127 < i7);
        i2 += 1;
    } while (i2 != v65);
    return v84;
}
