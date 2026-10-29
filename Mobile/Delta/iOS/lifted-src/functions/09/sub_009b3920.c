/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b3920..0x9b3a3c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b3920_1 {
    int field_0;
    char padding_4[212];
    struct st_9b3920_0 *field_d8;
} st_9b3920_1;

typedef struct st_9b3920_2 {
    char padding_0[24];
    struct st_9b3920_1 *field_18;
    char padding_20[952];
    unsigned long long field_3d8;
    char padding_3e0[1906];
    char field_b52;
} st_9b3920_2;

typedef struct st_9b3920_0 {
    char padding_0[80];
    char field_50;
} st_9b3920_0;


long long sub_9b3920(st_9b3920_2 *a0, long long a1)
{
    long long v2;  // x1
    char v3;  // w8
    char v4;  // x0
    char v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_3d8)
    {
        sub_a368c8();
        v2 = 3873;
    }
    else if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || sub_c68d5c(a1, 0, 1))
    {
        switch (v3)
        {
        case 0:
            v5 = sub_9b02fc(a0);
            if (!v5)
                return v5;
            return 1;
        case 2:
            v4 = sub_9b00b8(a0);
            if (!v4)
                return v4;
            return 1;
        default:
            sub_a368c8();
            v2 = 3899;
            break;
        }
    }
    else
    {
        sub_a368c8();
        v2 = 3882;
    }
    sub_a369bc("ssl/statem/statem_srvr.c", v2, "tls_construct_server_certificate");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
