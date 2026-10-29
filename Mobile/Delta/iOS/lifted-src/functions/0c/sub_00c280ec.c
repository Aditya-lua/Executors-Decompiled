/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc280ec..0xc28314 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c280ec_0 {
    unsigned int field_0;
    char field_1;
    char padding_2[2];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_c280ec_0;

typedef struct st_c280ec_3 {
    struct st_c280ec_0 *field_0;
    long long field_8;
    struct st_c280ec_0 *field_10;
} st_c280ec_3;

typedef struct st_c280ec_1 {
    struct st_c280ec_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_c280ec_1;

typedef struct st_c280ec_6 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
} st_c280ec_6;

typedef struct st_c280ec_5 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
} st_c280ec_5;

typedef struct st_c280ec_2 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
    unsigned long long field_28;
} st_c280ec_2;

typedef struct st_c280ec_4 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
} st_c280ec_4;

extern long long g_efc7d0;

double sub_c280ec(st_c280ec_3 *a0, st_c280ec_1 *a1)
{
    st_c280ec_0 *v6;  // x22
    unsigned long v7;  // x23
    unsigned long v16;  // x28
    unsigned long v17;  // x8
    st_c280ec_5 *v18;  // x9
    unsigned long v19;  // x21
    unsigned long v20;  // x19
    unsigned int v21;  // w27
    st_c280ec_6 *v22;  // x9
    st_c280ec_0 *v23;  // x8
    unsigned long v24;  // d0
    unsigned long v25;  // d0
    unsigned long v8;  // x19
    unsigned long v9;  // x24
    st_c280ec_2 *v10;  // x8
    unsigned int v11;  // w20
    st_c280ec_0 *ptr;  // x0
    st_c280ec_4 *v13;  // x8
    st_c280ec_0 *v14;  // x25
    st_c280ec_0 *v15;  // x20
    st_c280ec_3 *v0;  // [bp-0x80]
    st_c280ec_0 *v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    st_c280ec_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1->field_0;
    if (v6)
    {
        v7 = a1->field_10;
        v8 = a1->field_1c;
        if (v7 <= v8)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v25;
        }
        v9 = a1->field_8;
        v10 = v9 + (unsigned int)v8 * 48;
        a1->field_1c = v10->field_24;
        if (v10->field_0 == 0x8000000000000000)
        {
            sub_c73c64(&g_efc7d0);
            if (v1)
                _free(v2);
            __Unwind_Resume();
        }
        v0 = a0;
        v11 = v10->field_28;
        ptr = _malloc(32);
        if (!ptr)
            goto LABEL_c282c8;
LABEL_c28160:
        v14 = 0;
        ptr->field_0 = v11;
        *(unsigned int *)&ptr->field_1 = v8;
        v1 = CONCAT(ptr, 4);
        v15 = 1;
        v3 = 1;
        v16 = a1->field_18;
        v17 = a1->field_1c;
        while (1)
        {
            if (v6)
            {
                if (v7 <= v17)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v24;
                }
                v18 = v9 + 48 * v17;
                if (v18->field_0 == 0x8000000000000000)
                    break;
                v19 = v18->field_24;
                v20 = v16;
                v16 = v17;
                v21 = *(int *)(v9 + 48 * v17 + 40);
                if (v15 == v1)
                    goto LABEL_c2821c;
            }
            else
            {
                if (v7 <= v16)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v24;
                }
                v22 = v9 + 48 * v16;
                if (v22->field_0 == 0x8000000000000000)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v24;
                }
                v20 = v22->field_20;
                v19 = v17;
                v21 = *(int *)(v9 + 48 * v16 + 40);
                if (v15 == v1)
                {
LABEL_c2821c:
                    sub_c736c8(&v1, v15, 1, 4, 8);
                    ptr = *(unsigned long long *)((void*)&v1 + 8);
                }
            }
            v23 = ptr + v14;
            v23->field_4 = v21;
            v23->field_8 = v16;
            v15 = (char *)&v15->field_0 + 1;
            v3 = v15;
            v14 = &v14->field_4;
            v17 = v19;
            v16 = v20;
        }
    }
    else
    {
        v8 = a1->field_18;
        v7 = a1->field_10;
        if (v7 <= v8)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v25;
        }
        v9 = a1->field_8;
        v13 = v9 + (unsigned int)v8 * 48;
        if (v13->field_0 == 0x8000000000000000)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v25;
        }
        v0 = a0;
        a1->field_18 = v13->field_20;
        v11 = v13->field_28;
        ptr = _malloc(32);
        if (ptr)
            goto LABEL_c28160;
LABEL_c282c8:
        sub_c6b970(4, 32);
    }
    sub_c73c64(&g_efc7d0);
    __debugbreak();
}
