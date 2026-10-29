/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2894..0x9b2d4c (1208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2894_2 {
    char padding_0[24];
    struct st_9b2894_1 *field_18;
    char padding_20[140];
    unsigned int field_ac;
} st_9b2894_2;

typedef struct st_9b2894_1 {
    int field_0;
    char padding_4[212];
    struct st_9b2894_0 *field_d8;
} st_9b2894_1;

typedef struct st_9b2894_0 {
    char padding_0[80];
    unsigned int field_50;
} st_9b2894_0;

extern char g_d28a98;

unsigned int sub_9b2894(st_9b2894_2 *a0)
{
    long long v2;  // x2
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        if (49 >= a0->field_ac - 1)
        {
            goto *((void *)(sub_9b28f0 + *(&(&g_d28a98)[a0->field_ac] - 1) * 4));
        }
        else
        {
            sub_a368c8();
            v2 = "ossl_statem_server13_write_transition";
            v3 = 480;
        }
    }
    else
    {
        if (40 >= a0->field_ac)
        {
            goto *((void *)(sub_9b2920 + *(char *)(a0->field_ac + 13798090) * 4));
        }
        else
        {
            sub_a368c8();
            v2 = "ossl_statem_server_write_transition";
            v3 = 622;
        }
    }
    sub_a369bc("ssl/statem/statem_srvr.c", v3, v2);
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
