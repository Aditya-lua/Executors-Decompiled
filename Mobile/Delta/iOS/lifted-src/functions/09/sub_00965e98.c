/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965e98..0x9660ac (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_965e98_2 {
    char padding_0[40];
    long long field_28;
    char padding_30[24];
    unsigned int field_48;
    char padding_4c[2260];
    struct st_965e98_1 *field_920;
    char padding_928[312];
    struct st_965e98_1 *field_a60;
    char padding_a68[288];
    struct st_965e98_0 *field_b88;
} st_965e98_2;

typedef struct st_965e98_3 {
    char padding_0[592];
    struct st_965e98_1 *field_250;
} st_965e98_3;

typedef struct st_965e98_1 {
    unsigned long long field_0;
} st_965e98_1;

typedef struct st_965e98_0 {
    char padding_0[440];
    struct st_965e98_1 *field_1b8;
    char padding_1c0[560];
    long long field_3f0;
} st_965e98_0;

extern unsigned long long g_9660ac;

unsigned long long * sub_965e98(st_965e98_2 *a0, st_965e98_3 *a1)
{
    st_965e98_2 *v3;  // x19
    unsigned int v4;  // w8
    st_965e98_0 *v13;  // x8
    unsigned long v5;  // cc_dep1
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long long *v11;  // x0
    unsigned long long *v12;  // x22
    unsigned long long *v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = a0->field_48;
    v5 = v4;
    if (65276 >= (int)v4)
    {
        if (v4 - 0x300 < 5 || v4 == 0x100)
            goto LABEL_965f14;
    }
    else
    {
        if (v4 != 0xfeff)
        {
            v6 = arm64g_calculate_condition(19, v5, 65276, 0);
            v7 = arm64g_calculate_condition(19, (v6 & 1 ? v4 : 0x40000000), (v6 & 1 ? 65277 : 0), 0);
            if (!(v7 & 1))
                goto LABEL_965f14;
        }
        else
        {
            v8 = arm64g_calculate_condition(19, v5, 65276, 0);
            v9 = arm64g_calculate_condition(16, (v8 & 1 ? v4 : 0x40000000), (v8 & 1 ? 65277 : 0), 0);
            if (!(v9 & 1))
            {
LABEL_965f14:
                a1->field_250 = 32;
                if ((int)v3->field_a60)
                {
                    a1->field_250 = 0;
                    return 1;
                }
                v11 = sub_a7c17c(v3->field_28);
                if (!(unsigned int)v11)
                {
                    return v11;
                }
                else if (sub_a7c17c(v3->field_b88->field_3f0))
                {
                    v12 = v3->field_920;
                    v13 = v3->field_b88;
                    if (!v3->field_920)
                    {
                        if (!v13->field_1b8)
                            v12 = &g_9660ac;
                        else
                            v12 = v13->field_1b8;
                    }
                    sub_a7c1b4(v13->field_3f0);
                    sub_a7c1b4(v3->field_28);
                    _bzero(a1 + 1, a1->field_250);
                    v0 = (unsigned long long *)(unsigned int)a1->field_250;
                    v12();
                }
                else
                {
                    sub_a368c8(sub_a7c1b4(v3->field_28));
                    sub_a369bc("ssl/ssl_sess.c", 396, "ssl_generate_session_id");
                    sub_9a58a4(v3, 80, 277, 0);
                    return 0;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/ssl_sess.c", 366, "ssl_generate_session_id");
    sub_9a58a4(v3, 80, 259, 0);
    return 0;
}
