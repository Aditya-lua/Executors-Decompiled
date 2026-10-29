/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc3810..0xbc3b18 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc3810_1 {
    char padding_0[144];
    struct st_bc3810_0 *field_90;
} st_bc3810_1;

typedef struct st_bc3810_5 {
    unsigned int field_0;
    char field_1;
    char padding_2[2];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_bc3810_5;

typedef struct st_bc3810_2 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bc3810_2;

typedef struct st_bc3810_4 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
    unsigned int field_28;
} st_bc3810_4;

typedef struct st_bc3810_3 {
    unsigned long long field_0;
    char padding_8[28];
    unsigned int field_24;
    unsigned long long field_28;
} st_bc3810_3;

typedef struct st_bc3810_6 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_bc3810_6;

typedef struct st_bc3810_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
} st_bc3810_0;

extern long long g_ef96f0;
extern long long g_efc7d0;

unsigned long long sub_bc3810(st_bc3810_1 *a0, unsigned int a1, long long a2, unsigned long long a3)
{
    st_bc3810_0 *v10;  // x8
    unsigned long long v11;  // x22
    st_bc3810_5 *v20;  // x26
    st_bc3810_5 *v21;  // x23
    st_bc3810_4 *v22;  // x8
    unsigned long v23;  // x20
    st_bc3810_5 *v24;  // x8
    st_bc3810_5 *v25;  // x22
    st_bc3810_5 *v26;  // x22
    unsigned long long v27;  // x20
    unsigned long long v29;  // x0
    unsigned long long v12;  // x9
    unsigned long long *v30;  // x24
    unsigned long long v31;  // x20
    st_bc3810_6 *v32;  // x8
    st_bc3810_2 *v13;  // x9
    unsigned int v14;  // w23
    unsigned long long v15;  // x9
    unsigned long long v16;  // x24
    st_bc3810_3 *v17;  // x8
    unsigned long long v18;  // x25
    st_bc3810_5 *ptr;  // x0
    st_bc3810_5 *ptr1;  // [bp-0xc0]
    st_bc3810_5 *v1;  // [bp-0xb8]
    st_bc3810_5 *v2;  // [bp-0xa8], Other Possible Types: uint128_t
    st_bc3810_5 *v3;  // [bp-0xa0]
    st_bc3810_5 *v4;  // [bp-0x98]
    uint128_t v5;  // [bp-0x88]
    uint128_t v6;  // [bp-0x78]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a0->field_90;
    v11 = v10->field_40;
    v12 = a1;
    if (v10->field_28 <= v12 || (v13 = v10->field_20 + v12 * 32, v13->field_0 == 0x8000000000000000))
    {
        v14 = 0xffffffff;
        v15 = 0xffffffff;
        if (0xffffffff >= v11)
            return a3;
    }
    else
    {
        v14 = v13->field_1c;
        v15 = v13->field_1c;
        if (v11 <= v15)
            return a3;
    }
    v16 = v10->field_38;
    v17 = v16 + (unsigned int)v15 * 48;
    if (v17->field_0 != 0x8000000000000000)
    {
        v18 = v17->field_24;
        ptr = _malloc(32);
        if (ptr)
        {
            v20 = 0;
            ptr->field_0 = v17->field_28;
            *(unsigned int *)&ptr->field_1 = v14;
            v2 = 4;
            v3 = ptr;
            v21 = 1;
            while (1)
            {
                v4 = v21;
                if (v11 <= v18)
                    break;
                v22 = v16 + 48 * v18;
                if (v22->field_0 == 0x8000000000000000)
                {
                    sub_c73c64(&g_efc7d0);
                    __debugbreak();
                }
                v23 = v22->field_24;
                if (v21 == v2)
                {
                    sub_c736c8(&v2, v21, 1, 4, 8);
                    ptr = v3;
                }
                v24 = ptr + v20;
                v24->field_4 = v22->field_28;
                v24->field_8 = v18;
                v21 = (char *)&v21->field_0 + 1;
                v20 = &v20->field_4;
                v18 = v23;
            }
            v25 = v3;
            ptr1 = v25;
            v1 = v2;
            v26 = v25;
            while (1)
            {
                v27 = *(int *)&v26->field_1;
                v29 = sub_bc47ec(a0, v26->field_0, a2);
                if (a0->field_90->field_40 <= v27 || (v30 = a0->field_90->field_38 + (unsigned int)v27 * 48, *v30 == 0x8000000000000000))
                    break;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if ((long long)/* unsupported instruction */ < 0)
                {
                    sub_c769bc();
                    sub_c73c64(&g_efc7d0);
                    __debugbreak();
                }
                v2 = a3;
                v4 = v29;
                v31 = v30[2];
                if (v31 == *v30)
                    sub_c73a20(v30);
                v32 = v30[1] + 72 * v31;
                v32->field_20 = v5;
                v32->field_30 = v6;
                v32->field_40 = v7;
                v32->field_0 = v2;
                v32->field_10 = (uint128_t)v4;
                v30[2] = v31 + 1;
                v26 = &v26->field_4;
                if (v26 == (char *)v25 + 0x8 * v21)
                {
                    if (!v1)
                        return a3;
                    _free(ptr1);
                    return a3;
                }
            }
            sub_c73c64(&g_ef96f0);
        }
        else
        {
            sub_c6b970(4, 32);
        }
    }
    else
    {
        sub_c73c64(&g_efc7d0);
    }
    __debugbreak();
}
