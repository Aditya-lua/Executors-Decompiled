/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8634..0xbe8808 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be8634_1 {
    char padding_0[16];
    unsigned int field_10;
} st_be8634_1;

typedef struct st_be8634_2 {
    char padding_0[1];
    unsigned short field_1;
} st_be8634_2;

typedef struct st_be8634_0 {
    unsigned long long field_0;
} st_be8634_0;

extern unsigned long long g_98967f;
extern char g_e0eb50;

long long sub_be8634(st_be8634_0 **a0, st_be8634_1 *a1)
{
    unsigned long long j;  // x8
    unsigned long v5;  // x9
    unsigned long long v14;  // x12
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    long long v19;  // x5
    char *v20;  // x4
    st_be8634_1 *v21;  // x0
    long long v22;  // x2
    unsigned long long v23;  // x3
    st_be8634_2 *iter;  // x12
    unsigned long long v24;  // x12
    unsigned long long v25;  // x9
    unsigned long long v26;  // x8
    unsigned long long v27;  // x12
    unsigned long long v28;  // x8
    unsigned long long v7;  // x10
    unsigned long long v8;  // x11
    unsigned long long i;  // x0
    unsigned int v10;  // w2
    unsigned int v11;  // w3
    unsigned long long node;  // x10
    unsigned long v13;  // cc_dep1
    uint224_t v0;  // [bp-0x24]
    uint224_t v1;  // [bp-0x24]
    uint96_t v2;  // [bp-0x14]
    char v3;  // [bp+0x0]

    v2 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v3);
    j = *(long long *)*a0;
    v5 = a1->field_10;
    if (v5 >> 25 & 1)
    {
        v27 = 15;
        do
        {
            v25 = v27;
            v28 = j >> 4;
            *((char *)&v0 + v25) = (&g_e0eb50)[j & 15];
            v27 = v25 - 1;
            j = v28;
        } while (j);
        goto LABEL_be8748;
    }
    else if (!(v5 >> 26 & 1))
    {
        if (j >= 1000)
        {
            iter = (char *)&v2 + 3;
            v7 = 0xffffffffffffffec;
            v8 = j;
            do
            {
                i = v8;
                v8 /= 10000;
                v10 = (unsigned int)i - 10000 * (unsigned int)v8;
                v11 = 5243 * ((v10 * 0x40000000 | v10 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)iter - 3) = *(short *)(2 * v11 + 14721940);
                *(short *)((char *)iter - 1) = *(short *)(2 * (v10 - 100 * v11 & 0xffff) + 14721940);
                v7 += 4;
                iter = (char *)iter - 4;
            } while (&g_98967f < i);
            node = -v7;
            v13 = v8;
            if (9 < v8)
                goto LABEL_be8784;
        }
        else
        {
            node = 20;
            v8 = j;
            v13 = j;
            if (j > 9)
            {
LABEL_be8784:
                node -= 2;
                v14 = 5243 * (__ROL__((unsigned int)v8, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v8 - 100 * (unsigned int)v14 & 0xffff) + 14721940);
                v8 = v14;
            }
        }
        if (j)
        {
            v15 = arm64g_calculate_condition(20, v13, 9, 0);
            v16 = arm64g_calculate_condition(4, (v15 & 1 ? v8 : 0), 0, 0);
            if (!(v16 & 1))
                goto LABEL_be87c0;
        }
        else
        {
            v17 = arm64g_calculate_condition(20, v13, 9, 0);
            v18 = arm64g_calculate_condition(0, (v17 & 1 ? v8 : 0), 0, 0);
            if (!(v18 & 1))
            {
LABEL_be87c0:
                node -= 1;
                *((char *)&v0 + node) = *(char *)(((v8 * 2 | v8 >> 63) & 30 & 31) + 14721941);
            }
        }
        v19 = 20 - node;
        v20 = (char *)&v0 + node;
        v21 = a1;
        v22 = 1;
        v23 = 0;
    }
    else
    {
        v24 = 15;
        v1 = v0;
        do
        {
            v25 = v24;
            v26 = j >> 4;
            *((char *)&v1 + v25) = *(char *)((j & 15) + 14740256);
            v24 = v25 - 1;
            j = v26;
        } while (j);
LABEL_be8748:
        v19 = 0x11 - (v25 + 1);
        v22 = "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v20 = (char *)&v0 + v25;
        v21 = a1;
        v23 = 2;
    }
    return sub_be8310(v21, 1, v22, v23, v20, v19);
}
