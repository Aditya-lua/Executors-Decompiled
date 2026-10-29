/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c268..0xb5c36c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c268_0 {
    char padding_0[8];
    struct st_b5c268_1 *field_8;
} st_b5c268_0;

typedef struct st_b5c268_2 {
    char padding_0[108];
    char field_6c;
    char padding_6d[59];
    struct st_b5c268_0 *field_a8;
} st_b5c268_2;

typedef struct st_b5c268_1 {
    unsigned long long field_0;
} st_b5c268_1;


char sub_b5c268(st_b5c268_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    char v2;  // w0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    if (!(a0->field_6c >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 578, "ossl_cipher_generic_cipher");
        v3 = 114;
    }
    else if (a5 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 583, "ossl_cipher_generic_cipher");
        v3 = 106;
    }
    else
    {
        a0->field_a8->field_8();
    }
    sub_a36abc(57, v3, 0);
    return 0;
}
