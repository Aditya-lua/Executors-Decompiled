/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc620c8..0xc62240 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c620c8_1 {
    struct st_c620c8_0 *field_0;
    struct st_c620c8_0 *field_8;
    unsigned long long field_10;
} st_c620c8_1;

typedef struct st_c620c8_2 {
    struct st_c620c8_0 *field_0;
    struct st_c620c8_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
    struct st_c620c8_0 *field_20;
} st_c620c8_2;

typedef struct st_c620c8_0 {
    char padding_0[72];
    struct st_c620c8_0 *field_48;
    struct st_c620c8_0 *field_50;
    char padding_58[8];
    long long field_60;
    struct st_c620c8_0 *field_68;
} st_c620c8_0;


st_c620c8_0 * sub_c620c8(st_c620c8_1 *a0, st_c620c8_0 *a1, long long a2)
{
    unsigned long long v2;  // 4110
    st_c620c8_0 *v3;  // x22
    st_c620c8_0 *v4;  // x9
    st_c620c8_2 *v5;  // x8
    st_c620c8_0 *v6;  // x0
    st_c620c8_0 *v7;  // x8
    st_c620c8_0 *v8;  // x8
    st_c620c8_0 *v9;  // x8
    st_c620c8_0 *v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned long long)a2 <= (unsigned long long)a1->field_60)
        return a1;
    v2 = arm64g_calculate_condition(146, a2, 458, 0);
    if (!(v2 & 1))
        return 0;
    v3 = a1->field_50;
    if (a0->field_0 == a1)
        a0->field_0 = a1->field_48;
    if (a0->field_8 == a1)
        a0->field_8 = v3;
    v4 = a1->field_48;
    v5 = &a1->field_48;
    if (v3)
        v3->field_48 = v4;
    if (v4)
        v4->field_50 = v3;
    a0->field_10 = a0->field_10 - 1;
    v5->field_0 = 0;
    v5->field_8 = 0;
    if (!a1->field_68)
    {
        v6 = sub_a6c1b4(a1, a2 + 456, "ssl/quic/quic_record_rx.c", 649);
        if (v6)
        {
            if (v3)
            {
                v7 = v3->field_48;
                v6->field_48 = v7;
                v6->field_50 = v3;
                if (v7)
                    v7->field_50 = v6;
                v3->field_48 = v6;
                if (a0->field_8 == v3)
                    goto LABEL_c621a0;
            }
            else
            {
                v8 = a0->field_0;
                if (v8)
                    v8->field_50 = v6;
                v6->field_48 = v8;
                v6->field_50 = 0;
                a0->field_0 = v6;
                if (!a0->field_8)
                {
LABEL_c621a0:
                    a0->field_8 = v6;
                }
            }
            a0->field_10 = a0->field_10 + 1;
            v6->field_60 = a2;
            return v6;
        }
        else
        {
            if (v3)
            {
                v9 = v3->field_48;
                a1->field_48 = v9;
                a1->field_50 = v3;
                if (v9)
                    v9->field_50 = a1;
                v3->field_48 = a1;
                if (a0->field_8 == v3)
                    goto LABEL_c621dc;
            }
            else
            {
                v10 = a0->field_0;
                if (v10)
                    v10->field_50 = a1;
                a1->field_48 = v10;
                a1->field_50 = 0;
                a0->field_0 = a1;
                if (!a0->field_8)
                {
LABEL_c621dc:
                    a0->field_8 = a1;
                }
            }
            a0->field_10 = a0->field_10 + 1;
            return 0;
        }
    }
    return 0;
}
