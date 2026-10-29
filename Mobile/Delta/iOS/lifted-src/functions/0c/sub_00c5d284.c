/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5d284..0xc5d358 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5d284_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    long long field_10;
    char padding_18[16];
    long long field_28;
    long long field_30;
} st_c5d284_0;

typedef struct st_c5d284_1 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
    long long field_40;
    long long field_48;
} st_c5d284_1;


double sub_c5d284(st_c5d284_1 *a0, st_c5d284_0 *a1)
{
    long long v11;  // x20
    long long v12;  // x21
    unsigned long v13;  // x8
    uint128_t v14;  // q0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x80]
    char v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x68]
    uint128_t v6;  // [bp-0x58]
    uint128_t v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    if (a1->field_0 == 3)
    {
        v11 = a1->field_8;
        v12 = a1->field_10;
        goto LABEL_c5d2bc;
    }
    else
    {
        v11 = a1->field_28;
        if (a1->field_28)
        {
            v12 = a1->field_30;
LABEL_c5d2bc:
            sub_be8f00(&v4, v11, v12);
            if (v4 == 1)
            {
                v13 = 2;
            }
            else
            {
                sub_c3a750(&v4, v5, *(unsigned long long *)((void*)&v5 + 8));
                v13 = v4;
                if (v13 != 2)
                {
                    v0 = v5;
                    v1 = v6;
                    v2 = v7;
                    v3 = v8;
                }
            }
            a0->field_0 = v13;
            *(uint128_t *)&(&a0->field_0)[1] = v0;
            *(uint128_t *)((char *)&a0->field_8 + 8) = v1;
            v14 = v2;
            *(uint128_t *)((char *)&a0->field_18 + 8) = v14;
            *(unsigned long long *)((char *)&a0->field_28 + 8) = v3;
            a0->field_38 = v11;
            a0->field_40 = v12;
        }
        else
        {
            a0->field_0 = 3;
        }
    }
    return (unsigned long long)v14;
}
