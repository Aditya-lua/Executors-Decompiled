/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc231f0..0xc23418 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c231f0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_c231f0_1 *field_10;
} st_c231f0_2;

typedef struct st_c231f0_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
    unsigned long long field_28;
} st_c231f0_0;

typedef struct st_c231f0_1 {
    struct st_c231f0_1 *field_0;
    char padding_8[8];
    unsigned long long field_10[2];
    char field_18;
    char padding_19[7];
    struct st_c231f0_1 *field_20;
} st_c231f0_1;

extern long long g_efbba8;
extern long long g_efbbc0;
extern long long g_efbbd8;

st_c231f0_1 * sub_c231f0(st_c231f0_0 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v7;  // x8
    st_c231f0_2 *v8;  // x8
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    void* v9;  // x19
    st_c231f0_1 *ptr;  // x0
    st_c231f0_1 *ptr1;  // x0
    st_c231f0_1 **v12;  // x19
    unsigned long long v13;  // 4102
    st_c231f0_1 *ptr2;  // x0
    unsigned long long v15;  // 4102
    long long v16;  // x0
    st_c231f0_1 *v0;  // [bp-0x60], Other Possible Types: char
    unsigned int v1;  // [bp-0x54]
    uint128_t v2;  // [bp-0x50]
    st_c231f0_1 *v3;  // [bp-0x40]
    unsigned int v4;  // [bp-0x3c]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    sub_bd8d30(&v0, a0);
    if (v0)
    {
        v7 = a2;
        if (a0->field_28 <= v7 || !(v8 = a0->field_20 + v7 * 32, v8->field_0 != 0x8000000000000000))
        {
            v16 = sub_c73c64(&g_efbbc0);
            a0->field_0 = a1;
            v17 = __Unwind_Resume(v16);
            a0->field_0 = a1;
            v18 = __Unwind_Resume(v17);
            sub_c23418(&v0);
            v19 = __Unwind_Resume(v18);
            sub_c73e0c(v19);
        }
        if (!v8->field_10)
            goto LABEL_c23398;
        v9 = v8->field_8 + 264 * v8->field_10;
        if (*(long long *)((char *)v9 - 240) != 16)
            return 0;
        if (v1 == (unsigned int)a1)
        {
            ptr = _malloc(264);
            if (ptr)
            {
                ptr->field_10[1] = 28;
                v0 = (st_c231f0_1 *)1;
                v2 = CONCAT(ptr, 1);
                v3 = 1;
                ptr1 = _malloc(40);
                if (!ptr1)
                {
                    sub_c6ba70(8, 40);
                    __debugbreak();
                }
                *(uint128_t *)&ptr1->field_0 = (uint128_t)v0;
                *(uint128_t *)ptr1->field_10 = v2;
                *(st_c231f0_1 **)&ptr1->field_18 = v3;
                v12 = v9 - 168;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v13 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v13 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec(v12);
                    *v12 = ptr1;
                    return 1;
                }
                goto LABEL_c23368;
            }
        }
        else
        {
            if (v4 != (unsigned int)a1)
                return 0;
            ptr2 = _malloc(264);
            if (ptr2)
            {
                ptr2->field_10[1] = 28;
                v0 = (st_c231f0_1 *)1;
                v2 = CONCAT(ptr2, 1);
                v3 = 1;
                ptr1 = _malloc(40);
                if (!ptr1)
                {
                    sub_c6ba70(8, 40);
                    __debugbreak();
                }
                *(uint128_t *)&ptr1->field_0 = (uint128_t)v0;
                *(uint128_t *)ptr1->field_10 = v2;
                *(st_c231f0_1 **)&ptr1->field_18 = v3;
                v12 = v9 - 160;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v15 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v15 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec(v12);
                }
LABEL_c23368:
                *v12 = ptr1;
                return 1;
            }
        }
    }
    else
    {
        sub_c73c64(&g_efbba8);
LABEL_c23398:
        sub_c73c64(&g_efbbd8);
    }
    sub_c6ba70(8, 264);
    sub_c6ba70(8, 40);
    __debugbreak();
}
