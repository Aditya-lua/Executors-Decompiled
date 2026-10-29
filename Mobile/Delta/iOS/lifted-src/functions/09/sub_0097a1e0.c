/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97a1e0..0x97aed0 (3312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97a1e0_1 {
    char padding_0[48];
    struct st_97a1e0_2 *field_30;
    char padding_38[16];
    char field_48;
    char padding_49[7];
    long long field_50;
    char padding_58[152];
    char field_f0;
    char padding_f1[607];
    char field_350;
    char padding_351[295];
    char field_478[21];
    char field_479;
    char padding_47a[11];
    char field_485;
    char padding_486[49];
    char field_4b7;
    char field_4b8;
    char padding_4b9[111];
    long long field_528;
    long long field_530;
    long long field_538;
    long long field_540;
    char field_548;
    char padding_549[15];
    long long field_558;
    long long field_560;
    char padding_568[24];
    long long field_580;
    long long field_588;
    char padding_590[144];
    unsigned long long field_620;
    char field_623;
    char padding_624[28];
    unsigned long long field_640;
} st_97a1e0_1;

typedef struct st_97a1e0_2 {
    unsigned int field_0;
} st_97a1e0_2;

typedef struct st_97a1e0_3 {
    char field_0[21];
    char field_d;
    char padding_e[49];
    char field_3f;
    char padding_40[112];
    unsigned long long field_b0;
    unsigned long long field_b8;
    unsigned long long field_c0;
    unsigned long long field_c8;
    char field_d0;
    char padding_d1[15];
    unsigned long long field_e0;
    unsigned long long field_e8;
    char padding_f0[24];
    unsigned long long field_108;
    unsigned long long field_110;
    char padding_118[144];
    char field_1a8[8];
    char field_1ab;
    char padding_1ac[28];
    unsigned long long field_1c8;
} st_97a1e0_3;

typedef struct st_97a1e0_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_97a1e0_0;

extern st_97a1e0_0 g_d28454;
extern char g_10002b0;

char sub_97a1e0(unsigned long a0, char a1, st_97a1e0_1 *a2)
{
    unsigned int *v30;  // x0
    unsigned long v31;  // x8
    char v40;  // x1
    long long v41;  // x6
    char v42;  // w0
    unsigned long v32;  // x8
    char v33;  // x9
    long long v34;  // x3
    st_97a1e0_1 *v39;  // x0
    char v0;  // [bp-0x188]
    st_97a1e0_3 *v1;  // [bp-0x180]
    char v2;  // [bp-0x178]
    char v3;  // [bp-0x170]
    char v4;  // [bp-0x168]
    char v5;  // [bp-0x160]
    char v6;  // [bp-0x158]
    char v7;  // [bp-0x150]
    char v8;  // [bp-0x140]
    unsigned long v9;  // [bp-0x138]
    unsigned long v27;  // [bp-0x70]
    char *v28;  // [bp-0x10]
    char v29;  // [bp+0x0]

    v28 = &v29;
    v27 = *(long long *)&g_10002b0;
    v30 = a2->field_30;
    if (v30 && (v31 = *v30, (unsigned int)v31))
    {
        if (!(v31 >> 7 & 1))
        {
            v30 = 0;
        }
        else
        {
            v30 = sub_980dc8();
            v32 = *(long long *)&a2->padding_590[120];
            if (!(v32 >> 25 & 1))
                goto LABEL_97a23c;
LABEL_97a25c:
            v33 = v32 & 128;
            if (!(v32 >> 7 & 1) || !v30[564])
                goto LABEL_97a240;
            *(uint128_t *)&a2->field_540 = 0;
            *(unsigned long long *)&a2->padding_590[120] = v32 & 0xfffffffffffffeff;
            sub_a6c2e4(a2->field_50, "ssl/quic/quic_channel.c", 1340);
            a2->field_50 = 0;
LABEL_97a298:
            if (a1 >= 0)
            {
                v9 = a0;
                if (a1)
                {
                    v3 = 0;
                    v4 = 0;
                    v5 = 0;
                    v6 = 0;
                    v2 = 0;
                    v0 = 0;
                    v1 = a2->field_478;
                    while (sub_9902f4(&v9, &v8))
                    {
                        if (16 >= v8)
                            goto *((void *)(sub_97a35c + (&g_d28454.field_0)[v8] * 4));
                        if (!sub_990348(&v9, &v8, &v7))
                            break;
                    }
                    sub_979174(v39, v40, 0, v34, 0, "ssl/quic/quic_channel.c", v41, "ch_on_transport_params");
                    if (*(long long *)&g_10002b0 == v27)
                        return v42;
                    ___stack_chk_fail();
                }
                else
                {
                    sub_979174(v39, v40, 0, v34, 0, "ssl/quic/quic_channel.c", v41, "ch_on_transport_params");
                    if (*(long long *)&g_10002b0 == v27)
                        return v42;
                    ___stack_chk_fail();
                }
            }
            else
            {
                sub_979174(a2, 1, 0, "internal error (packet buf init)", 0, "ssl/quic/quic_channel.c", 1349, "ch_on_transport_params");
                if (*(long long *)&g_10002b0 == v27)
                    return v42;
                ___stack_chk_fail();
            }
        }
    }
    v32 = *(long long *)&a2->padding_590[120];
    if (v32 >> 25 & 1)
        goto LABEL_97a25c;
LABEL_97a23c:
    v33 = v32 & 128;
LABEL_97a240:
    if (v33)
    {
        sub_979174(v39, v40, 0, v34, 0, "ssl/quic/quic_channel.c", v41, "ch_on_transport_params");
        if (*(long long *)&g_10002b0 == v27)
            return v42;
        ___stack_chk_fail();
    }
    goto LABEL_97a298;
}
