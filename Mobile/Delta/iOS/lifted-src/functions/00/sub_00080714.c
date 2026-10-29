/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x80714..0x80ae4 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_80714_6 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_80714_6;

typedef struct st_80714_4 {
    struct st_80714_0 *field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_80714_4;

typedef struct st_80714_3 {
    char padding_0[244];
    unsigned int field_f4;
    char padding_f8[12];
    unsigned int field_104;
    char padding_108[112];
    struct st_80714_0 *field_178;
    char padding_180[64];
    struct st_80714_0 *field_1c0;
    char padding_1c8[520];
    unsigned long long field_3d0;
    struct st_80714_2 *field_3d8;
    char padding_3e0[8];
    uint128_t *field_3e8;
    char padding_3f0[24];
    unsigned long long field_408;
    char padding_410[8];
    unsigned int field_418;
    unsigned int field_41c;
    char padding_420[2168];
    unsigned long long field_c98;
    unsigned long long field_ca0;
    char padding_ca8[488];
    struct st_80714_0 *field_e90;
    struct st_80714_0 *field_e98;
} st_80714_3;

typedef struct st_80714_8 {
    struct st_80714_9 *field_0;
} st_80714_8;

typedef struct st_80714_9 {
    struct st_80714_8 *field_0;
} st_80714_9;

typedef struct st_80714_5 {
    char padding_0[4];
    unsigned int field_4;
} st_80714_5;

typedef struct st_80714_7 {
    char field_0;
} st_80714_7;

typedef struct st_80714_0 {
    char padding_0[8];
    unsigned int field_8;
} st_80714_0;

typedef struct st_80714_1 {
    char padding_0[5];
    unsigned int field_5;
} st_80714_1;

typedef struct st_80714_2 {
    struct st_80714_1 *field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_80714_2;


unsigned long long sub_80714(st_80714_3 *a0, st_80714_6 *a1, unsigned int *a2, unsigned long long a3, uint128_t *a4, unsigned long long a5, unsigned long long a6)
{
    unsigned long long v12;  // x25
    uint128_t *node;  // x21
    st_80714_1 *v22;  // x28
    unsigned long v23;  // x24
    long long v24;  // x26
    long long v25;  // x3
    unsigned long long v26;  // x0
    unsigned long long v27;  // 4106
    uint128_t *v28;  // x2
    uint128_t *v29;  // x9
    uint128_t *iter;  // x9
    uint128_t *v31;  // x10
    unsigned long long v14;  // x27
    uint128_t *v32;  // x10
    st_80714_2 *v33;  // x8
    st_80714_0 *v34;  // x9
    unsigned int v35;  // w24
    unsigned long v36;  // x9
    unsigned int v37;  // w10
    unsigned int v38;  // w10
    unsigned long long idx;  // x9
    st_80714_5 *v40;  // x23
    unsigned long n;  // x19
    unsigned int *v15;  // x26
    unsigned long v42;  // x8
    st_80714_6 *v16;  // x20
    unsigned long long v17;  // x11
    unsigned int *v18;  // x8
    uint128_t *v19;  // x19
    unsigned long long v20;  // x8
    st_80714_4 *v21;  // x9
    unsigned long long v0;  // [bp-0xb0]
    uint128_t *v1;  // [bp-0xa8]
    st_80714_0 *v2;  // [bp-0xa0]
    st_80714_1 *v3;  // [bp-0x98]
    unsigned int v4;  // [bp-0x94]
    st_80714_7 **v5;  // [bp-0x90], Other Possible Types: char
    st_80714_7 *v6;  // [bp-0x88]
    uint96_t v7;  // [bp-0x80]
    st_80714_9 **v8;  // [bp-0x70]
    st_80714_9 **v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a6;
    node = a4;
    v14 = a3;
    v15 = a2;
    v16 = a1;
    v6 = &v5;
    v5 = &v6;
    v17 = a1->field_0;
    if (a0->field_e90)
    {
        v18 = &a0->field_e90->field_8;
        goto LABEL_8077c;
    }
    else if (a0->field_e98)
    {
        v18 = a0 + 1;
LABEL_8077c:
        v2 = *v18;
    }
    else
    {
        v2 = 0;
    }
    v0 = v17;
    v7 = CONCAT(*(int *)(a0->field_c98 + 5624), *(long long *)(a0->field_c98 + 5616));
    v1 = (char *)node + a5;
    if (v14 > v17)
    {
        v19 = (char *)v1 - 32;
        v20 = v17;
        v4 = v17;
        while (1)
        {
            v21 = &v15[4 * v20];
            v22 = v21->field_4;
            if (!(unsigned int)v22 && !(int)v21->field_0)
            {
                v35 = v4;
                if (v20 != v14)
                {
LABEL_809d4:
                    if ((unsigned int)v12 == 2 && v35 != (unsigned int)v0)
                    {
                        v36 = v35 - 1;
                        v37 = (unsigned int)v0 + 2;
                        if (v37 <= (unsigned int)v36)
                        {
                            v38 = *(int *)((char *)v15 + (((v35 - 3) * 16 | v35 - 3 >> 60) & 0xffffffff0 & 0xfffffffff));
                            goto LABEL_80a1c;
                        }
                        else if (v35 == v37)
                        {
                            v38 = *(unsigned int *)&v7;
LABEL_80a1c:
                            *(int *)((char *)&v7 + 4) = *(int *)((char *)v15 + (((v35 - 2) * 16 | v35 - 2 >> 60) & 0xffffffff0 & 0xfffffffff));
                            *(unsigned int *)((char *)&v7 + 8) = v38;
                        }
                        else
                        {
                            *(unsigned long long *)((char *)&v7 + 4) = *(unsigned long long *)&v7;
                        }
                        *(int *)&v7 = *(int *)((char *)v15 + ((v36 * 16 | v36 >> 60) & 0xffffffff0 & 0xfffffffff));
                    }
                    idx = a0->field_ca0;
                    *(unsigned long long *)(idx + 5616) = *(unsigned long long *)&v7;
                    *(unsigned int *)(idx + 5624) = *(unsigned int *)((void*)&v7 + 8);
                    v40 = &v15[4 * v20];
                    n = v40->field_4;
                    if ((unsigned int)n)
                    {
                        _memcpy(a0->field_3e8, node, n);
                        a0->field_3e8 = (char *)a0->field_3e8 + n;
                        v42 = v40->field_4;
                        node = (char *)node + v42;
                        v16->field_8 = v16->field_8 + v42;
                    }
                    if (node == v1)
                    {
                        v16->field_0 = v35 + 1;
                        return a5;
                    }
                }
            }
            v23 = *(int *)((char *)&v21->field_0 + 4);
            if ((unsigned int)v12 == 2)
            {
                v3 = (st_80714_1 *)((int)v21->field_0 + 3);
                if ((int)a0->field_178)
                    goto LABEL_80854;
            }
            else
            {
                v24 = !(unsigned int)v23;
                v3 = (st_80714_1 *)(unsigned int)sub_7cd0c((int)v21->field_0, &v7, v24);
                sub_7f880(&v7, v3, v24);
                if ((int)a0->field_178)
                {
LABEL_80854:
                    v25 = &v22->padding_0[v23 + v16->field_8];
                    v16->field_8 = v25;
                    v26 = sub_7f754(v3, v22, a0->field_104, v25, a0->field_f4, v2, a0->field_1c0 != 0);
                    v27 = arm64g_calculate_condition(130, v26, 120, 0);
                    if (v27 & 1)
                        return v26;
                }
            }
            if (a0->field_408 <= v4 - v16->field_0)
                break;
            v8 = &v9;
            v9 = &v8;
            v28 = (char *)node + v23;
            if (v28 > v19)
            {
                sub_82208(a0->field_3e8, node, v28, v19);
                goto LABEL_808cc;
            }
            else
            {
                *a0->field_3e8 = *node;
                v29 = a0->field_3e8;
                if ((unsigned int)v23 > 16)
                {
                    v29[1] = node[1];
                    if (v23 - 16 >= 0x11)
                    {
                        iter = v29 + 2;
                        v31 = node + 3;
                        do
                        {
                            *iter = *(int128_t *)((char *)v31 - 16);
                            v32 = v31 + 2;
                            iter[1] = *v31;
                            iter += 2;
                            v31 = v32;
                        } while (iter < (char *)v29 + v23);
                    }
LABEL_808cc:
                    a0->field_3e8 = (char *)a0->field_3e8 + v23;
                    v33 = a0->field_3d8;
                    if ((unsigned int)v23 >= 0x10000)
                    {
                        a0->field_418 = 1;
                        a0->field_41c = (char *)v33 - a0->field_3d0 >> 3;
                        goto LABEL_80960;
                    }
                }
                else
                {
                    a0->field_3e8 = (char *)v29 + v23;
                    v33 = a0->field_3d8;
LABEL_80960:
                    *(unsigned short *)((char *)&v33->field_0 + 4) = v23;
                    *(unsigned int *)&v33->field_0 = (unsigned int)v3;
                    v34 = (char *)v22 - 3;
                    if (0x10000 <= v34)
                    {
                        a0->field_418 = 2;
                        a0->field_41c = (char *)v33 - a0->field_3d0 >> 3;
                    }
                    *(unsigned short *)((char *)&v33->field_0 + 6) = (unsigned short)v34;
                    a0->field_3d8 = &v33->field_4;
                    node += &v22->padding_0[v23];
                    v20 = v4 + 1;
                    v4 = v20;
                    v35 = v20;
                    if (v20 >= v14)
                        goto LABEL_809cc;
                }
            }
        }
    }
    else
    {
        v35 = v17;
        v20 = v17;
LABEL_809cc:
        if (v20 != v14)
            goto LABEL_809d4;
    }
    return 0xffffffffffffff95;
}
