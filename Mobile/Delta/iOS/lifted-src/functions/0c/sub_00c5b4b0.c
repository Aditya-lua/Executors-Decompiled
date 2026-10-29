/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5b4b0..0xc5b9a0 (1264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5b4b0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_c5b4b0_0;

typedef struct st_c5b4b0_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c5b4b0_1;

typedef struct st_c5b4b0_2 {
    unsigned long long field_0[2];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
} st_c5b4b0_2;


void sub_c5b4b0(void* a0, st_c5b4b0_0 *a1, st_c5b4b0_0 *a2, st_c5b4b0_0 *a3)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    st_c5b4b0_0 *i;  // x27
    void* v31;  // x28
    st_c5b4b0_0 *v32;  // w25
    unsigned long long v33;  // x3
    void* v34;  // x23
    void* v35;  // x24
    unsigned long v36;  // x22
    unsigned long v37;  // x19
    unsigned long long v38;  // x20
    unsigned long long v21;  // x26
    st_c5b4b0_0 *v39;  // w0
    unsigned long v40;  // x21
    st_c5b4b0_0 *v41;  // w0
    unsigned long v42;  // x8
    void* v43;  // x0
    st_c5b4b0_0 *v44;  // w0
    unsigned long v45;  // x8
    unsigned long long v46;  // 4113
    unsigned long long v47;  // x20
    unsigned long long v48;  // x22
    unsigned long long v22;  // x25
    void* v49;  // x19
    st_c5b4b0_0 *v50;  // w0
    st_c5b4b0_0 *v51;  // x8
    st_c5b4b0_0 *iter;  // x23
    uint128_t v53;  // q0
    unsigned long v54;  // x8
    st_c5b4b0_2 *iter1;  // x25
    unsigned long v56;  // x26
    st_c5b4b0_0 *v57;  // x21
    st_c5b4b0_0 *v58;  // x28
    unsigned long long v23;  // x24
    st_c5b4b0_0 *v59;  // w0
    unsigned long v60;  // x8
    st_c5b4b0_1 *v61;  // x9
    unsigned long v62;  // x10
    uint128_t v63;  // q0
    st_c5b4b0_0 *v64;  // x20
    st_c5b4b0_0 *k;  // x19
    st_c5b4b0_0 *v66;  // x19
    st_c5b4b0_2 *v67;  // x21
    st_c5b4b0_0 *v68;  // w0
    unsigned long long v24;  // x23
    unsigned long v69;  // x8
    st_c5b4b0_1 *v70;  // x9
    unsigned long v71;  // x10
    uint128_t v72;  // q0
    void* v73;  // x10
    void* v74;  // x8
    uint128_t v75;  // q0
    st_c5b4b0_0 *iter2;  // x23
    void* v77;  // x8
    uint128_t v78;  // q0
    unsigned long long v25;  // x22
    unsigned long v79;  // x8
    st_c5b4b0_2 *node;  // x26
    unsigned long v81;  // x27
    st_c5b4b0_0 *v82;  // x20
    st_c5b4b0_0 *v83;  // x19
    st_c5b4b0_0 *v84;  // w0
    unsigned long v85;  // x8
    st_c5b4b0_1 *v86;  // x9
    unsigned long v87;  // x10
    uint128_t v88;  // q0
    unsigned long long v26;  // x21
    st_c5b4b0_0 *v89;  // x21
    st_c5b4b0_0 *m;  // x28
    st_c5b4b0_0 *v91;  // x28
    st_c5b4b0_2 *v92;  // x19
    st_c5b4b0_0 *v93;  // w0
    unsigned long v94;  // x8
    st_c5b4b0_1 *v95;  // x9
    unsigned long v96;  // x10
    uint128_t v97;  // q0
    void* v98;  // x0
    unsigned long long v27;  // x20
    void* v99;  // x19
    uint128_t v100;  // q0
    unsigned long long v28;  // x19
    st_c5b4b0_0 *v0;  // [bp-0xa8]
    void* v1;  // [bp-0xa0]
    st_c5b4b0_0 *v2;  // [bp-0x98]
    void* v3;  // [bp-0x88], Other Possible Types: unsigned long
    uint192_t v4;  // [bp-0x80], Other Possible Types: uint128_t
    unsigned long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    i = a1;
    v31 = a0;
    if (33 <= a1)
    {
        v32 = a3;
        do
        {
            v1 = v31;
            v2 = a2;
            v33 = i >> 3;
            v34 = v31 + 96 * v33;
            v35 = v31 + 168 * v33;
            if (64 > i)
            {
                v36 = (long long)v31[8];
                v37 = (long long)v34[8];
                v38 = v36 - v37;
                v3 = *(long long *)v34;
                v39 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                if (v39)
                    v38 = v39;
                v40 = (long long)v35[8];
                v41 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                v42 = v41;
                if (!v41)
                    v42 = v36 - v40;
                v31 = v1;
                v43 = v31;
                if ((long long)(v42 ^ v38) >= 0)
                {
                    v44 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                    v45 = v44;
                    if (!v44)
                        v45 = v37 - v40;
                    v46 = arm64g_calculate_condition(0x44, v45 ^ v38, 0, 0);
                    if (v46 & 1)
                        v43 = v35;
                    else
                        v43 = v34;
                }
            }
            else
            {
                v43 = sub_c5bee4(v31, v34, v35);
            }
            v32 = (char *)v32 - 1;
            v47 = v43 - v31;
            v0 = i;
            v48 = i * 3;
            if (v2)
            {
                v49 = v31 + v47;
                v50 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                v51 = v50;
                if (!v50)
                    v51 = v2->field_8 - (long long)v49[8];
                if (v51 < 0)
                    goto LABEL_c5b7cc;
                iter = 0;
                v5 = (long long)v31[16];
                v4 = *(int128_t *)v31;
                v53 = *(int128_t *)v49;
                *(long long *)&v31[16] = (long long)v49[16];
                *(uint128_t *)v31 = v53;
                *(unsigned long *)&v49[16] = v5;
                *(uint128_t *)v49 = v4;
                v3 = v31 + 24;
                v4 = CONCAT((long long)v31[40], (int128_t)v31[24]);
                v54 = v48 * 8;
                iter1 = v31 + 48;
                v56 = (long long)v31[8];
                v57 = v54 - 72;
                v58 = v54 - 48;
                do
                {
                    v59 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                    v60 = v59;
                    if (!v59)
                        v60 = v56 - iter1->field_0[1];
                    v61 = v3 + 24 * iter;
                    v62 = v61->field_10;
                    *(uint128_t *)((char *)iter1 - 24) = v61->field_0;
                    *(unsigned long *)((char *)iter1 - 8) = v62;
                    v63 = (uint128_t)iter1->field_0;
                    iter = &iter->padding_0[~v60 >> 63];
                    v61->field_10 = *(long long *)&iter1->field_8;
                    v61->field_0 = v63;
                    iter1 = &iter1->field_10;
                    v64 = v57;
                    v57 = (char *)v57 - 24;
                    k = v58;
                    v58 = (char *)v58 - 24;
                } while (iter1 < v31 + v54);
                do
                {
                    v66 = k;
                    if (!v64)
                        v67 = &v4;
                    else
                        v67 = iter1;
                    v68 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                    v69 = v68;
                    if (!v68)
                        v69 = v56 - v67->field_0[1];
                    v70 = v3 + 24 * iter;
                    v71 = v70->field_10;
                    *(uint128_t *)((char *)iter1 - 24) = v70->field_0;
                    *(unsigned long *)((char *)iter1 - 8) = v71;
                    v72 = (uint128_t)v67->field_0;
                    v70->field_10 = *(long long *)&v67->field_8;
                    v70->field_0 = v72;
                    iter = &iter->padding_0[~v69 >> 63];
                    iter1 = &iter1->field_10;
                    v64 = (char *)v64 - 24;
                    k = (char *)v66 - 24;
                } while (k);
                if (v0 <= iter)
                    goto LABEL_c5b99c;
            }
            else
            {
LABEL_c5b7cc:
                iter2 = 0;
                v77 = v31 + v47;
                v5 = (long long)v31[16];
                v4 = *(int128_t *)v31;
                v78 = *(int128_t *)v77;
                *(long long *)&v31[16] = (long long)v77[16];
                *(uint128_t *)v31 = v78;
                *(unsigned long *)&v77[16] = v5;
                *(uint128_t *)v77 = v4;
                v3 = v31 + 24;
                v4 = CONCAT((long long)v31[40], (int128_t)v31[24]);
                v79 = v48 * 8;
                node = v31 + 48;
                v81 = (long long)v31[8];
                v82 = v79 - 72;
                v83 = v79 - 48;
                do
                {
                    v84 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                    v85 = v84;
                    if (!v84)
                        v85 = node->field_0[1] - v81;
                    v86 = v3 + 24 * iter2;
                    v87 = v86->field_10;
                    *(uint128_t *)((char *)node - 24) = v86->field_0;
                    *(unsigned long *)((char *)node - 8) = v87;
                    v88 = (uint128_t)node->field_0;
                    iter2 = &iter2->padding_0[v85 >> 63];
                    v86->field_10 = *(long long *)&node->field_8;
                    v86->field_0 = v88;
                    node = &node->field_10;
                    v89 = v82;
                    v82 = (char *)v82 - 24;
                    m = v83;
                    v83 = (char *)v83 - 24;
                } while (node < v31 + v79);
                do
                {
                    v91 = m;
                    if (!v89)
                        v92 = &v4;
                    else
                        v92 = node;
                    v93 = (st_c5b4b0_0 *)(unsigned int)_memcmp();
                    v94 = v93;
                    if (!v93)
                        v94 = v92->field_0[1] - v81;
                    v95 = v3 + 24 * iter2;
                    v96 = v95->field_10;
                    *(uint128_t *)((char *)node - 24) = v95->field_0;
                    *(unsigned long *)((char *)node - 8) = v96;
                    v97 = (uint128_t)v92->field_0;
                    v95->field_10 = *(long long *)&v92->field_8;
                    v95->field_0 = v97;
                    iter2 = &iter2->padding_0[v94 >> 63];
                    node = &node->field_10;
                    v89 = (char *)v89 - 24;
                    m = (char *)v91 - 24;
                } while (m);
                if (v0 > iter2)
                {
                    v98 = v1;
                    v99 = v98 + 24 * iter2;
                    v5 = (long long)v98[16];
                    v4 = *(int128_t *)v98;
                    v100 = *(int128_t *)v99;
                    *(long long *)&v98[16] = (long long)v99[16];
                    *(uint128_t *)v98 = v100;
                    *(unsigned long *)&v99[16] = v5;
                    *(uint128_t *)v99 = v4;
                    sub_c5b4b0(v98, iter2, v2, v32); /* do not return */
                }
LABEL_c5b99c:
                __debugbreak();
            }
            a2 = 0;
            v73 = v1;
            v74 = v73 + 24 * iter;
            v5 = (long long)v73[16];
            v4 = *(int128_t *)v73;
            v75 = *(int128_t *)v74;
            *(long long *)&v73[16] = (long long)v74[16];
            *(uint128_t *)v73 = v75;
            *(unsigned long *)&v74[16] = v5;
            *(uint128_t *)v74 = v4;
            i = ~iter + v0;
            v31 = v74 + 24;
        } while (i >= 33);
    }
}
