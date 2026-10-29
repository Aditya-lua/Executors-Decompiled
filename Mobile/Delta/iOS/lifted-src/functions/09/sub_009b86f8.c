/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b86f8..0x9b8864 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b86f8_1 {
    int field_0;
    char padding_4[212];
    struct st_9b86f8_0 *field_d8;
} st_9b86f8_1;

typedef struct st_9b86f8_3 {
    char padding_0[24];
    struct st_9b86f8_1 *field_18;
    char padding_20[1256];
    unsigned int field_508;
    char padding_50c[1012];
    struct st_9b86f8_2 *field_900;
} st_9b86f8_3;

typedef struct st_9b86f8_2 {
    char padding_0[728];
    unsigned long long field_2d8;
} st_9b86f8_2;

typedef struct st_9b86f8_0 {
    char padding_0[80];
    char field_50;
} st_9b86f8_0;


long long sub_9b86f8(st_9b86f8_3 *a0, long long a1, unsigned int a2, long long a3)
{
    char v2;  // w8
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (a0->field_900->field_2d8 >> 9) / 1953125;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        if (0x2260ff9290000 < a0->field_900->field_2d8)
            v2 = 604800;
    }
    else if (a0->field_508)
    {
        v2 = 0;
    }
    if (!sub_c68d5c(a1, v2, 4))
    {
        v3 = 3957;
    }
    else if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || sub_c68d5c(a1, a2, 4) && sub_a6ec4c(a1, a3, 8, 1))
    {
        if (sub_c6876c(a1, 2))
            return 1;
        v3 = 3971;
    }
    else
    {
        v3 = 3964;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_srvr.c", v3, "create_ticket_prequel");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
