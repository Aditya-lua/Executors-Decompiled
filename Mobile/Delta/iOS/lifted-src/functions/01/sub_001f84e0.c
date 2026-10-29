/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f84e0..0x1f8728 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f84e0_2 {
    char padding_0[20];
    unsigned int field_14;
} st_1f84e0_2;

typedef struct st_1f84e0_3 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1f84e0_3;

typedef struct st_1f84e0_1 {
    char padding_0[20];
    unsigned int field_14;
    unsigned long long field_18;
    unsigned long long field_20;
} st_1f84e0_1;

typedef struct st_1f84e0_0 {
    char field_0;
} st_1f84e0_0;


long long sub_1f84e0(unsigned long a0, unsigned long long *a1)
{
    unsigned long index;  // x1
    unsigned long long idx;  // x13
    unsigned long v18;  // x15
    unsigned int v19;  // w16
    unsigned long long v20;  // w17
    st_1f84e0_2 *v21;  // x14
    unsigned long v22;  // x17
    unsigned long long v23;  // x8
    unsigned long long idx1;  // x9
    unsigned long long v25;  // x11
    unsigned long idx2;  // x12
    st_1f84e0_3 *v27;  // x12
    unsigned long long v10;  // x11
    st_1f84e0_3 *v28;  // x13
    uint128_t v29;  // q0
    uint128_t v30;  // q1
    unsigned long long v11;  // w10
    unsigned int v12;  // w8
    unsigned long long v13;  // x14
    st_1f84e0_1 *v14;  // x13
    unsigned long v15;  // x14
    unsigned long v16;  // x16
    unsigned long long v17;  // x14
    st_1f84e0_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1f84e0_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    *(unsigned int *)&v2 = 0;
    sub_1fbcf0(&v3, a1[1] + 1, &v2);
    index = a1[1];
    *(unsigned int *)(v3 + index * 4) = index;
    if (index)
    {
        idx = 0;
        v10 = 0;
        v11 = 0;
        v12 = 1;
        do
        {
            v13 = v3;
            if (*(int *)(v13 + idx * 4))
            {
                v11 -= 1;
                continue;
            }
            *(unsigned int *)(v13 + idx * 4) = (unsigned int)v10 + v11;
            v14 = *a1 + 40 * idx;
            v15 = v14->field_14;
            if (!(v15 >> 2 & 1))
                continue;
            if (!(v15 >> 4 & 1))
            {
                v16 = v14->field_18;
                v14->field_14 = (unsigned int)v15 ^ 4;
                if (!(v15 >> 5 & 1))
                    goto LABEL_1f85d4;
            }
            else
            {
                v15 = (unsigned int)v15 & 0xffffffef;
                v14->field_14 = v15;
                v16 = v14->field_20;
                v14->field_14 = (unsigned int)v15 ^ 4;
                if (!(v15 >> 5 & 1))
                    goto LABEL_1f85d4;
            }
            v14->field_14 = (unsigned int)v15 ^ 36;
            v14->field_20 = 0;
            index = a1[1];
LABEL_1f85d4:
            v17 = v10 + v16;
            if (index > v17)
            {
                v18 = *a1;
                v19 = v12 + (unsigned int)v16;
                v20 = v11 + 1;
                do
                {
                    v11 = v20;
                    *(unsigned int *)(v3 + v17 * 4) = (unsigned int)v10 + v20;
                    v21 = v18 + 40 * v17;
                    v22 = v21->field_14;
                    if (v22 >> 3 & 1)
                    {
                        v21->field_14 = (unsigned int)v22 & 0xfffffff7;
                        break;
                    }
                } while ((v17 = v19, v19 += 1, v20 = v11 + 1, v17 < index));
            }
        } while ((idx = (unsigned int)v10 + 1, v12 += 1, v10 = idx, index > idx));
    }
    sub_1ecc38(&v2);
    if (a1[1])
    {
        v23 = 0;
        idx1 = 0;
        v25 = v3;
        do
        {
            idx2 = *a1 + v23;
            if (*(long long *)(idx2 + 24))
            {
                *(unsigned long long *)(idx2 + 24) = *(int *)(v25 + idx1 * 4 + *(long long *)(idx2 + 24) * 4) - *(int *)(v25 + idx1 * 4);
                v25 = v3;
            }
            if (*(long long *)(idx2 + 32))
            {
                *(unsigned long long *)(idx2 + 32) = *(int *)(v25 + idx1 * 4 + *(long long *)(idx2 + 32) * 4) - *(int *)(v25 + idx1 * 4);
                v25 = v3;
            }
            v27 = *a1 + v23;
            v28 = v2 + *(int *)(v25 + idx1 * 4) * 40;
            v29 = v27->field_0;
            v30 = v27->field_10;
            v28->field_20 = v27->field_20;
            v28->field_0 = v29;
            v28->field_10 = v30;
            idx1 += 1;
            v23 += 40;
        } while (a1[1] > idx1);
    }
    sub_1f7d40(&v2, a1);
    sub_1eccac(&v2);
    return sub_1eccac(&v3);
}
