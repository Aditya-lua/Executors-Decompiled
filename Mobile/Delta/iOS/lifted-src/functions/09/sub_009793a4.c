/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9793a4..0x979638 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9793a4_1 {
    char padding_0[64];
    long long field_40;
    char padding_48[144];
    long long field_d8;
    char padding_e0[8];
    long long field_e8;
    char padding_f0[1009];
    struct st_9793a4_0 *field_4e1;
    char padding_4e9[5];
    char field_4ee;
    char padding_4ef[9];
    long long field_4f8;
    unsigned long long field_500;
    char padding_508[280];
    unsigned long long field_620;
} st_9793a4_1;

typedef struct st_9793a4_0 {
    char padding_0[8];
    struct st_9793a4_0 *field_8;
} st_9793a4_0;

typedef struct st_9793a4_3 {
    struct st_9793a4_0 *field_0;
    char padding_8[5];
    char field_d;
    char padding_e[9];
    unsigned long long field_17;
    unsigned long long field_1f;
    char padding_27[280];
    unsigned long long field_13f;
} st_9793a4_3;

typedef struct st_9793a4_2 {
    long long field_0;
    unsigned long long field_8;
    uint128_t field_10;
    char field_1d;
} st_9793a4_2;

extern long long g_97b0b0;

st_9793a4_1 * sub_9793a4(st_9793a4_1 *a0, st_9793a4_2 *a1)
{
    long long v4;  // x8
    unsigned long long v5;  // x22
    long long v6;  // x20
    long long v7;  // x10
    unsigned long long v8;  // x23
    st_9793a4_1 *v9;  // x19
    st_9793a4_3 *v10;  // x1
    uint128_t v11;  // q0
    st_9793a4_0 *v12;  // x20
    char v0;  // [bp-0x80], Other Possible Types: unsigned long
    char v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((*(long long *)&a0->padding_508[272] & 7) != 1)
        return a0;
    if (!(a0->padding_f0)[1])
        return sub_979174();
    v4 = *(long long *)&a0->padding_4ef[2];
    v5 = a0->field_4f8;
    v6 = a1->field_0;
    if ((unsigned long long)v4 < (unsigned long long)v6)
        v7 = v6;
    else
        v7 = v4;
    if (v5 < a1->field_8)
        v8 = a1->field_8;
    else
        v8 = v5;
    if (v7 - v8 < 2 && v8 - v5 < 11)
    {
        v9 = a0;
        if ((unsigned long long)v6 <= (unsigned long long)v4)
        {
LABEL_9794f4:
            if (v8 <= v5)
                return a0;
            while (1)
            {
                v12 = sub_9ebce0(sub_98863c(a0->field_40, a0, v5), a0, v5);
                if (!v12 || !sub_c689b0(&v1, v12))
                    break;
                if (sub_98e9b8(&v1, v5))
                {
                    sub_a6eaf8(&v1);
                    if (!sub_c68eb8(&v1, &v0) || !sub_976170(v9->field_e8, 1, 2, 25, 0, v12->field_8, v0, &g_97b0b0, 0))
                        break;
                    v12->field_8 = 0;
                    sub_9ebcf4(v12);
                    v5 = v9->field_4f8 + 1;
                    v9->field_4f8 = v5;
                    a0 = v9;
                    if (v5 >= v8)
                        return v9;
                }
                else
                {
                    sub_a6ed4c(&v1);
                    break;
                }
            }
            sub_979174(v9, 1, 24, "internal error enqueueing retire conn id", 0, "ssl/quic/quic_channel.c", 3276, "ch_enqueue_retire_conn_id");
            return sub_9ebcf4(v12);
        }
        else if (sub_9883c8(a0->field_40, a0, v6, (char *)&a1[1].field_0 + 4))
        {
            v10 = (v9->padding_f0)[1];
            *(long long *)&v9->padding_4ef[2] = v6;
            v11 = a1->field_10;
            *(long long *)&v10->field_d = *(long long *)((char *)&a1->field_10 + 13);
            *(uint128_t *)&v10->field_0 = v11;
            sub_98b7bc(v9->field_d8, v10);
            v5 = v9->field_4f8;
            a0 = v9;
            goto LABEL_9794f4;
        }
    }
    return sub_979174();
}
