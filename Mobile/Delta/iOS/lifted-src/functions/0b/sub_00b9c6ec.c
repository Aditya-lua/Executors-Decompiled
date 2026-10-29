/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9c6ec..0xb9c8e4 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9c6ec_4 {
    struct st_b9c6ec_1 *field_0;
    long long field_8;
    struct st_b9c6ec_1 *field_10;
} st_b9c6ec_4;

typedef struct st_b9c6ec_0 {
    struct st_b9c6ec_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_b9c6ec_0;

typedef struct st_b9c6ec_3 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned int field_20;
} st_b9c6ec_3;

typedef struct st_b9c6ec_2 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
} st_b9c6ec_2;

typedef struct st_b9c6ec_1 {
    unsigned int field_0;
} st_b9c6ec_1;

extern long long g_efc7d0;

double sub_b9c6ec(st_b9c6ec_4 *a0, st_b9c6ec_0 *a1)
{
    unsigned int *v5;  // x22
    unsigned long v6;  // x23
    st_b9c6ec_2 *v15;  // x9
    unsigned long v16;  // x21
    unsigned long v17;  // x28
    st_b9c6ec_3 *v18;  // x9
    unsigned long v19;  // d0
    unsigned long v20;  // d0
    unsigned long v7;  // x20
    unsigned long v8;  // x24
    st_b9c6ec_2 *v9;  // x8
    unsigned int *ptr;  // x0
    st_b9c6ec_3 *v11;  // x8
    unsigned int *v12;  // x20
    unsigned long v13;  // x27
    unsigned long v14;  // x8
    unsigned int *v0;  // [bp-0x78]
    long long v1;  // [bp-0x70]
    unsigned int *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_0;
    if (v5)
    {
        v6 = a1->field_10;
        v7 = a1->field_1c;
        if (v6 <= v7)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v20;
        }
        v8 = a1->field_8;
        v9 = v8 + (unsigned int)v7 * 48;
        a1->field_1c = v9->field_24;
        if (v9->field_0 == 0x8000000000000000)
        {
            sub_c73c64(&g_efc7d0);
            if (v0)
                _free(v1);
            __Unwind_Resume();
        }
        ptr = _malloc(16);
        if (!ptr)
            goto LABEL_b9c898;
LABEL_b9c75c:
        *ptr = v7;
        v0 = CONCAT(ptr, 4);
        v12 = 1;
        v2 = 1;
        v13 = a1->field_18;
        v14 = a1->field_1c;
        while (1)
        {
            if (v5)
            {
                if (v6 <= v14)
                {
                    *(uint128_t *)&a0->field_0 = (uint128_t)v0;
                    a0->field_10 = v2;
                    return v19;
                }
                v15 = v8 + 48 * v14;
                if (v15->field_0 == 0x8000000000000000)
                    break;
                v16 = v15->field_24;
                v17 = v13;
                v13 = v14;
                if (v12 == v0)
                    goto LABEL_b9c7f8;
            }
            else
            {
                if (v6 <= v13)
                {
                    *(uint128_t *)&a0->field_0 = (uint128_t)v0;
                    a0->field_10 = v2;
                    return v19;
                }
                v18 = v8 + 48 * v13;
                if (v18->field_0 == 0x8000000000000000)
                {
                    *(uint128_t *)&a0->field_0 = (uint128_t)v0;
                    a0->field_10 = v2;
                    return v19;
                }
                v17 = v18->field_20;
                v16 = v14;
                if (v12 == v0)
                {
LABEL_b9c7f8:
                    sub_c736c8(&v0, v12, 1, 4, 4);
                    ptr = *(unsigned long long *)((void*)&v0 + 8);
                }
            }
            *(unsigned int *)((char *)ptr + 0x4 * v12) = v13;
            v12 = (char *)v12 + 1;
            v2 = v12;
            v14 = v16;
            v13 = v17;
        }
    }
    else
    {
        v7 = a1->field_18;
        v6 = a1->field_10;
        if (v6 <= v7)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v20;
        }
        v8 = a1->field_8;
        v11 = v8 + (unsigned int)v7 * 48;
        if (v11->field_0 == 0x8000000000000000)
        {
            a0->field_0 = 0;
            a0->field_8 = 4;
            a0->field_10 = 0;
            return v20;
        }
        a1->field_18 = v11->field_20;
        ptr = _malloc(16);
        if (ptr)
            goto LABEL_b9c75c;
LABEL_b9c898:
        sub_c6b970(4, 16);
    }
    sub_c73c64(&g_efc7d0);
    __debugbreak();
}
