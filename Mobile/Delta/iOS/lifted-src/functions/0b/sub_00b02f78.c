/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02f78..0xb030e8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b02f78_0 {
    char padding_0[32];
    char field_20;
    char padding_21[47];
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[579];
    char field_2b0;
    char padding_2b1[175];
    unsigned int field_360;
    char field_364;
    char padding_365[3];
    long long field_368;
} st_b02f78_0;


char sub_b02f78(st_b02f78_0 *a0, long long a1, long long *a2, long long a3, char a4, long long a5)
{
    char v2;  // w0
    unsigned int v4;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
    {
        return v2;
    }
    else if (a4)
    {
        if ((unsigned long long)a5 > (unsigned long long)a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 517, "aes_ocb_cipher");
            sub_a36abc(57, 106, 0);
            return 0;
        }
        if (!(a0->field_364 & 1))
            goto LABEL_b03008;
        switch (v4)
        {
        case 0: case 3:
LABEL_b03008:
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 530, "aes_ocb_cipher");
            sub_a36abc(57, 0x66, 0);
            return 0;
        case 1:
            if (sub_a96ab0(&a0->field_2b0, &a0->field_20, a0->field_50, a0->field_368) != 1)
                goto LABEL_b03008;
            else
                goto LABEL_b03080;
        default:
            goto LABEL_b03088;
        }
LABEL_b03080:
        a0->field_360 = 2;
LABEL_b03088:
        if (!(a0->field_6c >> 1 & 1))
        {
            if (sub_a97298(&a0->field_2b0, a4, a1, a5))
            {
                *a2 = a5;
                return 1;
            }
        }
        else
        {
            if (sub_a96f58(&a0->field_2b0, a4, a1, a5))
            {
                *a2 = a5;
                return 1;
            }
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 535, "aes_ocb_cipher");
        sub_a36abc(57, 0x66, 0);
        return 0;
    }
}
