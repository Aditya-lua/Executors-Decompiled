/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc65068..0xc65154 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c65068_2 {
    char padding_0[136];
    unsigned long long field_88;
} st_c65068_2;

typedef struct st_c65068_3 {
    char padding_0[24];
    struct st_c65068_1 *field_18;
    char padding_20[2144];
    struct st_c65068_2 *field_880;
} st_c65068_3;

typedef struct st_c65068_1 {
    char padding_0[216];
    struct st_c65068_0 *field_d8;
} st_c65068_1;

typedef struct st_c65068_4 {
    char padding_0[24];
    unsigned int field_18;
} st_c65068_4;

typedef struct st_c65068_0 {
    char padding_0[80];
    char field_50;
} st_c65068_0;

extern unsigned int g_e88ecc;

unsigned long long sub_c65068(st_c65068_3 *a0, unsigned int a1, st_c65068_4 *a2)
{
    unsigned long long v3;  // x21
    unsigned long long v4;  // 4114
    unsigned long long v5;  // x23
    unsigned int *v6;  // x24
    unsigned int *v7;  // x25
    unsigned int *v8;  // x8
    unsigned long long v9;  // x0
    unsigned long v10;  // x8
    char v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(a1 & 128))
        v3 = 2 & ~(a1 >> 7);
    else
        v3 = 1;
    v4 = arm64g_calculate_condition(2, a0->field_880->field_88, 29, 0);
    if (v4 & 1)
        return 1;
    v5 = 0;
    v6 = &a2->field_18;
    v7 = &g_e88ecc;
    do
    {
        if (*(int *)((char *)v6 - 8))
        {
            v8 = v7;
            if (v5 >= 29)
            {
                v9 = sub_9a06cc(&a0->field_880->padding_0[128], v3, *v6, &v0);
                if (!v9)
                    return v9;
                v8 = v9 + 8;
            }
            v10 = *v8;
            if (!((unsigned int)v10 & a1))
            {
                return 0;
            }
            else if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
            {
                if (v10 >> 1 & 1)
                    return 0;
            }
            else
            {
                if (v10 & 1)
                    return 0;
            }
        }
    } while ((v6 += 10, v5 += 1, v7 += 14, a0->field_880->field_88 + 29 != v5));
    return 1;
}
