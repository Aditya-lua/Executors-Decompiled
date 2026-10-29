/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f6aac..0x1f6fd4 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f6aac_4 {
    void* field_0;
    unsigned long long field_8;
} st_1f6aac_4;

typedef struct st_1f6aac_5 {
    char padding_0[20];
    unsigned int field_14;
} st_1f6aac_5;

typedef struct st_1f6aac_6 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[12];
    unsigned int field_14;
} st_1f6aac_6;

typedef struct st_1f6aac_1 {
    struct st_1f6aac_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    struct st_1f6aac_2 *field_18;
} st_1f6aac_1;

typedef struct st_1f6aac_2 {
    unsigned int field_0;
} st_1f6aac_2;

typedef struct st_1f6aac_3 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
} st_1f6aac_3;

typedef struct st_1f6aac_0 {
    char field_0;
} st_1f6aac_0;

extern unsigned long long g_e78608;
extern unsigned long long g_e78610;
extern unsigned long long g_e786c8;
extern unsigned long long g_e786d0;

long long sub_1f6aac(st_1f6aac_5 **a0, st_1f6aac_4 *a1, st_1f6aac_1 *a2)
{
    unsigned int v25;  // w23
    unsigned long v26;  // x20
    unsigned int v35;  // w9
    unsigned int v36;  // w10
    unsigned long v37;  // x8
    st_1f6aac_6 *v38;  // x9
    unsigned int v39;  // w10
    void* v40;  // x10
    void* v41;  // x8
    void* v42;  // x9
    unsigned long v43;  // x11
    void* v44;  // x8
    unsigned int v27;  // w0
    unsigned int v45;  // x10
    unsigned int v46;  // x9
    unsigned long v47;  // x10
    void* v48;  // x8
    void* v49;  // x8
    unsigned int i;  // x8
    st_1f6aac_3 *v29;  // x10
    unsigned long v30;  // x25
    unsigned int v31;  // w8
    unsigned long idx;  // x24
    unsigned long v33;  // x26
    uint128_t *v34;  // x8
    unsigned int v0;  // [bp-0x184]
    uint128_t v1;  // [bp-0x180]
    uint128_t v2;  // [bp-0x170]
    unsigned int v3;  // [bp-0x15c]
    unsigned long v4;  // [bp-0x158]
    uint128_t v5;  // [bp-0x150], Other Possible Types: unsigned int
    st_1f6aac_5 **v6;  // [bp-0x138]
    uint128_t v7;  // [bp-0x130]
    st_1f6aac_0 **v8;  // [bp-0x120], Other Possible Types: char
    st_1f6aac_0 *v9;  // [bp-0x118]
    uint128_t v10;  // [bp-0x110]
    uint128_t v11;  // [bp-0x100]
    unsigned int v12;  // [bp-0xf0]
    unsigned int v13;  // [bp-0xe8]
    unsigned int v14;  // [bp-0xe0], Other Possible Types: unsigned long
    unsigned int v15;  // [bp-0xd8]
    uint320_t v16;  // [bp-0xd0]
    unsigned int v17;  // [bp-0xcc]
    unsigned int v18;  // [bp-0xc4]
    unsigned int v19;  // [bp-0xa8]
    unsigned int v20;  // [bp-0xa4]
    uint128_t v21;  // [bp-0xa0]
    uint128_t v22;  // [bp-0x90]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v9 = &v8;
    v8 = &v9;
    v25 = a2->field_8;
    v19 = 2;
    v7 = 1;
    v22 = 1;
    v5 = 0x10000000100000001;
    v21 = 0x10000000100000001;
    v20 = sub_1ef050(a0 + 3, a2[1].padding_10);
    if (!v25)
        return v20;
    v26 = v25;
    v27 = sub_1eca80(a2);
    v13 = 0;
    v14 = 0;
    v15 = 0;
    sub_1ec7e8(&v13, v26);
    i = 0;
    do
    {
        v29 = (st_1f6aac_3 *)(v13 + i);
        *(unsigned long long *)v29->padding_0 = 0;
        *(uint128_t *)((char *)&v29->field_8 + 8) = v7;
        *(uint128_t *)(v29->padding_0)[1] = v5;
        i += 40;
    } while (v26 * 40 != i);
    v0 = v27;
    *(double *)&v16 = 2.63127478081e-312;
    *(uint128_t *)((char *)&v16 + 24) = v7;
    *(uint128_t *)((char *)&v16 + 8) = v5;
    v30 = v25 - 1;
    if ((unsigned int)v30 >= 2)
    {
        v3 = 0;
        v1 = 0x1000000010000002f00000003;
        v2 = 0x4000000010000000100000001;
        v31 = v30;
        v6 = a0;
        do
        {
            v5 = v31;
            idx = *(int *)&a2->field_0[v30];
            v33 = *(int *)((char *)&a2->field_0[v25].field_0 - 8);
            if ((unsigned int)idx != (unsigned int)v33)
            {
                v14 = v25;
                v34 = v13 + 40 * v30;
                *v34 = v1;
                *(double *)&v34[1] = 5e-324;
                *(uint128_t *)((char *)&v34[1] + 8) = v7;
                if ((unsigned int)v33 > (unsigned int)idx)
                {
                    v35 = 0;
                    v4 = v33;
                    do
                    {
                        v36 = *(int *)&a2->field_18[idx];
                        v37 = v35 + 1;
                        v38 = (st_1f6aac_6 *)(v13 + v35 * 40);
                        v38->field_4 = v36 & 0x1fffff;
                        v39 = (v36 * 0x800 | v36 >> 21) & 0xfffff801 & 1;
                        v38->field_14 = v39;
                        *a0->field_14 = *a0->field_14 | v39;
                        if (v30 == v37)
                        {
                            if (a1->field_8 <= 0)
                            {
                                goto *((void *)(g_e786c8));
                            }
                            else if (v14 != 1)
                            {
                                v40 = a1->field_0;
                                if ((int)v40[4] != *(int *)(v13 + 4) && !(long long)v40[32])
                                {
                                    *(unsigned long long *)&v40[32] = a1->field_8 - 0;
                                    goto *((void *)(g_e78610));
                                }
                                goto *((void *)(g_e78608));
                            }
                            else
                            {
                                v41 = a1->field_0;
                                v10 = *(int128_t *)v41;
                                v11 = (int128_t)v41[16];
                                v12 = (long long)v41[32];
                                sub_1f42b0(a1, &v10);
                                v42 = a1->field_0;
                                *(double *)v42 = 2.63127478081e-312;
                                *(uint128_t *)&v42[24] = v7;
                                v43 = a1->field_8 + ~0;
                                *(unsigned long *)&v42[24] = v43;
                                *(unsigned long long *)&v42[32] = 0;
                                *(uint128_t *)&v42[8] = v2;
                                v44 = a1->field_0 + 40 * a1->field_8;
                                v45 = *(long long *)((char *)v44 - 8);
                                *(unsigned long *)((char *)v44 - 16) = *(long long *)((char *)v44 - 16) - v43;
                                if (v45)
                                    v46 = v45 - (long long)v42[24];
                                else
                                    v46 = 0;
                                *(unsigned long long *)((char *)v44 - 8) = v46;
                                *(unsigned int *)((char *)v44 - 20) = *(int *)((char *)v44 - 20) | 8;
                                v3 = 1;
                                goto *((void *)(g_e786d0));
                            }
                        }
                    } while ((v35 = v37, idx += 1, idx != v33));
                }
            }
        } while ((v31 = v5 - 1, v25 = v30, v30 -= 1, v31 >= 2));
    }
    else
    {
        v3 = 0;
    }
    if (a1->field_8)
    {
        v47 = 1;
        if (v0)
            v47 = 2;
        *(unsigned long long *)&a1->field_0[24] = v47 - 0 + a1->field_8;
        *(unsigned long long *)((char *)&v16 + 32) = a1->field_8 + 1;
        sub_1f2e20();
        v48 = a1->field_0;
        *(unsigned long long *)&v48[32] = *(unsigned long long *)((void*)&v16 + 32);
        *(uint128_t *)v48 = *(uint128_t *)&v16;
        *(uint128_t *)&v48[16] = *(uint128_t *)((void*)&v16 + 16);
    }
    if (v0)
    {
        *(unsigned long long *)((char *)&v16 + 32) = 2;
        sub_1f42b0(a1, &v16);
    }
    sub_1f42b0(a1, &v19);
    *(unsigned int *)((char *)&v16 + 4) = 58;
    *(uint128_t *)((char *)&v16 + 24) = v7;
    *(double *)((char *)&v16 + 8) = 5e-324;
    sub_1f2e20(a1, 0, 1);
    v49 = a1->field_0;
    *(unsigned long long *)&v49[32] = *(unsigned long long *)((void*)&v16 + 32);
    *(uint128_t *)v49 = *(uint128_t *)&v16;
    *(uint128_t *)&v49[16] = *(uint128_t *)((void*)&v16 + 16);
    v17 = 59;
    v18 = 1;
    sub_1f42b0(a1, &v16);
    if (!(v3 & 1))
        return sub_1eccac(&v13);
    sub_1f84e0(a0, a1);
    return sub_1eccac(&v13);
}
