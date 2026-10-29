/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1e94..0x9b20c0 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1e94_0 {
    unsigned short *field_0;
    unsigned long long field_8;
} st_9b1e94_0;

typedef struct st_9b1e94_1 {
    char padding_0[856];
    long long field_358;
} st_9b1e94_1;

extern long long g_9b20c0;

long long sub_9b1e94(st_9b1e94_1 *a0, st_9b1e94_0 *a1)
{
    st_9b1e94_1 *v3;  // x20
    long long v4;  // x19
    long long v13;  // x1
    long long v14;  // x2
    st_9b1e94_1 *v15;  // x0
    long long v16;  // x1
    long long v17;  // x1
    long long v18;  // x2
    long long v5;  // x8
    unsigned long v6;  // x10
    long long v7;  // x23
    unsigned short *v8;  // x24
    unsigned long v9;  // x8
    long long v10;  // x22
    long long v11;  // x8
    long long v12;  // x21
    unsigned short *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = sub_ad6270(&g_9b20c0);
    if (v4)
    {
        v5 = a1->field_8 - 2;
        if (a1->field_8 < 2 || (v6 = *a1->field_0, v7 = (unsigned int)((v6 & 0xff00) >> 8) | (unsigned int)v6 * 0x100 & 0xff00ff00, (unsigned long long)v7 > (unsigned long long)v5))
        {
            sub_a368c8();
            v13 = 2727;
        }
        else
        {
            v8 = a1->field_0 + 1;
            a1->field_0 = (char *)v8 + v7;
            a1->field_8 = v5 - v7;
            if (!v7)
            {
                sub_ad6958(v3->field_358, sub_afa390);
                v3->field_358 = v4;
                return 1;
            }
            while (1)
            {
                if (v7 == 1 || (v9 = *v8, v10 = (unsigned int)((v9 & 0xff00) >> 8) | (unsigned int)v9 * 0x100 & 0xff00ff00, v11 = v7 - 2, v7 = v11 - v10, (unsigned long long)v11 < (unsigned long long)v10))
                {
                    sub_a368c8();
                    v13 = 2737;
                    break;
                }
                v0 = v8 + 1;
                v12 = sub_afa36c(0, &v0, v10);
                if (!v12)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_lib.c", 2743, "parse_ca_names");
                    v14 = 524301;
                    v15 = v3;
                    v16 = 50;
                    goto LABEL_9b20b4;
                }
                v8 = (char *)v0 + v10;
                if (v0 != v8)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_lib.c", 2747, "parse_ca_names");
                    v15 = v3;
                    v16 = 50;
                    v14 = 131;
                    goto LABEL_9b20b4;
                }
                else if (!sub_ad68a0(v4, v12))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_lib.c", 2752, "parse_ca_names");
                    v15 = v3;
                    v16 = 80;
                    v14 = 524303;
LABEL_9b20b4:
                    sub_9a58a4(v15, v16, v14, 0);
                    sub_ad6958(v4, sub_afa390);
                    sub_afa390(v12);
                    return 0;
                }
                else if (!v7)
                {
                    sub_ad6958(v3->field_358, sub_afa390);
                    v3->field_358 = v4;
                    return 1;
                }
            }
        }
        sub_a369bc("ssl/statem/statem_lib.c", v13, "parse_ca_names");
        v17 = 50;
        v18 = 159;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2722, "parse_ca_names");
        v17 = 80;
        v18 = 524303;
    }
    sub_9a58a4(v3, v17, v18, 0);
    sub_ad6958(v4, sub_afa390);
    sub_afa390(0);
    return 0;
}
