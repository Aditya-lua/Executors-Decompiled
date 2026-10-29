/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3bac4..0xc3bf0c (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3bac4_4 {
    char padding_0[8];
    struct st_c3bac4_2 *field_8;
} st_c3bac4_4;

typedef struct st_c3bac4_0 {
    char *field_0;
    char padding_8[8];
    struct st_c3bac4_1 *field_10;
} st_c3bac4_0;

typedef struct st_c3bac4_2 {
    char padding_0[24];
    struct st_c3bac4_3 *field_18;
} st_c3bac4_2;

typedef struct st_c3bac4_3 {
    unsigned long long field_0;
} st_c3bac4_3;

typedef struct st_c3bac4_1 {
    char field_0;
} st_c3bac4_1;


unsigned long long sub_c3bac4(st_c3bac4_0 *a0, st_c3bac4_4 *a1)
{
    unsigned long long v36;  // x20
    unsigned long long v37;  // x23
    unsigned int v46;  // w15
    unsigned int v47;  // w14
    unsigned int v48;  // w15
    unsigned int v50;  // w13
    unsigned long long v51;  // x4
    unsigned long long v52;  // x0
    char *v53;  // x8
    unsigned long long v54;  // x9
    unsigned long long v55;  // x10
    char *v38;  // x21
    unsigned long long v56;  // x24
    unsigned long long v57;  // x5
    unsigned long long v58;  // x7
    char *iter;  // x2
    void* v60;  // x3
    unsigned long long v61;  // x27
    unsigned long long v62;  // x6
    unsigned long long v63;  // x1
    unsigned long long v64;  // x25
    unsigned long long v65;  // x26
    char v39;  // x12
    char v66;  // x27
    unsigned long long v67;  // x28
    unsigned long long v68;  // x27
    unsigned long long v69;  // x28
    unsigned long long v70;  // x6
    unsigned long long v71;  // 4111
    unsigned long long v72;  // x26
    unsigned long long v73;  // x12
    unsigned long long v74;  // 4107
    unsigned long long v75;  // x1
    char *v40;  // x22
    unsigned long v76;  // x0
    unsigned long long v77;  // x9
    unsigned long v78;  // cc_dep1
    unsigned long v79;  // cc_dep2
    unsigned long long v80;  // 4113
    unsigned long long v81;  // 4110
    unsigned long long v82;  // 4102
    unsigned long long v83;  // 4110
    unsigned long long v84;  // 4102
    unsigned long long idx;  // x0
    unsigned long long index;  // x9
    unsigned long long v86;  // x12
    void* v87;  // x7
    void* v88;  // x25
    unsigned long long v90;  // x4
    unsigned long long v91;  // x12
    unsigned long long v92;  // x4
    unsigned long long v93;  // x4
    void* v94;  // x20
    unsigned long long v95;  // x24
    char *node;  // x11
    unsigned long long v97;  // x0
    char *v43;  // x14
    unsigned long v44;  // x15
    unsigned int v45;  // w13
    unsigned long long *v0;  // [bp-0x278]
    unsigned long long v1;  // [bp-0x270]
    unsigned long long v2;  // [bp-0x260]
    unsigned long long v3;  // [bp-0x250]
    unsigned long long v4;  // [bp-0x240]
    unsigned long long v5;  // [bp-0x230]
    unsigned long long v6;  // [bp-0x220]
    unsigned long long v7;  // [bp-0x210]
    unsigned long long v8;  // [bp-0x200]
    unsigned long long v9;  // [bp-0x1f0]
    unsigned long long v10;  // [bp-0x1e0]
    unsigned long long v11;  // [bp-0x1d0]
    unsigned long long v12;  // [bp-0x1c0]
    unsigned long long v13;  // [bp-0x1b0]
    unsigned long long v14;  // [bp-0x1a0]
    unsigned long long v15;  // [bp-0x190]
    unsigned long long v16;  // [bp-0x180]
    unsigned long long v17;  // [bp-0x170]
    unsigned long long v18;  // [bp-0x160]
    unsigned long long v19;  // [bp-0x150]
    unsigned long long v20;  // [bp-0x140]
    unsigned long long v21;  // [bp-0x130]
    unsigned long long v22;  // [bp-0x120]
    unsigned long long v23;  // [bp-0x110]
    unsigned long long v24;  // [bp-0x100]
    unsigned long long v25;  // [bp-0xf0]
    unsigned long long v26;  // [bp-0xe0]
    unsigned long long v27;  // [bp-0xd0]
    unsigned long long v28;  // [bp-0xc0]
    unsigned long long v29;  // [bp-0xb0]
    unsigned long long v30;  // [bp-0xa0]
    unsigned long long v31;  // [bp-0x90]
    unsigned long long v32;  // [bp-0x80]
    unsigned int v33;  // [bp-0x6c]
    char *v34;  // [bp-0x10]
    char v35;  // [bp+0x0]

    v34 = &v35;
    v31 = 0;
    v32 = 0;
    v29 = 0;
    v30 = 0;
    v27 = 0;
    v28 = 0;
    v25 = 0;
    v26 = 0;
    v23 = 0;
    v24 = 0;
    v21 = 0;
    v22 = 0;
    v19 = 0;
    v20 = 0;
    v17 = 0;
    v18 = 0;
    v15 = 0;
    v16 = 0;
    v13 = 0;
    v14 = 0;
    v11 = 0;
    v12 = 0;
    v9 = 0;
    v10 = 0;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v6 = 0;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v36 = a0[1].field_0;
    if (v36)
    {
        v37 = (unsigned long long)a0->padding_8;
        v38 = a0->field_10;
        v39 = *v38;
        v40 = a0->field_0;
        if (a0->padding_8)
        {
            index = 0;
            node = a0->field_0;
            do
            {
                v43 = node;
                v44 = *v43;
                v45 = (unsigned int)v44 & 0xff;
                if (!(v44 >> 31 & 1))
                {
                    node = v43 + 1;
                }
                else
                {
                    v46 = node[1] & 63;
                    if (v45 >= 224)
                    {
                        v47 = v45 & 31;
                        v48 = node[2] & 63 | v46 * 64;
                        if (v45 >= 240)
                        {
                            v50 = node[3] & 63 | v48 * 64;
                            v45 = v50 & 0xffe00000 | (v50 & 0xffe3ffff | __ROL__(v47, 18) & 0x1c0000) & 0x1fffff;
                            node += 4;
                        }
                        else
                        {
                            node += 3;
                            v45 = v48 | v47 * 0x1000;
                        }
                    }
                    else
                    {
                        node += 2;
                        v45 = (v46 & 63 | __ROL__(v45, 6) & 1984) & 0x7ff;
                    }
                }
                if (index == 128)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
                v51 = index + 1;
                *(unsigned int *)((char *)&v1 + 4 * index) = v45;
                index = v51;
            } while (node != &v40[v37]);
        }
        else
        {
            v51 = 0;
        }
        v52 = 0;
        v53 = &v38[v36];
        v54 = 128;
        if (128 < v51)
            v55 = v51;
        else
            v55 = 128;
        v56 = v51 * 4 + 4;
        v57 = 700;
        v58 = 72;
        iter = v38;
        v60 = (char *)&v1 + 4 * v51;
        while (1)
        {
            v61 = 0;
            v62 = 0;
            iter += 1;
            v63 = 36;
            v64 = 1;
            while (1)
            {
                v65 = v63 - v58;
                if (v63 < v58)
                    v65 = 0;
                if (1 >= v65)
                    v65 = 1;
                if (v65 >= 26)
                    v65 = 26;
                if (!(v61 & 1))
                {
                    v66 = v39;
                }
                else if (iter != v53)
                {
                    v66 = *iter;
                    iter += 1;
                }
                else
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
                v67 = v66 - 97;
                if (v67 >= 26)
                {
                    if (9 >= v66 - 48)
                    {
                        v67 = v66 - 22;
                    }
                    else
                    {
                        v0 = a1->field_8->field_18;
                        a1->field_8->field_18();
                    }
                }
                v68 = v67;
                if (v68 * v64 > 0xffffffffffffffff)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
                v69 = v64 * v68;
                v70 = v69 + v62;
                v71 = arm64g_calculate_condition(0x22, v69, v62, 0);
                if (v71 & 1)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
                if (v68 < v65)
                    break;
                v72 = 36 - v65;
                if (v64 * v72 > 0xffffffffffffffff)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
                v64 *= v72;
                v63 += 36;
                v61 = 1;
                v62 = v70;
            }
            v73 = v70 + v52;
            v74 = arm64g_calculate_condition(0x22, v70, v52, 0);
            if (v74 & 1)
            {
                v0 = a1->field_8->field_18;
                a1->field_8->field_18();
            }
            v75 = v51 + 1;
            v76 = v73 / v75;
            v77 = v76 + v54;
            v78 = v76;
            v79 = v54;
            v80 = arm64g_calculate_condition(0x22, v76, v54, 0);
            if (v80 & 1)
            {
                v0 = a1->field_8->field_18;
                a1->field_8->field_18();
            }
            if (v77 > 0xffffffff)
            {
                v0 = a1->field_8->field_18;
                a1->field_8->field_18();
            }
            if (0xffef0800 <= ((unsigned int)v77 ^ 0xd800) - 0x110000)
            {
                v81 = arm64g_calculate_condition(0x22, v78, v79, 0);
                v82 = arm64g_calculate_condition(4, (v81 & 1 ? v51 : 0x40000000), (v81 & 1 ? v55 : 0), 0);
                if (v82 & 1)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
            }
            else
            {
                v83 = arm64g_calculate_condition(0x22, v78, v79, 0);
                v84 = arm64g_calculate_condition(0, (v83 & 1 ? v51 : 0x40000000), (v83 & 1 ? v55 : 0), 0);
                if (v84 & 1)
                {
                    v0 = a1->field_8->field_18;
                    a1->field_8->field_18();
                }
            }
            idx = v73 - v75 * v76;
            v86 = v51;
            v87 = v60;
            if (v86 > idx)
            {
                do
                {
                    v86 -= 1;
                    v88 = v87;
                    *(int *)v87 = *(int *)((char *)v88 - 4);
                    v87 = v88 - 4;
                } while (idx < v86);
            }
            else if (128 <= idx)
            {
                sub_c73c94();
            }
            *(unsigned int *)((char *)&v1 + 4 * idx) = v77;
            if (iter == v53)
                break;
            v90 = v70 / v57 / v75 + v70 / v57;
            if (v90 >= 456)
            {
                v91 = 0;
                do
                {
                    v92 = v90;
                    v93 = v92 / 35;
                    v91 += 36;
                    v90 = v93;
                } while (1994 < v92 >> 3);
            }
            else
            {
                v91 = 0;
                v93 = v90;
            }
            v52 = idx + 1;
            v58 = v91 + (__ROL__((unsigned int)v93 * 9, 2) & 0xfffc & 0xffff) / ((unsigned int)v93 + 38 & 0xffff);
            v39 = *iter;
            v56 += 4;
            v60 += 4;
            v51 = v75;
            v57 = 2;
            v54 = v77;
        }
        if (128 <= v51)
        {
            sub_c73bb0(0);
            sub_c73c94();
        }
        v94 = &v1;
        while (1)
        {
            v95 = v56;
            v33 = *(int *)v94;
            v97 = sub_bee42c(&v33, a1);
            if ((unsigned int)v97)
                return v97;
            v56 = v95 - 4;
            v94 += 4;
            if (v95 == 4)
                return v97;
        }
    }
    else
    {
        goto *((void *)(a1->field_8->field_18));
    }
}
