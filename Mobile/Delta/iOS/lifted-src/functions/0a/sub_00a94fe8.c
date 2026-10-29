/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94fe8..0xa95348 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a94fe8_0 {
    char padding_0[16];
    char field_10;
    char padding_11[39];
    unsigned long long field_38;
    uint128_t field_40;
    char padding_50[280];
    struct st_a94fe8_1 *field_168;
    struct st_a94fe8_1 *field_170;
    unsigned long long field_178;
    unsigned int field_17c;
    struct st_a94fe8_1 *field_180;
    char padding_188[8];
    char field_190[16];
} st_a94fe8_0;

typedef struct st_a94fe8_1 {
    unsigned long long field_0;
} st_a94fe8_1;


unsigned long long sub_a94fe8(st_a94fe8_0 *a0, char *a1, char *a2, unsigned long long a3)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4187
    char v13;  // x12
    unsigned long long v14;  // w8
    unsigned long long v5;  // x25
    char *iter;  // x20
    char *v7;  // x21
    unsigned long long *v8;  // x26
    unsigned long long v9;  // w22
    unsigned long long v10;  // w8
    unsigned long long v11;  // x11
    unsigned long long v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_38 + a3;
    v4 = arm64g_calculate_condition(50, a0->field_38, a3, 0);
    if (0xfffffffe0 < v3)
    {
        return 0xffffffff;
    }
    else if (v4 & 1)
    {
        v5 = a3;
        iter = a2;
        v7 = a1;
        v8 = *(long long *)&a0->field_17c;
        a0->field_38 = v3;
        if (!*(int *)((char *)&a0->field_178 + 4))
        {
            v9 = (int)a0->field_178;
        }
        else if (v5)
        {
            *(uint128_t *)a0->padding_188 = a0->field_40;
            *(unsigned int *)((char *)&a0->field_178 + 4) = 0;
            *(unsigned long long *)&a0->field_40 = 0;
            *(unsigned long long *)((char *)&a0->field_40 + 8) = 0;
            v9 = 16;
        }
        else
        {
            a0->field_170();
        }
        v10 = v9 & 15;
        if (v9 & 15)
        {
            if (v5)
            {
                do
                {
                    v11 = v5;
                    v13 = (&a0->field_10)[v10] ^ *v7;
                    *iter = v13;
                    iter += 1;
                    a0->padding_188[v9] = v13;
                    v9 += 1;
                    v14 = v10 + 1;
                    v10 = v14 & 15;
                } while (v14 & 15 && (v5 = v11 - 1, v7 += 1, v11 != 1));
                if (!v10)
                    a0->field_168();
            }
            *(unsigned int *)&a0->field_178 = v9;
            return 0;
        }
        if (v5 >= 16 && v9)
            a0->field_168();
        if (v5 >= 0xc00)
        {
            v0 = v9;
            v8();
        }
        else if (v5 & 0xff0)
        {
            v8();
        }
        else if (v5)
        {
            v8();
        }
        else
        {
            *(unsigned int *)&a0->field_178 = v9;
            return 0;
        }
    }
    else
    {
        return 0xffffffff;
    }
}
