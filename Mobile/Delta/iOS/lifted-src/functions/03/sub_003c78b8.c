/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c78b8..0x3c7b54 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c78b8_3 {
    struct st_3c78b8_3 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[8];
    struct st_3c78b8_0 *field_18;
    char padding_20[128];
    struct st_3c78b8_4 *field_a0;
} st_3c78b8_3;

typedef struct st_3c78b8_2 {
    char padding_0[32];
    struct st_3c78b8_3 *field_20;
} st_3c78b8_2;

typedef struct st_3c78b8_1 {
    unsigned int field_0;
} st_3c78b8_1;

typedef struct st_3c78b8_0 {
    char padding_0[480];
    struct st_3c78b8_1 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_3c78b8_0;

typedef struct st_3c78b8_4 {
    struct st_3c78b8_2 *field_0;
} st_3c78b8_4;

typedef struct st_3c78b8_7 {
    char field_0;
} st_3c78b8_7;

typedef struct st_3c78b8_5 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[280];
    struct st_3c78b8_3 *field_220;
} st_3c78b8_5;

typedef struct st_3c78b8_6 {
    char padding_0[96];
    struct st_3c78b8_5 *field_60;
} st_3c78b8_6;

extern unsigned long long g_e7d940;
extern st_3c78b8_6 *g_f0d198;
extern char g_10002b0;

st_3c78b8_3 * sub_3c78b8(st_3c78b8_3 *a0)
{
    st_3c78b8_3 *v12;  // x0
    st_3c78b8_3 *v13;  // w23
    unsigned int v22;  // w11
    unsigned long v14;  // x24
    unsigned long long v15;  // 4121
    st_3c78b8_3 **v16;  // x8
    st_3c78b8_3 *v17;  // x21
    char *v18;  // x0
    st_3c78b8_3 *i;  // w8
    char *v20;  // x9
    unsigned int v21;  // w10
    st_3c78b8_7 **v0;  // [bp-0xc0], Other Possible Types: char
    st_3c78b8_7 *v1;  // [bp-0xb8]
    uint128_t v2;  // [bp-0xb0], Other Possible Types: st_3c78b8_4 **, uint128_t
    st_3c78b8_3 *v3;  // [bp-0xb0]
    st_3c78b8_7 **v4;  // [bp-0xa0], Other Possible Types: char
    st_3c78b8_7 *v5;  // [bp-0x98]
    st_3c78b8_7 **v6;  // [bp-0x90], Other Possible Types: char
    st_3c78b8_7 *v7;  // [bp-0x88]
    st_3c78b8_3 **v8;  // [bp-0x80], Other Possible Types: st_3c78b8_4 **, uint128_t
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!g_f0d198->field_60->field_220)
    {
        v2 = CONCAT(9976379690625781718, 8670518361489532285);
        v8 = CONCAT(9976379690625781718, 8656108594400626989);
        v2 ^= v8;
        v12 = sub_3c7b54(&v2);
        v3 = (st_3c78b8_3 *)0;
        if (v12)
        {
            v13 = (st_3c78b8_3 *)0;
            v5 = &v4;
            v4 = &v5;
            v14 = (unsigned long)v12->padding_10;
            v7 = &v6;
            v6 = &v7;
            v15 = arm64g_calculate_condition(1, *(int *)(*(long long *)(v14 + 480) + (unsigned long long)v13 * 4), 1, 0);
            if (v15 & 1 || !(v16 = *(long long *)(v14 + 488) + (*(int *)(v14 + 496) & *(int *)(*(long long *)(v14 + 480) + (unsigned long long)v13 * 4)) * 16, !(int)v16[1]))
                continue;
            v17 = *v16;
            v18 = sub_a0c8(*(long long *)&v17->field_1);
            v8 = &v3;
            v2 = &v8;
            i = (st_3c78b8_3 *)*v18;
            if (!i)
                continue;
            v20 = v18 + 1;
            v21 = 3760312;
            v22 = 23;
            do
            {
                v21 = (v21 ^ i) * v22;
                i = (st_3c78b8_3 *)*v20;
                v20 += 1;
                v22 += 23;
            } while (i);
            if (v21 == 3826194774 && v17)
            {
                v8 = &v2;
                v2 = &v8;
                if (*(long long *)(*(long long *)*(long long *)&v17->padding_20[120] + 32))
                    (*(long long *)(*(long long *)*(long long *)&v17->padding_20[120] + 32))();
                goto LABEL_3c7a8c;
            }
            v13 = (char *)&v13->field_0 + 1;
            if (v13 >> ((char)*(int *)(v14 + 500) & 31))
            {
LABEL_3c7a8c:
                if (a0)
                {
                    g_f0d198->field_60->field_100 = g_f0d198->field_60->field_100 | 0x4000000000000;
                    goto *((void *)(g_e7d940));
                }
                else
                {
                    goto *((void *)(g_e7d940));
                }
            }
        }
        else
        {
            if (a0)
                g_f0d198->field_60->field_100 = g_f0d198->field_60->field_100 | 0x4000000000000;
            goto *((void *)(g_e7d940));
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v9)
            return g_f0d198->field_60->field_220;
        ___stack_chk_fail();
        __debugbreak();
    }
}
