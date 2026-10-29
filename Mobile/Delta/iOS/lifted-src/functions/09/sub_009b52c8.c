/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b52c8..0x9b53a4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b52c8_0 {
    char padding_0[172];
    int field_ac;
} st_9b52c8_0;


long long sub_9b52c8(st_9b52c8_0 *a0)
{
    int v5;  // w8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_ac;
    if (v5 > 33)
    {
        switch (v5)
        {
        default:
LABEL_9b5350:
            v0 = v6;
            v1 = v7;
            v2 = &v4;
            v3 = v8;
            sub_a368c8();
        }
    }
    else if (31 >= v5)
    {
        switch (v5)
        {
        default:
LABEL_9b5350:
            v0 = v6;
            v1 = v7;
            v2 = &v4;
            v3 = v8;
            sub_a368c8();
        }
    }
    else if (v5 != 32)
    {
        if (v5 != 33)
            goto LABEL_9b5350;
    }
    sub_a369bc("ssl/statem/statem_srvr.c", 1287, "ossl_statem_server_process_message");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
