/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a414c..0x9a4264 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a414c_1 {
    int field_0;
    char padding_4[212];
    struct st_9a414c_0 *field_d8;
} st_9a414c_1;

typedef struct st_9a414c_2 {
    char padding_0[24];
    struct st_9a414c_1 *field_18;
    char padding_20[2588];
    unsigned int field_a3c;
} st_9a414c_2;

typedef struct st_9a414c_0 {
    char padding_0[80];
    char field_50;
} st_9a414c_0;


unsigned long long sub_9a414c(st_9a414c_2 *a0, long long a1, unsigned int a2, unsigned long a3, unsigned long a4)
{
    unsigned long v5;  // cc_dep1
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // x0
    long long v14;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a2;
    if (a2 == 0x4000)
    {
        return 2;
    }
    else if (a0->field_a3c)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
        {
            if (772 <= a0->field_18->field_0)
            {
                v9 = arm64g_calculate_condition(163, v5, 0x4000, 0);
                v10 = arm64g_calculate_condition(20, (v9 & 1 ? a4 : 0x40000000), 0, 0);
                if (v10 & 1)
                    goto LABEL_9a424c;
            }
            else
            {
                v11 = arm64g_calculate_condition(163, v5, 0x4000, 0);
                v12 = arm64g_calculate_condition(16, (v11 & 1 ? a4 : 0x40000000), 0, 0);
                if (v12 & 1)
                {
LABEL_9a424c:
                    if (a0->field_18->field_0 != 0x10000)
                        return 2;
                }
            }
        }
        if (sub_c68d5c(a1, 5, 2) && sub_c6876c(a1, 2))
        {
            if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
            {
                v13 = sub_9b85a4(a0, a1);
                if (!(unsigned int)v13)
                    return v13;
            }
            if (sub_a6e970(a1))
                return 1;
            v14 = 1785;
        }
        else
        {
            v14 = 1771;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", v14, "tls_construct_stoc_status_request");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    else
    {
        return 2;
    }
}
