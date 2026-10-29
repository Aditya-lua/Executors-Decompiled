/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x956d2c..0x956e18 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_956d2c_0 {
    char padding_0[8];
    struct st_956d2c_1 *field_8;
} st_956d2c_0;

typedef struct st_956d2c_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_956d2c_1;


long long * sub_956d2c(st_956d2c_0 *a0)
{
    long long *v3;  // x19
    long long *v4;  // x0
    long long *v5;  // x21
    long long *v6;  // x19
    long long *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = &a0->field_8->field_0;
    v0 = 0;
    v4 = sub_967f24(v3);
    if (v4)
    {
        v5 = v4;
        v6 = sub_a5d168(*v3, v5[2], v3[142]);
        if (v6 && (int)sub_a5c93c(v6) >= 1)
        {
            if ((int)sub_a50df4(v6, v5[1]) <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/s3_lib.c", 0x14f4, "ssl_generate_param_group");
                sub_9a58a4(a0, 80, 0x80006, 0);
            }
            else if (0 >= (int)sub_a5cd98(v6, &v0))
            {
                sub_a5a4c8(v0);
                v0 = 0;
            }
        }
    }
    else
    {
        v6 = 0;
    }
    sub_a5d6b0(v6);
    return v0;
}
