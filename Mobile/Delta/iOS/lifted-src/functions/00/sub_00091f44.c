/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91f44..0x92628 (1764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91f44_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[28];
    unsigned int field_2c;
    char padding_30[64];
    struct st_91f44_2 *field_70;
    char padding_78[144];
    unsigned int field_108;
    char padding_10c[4];
    int field_110;
} st_91f44_1;

typedef struct st_91f44_2 {
    unsigned long long field_0;
} st_91f44_2;

typedef struct st_91f44_0 {
    char field_0;
} st_91f44_0;


st_91f44_1 * sub_91f44(st_91f44_1 *a0, void* a1, unsigned long long a2)
{
    unsigned long long v2;  // x12
    unsigned long v3;  // x3
    unsigned int iter;  // w1
    unsigned long long v13;  // x2
    unsigned long long v14;  // x2
    unsigned long long v15;  // x2
    unsigned long long idx;  // x3
    unsigned long long v17;  // x2
    unsigned long long index;  // x3
    void* v19;  // x14
    unsigned long v20;  // x14
    unsigned long v21;  // x15
    void* node;  // x13
    unsigned long long v22;  // x15
    unsigned long long v23;  // x16
    unsigned long long v24;  // x17
    unsigned long long v25;  // x15
    void* v26;  // x15
    unsigned long long i;  // x1
    unsigned long long v28;  // x1
    unsigned long long v29;  // x2
    unsigned long long v30;  // x3
    void* v5;  // x8
    unsigned long long v32;  // x15
    void* v33;  // x14
    unsigned long v34;  // x14
    unsigned long v35;  // x15
    unsigned long long v36;  // x15
    unsigned long long v37;  // x16
    unsigned long long v38;  // x17
    unsigned long long v39;  // x15
    void* v40;  // x15
    unsigned long long l;  // x1
    void* iter1;  // x11
    unsigned long long v42;  // x1
    unsigned long long v43;  // x2
    unsigned long long v44;  // x3
    unsigned long long v46;  // x15
    void* v47;  // x14
    unsigned long v48;  // x14
    unsigned long v49;  // x15
    unsigned long long v50;  // x15
    unsigned long long v51;  // x16
    unsigned long long *v7;  // x9
    unsigned long long v52;  // x17
    unsigned long long v53;  // x15
    void* v54;  // x15
    unsigned long long j;  // x1
    unsigned long long v56;  // x1
    unsigned long long v57;  // x2
    unsigned long long v58;  // x3
    unsigned long long v60;  // x15
    unsigned int v61;  // w12
    int v8;  // w15
    unsigned int v62;  // w13
    void* v63;  // x14
    unsigned long v64;  // x14
    unsigned long v65;  // x15
    unsigned long long v66;  // x15
    unsigned long long v67;  // x16
    unsigned long long v68;  // x17
    unsigned long long v69;  // x15
    void* v70;  // x15
    unsigned long long m;  // x1
    char v9;  // x14
    unsigned long long v72;  // x1
    unsigned long long v73;  // x2
    unsigned long long v74;  // x3
    unsigned long long v76;  // x15
    char v10;  // x10
    char v11;  // x14
    st_91f44_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_91f44_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0->field_2c;
    node = v2 + v3;
    v5 = a1 - 6;
    iter1 = node + 3;
    if (v5 <= iter1)
        return a0;
    v7 = a0->field_70;
    v8 = a0->field_110;
    v9 = a0->field_108;
    v10 = 56 - v9;
    v11 = 24 - v9;
    if (a2)
    {
        iter = (unsigned int)v3 * 0x100;
        while (1)
        {
            if (6 >= v8)
            {
                if (v8 == 5)
                {
                    v13 = 0xcf1bbcdcbb000000 * *(long long *)((char *)iter1 - 3);
                    goto LABEL_920c8;
                }
                else if (v8 == 6)
                {
                    v13 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter1 - 3);
                    goto LABEL_920c8;
                }
                goto LABEL_92064;
            }
            else
            {
                switch (v8)
                {
                case 7:
                    v13 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)iter1 - 3);
LABEL_920c8:
                    *(unsigned int *)((char *)v7 + (v13 >> (v10 & 63) >> 6 & 0x3fffffffffffffc)) = iter + ((unsigned int)(v13 >> (v10 & 63)) & 0xff);
                    if (6 < v8)
                    {
LABEL_92088:
                        if (v8 == 7)
                        {
                            v15 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)iter1 - 2) >> (v10 & 63);
                            idx = v15 >> 8;
                            if (!*(int *)((char *)v7 + 4 * idx))
                                goto LABEL_92188;
                            goto LABEL_92160;
                        }
                        else if (v8 == 8)
                        {
                            v15 = 14923729446382167139 * *(long long *)((char *)iter1 - 2) >> (v10 & 63);
                            idx = v15 >> 8;
                            if (!*(int *)((char *)v7 + 4 * idx))
                                goto LABEL_92188;
                            goto LABEL_92160;
                        }
                        goto LABEL_92110;
                    }
                    else
                    {
LABEL_920e4:
                        if (v8 != 5)
                        {
                            if (v8 == 6)
                            {
                                v15 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter1 - 2) >> (v10 & 63);
                                idx = v15 >> 8;
                                if (!*(int *)((char *)v7 + 4 * idx))
                                    goto LABEL_92188;
                                goto LABEL_92160;
                            }
LABEL_92110:
                            v15 = 2654435761 * *(int *)((char *)iter1 - 2) >> (v11 & 31);
                            idx = v15 >> 8;
                            if (!*(int *)((char *)v7 + 4 * idx))
                                goto LABEL_92188;
                            goto LABEL_92160;
                        }
                        else
                        {
                            v15 = 0xcf1bbcdcbb000000 * *(long long *)((char *)iter1 - 2) >> (v10 & 63);
                            idx = v15 >> 8;
                            if (*(int *)((char *)v7 + 4 * idx))
                            {
LABEL_92160:
                                if (6 < v8)
                                    goto LABEL_9219c;
                                goto LABEL_92168;
                            }
                            else
                            {
LABEL_92188:
                                *(unsigned int *)((char *)v7 + 4 * idx) = iter + ((unsigned int)v15 & 0xff) + 0x100;
                                if (v8 <= 6)
                                {
LABEL_92168:
                                    if (v8 == 5)
                                    {
                                        v17 = 0xcf1bbcdcbb000000 * *(long long *)((char *)iter1 - 1) >> (v10 & 63);
                                        goto LABEL_91fe8;
                                    }
                                    else if (v8 == 6)
                                    {
                                        v17 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)iter1 - 1) >> (v10 & 63);
                                        goto LABEL_91fe8;
                                    }
                                    goto LABEL_91fdc;
                                }
                                else
                                {
LABEL_9219c:
                                    if (v8 != 8)
                                    {
                                        if (v8 == 7)
                                        {
                                            v17 = 0xcf1bbcdcbfa56300 * *(long long *)((char *)iter1 - 1) >> (v10 & 63);
                                            goto LABEL_91fe8;
                                        }
LABEL_91fdc:
                                        v17 = 2654435761 * *(int *)((char *)iter1 - 1) >> (v11 & 31);
                                        goto LABEL_91fe8;
                                    }
                                    else
                                    {
                                        v17 = 14923729446382167139 * *(long long *)((char *)iter1 - 1) >> (v10 & 63);
LABEL_91fe8:
                                        index = v17 >> 8;
                                        if (*(int *)((char *)v7 + 4 * index))
                                        {
                                            iter1 += 3;
                                            iter += 0x300;
                                            if (v5 <= iter1)
                                                return 0x9e3779b1;
                                        }
                                        else
                                        {
                                            *(unsigned int *)((char *)v7 + 4 * index) = iter + ((unsigned int)v17 & 0xff) + 0x200;
                                            iter1 += 3;
                                            iter += 0x300;
                                            if (iter1 >= v5)
                                                return 0x9e3779b1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                    if (v8 == 8)
                    {
                        v13 = 14923729446382167139 * *(long long *)((char *)iter1 - 3);
                        goto LABEL_920c8;
                    }
LABEL_92064:
                    v14 = 2654435761 * *(int *)((char *)iter1 - 3) >> (v11 & 31);
                    *(unsigned int *)((char *)v7 + (v14 >> 6 & 0x3fffffffffffffc)) = iter + ((unsigned int)v14 & 0xff);
                    if (v8 <= 6)
                        goto LABEL_920e4;
                    goto LABEL_92088;
                }
            }
        }
    }
    else
    {
        if (6 >= v8)
        {
            if (v8 == 5)
            {
                v33 = v2 + v3 + 6;
                if (v5 >= v33)
                    v33 = v5;
                v34 = v33 - v2 - 6;
                if (v34 == v3)
                    v35 = v3;
                else
                    v35 = v3 + 1;
                v36 = (v34 - v35) / 3;
                if (v34 != v3)
                    v36 += 1;
                if (v36)
                {
                    v37 = v36 + 1;
                    v38 = v37 & 0x7ffffffffffffffe;
                    v39 = v38 * 3;
                    iter1 += v39;
                    v40 = node + v39;
                    a0 = (unsigned int)v3 * 0x100;
                    l = v38;
                    do
                    {
                        v42 = l;
                        v43 = 0xcf1bbcdcbb000000 * *(long long *)node >> (v10 & 63);
                        v44 = 0xcf1bbcdcbb000000 * (long long)node[3] >> (v10 & 63);
                        *(unsigned int *)((char *)v7 + (v43 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v43 & 0xff);
                        *(unsigned int *)((char *)v7 + (v44 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v44 & 0xff) + 0x300;
                        a0 = (unsigned int)a0 + 0x600;
                        node += 6;
                        l = v42 - 2;
                    } while (l);
                    if (v37 == v38)
                        return a0;
                }
                else
                {
                    v40 = node;
                }
                do
                {
                    v46 = 0xcf1bbcdcbb000000 * *(long long *)v40 >> (v10 & 63);
                    *(unsigned int *)((char *)v7 + (v46 >> 6 & 0x3fffffffffffffc)) = (unsigned int)v46 & 0xff | ((unsigned int)(v40 - v2) * 0x100 | (unsigned int)(v40 - v2) >> 24) & 0xffffff00;
                    iter1 += 3;
                    v40 = iter1;
                } while (iter1 < v5);
                return a0;
            }
            else if (v8 == 6)
            {
                v19 = v2 + v3 + 6;
                if (v5 >= v19)
                    v19 = v5;
                v20 = v19 - v2 - 6;
                if (v20 == v3)
                    v21 = v3;
                else
                    v21 = v3 + 1;
                v22 = (v20 - v21) / 3;
                if (v20 != v3)
                    v22 += 1;
                if (v22)
                {
                    v23 = v22 + 1;
                    v24 = v23 & 0x7ffffffffffffffe;
                    v25 = v24 * 3;
                    iter1 += v25;
                    v26 = node + v25;
                    a0 = (unsigned int)v3 * 0x100;
                    i = v24;
                    do
                    {
                        v28 = i;
                        v29 = 0xcf1bbcdcbf9b0000 * *(long long *)node >> (v10 & 63);
                        v30 = 0xcf1bbcdcbf9b0000 * (long long)node[3] >> (v10 & 63);
                        *(unsigned int *)((char *)v7 + (v29 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v29 & 0xff);
                        *(unsigned int *)((char *)v7 + (v30 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v30 & 0xff) + 0x300;
                        a0 = (unsigned int)a0 + 0x600;
                        node += 6;
                        i = v28 - 2;
                    } while (i);
                    if (v23 == v24)
                        return a0;
                }
                else
                {
                    v26 = node;
                }
                do
                {
                    v32 = 0xcf1bbcdcbf9b0000 * *(long long *)v26 >> (v10 & 63);
                    *(unsigned int *)((char *)v7 + (v32 >> 6 & 0x3fffffffffffffc)) = (unsigned int)v32 & 0xff | ((unsigned int)(v26 - v2) * 0x100 | (unsigned int)(v26 - v2) >> 24) & 0xffffff00;
                    iter1 += 3;
                    v26 = iter1;
                } while (iter1 < v5);
                return a0;
            }
        }
        else
        {
            if (v8 == 7)
            {
                v63 = v2 + v3 + 6;
                if (v5 >= v63)
                    v63 = v5;
                v64 = v63 - v2 - 6;
                if (v64 == v3)
                    v65 = v3;
                else
                    v65 = v3 + 1;
                v66 = (v64 - v65) / 3;
                if (v64 != v3)
                    v66 += 1;
                if (v66)
                {
                    v67 = v66 + 1;
                    v68 = v67 & 0x7ffffffffffffffe;
                    v69 = v68 * 3;
                    iter1 += v69;
                    v70 = node + v69;
                    a0 = (unsigned int)v3 * 0x100;
                    m = v68;
                    do
                    {
                        v72 = m;
                        v73 = 0xcf1bbcdcbfa56300 * *(long long *)node >> (v10 & 63);
                        v74 = 0xcf1bbcdcbfa56300 * (long long)node[3] >> (v10 & 63);
                        *(unsigned int *)((char *)v7 + (v73 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v73 & 0xff);
                        *(unsigned int *)((char *)v7 + (v74 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v74 & 0xff) + 0x300;
                        a0 = (unsigned int)a0 + 0x600;
                        node += 6;
                        m = v72 - 2;
                    } while (m);
                    if (v67 == v68)
                        return a0;
                }
                else
                {
                    v70 = node;
                }
                do
                {
                    v76 = 0xcf1bbcdcbfa56300 * *(long long *)v70 >> (v10 & 63);
                    *(unsigned int *)((char *)v7 + (v76 >> 6 & 0x3fffffffffffffc)) = (unsigned int)v76 & 0xff | ((unsigned int)(v70 - v2) * 0x100 | (unsigned int)(v70 - v2) >> 24) & 0xffffff00;
                    iter1 += 3;
                    v70 = iter1;
                } while (iter1 < v5);
                return a0;
            }
            else if (v8 == 8)
            {
                v47 = v2 + v3 + 6;
                if (v5 >= v47)
                    v47 = v5;
                v48 = v47 - v2 - 6;
                if (v48 == v3)
                    v49 = v3;
                else
                    v49 = v3 + 1;
                v50 = (v48 - v49) / 3;
                if (v48 != v3)
                    v50 += 1;
                if (v50)
                {
                    v51 = v50 + 1;
                    v52 = v51 & 0x7ffffffffffffffe;
                    v53 = v52 * 3;
                    iter1 += v53;
                    v54 = node + v53;
                    a0 = (unsigned int)v3 * 0x100;
                    j = v52;
                    do
                    {
                        v56 = j;
                        v57 = 14923729446382167139 * *(long long *)node >> (v10 & 63);
                        v58 = 14923729446382167139 * (long long)node[3] >> (v10 & 63);
                        *(unsigned int *)((char *)v7 + (v57 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v57 & 0xff);
                        *(unsigned int *)((char *)v7 + (v58 >> 6 & 0x3fffffffffffffc)) = (unsigned int)a0 + ((unsigned int)v58 & 0xff) + 0x300;
                        a0 = (unsigned int)a0 + 0x600;
                        node += 6;
                        j = v56 - 2;
                    } while (j);
                    if (v51 == v52)
                        return a0;
                }
                else
                {
                    v54 = node;
                }
                do
                {
                    v60 = 14923729446382167139 * *(long long *)v54 >> (v10 & 63);
                    *(unsigned int *)((char *)v7 + (v60 >> 6 & 0x3fffffffffffffc)) = (unsigned int)v60 & 0xff | ((unsigned int)(v54 - v2) * 0x100 | (unsigned int)(v54 - v2) >> 24) & 0xffffff00;
                    iter1 += 3;
                    v54 = iter1;
                } while (iter1 < v5);
                return a0;
            }
        }
        v61 = (unsigned int)v3 * 0x100;
        do
        {
            v62 = 2654435761 * *(int *)((char *)iter1 - 3) >> (v11 & 31);
            *(unsigned int *)((char *)v7 + 4 * (v62 >> 8)) = v61 + (v62 & 0xff);
            iter1 += 3;
            v61 += 0x300;
        } while (iter1 < v5);
        return a0;
    }
}
