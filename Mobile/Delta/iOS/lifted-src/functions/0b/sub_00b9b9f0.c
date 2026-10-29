/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9b9f0..0xb9bc1c (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9b9f0_3 {
    struct st_b9b9f0_1 *field_0;
    long long field_8;
    struct st_b9b9f0_1 *field_10;
} st_b9b9f0_3;

typedef struct st_b9b9f0_2 {
    struct st_b9b9f0_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_b9b9f0_2;

typedef struct st_b9b9f0_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
    unsigned int field_24;
    unsigned long long field_28;
} st_b9b9f0_0;

typedef struct st_b9b9f0_1 {
    struct st_b9b9f0_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_b9b9f0_0 *field_18;
    unsigned long long field_20;
    unsigned int field_28;
} st_b9b9f0_1;

extern long long g_efc7d0;

double sub_b9b9f0(st_b9b9f0_3 *a0, st_b9b9f0_2 *a1)
{
    st_b9b9f0_1 *v6;  // x22
    unsigned long v7;  // x23
    unsigned long v16;  // x8
    st_b9b9f0_0 *v17;  // x21
    unsigned long v18;  // x19
    unsigned long v19;  // x26
    unsigned long v20;  // x27
    st_b9b9f0_1 *v21;  // x8
    unsigned long v22;  // d0
    unsigned long v23;  // d0
    unsigned long v8;  // x19
    unsigned long v9;  // x24
    st_b9b9f0_0 *v10;  // x20
    unsigned long v11;  // x26
    st_b9b9f0_1 *ptr;  // x0
    st_b9b9f0_1 *v13;  // x25
    st_b9b9f0_1 *v14;  // x20
    unsigned long v15;  // x28
    st_b9b9f0_3 *v0;  // [bp-0x80]
    st_b9b9f0_1 *v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    st_b9b9f0_1 *v3;  // [bp-0x68]
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
            a0->field_8 = 8;
            a0->field_10 = 0;
            return v23;
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
        ptr = _malloc(96);
        if (!ptr)
            goto LABEL_b9bbd0;
LABEL_b9ba64:
        v13 = 0;
        ptr->field_0 = v10;
        *(unsigned long *)&ptr->field_1 = v11;
        *(unsigned int *)&ptr->field_8 = v8;
        v1 = CONCAT(ptr, 4);
        v14 = 1;
        v3 = 1;
        v15 = a1->field_18;
        v16 = a1->field_1c;
        while (1)
        {
            if (v6)
            {
                if (v7 <= v16)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v22;
                }
                v17 = v9 + 48 * v16;
                if (v17->field_0 == 0x8000000000000000)
                    break;
                v18 = v17->field_24;
                v19 = v15;
                v15 = v16;
                v20 = v17->field_28;
                if (v14 == v1)
                    goto LABEL_b9bb24;
            }
            else
            {
                if (v7 <= v15)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v22;
                }
                v17 = v9 + 48 * v15;
                if (v17->field_0 == 0x8000000000000000)
                {
                    *(uint128_t *)&v0->field_0 = (uint128_t)v1;
                    v0->field_10 = v3;
                    return v22;
                }
                v19 = v17->field_20;
                v18 = v16;
                v20 = v17->field_28;
                if (v14 == v1)
                {
LABEL_b9bb24:
                    sub_c736c8(&v1, v14, 1, 8, 24);
                    ptr = *(unsigned long long *)((void*)&v1 + 8);
                }
            }
            v21 = ptr + v13;
            *(st_b9b9f0_0 **)&v21->field_10 = v17;
            v21->field_18 = v20;
            *(unsigned int *)&v21->field_20 = v15;
            v14 = (char *)&v14->field_0 + 1;
            v3 = v14;
            v13 = &v13->field_10;
            v16 = v18;
            v15 = v19;
        }
    }
    else
    {
        v8 = a1->field_18;
        v7 = a1->field_10;
        if (v7 <= v8)
        {
            a0->field_0 = 0;
            a0->field_8 = 8;
            a0->field_10 = 0;
            return v23;
        }
        v9 = a1->field_8;
        v10 = v9 + (unsigned int)v8 * 48;
        if (v10->field_0 == 0x8000000000000000)
        {
            a0->field_0 = 0;
            a0->field_8 = 8;
            a0->field_10 = 0;
            return v23;
        }
        v0 = a0;
        a1->field_18 = v10->field_20;
        v11 = v10->field_28;
        ptr = _malloc(96);
        if (ptr)
            goto LABEL_b9ba64;
LABEL_b9bbd0:
        sub_c6b970(8, 96);
    }
    sub_c73c64(&g_efc7d0);
    __debugbreak();
}
