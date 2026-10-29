/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14034..0xa14160 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14034_0 {
    char padding_0[32];
    long long field_20;
} st_a14034_0;


int sub_a14034(long long a0, st_a14034_0 *a1)
{
    long long v5;  // x21
    unsigned int v6;  // w0
    unsigned long v7;  // x19
    unsigned long long v8;  // x0
    unsigned long v9;  // x21
    unsigned long v0;  // [bp-0x48]
    unsigned int v1;  // [bp-0x3c]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1->field_20;
    v2 = 0;
    if (sub_a14c64(&v1, &v2, v5))
    {
        v6 = sub_a1683c(v5, 0);
        if ((int)v6 >= 1)
        {
            v7 = sub_a6bf4c(v6, "crypto/ec/ec_ameth.c", 83);
            if (!v7 || (v0 = v7, v8 = sub_a1683c(v5, &v0), (int)v8 < 1))
                goto LABEL_a14120;
            v9 = v1;
            if (sub_afbeac(a0, sub_a99624(408), v9, v2, v7, v8))
                return 1;
        }
        else
        {
            v7 = 0;
LABEL_a14120:
            v9 = v1;
        }
        if ((unsigned int)v9 == 16)
            sub_9c7940(v2);
        sub_a6c2e4(v7, "crypto/ec/ec_ameth.c", 96);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_ameth.c", 77, "eckey_pub_encode");
        sub_a36abc(16, 0x80010, 0);
    }
    return 0;
}
