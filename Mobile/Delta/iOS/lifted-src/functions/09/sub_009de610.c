/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de610..0x9dea3c (1068 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9de610_0 {
    char padding_0[16];
    unsigned int field_10;
} st_9de610_0;

typedef struct st_9de610_1 {
    unsigned long long field_0;
    char *field_8;
    unsigned int field_10;
} st_9de610_1;


char * sub_9de610(char *a0, char *a1, st_9de610_0 *a2, st_9de610_0 *a3, long long a4)
{
    long long v11;  // x19
    char *v12;  // x21
    char *v21;  // x9
    char *v22;  // x22
    unsigned long v23;  // x11
    char *v25;  // x25
    st_9de610_1 *v26;  // x0
    char *v27;  // x22
    char *v28;  // x26
    st_9de610_1 *v29;  // x23
    unsigned long long v30;  // x23
    char *v13;  // x0
    void* v31;  // x8
    unsigned long long v32;  // x27
    char *v33;  // x26
    unsigned long long v34;  // x9
    char *j;  // w19
    unsigned long long *v36;  // x28
    unsigned long long *v37;  // x23
    unsigned long long *iter;  // x22
    unsigned long long *v39;  // x10
    uint128_t v40;  // x20
    char *v14;  // x23
    char *v41;  // x26
    uint128_t v42;  // x0
    unsigned long long v43;  // x8
    char *v44;  // x14
    unsigned long long v45;  // x9
    char *v46;  // x10
    unsigned long v47;  // x11
    uint128_t v48;  // x12
    void* *v50;  // x21
    void* iter1;  // x19
    unsigned long long v51;  // x0
    void* v52;  // x2
    unsigned long long v53;  // x0
    void* v54;  // x2
    char *v55;  // x10
    unsigned long long v56;  // x8
    void* v57;  // x9
    uint128_t v58;  // q0
    uint128_t *iter2;  // x10
    uint128_t *node;  // x11
    char *i;  // x22
    char *k;  // x12
    char *v62;  // x12
    uint128_t v63;  // q2
    unsigned long long v65;  // x12
    unsigned long long *v66;  // x11
    unsigned long long *v67;  // x9
    char *l;  // x10
    char *v69;  // x10
    unsigned long long v17;  // x0
    unsigned long long v72;  // x0
    st_9de610_1 *v73;  // x1
    unsigned long long v18;  // x24
    unsigned long long v19;  // 4141
    unsigned int v20;  // w8
    unsigned int v0;  // [bp-0xb4]
    char *v1;  // [bp-0xa8]
    char *v2;  // [bp-0xa0]
    char *v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    char *v5;  // [bp-0x80]
    st_9de610_1 *v6;  // [bp-0x78]
    void* *v7;  // [bp-0x70]
    unsigned long long *v8;  // [bp-0x68], Other Possible Types: unsigned long
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a4;
    v12 = a0;
    sub_9de064(a4);
    if (!v12)
        v12 = sub_9de208(v11);
    v7 = sub_9de208(v11);
    v6 = sub_9de208(v11);
    v13 = sub_9de208(v11);
    if (v13 && (v14 = v13, sub_9e4c34()))
    {
        iter1 = *(long long *)v14;
        i = *(int *)&v14[8];
        v17 = sub_9e4630(*(long long *)(*(long long *)v14 + i * 8 - 8));
        v18 = 64 - v17;
        v19 = arm64g_calculate_condition(67, 0, v17 & 0xffffffff, 0);
        if (v19 & 1)
            v20 = (unsigned int)v17 & 63;
        else
            v20 = -(-(unsigned int)v17 & 63);
        if ((int)(unsigned int)i >= 1)
        {
            v21 = 0;
            do
            {
                v22 = i;
                v23 = *(long long *)iter1;
                *(unsigned long *)iter1 = v23 << ((char)v18 & 63) | v21;
                iter1 += 8;
                v21 = v23 >> ((char)v20 & 63) & (-v20 | -v20 >> 8);
                i = v22 - 1;
            } while (i);
        }
        *(unsigned int *)&v14[16] = 0;
        if (sub_9ea6d0(v6, a2, v18))
        {
            v25 = *(int *)&v14[8];
            v26 = v6;
            v27 = (int)v26->field_8;
            if ((int)(unsigned int)v25 >= (int)(unsigned int)v27)
            {
                v28 = (unsigned int)v25 + 1;
                if (sub_9e4cdc(v26, v28))
                {
                    v29 = v6;
                    _bzero(v29->field_0 + (unsigned int)v27 * 8, (long long)((v28 - v27) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v28 - v27, 3) & 0x7fffffff8 & 0x7ffffffff);
                    v26 = v29;
                    *(unsigned int *)&v26->field_8 = (unsigned int)v28;
                    v27 = v28;
                    goto LABEL_9de764;
                }
            }
            else
            {
LABEL_9de764:
                v3 = v14;
                v30 = v27 - v25;
                v5 = (unsigned int)v25;
                v31 = *(long long *)v3 + v5 * 8;
                if ((unsigned int)v25 == 1)
                    v1 = 0;
                else
                    v1 = *(long long *)((char *)v31 - 16);
                v8 = v26->field_0;
                v32 = *(long long *)((char *)v31 - 8);
                v33 = v3;
                if (sub_9e4cdc(v12, v30))
                {
                    v0 = a2->field_10;
                    *(unsigned int *)&v12[16] = a3->field_10 ^ a2->field_10;
                    *(unsigned int *)&v12[8] = v30;
                    if (sub_9e4cdc(v7, (unsigned int)v25 + 1))
                    {
                        if ((int)v30 >= 1)
                        {
                            v34 = v30;
                            j = (char *)0;
                            v36 = v8 + (int)v34 * 8;
                            v37 = v8 + (int)v27 * 8 - 8;
                            iter = *(long long *)v12 + (int)v34 * 8;
                            v2 = v25 & 0x7ffffffc;
                            v39 = v37;
                            v4 = v34;
                            do
                            {
                                v8 = (char *)v39 - 8;
                                if (*v37 == v32)
                                {
                                    v40 = 0xffffffffffffffff;
                                }
                                else
                                {
                                    if (v37 != v36)
                                        v41 = *(long long *)((char *)v37 - 16);
                                    else
                                        v41 = 0;
                                    v42 = sub_9db928();
                                    v40 = v42;
                                    v43 = *(long long *)((char *)v39 - 8) - v32 * v42;
                                    v44 = v1;
                                    v45 = v42 * v44 >> 64;
                                    if (v45 >= v43)
                                    {
                                        v46 = v44 * v40;
                                        v47 = *(long long *)((char *)v39 - 8) + v32 - v40 * v32;
                                        while (1)
                                        {
                                            v48 = v40;
                                            if (v43 == v45 && v46 <= v41)
                                                break;
                                            if (v47 >= v32)
                                            {
                                                v43 += v32;
                                                v45 -= v44 > v46;
                                                v47 += v32;
                                                v40 = v48 - 1;
                                                v46 -= v44;
                                                if (v43 > v45)
                                                    goto LABEL_9de8f4;
                                            }
                                            else
                                            {
LABEL_9de8f4:
                                                v40 = v48 - 1;
                                                goto LABEL_9de900;
                                            }
                                        }
                                        v40 = v48;
                                    }
LABEL_9de900:
                                    v33 = v3;
                                }
                                v50 = v7;
                                v51 = sub_9db7cc(*v50, *(long long *)v33, v25, v40);
                                v52 = *v50;
                                *(unsigned long long *)((char *)v52 + 0x8 * v5) = v51;
                                v36 = (char *)v36 - 8;
                                v53 = sub_9dbbc8(v36, v36, v52, (unsigned int)v25 + 1);
                                v54 = *v50;
                                if ((int)(unsigned int)v25 < 1)
                                    continue;
                                v55 = 0;
                                v56 = -v53;
                                v57 = *(long long *)v33;
                                if ((unsigned int)v25 >= 4 && v54 - v57 >= 32)
                                {
                                    v58 = CONCAT(v56, v56);
                                    iter2 = v57 + 16;
                                    node = v54 + 16;
                                    k = v2;
                                    do
                                    {
                                        v62 = k;
                                        v63 = *iter2;
                                        *(uint128_t *)((char *)node - 16) = *(int128_t *)((char *)iter2 - 16) & v58;
                                        *node = v63 & v58;
                                        iter2 += 2;
                                        node += 2;
                                        k = v62 - 4;
                                    } while (k);
                                    v55 = v2;
                                    if (v2 == v25)
                                        continue;
                                }
                                v65 = v55 * 8;
                                v66 = v54 + v65;
                                v67 = v57 + v65;
                                l = v25 - v55;
                                do
                                {
                                    v69 = l;
                                    *v66 = *v67 & v56;
                                    v66 += 1;
                                    v67 += 1;
                                    l = v69 - 1;
                                } while (l);
                                v72 = sub_9dbad4(v36, v36);
                                *v37 = *v37 + v72;
                                *(unsigned long long *)((char *)iter - 8) = v40 - v53;
                                iter = (char *)iter - 8;
                                j += 1;
                                v39 = v8;
                                v37 = v39;
                            } while (j != (unsigned int)v4);
                        }
                        v73 = v6;
                        v73->field_10 = v0;
                        *(unsigned int *)&v73->field_8 = (unsigned int)v25;
                        if (!a1)
                        {
                            sub_9de17c(v11);
                            return 1;
                        }
                        v11 = v11;
                        if (sub_9eaa84(a1, v73, v18))
                        {
                            sub_9de17c(v11);
                            return 1;
                        }
                    }
                }
            }
        }
    }
    sub_9de17c(v11);
    return 0;
}
