/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe7e80..0xbe8048 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be7e80_0 {
    char padding_0[16];
    unsigned int field_10;
} st_be7e80_0;

typedef struct st_be7e80_1 {
    char padding_0[1];
    unsigned short field_1;
} st_be7e80_1;

extern unsigned long long g_98967f;
extern char g_e0eb50;

long long sub_be7e80(unsigned long long j, st_be7e80_0 *a1)
{
    unsigned long v4;  // x8
    st_be7e80_1 *iter;  // x11
    char *v14;  // x4
    st_be7e80_0 *v15;  // x0
    long long v16;  // x2
    unsigned long long v17;  // x3
    unsigned long long v18;  // x11
    unsigned long long v19;  // x8
    unsigned long long v20;  // x0
    unsigned long long v21;  // x11
    unsigned long long v22;  // x0
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    unsigned long long i;  // x17
    unsigned int v9;  // w2
    unsigned int v10;  // w3
    unsigned long long node;  // x9
    unsigned long long v12;  // x11
    long long v13;  // x5
    uint224_t v0;  // [bp-0x24]
    uint224_t v1;  // [bp-0x24]
    uint96_t v2;  // [bp-0x14]
    char v3;  // [bp+0x0]

    v2 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v3);
    v4 = a1->field_10;
    if (v4 >> 25 & 1)
    {
        v21 = 15;
        do
        {
            v19 = v21;
            v22 = j >> 4;
            *((char *)&v0 + v19) = (&g_e0eb50)[j & 15];
            v21 = v19 - 1;
            j = v22;
        } while (j);
        goto LABEL_be7f8c;
    }
    else if (!(v4 >> 26 & 1))
    {
        if (j >= 1000)
        {
            iter = (char *)&v2 + 3;
            v6 = 0xffffffffffffffec;
            v7 = j;
            do
            {
                i = v7;
                v7 /= 10000;
                v9 = (unsigned int)i - 10000 * (unsigned int)v7;
                v10 = 5243 * ((v9 * 0x40000000 | v9 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)iter - 3) = *(short *)(2 * v10 + 14721940);
                *(short *)((char *)iter - 1) = *(short *)(2 * (v9 - 100 * v10 & 0xffff) + 14721940);
                v6 += 4;
                iter = (char *)iter - 4;
            } while (&g_98967f < i);
            node = -v6;
            if (9 < v7)
                goto LABEL_be7fc8;
        }
        else
        {
            node = 20;
            v7 = j;
            if (j > 9)
            {
LABEL_be7fc8:
                node -= 2;
                v12 = 5243 * (__ROL__((unsigned int)v7, 30) & 0xc0003fff & 0x3fff) >> 0x11;
                *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v7 - 100 * (unsigned int)v12 & 0xffff) + 14721940);
                v7 = v12;
            }
        }
        if (!j || v7)
        {
            node -= 1;
            *((char *)&v0 + node) = *(char *)(((v7 * 2 | v7 >> 63) & 30 & 31) + 14721941);
        }
        v13 = 20 - node;
        v14 = (char *)&v0 + node;
        v15 = a1;
        v16 = 1;
        v17 = 0;
    }
    else
    {
        v18 = 15;
        v1 = v0;
        do
        {
            v19 = v18;
            v20 = j >> 4;
            *((char *)&v1 + v19) = *(char *)((j & 15) + 14740256);
            v18 = v19 - 1;
            j = v20;
        } while (j);
LABEL_be7f8c:
        v13 = 0x11 - (v19 + 1);
        v16 = "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...";
        v14 = (char *)&v0 + v19;
        v15 = a1;
        v17 = 2;
    }
    return sub_be8310(v15, 1, v16, v17, v14, v13);
}
