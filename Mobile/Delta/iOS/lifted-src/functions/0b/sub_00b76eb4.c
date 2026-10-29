/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb76eb4..0xb773bc (1288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b76eb4_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b76eb4_0;

typedef struct st_b76eb4_1 {
    unsigned long long field_0;
    char padding_8[8];
    void* field_10;
    char padding_18[8];
    void* field_20;
    char padding_28[8];
    void* field_30;
    char padding_38[8];
    void* field_40;
    char padding_48[8];
    void* field_50;
    char padding_58[8];
    void* field_60;
} st_b76eb4_1;


double sub_b76eb4(st_b76eb4_0 *a0, st_b76eb4_1 *a1)
{
    unsigned long long v4;  // x25
    unsigned long long v5;  // x20
    unsigned long long v14;  // x2
    void* v15;  // x8
    void* v16;  // x9
    unsigned long long iter;  // x24
    unsigned long long v18;  // x23
    void* v19;  // x13
    unsigned long long v20;  // x8
    void* v21;  // x9
    unsigned long long v22;  // x10
    void* j;  // x10
    unsigned long long v6;  // x9
    unsigned long long v24;  // x14
    unsigned long long v25;  // x11
    unsigned long long v26;  // x12
    uint128_t *node;  // x14
    uint128_t *iter1;  // x13
    unsigned long long i;  // x15
    unsigned long long v30;  // x15
    uint128_t v31;  // q1
    unsigned long long v7;  // x8
    void* v34;  // x13
    unsigned long long v35;  // x8
    void* v36;  // x9
    unsigned long long v37;  // x10
    void* l;  // x10
    unsigned long long v39;  // x14
    unsigned long long v40;  // x11
    unsigned long long v41;  // x12
    uint128_t *iter2;  // x14
    uint128_t *v43;  // x13
    unsigned long long v8;  // x24
    unsigned long long k;  // x15
    unsigned long long v45;  // x15
    uint128_t v46;  // q1
    void* v49;  // x13
    unsigned long long v50;  // x8
    void* v51;  // x9
    unsigned long long v52;  // x10
    void* n;  // x10
    unsigned long long v9;  // x23
    unsigned long long v54;  // x14
    unsigned long long v55;  // x11
    unsigned long long v56;  // x12
    uint128_t *v57;  // x14
    uint128_t *v58;  // x13
    unsigned long long m;  // x15
    unsigned long long v60;  // x15
    uint128_t v61;  // q1
    unsigned long long ptr;  // x0
    unsigned long long *v11;  // x22
    unsigned long long v12;  // x9
    unsigned long long v13;  // x8
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0;
    v5 = (unsigned long long)a1->padding_48;
    if (v4 == 1)
    {
        v6 = (unsigned long long)a1->padding_28;
        if (v5)
        {
            if (a1->padding_8)
            {
                v7 = a1->field_20 - a1->field_10 >> 3;
                if (v6)
                    v7 += a1->field_40 - a1->field_30 >> 3;
            }
            else if (v6)
            {
                v7 = a1->field_40 - a1->field_30 >> 3;
            }
            else
            {
                v7 = 0;
            }
            v8 = v7 + (a1->field_60 - a1->field_50 >> 3);
            goto LABEL_b76fe0;
        }
        if (a1->padding_8)
        {
            v8 = a1->field_20 - a1->field_10 >> 3;
            if (v6)
            {
                v8 += a1->field_40 - a1->field_30 >> 3;
                if (v8 <= 0x1fffffffffffffff)
                    goto LABEL_b76fec;
            }
            else
            {
LABEL_b76fe0:
                if (v8 <= 0x1fffffffffffffff)
                    goto LABEL_b76fec;
            }
        }
        else if (v6)
        {
            v8 = a1->field_40 - a1->field_30 >> 3;
            if (v8 <= 0x1fffffffffffffff)
                goto LABEL_b76fec;
        }
        else
        {
LABEL_b76fb8:
            v8 = 0;
LABEL_b76fec:
            v9 = v8 * 8;
            if (0x7ffffffffffffff8 < v9)
            {
                sub_c6b970();
                __debugbreak();
            }
            else if (v9)
            {
                ptr = _malloc(v9);
                if (!ptr)
                {
                    sub_c6b970();
                    __debugbreak();
                }
                v11 = ptr;
                v0 = CONCAT(ptr, v8);
                v1 = 0;
                if (!(unsigned int)v4)
                    goto LABEL_b77068;
LABEL_b7701c:
                v12 = (unsigned long long)a1->padding_28;
                if (v5)
                {
                    if (a1->padding_8)
                    {
                        v13 = a1->field_20 - a1->field_10 >> 3;
                        if (v12)
                            v13 += a1->field_40 - a1->field_30 >> 3;
                    }
                    else
                    {
                        if (v12)
                            v13 = a1->field_40 - a1->field_30 >> 3;
                        else
                            v13 = 0;
                    }
                    v14 = v13 + (a1->field_60 - a1->field_50 >> 3);
                }
                else if (a1->padding_8)
                {
                    v14 = a1->field_20 - a1->field_10 >> 3;
                    if (v12)
                        v14 += a1->field_40 - a1->field_30 >> 3;
                }
                else
                {
                    if (v12)
                    {
                        v15 = a1->field_30;
                        v16 = a1->field_40;
                    }
                    else
                    {
                        iter = 0;
                        v18 = (unsigned long long)a1->padding_28;
                        if (a1->padding_8)
                        {
LABEL_b7710c:
                            v19 = a1->field_10;
                            v20 = (unsigned long long)a1->padding_18;
                            v21 = a1->field_20;
                            if (v19 != v21)
                            {
                                v22 = v21 - v19 - 8;
                                if (56 > v22)
                                {
                                    j = v19;
                                }
                                else
                                {
                                    v24 = iter * 8;
                                    if (32 > v24 + (char *)v11 - v19)
                                    {
                                        j = v19;
                                    }
                                    else
                                    {
                                        v25 = (v22 >> 3) + 1;
                                        v26 = v25 & 0x3ffffffffffffffc;
                                        iter += v26;
                                        j = v19 + v26 * 8;
                                        node = v24 + (char *)v11 + 16;
                                        iter1 = v19 + 16;
                                        i = v25 & 0x3ffffffffffffffc;
                                        do
                                        {
                                            v30 = i;
                                            v31 = *iter1;
                                            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter1 - 16);
                                            *node = v31;
                                            node += 2;
                                            iter1 += 2;
                                            i = v30 - 4;
                                        } while (i);
                                        if (v25 == v26)
                                            goto LABEL_b771a8;
                                    }
                                }
                                do
                                {
                                    v11[iter] = *(long long *)j;
                                    iter += 1;
                                    j += 8;
                                } while (j != v21);
                            }
LABEL_b771a8:
                            if (v20)
                                _free();
                        }
LABEL_b771b0:
                        if (v18)
                        {
                            v34 = a1->field_30;
                            v35 = (unsigned long long)a1->padding_38;
                            v36 = a1->field_40;
                            if (v34 != v36)
                            {
                                v37 = v36 - v34 - 8;
                                if (56 > v37)
                                {
                                    l = v34;
                                }
                                else
                                {
                                    v39 = iter * 8;
                                    if (32 > v39 + (char *)v11 - v34)
                                    {
                                        l = v34;
                                    }
                                    else
                                    {
                                        v40 = (v37 >> 3) + 1;
                                        v41 = v40 & 0x3ffffffffffffffc;
                                        iter += v41;
                                        l = v34 + v41 * 8;
                                        iter2 = v39 + (char *)v11 + 16;
                                        v43 = v34 + 16;
                                        k = v40 & 0x3ffffffffffffffc;
                                        do
                                        {
                                            v45 = k;
                                            v46 = *v43;
                                            *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)v43 - 16);
                                            *iter2 = v46;
                                            iter2 += 2;
                                            v43 += 2;
                                            k = v45 - 4;
                                        } while (k);
                                        if (v40 == v41)
                                            goto LABEL_b77250;
                                    }
                                }
                                do
                                {
                                    v11[iter] = *(long long *)l;
                                    iter += 1;
                                    l += 8;
                                } while (l != v36);
                            }
LABEL_b77250:
                            if (v35)
                                _free(v18);
                        }
LABEL_b7725c:
                        if (v5)
                        {
                            v49 = a1->field_50;
                            v50 = (unsigned long long)a1->padding_58;
                            v51 = a1->field_60;
                            if (v49 != v51)
                            {
                                v52 = v51 - v49 - 8;
                                if (56 > v52)
                                {
                                    n = v49;
                                }
                                else
                                {
                                    v54 = iter * 8;
                                    if (32 > v54 + (char *)v11 - v49)
                                    {
                                        n = v49;
                                    }
                                    else
                                    {
                                        v55 = (v52 >> 3) + 1;
                                        v56 = v55 & 0x3ffffffffffffffc;
                                        iter += v56;
                                        n = v49 + v56 * 8;
                                        v57 = v54 + (char *)v11 + 16;
                                        v58 = v49 + 16;
                                        m = v55 & 0x3ffffffffffffffc;
                                        do
                                        {
                                            v60 = m;
                                            v61 = *v58;
                                            *(int128_t *)((char *)v57 - 16) = *(int128_t *)((char *)v58 - 16);
                                            *v57 = v61;
                                            v57 += 2;
                                            v58 += 2;
                                            m = v60 - 4;
                                        } while (m);
                                        if (v55 == v56)
                                            goto LABEL_b77304;
                                    }
                                }
                                do
                                {
                                    v11[iter] = *(long long *)n;
                                    iter += 1;
                                    n += 8;
                                } while (n != v51);
                            }
LABEL_b77304:
                            v1 = iter;
                            if (v50)
                                _free(v5);
                            goto LABEL_b77314;
                        }
LABEL_b77288:
                        v1 = iter;
LABEL_b77314:
                        a0->field_0 = v0;
                        a0->field_10 = v1;
                        return (unsigned long long)v0;
                    }
LABEL_b77074:
                    v14 = v16 - v15 >> 3;
                }
                if (v8 >= v14)
                {
                    iter = 0;
                    if ((unsigned int)v4)
                        goto LABEL_b77100;
                    goto LABEL_b7725c;
                }
                else
                {
                    sub_c6c0cc(&v0, 0);
                    v11 = *(unsigned long long *)((void*)&v0 + 8);
                    iter = v1;
                    if ((unsigned int)v4)
                    {
LABEL_b77100:
                        v18 = (unsigned long long)a1->padding_28;
                        if (a1->padding_8)
                            goto LABEL_b7710c;
                        goto LABEL_b771b0;
                    }
                }
            }
            else
            {
                v8 = 0;
                v11 = 8;
                v0 = CONCAT(8, 0);
                v1 = 0;
                if ((unsigned int)v4)
                    goto LABEL_b7701c;
LABEL_b77068:
                if (v5)
                {
                    v15 = a1->field_50;
                    v16 = a1->field_60;
                    goto LABEL_b77074;
                }
                else
                {
                    iter = 0;
                    goto LABEL_b77288;
                }
            }
        }
    }
    else
    {
        if (!v5)
            goto LABEL_b76fb8;
        v8 = a1->field_60 - a1->field_50 >> 3;
        if (v8 <= 0x1fffffffffffffff)
            goto LABEL_b76fec;
    }
    sub_c6b970();
    __debugbreak();
}
