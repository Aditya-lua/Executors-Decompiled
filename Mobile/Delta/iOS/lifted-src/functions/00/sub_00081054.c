/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81054..0x81380 (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_81054_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    long long field_20;
    long long field_28;
    unsigned int field_2c;
    long long field_30;
    unsigned int field_34;
    long long field_38;
    char padding_40[32];
    long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
    char padding_88[8];
    unsigned long long field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
    unsigned long long field_a8;
    unsigned long long field_b0;
    unsigned long long field_b8;
    char padding_c0[4];
    long long field_c4;
    char padding_cc[44];
    long long field_f8;
    uint128_t field_100;
    char field_10c;
    char padding_10d[31];
    long long field_12c;
} st_81054_0;

typedef struct st_81054_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[16];
    long long field_38;
} st_81054_1;


double sub_81054(st_81054_0 *a0, st_81054_1 *a1, void* a2, long long a3, long long a4, long long a5, long long a6)
{
    char v2;  // x27
    long long v3;  // x25
    unsigned long long v12;  // x8
    unsigned long v13;  // x10
    unsigned long long v14;  // x8
    unsigned long long v15;  // x10
    long long v16;  // x0
    unsigned int v17;  // w8
    uint128_t v18;  // q0
    unsigned int v4;  // w8
    unsigned int v5;  // w10
    unsigned int v6;  // w9
    unsigned long v7;  // x8
    unsigned int v8;  // w9
    unsigned long long v9;  // 4124
    long long v10;  // x23
    long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_7cd78())
    {
        v2 = (int)a2[8];
        v3 = 4 << ((char)(int)a2[4] & 63);
        if (a6 == 1)
            goto LABEL_810d8;
    }
    else
    {
        v3 = 0;
        v2 = (int)a2[8];
        if (a6 == 1)
        {
LABEL_810d8:
            if ((int)a2[16] == 3)
            {
                v4 = *(int *)a2;
                if ((unsigned int)*(int *)a2 >= 0x11)
                    v4 = 0x11;
                if (a5 == 1)
                    goto LABEL_81124;
LABEL_81104:
                v5 = a0->field_0;
                v6 = a0->field_8;
                v7 = a1->field_10;
                goto LABEL_81144;
            }
        }
    }
    v4 = 0;
    if (a5 != 1)
        goto LABEL_81104;
LABEL_81124:
    a0->field_20 = 0;
    v6 = (unsigned int)&g_c7eecf;
    a0->field_8 = " ";
    a0->field_10 = " ";
    v5 = (unsigned int)&g_c7eed1;
    a0->field_0 = "\r\n";
    v7 = a1->field_10;
    a1->field_20 = v7;
LABEL_81144:
    *(unsigned int *)((char *)&a0->field_100 + 12) = 0;
    v8 = v5 - v6;
    a0->field_18 = v8;
    a0->field_1c = v8;
    *(unsigned int *)((char *)&a0->field_28 + 4) = v8;
    a0->field_2c = v4;
    *(unsigned int *)&a0->field_28 = 0;
    *(unsigned int *)((char *)&a0->field_b0 + 4) = 0;
    *(unsigned long long *)&a0->padding_cc[24] = 0;
    a1->field_18 = v7;
    a0->field_60 = sub_7f484(a1, 4 << (v2 & 63));
    a0->field_70 = sub_7f484(a1, v3);
    *(unsigned long long *)&a0->field_68 = sub_7f484();
    if (!(char)a1->field_38)
    {
        if (a4 != 1)
            sub_7d994(a1);
        if (a3 == 1)
        {
            v9 = arm64g_calculate_condition(49, (int)a2[24] - 6, 3, 0);
            if (!(v9 & 1))
            {
                v10 = 1 << (v2 & 63);
                if (a6 == 1)
                {
                    a0->field_30 = sub_7f7ec(a1, v10);
                    v11 = *(long long *)&a0->padding_40[16];
                    v12 = 11507291218515648293 * (__ROL__(v11, 40) ^ __ROL__(v11, 15) ^ v11);
                    v13 = *(int *)&a0->padding_40[24];
                    v14 = 11507291218515648293 * ((v12 >> 35) + 8 ^ v12);
                    v15 = 11507291218515648293 * (__ROL__(v13, 40) ^ v13 * 0x8000 ^ v13);
                    *(unsigned long long *)&a0->padding_40[16] = v14 ^ (11507291218515648293 * ((v15 >> 35) + 4 ^ v15) ^ v14) >> 28 ^ 11507291218515648293 * ((v15 >> 35) + 4 ^ v15);
                }
                else
                {
                    v16 = sub_7f500(a1, v10 + 63 & 0xffffffffffffffc0, 2);
                    a0->field_30 = v16;
                    _bzero(v16, v10, 2);
                    *(unsigned long long *)&a0->padding_40[16] = 0;
                }
                v17 = (int)a2[12];
                if ((unsigned int)(int)a2[12] >= 6)
                    v17 = 6;
                if (4 >= v17)
                    v17 = 4;
                (&a0->field_2c)[1] = (int)a2[8] - v17;
            }
        }
        if (a6 == 1 && (unsigned int)(int)a2[24] >= 7)
        {
            a0->field_80 = sub_7f500(a1, 0x400, 2);
            *(unsigned long long *)a0->padding_88 = sub_7f500(a1, 192, 2);
            a0->field_90 = sub_7f500(a1, 0x100, 2);
            a0->field_98 = sub_7f500(a1, 128, 2);
            a0->field_a0 = sub_7f500(a1, 0x8040, 2);
            a0->field_a8 = sub_7f500(a1, 0x1c080, 2);
        }
        v18 = *(int128_t *)a2;
        *(int128_t *)&(a0->padding_cc)[1] = (int128_t)a2[12];
        *(uint128_t *)&a0->padding_cc[32] = v18;
    }
    return *(unsigned long long *)&v18;
}
