/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e46a8..0x9e4828 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e46a8_0 {
    struct st_9e46a8_1 *field_0;
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[4];
    char field_14;
} st_9e46a8_0;

typedef struct st_9e46a8_1 {
    char field_0;
} st_9e46a8_1;


char sub_9e46a8(st_9e46a8_0 *a0)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w8
    unsigned int v10;  // w8
    unsigned long i;  // x10
    char idx;  // x11
    char v13;  // w12
    char v14;  // x16
    int v15;  // w17
    char v16;  // x0
    char v17;  // x2
    unsigned long long v18;  // x0
    char v19;  // x2
    char v2;  // x9
    unsigned long long v20;  // x3
    unsigned long long v21;  // x3
    unsigned long long v22;  // x0
    unsigned long long v23;  // x3
    unsigned int v24;  // w1
    char v3;  // x11
    unsigned long long v4;  // x9
    char v5;  // x11
    unsigned long long v6;  // x14
    unsigned long long v7;  // x15
    unsigned long long v8;  // x16

    v0 = a0->field_8;
    v1 = v0 - 1;
    if (a0->field_14 >> 2 & 1)
    {
        i = a0->field_c;
        if ((int)i >= 1)
        {
            idx = 0;
            v13 = 0;
            v14 = 0;
            do
            {
                v15 = (int)((v1 ^ idx) - 1 & -v0) >> 31;
                v13 |= v15;
                v16 = *(long long *)&a0->field_0[8 * idx];
                v17 = v16 >> 32;
                if (v17)
                    v18 = v17;
                else
                    v18 = v16;
                v19 = v18 >> 16;
                if (v19)
                    v18 = v19;
                v20 = v18 >> 8;
                if (0xff >= v18)
                    v20 = v18;
                v21 = v20 >> 4;
                if (15 >= v20)
                    v21 = v20;
                v22 = v21;
                v23 = v22 >> 2;
                v24 = v16 != 0 | (v17 != 0) * 32 | (v19 != 0) * 16 | (v18 > 0xff) * 8 | (v20 > 15) * 4 | (v22 > 3) * 2;
                if (3 < v22)
                    v22 = v23;
                if (v22 > 1)
                    v24 += 1;
                v14 = (64 & ~v13) + v14 + (v24 & v15);
                idx += 1;
            } while (i != idx);
        }
        else
        {
            v14 = 0;
        }
        if (v0)
            return v14 & 0xffffffff;
        return 0;
    }
    else if (v0)
    {
        v2 = *(long long *)&a0->field_0[8 * v1];
        v3 = v2 >> 32;
        if (v3)
            v4 = v3;
        else
            v4 = v2;
        v5 = v4 >> 16;
        if (v5)
            v4 = v5;
        v6 = v4 >> 8;
        if (0xff >= v4)
            v6 = v4;
        v7 = v6 >> 4;
        if (15 >= v6)
            v7 = v6;
        v8 = v7 >> 2;
        if (3 >= v7)
            v8 = v7;
        v10 = v2 != 0 | v1 * 64 | (v3 != 0) * 32 | (v5 != 0) * 16 | (v4 > 0xff) * 8 | (v6 > 15) * 4 | (v7 > 3) * 2;
        if (v8 > 1)
            return v10 + 1;
        return v10;
    }
    else
    {
        return 0;
    }
}
