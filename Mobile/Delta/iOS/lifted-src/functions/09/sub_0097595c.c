/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97595c..0x975c60 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97595c_8 {
    char padding_0[8];
    unsigned long long field_8;
} st_97595c_8;

typedef struct st_97595c_3 {
    unsigned long long *field_0;
    unsigned long long field_8;
} st_97595c_3;

typedef struct st_97595c_6 {
    char padding_0[8];
    struct st_97595c_7 *field_8;
} st_97595c_6;

typedef struct st_97595c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
} st_97595c_0;

typedef struct st_97595c_11 {
    char padding_0[1704];
    unsigned long long field_6a8;
    char padding_6b0[40];
    unsigned long long field_6d8;
    char padding_6e0[40];
    unsigned long long field_708;
    char padding_710[16];
    unsigned int field_720;
    char padding_724[12];
    unsigned long long field_730;
    char padding_738[24];
    unsigned long long field_750;
    char padding_758[16];
    struct st_97595c_5 *field_768;
} st_97595c_11;

typedef struct st_97595c_10 {
    char padding_0[1730];
    unsigned long long field_6c2;
    char padding_6ca[40];
    unsigned long long field_6f2;
    char padding_6fa[40];
    unsigned long long field_722;
    char padding_72a[16];
    unsigned int field_73a;
    char padding_73e[12];
    unsigned long long field_74a;
    char padding_752[24];
    unsigned long long field_76a;
    char padding_772[16];
    struct st_97595c_5 *field_782;
} st_97595c_10;

typedef struct st_97595c_9 {
    char padding_0[2048];
    unsigned long long field_800;
    char padding_808[40];
    unsigned long long field_830;
    char padding_838[40];
    unsigned long long field_860;
    char padding_868[16];
    unsigned int field_878;
    char padding_87c[12];
    unsigned long long field_888;
    char padding_890[24];
    unsigned long long field_8a8;
    char padding_8b0[16];
    struct st_97595c_5 *field_8c0;
} st_97595c_9;

typedef struct st_97595c_4 {
    char padding_0[144];
    char field_90;
    char padding_91[317];
    char field_1ce;
    char padding_1cf[25];
    char field_1e8;
    char padding_1e9[1703];
    unsigned long long field_890;
    char padding_898[40];
    unsigned long long field_8c0;
    char padding_8c8[40];
    unsigned long long field_8f0;
    char padding_8f8[16];
    unsigned long long field_908;
    char padding_910[8];
    unsigned long long field_918;
    char padding_920[24];
    unsigned long long field_938;
    char padding_940[16];
    struct st_97595c_5 *field_950;
} st_97595c_4;

typedef struct st_97595c_1 {
    char padding_0[16];
    uint128_t field_10;
} st_97595c_1;

typedef struct st_97595c_7 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
} st_97595c_7;

typedef struct st_97595c_2 {
    struct st_97595c_1 *field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
} st_97595c_2;

typedef struct st_97595c_5 {
    unsigned long long field_0;
} st_97595c_5;


