/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa63af4..0xa63e6c (888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a63af4_1 {
    struct st_a63af4_1 *field_0;
    struct st_a63af4_1 *field_8;
    unsigned long long field_10;
} st_a63af4_1;

typedef struct st_a63af4_2 {
    unsigned long long field_0;
    char *field_8;
    unsigned long long field_10;
    struct st_a63af4_1 *field_18;
    unsigned long long field_20;
    struct st_a63af4_1 *field_28;
    unsigned long long field_30;
    struct st_a63af4_1 *field_38;
} st_a63af4_2;

typedef struct st_a63af4_0 {
    char padding_0[36];
    char *field_24;
    long long field_28;
    char padding_30[8];
    char field_38;
    char padding_39[7];
    struct st_a63af4_1 *field_40;
    char padding_48[8];
    struct st_a63af4_1 *field_50;
} st_a63af4_0;

extern long long g_a63fc0;

char * sub_a63af4(st_a63af4_0 *a0, unsigned long long a1)
{
    unsigned long long v9;  // x21
    st_a63af4_0 *v10;  // x19
    char *v19;  // x8
    unsigned long long *iter;  // x9
    char *v21;  // x8
    unsigned long v22;  // x10
    unsigned long long v23;  // x12
    char **v24;  // x14
    char **v25;  // x13
    char *v26;  // x15
    char **v27;  // x13
    char **v28;  // x13
    st_a63af4_2 **v11;  // x0
    char **v29;  // x13
    unsigned long v30;  // x10
    unsigned long long v31;  // x12
    char **v32;  // x14
    char **v33;  // x13
    char *v34;  // x15
    char **v35;  // x13
    char **v36;  // x13
    char **v37;  // x13
    unsigned long v38;  // x10
    st_a63af4_2 **v12;  // x20
    unsigned long long v39;  // x12
    char **v40;  // x14
    char **v41;  // x13
    char *v42;  // x15
    char **v43;  // x13
    char **v44;  // x13
    char **v45;  // x13
    unsigned long v46;  // x10
    unsigned long long v47;  // x12
    char **v48;  // x14
    char *v13;  // x0
    char **v49;  // x13
    char *v50;  // x15
    char **v51;  // x13
    char **v52;  // x13
    char **v53;  // x13
    char *v54;  // x0
    char *v14;  // x22
    unsigned long long v15;  // x24
    char *v16;  // x0
    char *v17;  // x23
    unsigned long long v18;  // x21
    char *v0;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    while (1)
    {
        v21 = v19;
        if (*(long long *)((char *)iter - 24))
        {
            v22 = *(long long *)((char *)iter - 32);
            v23 = *(long long *)&v14[16] & v22;
            v24 = &v17[64 * v23];
            v25 = v24;
            v26 = v25[1];
            v27 = v25 + 1;
            if (v25[1])
            {
                v28 = v24;
                v27 = v28 + 3;
                if (v28[3])
                {
                    v29 = v24;
                    v27 = v29 + 5;
                    if (v29[5])
                    {
                        if (v24[7])
                            goto LABEL_a63df4;
                        v26 = 3;
                        v27 = v24 + 7;
                    }
                    else
                    {
                        v26 = 2;
                    }
                }
                else
                {
                    v26 = 1;
                }
            }
            *v27 = *(long long *)((char *)iter - 24);
            v14 = v0;
            v17 = *(long long *)v14;
            *(unsigned long *)(&v17[64 * v23] + 0x10 * v26) = v22;
        }
        if (*(long long *)((char *)iter - 8))
        {
            v30 = *(long long *)((char *)iter - 16);
            v31 = *(long long *)&v14[16] & v30;
            v32 = &v17[64 * v31];
            v33 = v32;
            v34 = v33[1];
            v35 = v33 + 1;
            if (v33[1])
            {
                v36 = v32;
                v35 = v36 + 3;
                if (v36[3])
                {
                    v37 = v32;
                    v35 = v37 + 5;
                    if (v37[5])
                    {
                        if (v32[7])
                            goto LABEL_a63df4;
                        v34 = 3;
                        v35 = v32 + 7;
                    }
                    else
                    {
                        v34 = 2;
                    }
                }
                else
                {
                    v34 = 1;
                }
            }
            *v35 = *(long long *)((char *)iter - 8);
            v14 = v0;
            v17 = *(long long *)v14;
            *(unsigned long *)(&v17[64 * v31] + 0x10 * v34) = v30;
        }
        if (iter[1])
        {
            v38 = *iter;
            v39 = *(long long *)&v14[16] & v38;
            v40 = &v17[64 * v39];
            v41 = v40;
            v42 = v41[1];
            v43 = v41 + 1;
            if (v41[1])
            {
                v44 = v40;
                v43 = v44 + 3;
                if (v44[3])
                {
                    v45 = v40;
                    v43 = v45 + 5;
                    if (v45[5])
                    {
                        if (v40[7])
                            goto LABEL_a63df4;
                        v42 = 3;
                        v43 = v40 + 7;
                    }
                    else
                    {
                        v42 = 2;
                    }
                }
                else
                {
                    v42 = 1;
                }
            }
            *v43 = iter[1];
            v14 = v0;
            v17 = *(long long *)v14;
            *(unsigned long *)(&v17[64 * v39] + 0x10 * v42) = v38;
            goto LABEL_a63d5c;
        }
        else
        {
LABEL_a63d5c:
            if (!iter[3])
                continue;
            v46 = iter[2];
            v47 = *(long long *)&v14[16] & v46;
            v48 = &v17[64 * v47];
            v49 = v48;
            v50 = v49[1];
            v51 = v49 + 1;
            if (!v49[1])
            {
LABEL_a63bd8:
                *v51 = iter[3];
                v14 = v0;
                v17 = *(long long *)v14;
                *(unsigned long *)(&v17[64 * v47] + 0x10 * v50) = v46;
            }
            else
            {
                v52 = v48;
                v51 = v52 + 3;
                if (!v52[3])
                {
                    v50 = 1;
                    goto LABEL_a63bd8;
                }
                v53 = v48;
                v51 = v53 + 5;
                if (!v53[5])
                {
                    v50 = 2;
                    goto LABEL_a63bd8;
                }
                else if (!v48[7])
                {
                    v50 = 3;
                    v51 = v48 + 7;
                    goto LABEL_a63bd8;
                }
LABEL_a63df4:
                sub_a6c2e4(*(long long *)&v14[8], "crypto/hashtable/hashtable.c", 488);
                sub_a6c2e4(v14, "crypto/hashtable/hashtable.c", 489);
                a1 = v18;
                a0 = v10;
                v7 = &v8;
                v9 = a1;
                v10 = a0;
                v11 = sub_a7bf24(a0->padding_30);
                if (*(int *)&(v10->padding_0)[1])
                    return 0;
                v12 = v11;
                v13 = sub_a6bffc(24, "crypto/hashtable/hashtable.c", 452);
                v0 = v13;
                if (!v13)
                    return v13;
                v14 = v13;
                v15 = v9 * 128;
                v16 = sub_a6c0cc(v15, 64, v13 + 8, "crypto/hashtable/hashtable.c", 160);
                if (!v16)
                {
                    v16 = sub_a6bf4c(v15, "crypto/hashtable/hashtable.c", 164);
                    *(char **)&v14[8] = v16;
                    if (!v16)
                    {
                        *(unsigned long long *)v14 = 0;
                        sub_a6c2e4(*(long long *)&v14[8], "crypto/hashtable/hashtable.c", 522);
                        sub_a6c2e4(v14, "crypto/hashtable/hashtable.c", 523);
                        return 0;
                    }
                }
                v17 = v16;
                v18 = v9 * 2;
                _bzero();
                *(char **)v14 = v17;
                *(unsigned long long *)&v14[16] = v18 - 1;
                v19 = *(long long *)&v10->field_38;
                if (v19)
                {
                    iter = &*v12->field_20;
                    continue;
                }
            }
            iter += 8;
            v19 = v21 - 1;
            if (v21 == 1)
            {
                v54 = sub_a7befc();
                if (v54)
                {
                    *(unsigned long long *)&v10->field_38 = v18;
                    sub_a7bf2c(v10->padding_30, &v0);
                    sub_a7bf10(v10->field_24, v54, &g_a63fc0, v12);
                    *(unsigned int *)&v10->padding_48[0] = 1;
                    return 1;
                }
                sub_a6c2e4(*(long long *)&v14[8], "crypto/hashtable/hashtable.c", 522);
                sub_a6c2e4(v14, "crypto/hashtable/hashtable.c", 523);
                break;
            }
        }
    }
    return 0;
}
