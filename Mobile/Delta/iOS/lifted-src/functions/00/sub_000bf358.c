/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf358..0xbf928 (1488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bf358_5 {
    char field_0;
    char padding_1[1];
    char field_2;
} st_bf358_5;

typedef struct st_bf358_4 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_bf358_4;

typedef struct st_bf358_1 {
    struct st_bf358_2 *field_0;
} st_bf358_1;

typedef struct st_bf358_2 {
    struct st_bf358_1 *field_0;
} st_bf358_2;

typedef struct st_bf358_0 {
    char field_0;
} st_bf358_0;

typedef struct st_bf358_3 {
    st_bf358_0 field_0;
} st_bf358_3;

extern unsigned long long g_cc0ea0;

long long sub_bf358(void* a0, long long a1, long long a2, long long a3, unsigned int *a4)
{
    void* node;  // x21
    long long v16;  // x0
    char v25;  // x16
    unsigned long long *iter;  // x17
    unsigned long v27;  // x11
    unsigned long long *v28;  // x3
    unsigned long long v29;  // w3
    unsigned long long v30;  // x11
    st_bf358_4 *v31;  // x3
    unsigned long long v32;  // x10
    void* v33;  // x3
    st_bf358_4 *v34;  // x4
    unsigned long long v17;  // 4106
    unsigned long long v35;  // x10
    void* v36;  // x3
    st_bf358_4 *v37;  // x4
    unsigned long long v38;  // x10
    void* v39;  // x3
    st_bf358_4 *v40;  // x4
    unsigned long long v41;  // x10
    void* v42;  // x3
    st_bf358_4 *v43;  // x4
    unsigned long long *v44;  // x0
    void* v18;  // x9
    void* v45;  // x15
    char v46;  // x16
    unsigned long v47;  // x11
    unsigned long long *v48;  // x3
    unsigned long long v49;  // w3
    unsigned long long v50;  // x11
    st_bf358_4 *v51;  // x3
    unsigned long long v52;  // x10
    void* v53;  // x3
    st_bf358_4 *v54;  // x4
    unsigned long v19;  // x20
    unsigned long long v55;  // x10
    void* v56;  // x3
    st_bf358_4 *v57;  // x4
    unsigned long long v58;  // x10
    void* v59;  // x3
    st_bf358_4 *v60;  // x4
    unsigned long long *v61;  // x11
    unsigned long long *v62;  // x12
    unsigned long long v63;  // x13
    unsigned long long v64;  // x12
    unsigned int v20;  // w8
    unsigned long long *v65;  // x11
    void* v66;  // x11
    char v67;  // x12
    unsigned long long *v68;  // x17
    unsigned long long *v69;  // x0
    unsigned long v70;  // x1
    unsigned long long *v71;  // x2
    unsigned long long v72;  // x0
    unsigned long long v73;  // x1
    st_bf358_4 *v74;  // x17
    unsigned long v21;  // x10
    st_bf358_4 *v75;  // x13
    st_bf358_5 *v76;  // x8
    unsigned int v77;  // w8
    unsigned long long v22;  // x11
    unsigned long long *v23;  // x0
    void* v24;  // x15
    st_bf358_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_bf358_0 *v1;  // [bp-0x90]
    unsigned long long v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x80]
    unsigned long long *v4;  // [bp-0x78]
    unsigned long long *v5;  // [bp-0x70]
    unsigned long long *v6;  // [bp-0x68]
    st_bf358_0 **v7;  // [bp-0x60], Other Possible Types: char
    st_bf358_0 *v8;  // [bp-0x58]
    st_bf358_2 **v9;  // [bp-0x50]
    st_bf358_2 **v10;  // [bp-0x48]
    char *v11;  // [bp-0x40]
    st_bf358_3 **v12;  // [bp-0x38]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    node = a0;
    v1 = &v0;
    v0 = &v1;
    v16 = sub_c02c0(&v2, a2, a3);
    v17 = arm64g_calculate_condition(130, v16, 120, 0);
    if (v17 & 1)
        return v16;
    v18 = node + (a1 & ~(a1 >> 63));
    v19 = a4 + 1;
    v20 = *a4 >> 16;
    v8 = &v7;
    v7 = &v8;
    if (a1 >= 8)
    {
        v21 = v3;
        v22 = v2;
        if (3 > (*a4 >> 18 & 63))
        {
            v9 = &v10;
            v10 = &v9;
            if (64 >= (unsigned int)v21)
            {
                v23 = v5;
                v24 = v18 - 9;
                v25 = (char)-v20 & 63;
                iter = v4;
                do
                {
                    if (v6 > iter)
                    {
                        if (iter == v23)
                            goto LABEL_bf6e4;
                        v27 = (unsigned int)v21 >> 3;
                        v28 = (char *)iter - v27;
                        v29 = v28 >= v23;
                        if (v23 <= v28)
                            v30 = v27 & 0xffffffff;
                        else
                            v30 = iter - v23 & 0xffffffff;
                        iter = (char *)iter - v30;
                        v21 = (unsigned int)v21 - (unsigned int)v30 * 8;
                        v22 = *iter;
                        if (node < v24)
                            goto LABEL_bf46c;
                        else
                            goto LABEL_bf6e4;
                    }
                    else
                    {
                        v11 = &v12;
                        v12 = &v11;
                        iter = (char *)iter - ((unsigned int)v21 >> 3);
                        v21 = (unsigned int)v21 & 7;
                        v22 = *iter;
                        v29 = 1;
                        if (v24 <= node)
                            goto LABEL_bf6e4;
                        else
                            goto LABEL_bf46c;
                    }
LABEL_bf46c:
                    if (!v29)
                        goto LABEL_bf6e4;
                    v31 = v19 + (v22 << ((char)v21 & 63) >> (v25 & 63)) * 4;
                    *(unsigned short *)node = v31->field_0;
                    v32 = v21 + v31->field_2;
                    v33 = node + v31->field_3;
                    v34 = v19 + (v22 << ((char)v32 & 63) >> (v25 & 63)) * 4;
                    *(unsigned short *)v33 = v34->field_0;
                    v35 = v32 + v34->field_2;
                    v36 = v33 + v34->field_3;
                    v37 = v19 + (v22 << ((char)v35 & 63) >> (v25 & 63)) * 4;
                    *(unsigned short *)v36 = v37->field_0;
                    v38 = v35 + v37->field_2;
                    v39 = v36 + v37->field_3;
                    v40 = v19 + (v22 << ((char)v38 & 63) >> (v25 & 63)) * 4;
                    *(unsigned short *)v39 = v40->field_0;
                    v41 = v38 + v40->field_2;
                    v42 = v39 + v40->field_3;
                    v43 = v19 + (v22 << ((char)v41 & 63) >> (v25 & 63)) * 4;
                    *(unsigned short *)v42 = v43->field_0;
                    v21 = v41 + v43->field_2;
                    node = v42 + v43->field_3;
                    v9 = &v10;
                    v10 = &v9;
                } while ((unsigned int)v21 <= 64);
            }
            goto LABEL_bf6c0;
        }
        v9 = &v10;
        v10 = &v9;
        if (64 >= (unsigned int)v21)
        {
            v44 = v5;
            v45 = v18 - 7;
            v46 = (char)-v20 & 63;
            iter = v4;
            while (1)
            {
                if (v6 > iter)
                {
                    if (iter != v44)
                    {
                        v47 = (unsigned int)v21 >> 3;
                        v48 = (char *)iter - v47;
                        v49 = v48 >= v44;
                        if (v44 <= v48)
                            v50 = v47 & 0xffffffff;
                        else
                            v50 = iter - v44 & 0xffffffff;
                        iter = (char *)iter - v50;
                        v21 = (unsigned int)v21 - (unsigned int)v50 * 8;
                        v22 = *iter;
                        if (node < v45)
                            goto LABEL_bf620;
                        goto LABEL_bf728;
                    }
LABEL_bf6e4:
                    v4 = iter;
                    v3 = v21;
                    v2 = v22;
                    if (2 > v18 - node)
                        goto LABEL_bf89c;
                    break;
                }
                else
                {
                    v11 = &v12;
                    v12 = &v11;
                    iter = (char *)iter - ((unsigned int)v21 >> 3);
                    v21 = (unsigned int)v21 & 7;
                    v22 = *iter;
                    v49 = 1;
                    if (v45 > node)
                    {
LABEL_bf620:
                        if (!v49)
                            goto LABEL_bf728;
                        v51 = v19 + (v22 << ((char)v21 & 63) >> (v46 & 63)) * 4;
                        *(unsigned short *)node = v51->field_0;
                        v52 = v21 + v51->field_2;
                        v53 = node + v51->field_3;
                        v54 = v19 + (v22 << ((char)v52 & 63) >> (v46 & 63)) * 4;
                        *(unsigned short *)v53 = v54->field_0;
                        v55 = v52 + v54->field_2;
                        v56 = v53 + v54->field_3;
                        v57 = v19 + (v22 << ((char)v55 & 63) >> (v46 & 63)) * 4;
                        *(unsigned short *)v56 = v57->field_0;
                        v58 = v55 + v57->field_2;
                        v59 = v56 + v57->field_3;
                        v60 = v19 + (v22 << ((char)v58 & 63) >> (v46 & 63)) * 4;
                        *(unsigned short *)v59 = v60->field_0;
                        v21 = v58 + v60->field_2;
                        node = v59 + v60->field_3;
                        v9 = &v10;
                        v10 = &v9;
                        if ((unsigned int)v21 > 64)
                            goto LABEL_bf6c0;
                    }
                    else
                    {
LABEL_bf728:
                        v4 = iter;
                        v3 = v21;
                        v2 = v22;
                        if (v18 - node < 2)
                            goto LABEL_bf89c;
                        break;
                    }
                }
            }
LABEL_bf740:
            v66 = v18 - 2;
            v67 = (char)-v20 & 63;
            v9 = &v10;
            v10 = &v9;
            if (64 >= (unsigned int)v21)
            {
                do
                {
                    v68 = v4;
                    if (v6 > v68)
                    {
                        v69 = v5;
                        if (v68 == v69)
                            goto LABEL_bf83c;
                        v70 = (unsigned int)v21 >> 3;
                        v71 = (char *)v68 - v70;
                        v72 = v71 >= v69;
                        if (v69 <= v71)
                            v73 = v70 & 0xffffffff;
                        else
                            v73 = v68 - v69 & 0xffffffff;
                        v4 = (char *)v68 - v73;
                        v21 = (unsigned int)v21 - (unsigned int)v73 * 8;
                        v3 = v21;
                        v2 = *v4;
                        if (node > v66)
                            goto LABEL_bf83c;
                    }
                    else
                    {
                        v11 = &v12;
                        v12 = &v11;
                        v4 = (char *)v68 - ((unsigned int)v21 >> 3);
                        v21 = (unsigned int)v21 & 7;
                        v3 = v21;
                        v2 = *v4;
                        v72 = 1;
                        if (v66 < node)
                            goto LABEL_bf83c;
                    }
                    if (!(v72 & 1))
LABEL_bf83c:
                    v74 = v19 + (v2 << ((char)v21 & 63) >> (v67 & 63)) * 4;
                    *(unsigned short *)node = v74->field_0;
                    v21 = v3 + v74->field_2;
                    v3 = v21;
                    node += v74->field_3;
                    v9 = &v10;
                    v10 = &v9;
                } while ((unsigned int)v21 <= 64);
            }
            for (v4 = &g_cc0ea0; node <= v66; node += v75->field_3)
            {
                v75 = v19 + (v2 << ((char)v21 & 63) >> (v67 & 63)) * 4;
                *(unsigned short *)node = v75->field_0;
                v3 += v75->field_2;
            }
            if (node < v18)
                goto LABEL_bf8a4;
        }
        else
        {
LABEL_bf6c0:
            v3 = v21;
            v2 = v22;
            v4 = &g_cc0ea0;
            if (2 <= v18 - node)
                goto LABEL_bf740;
LABEL_bf89c:
            if (v18 > node)
            {
LABEL_bf8a4:
                v76 = v19 + (v2 << ((char)v21 & 63) >> ((char)-v20 & 63)) * 4;
                *(char *)node = v76->field_0;
                if (v76[1].field_0 == 1)
                {
                    v77 = v3 + v76->field_2;
                }
                else
                {
                    if (63 < v3)
                        goto LABEL_bf900;
                    v77 = v3 + v76->field_2;
                    if (v77 >= 64)
                        v77 = 64;
                }
LABEL_bf8fc:
                v3 = v77;
                goto LABEL_bf8fc;
            }
        }
    }
    else
    {
        v12 = &v11;
        v11 = &v12;
        v21 = v3;
        if (65 > (unsigned int)v21)
        {
            v61 = v4;
            if (v6 > v61)
            {
                v62 = v5;
                if (v61 == v62)
                    goto LABEL_bf718;
                v63 = v21 >> 3;
                if ((char *)v61 - v63 < v62)
                    v64 = v61 - v62 & 0xffffffff;
                else
                    v64 = v63 & 0xffffffff;
                v65 = (char *)v61 - v64;
                v4 = v65;
                v21 = (unsigned int)v21 - (unsigned int)v64 * 8;
            }
            else
            {
                v65 = (char *)v61 - (v21 >> 3);
                v4 = v65;
                v21 = (unsigned int)v21 & 7;
            }
            v3 = v21;
            v2 = *v65;
LABEL_bf718:
            if (2 > v18 - node)
                goto LABEL_bf89c;
            goto LABEL_bf740;
        }
        else
        {
            v4 = &g_cc0ea0;
            if (2 > v18 - node)
                goto LABEL_bf89c;
            goto LABEL_bf740;
        }
    }
LABEL_bf900:
    if (sub_bfed0(&v2))
        return a1;
    return -0x14;
}
