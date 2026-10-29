/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ced0..0x2d2c8 (1016 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ced0_1 {
    unsigned int field_0;
} st_2ced0_1;

typedef struct st_2ced0_0 {
    char field_0;
} st_2ced0_0;


void* sub_2ced0(void* a0)
{
    unsigned long long v10;  // x0
    st_2ced0_1 **ptr;  // x8
    unsigned int v20;  // w9
    unsigned int v21;  // w8
    unsigned long long v22;  // 4142
    unsigned int j;  // w0
    unsigned long long v24;  // x27
    unsigned int v25;  // w21
    unsigned int *iter;  // x10
    unsigned int *v27;  // x11
    unsigned int *v28;  // x12
    void* v29;  // x13
    char *v12;  // x8
    unsigned long v30;  // x17
    unsigned long v31;  // x16
    unsigned int v32;  // w0
    unsigned int v33;  // w0
    unsigned long v34;  // x16
    unsigned int v35;  // w17
    unsigned long long v36;  // 4165
    unsigned long v37;  // x8
    uint128_t v38;  // q1
    unsigned long v39;  // x8
    char *v13;  // x9
    unsigned int *node;  // x8
    unsigned int *v41;  // x9
    unsigned int *v42;  // x10
    unsigned long index;  // x11
    unsigned int v44;  // w12
    unsigned int *iter1;  // x8
    unsigned int *v46;  // x9
    unsigned int *v47;  // x10
    unsigned long idx;  // x11
    char i;  // x27
    char v15;  // x22
    unsigned long long v16;  // x26
    unsigned long v17;  // x0
    unsigned int *v18;  // x8
    char v19;  // x9
    st_2ced0_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_2ced0_0 *v1;  // [bp-0xa8]
    st_2ced0_0 **v2;  // [bp-0xa0], Other Possible Types: char
    char v3;  // [bp-0x90], Other Possible Types: unsigned long
    char *v4;  // [bp-0x80], Other Possible Types: st_2ced0_0 *, char
    char *v5;  // [bp-0x78]
    char v6;  // [bp-0x70], Other Possible Types: unsigned long
    char *v7;  // [bp-0x68], Other Possible Types: char, unsigned int
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    if (!((char)a0[240] & 1))
    {
        memset(ptr, 0, 24);
        return a0;
    }
    v4 = &v2;
    v2 = &v4;
    v10 = sub_2f544((long long)a0[152] - (long long)a0[144] >> 3);
    sub_2d7a4((long long)a0[144], (long long)a0[152], &v7, v10 * 2, 1);
    sub_2b198(ptr, (long long)a0[56] - (long long)a0[48] >> 2);
    v4 = 0;
    v6 = 0;
    v2 = 0;
    v3 = 0;
    sub_2dfb0(&v4, (long long)a0[56] - (long long)a0[48] >> 2);
    sub_2dfb0(&v2, (long long)a0[56] - (long long)a0[48] >> 2);
    v12 = (long long)a0[48];
    v13 = (long long)a0[56];
    if (v13 != v12)
    {
        i = 0;
        v15 = 0;
        do
        {
            v16 = i * 4;
            v17 = v12[v16];
            if ((unsigned long long)((long long)a0[152] - (long long)a0[144] >> 3) > v15)
            {
                v18 = (long long)a0[144] + v15 * 8;
                v19 = *v18;
                if (i == v19)
                {
                    v20 = ~v19;
                    v21 = v18[1] + v20;
                    v22 = arm64g_calculate_condition(81, v18[1], v20, 0);
                    if (!(v22 & 1))
                        v21 = -v21;
                    if (v21 >= 10923)
                    {
                        v7 = 65559;
                        sub_a390(&v4, &v7);
                        v7 = 67;
                        sub_a390(&v4, &v7);
                        sub_a390(&v2, (long long)a0[72] + i * 4);
                        sub_a390(&v2, (long long)a0[72] + i * 4);
                    }
                    v15 += 1;
                }
            }
            j = sub_2d3c0(v17);
            if ((int)j >= 1)
            {
                v24 = -i;
                do
                {
                    v25 = j;
                    *(unsigned int *)((char *)*ptr + v16) = *(unsigned long long *)((void*)&v4 + 8) - *(unsigned long long *)&v4 >> 2;
                    sub_a390(&v4, (long long)a0[48] + v16);
                    sub_a390(&v2, (long long)a0[72] + v16);
                    v24 -= 1;
                    v16 += 4;
                    j = v25 - 1;
                } while (j);
                i = -v24;
            }
            v12 = (long long)a0[48];
            v13 = (long long)a0[56];
        } while (a0[56] - v12 >> 2 > i);
    }
    iter = (long long)a0[144];
    v27 = (long long)a0[152];
    if (iter != v27)
    {
        v28 = *ptr;
        v29 = *(unsigned long long *)&v4;
        while (1)
        {
            v30 = *iter;
            v31 = iter[1];
            v32 = ~(unsigned int)v30;
            v33 = (unsigned int)v31 + v32;
            v34 = v28[v30];
            v35 = v28[v31] - v34;
            v36 = arm64g_calculate_condition(81, v31 & 0xffffffff, v32, 0);
            if (!(v36 & 1))
                v33 = -v33;
            if (v33 < 10923)
            {
                *(unsigned short *)((char *)v29 + 4 * v34 + 2) = v35 * 0x10000 - 0x10000 >> 16;
                iter += 2;
                if (iter == v27)
                    break;
            }
            else
            {
                *(unsigned int *)((char *)v29 + 4 * v34 - 4) = *((char *)v29 + ((((unsigned int)v34 - 1) * 4 | (unsigned int)v34 - 1 >> 62) & 0x3fffffffc & 0x3ffffffff)) | v35 * 0x100;
                *(unsigned short *)((char *)v29 + 4 * v34 + 2) = 0xfffe;
                iter += 2;
                if (iter == v27)
                    break;
            }
        }
    }
    *(uint128_t *)&a0[48] = v4;
    v4 = v12;
    v5 = v13;
    v37 = (long long)a0[64];
    *(unsigned long long *)&a0[64] = v6;
    v6 = v37;
    v38 = (int128_t)a0[72];
    *(uint128_t *)&a0[72] = v2;
    v2 = v38;
    v39 = (long long)a0[88];
    *(unsigned long long *)&a0[88] = v3;
    v3 = v39;
    node = (long long)a0[656];
    v41 = (long long)a0[664];
    if (node != v41)
    {
        v42 = *ptr;
        do
        {
            index = node[2];
            if ((unsigned int)index == node[3])
                v44 = v42[index];
            else
                v44 = *(int *)((char *)&v42[node[3]] - 4) + 1;
        } while ((node[3] = v44, node[2] = v42[index], node += 4, node != v41));
    }
    iter1 = (long long)a0[704];
    v46 = (long long)a0[712];
    if (iter1 != v46)
    {
        v47 = *ptr;
        while (1)
        {
            idx = iter1[2];
            if ((unsigned int)idx == iter1[3])
            {
                iter1[3] = v47[idx];
                iter1[2] = v47[idx];
                iter1 += 4;
                if (iter1 == v46)
                    break;
            }
            else
            {
                iter1[3] = *(int *)((char *)&v47[iter1[3]] - 4) + 1;
                iter1[2] = v47[idx];
                iter1 += 4;
                if (iter1 == v46)
                    break;
            }
        }
    }
    v7 = &v2;
    sub_1aedc(&v7);
    v2 = &v4;
    return sub_1aedc(&v2);
}
