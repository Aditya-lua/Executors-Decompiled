/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5b9a0..0xc5bd88 (1000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5b9a0_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c5b9a0_0;


void sub_c5b9a0(st_c5b9a0_0 *a0, unsigned long long a1)
{
    st_c5b9a0_0 *v9;  // x26
    unsigned long long k;  // x24
    unsigned long v19;  // x23
    unsigned long v20;  // x27
    unsigned long long v21;  // w0
    unsigned long long v22;  // x8
    unsigned long v23;  // x22
    unsigned long long v24;  // x9
    unsigned long long *v25;  // x8
    void* v26;  // x10
    unsigned long long v27;  // x20
    unsigned long long v28;  // w0
    unsigned long long v11;  // x8
    unsigned long long v29;  // x8
    unsigned long long j;  // x26
    unsigned long long v31;  // x27
    unsigned long long v32;  // x22
    void* iter;  // x20
    unsigned long long v34;  // x8
    st_c5b9a0_0 *v35;  // x9
    void* v36;  // x21
    unsigned long v37;  // x23
    unsigned long v38;  // x25
    void* node;  // x19
    unsigned long long v39;  // w0
    unsigned long long v40;  // x8
    unsigned long long v41;  // x28
    void* iter1;  // x21
    void* v43;  // x8
    unsigned long long v44;  // w0
    unsigned long long l;  // x8
    void* v46;  // x8
    unsigned long long v47;  // x27
    void* iter2;  // x22
    unsigned long long v13;  // x8
    void* v49;  // x26
    void* v50;  // x28
    st_c5b9a0_0 *v51;  // x23
    st_c5b9a0_0 *v52;  // x21
    unsigned long long v53;  // w0
    unsigned long v54;  // x8
    unsigned long long v55;  // 4109
    void* v56;  // x9
    unsigned long long v57;  // w0
    unsigned long v58;  // x8
    unsigned long long i;  // x25
    unsigned long v59;  // cc_op
    unsigned long v60;  // cc_dep1
    unsigned long v61;  // cc_dep2
    unsigned long long v62;  // 4109
    void* v63;  // x9
    long long v64;  // x8
    void* v65;  // x8
    void* v66;  // x9
    void* v67;  // x10
    unsigned long long v68;  // x10
    unsigned long long v15;  // x21
    unsigned long long v69;  // 4121
    unsigned long long v70;  // 4108
    unsigned long long v71;  // 4108
    unsigned long long v72;  // 4110
    unsigned long long v73;  // 4106
    unsigned long long v74;  // 4110
    unsigned long long v75;  // 4106
    unsigned long long v16;  // x8
    st_c5b9a0_0 *v17;  // x9
    void* v18;  // x20
    unsigned long long v0;  // [bp-0x520]
    unsigned long v1;  // [bp-0x518]
    unsigned long long v2;  // [bp-0x510]
    st_c5b9a0_0 *v3;  // [bp-0x508]
    unsigned long long v4;  // [bp-0x500]
    st_c5b9a0_0 *v5;  // [bp-0x4f8]
    uint192_t v6;  // [bp-0x4f0], Other Possible Types: char
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v0 = 0;
    if (a1 < 2)
        return;
    v9 = a0;
    k = a1 >> 1;
    v11 = k * 24;
    node = &(&v6)[v11];
    v3 = (char *)a0 + v11;
    if (a1 >= 8)
    {
        sub_c5c018(v9, &v6);
        sub_c5c018(v3, node);
        v13 = 4;
    }
    else
    {
        v6 = CONCAT(v9->field_10, v9->field_0);
        *(uint128_t *)node = v3->field_0;
        *(unsigned long long *)&node[16] = v3->field_10;
        v13 = 1;
    }
    v4 = a1 - k;
    v5 = v9;
    v0 = a1;
    v1 = v13 * 3;
    v2 = v13;
    if (k > v13)
    {
        i = v2;
        v15 = v1 * 8;
        do
        {
            v16 = i * 24;
            v17 = (char *)v9 + v16;
            v18 = (char *)&v6 + v16;
            *(uint128_t *)v18 = v17->field_0;
            *(unsigned long long *)&v18[16] = v17->field_10;
            v19 = *(long long *)v18;
            v20 = (long long)v18[8];
            v21 = (unsigned int)_memcmp();
            v22 = v21;
            if (!v21)
                v22 = v20 - *(long long *)((char *)v18 - 16);
            if ((long long)v22 < 0)
            {
                v23 = (long long)v18[16];
                v24 = v15;
                while (1)
                {
                    v25 = &v6;
                    v26 = (char *)&v6 + v24;
                    *(int128_t *)v26 = *(int128_t *)((char *)v26 - 24);
                    *(long long *)&v26[16] = *(long long *)((char *)v26 - 8);
                    v27 = v24 - 24;
                    if (v24 == 24)
                        break;
                    v28 = (unsigned int)_memcmp();
                    v29 = v28;
                    if (!v28)
                        v29 = v20 - *(long long *)((char *)&v1 + v24);
                    v24 = v27;
                    if ((long long)v29 >= 0)
                    {
                        v25 = (char *)&v6 + v27;
                        break;
                    }
                }
                v9 = v5;
                *v25 = v19;
                v25[1] = v20;
                v25[2] = v23;
            }
            i += 1;
            v15 += 24;
        } while (i != k);
    }
    j = v2;
    if (v4 > j)
    {
        v31 = v1 * 8;
        v32 = 24;
        iter = node;
        do
        {
            v34 = j * 24;
            v35 = (char *)v3 + v34;
            v36 = node + v34;
            *(uint128_t *)v36 = v35->field_0;
            *(unsigned long long *)&v36[16] = v35->field_10;
            v37 = *(long long *)v36;
            v38 = (long long)v36[8];
            v39 = (unsigned int)_memcmp();
            v40 = v39;
            if (!v39)
                v40 = v38 - *(long long *)((char *)v36 - 16);
            if ((long long)v40 < 0)
            {
                v1 = (long long)v36[16];
                v2 = j;
                v41 = v32;
                iter1 = iter;
                do
                {
                    v43 = iter1 + v31;
                    *(int128_t *)v43 = *(int128_t *)((char *)v43 - 24);
                    *(long long *)&v43[16] = *(long long *)((char *)v43 - 8);
                    if (v31 == v41)
                    {
                        v46 = node;
                        goto LABEL_c5bb54;
                    }
                    v44 = (unsigned int)_memcmp();
                    l = v44;
                    if (!v44)
                        l = v38 - *(long long *)((char *)v43 - 40);
                    v41 += 24;
                    iter1 -= 24;
                } while ((long long)l < 0);
                v46 = iter1 + v31;
LABEL_c5bb54:
                *(unsigned long *)v46 = v37;
                *(unsigned long *)&v46[8] = v38;
                j = v2;
                *(unsigned long *)&v46[16] = v1;
            }
            j += 1;
            v32 -= 24;
            iter += 24;
        } while (j != v4);
    }
    v47 = 0xffffffffffffffe8 + 24 * v0;
    iter2 = &v6;
    v49 = (char *)&v6 + v47;
    v50 = node - 24;
    v51 = v5;
    do
    {
        v52 = (char *)v5 + v47;
        v53 = (unsigned int)_memcmp();
        v54 = v53;
        if (!v53)
            v54 = (long long)node[8] - (long long)iter2[8];
        v55 = arm64g_calculate_condition(194, v54, 1, 0);
        if (v55 & 1)
            v56 = iter2;
        else
            v56 = node;
        v51->field_0 = *(int128_t *)v56;
        v51->field_10 = (long long)v56[16];
        node += (unsigned int)(v54 >> 63) * 24;
        iter2 += ~(unsigned int)((long long)(v54) >> 63) & 24;
        v51 += 1;
        v57 = (unsigned int)_memcmp();
        v58 = v57;
        if (!v57)
            v58 = (long long)v49[8] - (long long)v50[8];
        v59 = 2;
        v60 = v58;
        v61 = 1;
        v62 = arm64g_calculate_condition(194, v58, 1, 0);
        if (v62 & 1)
            v63 = v49;
        else
            v63 = v50;
        v52->field_0 = *(int128_t *)v63;
        v52->field_10 = (long long)v63[16];
        v64 = (long long)(v58) >> 63;
        v49 += (int)~v64 * 24;
        v50 += (int)v64 * 24;
        v47 -= 24;
        k -= 1;
    } while (k);
    v65 = v50 + 24;
    v66 = v49 + 24;
    if (v0 & 1)
    {
        v59 = 4;
        v60 = iter2;
        v61 = v65;
        if (iter2 < v65)
            v67 = iter2;
        else
            v67 = node;
        v51->field_0 = *(int128_t *)v67;
        v51->field_10 = (long long)v67[16];
        v68 = 24;
        v69 = arm64g_calculate_condition(52, v60, v61, 0);
        if (v69 & 1)
        {
            iter2 += 24;
            v70 = arm64g_calculate_condition(52, v60, v61, 0);
            if (!(v70 & 1))
                goto LABEL_c5bd2a;
LABEL_c5bd29:
            v68 = 0;
        }
        else
        {
            v71 = arm64g_calculate_condition(52, v60, v61, 0);
            if (v71 & 1)
                goto LABEL_c5bd29;
LABEL_c5bd2a:
        }
        node += v68;
    }
    if (iter2 == v65)
    {
        v72 = arm64g_calculate_condition(v59, v60, v61, 0);
        v73 = arm64g_calculate_condition(20, (v72 & 1 ? node : 0), (v72 & 1 ? v66 : 0), 0);
        if (!(v73 & 1))
            return;
    }
    else
    {
        v74 = arm64g_calculate_condition(v59, v60, v61, 0);
        v75 = arm64g_calculate_condition(16, (v74 & 1 ? node : 0), (v74 & 1 ? v66 : 0), 0);
        if (!(v75 & 1))
            return;
    }
    sub_c73e74();
    __debugbreak();
}
