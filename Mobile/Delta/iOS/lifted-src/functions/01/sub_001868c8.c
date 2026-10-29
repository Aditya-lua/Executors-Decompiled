/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1868c8..0x186aa0 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1868c8_1 {
    char padding_0[8];
    uint128_t *field_8;
    uint128_t *field_10;
    unsigned int field_18;
} st_1868c8_1;

typedef struct st_1868c8_0 {
    char field_0;
} st_1868c8_0;


unsigned long long sub_1868c8(st_1868c8_1 *a0)
{
    uint128_t *v4;  // x24
    uint128_t *v5;  // x22
    unsigned long long i;  // x12
    unsigned long long v15;  // x12
    uint128_t v16;  // q1
    unsigned long long v18;  // x12
    double *v19;  // x10
    unsigned long long *iter;  // x11
    unsigned long long v21;  // x12
    double *v22;  // x10
    unsigned int v6;  // w23
    unsigned long long v24;  // 4112
    char *v25;  // x10
    char *iter1;  // x11
    unsigned long long j;  // x8
    unsigned long long v28;  // x8
    char *v29;  // x10
    unsigned long v31;  // x25
    unsigned long v32;  // x20
    unsigned long long v33;  // x0
    unsigned long long v7;  // w21
    unsigned long long v34;  // x8
    uint128_t *iter2;  // x9
    unsigned long v36;  // x10
    unsigned long long k;  // x11
    unsigned long long v38;  // x11
    uint128_t v39;  // q1
    char *v41;  // x9
    char *v42;  // x10
    unsigned long long v43;  // x8
    unsigned long long v8;  // x20
    char *v44;  // x9
    unsigned long long v46;  // 4119
    uint128_t *v47;  // x9
    uint128_t *v48;  // x10
    unsigned long long v49;  // x8
    uint128_t *v50;  // x9
    unsigned long long v52;  // 4112
    unsigned long long v9;  // x0
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    uint128_t *v12;  // x10
    unsigned long node;  // x11
    st_1868c8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1868c8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    v5 = a0->field_10;
    v6 = a0->field_18;
    v7 = *(int *)&a0[1].padding_0[0];
    v8 = (1 << ((char)v7 & 63)) * 4;
    v9 = sub_3bdf14(v8);
    if (!v9)
        return v9;
    v10 = 0;
    if (1 < v8)
        v11 = v8;
    else
        v11 = 1;
    if (v7 && v9 - (char *)v4 >= 32)
    {
        if (3 > v7)
        {
            v10 = 0;
LABEL_18697c:
            v18 = v10;
            v10 = v11 & 0x3fffffff8;
            v19 = (char *)v4 + v18;
            iter = v9 + v18;
            v21 = v18 - v10;
            do
            {
                v22 = v19 + 1;
                *(double *)iter = *v19;
                iter += 1;
                v24 = arm64g_calculate_condition(18, v21, 8, 0);
                v19 = v22;
                v21 += 8;
            } while (v24 & 1);
            if (v8 == v10)
                goto LABEL_1869c4;
        }
        else
        {
            v10 = v11 & 0x3ffffffe0;
            v12 = v4 + 1;
            node = v9 + 16;
            i = v10;
            do
            {
                v15 = i;
                v16 = *v12;
                *(int128_t *)(node - 16) = *(int128_t *)((char *)v12 - 16);
                *(uint128_t *)node = v16;
                v12 += 2;
                node += 32;
                i = v15 - 32;
            } while (i);
            if (v8 == v10)
                goto LABEL_1869c4;
            if (v11 & 24)
                goto LABEL_18697c;
        }
    }
    v25 = (char *)v4 + v10;
    iter1 = v9 + v10;
    j = v11 - v10;
    do
    {
        v28 = j;
        v29 = v25 + 1;
        *iter1 = *v25;
        iter1 += 1;
        j = v28 - 1;
        v25 = v29;
    } while (j);
LABEL_1869c4:
    a0->field_8 = v9;
    v31 = v6 + 1;
    v32 = (v31 * 16 | v31 >> 60) & 0xffffffff0 & 0xfffffffff;
    v33 = sub_3bdf14(v32);
    if (!v33)
    {
        a0->field_8 = v4;
        return _free(v9);
    }
    if ((unsigned int)v31)
    {
        if (32 > v33 - (char *)v5)
        {
            v34 = 0;
            goto LABEL_1869f4;
        }
        else if (v6)
        {
            v34 = v32 & 0xfffffffe0;
            iter2 = v5 + 1;
            v36 = v33 + 16;
            k = v34;
            do
            {
                v38 = k;
                v39 = *iter2;
                *(int128_t *)(v36 - 16) = *(int128_t *)((char *)iter2 - 16);
                *(uint128_t *)v36 = v39;
                iter2 += 2;
                v36 += 32;
                k = v38 - 32;
            } while (k);
            if (v32 != v34)
            {
                if (v31 & 1)
                    goto LABEL_186a64;
LABEL_1869f4:
                v41 = (char *)v5 + v34;
                v42 = v33 + v34;
                v43 = v34 - v32;
                do
                {
                    v44 = v41 + 1;
                    *v42 = *v41;
                    v42 += 1;
                    v46 = arm64g_calculate_condition(50, v43, 1, 0);
                    v43 += 1;
                    v41 = v44;
                } while (v46 & 1);
            }
        }
        else
        {
            v34 = 0;
LABEL_186a64:
            v47 = (char *)v5 + v34;
            v48 = v33 + v34;
            v49 = v34 - v32;
            do
            {
                v50 = v47 + 1;
                *v48 = *v47;
                v48 += 1;
                v52 = arm64g_calculate_condition(18, v49, 16, 0);
                v49 += 16;
                v47 = v50;
            } while (v52 & 1);
        }
    }
    a0->field_10 = v33;
    return v33;
}
