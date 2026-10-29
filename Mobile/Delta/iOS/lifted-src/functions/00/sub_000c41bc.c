/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc41bc..0xc448c (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c41bc_2 {
    char field_0;
    char field_1;
} st_c41bc_2;

typedef struct st_c41bc_1 {
    char padding_0[2];
    unsigned short field_2;
} st_c41bc_1;

typedef struct st_c41bc_3 {
    struct st_c41bc_4 *field_0;
} st_c41bc_3;

typedef struct st_c41bc_4 {
    struct st_c41bc_3 *field_0;
} st_c41bc_4;

typedef struct st_c41bc_0 {
    char field_0;
} st_c41bc_0;

extern unsigned long long g_cc0ea0;

long long sub_c41bc(char *a0, long long a1, long long a2, long long a3, st_c41bc_1 *a4)
{
    unsigned int v15;  // w22
    long long v16;  // x0
    char v25;  // x17
    unsigned long long *node;  // x0
    char *iter;  // x11
    unsigned long v28;  // x14
    unsigned long long *v29;  // x5
    unsigned long long v30;  // w5
    unsigned long long v31;  // x14
    unsigned int v32;  // w4
    st_c41bc_2 *v33;  // x5
    unsigned int v34;  // w4
    unsigned long long v17;  // 4106
    st_c41bc_2 *v35;  // x5
    unsigned int v36;  // w4
    st_c41bc_2 *v37;  // x5
    unsigned int v38;  // w4
    st_c41bc_2 *v39;  // x5
    unsigned long v40;  // x11
    unsigned long long *v41;  // x12
    unsigned long long *v42;  // x13
    unsigned long long v43;  // x14
    unsigned long long v44;  // x13
    unsigned long long v18;  // x9
    unsigned long long *v45;  // x12
    unsigned int v46;  // w11
    unsigned long long j;  // x9
    unsigned long long v48;  // x9
    unsigned int v49;  // w13
    st_c41bc_2 *v50;  // x12
    char *v19;  // x10
    unsigned long v20;  // x8
    unsigned int i;  // w4
    unsigned long long v22;  // x14
    unsigned long long *v23;  // x1
    char *v24;  // x16
    st_c41bc_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_c41bc_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x80]
    unsigned long long *v4;  // [bp-0x78], Other Possible Types: unsigned long long
    unsigned long long *v5;  // [bp-0x70]
    unsigned long long *v6;  // [bp-0x68]
    st_c41bc_0 **v7;  // [bp-0x60], Other Possible Types: char
    st_c41bc_0 *v8;  // [bp-0x58]
    st_c41bc_4 **v9;  // [bp-0x50]
    st_c41bc_4 **v10;  // [bp-0x48]
    st_c41bc_0 **v11;  // [bp-0x40], Other Possible Types: st_c41bc_4 **
    st_c41bc_0 *v12;  // [bp-0x38], Other Possible Types: st_c41bc_4 **
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v1 = &v0;
    v0 = &v1;
    v15 = a4->field_2;
    v16 = sub_c02c0(&v2, a2, a3);
    v17 = arm64g_calculate_condition(130, v16, 120, 0);
    if (v17 & 1)
        return v16;
    v18 = a1 & ~(a1 >> 63);
    v19 = &a0[v18];
    v20 = a4 + 1;
    v8 = &v7;
    v7 = &v8;
    if (a1 >= 4)
    {
        i = v3;
        v22 = v2;
        v9 = &v10;
        v10 = &v9;
        if (64 >= i)
        {
            v23 = v5;
            v24 = v19 - 3;
            v25 = (char)-v15 & 63;
            node = v4;
            iter = a0;
            do
            {
                if (v6 > node)
                {
                    if (node == v23)
                    {
                        v4 = node;
                        v3 = i;
LABEL_c43e4:
                        v2 = v22;
                        goto LABEL_c43e8;
                    }
                    v28 = i >> 3;
                    v29 = (char *)node - v28;
                    v30 = v29 >= v23;
                    if (v23 <= v29)
                        v31 = v28 & 0xffffffff;
                    else
                        v31 = node - v23 & 0xffffffff;
                    node = (char *)node - v31;
                    v32 = i - (unsigned int)v31 * 8;
                    v22 = *node;
                    if (iter >= v24)
                        goto LABEL_c43b0;
                }
                else
                {
                    v11 = &v12;
                    v12 = &v11;
                    node = (char *)node - (i >> 3);
                    v32 = i & 7;
                    v22 = *node;
                    v30 = 1;
                    if (v24 <= iter)
                        goto LABEL_c43b0;
                }
                if (!v30)
                {
LABEL_c43b0:
                    v4 = node;
                    v3 = v32;
                    goto LABEL_c43e4;
                }
                v33 = v20 + (v22 << ((char)v32 & 63) >> (v25 & 63)) * 2;
                v34 = v32 + v33->field_0;
                *iter = v33->field_1;
                v35 = v20 + (v22 << ((char)v34 & 63) >> (v25 & 63)) * 2;
                v36 = v34 + v35->field_0;
                iter[1] = v35->field_1;
                v37 = v20 + (v22 << ((char)v36 & 63) >> (v25 & 63)) * 2;
                v38 = v36 + v37->field_0;
                iter[2] = v37->field_1;
                v39 = v20 + (v22 << ((char)v38 & 63) >> (v25 & 63)) * 2;
                i = v38 + v39->field_0;
                iter[3] = v39->field_1;
                iter += 4;
                v9 = &v10;
                v10 = &v9;
            } while (i <= 64);
        }
        else
        {
            iter = a0;
        }
        v3 = i;
        v2 = v22;
        v4 = &g_cc0ea0;
    }
    else
    {
        v12 = &v11;
        v11 = &v12;
        v40 = v3;
        if (65 > (unsigned int)v40)
        {
            v41 = v4;
            if (v6 > v41)
            {
                v42 = v5;
                if (v41 == v42)
                    goto LABEL_c43d4;
                v43 = v40 >> 3;
                if ((char *)v41 - v43 < v42)
                    v44 = v41 - v42 & 0xffffffff;
                else
                    v44 = v43 & 0xffffffff;
                v45 = (char *)v41 - v44;
                v4 = v45;
                v46 = (unsigned int)v40 - (unsigned int)v44 * 8;
            }
            else
            {
                v45 = (char *)v41 - (v40 >> 3);
                v4 = v45;
                v46 = (unsigned int)v40 & 7;
            }
            v3 = v46;
            v2 = *v45;
LABEL_c43d4:
            iter = a0;
        }
        else
        {
            v4 = &g_cc0ea0;
            iter = a0;
        }
    }
LABEL_c43e8:
    if (v19 > iter)
    {
        j = &a0[v18] - iter;
        do
        {
            v48 = j;
            v49 = v3;
            v50 = v20 + (v2 << ((char)v49 & 63) >> ((char)-v15 & 63)) * 2;
            v3 = v49 + v50->field_0;
            *iter = v50->field_1;
            iter += 1;
            j = v48 - 1;
        } while (j);
    }
    if (sub_bfed0(&v2))
        return a1;
    return -0x14;
}
