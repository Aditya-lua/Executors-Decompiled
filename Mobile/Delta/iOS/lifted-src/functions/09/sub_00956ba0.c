/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956ba0..0x956d2c (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956ba0_0 {
    char padding_0[8];
    struct st_956ba0_1 *field_8;
} st_956ba0_0;

typedef struct st_956ba0_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_956ba0_1;


long long * sub_956ba0(st_956ba0_0 *a0)
{
    long long *v3;  // x20
    long long *v4;  // x0
    long long *v5;  // x21
    long long *v6;  // x20
    long long v7;  // x1
    long long *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = &a0->field_8->field_0;
    v4 = sub_967f24(v3);
    v0 = 0;
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x14c1, "ssl_generate_pkey_group");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        sub_a5d6b0(0);
        return v0;
    }
    v5 = v4;
    v6 = sub_a5d168(*v3, v5[2], v3[142]);
    if (!v6)
    {
        sub_a368c8();
        v7 = 5321;
    }
    else if ((int)sub_a5ca90(v6) > 0)
    {
        if ((int)sub_a50df4(v6, v5[1]) > 0)
        {
            if (0 >= (int)sub_a5cde8(v6, &v0))
            {
                sub_a368c8();
                sub_a369bc("ssl/s3_lib.c", 0x14d5, "ssl_generate_pkey_group");
                sub_9a58a4(a0, 80, 0x80006, 0);
                sub_a5a4c8(v0);
                v0 = 0;
                sub_a5d6b0(v6);
                return v0;
            }
            sub_a5d6b0(v6);
            return v0;
        }
        sub_a368c8();
        v7 = 5329;
    }
    else
    {
        sub_a368c8();
        v7 = 5325;
    }
    sub_a369bc("ssl/s3_lib.c", v7, "ssl_generate_pkey_group");
    sub_9a58a4(a0, 80, 0x80006, 0);
    sub_a5d6b0(v6);
    return v0;
}
