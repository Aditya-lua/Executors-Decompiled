/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc0a8..0xadc174 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc0a8_1 {
    char padding_0[16];
    struct st_adc0a8_0 *field_10;
} st_adc0a8_1;

typedef struct st_adc0a8_0 {
    struct st_adc0a8_0 *field_0;
    struct st_adc0a8_0 *field_8;
    struct st_adc0a8_0 *field_10;
} st_adc0a8_0;


int sub_adc0a8(st_adc0a8_1 *a0)
{
    st_adc0a8_0 *v2;  // x0
    st_adc0a8_0 *v3;  // x19
    long long v4;  // x20
    st_adc0a8_0 *v5;  // x0
    st_adc0a8_0 *v6;  // x0
    long long v7;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(24, "crypto/x509/by_dir.c", 110);
    if (v2)
    {
        v3 = v2;
        v4 = 524291;
        v5 = sub_9ebce0();
        v3->field_0 = v5;
        if (v5)
        {
            v3->field_8 = 0;
            v6 = sub_a7c11c();
            v3->field_10 = v6;
            if (v6)
            {
                a0->field_10 = v3;
                v2 = 1;
            }
            else
            {
                sub_9ebcf4(v3->field_0);
                v4 = 524303;
                v7 = 123;
LABEL_adc120:
                sub_a368c8();
                sub_a369bc("crypto/x509/by_dir.c", v7, "new_dir");
                sub_a36abc(11, v4, 0);
                sub_a6c2e4(v3, "crypto/x509/by_dir.c", 130);
                v2 = 0;
            }
        }
        else
        {
            v7 = 116;
            goto LABEL_adc120;
        }
    }
    return (unsigned int)v2;
}
