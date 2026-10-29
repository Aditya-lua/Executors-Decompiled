/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967210..0x9673e8 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967210_0 {
    char padding_0[8];
    long long field_8;
} st_967210_0;

typedef struct st_967210_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[344];
    char field_168;
    char padding_169[31];
    char field_188;
    char padding_189[471];
    unsigned long long field_360;
    unsigned long long field_368;
    long long field_370;
    long long field_378;
    char padding_380[1408];
    struct st_967210_0 *field_900;
    char padding_908[524];
    unsigned int field_b14;
} st_967210_1;


unsigned long long sub_967210(st_967210_1 *a0)
{
    unsigned long long v8;  // x0
    unsigned int v9;  // w20
    st_967210_1 *v10;  // x0
    long long v11;  // x2
    unsigned long long v12;  // x20
    unsigned long long v13;  // x0
    long long v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x4c]
    char v3;  // [bp-0x48]
    long long v4;  // [bp-0x40]
    long long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = 0;
    v1 = 0;
    if (a0->field_360)
    {
        return 1;
    }
    else if (sub_95a46c(a0->field_8, a0->field_900, &v5, &v4, &v2, &v1, &v3, a0->field_b14))
    {
        sub_961c44(a0->field_370);
        a0->field_370 = v5;
        sub_961c0c(a0->field_378);
        a0->field_378 = v4;
        *(unsigned int *)&a0->padding_380[0] = v2;
        *(unsigned long long *)&a0->padding_380[8] = v1;
        if (sub_a4fdf4(v5) == 6 || sub_a4fdf4(v5) == 7)
        {
            v9 = 4;
LABEL_9672cc:
            v12 = (v1 + v9 + sub_9e4290(v5)) * 2;
            sub_9543e4(a0);
            v13 = sub_a6bf4c(v12, "ssl/t1_enc.c", 296);
            if (v13)
            {
                a0->field_360 = v12;
                a0->field_368 = v13;
                *(unsigned int *)&v0 = 1;
                return sub_9674f0(a0, "key expansion", 13, &a0->field_168, 32, &a0->field_188, 32, 0, 0, a0->field_900 + 5, a0->field_900->field_8, v13, v12, v0);
            }
            sub_a368c8();
            sub_a369bc("ssl/t1_enc.c", 297, "tls1_setup_key_block");
            v10 = a0;
            v11 = 524303;
        }
        else
        {
            v8 = sub_a50728(v5);
            v9 = v8;
            if (!(v8 >> 31 & 1))
                goto LABEL_9672cc;
            sub_a368c8();
            sub_a369bc("ssl/t1_enc.c", 288, "tls1_setup_key_block");
            v10 = a0;
            v11 = 786691;
        }
        sub_9a58a4(v10, 80, v11, 0);
        return 0;
    }
    else
    {
        sub_9a5810(a0, 80);
        return 0;
    }
}
