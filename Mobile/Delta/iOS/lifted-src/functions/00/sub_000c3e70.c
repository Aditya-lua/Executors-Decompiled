/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3e70..0xc41bc (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3e70_0 {
    char field_0;
    char field_1;
} st_c3e70_0;

typedef struct st_c3e70_2 {
    struct st_c3e70_3 *field_0;
} st_c3e70_2;

typedef struct st_c3e70_3 {
    struct st_c3e70_2 *field_0;
} st_c3e70_3;

typedef struct st_c3e70_1 {
    char field_0;
} st_c3e70_1;


unsigned long long sub_c3e70(char *a0, unsigned long long a1, long long a2, long long a3, long long a4)
{
    char *v17;  // x20
    unsigned long long v18;  // x0
    unsigned long long v27;  // x8
    unsigned int i;  // w16
    unsigned long long v29;  // x11
    unsigned long long *v30;  // x15
    char *v31;  // x14
    char *iter;  // x10
    unsigned long long *node;  // x12
    unsigned long v34;  // x11
    unsigned long long *v35;  // x17
    unsigned long long v36;  // w17
    unsigned long long v19;  // 4106
    unsigned long long v37;  // x11
    unsigned int v38;  // w16
    st_c3e70_0 *v39;  // x17
    unsigned int v40;  // w16
    st_c3e70_0 *v41;  // x17
    unsigned int v42;  // w16
    st_c3e70_0 *v43;  // x17
    unsigned int v44;  // w16
    st_c3e70_0 *v45;  // x17
    char *v46;  // x17
    long long v20;  // x22
    unsigned long v47;  // x10
    unsigned long long *v48;  // x11
    unsigned long long *v49;  // x12
    unsigned long long v50;  // x13
    unsigned long long v51;  // x12
    unsigned long long *v52;  // x11
    unsigned int v53;  // w10
    unsigned long long j;  // x9
    unsigned long long v55;  // x9
    unsigned int v56;  // w12
    char *v21;  // x23
    st_c3e70_0 *v57;  // x11
    char *v59;  // x8
    unsigned long long idx;  // x21
    unsigned long long v23;  // x24
    unsigned long long v24;  // x0
    unsigned long long v25;  // 4106
    char *v26;  // x9
    st_c3e70_1 **v0;  // [bp-0x168], Other Possible Types: char
    st_c3e70_1 *v1;  // [bp-0x160]
    unsigned long long v2;  // [bp-0x158]
    unsigned int v3;  // [bp-0x150]
    unsigned long long *v4;  // [bp-0x148]
    unsigned long long *v5;  // [bp-0x140]
    unsigned long long *v6;  // [bp-0x138]
    char v7;  // [bp-0x130]
    char v8;  // [bp-0x110]
    st_c3e70_3 **v9;  // [bp-0x98]
    st_c3e70_3 **v10;  // [bp-0x90]
    st_c3e70_1 *v11;  // [bp-0x88]
    st_c3e70_1 **v12;  // [bp-0x80]
    st_c3e70_1 *v13;  // [bp-0x78]
    st_c3e70_1 **v14;  // [bp-0x70]
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
        v21 = &v17[a1 & ~((long long)(a1) >> 63)];
        sub_c3384(&v7);
        idx = 0;
        v23 = a1 + 3 >> 2;
        while (1)
        {
            if (v21 - v17 < v23)
                v17 = v21;
            else
                v17 = &v17[v23];
            v24 = sub_c44a8();
            v25 = arm64g_calculate_condition(130, v24, 120, 0);
            if (v25 & 1)
                return v24;
            v26 = *(long long *)&(&v8)[8 * idx];
            v10 = &v9;
            v9 = &v10;
            v27 = v17 - v26;
            if ((long long)v27 >= 4)
            {
                i = v3;
                v29 = v2;
                v11 = &v12;
                v12 = &v11;
                if (64 >= i)
                {
                    v30 = v5;
                    v31 = v17 - 3;
                    iter = v26;
                    node = v4;
                    do
                    {
                        if (v6 <= node)
                        {
                            v13 = &v14;
                            v14 = &v13;
                            node = (char *)node - (i >> 3);
                            v38 = i & 7;
                            v29 = *node;
                            v36 = 1;
                            if (v31 <= iter)
                                goto LABEL_c40bc;
                        }
                        else if (node != v30)
                        {
                            v34 = i >> 3;
                            v35 = (char *)node - v34;
                            v36 = v35 >= v30;
                            if (v30 <= v35)
                                v37 = v34 & 0xffffffff;
                            else
                                v37 = node - v30 & 0xffffffff;
                            node = (char *)node - v37;
                            v38 = i - (unsigned int)v37 * 8;
                            v29 = *node;
                            if (iter >= v31)
                                goto LABEL_c40bc;
                            continue;
                        }
                        else
                        {
                            v46 = iter;
                            break;
                        }
                        if (!v36)
                        {
LABEL_c40bc:
                            v4 = node;
                            v3 = v38;
                            v2 = v29;
                            if (iter >= v17)
                                goto LABEL_c4154;
                            goto LABEL_c411c;
                        }
                        v39 = v20 + (v29 << ((char)v38 & 63) >> 53) * 2;
                        v40 = v38 + v39->field_0;
                        *iter = v39->field_1;
                        v41 = v20 + (v29 << ((char)v40 & 63) >> 53) * 2;
                        v42 = v40 + v41->field_0;
                        iter[1] = v41->field_1;
                        v43 = v20 + (v29 << ((char)v42 & 63) >> 53) * 2;
                        v44 = v42 + v43->field_0;
                        iter[2] = v43->field_1;
                        v45 = v20 + (v29 << ((char)v44 & 63) >> 53) * 2;
                        i = v44 + v45->field_0;
                        iter[3] = v45->field_1;
                        v46 = iter + 4;
                        v11 = &v12;
                        v12 = &v11;
                        iter = v46;
                    } while (i <= 64);
                    v4 = node;
                    v3 = i;
                    v2 = v29;
                    iter = v46;
                    if (v17 <= v46)
                        goto LABEL_c4154;
                    goto LABEL_c411c;
                }
                else
                {
                    v3 = i;
                    v2 = v29;
                    iter = v26;
                    if (iter >= v17)
                        goto LABEL_c4154;
                    goto LABEL_c411c;
                }
            }
            v11 = &v12;
            v12 = &v11;
            v47 = v3;
            if (64 >= (unsigned int)v47)
            {
                v48 = v4;
                if (v6 > v48)
                {
                    v49 = v5;
                    if (v48 == v49)
                        goto LABEL_c40f0;
                    v50 = v47 >> 3;
                    if ((char *)v48 - v50 < v49)
                        v51 = v48 - v49 & 0xffffffff;
                    else
                        v51 = v50 & 0xffffffff;
                    v52 = (char *)v48 - v51;
                    v4 = v52;
                    v53 = (unsigned int)v47 - (unsigned int)v51 * 8;
                }
                else
                {
                    v13 = &v14;
                    v14 = &v13;
                    v52 = (char *)v48 - (v47 >> 3);
                    v4 = v52;
                    v53 = (unsigned int)v47 & 7;
                }
                v3 = v53;
                v2 = *v52;
            }
LABEL_c40f0:
            iter = v26;
            if (v26 >= v17)
                goto LABEL_c4154;
LABEL_c411c:
            j = v17 - iter;
            do
            {
                v55 = j;
                v56 = v3;
                v57 = v20 + (v2 << ((char)v56 & 63) >> 53) * 2;
                v3 = v56 + v57->field_0;
                *iter = v57->field_1;
                iter += 1;
                j = v55 - 1;
            } while (j);
            v26 = *(long long *)&(&v8)[8 * idx];
LABEL_c4154:
            v59 = &v26[v27];
            *(char **)&(&v8)[8 * idx] = v59;
            if (v59 != v17)
                return 0xffffffffffffffec;
            idx += 1;
            if (idx == 4)
                return a1;
        }
    }
    else
    {
        return v18;
    }
}
