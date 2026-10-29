/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988b64..0x988ca4 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988b64_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    char field_20;
} st_988b64_1;

typedef struct st_988b64_0 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[15];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[16];
    char field_50;
} st_988b64_0;

typedef struct st_988b64_2 {
    unsigned long long field_0;
    char field_8;
} st_988b64_2;


char sub_988b64(st_988b64_0 *a0, char a1, st_988b64_1 *a2, st_988b64_2 *a3, char *a4)
{
    char v0;  // x10
    char idx;  // x8
    unsigned long long *iter;  // x14
    unsigned long long v11;  // x16
    char v12;  // x15
    char v13;  // x17
    unsigned long long v14;  // x16
    char v15;  // x17
    unsigned long long v16;  // x1
    char v17;  // x9
    char v18;  // x9
    char v2;  // x9
    unsigned long v3;  // x9
    char v4;  // x8
    char v5;  // x11
    unsigned long long v6;  // 4118
    char v7;  // x8
    char i;  // x10
    unsigned long long v9;  // x13

    if (2 > (unsigned long long)*(long long *)a4)
        return 0;
    v0 = 0;
    idx = (char)(struct st_988b64_0 *)&a0->field_20;
    do
    {
        v2 = v0;
        idx = *(long long *)idx;
    } while (a1 > v0 && (v0 = v2 + 1, idx));
    if (idx)
    {
        v3 = *(long long *)(idx + 16);
        v4 = *(long long *)(idx + 24) - v3;
        v5 = v4 + 1;
        v6 = arm64g_calculate_condition(50, v4, 1, 0);
        if (!(v6 & 1))
        {
            v7 = 0;
            i = 0;
        }
        else
        {
            i = 0;
            v7 = 0;
            v9 = a0->field_10;
            iter = &a3->field_8;
            do
            {
                v11 = i + v3;
                v12 = v9 - v11;
                if (v9 < v11)
                    return 0;
                if (v11 < a0->field_18)
                    return 0;
                v13 = (char)a0->padding_8;
                if (!v13)
                    break;
                v14 = v11 - v13 * v11 / v13;
                v15 = v13 - v14;
                if (v12 >= v15)
                    v12 = v15;
                if (!v12)
                    break;
                v16 = v5 - i;
                if (v5 < v12 + i)
                    v12 = v16;
                *(unsigned long long *)((char *)iter - 8) = a0->field_0 + v14;
                *iter = v12;
                i += v12;
                v7 += 1;
                iter += 2;
            } while (i < v5);
        }
        a2->field_8 = v3;
        *(unsigned long long *)&a2->padding_10[0] = i;
        if (!(a0->field_50 & 1))
            v17 = 0;
        else
            v17 = (i + v3 == a0->field_10) * 2;
        v18 = a2->field_20 & 0xfffffffd | v17;
    }
    else
    {
        if (v2 < a1)
            return 0;
        if ((a0->field_50 & 3) != 1)
            return 0;
        v7 = 0;
        a2->field_8 = a0->field_10;
        *(unsigned long long *)&a2->padding_10[0] = 0;
        v18 = a2->field_20 | 2;
    }
    a2->field_20 = v18;
    *(unsigned long long *)a4 = v7;
    return 1;
}
