/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8948..0xbd8cc8 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8948_3 {
    unsigned int field_0;
    char field_1;
    char padding_2[2];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_bd8948_3;

typedef struct st_bd8948_10 {
    uint128_t field_0;
    struct st_bd8948_3 *field_10;
} st_bd8948_10;

typedef struct st_bd8948_5 {
    char padding_0[24];
    unsigned int field_18;
} st_bd8948_5;

typedef struct st_bd8948_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bd8948_1;

typedef struct st_bd8948_7 {
    char padding_0[28];
    unsigned int field_1c;
} st_bd8948_7;

typedef struct st_bd8948_6 {
    char padding_0[32];
    unsigned int field_20;
} st_bd8948_6;

typedef struct st_bd8948_8 {
    char padding_0[36];
    unsigned int field_24;
} st_bd8948_8;

typedef struct st_bd8948_9 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_bd8948_9;

typedef struct st_bd8948_2 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
} st_bd8948_2;

typedef struct st_bd8948_4 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    char padding_24[8];
    unsigned int field_2c;
} st_bd8948_4;

typedef struct st_bd8948_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    char padding_58[4];
    unsigned int field_5c;
} st_bd8948_0;

extern long long g_efa430;

double sub_bd8948(st_bd8948_10 *a0, st_bd8948_0 *a1, unsigned int a2)
{
    unsigned long long v11;  // x19
    unsigned long long v12;  // x8
    st_bd8948_3 *v21;  // x22
    st_bd8948_4 *v22;  // x8
    unsigned long v23;  // x27
    st_bd8948_3 *v24;  // x8
    st_bd8948_3 *iter;  // x28
    unsigned long long v26;  // x26
    unsigned long long j;  // x25
    unsigned long long v28;  // x27
    unsigned int v29;  // w8
    unsigned long long v30;  // x23
    st_bd8948_1 *v13;  // x8
    unsigned long long v31;  // x24
    void* v32;  // x9
    unsigned int v33;  // w10
    unsigned long v34;  // x12
    unsigned long long v35;  // x14
    unsigned int v36;  // w11
    st_bd8948_5 *v37;  // x15
    unsigned long long v38;  // x14
    st_bd8948_6 *v39;  // x15
    unsigned long long v40;  // x12
    unsigned int v14;  // w22
    st_bd8948_7 *v41;  // x13
    unsigned long long v42;  // x12
    st_bd8948_8 *v43;  // x13
    unsigned long long v44;  // x8
    st_bd8948_3 *v45;  // x22
    st_bd8948_9 *v46;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // x21
    st_bd8948_2 *v17;  // x8
    unsigned long long v18;  // x23
    st_bd8948_3 *ptr;  // x0
    st_bd8948_3 *v20;  // x24
    st_bd8948_3 *ptr1;  // [bp-0xc8]
    st_bd8948_3 *v1;  // [bp-0xb8]
    unsigned long v2;  // [bp-0xb0]
    st_bd8948_3 *v3;  // [bp-0xa8]
    uint128_t v4;  // [bp-0xa0]
    st_bd8948_3 *v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x88], Other Possible Types: uint128_t
    st_bd8948_3 *v7;  // [bp-0x78], Other Possible Types: uint128_t
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v4 = CONCAT(8, 0);
    v5 = 0;
    v11 = a1->field_40;
    v12 = a2;
    if (a1->field_28 <= v12 || !(v13 = a1->field_20 + v12 * 32, v13->field_0 != 0x8000000000000000))
    {
        v14 = 0xffffffff;
        v15 = 0xffffffff;
        if (0xffffffff < v11)
            goto LABEL_bd89c8;
    }
    else
    {
        v14 = v13->field_18;
        v15 = v13->field_18;
        if (v11 > v15)
        {
LABEL_bd89c8:
            v16 = a1->field_38;
            v17 = v16 + (unsigned int)v15 * 48;
            if (v17->field_0 != 0x8000000000000000)
            {
                v18 = v17->field_20;
                ptr = _malloc(32);
                if (!ptr)
                {
                    sub_c6b970(4, 32);
                    __debugbreak();
                }
                v20 = 0;
                ptr->field_0 = v17->field_28 >> 32;
                *(unsigned int *)&ptr->field_1 = v14;
                v6 = CONCAT(ptr, 4);
                v21 = 1;
                while (1)
                {
                    v7 = v21;
                    if (v11 <= v18 || !(v22 = v16 + 48 * v18, v22->field_0 != 0x8000000000000000))
                        break;
                    v23 = v22->field_20;
                    if (v21 == v6)
                    {
                        sub_c736c8(&v6, v21, 1, 4, 8);
                        ptr = *(unsigned long long *)((void*)&v6 + 8);
                    }
                    v24 = ptr + v20;
                    v24->field_4 = v22->field_2c;
                    v24->field_8 = v18;
                    v21 = (char *)&v21->field_0 + 1;
                    v20 = &v20->field_4;
                    v18 = v23;
                }
                iter = *(unsigned long long *)((void*)&v6 + 8);
                v3 = (char *)iter + 0x8 * v21;
                v26 = a1->field_38;
                j = a1->field_40;
                v28 = a1->field_28;
                v1 = (unsigned long long)v6;
                v2 = a1->field_20;
                v29 = a1->field_5c;
                v30 = a1->field_50;
                ptr1 = iter;
                do
                {
                    v31 = *(int *)&iter->field_1;
                    if (j <= v31)
                    {
                        sub_c73c64(&g_efa430);
                        __debugbreak();
                    }
                    v32 = v26 + (unsigned int)v31 * 48;
                    if (*(long long *)v32 == 0x8000000000000000)
                    {
                        sub_c73c64(&g_efa430);
                        __debugbreak();
                    }
                    v33 = iter->field_0;
                    v34 = (long long)v32[40];
                    v35 = v34 & 0xffffffff;
                    if (v28 > v35)
                    {
                        v36 = (int)v32[36];
                        v37 = v2 + v35 * 32;
                        if (v37->field_18 == v31)
                        {
                            v37->field_18 = (int)v32[32];
                        }
                        else
                        {
                            while (j > v38)
                            {
                                v39 = v26 + 48 * v38;
                                if (v39->field_20 == v31)
                                {
                                    v39->field_20 = (int)v32[32];
                                    break;
                                }
                            }
                        }
                        v40 = v34 >> 32;
                        if (v28 > v40)
                        {
                            v41 = v2 + v40 * 32;
                            if (v41->field_1c == v31)
                            {
                                v41->field_1c = v36;
                            }
                            else
                            {
                                while (j > v42)
                                {
                                    v43 = v26 + 48 * v42;
                                    if (v43->field_24 == v31)
                                    {
                                        v43->field_24 = v36;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    *(unsigned int *)&v32[32] = v29;
                    *(unsigned long *)&v32[36] = 0xffffffffffffffff;
                    *(unsigned int *)&v32[44] = 0xffffffff;
                    a1->field_5c = v31;
                    v30 -= 1;
                    a1->field_50 = v30;
                    v44 = *(long long *)v32;
                    *(unsigned long long *)v32 = 0x8000000000000000;
                    if (v44 == 0x8000000000000000)
                    {
                        sub_c73c64(&g_efa430);
                        __debugbreak();
                    }
                    v7 = (int128_t)v32[8];
                    v8 = (long long)v32[24];
                    *(unsigned int *)&v6 = v33;
                    *(unsigned long long *)((char *)&v6 + 8) = v44;
                    v45 = v5;
                    if (v45 == *(unsigned long long *)&v4)
                        sub_c73748(&v4);
                    iter = &iter->field_4;
                    v46 = *(unsigned long long *)((void*)&v4 + 8) + 40 * v45;
                    v46->field_0 = v6;
                    v46->field_10 = v7;
                    v46->field_20 = v8;
                    v5 = (char *)&v45->field_0 + 1;
                    v29 = v31;
                } while (iter != v3);
                if (v1)
                    _free(ptr1);
            }
        }
    }
    a0->field_0 = v4;
    a0->field_10 = v5;
    return *(unsigned long long *)&v4;
}
