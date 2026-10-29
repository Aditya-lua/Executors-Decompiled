/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c96c..0x95cab8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c96c_0 {
    char padding_0[344];
    struct st_95c96c_1 *field_158;
} st_95c96c_0;

typedef struct st_95c96c_1 {
    char padding_0[32];
    unsigned long long field_20;
} st_95c96c_1;

typedef struct st_95c96c_3 {
    unsigned int field_0;
} st_95c96c_3;

typedef struct st_95c96c_4 {
    unsigned long long field_0;
} st_95c96c_4;

typedef struct st_95c96c_2 {
    char field_0;
    char padding_1[23];
    struct st_95c96c_0 *field_18;
    struct st_95c96c_3 *field_20;
    char padding_28[8];
    struct st_95c96c_4 *field_30;
    char padding_38[56];
    long long field_70;
} st_95c96c_2;

extern long long g_afa390;

unsigned long long sub_95c96c(st_95c96c_2 *a0)
{
    st_95c96c_1 *v2;  // x21
    unsigned int *v3;  // x0
    unsigned long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long idx;  // x22
    unsigned long long v7;  // x23
    unsigned long long v8;  // x20
    unsigned long long v9;  // w0
    unsigned int *v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_18)
    {
        v2 = a0->field_18->field_158;
        if (a0->field_18->field_158)
            goto LABEL_95c998;
    }
    else
    {
        v3 = a0->field_20;
        if (v3 && (v4 = *v3, !(unsigned int)v4 || v4 >> 7 & 1 && (v3 = sub_980dc8(), v3)))
        {
            v2 = *(long long *)&v3[544];
            if (*(long long *)&v3[544])
            {
LABEL_95c998:
                if (a0->field_0 >> 6 & 1)
                {
                    v5 = *(long long *)&a0->padding_38[0];
                    if (*(long long *)&a0->padding_38[0])
                    {
                        idx = 0;
                        v7 = 8;
                        do
                        {
                            v8 = *(long long *)&a0->field_30[idx];
                            if (!v8 || *(long long *)(v2->field_20 + v7) || !(a0->field_0 >> 5 & 1))
                                continue;
                            if (a0->field_18)
                            {
                                v9 = (unsigned int)sub_964ccc(a0->field_18, v8, 1);
                                v10 = a0->field_20;
                                if (!a0->field_20)
                                    goto LABEL_95ca10;
                            }
                            else
                            {
                                v9 = 1;
                                v10 = a0->field_20;
                                if (!a0->field_20)
                                    goto LABEL_95ca10;
                            }
                            v9 = (unsigned int)sub_9647c8(v10, v8, 1);
LABEL_95ca10:
                            if (v9 < 1)
                                return 0;
                            v5 = *(long long *)&a0->padding_38[0];
                        } while ((idx += 1, v7 += 40, v5 > idx));
                    }
                }
            }
        }
    }
    if (a0->field_70)
    {
        if (a0->field_20)
        {
            sub_958e54(a0->field_20);
        }
        else if (a0->field_18)
        {
            sub_958ea4(a0->field_18);
        }
        else
        {
            sub_ad6958(a0->field_70, &g_afa390);
        }
        a0->field_70 = 0;
    }
    return 1;
}
