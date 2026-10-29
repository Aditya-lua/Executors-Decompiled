/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976170..0x97632c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976170_1 {
    struct st_976170_0 *field_0;
    struct st_976170_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    struct st_976170_0 *field_44;
} st_976170_1;

typedef struct st_976170_0 {
    char padding_0[16];
    struct st_976170_0 *field_10;
    struct st_976170_0 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    struct st_976170_0 *field_54;
} st_976170_0;


int sub_976170(st_976170_0 **a0, unsigned int a1, unsigned int a2, unsigned long long a3, unsigned int a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    st_976170_0 *v2;  // x8
    st_976170_0 *v3;  // x0
    st_976170_0 *v12;  // x10
    unsigned long long v13;  // 4102
    st_976170_0 *v14;  // x8
    st_976170_0 *v15;  // x8
    st_976170_0 *v4;  // x8
    st_976170_0 *v5;  // x9
    st_976170_0 *v6;  // x8
    st_976170_1 *v7;  // x9
    st_976170_0 *v8;  // x10
    st_976170_0 *v9;  // x8
    st_976170_0 *v10;  // x9
    st_976170_0 *v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0], Other Possible Types: unsigned long

    v0 = &v1;
    v2 = a0[4];
    v3 = v2;
    if (!v2)
    {
        v3 = sub_a6bffc(88, "ssl/quic/quic_cfq.c", 223);
        if (!v3)
            return (unsigned int)v3;
        (&v3->field_50)[1] = (unsigned int)0xffffffff;
        v4 = a0[5];
        v3->field_10 = v4;
        v3->field_18 = 0;
        a0[5] = v3;
        if (v4)
            v4->field_18 = v3;
        v2 = a0[4];
        if (!v2)
        {
            a0[4] = v3;
            v2 = v3;
        }
    }
    v3->field_48 = a1;
    v3->field_4c = a2;
    v3->field_38 = a3;
    v3->field_40 = a6;
    v3->field_20 = a5;
    v3->field_28 = a7;
    v3->field_30 = v1;
    v3->field_50 = a4;
    (&v3->field_50)[1] = 0;
    if (v2 == v3)
        a0[4] = v3->field_18;
    v5 = v3;
    v6 = v5->field_10;
    v7 = &v5->field_10;
    if (a0[5] == v3)
        a0[5] = v6;
    v8 = v3->field_18;
    if (v6)
        v6->field_18 = v8;
    if (v8)
        v8->field_10 = v6;
    v7->field_0 = 0;
    v7->field_8 = 0;
    v9 = *a0;
    if (v9)
    {
        v10 = 0;
        v11 = v9;
        do
        {
            v12 = v11;
            if (v12->field_4c >= a2)
            {
                v13 = arm64g_calculate_condition(131, v12->field_4c, a2, 0);
                if (v13 & 1 || a1 >= v12->field_48)
                {
                    if (v10)
                    {
                        v14 = v10->field_18;
                        v3->field_10 = v10;
                        v3->field_18 = v14;
                        if (v14)
                            v14->field_10 = v3;
                        v10->field_18 = v3;
                        if (a0[1] != v10)
                            return (unsigned int)v3;
                    }
                    else
                    {
                        v3->field_18 = v9;
                        *a0 = v3;
                        v9->field_10 = v3;
                        if (a0[1])
                            return (unsigned int)v3;
                    }
                    a0[1] = v3;
                    return (unsigned int)v3;
                }
            }
        } while ((v10 = v12, v11 = v12->field_18, v12->field_18));
        v15 = a0[1];
        v3->field_10 = v15;
        v3->field_18 = 0;
        a0[1] = v3;
        if (v15)
            v15->field_18 = v3;
    }
    else
    {
        *a0 = v3;
        a0[1] = v3;
        v7->field_0 = 0;
        v7->field_8 = 0;
    }
    return (unsigned int)v3;
}
