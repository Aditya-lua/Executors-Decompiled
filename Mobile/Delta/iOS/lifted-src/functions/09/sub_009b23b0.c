/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b23b0..0x9b2510 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b23b0_1 {
    int field_0;
    char padding_4[212];
    struct st_9b23b0_0 *field_d8;
} st_9b23b0_1;

typedef struct st_9b23b0_2 {
    char padding_0[24];
    struct st_9b23b0_1 *field_18;
} st_9b23b0_2;

typedef struct st_9b23b0_0 {
    char padding_0[80];
    char field_50;
} st_9b23b0_0;


unsigned long long sub_9b23b0(st_9b23b0_2 *a0, long long a1, long long a2, int a3, unsigned int a4)
{
    st_9b23b0_2 *v3;  // x19
    long long v4;  // x23
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    long long v7;  // x2
    char v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    if (a4)
        v4 = 0x9000;
    else
        v4 = 0x1000;
    v5 = sub_afc3f8();
    if (!(v5 >> 31 & 1))
    {
        if (sub_a6e86c(a1, v5 & 0xffffffff, &v0, 3) && sub_afc3f8(a2, &v0) == (unsigned int)v5)
        {
            if (!(v3->field_18->field_d8->field_50 >> 3 & 1) && v3->field_18->field_0 >= 772)
            {
                if (a4 || v3->field_18->field_0 != 0x10000)
                    goto LABEL_9b24ec;
            }
            else
            {
                if (a4)
                {
LABEL_9b24ec:
                    v6 = sub_99b1e4(v3, a1, v4, a2, a3);
                    if (!(unsigned int)v6)
                        return v6;
                }
            }
            return 1;
        }
        if (!a4)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 1006, "ssl_add_cert_to_wpacket");
            v7 = 786691;
            goto LABEL_9b24c0;
        }
    }
    else if (!a4)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 1000, "ssl_add_cert_to_wpacket");
        v7 = 524295;
LABEL_9b24c0:
        sub_9a58a4(v3, 80, v7, 0);
    }
    return 0;
}
