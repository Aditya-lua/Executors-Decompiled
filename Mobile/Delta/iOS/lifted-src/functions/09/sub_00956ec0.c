/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956ec0..0x95710c (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956ec0_1 {
    int field_0;
    char padding_4[212];
    struct st_956ec0_0 *field_d8;
} st_956ec0_1;

typedef struct st_956ec0_0 {
    char padding_0[80];
    char field_50;
} st_956ec0_0;

typedef struct st_956ec0_3 {
    long long field_0;
} st_956ec0_3;

typedef struct st_956ec0_2 {
    char padding_0[8];
    struct st_956ec0_3 *field_8;
    char padding_10[8];
    struct st_956ec0_1 *field_18;
    char padding_20[912];
    long long field_3b0;
} st_956ec0_2;


char sub_956ec0(st_956ec0_2 *a0, char a1, char a2, char a3)
{
    st_956ec0_2 *v3;  // x20
    long long v4;  // x19
    char v5;  // x0
    long long v6;  // x21
    char v7;  // x20
    char v8;  // x0
    long long v9;  // x2
    char v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v0 = 0;
    if (a1 && a2)
    {
        v4 = sub_a5d5a8(*(long long *)v3->field_8);
        if ((int)sub_a52b8c(v4) >= 1 && (int)sub_a532b8(v4, a2) >= 1 && (int)sub_a532c0(v4, 0, &v0) > 0)
        {
            if (!(v3->field_18->field_d8->field_50 >> 3 & 1) && v3->field_18->field_0 >= 772 && v3->field_18->field_0 != 0x10000 && sub_a5b3bc(a1, "DH"))
                sub_a3f218(v4, 1);
            v5 = sub_a6bf4c(v0, "ssl/s3_lib.c", 0x1535);
            if (v5)
            {
                v6 = v5;
                if ((int)sub_a532c0(v4, v6, &v0) <= 0)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/s3_lib.c", 0x153f, "ssl_derive");
                    sub_9a58a4(v3, 47, 108, 0);
                    v7 = 0;
                    v8 = v6;
                }
                else if (a3)
                {
                    v7 = sub_956e18(v3, v6, v0);
                    v8 = v6;
                }
                else
                {
                    v3->field_3b0 = v6;
                    *(unsigned long long *)v3[1].padding_0 = v0;
                    v7 = 1;
                    v8 = 0;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/s3_lib.c", 0x1537, "ssl_derive");
                v9 = 524303;
LABEL_957040:
                sub_9a58a4(v3, 80, v9, 0);
                v8 = 0;
                v7 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/s3_lib.c", 0x152e, "ssl_derive");
            v9 = 786691;
            goto LABEL_957040;
        }
        sub_a6c4e8(v8, v0, "ssl/s3_lib.c", 0x154f);
        sub_a5d6b0(v4);
        return v7;
    }
    sub_a368c8();
    sub_a369bc("ssl/s3_lib.c", 0x1525, "ssl_derive");
    sub_9a58a4(v3, 80, 0xc0103, 0);
    return 0;
}
