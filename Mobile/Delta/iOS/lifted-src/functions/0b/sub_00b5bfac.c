/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5bfac..0xb5c1fc (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5bfac_0 {
    char padding_0[8];
    struct st_b5bfac_1 *field_8;
} st_b5bfac_0;

typedef struct st_b5bfac_2 {
    char padding_0[16];
    char field_10;
    char padding_11[79];
    char field_60;
    char padding_61[11];
    char field_6c;
    char padding_6d[3];
    unsigned int field_70;
    char padding_74[52];
    struct st_b5bfac_0 *field_a8;
} st_b5bfac_2;

typedef struct st_b5bfac_1 {
    unsigned long long field_0;
} st_b5bfac_1;


unsigned long long sub_b5bfac(st_b5bfac_2 *a0, unsigned long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // w0
    unsigned long v4;  // x8
    long long v5;  // x1
    long long v6;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)&a0->padding_11[71];
    v3 = (unsigned int)sub_a2f9e0();
    if (!v3)
        return v3;
    v4 = a0->field_6c;
    if (!(v4 >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 425, "ossl_cipher_generic_block_final");
        v5 = 114;
    }
    else if (a0->field_70)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 431, "ossl_cipher_generic_block_final");
        v5 = 0x66;
    }
    else if (!(v4 >> 1 & 1))
    {
        if (*(long long *)&a0->field_60 == v2)
            a0->field_a8->field_8();
        if (!(v4 & 1) && !*(long long *)&a0->field_60)
        {
            *(unsigned long long *)a2 = 0;
            return 1;
        }
        sub_a368c8();
        v6 = 465;
        goto LABEL_b5c194;
        goto LABEL_b5c194;
    }
    else if (!(v4 & 1))
    {
        if (!*(long long *)&a0->field_60)
        {
            *(unsigned long long *)a2 = 0;
            return 1;
        }
        if (*(long long *)&a0->field_60 == v2)
            goto LABEL_b5c120;
        sub_a368c8();
        v6 = 442;
LABEL_b5c194:
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v6, "ossl_cipher_generic_block_final");
        v5 = 107;
    }
    else
    {
        sub_b5c758(&a0->field_10, &a0->field_60, v2);
LABEL_b5c120:
        if (v2 <= a3)
            a0->field_a8->field_8();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 447, "ossl_cipher_generic_block_final");
        v5 = 106;
    }
    sub_a36abc(57, v5, 0);
    return 0;
}
