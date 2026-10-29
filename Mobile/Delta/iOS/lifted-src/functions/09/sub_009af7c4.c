/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af7c4..0x9afaf0 (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af7c4_0 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9af7c4_0;

typedef struct st_9af7c4_3 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_9af7c4_0 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[492];
    char field_268;
    char padding_269[2367];
    unsigned int field_ba8;
    char padding_bac[172];
    char field_c58;
    char padding_c59[23];
    struct st_9af7c4_1 *field_c70;
} st_9af7c4_3;

typedef struct st_9af7c4_2 {
    unsigned long long field_0;
} st_9af7c4_2;

typedef struct st_9af7c4_1 {
    char padding_0[104];
    struct st_9af7c4_2 *field_68;
    struct st_9af7c4_2 *field_70;
} st_9af7c4_1;


unsigned long long sub_9af7c4(st_9af7c4_3 *a0, long long *a1)
{
    unsigned long long v2;  // w22
    unsigned long long v3;  // x0
    unsigned long long v12;  // 4107
    unsigned long long v13;  // 4107
    unsigned long long v14;  // x23
    void* v15;  // x8
    st_9af7c4_0 *v4;  // x8
    unsigned long v5;  // x9
    st_9af7c4_3 *v6;  // x0
    long long v7;  // x1
    long long v8;  // x2
    unsigned long long v9;  // x21
    unsigned int v10;  // w20
    unsigned long v11;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0->padding_7c[484])
    {
        v2 = !*(long long *)&a0->padding_269[127];
        if (a0->field_78)
            goto LABEL_9af810;
    }
    else
    {
        v2 = 1;
        if (a0->field_78)
        {
LABEL_9af810:
            if (a0->field_c70->field_68)
                a0->field_c70->field_68();
            if (a0->field_ba8 != 4)
                *(unsigned int *)&a0->padding_7c[0x44] = 1;
            if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
            {
                v3 = sub_9afaf0(a0);
                if (!(unsigned int)v3)
                    return v3;
            }
        }
    }
    v4 = a0->field_18;
    v5 = (int)v4->field_d8[80];
    if (!(v5 >> 3 & 1) && v4->field_0 >= 772 && v4->field_0 != 0x10000)
    {
        if (sub_992a0c(&a0->field_c58))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 874, "tls_process_finished");
            sub_9a58a4(a0, 10, 182, 0);
            return 0;
        }
        v4 = a0->field_18;
        v5 = (int)v4->field_d8[80];
    }
    if (!(v5 >> 3 & 1) && v4->field_0 >= 772 && v4->field_0 != 0x10000 || *(int *)&a0->padding_7c[316])
    {
        *(unsigned int *)&a0->padding_7c[316] = 0;
        v9 = *(long long *)&a0->padding_269[127];
        if (v9 != a1[1])
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 888, "tls_process_finished");
            v6 = a0;
            v7 = 50;
            v8 = 111;
        }
        else if (sub_a66f20(*a1, &a0->field_268, v9))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 902, "tls_process_finished");
            v6 = a0;
            v7 = 0x33;
            v8 = 149;
        }
        else if (65 > v9)
        {
            v10 = a0->field_78;
            v11 = v10;
            if (!v10)
            {
                v12 = arm64g_calculate_condition(3, v11, 0, 0);
                if (!(v12 & 1))
                    goto LABEL_9af9e6;
LABEL_9af9e5:
                v14 = 1192;
            }
            else
            {
                v13 = arm64g_calculate_condition(3, v11, 0, 0);
                if (v13 & 1)
                    goto LABEL_9af9e5;
LABEL_9af9e6:
                v14 = 1120;
            }
            _memcpy();
            *(unsigned long long *)((char *)a0 + v14) = v9;
            v15 = a0->field_18->field_d8;
            if (!((char)((char)v15[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
            {
                if (!v10)
                {
                    (long long)v15[8]();
                }
                else if (a0->field_ba8 != 4)
                {
                    (long long)v15[16]();
                }
            }
            if (!v2 || !*(long long *)&a0->padding_7c[484] || !*(long long *)&a0->padding_269[127] || !a0->field_c70->field_70)
                return 1;
            a0->field_c70->field_70();
            return 1;
        }
        else
        {
            sub_c65c38(a0);
            return 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 880, "tls_process_finished");
        v6 = a0;
        v7 = 10;
        v8 = 154;
    }
    sub_9a58a4(v6, v7, v8, 0);
    return 0;
}
