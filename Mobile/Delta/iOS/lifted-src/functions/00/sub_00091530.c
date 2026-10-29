/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91530..0x91f44 (2580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91530_3 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_91530_3;

typedef struct st_91530_1 {
    char padding_0[8];
    struct st_91530_2 *field_8;
    struct st_91530_2 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[68];
    struct st_91530_2 *field_70;
    char padding_78[136];
    unsigned int field_100;
    char padding_104[4];
    unsigned int field_108;
    char padding_10c[8];
    unsigned int field_114;
} st_91530_1;

typedef struct st_91530_2 {
    unsigned int field_0;
} st_91530_2;

typedef struct st_91530_0 {
    char field_0;
} st_91530_0;

extern unsigned long long g_e6c048;
extern unsigned long long g_e6c0d8;

long long sub_91530(st_91530_1 *a0, unsigned long long a1, st_91530_3 *a2, void* a3, unsigned long long a4, unsigned long long a5)
{
    unsigned int v25;  // w8
    unsigned long v26;  // cc_dep1
    unsigned long long v35;  // 4108
    unsigned long long v36;  // x12
    unsigned long v37;  // x3
    unsigned int *v38;  // x5
    unsigned long v39;  // x9
    unsigned int *v40;  // x6
    unsigned long long v41;  // x7
    unsigned long long v42;  // x4
    unsigned long long v43;  // w10
    unsigned long long v44;  // w11
    unsigned int *v27;  // x19
    unsigned long long v45;  // w8
    unsigned long long v46;  // w12
    unsigned long v47;  // cc_dep1
    unsigned long v48;  // cc_dep2
    unsigned long long v49;  // w23
    unsigned long long v50;  // 4106
    unsigned long long v51;  // 4106
    unsigned long long v52;  // w22
    unsigned long long v53;  // w28
    void* v54;  // x24
    unsigned int v28;  // w8
    void* v55;  // x27
    unsigned long v56;  // x8
    unsigned long long v57;  // x10
    unsigned long long idx;  // x21
    unsigned int v59;  // w16
    unsigned int v60;  // w0
    unsigned long long *v61;  // x1
    char *v62;  // x17
    unsigned long long v63;  // x16
    unsigned int v64;  // w16
    unsigned int v29;  // w9
    unsigned int v65;  // w0
    unsigned long long v66;  // x0
    unsigned long v67;  // cc_dep1
    unsigned long long v68;  // w10
    unsigned long long v69;  // w8
    unsigned long long v70;  // 4112
    unsigned long long v71;  // 4112
    unsigned long long v72;  // 4112
    unsigned long long v73;  // 4108
    unsigned long long v74;  // 4112
    unsigned int v30;  // w11
    unsigned long long v75;  // 4108
    unsigned int v31;  // w14
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4108
    unsigned long long v34;  // 4112
    unsigned long long v0;  // [bp-0x140]
    unsigned int v1;  // [bp-0x134]
    unsigned long long v2;  // [bp-0x130]
    unsigned long long v3;  // [bp-0x12c]
    unsigned long v4;  // [bp-0x120]
    unsigned long long v5;  // [bp-0x118]
    unsigned int *v6;  // [bp-0x110]
    unsigned long v7;  // [bp-0x108]
    unsigned long v8;  // [bp-0x100]
    unsigned long long v9;  // [bp-0xf8]
    unsigned long long v10;  // [bp-0xf0]
    unsigned long long v11;  // [bp-0xd8]
    unsigned long long v12;  // [bp-0xd0]
    unsigned int *v13;  // [bp-0xc8]
    unsigned long long v14;  // [bp-0xc0]
    void* v15;  // [bp-0xb8]
    unsigned long long v16;  // [bp-0xb0]
    unsigned int v17;  // [bp-0xa4]
    unsigned long long v18;  // [bp-0xa0]
    unsigned long long v19;  // [bp-0x98]
    unsigned long long v20;  // [bp-0x90]
    st_91530_0 **v21;  // [bp-0x88], Other Possible Types: char
    st_91530_0 *v22;  // [bp-0x80]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v22 = &v21;
    v21 = &v22;
    v25 = a0->field_114;
    v26 = v25;
    if (1 >= v25)
        v25 = 1;
    v27 = a0->field_8;
    v28 = a3 - v27;
    v29 = v28 + (unsigned int)a4;
    v30 = 1 << ((char)a0->field_100 & 31);
    v31 = a0->field_18;
    if (v30 < v29 - a0->field_1c)
    {
        v32 = arm64g_calculate_condition(131, v26, 1, 0);
        v33 = arm64g_calculate_condition(3, (v32 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v33 & 1))
            goto LABEL_915a2;
LABEL_915a1:
        v36 = v29 - v30 & 0xffffffff;
    }
    else
    {
        v34 = arm64g_calculate_condition(131, v26, 1, 0);
        v35 = arm64g_calculate_condition(0, (v34 & 1 ? a0->field_28 : 0), 0, 0);
        if (v35 & 1)
            goto LABEL_915a1;
LABEL_915a2:
        v36 = a0->field_1c;
    }
    if ((unsigned int)v36 < v31)
        v37 = v31;
    else
        v37 = v36 & 0xffffffff;
    if (v31 <= (unsigned int)v36)
        return sub_8d7f0();
    v1 = v31;
    v38 = a0->field_70;
    v39 = a0->field_108;
    v8 = v25 + 1;
    v9 = v36;
    v40 = a0->field_10;
    v0 = (char *)v40 + v36;
    v14 = (char *)v27 + v37;
    v41 = (char *)v40 + v37;
    v42 = a3 + a4;
    v42 -= 8;
    v43 = (int)a2->field_0;
    v44 = *(int *)((char *)&a2->field_0 + 4);
    v45 = (unsigned int)(v28 - v36);
    if (v44 < v45)
        v46 = 0;
    else
        v46 = v44;
    v3 = v46;
    v10 = a1;
    v19 = 0;
    if (v44 >= v45)
        v44 = 0;
    v47 = v43;
    v48 = v45;
    if (v43 < v45)
    {
        v49 = v43;
        v50 = arm64g_calculate_condition(0x33, v47, v48, 0);
        if (!(v50 & 1))
            goto LABEL_9161e;
LABEL_9161d:
        v43 = 0;
    }
    else
    {
        v49 = 0;
        v51 = arm64g_calculate_condition(0x33, v47, v48, 0);
        if (v51 & 1)
            goto LABEL_9161d;
LABEL_9161e:
    }
    v2 = v43;
    v4 = (char *)v27 + 2;
    v16 = 64 - v39;
    v17 = 32 - v39;
    v11 = v42 - 32;
    v12 = v42;
    v13 = v40;
    v6 = v38;
    v7 = v37;
    v5 = v41;
    v52 = v44;
    v53 = v49;
    v15 = a3;
    v54 = a3;
    v55 = a3 + v8;
    if (v42 > v55 + 1)
    {
        if (6 >= a5)
        {
            if (a5 != 5)
            {
                if (a5 != 6)
                    goto LABEL_916c4;
                v56 = *(long long *)v54;
                v57 = 0xbf9b0000;
            }
            else
            {
                v56 = *(long long *)v54;
                v57 = 0xbb000000;
            }
        }
        else
        {
            if (a5 == 7)
            {
                v56 = *(long long *)v54;
                v57 = 0xbfa56300;
            }
            else if (a5 == 8)
            {
                v56 = *(long long *)v54;
                v57 = 3081069667;
            }
            else
            {
LABEL_916c4:
                idx = 2654435761 * *(int *)v54 >> ((char)v17 & 31);
                goto LABEL_91720;
            }
        }
        idx = ((v57 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v56 >> ((char)v16 & 63);
LABEL_91720:
        v59 = v55 - v27 - v53;
        if (v59 >= (unsigned int)v37)
            v40 = v27;
        if (v53 && (unsigned int)(v37 - v59) >= 4)
            v60 = *(int *)((char *)v40 + v59);
        else
            v60 = *(int *)v55 ^ 1;
        v38[idx] = v54 - v27;
        v61 = &g_e6c048;
        if (*(int *)v55 == v60)
        {
            v62 = (char *)v40 + v59;
            if (v59 < (unsigned int)v37)
                v63 = v41;
            else
                v63 = v42;
            v19 = v63;
            v64 = *((char *)v55 - 1);
            v65 = *(v62 - 1);
            v66 = 4;
            if (v64 == v65)
                v66 = 5;
            v20 = v66;
            v18 = &v62[-1 * (v64 == v65)];
            v61 = &g_e6c0d8;
        }
        goto *((void *)(*v61));
    }
    else
    {
        v67 = v53;
        v68 = v2;
        if (v53)
        {
            v69 = v53;
            v70 = arm64g_calculate_condition(19, v67, 0, 0);
            if (!(v70 & 1))
                goto LABEL_91efe;
LABEL_91efd:
            v72 = arm64g_calculate_condition(19, v67, 0, 0);
            v73 = arm64g_calculate_condition(19, (v72 & 1 ? v68 : 0x40000000), 0, 0);
            if (!(v73 & 1))
                goto LABEL_91f02;
LABEL_91f01:
        }
        else
        {
            v69 = v68;
            v71 = arm64g_calculate_condition(19, v67, 0, 0);
            if (v71 & 1)
                goto LABEL_91efd;
LABEL_91efe:
            v74 = arm64g_calculate_condition(19, v67, 0, 0);
            v75 = arm64g_calculate_condition(16, (v74 & 1 ? v68 : 0x40000000), 0, 0);
            if (v75 & 1)
                goto LABEL_91f01;
LABEL_91f02:
            v68 = v3;
        }
        if (v52)
            v68 = v52;
        *(unsigned int *)&a2->field_0 = v69;
        *(unsigned int *)((char *)&a2->field_0 + 4) = v68;
        return v42 - v15;
    }
}
