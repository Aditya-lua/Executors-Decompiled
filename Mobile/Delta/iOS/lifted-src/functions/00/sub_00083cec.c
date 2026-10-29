/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x83cec..0x84274 (1416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_83cec_2 {
    unsigned int field_0;
} st_83cec_2;

typedef struct st_83cec_1 {
    struct st_83cec_2 *field_0;
    struct st_83cec_2 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_83cec_1;

typedef struct st_83cec_3 {
    char padding_0[56];
    unsigned long long field_38;
} st_83cec_3;

typedef struct st_83cec_0 {
    char field_0;
} st_83cec_0;

extern unsigned long long g_e6bc28;
extern unsigned long long g_e6bc30;
extern unsigned long long g_e6bc80;

long long sub_83cec(st_83cec_1 *a0, long long ptr, long long ptr1, unsigned int *a3, st_83cec_3 *a4, long long a5, unsigned long a6, long long a7, unsigned long a8, unsigned int a9, long long a10, long long a11)
{
    unsigned int *i;  // x19
    unsigned int *v28;  // x27
    long long v37;  // x0
    long long v38;  // x28
    long long v39;  // x23
    unsigned long v40;  // x24
    unsigned long v41;  // x0
    unsigned long long v42;  // 4120
    unsigned long long *v43;  // x9
    unsigned long long v44;  // 4115
    unsigned long v45;  // x22
    long long v46;  // x24
    long long v29;  // x20
    long long v47;  // x20
    unsigned long v48;  // x23
    unsigned long v49;  // x26
    unsigned long long v50;  // 4110
    unsigned long v51;  // x26
    unsigned long long v52;  // 4110
    unsigned int *v53;  // x20
    unsigned int v54;  // w0
    unsigned long long v30;  // x25
    unsigned long long v31;  // x28
    unsigned long long v32;  // x23
    unsigned long v33;  // x8
    long long v34;  // x9
    unsigned long v35;  // x9
    unsigned int *v36;  // x25
    long long v0;  // [bp-0x168]
    long long v1;  // [bp-0x150]
    long long v2;  // [bp-0x148]
    unsigned int *v3;  // [bp-0x138]
    unsigned int *v4;  // [bp-0x130]
    unsigned int v5;  // [bp-0x124]
    unsigned long v6;  // [bp-0x118]
    long long node;  // [bp-0x110], Other Possible Types: unsigned long long
    long long v8;  // [bp-0x108]
    unsigned long v9;  // [bp-0xf0]
    unsigned long long v10;  // [bp-0xe8]
    long long v11;  // [bp-0xe0]
    long long v12;  // [bp-0xd8]
    unsigned int v13;  // [bp-0xc0]
    unsigned int v14;  // [bp-0xbc]
    long long iter;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v16;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long v17;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long v18;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long v19;  // [bp-0x98], Other Possible Types: unsigned long long
    st_83cec_0 **v20;  // [bp-0x90], Other Possible Types: char
    st_83cec_0 *v21;  // [bp-0x88]
    st_83cec_0 *v22;  // [bp-0x80], Other Possible Types: unsigned long, unsigned int
    unsigned int v23;  // [bp-0x78]
    st_83cec_0 **v24;  // [bp-0x70], Other Possible Types: char, unsigned int
    char *v25;  // [bp-0x10]
    unsigned int v26;  // [bp+0xc]

    v25 = &a8;
    v5 = v26;
    v21 = &v20;
    v20 = &v21;
    i = a0->field_0;
    v28 = a0->field_8;
    v29 = (long long)(v28 - i) >> 3;
    v19 = a0->field_10;
    v6 = a0->field_18;
    node = a7;
    v30 = a0->field_18 - a0->field_10;
    v2 = a7 + a8;
    v10 = a5 + a6;
    v17 = a0->field_28;
    v18 = a0->field_20;
    if (1340 < a4->field_38)
        v31 = a4->field_38;
    else
        v31 = 1340;
    v16 = a0->field_30;
    v13 = *a3 == 2;
    if (v28 != i)
    {
        v3 = v28;
        v4 = i;
        v22 = &v24;
        v24 = &v22;
        v32 = sub_84b04(v19, v30, ptr1);
        v33 = v32 + sub_8495c(v16, v18, v17, v29, ptr1 + 2064, a3 + 36, a10, a11) + 3;
        if (v6 != v19)
            v34 = v32 * 0x100 / v30;
        else
            v34 = 0x100;
        v12 = v34;
        v35 = (v33 + (v31 >> 1)) / v31;
        if (1 >= v35)
            v35 = 1;
        v11 = (v33 - v32) * 0x100 / v29;
        v28 = v3;
        i = v4;
        if (a8 < v33)
            return 0;
        v9 = v35 - 1;
        v14 = 1;
        v36 = i;
        iter = a5;
        v8 = v33 * 0x100 / v35;
        if (v9 > 0)
        {
            v37 = sub_84548(v36, (long long)(v28 - v36) >> 3, v8, v12, v11, 1);
            if (&v36[2 * v37] != v28)
            {
                v38 = v37;
                v22 = 0;
                v24 = 0;
                v39 = sub_848f0(a0, v36, v38);
                v40 = sub_84a88(a0, v36, v38, v39);
                *(unsigned int *)&v1 = 0;
                *(unsigned int *)&v0 = v14;
                v41 = sub_845c4(ptr1, a3, v36, v38, v19, v39, v18, v17, v16, a4, iter, v10 - iter, CONCAT(v13, a9), v0, &v22, &v24, v1);
                v42 = arm64g_calculate_condition(130, v41, 120, 0);
                if (!(v42 & 1) && v41 && v40 > v41)
                {
                    if (v22)
                        v13 = 0;
                    v16 += v38;
                    v17 += v38;
                    v18 += v38;
                    iter += v41;
                    v19 += v39;
                    node += v40;
                    if (v24)
                        v14 = 0;
                }
                v43 = &g_e6bc80;
                v44 = arm64g_calculate_condition(50, v41, 0x77, 0);
                if (!(v44 & 1))
                    v43 = &g_e6bc30;
                goto *((void *)(*v43));
            }
            else
            {
                goto *((void *)(g_e6bc28));
            }
        }
    }
    else
    {
        v14 = 1;
        iter = a5;
        v36 = i;
    }
    v22 = 0;
    v24 = 0;
    v45 = v19;
    v46 = v6 - v45;
    v47 = (long long)(v28 - v36) >> 3;
    v48 = sub_84a88(a0, v36, v47, v46);
    *(unsigned int *)&v1 = v5;
    *(unsigned int *)&v0 = v14;
    v49 = sub_845c4(ptr1, a3, v36, v47, v45, v46, v18, v17, v16, a4, iter, v10 - iter, CONCAT(v13, a9), v0, &v22, &v24, v1);
    v50 = arm64g_calculate_condition(130, v49, 120, 0);
    if (v50 & 1)
        return v49;
    if (v49)
    {
        v13 = v13;
        if (v48 > v49)
        {
            if (v22)
                v13 = 0;
            iter += v49;
            node += v48;
            if (v24)
                v14 = 0;
            v36 = &v36[2 * v47];
        }
    }
    if (v13)
        _memcpy(ptr1, ptr, 2064);
    if (v14 && sub_84da4(a3 + 36))
        return 0;
    if ((unsigned long long)v2 > (unsigned long long)node)
    {
        v51 = sub_7cda0(iter, v10 - iter, node, v2 - node, v5);
        v52 = arm64g_calculate_condition(130, v51, 120, 0);
        if (v52 & 1)
            return v51;
        iter += v51;
        if (v28 > v36)
        {
            v22 = *(long long *)(ptr + 5616);
            v23 = *(int *)(ptr + 5624);
            if (v36 > i)
            {
                do
                {
                    v53 = i;
                    v54 = sub_83c9c(a0, v53);
                    sub_7f880(&v22, *i, !v54);
                    i = v53 + 2;
                } while (i < v36);
            }
            *(unsigned long *)(ptr1 + 5616) = v22;
            *(unsigned int *)(ptr1 + 5624) = v23;
        }
    }
    return iter - a5;
}
