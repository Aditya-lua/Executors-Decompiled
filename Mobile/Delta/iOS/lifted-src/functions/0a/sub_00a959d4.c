/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa959d4..0xa95d28 (852 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a959d4_0 {
    char padding_0[16];
    char field_10;
    char padding_11[39];
    unsigned long long field_38;
    uint128_t field_40;
    char padding_50[280];
    struct st_a959d4_1 *field_168;
    struct st_a959d4_1 *field_170;
    unsigned int field_178;
    unsigned int field_17c;
    struct st_a959d4_1 *field_180;
    char padding_188[8];
    char field_190[16];
} st_a959d4_0;

typedef struct st_a959d4_1 {
    unsigned long long field_0;
} st_a959d4_1;


unsigned int sub_a959d4(st_a959d4_0 *a0, char *a1, char *a2, unsigned int a3, unsigned long a4)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // 4187
    unsigned int v5;  // x20
    char *iter;  // x21
    char *node;  // x22
    unsigned int v8;  // w27
    unsigned int v9;  // w8
    unsigned long long v10;  // x11
    char v11;  // x12
    unsigned int v12;  // w8
    unsigned long long v0;  // [bp-0x68]
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
        node = a1;
        a0->field_38 = v3;
        if (!a0->field_17c)
        {
            v8 = a0->field_178;
        }
        else if (v5)
        {
            *(uint128_t *)a0->field_190 = a0->field_40;
            a0->field_17c = 0;
            *(unsigned long long *)&a0->field_40 = 0;
            *(unsigned long long *)((char *)&a0->field_40 + 8) = 0;
            v8 = 16;
        }
        else
        {
            a0->field_170();
        }
        v9 = v8 & 15;
        if (v8 & 15)
        {
            if (v5)
            {
                do
                {
                    v10 = v5;
                    v11 = *node;
                    node += 1;
                    a0->field_190[v8] = v11;
                    v8 += 1;
                    *iter = (&a0->field_10)[v9] ^ v11;
                    iter += 1;
                    v12 = v9 + 1;
                    v9 = v12 & 15;
                } while (v12 & 15 && (v5 = v10 - 1, v10 != 1));
                if (!v9)
                    a0->field_168();
            }
            a0->field_178 = v8;
            return 0;
        }
        if (v5 >= 16 && v8)
            a0->field_168();
        if (v5 >= 0xc00)
            a0->field_168();
        v0 = v5 & 0xff0;
        if (v5 & 0xff0)
        {
            a0->field_168();
        }
        else if (v5)
        {
            a0->field_180();
        }
        else
        {
            a0->field_178 = v8;
            return 0;
        }
    }
    else
    {
        return 0xffffffff;
    }
}
