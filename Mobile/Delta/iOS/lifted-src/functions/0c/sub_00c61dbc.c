/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61dbc..0xc61f30 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61dbc_0 {
    struct st_c61dbc_0 *field_0;
    struct st_c61dbc_0 *field_8;
    char padding_10[8];
    long long field_18;
    char padding_20[249];
    struct st_c61dbc_0 *field_119;
} st_c61dbc_0;

typedef struct st_c61dbc_1 {
    char padding_0[64];
    struct st_c61dbc_0 *field_40;
    struct st_c61dbc_0 *field_48;
    unsigned long long field_50;
} st_c61dbc_1;


st_c61dbc_0 * sub_c61dbc(st_c61dbc_1 *a0, st_c61dbc_0 *a1, long long a2)
{
    st_c61dbc_0 *v2;  // x22
    st_c61dbc_0 *v3;  // x8
    unsigned long long v4;  // 4123
    st_c61dbc_0 *v5;  // x0
    st_c61dbc_0 *v6;  // x8
    st_c61dbc_0 *v7;  // x8
    st_c61dbc_0 *v8;  // x8
    st_c61dbc_0 *v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned long long)a2 <= (unsigned long long)a1->field_18)
        return a1;
    if ((a1->padding_20)[1])
        return 0;
    v2 = a1->field_8;
    if (a0->field_40 == a1)
        a0->field_40 = a1->field_0;
    if (a0->field_48 == a1)
        a0->field_48 = v2;
    v3 = a1->field_0;
    if (v2)
        v2->field_0 = v3;
    if (v3)
        v3->field_8 = v2;
    a0->field_50 = a0->field_50 - 1;
    a1->field_0 = 0;
    a1->field_8 = 0;
    v4 = arm64g_calculate_condition(146, a2, 290, 0);
    if (v4 & 1)
    {
        v5 = sub_a6c1b4(a1, a2 + 288, "ssl/quic/quic_demux.c", 0xbb);
        if (v5)
        {
            if (v2)
            {
                v6 = v2->field_0;
                v5->field_0 = v6;
                v5->field_8 = v2;
                if (v6)
                    v6->field_8 = v5;
                v2->field_0 = v5;
                if (a0->field_48 == v2)
                    goto LABEL_c61e90;
            }
            else
            {
                v7 = a0->field_40;
                if (v7)
                    v7->field_8 = v5;
                v5->field_0 = v7;
                v5->field_8 = 0;
                a0->field_40 = v5;
                if (!a0->field_48)
                {
LABEL_c61e90:
                    a0->field_48 = v5;
                }
            }
            a0->field_50 = a0->field_50 + 1;
            v5->field_18 = a2;
            return v5;
        }
        else
        {
            if (v2)
            {
                v8 = v2->field_0;
                a1->field_0 = v8;
                a1->field_8 = v2;
                if (v8)
                    v8->field_8 = a1;
                v2->field_0 = a1;
                if (a0->field_48 == v2)
                    goto LABEL_c61ecc;
            }
            else
            {
                v9 = a0->field_40;
                if (v9)
                    v9->field_8 = a1;
                a1->field_0 = v9;
                a1->field_8 = 0;
                a0->field_40 = a1;
                if (!a0->field_48)
                {
LABEL_c61ecc:
                    a0->field_48 = a1;
                }
            }
            a0->field_50 = a0->field_50 + 1;
            return 0;
        }
    }
    return 0;
}
