/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f318..0xa7f4b0 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7f318_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
} st_a7f318_1;

typedef struct st_a7f318_0 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[32];
    unsigned int field_38;
} st_a7f318_0;

extern unsigned long long g_a7f4b0;

unsigned long long sub_a7f318(st_a7f318_1 *a0, unsigned long a1, unsigned long long a2, st_a7f318_0 *a3)
{
    unsigned long long *v4;  // x23
    unsigned long long v5;  // x20
    char *v14;  // x22
    unsigned long long v15;  // cc_dep2
    unsigned long long v16;  // x13
    unsigned long long v18;  // x11
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x9
    unsigned long long v6;  // x24
    unsigned long long v24;  // x12
    char *v25;  // x13
    unsigned long long v26;  // x14
    unsigned long long v27;  // x12
    unsigned long v28;  // x15
    unsigned long long v29;  // x8
    unsigned long v30;  // x9
    unsigned long long v31;  // x8
    unsigned long v7;  // x20
    unsigned long long v8;  // x8
    unsigned long long v9;  // x23
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_ndep
    unsigned long v12;  // x19
    unsigned long long v13;  // x21
    char *v0;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a3->field_14 == 0x80000)
        v4 = &g_a7f4b0;
    else
        v4 = "\n";
    if ((long long)a2 < 0)
        return 0;
    v5 = *(long long *)&a0[1].padding_0[0];
    v6 = a2 - v5;
    if (a2 >= v5)
    {
        _memcpy(a0->field_20);
        v0 = a1 + v5;
        v1 = v6;
        if (*(long long *)&a0->padding_0[8])
            v4();
        v7 = a3->field_38;
        v8 = v6 - v7;
        if (v6 >= v7)
        {
            v9 = a0->field_18;
            v10 = 4;
            v11 = 0;
            if (v8 >= v9)
            {
                v12 = a0->field_10;
                v13 = v0;
                v14 = v13 + v7;
                v0 = &v14[v9];
                v1 = v8 - v9;
                v15 = v9;
                if (v12)
                    _bzero(v12, v9 * 0x400);
                v16 = 0;
                while (1)
                {
                    v18 = *v14;
                    v14 += 1;
                    if (v16 <= v18)
                    {
                        v19 = arm64g_calculate_condition(v10 | 32, v8, v15, v11);
                        v20 = arm64g_calculate_condition(0x33, (v19 & 1 ? v7 & 0xffffffff : 0), (v19 & 1 ? v18 & 0xff : 0), 0);
                        if (v20 & 1)
                            break;
                    }
                    else
                    {
                        v21 = arm64g_calculate_condition(v10 | 32, v8, v15, v11);
                        v22 = arm64g_calculate_condition(48, (v21 & 1 ? v7 & 0xffffffff : 0), (v21 & 1 ? v18 & 0xff : 0), 0);
                        if (v22 & 1)
                            break;
                    }
                    v23 = v16;
                    v24 = v18 - v16;
                    if (v18 <= v16)
                    {
LABEL_a7f408:
                        v8 = v12 + 0x400;
                        v10 = 4;
                        v11 = 0;
                        v12 = v8;
                        v15 = v12 + v9 * 0x400;
                        if (v15 <= v12)
                        {
                            if (v7 <= v16)
                                return !v1;
                            if (v18 >= v23)
                                v23 = v18;
                            v29 = v7 - v23;
                            v30 = v13 + v23;
                            do
                            {
                                v31 = v29;
                                if (*(char *)v30)
                                    return 0;
                            } while ((v29 = v31 - 1, v30 += 1, v31 != 1));
                            return !v1;
                        }
                    }
                    else
                    {
                        v25 = v13 + v23;
                        v26 = 0xffffffff;
                        while (1)
                        {
                            v27 = v24;
                            v28 = *v25;
                            v25 += 1;
                            if (!(v26 >> 31 & 1) && (int)v26 >= (int)v28)
                                break;
                            *(unsigned int *)(v12 + (v28 & 0xff) * 4) = 1;
                            v24 = v27 - 1;
                            v26 = v28;
                            if (v27 == 1)
                            {
                                v16 = v18;
                                goto LABEL_a7f408;
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}
