/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3c5c8..0xc3c6a0 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3c5c8_0 {
    struct st_c3c5c8_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c3c5c8_0;

typedef struct st_c3c5c8_2 {
    uint128_t field_0;
    uint128_t field_1;
    uint128_t field_8;
} st_c3c5c8_2;

typedef struct st_c3c5c8_1 {
    char field_0;
} st_c3c5c8_1;


st_c3c5c8_2 * sub_c3c5c8(st_c3c5c8_2 *a0, st_c3c5c8_0 *a1)
{
    unsigned long v0;  // x11
    unsigned long v1;  // x8
    char *v2;  // x9
    uint128_t v4;  // x10
    unsigned int v5;  // w14
    unsigned int v6;  // w13
    unsigned long long v7;  // x10
    unsigned long long v8;  // 4115
    unsigned long long v9;  // 4113

    v0 = a1->field_8;
    v1 = a1->field_10;
    v2 = a1->field_0;
    if (v0 > v1 && v2[v1] == 95)
    {
        a1->field_10 = v1 + 1;
        *(unsigned long long *)((char *)&a0->field_0 + 8) = 0;
        *(char *)&a0->field_0 = 0;
        return a0;
    }
    v4 = 0;
    if (v0 < v1)
        v0 = v1;
LABEL_c3c608:
    if (v0 == v1)
    {
        *((char *)&a0->field_0 + 1) = 0;
        *(char *)&a0->field_0 = 1;
        return a0;
    }
    v5 = v2[v1];
    if (v5 == 95)
    {
        a1->field_10 = v1 + 1;
        v9 = arm64g_calculate_condition(2, v4, 1, 0);
        if (!(v9 & 1))
        {
            *(unsigned long long *)((char *)&a0->field_0 + 8) = v4 + 1;
            *(char *)&a0->field_0 = 0;
            return a0;
        }
    }
    v6 = v5 - 48;
    if (v6 >= 10)
    {
        if (26 > v5 - 97)
        {
            v6 = v5 - 87;
        }
        else if (26 > v5 - 65)
        {
            v6 = v5 - 29;
        }
        else
        {
            *((char *)&a0->field_0 + 1) = 0;
            *(char *)&a0->field_0 = 1;
            return a0;
        }
    }
    v1 += 1;
    a1->field_10 = v1;
    if (v4 * 62 > 0xffffffffffffffff || !(v7 = v4 * 62, v4 = v7 + (v6 & 0xff), v8 = arm64g_calculate_condition(50, v7, v6 & 0xff, 0), v8 & 1))
    {
        *((char *)&a0->field_0 + 1) = 0;
        *(char *)&a0->field_0 = 1;
        return a0;
    }
    goto LABEL_c3c608;
}
