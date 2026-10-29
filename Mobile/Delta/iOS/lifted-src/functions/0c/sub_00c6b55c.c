/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6b55c..0xc6b6b0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6b55c_0 {
    char padding_0[8];
    struct st_c6b55c_1 *field_8;
} st_c6b55c_0;

typedef struct st_c6b55c_2 {
    char padding_0[108];
    char field_6c;
    char padding_6d[59];
    struct st_c6b55c_0 *field_a8;
} st_c6b55c_2;

typedef struct st_c6b55c_1 {
    unsigned long long field_0;
} st_c6b55c_1;


char sub_c6b55c(st_c6b55c_2 *a0, unsigned long a1, unsigned long a2, char a3, unsigned long a4, char a5)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_6c >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 496, "ossl_cipher_generic_stream_update");
        v2 = 114;
    }
    else if (!a5)
    {
        *(unsigned long long *)a2 = 0;
        return 1;
    }
    else if (a5 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 506, "ossl_cipher_generic_stream_update");
        v2 = 106;
    }
    else
    {
        a0->field_a8->field_8();
    }
    sub_a36abc(57, v2, 0);
    return 0;
}
