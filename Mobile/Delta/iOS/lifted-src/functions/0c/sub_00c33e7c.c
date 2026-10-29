/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc33e7c..0xc34050 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c33e7c_0 {
    char padding_0[16];
    unsigned int field_10;
} st_c33e7c_0;

typedef struct st_c33e7c_1 {
    char padding_0[1];
    unsigned short field_1;
} st_c33e7c_1;

extern unsigned long long g_98967f;
extern char g_e0eb50;

long long sub_c33e7c(unsigned long a0, st_c33e7c_0 *a1)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    long long v14;  // x5
    char *v15;  // x4
    st_c33e7c_0 *v16;  // x0
    long long v17;  // x2
    unsigned long long v18;  // x3
    unsigned long long k;  // x9
    unsigned long long v20;  // x12
    unsigned long long v21;  // x8
    unsigned long long v22;  // x9
    unsigned long long j;  // x9
    st_c33e7c_1 *iter;  // x12
    unsigned long long v24;  // x12
    unsigned long long v25;  // x9
    unsigned long long v7;  // x10
    unsigned long long v8;  // x11
    unsigned long long i;  // x0
    unsigned int v10;  // w2
    unsigned int v11;  // w3
    unsigned long long node;  // x10
    unsigned long long v13;  // x12
    uint224_t v0;  // [bp-0x24]
    uint224_t v1;  // [bp-0x24]
    uint96_t v2;  // [bp-0x14]
    char v3;  // [bp+0x0]

    v2 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v3);
    v4 = a1->field_10;
    if (v4 >> 25 & 1)
    {
        j = *(long long *)a0;
        v24 = 15;
        do
        {
            v21 = v24;
            v25 = j >> 4;
            *((char *)&v0 + v21) = (&g_e0eb50)[j & 15];
            v24 = v21 - 1;
            j = v25;
        } while (j);
        goto LABEL_c33f94;
    }
    else if (!(v4 >> 26 & 1))
    {
        v5 = *(long long *)a0;
        if (v5 >= 1000)
        {
            iter = (char *)&v2 + 3;
            v7 = 0xffffffffffffffec;
            v8 = v5;
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
            if (9 < v8)
                goto LABEL_c33fd0;
        }
        else
        {
            node = 20;
            v8 = v5;
            if (v5 > 9)
            {
LABEL_c33fd0:
                node -= 2;
                v13 = 5243 * (__ROL__((unsigned int)v8, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v8 - 100 * (unsigned int)v13 & 0xffff) + 14721940);
                v8 = v13;
            }
        }
        if (!v5 || v8)
        {
            node -= 1;
            *((char *)&v0 + node) = *(char *)(((v8 * 2 | v8 >> 63) & 30 & 31) + 14721941);
        }
        v14 = 20 - node;
        v15 = (char *)&v0 + node;
        v16 = a1;
        v17 = 1;
        v18 = 0;
    }
    else
    {
        k = *(long long *)a0;
        v20 = 15;
        v1 = v0;
        do
        {
            v21 = v20;
            v22 = k >> 4;
            *((char *)&v1 + v21) = *(char *)((k & 15) + 14740256);
            v20 = v21 - 1;
            k = v22;
        } while (k);
LABEL_c33f94:
        v14 = 0x11 - (v21 + 1);
        v17 = "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v15 = (char *)&v0 + v21;
        v16 = a1;
        v18 = 2;
    }
    return sub_be8310(v16, 1, v17, v18, v15, v14);
}
