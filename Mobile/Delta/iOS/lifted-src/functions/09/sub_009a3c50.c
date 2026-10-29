/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3c50..0x9a3d24 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3c50_1 {
    int field_0;
    char padding_4[212];
    struct st_9a3c50_0 *field_d8;
} st_9a3c50_1;

typedef struct st_9a3c50_2 {
    char padding_0[24];
    struct st_9a3c50_1 *field_18;
    char padding_20[1256];
    unsigned int field_508;
    char padding_50c[1620];
    unsigned int field_b60;
} st_9a3c50_2;

typedef struct st_9a3c50_0 {
    char padding_0[80];
    char field_50;
} st_9a3c50_0;


long long sub_9a3c50(st_9a3c50_2 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_b60 != 1)
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_508)
    {
        if (a0->field_18->field_d8->field_50 >> 3 & 1)
        {
            return 2;
        }
        else if (a0->field_18->field_0 < 772)
        {
            return 2;
        }
        else if (a0->field_18->field_0 == 0x10000)
        {
            return 2;
        }
    }
    if (sub_c68d5c(a1, 0, 2) && sub_c68d5c(a1, 0, 2))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1620, "tls_construct_stoc_server_name");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
