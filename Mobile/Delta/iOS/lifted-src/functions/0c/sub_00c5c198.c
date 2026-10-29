/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5c198..0xc5c568 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5c198_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_c5c198_1;

typedef struct st_c5c198_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c5c198_0;

typedef struct st_c5c198_2 {
    uint128_t field_0;
    unsigned long long field_10;
    uint128_t field_18;
    unsigned long long field_28;
    uint128_t field_30;
    unsigned long long field_40;
    uint128_t field_48;
    unsigned long long field_58;
} st_c5c198_2;


void sub_c5c198(st_c5c198_2 *a0, st_c5c198_1 *a1, st_c5c198_1 *a2, unsigned long long a3)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    st_c5c198_1 *i;  // x19
    st_c5c198_2 *v27;  // x21
    unsigned long long v28;  // x20
    st_c5c198_1 *v29;  // x22
    unsigned long long v30;  // x3
    st_c5c198_2 *v31;  // x1
    st_c5c198_2 *v32;  // x2
    unsigned int v33;  // w10
    st_c5c198_2 *v34;  // x9
    unsigned long long v17;  // x26
    st_c5c198_2 *v35;  // x0
    unsigned long long v36;  // x8
    unsigned long long v37;  // x10
    st_c5c198_2 *v38;  // x9
    st_c5c198_1 *iter;  // x8
    uint128_t v40;  // q0
    st_c5c198_2 *v41;  // x9
    unsigned long v42;  // x13
    st_c5c198_0 *iter1;  // x10
    unsigned long v44;  // x11
    unsigned long long v18;  // x25
    st_c5c198_1 *v45;  // x14
    st_c5c198_1 *v46;  // x13
    unsigned long v47;  // x15
    st_c5c198_0 *v48;  // x16
    uint128_t v49;  // q0
    uint128_t v50;  // q0
    st_c5c198_1 *v51;  // x15
    st_c5c198_1 *m;  // x16
    st_c5c198_1 *v53;  // x16
    st_c5c198_0 *v54;  // x12
    unsigned long long v19;  // x24
    unsigned long v55;  // x13
    st_c5c198_0 *v56;  // x13
    uint128_t v57;  // q0
    uint128_t v58;  // q0
    st_c5c198_2 *v59;  // x9
    uint128_t v60;  // q0
    st_c5c198_1 *iter2;  // x1
    st_c5c198_2 *v62;  // x8
    uint128_t v63;  // q0
    st_c5c198_2 *v64;  // x8
    unsigned long long v20;  // x23
    unsigned long v65;  // x12
    st_c5c198_0 *node;  // x9
    unsigned long v67;  // x10
    st_c5c198_1 *v68;  // x14
    st_c5c198_1 *v69;  // x12
    unsigned long v70;  // x13
    st_c5c198_0 *v71;  // x15
    uint128_t v72;  // q0
    uint128_t v73;  // q0
    st_c5c198_1 *v74;  // x13
    unsigned long long v21;  // x22
    st_c5c198_1 *k;  // x15
    st_c5c198_1 *v76;  // x15
    st_c5c198_0 *v77;  // x11
    unsigned long v78;  // x12
    st_c5c198_0 *v79;  // x12
    uint128_t v80;  // q0
    uint128_t v81;  // q0
    st_c5c198_2 *v82;  // x27
    uint128_t v83;  // q0
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    uint192_t v0;  // [bp-0x80], Other Possible Types: uint128_t
    unsigned long v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    i = a1;
    v27 = a0;
    if (33 <= a1)
    {
        v28 = a3;
        v29 = a2;
        do
        {
            v30 = i >> 3;
            v31 = &(&v27->field_0)[6 * v30];
            v32 = (char *)v27 + 168 * v30;
            if (64 > i)
            {
                v33 = v31->field_10 > v27->field_10;
                if (v33 ^ v32->field_10 > v31->field_10)
                    v34 = v32;
                else
                    v34 = v31;
                if (v33 ^ v32->field_10 > v27->field_10)
                    v35 = v27;
                else
                    v35 = v34;
                v28 = (unsigned int)v28 - 1;
                v36 = v35 - v27;
                v37 = i * 3;
                if (!v29)
                    goto LABEL_c5c2ec;
            }
            else
            {
                v28 = (unsigned int)v28 - 1;
                v36 = sub_c5cafc(v27) - (char *)v27;
                v37 = i * 3;
                if (!v29)
                    goto LABEL_c5c2ec;
            }
            v38 = (char *)v27 + v36;
            if (v38->field_10 > v29->field_10)
            {
LABEL_c5c2ec:
                iter2 = 0;
                v62 = (char *)v27 + v36;
                v1 = v27->field_10;
                v0 = v27->field_0;
                v63 = v62->field_0;
                v27->field_10 = v62->field_10;
                v27->field_0 = v63;
                v62->field_10 = v1;
                v62->field_0 = v0;
                v64 = &(&v27->field_10)[1];
                v0 = CONCAT(*(long long *)((char *)&v27->field_18 + 8), *(int128_t *)&(&v27->field_10)[1]);
                v65 = v37 * 8;
                node = &v27->field_28;
                v67 = v27->field_10;
                v68 = v65 - 72;
                v69 = v65 - 48;
                do
                {
                    v70 = node->field_10;
                    v71 = (char *)v64 + 0x18 * iter2;
                    v72 = v71->field_0;
                    *(unsigned long long *)((char *)node - 8) = v71->field_10;
                    *(uint128_t *)((char *)node - 24) = v72;
                    if (v67 > v70)
                        iter2 = &iter2->padding_0[1];
                    v73 = node->field_0;
                    node += 1;
                    v71->field_10 = v70;
                    v71->field_0 = v73;
                    v74 = v68;
                    v68 = (char *)v68 - 24;
                    k = v69;
                    v69 = (char *)v69 - 24;
                } while (node < (char *)v27 + v65);
                do
                {
                    v76 = k;
                    if (!v74)
                        v77 = &v0;
                    else
                        v77 = node;
                    v78 = v77->field_10;
                    v79 = (char *)v64 + 0x18 * iter2;
                    v80 = v79->field_0;
                    *(unsigned long long *)((char *)node - 8) = v79->field_10;
                    *(uint128_t *)((char *)node - 24) = v80;
                    v81 = v77->field_0;
                    v79->field_10 = v77->field_10;
                    v79->field_0 = v81;
                    if (v67 > v78)
                        iter2 = &iter2->padding_0[1];
                    node += 1;
                    v74 = (char *)v74 - 24;
                    k = (char *)v76 - 24;
                } while (k);
                if (i > iter2)
                {
                    v82 = (char *)v27 + 0x18 * iter2;
                    v1 = v27->field_10;
                    v0 = v27->field_0;
                    v83 = v82->field_0;
                    v27->field_10 = v82->field_10;
                    v27->field_0 = v83;
                    v82->field_10 = v1;
                    v82->field_0 = v0;
                    sub_c5c198(v27, iter2, v29, v28); /* do not return */
                }
                goto LABEL_c5c53c;
            }
            else
            {
                iter = 0;
                v1 = v27->field_10;
                v0 = v27->field_0;
                v40 = v38->field_0;
                v27->field_10 = v38->field_10;
                v27->field_0 = v40;
                v38->field_10 = v1;
                v38->field_0 = v0;
                v41 = &(&v27->field_10)[1];
                v0 = CONCAT(*(long long *)((char *)&v27->field_18 + 8), *(int128_t *)&(&v27->field_10)[1]);
                v42 = v37 * 8;
                iter1 = &v27->field_28;
                v44 = v27->field_10;
                v45 = v42 - 72;
                v46 = v42 - 48;
                do
                {
                    v47 = iter1->field_10;
                    v48 = (char *)v41 + 0x18 * iter;
                    v49 = v48->field_0;
                    *(unsigned long long *)((char *)iter1 - 8) = v48->field_10;
                    *(uint128_t *)((char *)iter1 - 24) = v49;
                    if (v44 >= v47)
                        iter = &iter->padding_0[1];
                    v50 = iter1->field_0;
                    iter1 += 1;
                    v48->field_10 = v47;
                    v48->field_0 = v50;
                    v51 = v45;
                    v45 = (char *)v45 - 24;
                    m = v46;
                    v46 = (char *)v46 - 24;
                } while (iter1 < (char *)v27 + v42);
                do
                {
                    v53 = m;
                    if (!v51)
                        v54 = &v0;
                    else
                        v54 = iter1;
                    v55 = v54->field_10;
                    v56 = (char *)v41 + 0x18 * iter;
                    v57 = v56->field_0;
                    *(unsigned long long *)((char *)iter1 - 8) = v56->field_10;
                    *(uint128_t *)((char *)iter1 - 24) = v57;
                    v58 = v54->field_0;
                    v56->field_10 = v54->field_10;
                    v56->field_0 = v58;
                    if (v44 >= v55)
                        iter = &iter->padding_0[1];
                    iter1 += 1;
                    v51 = (char *)v51 - 24;
                    m = (char *)v53 - 24;
                } while (m);
                if (iter >= i)
                {
LABEL_c5c53c:
                    __debugbreak();
                }
            }
            v29 = 0;
            v59 = (char *)v27 + 0x18 * iter;
            v1 = v27->field_10;
            v0 = v27->field_0;
            v60 = v59->field_0;
            v27->field_10 = v59->field_10;
            v27->field_0 = v60;
            v59->field_10 = v1;
            v59->field_0 = v0;
            i += ~iter;
            v27 = &(&v59->field_10)[1];
        } while (i >= 33);
    }
}
