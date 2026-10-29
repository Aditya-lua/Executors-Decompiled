/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b83c8..0x9b85a4 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b83c8_1 {
    int field_0;
    char padding_4[212];
    struct st_9b83c8_0 *field_d8;
} st_9b83c8_1;

typedef struct st_9b83c8_3 {
    char padding_0[24];
    struct st_9b83c8_1 *field_18;
    char padding_20[2152];
    char field_888;
    char padding_889[63];
    char field_8c8;
    char padding_8c9[55];
    struct st_9b83c8_2 *field_900;
    char padding_908[72];
    unsigned int field_950;
    char padding_954[68];
    unsigned int field_998[2];
    char padding_9a0[520];
    unsigned int field_ba8;
} st_9b83c8_3;

typedef struct st_9b83c8_2 {
    char padding_0[696];
    long long field_2b8;
    long long field_2c0;
    long long field_2c8;
    unsigned long long field_2d0;
} st_9b83c8_2;

typedef struct st_9b83c8_0 {
    char padding_0[80];
    char field_50;
} st_9b83c8_0;


unsigned int sub_9b83c8(st_9b83c8_3 *a0)
{
    st_9b83c8_3 *v3;  // x19
    long long v4;  // x0
    long long v5;  // x2
    st_9b83c8_2 *v6;  // x0
    unsigned int v7;  // x0
    st_9b83c8_2 *v8;  // x8
    st_9b83c8_2 *v9;  // x8
    st_9b83c8_2 *v10;  // x9
    unsigned int v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v0 = 0;
    if (sub_9afc38())
    {
        if (v0)
        {
            if (0 < (int)sub_958b78(v3))
                goto LABEL_9b8474;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3590, "tls_process_client_rpk");
            v4 = sub_9b0df0(v3->field_998[0]);
            v5 = 134;
            goto LABEL_9b857c;
        }
        if (!~(v3->field_950 & 3))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 0xe00, "tls_process_client_rpk");
            v4 = 116;
            v5 = 199;
            goto LABEL_9b857c;
        }
        else
        {
LABEL_9b8474:
            v6 = v3->field_900;
            if (v3->field_ba8 == 4)
            {
                v7 = sub_965e7c(v6, 0);
                if (v7)
                {
                    sub_9662a0(v3->field_900);
                    v6 = (st_9b83c8_2 *)v7;
                    v3->field_900 = v6;
                    goto LABEL_9b84a8;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 3605, "tls_process_client_rpk");
                    v4 = 80;
                    v5 = 0xc0100;
                }
LABEL_9b857c:
                sub_9a58a4(v3, v4, v5, 0);
            }
            else
            {
LABEL_9b84a8:
                sub_afc404(v6->field_2c0);
                v8 = v3->field_900;
                v8->field_2c0 = 0;
                sub_ad6958(v8->field_2c8, sub_afc404);
                v9 = v3->field_900;
                v9->field_2c8 = 0;
                sub_a5a4c8(v9->field_2b8);
                v10 = v3->field_900;
                v10->field_2b8 = v0;
                v0 = 0;
                *(unsigned int [2])&v10->field_2d0 = v3->field_998;
                if (v3->field_18->field_d8->field_50 >> 3 & 1)
                {
                    sub_a5a4c8(v0);
                    return 3;
                }
                else if (v3->field_18->field_0 < 772)
                {
                    sub_a5a4c8(v0);
                    return 3;
                }
                else if (v3->field_18->field_0 == 0x10000)
                {
                    sub_a5a4c8(v0);
                    return 3;
                }
                else if (sub_9545a8(v3, 1) && sub_962d78(v3, &v3->field_888, 64, &v3->field_8c8))
                {
                    *(unsigned long long *)&v3[1].padding_9a0[12] = 0;
                    sub_a5a4c8(v0);
                    return 3;
                }
            }
        }
    }
    sub_a5a4c8(v0);
    return 0;
}
