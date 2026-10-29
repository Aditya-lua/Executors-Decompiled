/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9abc2c..0x9abe50 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9abc2c_1 {
    int field_0;
    char padding_4[212];
    struct st_9abc2c_0 *field_d8;
} st_9abc2c_1;

typedef struct st_9abc2c_4 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_9abc2c_1 *field_18;
    char padding_20[736];
    struct st_9abc2c_2 *field_300;
    char padding_308[512];
    unsigned int field_508;
    char padding_50c[1012];
    struct st_9abc2c_3 *field_900;
} st_9abc2c_4;

typedef struct st_9abc2c_2 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[36];
    unsigned int field_40;
} st_9abc2c_2;

typedef struct st_9abc2c_3 {
    char padding_0[760];
    struct st_9abc2c_2 *field_2f8;
    unsigned long long field_300;
} st_9abc2c_3;

typedef struct st_9abc2c_0 {
    char padding_0[80];
    unsigned int field_50;
} st_9abc2c_0;


unsigned long long sub_9abc2c(st_9abc2c_4 *a0)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // x0
    unsigned int *v4;  // x20
    long long v5;  // x1
    st_9abc2c_1 *v6;  // x8
    unsigned long v7;  // x9
    st_9abc2c_3 *v8;  // x10
    unsigned long long v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = sub_95c29c();
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1399, "set_client_ciphersuite");
        sub_9a58a4(a0, 47, 248, 0);
        return 0;
    }
    v4 = v3;
    if (sub_96a23c(a0, v4, "RL\"", 1))
    {
        sub_a368c8();
        v5 = 1407;
    }
    else if (!(sub_ad66d4(sub_9613ec(a0), v4) >> 31 & 1))
    {
        v6 = a0->field_18;
        v7 = v6->field_d8->field_50;
        if (v7 >> 3 & 1 || v6->field_0 < 772 || v6->field_0 == 0x10000 || !a0->field_300 || a0->field_300->field_18 == v4[6])
        {
            v8 = a0->field_900;
            if (v8->field_2f8)
                v8->field_300 = v8->field_2f8->field_18;
            if (a0->field_508 && v8->field_300 != v4[6])
            {
                if (!(v7 >> 3 & 1) && v6->field_0 >= 772 && v6->field_0 != 0x10000)
                {
                    v9 = sub_95a688(v2, v4[16]);
                    if (!a0->field_900->field_2f8)
                    {
                        sub_c655a4(a0);
                        return 0;
                    }
                    else if (!v9 || v9 != sub_95a688(v2, a0->field_900->field_2f8->field_40))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 1448, "set_client_ciphersuite");
                        sub_9a58a4(a0, 47, 218, 0);
                        return 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 1457, "set_client_ciphersuite");
                    sub_9a58a4(a0, 47, 197, 0);
                    return 0;
                }
            }
            a0->field_300 = v4;
            return 1;
        }
        sub_a368c8();
        v5 = 1422;
    }
    else
    {
        sub_a368c8();
        v5 = 1415;
    }
    sub_a369bc("ssl/statem/statem_clnt.c", v5, "set_client_ciphersuite");
    sub_9a58a4(a0, 47, 261, 0);
    return 0;
}
