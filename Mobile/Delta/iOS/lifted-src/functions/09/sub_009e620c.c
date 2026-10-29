/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e620c..0x9e6378 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e620c_0 {
    struct st_9e620c_1 *field_0;
    struct st_9e620c_1 *field_8;
} st_9e620c_0;

typedef struct st_9e620c_3 {
    char padding_0[1];
    unsigned long long field_1;
} st_9e620c_3;

typedef struct st_9e620c_2 {
    struct st_9e620c_1 *field_0;
    int field_8;
    int field_c;
} st_9e620c_2;

typedef struct st_9e620c_1 {
    unsigned long long field_0;
} st_9e620c_1;


int sub_9e620c(st_9e620c_1 **a0, st_9e620c_2 *a1, st_9e620c_2 *a2, st_9e620c_0 *a3)
{
    unsigned long long *v2;  // w20
    unsigned long long *v3;  // x0
    unsigned long long v12;  // x16
    unsigned long long v13;  // x17
    unsigned long v14;  // x0
    unsigned long v15;  // x1
    unsigned long long *i;  // x3
    unsigned long long *iter;  // x2
    unsigned long long *v18;  // x3
    unsigned long long v19;  // x4
    unsigned long long v20;  // x5
    unsigned long long *v21;  // x13
    unsigned long long *iter1;  // x8
    unsigned long long *v22;  // x12
    unsigned long long *v23;  // x14
    unsigned long long *node;  // x15
    unsigned long long *v25;  // x16
    unsigned long long *v26;  // x16
    unsigned long long *v27;  // x14
    unsigned long long v28;  // x17
    unsigned long long v29;  // x0
    unsigned long long v30;  // 4137
    st_9e620c_3 *v31;  // x1
    unsigned long long *v5;  // x12
    unsigned long long v32;  // 4149
    unsigned long long *v33;  // x11
    unsigned long long *v34;  // x9
    unsigned long long *v35;  // x12
    unsigned long long v36;  // x13
    unsigned long long v37;  // x14
    unsigned long long v38;  // 4137
    st_9e620c_3 *v39;  // x15
    unsigned long long v40;  // 4149
    unsigned long long *v6;  // x9
    unsigned long long *v7;  // x11
    unsigned long long *v8;  // x14
    unsigned long long *v9;  // x10
    unsigned long long *v10;  // x15
    unsigned long long *v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long long *)(int)a3->field_8;
    v3 = sub_9e4cdc();
    if (v3)
    {
        iter1 = *a0;
        if (!a1->field_0)
            v5 = iter1;
        else
            v5 = a1->field_0;
        v6 = a2->field_0;
        if (!a2->field_0)
            v6 = iter1;
        if (v2)
        {
            v7 = 0;
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = v2;
            v12 = 1 - a2->field_c;
            v13 = 1 - a1->field_c;
            v14 = -a2->field_8;
            v15 = -a1->field_8;
            i = v11;
            iter = iter1;
            do
            {
                v18 = i;
                v19 = *(long long *)((char *)v5 + 0x8 * v8) & (long long)(v15) >> 63;
                v20 = *(long long *)((char *)v6 + 0x8 * v10) & (long long)(v14) >> 63;
                *iter = v19 + (char *)v7 - v20;
                iter += 1;
                v8 = (char *)v8 + (v13 >> 63);
                if (v19 != v20)
                    v9 = v20 > v19;
                v10 = (char *)v10 + (v12 >> 63);
                v7 = -v9;
                v12 += 1;
                v13 += 1;
                v14 += 1;
                v15 += 1;
                i = (char *)v18 - 1;
            } while (i);
            v21 = 0;
            v22 = a3->field_0;
            v23 = v22;
            node = iter1;
            v25 = v11;
            do
            {
                v26 = v25;
                v27 = v23 + 1;
                v28 = *v23 & v7;
                v29 = v28 + (char *)v21;
                v30 = arm64g_calculate_condition(50, v29, *node, 0);
                v31 = !(v30 & 1);
                *node = v29 + *node;
                node += 1;
                v32 = arm64g_calculate_condition(50, v28, v21, 0);
                if (v32 & 1)
                    v21 = v31;
                else
                    v21 = (v31->padding_0)[1];
            } while ((v25 = (char *)v26 - 1, v23 = v27, v26 != 1));
            v33 = 0;
            do
            {
                v34 = v11;
                v35 = v22 + 1;
                v36 = *v22 & v21 - v9;
                v37 = v36 + (char *)v33;
                v38 = arm64g_calculate_condition(50, v37, *iter1, 0);
                v39 = !(v38 & 1);
                *iter1 = v37 + *iter1;
                iter1 += 1;
                v40 = arm64g_calculate_condition(50, v36, v33, 0);
                if (v40 & 1)
                    v33 = v39;
                else
                    v33 = (v39->padding_0)[1];
            } while ((v11 = (char *)v34 - 1, v22 = v35, v34 != 1));
        }
        *(unsigned int *)&a0[1] = (unsigned int)v2;
        *(unsigned int *)&a0[2] = 0;
        v3 = 1;
    }
    return (unsigned int)v3;
}
