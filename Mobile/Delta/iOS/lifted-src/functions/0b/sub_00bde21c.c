/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbde21c..0xbdeec0 (3236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bde21c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_bde21c_1;

typedef struct st_bde21c_0 {
    uint128_t field_0;
    struct st_bde21c_1 *field_10;
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    unsigned long long field_100;
} st_bde21c_0;

extern char g_e067b8;

void* sub_bde21c(void* a0)
{
    void* i;  // x8
    void* v25;  // x22
    void* v34;  // x12
    unsigned long long v35;  // x10
    uint128_t *iter;  // x8
    long long k;  // x9
    long long v38;  // x9
    void* v39;  // x26
    unsigned long v40;  // x13
    unsigned long long v41;  // x21
    unsigned long v42;  // x27
    void* dst;  // x0
    void* v26;  // x0
    void* v44;  // x12
    unsigned long long v45;  // x10
    uint128_t *iter1;  // x8
    long long l;  // x9
    long long v48;  // x9
    void* v49;  // x12
    unsigned long v50;  // x13
    unsigned long long v51;  // x8
    unsigned long long v52;  // x24
    unsigned long long v53;  // x1
    void* v27;  // x25
    unsigned long long ptr;  // x0
    void* v55;  // x21
    unsigned long long v56;  // x24
    long long v57;  // x0
    long long v58;  // x0
    unsigned long long v59;  // x22
    unsigned long iter2;  // x8
    void* v61;  // x25
    void* v62;  // x0
    unsigned long v63;  // x28
    unsigned long v28;  // x8
    unsigned long long v64;  // x26
    unsigned long v65;  // x10
    st_bde21c_0 *n;  // x9
    unsigned long v67;  // x13
    unsigned long long v68;  // x10
    void* v69;  // x12
    void* v70;  // x11
    unsigned long v71;  // x13
    unsigned long long *v72;  // x12
    unsigned long long v73;  // x22
    unsigned long long v29;  // x23
    unsigned long long v74;  // x22
    void* j;  // x21
    void* v76;  // x22
    unsigned long v77;  // x1
    uint128_t *v78;  // x8
    unsigned long v79;  // x10
    uint128_t v80;  // q1
    uint128_t v81;  // q0
    uint128_t v82;  // q2
    unsigned long long *v30;  // x20
    unsigned long v31;  // x24
    void* node;  // x26
    void* v33;  // x25
    void* v0;  // [bp-0x1d0], Other Possible Types: char
    void* v1;  // [bp-0x1c8]
    unsigned long long v2;  // [bp-0x1c0]
    void* v3;  // [bp-0x1b8]
    uint128_t v4;  // [bp-0x1b0]
    unsigned long long *v5;  // [bp-0x1a0], Other Possible Types: uint128_t
    unsigned long v6;  // [bp-0x198]
    uint128_t v7;  // [bp-0x190]
    uint128_t v8;  // [bp-0x180], Other Possible Types: unsigned long
    uint128_t v9;  // [bp-0x170]
    uint128_t v10;  // [bp-0x160]
    uint128_t v11;  // [bp-0x150]
    uint128_t v12;  // [bp-0x140]
    uint128_t v13;  // [bp-0x130]
    uint128_t v14;  // [bp-0x120]
    uint128_t v15;  // [bp-0x110]
    uint128_t v16;  // [bp-0x100]
    uint128_t v17;  // [bp-0xf0]
    uint128_t v18;  // [bp-0xe0]
    uint128_t v19;  // [bp-0xd0], Other Possible Types: unsigned long
    uint128_t v20;  // [bp-0xc0]
    unsigned long v21;  // [bp-0xb0]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    i = *(long long *)a0;
    v25 = (long long)a0[8];
    v26 = a0;
    if (*(long long *)v26 != v25)
    {
        v26 = a0;
        do
        {
            v27 = i + 264;
            *(void* *)a0 = v27;
            if ((long long)i[24] == 33)
                break;
            v4 = *(int128_t *)i;
            v7 = (int128_t)i[32];
            v8 = (int128_t)i[48];
            v9 = (int128_t)i[64];
            v12 = (int128_t)i[112];
            v13 = (int128_t)i[128];
            v10 = (int128_t)i[80];
            v11 = (int128_t)i[96];
            v16 = (int128_t)i[176];
            v17 = (int128_t)i[192];
            v14 = (int128_t)i[144];
            v15 = (int128_t)i[160];
            v21 = (long long)i[0x100];
            v19 = (int128_t)i[224];
            v20 = (int128_t)i[240];
            v18 = (int128_t)i[208];
            v5 = (long long)i[16];
            v6 = (long long)i[24];
            v28 = v6 - 12;
            if (11 >= v6)
                v28 = 9;
            if (19 >= v28)
                goto *((void *)(sub_bde260 + (&g_e067b8)[v28] * 4));
            if (*(unsigned long long *)&v4)
                v26 = _free(*(unsigned long long *)((void*)&v4 + 8));
            i = v27;
        } while (i != v25);
    }
    *(unsigned long long *)a0 = 8;
    *(unsigned long long *)&a0[8] = 8;
    v29 = (long long)a0[32];
    v30 = (long long)a0[16];
    if (v29)
    {
        v31 = (long long)a0[24];
        if (v30[2] == v31)
        {
            node = (long long)a0[48];
            v33 = (long long)a0[64];
        }
        else
        {
            v33 = (long long)a0[64];
            v34 = (long long)a0[48];
            v35 = v30[2] * 264;
            iter = v35 + v30[1] + 40;
            k = -v35 + 264 * v31;
            do
            {
                v38 = k;
                if (v34 == v33)
                    return v26;
                v39 = v34;
                v40 = *(long long *)v39;
                node = v39 + 56;
                *(void* *)&a0[48] = node;
                if (v40 == 0x8000000000000000)
                    return v26;
                v4 = (int128_t)v34[8];
                v5 = (int128_t)v34[24];
                v7 = (int128_t)v34[40];
                *(unsigned long long *)((char *)iter - 16) = 15;
                *(unsigned long *)((char *)iter - 8) = v40;
                *iter = v4;
                iter[1] = v5;
                iter[2] = v7;
                v30[2] = v30[2] + 1;
                iter = (char *)&iter[16] + 8;
                v34 = node;
                k = v38 - 264;
            } while (k);
        }
        if (v33 != node)
        {
            v41 = 7905747460161236407 * (v33 - node >> 3);
            if (*v30 - (v29 + v31) < v41)
                sub_c736c8(v30, v29 + v31, v41, 8, 264);
            v42 = v31 + v41;
            dst = _memmove(v30[1] + 264 * v42, v30[1] + 264 * v31, v29 * 264);
            *(unsigned long *)&a0[24] = v42;
            if (v30[2] == v42)
            {
                v44 = node;
            }
            else
            {
                v45 = v30[2] * 264;
                iter1 = v45 + v30[1] + 40;
                l = -v45 + 264 * v42;
                do
                {
                    v48 = l;
                    if (node == v33)
                        return dst;
                    v49 = node;
                    v50 = *(long long *)v49;
                    v44 = v49 + 56;
                    *(void* *)&a0[48] = v44;
                    if (v50 == 0x8000000000000000)
                        return dst;
                    v5 = (int128_t)node[24];
                    v7 = (int128_t)node[40];
                    v4 = (int128_t)node[8];
                    *(unsigned long long *)((char *)iter1 - 16) = 15;
                    *(unsigned long *)((char *)iter1 - 8) = v50;
                    *iter1 = v4;
                    iter1[1] = v5;
                    iter1[2] = v7;
                    v30[2] = v30[2] + 1;
                    iter1 = (char *)&iter1[16] + 8;
                    node = v44;
                    l = v48 - 264;
                } while (l);
            }
            node = v44;
        }
        else
        {
            v42 = v31;
        }
        v51 = v33 - node;
        v52 = v51 >> 3;
        v53 = 2635249153387078840 * v52;
        if (v51 > 1956472856302528200)
            sub_c6b970(0);
        if (v53)
        {
            ptr = _malloc(v53);
            if (!ptr)
            {
                v57 = sub_c6b970(8, v53);
                sub_be66c0(&v0);
                v58 = sub_c73e0c(__Unwind_Resume(v57));
                sub_c73e0c(v58);
            }
            v55 = ptr;
            v56 = 7905747460161236407 * v52;
            if (node == v33)
                goto LABEL_bde944;
LABEL_bde8c0:
            v59 = 0;
            iter2 = v55 + 32;
            do
            {
                v8 = (long long)node[48];
                v5 = (int128_t)node[16];
                v7 = (int128_t)node[32];
                v4 = *(int128_t *)node;
                node += 56;
                *(unsigned long long *)(iter2 - 8) = 15;
                *(unsigned long *)(iter2 + 48) = v8;
                *(uint128_t *)(iter2 + 16) = v5;
                *(uint128_t *)(iter2 + 32) = v7;
                *(uint128_t *)iter2 = v4;
                v59 += 1;
                iter2 += 264;
            } while (node != v33);
            *(void* *)&a0[48] = node;
            v0 = v55;
            v1 = v55;
            v61 = v55 + 264 * v59;
            v2 = v56;
            v3 = v61;
            v62 = v55;
            if (v59)
                goto LABEL_bde960;
        }
        else
        {
            v56 = 0;
            v55 = 8;
            if (node != v33)
                goto LABEL_bde8c0;
LABEL_bde944:
            v59 = 0;
            v0 = v55;
            v1 = v55;
            v61 = v55;
            v2 = v56;
            v3 = v61;
            v62 = v55;
            if (0)
            {
LABEL_bde960:
                if (*v30 - (v29 + v42) < v59)
                    sub_c736c8(v30, v29 + v42, v59, 8, 264);
                v63 = v42 + v59;
                v64 = v63 * 264;
                _memmove(v30[1] + v64, v30[1] + 264 * v42, v29 * 264);
                *(unsigned long *)&a0[24] = v63;
                v62 = v55;
                if (v30[2] != v63)
                {
                    v65 = v30[1];
                    n = v30[1] + 264 * v30[2];
                    v67 = v55 + 264;
                    v68 = v59 * 264;
                    v69 = v55;
                    do
                    {
                        if (v68)
                        {
                            v62 = v67;
                            v70 = v69 + 264;
                            v71 = (long long)v69[24];
                            if (v71 == 33)
                            {
                                v62 = v70;
                                v1 = v70;
                                goto LABEL_bdeaf8;
                            }
                        }
                        else
                        {
                            v62 = v61;
                            v1 = v61;
                            goto LABEL_bdeaf8;
                        }
                        v16 = (int128_t)v69[208];
                        v17 = (int128_t)v69[224];
                        v18 = (int128_t)v69[240];
                        v19 = (long long)v69[0x100];
                        v12 = (int128_t)v69[144];
                        v13 = (int128_t)v69[160];
                        v14 = (int128_t)v69[176];
                        v15 = (int128_t)v69[192];
                        v8 = (int128_t)v69[80];
                        v9 = (int128_t)v69[96];
                        v10 = (int128_t)v69[112];
                        v11 = (int128_t)v69[128];
                        v4 = (int128_t)v69[32];
                        v5 = (int128_t)v69[48];
                        v7 = (int128_t)v69[64];
                        v72 = (long long)v69[16];
                        n->field_0 = *(int128_t *)v69;
                        n->field_10 = v72;
                        n->field_18 = v71;
                        n->field_d0 = v16;
                        n->field_e0 = v17;
                        n->field_f0 = v18;
                        n->field_100 = v19;
                        n->field_90 = v12;
                        n->field_a0 = v13;
                        n->field_b0 = v14;
                        n->field_c0 = v15;
                        n->field_50 = v8;
                        n->field_60 = v9;
                        n->field_70 = v10;
                        n->field_80 = v11;
                        n->field_20 = v4;
                        n->field_30 = v5;
                        n->field_40 = v7;
                        v30[2] = v30[2] + 1;
                        v67 = v62 + 264;
                        v68 -= 264;
                        n += 1;
                        v69 = v70;
                    } while (n != v65 + v64);
                    v1 = v62;
                }
            }
        }
LABEL_bdeaf8:
        v73 = 1 + 1117984489315730401 * (v61 - v62 >> 3);
        while (1)
        {
            v74 = v73 - 1;
            if (v73 == 1)
                break;
            sub_be6788();
            v62 += 264;
            v73 = v74;
        }
        if (!v56)
            return v62;
        _free(v55);
        return v62;
    }
    else
    {
        j = (long long)a0[48];
        v76 = (long long)a0[64];
        v77 = v30[2];
        if (*v30 - v77 < (v76 - j >> 3) * 7905747460161236407)
        {
            v26 = sub_c736c8(v30);
            v77 = v30[2];
            if (j != v76)
            {
LABEL_bde690:
                v78 = v30[1] + 264 * v77 + 32;
                do
                {
                    v79 = (long long)j[48];
                    v80 = (int128_t)j[16];
                    v81 = (int128_t)j[32];
                    v82 = *(int128_t *)j;
                    j += 56;
                    *(unsigned long long *)((char *)v78 - 8) = 15;
                    *v78 = v82;
                    v78[1] = v80;
                    v78[2] = v81;
                    *(unsigned long *)&v78[3] = v79;
                    v77 += 1;
                    v78 = (char *)&v78[16] + 8;
                } while (j != v76);
                *(void* *)&a0[48] = j;
            }
        }
        else if (!(j == v76))
        {
            goto LABEL_bde690;
        }
        v30[2] = v77;
        return v26;
    }
}
