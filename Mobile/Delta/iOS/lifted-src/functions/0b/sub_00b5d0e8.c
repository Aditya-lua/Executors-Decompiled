/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d0e8..0xb5d390 (680 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5d0e8_2 {
    char field_0;
    char padding_1[15];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[12];
    unsigned long long field_34;
    char padding_3c[4];
    unsigned long long field_40;
    char padding_48[72];
    struct st_b5d0e8_0 *field_90;
} st_b5d0e8_2;

typedef struct st_b5d0e8_0 {
    char padding_0[8];
    struct st_b5d0e8_1 *field_8;
    struct st_b5d0e8_1 *field_10;
    struct st_b5d0e8_1 *field_18;
    struct st_b5d0e8_1 *field_20;
} st_b5d0e8_0;

typedef struct st_b5d0e8_1 {
    unsigned long long field_0;
} st_b5d0e8_1;


char sub_b5d0e8(st_b5d0e8_2 *a0, char a1, unsigned long a2, char a3, char a4)
{
    unsigned long v9;  // x8
    unsigned long long v10;  // x24
    char v19;  // w0
    st_b5d0e8_0 *v20;  // x21
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // 4157
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v9 = a0->field_0;
    if (!(v9 >> 1 & 1))
        return 0;
    v0 = v10;
    v1 = v11;
    v2 = v12;
    v3 = v13;
    v4 = v14;
    v5 = v15;
    v6 = &v8;
    v7 = v16;
    v17 = arm64g_calculate_condition(2, a0->field_20, 1, 0);
    if (!(v17 & 1))
    {
        v19 = 0;
        if (a1 == a3 && a3 && sub_a2f9e0())
        {
            if (a4 >= a0->field_10 + 8)
            {
                if (a0->field_0 & 1)
                    *(long long *)a1 = *(long long *)a0->padding_3c;
                *(long long *)&(a0->padding_28)[1] = *(long long *)a3;
                (*(long long *)(*(long long *)&a0->padding_48[64] + 8))();
            }
            goto LABEL_b5d220;
        }
    }
    else
    {
        v20 = *(long long *)&a0->padding_48[64];
        if (a1 && !a3)
        {
            v19 = 1;
        }
        else
        {
            if (v9 >> 2 & 1)
            {
                if (a1)
                {
                    if (!(v9 >> 4 & 1))
                    {
                        v20->field_8();
                    }
                    else if (v9 & 1)
                    {
                        v20->field_18();
                    }
                    else if (v9 >> 3 & 1)
                    {
                        v20->field_20();
                    }
                }
                else
                {
                    if (!a3)
                    {
                        v20->field_8();
                    }
                    else if (!a4 || v9 >> 4 & 1)
                    {
                        v20->field_10();
                    }
                }
            }
LABEL_b5d220:
            v19 = 0;
        }
    }
    *(unsigned long long *)a2 = 0;
    return v19;
}
