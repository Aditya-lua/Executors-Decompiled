/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a6b28..0x9a6ee0 (952 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a6b28_1 {
    int field_0;
    char padding_4[212];
    struct st_9a6b28_0 *field_d8;
} st_9a6b28_1;

typedef struct st_9a6b28_2 {
    char padding_0[24];
    struct st_9a6b28_1 *field_18;
    char padding_20[100];
    char field_84;
    char padding_85[11];
    unsigned long long field_90;
    char padding_98[20];
    unsigned int field_ac;
    char padding_b0[64];
    unsigned int field_f0;
    char padding_f4[109];
    char field_161;
    char padding_162[2128];
    char field_9b2;
    char padding_9b3[357];
    unsigned int field_b18;
    char padding_b1c[136];
    unsigned int field_ba4;
    unsigned int field_ba8;
} st_9a6b28_2;

typedef struct st_9a6b28_0 {
    char padding_0[80];
    unsigned int field_50;
} st_9a6b28_0;


unsigned int sub_9a6b28(st_9a6b28_2 *a0)
{
    unsigned long v2;  // x8
    unsigned int v3;  // w8
    unsigned long long v4;  // 4118
    unsigned int v5;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        v2 = a0->field_ac;
        if ((int)v2 > 16)
        {
            if (52 >= (unsigned int)v2)
            {
                if (1 << ((char)v2 & 63) & 0x2800000100000)
                    goto LABEL_9a6e74;
                if (1 << ((char)v2 & 63) & 0x10000000040000)
                {
LABEL_9a6ba0:
                    if (*(int *)&a0->padding_162[478])
                        goto LABEL_9a6dfc;
                    goto LABEL_9a6e64;
                }
                else
                {
                    if (v2 != 0x33)
                        goto LABEL_9a6d80;
                    if (a0->field_b18 != 2 || a0->field_161 >> 5 & 1)
                        goto LABEL_9a6ba0;
                    v3 = 52;
                }
            }
            else
            {
LABEL_9a6d80:
                if ((unsigned int)v2 != 0x11)
                    goto LABEL_9a6e04;
LABEL_9a6e64:
                v3 = 20;
            }
        }
        else
        {
            if (11 >= (int)v2)
            {
                if ((unsigned int)v2 == 1)
                {
                    v4 = arm64g_calculate_condition(1, a0->field_ba4, 1, 0);
                    if (v4 & 1)
                        return 2;
                    v3 = 47;
                }
                else if ((unsigned int)v2 != 8)
                {
                    if ((unsigned int)v2 != 10)
                        goto LABEL_9a6e04;
                    goto LABEL_9a6e74;
                }
                else if (a0->field_ba8 != 4)
                {
                    if (!(a0->field_84 & 1))
                    {
                        sub_c65530();
                        return 0;
                    }
LABEL_9a6e74:
                    v3 = 1;
                }
                else if (!a0->padding_b1c[52] && *(int *)&a0->padding_b1c[32])
                {
                    v3 = 15;
                }
                else
                {
LABEL_9a6dfc:
                    v3 = 14;
                }
            }
            else
            {
                if (2 > (unsigned int)v2 - 14)
                {
                    if (*(int *)&a0->padding_162[478] == 1)
                        v3 = 0x11;
                    else
                        v3 = 20;
                }
                else
                {
                    if ((unsigned int)v2 == 12)
                    {
                        if ((a0->field_f0 | 4) == 7)
                        {
                            v5 = 0x33;
                        }
                        else if (a0->field_9b2 >> 4 & 1 && !*(int *)&a0->padding_162[1902])
                        {
                            v5 = 18;
                        }
                        else if (!*(int *)&a0->padding_162[478])
                        {
                            v5 = 20;
                        }
                        else if (a0->padding_b1c[52] || !*(int *)&a0->padding_b1c[32])
                        {
                            v5 = 14;
                        }
                        else
                        {
                            v5 = 15;
                        }
                        a0->field_ac = v5;
                        a0->field_90 = sub_a7c2c0();
                        return 1;
                    }
LABEL_9a6e04:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 451, "ossl_statem_client13_write_transition");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    return 0;
                }
            }
        }
        a0->field_ac = v3;
        return 1;
    }
    if (50 < a0->field_ac)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 556, "ossl_statem_client_write_transition");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    goto *((void *)(sub_9a6bd8 + *(char *)(a0->field_ac + 13797312) * 4));
}