unsigned long long sub_97595c(st_97595c_4 *a0, st_97595c_0 *a1)
{
    st_97595c_9 *v6;  // x22
    st_97595c_2 *v7;  // x21
    unsigned long long v16;  // w24
    unsigned long long v17;  // x25
    unsigned long long v18;  // x8
    unsigned long long v19;  // x9
    unsigned long long v20;  // 4109
    unsigned long long v21;  // 4106
    unsigned long v22;  // x8
    unsigned long long idx;  // x1
    st_97595c_10 *v24;  // x8
    unsigned long long v25;  // x9
    unsigned long long v8;  // x8
    st_97595c_4 *v26;  // x11
    unsigned long long v27;  // w10
    unsigned long long v28;  // x11
    st_97595c_6 *v29;  // x10
    st_97595c_8 **v30;  // x11
    unsigned long long v31;  // x11
    unsigned long long *v32;  // x8
    unsigned long v33;  // x10
    unsigned long long v34;  // 4119
    unsigned long v35;  // x0
    unsigned long long *v9;  // x10
    unsigned long long v36;  // 4106
    unsigned long v38;  // x8
    unsigned long long v39;  // w9
    st_97595c_4 *v40;  // x8
    unsigned long long index;  // x9
    st_97595c_11 *v11;  // x23
    st_97595c_3 *v12;  // x10
    unsigned long v13;  // x9
    unsigned long long *v14;  // x10
    unsigned long v15;  // x9
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    uint128_t v2;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = &a0->field_90;
    v7 = &v6->padding_0[32 * (a1->field_10 & 3)];
    if (a1->field_0 < v7->field_18 || sub_991b0c(v7))
        return 1;
    v8 = a1->field_0;
    v9 = &a0->field_890;
    index = a1->field_10 & 3;
    if (v8 > v9[index])
    {
        v9[index] = v8;
        *(unsigned long long *)&a0->padding_898[16 + 8 * (a1->field_10 & 3)] = a1->field_8;
        v8 = a1->field_0;
        index = a1->field_10 & 3;
    }
    v11 = &a0->field_1e8;
    v12 = &v11->padding_0[(unsigned int)index * 56];
    v13 = v12->field_8;
    if (v12->field_8 && v12->field_0[1] >= v8)
    {
        v14 = v12->field_0 + 1;
        while (1)
        {
            v15 = v13;
            if (v8 >= (unsigned long long)*(long long *)((char *)v14 - 8) && *v14 >= v8)
                break;
            v14 += 2;
            v13 = v15 - 1;
            if (v15 == 1)
            {
                v16 = 1;
                goto LABEL_975a68;
            }
        }
    }
    v16 = 0;
LABEL_975a68:
    v0 = v8;
    v1 = v8;
    if (v7->field_18 <= v8)
    {
        if (sub_c63d0c(v7, &v0) != 1)
        {
            return 0;
        }
        else if (v7->field_10 >= 33)
        {
            v17 = 0xffffffffffffffff;
            do
            {
                v2 = v7->field_0->field_10;
                v18 = *(unsigned long long *)((void*)&v2 + 8);
                if (v18 < v17)
                    v19 = v17;
                else
                    v19 = v18;
                v20 = arm64g_calculate_condition(2, v17, 1, 0);
                if (v20 & 1)
                    v17 = v18;
                else
                    v17 = v19;
                sub_c64058();
            } while (32 < v7->field_10);
            v21 = arm64g_calculate_condition(2, v17, 1, 0);
            if (!(v21 & 1) && v17 >= v7->field_18)
            {
                v2 = 0;
                v3 = v17;
                if (sub_c64058(v7, &v2) == 1)
                    v7->field_18 = v17 + 1;
            }
        }
    }
    v22 = a1->field_10;
    if (v22 >> 2 & 1)
    {
        idx = v22 & 3;
        v24 = &a0->field_1ce;
        if (!v24->padding_0[idx])
        {
            v25 = a1->field_8;
            v26 = &a0->padding_0[4 * idx];
            v27 = (int)v26->field_908 + 1;
            *(unsigned int *)&v26->field_908 = v27;
            if (a0->padding_1cf[2 + idx])
                v28 = v16;
            else
                v28 = 1;
            if (v28 & 1 || 1 < v27 || (v29 = &v6->padding_0[32 * idx], v29[1].padding_0 && !(v30 = &v11->padding_0[(unsigned int)idx * 56], !v30[1] || v29->field_8->field_10 != v29->field_8->field_18 || v29->field_8->field_10 <= *v30->field_8 + 1)))
            {
                v24->padding_0[idx] = 1;
                (&a0->field_918)[idx] = 0xffffffffffffffff;
                if (a0->field_950)
                    a0->field_950();
            }
            else
            {
                if ((unsigned int)idx < 2)
                    v31 = 0;
                else
                    v31 = a0->field_938;
                v32 = &a0->field_918;
                v33 = v32[idx];
                v34 = arm64g_calculate_condition(50, v25, v31, 0);
                if (v34 & 1)
                    v35 = v25 + v31;
                else
                    v35 = 0xffffffffffffffff;
                v36 = arm64g_calculate_condition(2, v33, 1, 0);
                if (!(v36 & 1) && v33 < v35)
                    v35 = v33;
                v32[idx] = v35;
                if (a0->field_950)
                    a0->field_950();
            }
        }
    }
    v38 = a1->field_10;
    v39 = ((unsigned int)v38 * 0x20000000 | (unsigned int)v38 >> 3) & 3758096387 & 3;
    if (1 < v39)
    {
        v40 = &a0->padding_0[8 * (v38 & 3)];
        if (v39 == 3)
            v40->field_8f0 = v40->field_8f0 + 1;
        else
            v40->field_8c0 = v40->field_8c0 + 1;
    }
    else if (v39)
    {
        *(long long *)&a0->padding_8c8[16 + 8 * (v38 & 3)] = *(long long *)&a0->padding_8c8[16 + 8 * (v38 & 3)] + 1;
    }
    return 1;
}
