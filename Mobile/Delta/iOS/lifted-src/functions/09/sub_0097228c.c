/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97228c..0x972498 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97228c_0 {
    char field_0;
    char padding_1[3];
    char field_4;
    char field_5;
    char padding_6[34];
    long long field_28;
    unsigned long long field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
    unsigned long long field_48;
} st_97228c_0;


void sub_97228c(st_97228c_0 *a0)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    char v20;  // x21
    char v21;  // x8
    unsigned long v22;  // x9
    char v23;  // x24
    unsigned long v24;  // x8
    char v25;  // x8
    unsigned long v26;  // x9
    unsigned long v27;  // x8
    char v28;  // x8
    unsigned long v29;  // x9
    unsigned long long v12;  // x22
    unsigned long v30;  // x8
    char v31;  // x8
    unsigned long v32;  // x9
    unsigned long v33;  // x8
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v17;  // x9
    unsigned long long v18;  // x8
    unsigned long long v19;  // 4119
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    a0->padding_6[10] = 0;
    if (!(a0->field_0 >> 1 & 1))
        return;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    sub_9721c8();
    v17 = a0->field_5;
    v18 = a0->field_48 * 32;
    v19 = arm64g_calculate_condition(2, v18, v17 * 4, 0);
    if (v19 & 1)
        return;
    v20 = 0;
    do
    {
        if (!a0->field_4)
        {
            sub_972a64(a0);
            v21 = *(long long *)&a0->field_38;
            v22 = a0->field_40;
            if (v21 == a0->field_40)
            {
                v0 = 0;
                if (v21)
                {
                    v23 = 0;
                    do
                    {
                        if (!sub_9d4248(a0->field_28, a0->field_30 + v23, v21 - v23, &v0))
                            goto LABEL_972460;
                    } while ((v23 += v0, v21 = a0->field_40, v23 < v21));
                }
                v22 = 0;
            }
            v24 = a0->field_30;
            a0->field_40 = v22 + 1;
            *(char *)(v24 + v22) = 32;
            v25 = *(long long *)&a0->field_38;
            v26 = a0->field_40;
            if (v25 == a0->field_40)
            {
                v0 = 0;
                if (v25)
                {
                    v23 = 0;
                    do
                    {
                        if (!sub_9d4248(a0->field_28, a0->field_30 + v23, v25 - v23, &v0))
                            goto LABEL_972460;
                    } while ((v23 += v0, v25 = a0->field_40, v23 < v25));
                }
                v26 = 0;
            }
            v27 = a0->field_30;
            a0->field_40 = v26 + 1;
            *(char *)(v27 + v26) = 32;
            v28 = *(long long *)&a0->field_38;
            v29 = a0->field_40;
            if (v28 == a0->field_40)
            {
                v0 = 0;
                if (v28)
                {
                    v23 = 0;
                    do
                    {
                        if (!sub_9d4248(a0->field_28, a0->field_30 + v23, v28 - v23, &v0))
                            goto LABEL_972460;
                    } while ((v23 += v0, v28 = a0->field_40, v23 < v28));
                }
                v29 = 0;
            }
            v30 = a0->field_30;
            a0->field_40 = v29 + 1;
            *(char *)(v30 + v29) = 32;
            v31 = *(long long *)&a0->field_38;
            v32 = a0->field_40;
            if (v31 == a0->field_40)
            {
                v0 = 0;
                if (v31)
                {
                    v23 = 0;
                    do
                    {
                        if (!sub_9d4248(a0->field_28, a0->field_30 + v23, v31 - v23, &v0))
                        {
LABEL_972460:
                            _memmove(a0->field_30, a0->field_30 + v23, a0->field_40 - v23);
                            a0->field_40 = 0;
                            a0->field_4 = 1;
                        }
                    } while ((v23 += v0, v31 = a0->field_40, v23 < v31));
                }
                v32 = 0;
            }
            v33 = a0->field_30;
            a0->field_40 = v32 + 1;
            *(char *)(v33 + v32) = 32;
        }
    } while ((v20 += 1, v20 != v18 + v17 * 4));
    return;
}
