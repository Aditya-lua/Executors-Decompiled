/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0504..0xc09b4 (1200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0504_0 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_c0504_0;

typedef struct st_c0504_2 {
    struct st_c0504_3 *field_0;
} st_c0504_2;

typedef struct st_c0504_3 {
    struct st_c0504_2 *field_0;
} st_c0504_3;

typedef struct st_c0504_1 {
    char field_0;
} st_c0504_1;

extern unsigned long long g_cc0ea0;

unsigned long long sub_c0504(void* a0, unsigned long long a1, long long a2, long long a3, char *a4)
{
    void* v17;  // x20
    unsigned long long v18;  // x0
    unsigned long i;  // x10
    unsigned long long v28;  // x12
    void* iter;  // x9
    unsigned long long *v30;  // x15
    void* v31;  // x14
    unsigned long long *node;  // x13
    unsigned long v33;  // x12
    unsigned long long *v34;  // x16
    unsigned long long v35;  // w16
    unsigned long long v36;  // x12
    unsigned long long v19;  // 4106
    st_c0504_0 *v37;  // x16
    unsigned long long v38;  // x10
    void* v39;  // x9
    st_c0504_0 *v40;  // x16
    unsigned long long v41;  // x10
    void* v42;  // x9
    st_c0504_0 *v43;  // x16
    unsigned long long v44;  // x10
    void* v45;  // x9
    st_c0504_0 *v46;  // x16
    char *v20;  // x22
    unsigned long long v47;  // x10
    void* v48;  // x9
    st_c0504_0 *v49;  // x16
    void* v50;  // x9
    unsigned long long *v51;  // x11
    unsigned long long *v52;  // x12
    unsigned long long v53;  // x13
    unsigned long long v54;  // x12
    unsigned long long *v55;  // x11
    void* v56;  // x11
    void* v21;  // x23
    unsigned long long *v57;  // x12
    unsigned long long *v58;  // x13
    unsigned long v59;  // x14
    unsigned long long *v60;  // x15
    unsigned long long v61;  // x13
    unsigned long long v62;  // x14
    st_c0504_0 *v63;  // x12
    unsigned long v64;  // x12
    st_c0504_0 *v65;  // x10
    void* v66;  // x8
    unsigned long long idx;  // x21
    unsigned long long v23;  // x24
    unsigned long long v24;  // x0
    unsigned long long v25;  // 4106
    void* v26;  // x9
    st_c0504_1 **v0;  // [bp-0x168], Other Possible Types: char
    st_c0504_1 *v1;  // [bp-0x160]
    unsigned long long v2;  // [bp-0x158]
    unsigned int v3;  // [bp-0x150]
    unsigned long long *v4;  // [bp-0x148]
    unsigned long long *v5;  // [bp-0x140]
    unsigned long long *v6;  // [bp-0x138]
    char v7;  // [bp-0x130]
    char v8;  // [bp-0x110]
    st_c0504_3 **v9;  // [bp-0x98]
    st_c0504_3 **v10;  // [bp-0x90]
    st_c0504_1 *v11;  // [bp-0x88]
    st_c0504_1 **v12;  // [bp-0x80]
    st_c0504_1 *v13;  // [bp-0x78]
    st_c0504_1 **v14;  // [bp-0x70]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a0;
    v1 = &v0;
    v0 = &v1;
    v18 = sub_c3c5c(&v7, v17, a1, a2, a3, a4);
    v19 = arm64g_calculate_condition(130, v18, 120, 0);
    if (v19 & 1)
    {
        return v18;
    }
    else if (v18)
    {
        v20 = a4 + 4;
        v21 = v17 + (a1 & ~((long long)(a1) >> 63));
        sub_c378c(&v7);
        idx = 0;
        v23 = a1 + 3 >> 2;
        while (1)
        {
            if (v21 - v17 < v23)
                v17 = v21;
            else
                v17 += v23;
            v24 = sub_c44a8();
            v25 = arm64g_calculate_condition(130, v24, 120, 0);
            if (v25 & 1)
                return v24;
            v26 = *(long long *)&(&v8)[8 * idx];
            v10 = &v9;
            v9 = &v10;
            if (v17 - v26 >= 8)
            {
                i = v3;
                v28 = v2;
                v11 = &v12;
                v12 = &v11;
                iter = v26;
                if (64 >= (unsigned int)i)
                {
                    v30 = v5;
                    v31 = v17 - 9;
                    node = v4;
                    iter = v26;
                    do
                    {
                        if (v6 > node)
                        {
                            if (node == v30)
                                goto LABEL_c07ac;
                            v33 = (unsigned int)i >> 3;
                            v34 = (char *)node - v33;
                            v35 = v34 >= v30;
                            if (v30 <= v34)
                                v36 = v33 & 0xffffffff;
                            else
                                v36 = node - v30 & 0xffffffff;
                            node = (char *)node - v36;
                            i = (unsigned int)i - (unsigned int)v36 * 8;
                            v28 = *node;
                            if (iter >= v31)
                                goto LABEL_c07ac;
                        }
                        else
                        {
                            v13 = &v14;
                            v14 = &v13;
                            node = (char *)node - ((unsigned int)i >> 3);
                            i = (unsigned int)i & 7;
                            v28 = *node;
                            v35 = 1;
                            if (v31 <= iter)
                                goto LABEL_c07ac;
                        }
                        if (!v35)
                        {
LABEL_c07ac:
                            v4 = node;
                            v3 = i;
                            v2 = v28;
                            v50 = iter;
                            if (2 > v17 - v50)
                                goto LABEL_c097c;
                            goto LABEL_c07f0;
                        }
                        v37 = &v20[4 * (v28 << ((char)i & 63) >> 53)];
                        *(unsigned short *)iter = v37->field_0;
                        v38 = i + v37->field_2;
                        v39 = iter + v37->field_3;
                        v40 = &v20[4 * (v28 << ((char)v38 & 63) >> 53)];
                        *(unsigned short *)v39 = v40->field_0;
                        v41 = v38 + v40->field_2;
                        v42 = v39 + v40->field_3;
                        v43 = &v20[4 * (v28 << ((char)v41 & 63) >> 53)];
                        *(unsigned short *)v42 = v43->field_0;
                        v44 = v41 + v43->field_2;
                        v45 = v42 + v43->field_3;
                        v46 = &v20[4 * (v28 << ((char)v44 & 63) >> 53)];
                        *(unsigned short *)v45 = v46->field_0;
                        v47 = v44 + v46->field_2;
                        v48 = v45 + v46->field_3;
                        v49 = &v20[4 * (v28 << ((char)v47 & 63) >> 53)];
                        *(unsigned short *)v48 = v49->field_0;
                        i = v47 + v49->field_2;
                        iter = v48 + v49->field_3;
                        v11 = &v12;
                        v12 = &v11;
                    } while ((unsigned int)i <= 64);
                }
                v3 = i;
                v2 = v28;
                v4 = &g_cc0ea0;
                v50 = iter;
                if (2 > v17 - v50)
                    goto LABEL_c097c;
                goto LABEL_c07f0;
            }
            v11 = &v12;
            v12 = &v11;
            i = v3;
            if (65 > (unsigned int)i)
                break;
            v4 = &g_cc0ea0;
            iter = v26;
            v50 = v26;
            if (2 <= v17 - iter)
            {
LABEL_c07f0:
                v56 = v17 - 2;
                v11 = &v12;
                v12 = &v11;
                if (64 < (unsigned int)i)
                {
LABEL_c08c4:
                    v4 = &g_cc0ea0;
LABEL_c08d0:
                    v64 = i;
                }
                while (1)
                {
                    v57 = v4;
                    if (v6 > v57)
                    {
                        v58 = v5;
                        if (v57 == v58)
                            goto LABEL_c08d0;
                        v59 = (unsigned int)i >> 3;
                        v60 = (char *)v57 - v59;
                        v61 = v60 >= v58;
                        if (v58 <= v60)
                            v62 = v59 & 0xffffffff;
                        else
                            v62 = v57 - v58 & 0xffffffff;
                        v4 = (char *)v57 - v62;
                        i = (unsigned int)i - (unsigned int)v62 * 8;
                        v3 = i;
                        v2 = *v4;
                        if (iter > v56)
                            goto LABEL_c08d8;
                    }
                    else
                    {
                        v13 = &v14;
                        v14 = &v13;
                        v4 = (char *)v57 - ((unsigned int)i >> 3);
                        i = (unsigned int)i & 7;
                        v3 = i;
                        v2 = *v4;
                        v61 = 1;
                        if (v56 < iter)
                            goto LABEL_c08d8;
                    }
                    if (v61 & 1)
                    {
                        v63 = &v20[4 * (v2 << ((char)i & 63) >> 53)];
                        *(unsigned short *)iter = v63->field_0;
                        i = v3 + v63->field_2;
                        v3 = i;
                        iter += v63->field_3;
                        v11 = &v12;
                        v12 = &v11;
                        if ((unsigned int)i > 64)
                            goto LABEL_c08c4;
                    }
                    else
                    {
LABEL_c08d8:
                        for (v64 = i; iter <= v56; i = v64)
                        {
                            v65 = &v20[4 * (v2 << ((char)v64 & 63) >> 53)];
                            *(unsigned short *)iter = v65->field_0;
                            v64 = v3 + v65->field_2;
                            v3 = v64;
                            iter += v65->field_3;
                        }
                        if (v17 <= iter)
                            goto LABEL_c093c;
                        goto LABEL_c0924;
                    }
                }
            }
            else
            {
LABEL_c097c:
                iter = v50;
                if (iter >= v17)
                    goto LABEL_c093c;
LABEL_c0924:
                *(char *)iter = v20[v2 << ((char)i & 63) >> 0x33 & 0x1ffc];
                iter += 1;
LABEL_c093c:
                v66 = *(long long *)&(&v8)[8 * idx] + iter - v26;
                *(void* *)&(&v8)[8 * idx] = v66;
                if (v66 != v17)
                    return 0xffffffffffffffec;
                idx += 1;
                if (idx == 4)
                    return a1;
            }
        }
        v51 = v4;
        if (v6 > v51)
        {
            v52 = v5;
            if (v51 == v52)
                goto LABEL_c07e4;
            v53 = i >> 3;
            if ((char *)v51 - v53 < v52)
                v54 = v51 - v52 & 0xffffffff;
            else
                v54 = v53 & 0xffffffff;
            v55 = (char *)v51 - v54;
            v4 = v55;
            i = (unsigned int)i - (unsigned int)v54 * 8;
        }
        else
        {
            v13 = &v14;
            v14 = &v13;
            v55 = (char *)v51 - (i >> 3);
            v4 = v55;
            i = (unsigned int)i & 7;
        }
        v3 = i;
        v2 = *v55;
LABEL_c07e4:
        iter = v26;
        v50 = v26;
        if (v17 - iter < 2)
            goto LABEL_c097c;
        goto LABEL_c07f0;
    }
    else
    {
        return v18;
    }
}
