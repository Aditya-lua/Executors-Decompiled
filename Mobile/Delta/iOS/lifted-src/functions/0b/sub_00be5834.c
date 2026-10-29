/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe5834..0xbe5c74 (1088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be5834_3 {
    char padding_0[8];
    struct st_be5834_2 *field_8;
    unsigned int field_10;
} st_be5834_3;

typedef struct st_be5834_4 {
    char padding_0[15];
    char field_f;
    unsigned short field_10;
    unsigned short field_12;
    char field_13;
} st_be5834_4;

typedef struct st_be5834_2 {
    char padding_0[24];
    struct st_be5834_0 *field_18;
} st_be5834_2;

typedef struct st_be5834_5 {
    char padding_0[1];
    unsigned short field_1;
} st_be5834_5;

typedef struct st_be5834_0 {
    unsigned long long field_0;
} st_be5834_0;

typedef struct st_be5834_1 {
    struct st_be5834_0 *field_0;
} st_be5834_1;

extern unsigned long long g_98967f;
extern char g_e0eb50;

long long sub_be5834(st_be5834_1 **a0, st_be5834_3 *a1)
{
    unsigned long long *v5;  // x21
    unsigned long v6;  // x8
    unsigned long v15;  // cc_dep1
    unsigned long long v16;  // x11
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long k;  // x9
    unsigned long long v22;  // x12
    unsigned long long v23;  // x8
    unsigned long long v24;  // x9
    unsigned long long v7;  // x8
    unsigned long long j;  // x9
    unsigned long long v26;  // x12
    unsigned long long v27;  // x9
    st_be5834_5 *iter;  // x12
    unsigned long long v9;  // x11
    unsigned long long v10;  // x10
    unsigned long long i;  // x0
    unsigned int v12;  // w1
    unsigned int v13;  // w2
    unsigned long long node;  // x9
    st_be5834_4 v0;  // [bp-0x44]
    st_be5834_4 v1;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *(long long *)*a0;
    v6 = a1->field_10;
    if (!(v6 >> 25 & 1))
    {
        if (!(v6 >> 26 & 1))
        {
            v7 = *v5;
            if (v7 >= 1000)
            {
                iter = (char *)&v0.field_12 + 1;
                v9 = 0xffffffffffffffec;
                v10 = v7;
                do
                {
                    i = v10;
                    v10 /= 10000;
                    v12 = (unsigned int)i - 10000 * (unsigned int)v10;
                    v13 = 5243 * ((v12 * 0x40000000 | v12 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
                    *(short *)((char *)iter - 3) = *(short *)(2 * v13 + 14721940);
                    *(short *)((char *)iter - 1) = *(short *)(2 * (v12 - 100 * v13 & 0xffff) + 14721940);
                    v9 += 4;
                    iter = (char *)iter - 4;
                } while (&g_98967f < i);
                node = -v9;
                v15 = v10;
                if (9 < v10)
                    goto LABEL_be59a8;
            }
            else
            {
                node = 20;
                v10 = v7;
                v15 = v7;
                if (v7 > 9)
                {
LABEL_be59a8:
                    node -= 2;
                    v16 = 5243 * (__ROL__((unsigned int)v10, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                    *(short *)&v0.padding_0[node] = *(short *)(2 * ((unsigned int)v10 - 100 * (unsigned int)v16 & 0xffff) + 14721940);
                    v10 = v16;
                }
            }
            if (v7)
            {
                v17 = arm64g_calculate_condition(20, v15, 9, 0);
                v18 = arm64g_calculate_condition(4, (v17 & 1 ? v10 : 0), 0, 0);
                if (!(v18 & 1))
                    goto LABEL_be59ec;
            }
            else
            {
                v19 = arm64g_calculate_condition(20, v15, 9, 0);
                v20 = arm64g_calculate_condition(0, (v19 & 1 ? v10 : 0), 0, 0);
                if (!(v20 & 1))
                {
LABEL_be59ec:
                    node -= 1;
                    v0.padding_0[node] = *(char *)(((v10 * 2 | v10 >> 63) & 30 & 31) + 14721941);
                }
            }
            if (sub_be8310(a1, 1, 1, 0, &v0.padding_0[node], 20 - node) & 1)
                return 1;
        }
        else
        {
            k = *v5;
            v22 = 15;
            v1 = v0;
            do
            {
                v23 = v22;
                v24 = k >> 4;
                v1.padding_0[v23] = *(char *)((k & 15) + 14740256);
                v22 = v23 - 1;
                k = v24;
            } while (k);
LABEL_be5960:
            if (sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, &v0.padding_0[v23], 0x11 - (v23 + 1)) & 1)
                return 1;
        }
        a1->field_8->field_18();
    }
    else
    {
        j = *v5;
        v26 = 15;
        do
        {
            v23 = v26;
            v27 = j >> 4;
            v0.padding_0[v23] = (&g_e0eb50)[j & 15];
            v26 = v23 - 1;
            j = v27;
        } while (j);
        goto LABEL_be5960;
    }
}
