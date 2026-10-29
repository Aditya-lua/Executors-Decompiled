/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96612c..0x9662a0 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96612c_2 {
    int field_0;
    char padding_4[204];
    struct st_96612c_3 *field_d0;
    struct st_96612c_1 *field_d8;
} st_96612c_2;

typedef struct st_96612c_4 {
    char padding_0[24];
    struct st_96612c_2 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[277];
    char field_161;
    char padding_162[1910];
    unsigned long long field_8d8;
    char field_8e0;
    char padding_8e1[679];
    unsigned long long field_b88;
} st_96612c_4;

typedef struct st_96612c_1 {
    char padding_0[80];
    char field_50;
} st_96612c_1;

typedef struct st_96612c_3 {
    unsigned long long field_0;
} st_96612c_3;

typedef struct st_96612c_0 {
    unsigned int field_0;
    char padding_4[628];
    unsigned long long field_278;
    char field_280;
    char padding_281[87];
    char field_2d8;
    char padding_2d9[7];
    unsigned long long field_2e0;
    unsigned long long field_2e8;
    char padding_2f0[136];
    unsigned int field_378;
} st_96612c_0;


char sub_96612c(st_96612c_4 *a0, char a1)
{
    st_96612c_0 *v2;  // x0
    st_96612c_0 *v3;  // x20
    char v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_965b4c();
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_sess.c", 442, "ssl_get_new_session");
        sub_9a58a4(a0, 80, 0x80014, 0);
        return 0;
    }
    v3 = v2;
    v4 = *(long long *)(a0->field_b88 + 88);
    if (!v4)
        a0->field_18->field_d0();
    *(unsigned long long *)&v3->field_2d8 = v4;
    v5 = v3->field_2e0 + v4;
    v6 = arm64g_calculate_condition(50, v3->field_2e0, v4, 0);
    if (!(v6 & 1))
        v5 = 0xffffffffffffffff;
    v3->field_2e8 = v5;
    sub_9662a0();
    *(unsigned long long *)&a0->padding_8e1[31] = 0;
    if (!a1 || !(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        *(unsigned long long *)&v3->padding_4[588] = 0;
    }
    else if (!sub_965e98(a0, v3))
    {
        sub_9662a0(v3);
        return 0;
    }
    if (a0->field_8d8 >= 33)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_sess.c", 474, "ssl_get_new_session");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        sub_9662a0(v3);
        return 0;
    }
    _memcpy(&v3->field_280, &a0->field_8e0);
    v3->field_278 = a0->field_8d8;
    *(st_96612c_0 **)&a0->padding_8e1[31] = v3;
    v3->field_0 = a0->field_48;
    *(unsigned long long *)&v3->padding_281[79] = 0;
    if (!(a0->field_161 >> 1 & 1))
        return 1;
    v3->field_378 = v3->field_378 | 1;
    return 1;
}
