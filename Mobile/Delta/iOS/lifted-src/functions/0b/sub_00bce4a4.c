/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbce4a4..0xbce810 (876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bce4a4_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_bce4a4_0;

typedef struct st_bce4a4_2 {
    unsigned long long field_0;
    struct st_bce4a4_0 *field_8;
    char *field_10;
} st_bce4a4_2;

typedef struct st_bce4a4_1 {
    unsigned int field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
} st_bce4a4_1;

extern long long g_efa270;

unsigned long long sub_bce4a4(char **a0, void* a1, st_bce4a4_2 *a2)
{
    st_bce4a4_0 *v22;  // x20
    char *v23;  // x22
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    st_bce4a4_1 *v34;  // x10
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    char *v39;  // x9
    char *v40;  // x0
    char *v41;  // x0
    char *v24;  // x0
    char *v42;  // x9
    char *v43;  // x8
    st_bce4a4_1 *v44;  // x12
    st_bce4a4_1 *v45;  // x10
    st_bce4a4_1 *v46;  // x9
    st_bce4a4_1 *v47;  // x11
    st_bce4a4_1 *v48;  // x13
    unsigned long v49;  // cc_dep1
    unsigned long v50;  // cc_dep2
    st_bce4a4_1 *v51;  // x10
    char *v25;  // x9
    unsigned long long v52;  // 4110
    unsigned long long v53;  // 4102
    unsigned long long v54;  // 4110
    unsigned long long v55;  // 4102
    unsigned long v56;  // cc_dep1
    char *v57;  // x8
    unsigned long long v58;  // 4105
    unsigned long long v59;  // 4105
    st_bce4a4_1 *v60;  // x26
    st_bce4a4_1 *v61;  // x27
    char *v26;  // x8
    char *v62;  // x1
    char *v63;  // x0
    st_bce4a4_1 *v64;  // x23
    unsigned long long v65;  // 4102
    char *v66;  // x8
    unsigned long long *v67;  // x8
    unsigned long long *v68;  // x9
    unsigned long v69;  // cc_dep2
    char *v70;  // x10
    char *v71;  // x10
    st_bce4a4_1 *v27;  // x12
    unsigned long long *v72;  // x8
    unsigned long long *v73;  // x9
    unsigned long long v74;  // 4110
    unsigned long long v75;  // 4102
    unsigned long long v76;  // 4110
    unsigned long long v77;  // 4102
    unsigned long long v78;  // x0
    st_bce4a4_1 *v28;  // x10
    unsigned long v29;  // x9
    st_bce4a4_1 *v30;  // x11
    st_bce4a4_1 *v31;  // x13
    unsigned long v0;  // [bp-0x148]
    uint128_t v1;  // [bp-0x140]
    unsigned long v2;  // [bp-0x130]
    char *v3;  // [bp-0x128]
    uint128_t v4;  // [bp-0x120]
    char *v5;  // [bp-0x118]
    char *v6;  // [bp-0x110], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x100]
    char *v8;  // [bp-0xf0]
    char v9;  // [bp-0xe8]
    char *v10;  // [bp-0xd0], Other Possible Types: uint128_t, char
    uint128_t v11;  // [bp-0xd0]
    uint128_t v12;  // [bp-0xc0], Other Possible Types: unsigned long
    uint128_t v13;  // [bp-0xc0]
    char *v14;  // [bp-0xb8]
    uint128_t v15;  // [bp-0xb0]
    char v16;  // [bp-0xa0]
    char *v17;  // [bp-0x88]
    char *v18;  // [bp-0x80]
    char *v19;  // [bp-0x78]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    if ((unsigned long long)(long long)a1[8] >= (unsigned long long)*(long long *)a1)
    {
        v1 = *(int128_t *)a1;
        v2 = (long long)a1[16];
        v22 = a2->field_8;
        v23 = a2->field_10;
        v0 = a2->field_0;
        if (*a0)
        {
            v3 = 2;
            v5 = 0;
            v6 = &v1;
            sub_bb17d4(&v10);
        }
        else
        {
            v11 = _INSERT(v10, 0, 0);
            v13 = _INSERT(v12, 8, 0);
        }
        v4 = v11;
        v6 = v12;
        v7 = v15;
        v8 = 2;
        v3 = &v1;
        while (1)
        {
            v24 = sub_bdb2fc(&v4);
            if (!v24)
                break;
            v25 = v3;
            v26 = v8 - 1;
            v8 = v26;
            v27 = (long long)v1;
            v28 = *(long long *)((char *)&v1 + 8);
            v29 = *(long long *)v24;
            v30 = *(long long *)&v24[8];
            if (v28 < v30)
                v31 = v28;
            else
                v31 = v30;
            if ((unsigned long long)*(long long *)v24 >= (unsigned long long)v1)
                v27 = v29;
            if (v27 <= v31)
            {
                v39 = v24;
                if (!v39)
                    break;
LABEL_bce5c4:
                if (!v39)
                    break;
                if (v8)
                {
                    while (1)
                    {
                        v40 = sub_bdb2fc(&v4);
                        v41 = v40;
                        if (!v41)
                            break;
                        v42 = v3;
                        v43 = v8 - 1;
                        v8 = v43;
                        v44 = (long long)v1;
                        v45 = *(long long *)((char *)&v1 + 8);
                        v46 = *(long long *)v40;
                        v47 = *(long long *)&v40[8];
                        if (v45 < v47)
                            v48 = v45;
                        else
                            v48 = v47;
                        if ((unsigned long long)*(long long *)v40 >= (unsigned long long)v1)
                            v44 = v46;
                        v41 = v40;
                        if (v44 <= v48)
                            break;
                        v49 = v45;
                        v50 = v47;
                        if (v45 >= v47)
                            v45 = v47;
                        v51 = (char *)&v45->field_0 + 1;
                        if (v51 < v44)
                        {
                            v52 = arm64g_calculate_condition(132, v49, v50, 0);
                            v53 = arm64g_calculate_condition(20, (v52 & 1 ? v43 : 0x40000000), 0, 0);
                            if (v53 & 1)
                                continue;
                            goto LABEL_bce624;
                        }
                        else
                        {
                            v54 = arm64g_calculate_condition(132, v49, v50, 0);
                            v55 = arm64g_calculate_condition(16, (v54 & 1 ? v43 : 0x40000000), 0, 0);
                            if (!(v55 & 1))
                            {
LABEL_bce624:
                                if (v44 <= v51)
                                    v41 = v40;
                                else
                                    v41 = 0;
                                if (v43)
                                    v41 = v40;
                                break;
                            }
                        }
                    }
                }
                else
                {
                    v41 = 0;
                }
                v56 = v41;
                if (!v41)
                {
                    v57 = v39;
                    v58 = arm64g_calculate_condition(4, v56, 0, 0);
                    if (!(v58 & 1))
                        goto LABEL_bce646;
                }
                else
                {
                    v57 = v41;
                    v59 = arm64g_calculate_condition(4, v56, 0, 0);
                    if (!(v59 & 1))
                    {
LABEL_bce646:
LABEL_bce648:
                        sub_b9ebec();
                        sub_bce810(a0, *(long long *)v57, *(long long *)&v57[8], &v9, &v1, v22, v23);
                        break;
                    }
                }
                goto LABEL_bce648;
            }
            v32 = v28;
            v33 = v30;
            if (v28 >= v30)
                v28 = v30;
            v34 = (char *)&v28->field_0 + 1;
            if (v34 < v27)
            {
                v35 = arm64g_calculate_condition(132, v32, v33, 0);
                v36 = arm64g_calculate_condition(20, (v35 & 1 ? v26 : 0x40000000), 0, 0);
                if (v36 & 1)
                    continue;
                goto LABEL_bce5a4;
            }
            else
            {
                v37 = arm64g_calculate_condition(132, v32, v33, 0);
                v38 = arm64g_calculate_condition(16, (v37 & 1 ? v26 : 0x40000000), 0, 0);
                if (!(v38 & 1))
                {
LABEL_bce5a4:
                    if (v27 <= v34)
                        v39 = v24;
                    else
                        v39 = 0;
                    if (v26)
                        v39 = v24;
                    if (!v24)
                        break;
                    else
                        goto LABEL_bce5c4;
                    goto LABEL_bce5c4;
                }
            }
        }
        v60 = *(unsigned long long *)((void*)&v1 + 8);
        v61 = (char *)&v60->field_0 + 1;
        while (1)
        {
            v62 = *a0;
            if (v62)
            {
                v17 = 0;
                v18 = &v1;
                v19 = 2;
                sub_bb17d4(&v11);
            }
            else
            {
                v10 = 0;
                v14 = 0;
            }
            v63 = sub_bdb228(&v11);
            if (!v63)
                break;
            v64 = *(long long *)v63;
            if (v64 > v60)
            {
                if (v61 < v64)
                    break;
                v65 = arm64g_calculate_condition(20, v64, v61, 0);
                if (!(v65 & 1))
                {
                    v66 = *(long long *)&v62[16];
                    if (*(long long *)&v62[16] != v23)
                        break;
                    if (v23)
                    {
                        v67 = *(long long *)&v62[8] + 8;
                        v68 = &v22->field_8;
                        v69 = v23;
                        v70 = v23;
                        do
                        {
                            v71 = v70;
                            v72 = v67 + 2;
                            v73 = v68 + 2;
                            if (*(int *)((char *)v67 - 8) == *(int *)((char *)v68 - 8))
                            {
                                v74 = arm64g_calculate_condition(4, v66, v69, 0);
                                v75 = arm64g_calculate_condition(20, (v74 & 1 ? *v67 : 0), (v74 & 1 ? *v68 : 0), 0);
                                if (!(v75 & 1))
                                    continue;
                            }
                            else
                            {
                                v76 = arm64g_calculate_condition(4, v66, v69, 0);
                                v77 = arm64g_calculate_condition(16, (v76 & 1 ? *v67 : 0), (v76 & 1 ? *v68 : 0), 0);
                                if (v77 & 1)
                                    goto LABEL_bce754;
                            }
                        } while ((v70 = v71 - 1, v69 = 1, v67 = v72, v68 = v73, v66 = v71, v66 != 1));
                    }
                }
            }
            sub_b9ebec(&v16, *(long long *)&v62[8], *(long long *)&v62[16]);
            sub_bce810(a0, v64, *(long long *)&v63[8], &v16, &v1, v22, v23);
        }
LABEL_bce754:
        v10 = v1;
        v12 = v2;
        v78 = sub_bce9f4(&v17, a0, &v10, a2);
        if (v17 <= 0)
            return v78;
        return _free(v18);
    }
    sub_c73c80("Range start can not be after range endassertion failed: T::is_node_index() != U::is_node_index() || i.index() != j.index()Pre-condition of values_read violated: self.has_block(node)assertion failed: res.1.weight().branch_type == BranchType::Elseassertion failed: res.0.weight().branch_type == BranchType::ThenPre-condition of set_entry violated: self.has_block(new_entry)Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)", 38, &g_efa270);
    __debugbreak();
}
