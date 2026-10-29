/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c1fc..0xb5c268 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c1fc_0 {
    char padding_0[108];
    char field_6c;
} st_b5c1fc_0;


char sub_b5c1fc(st_b5c1fc_0 *a0, unsigned long a1, unsigned long a2)
{
    char v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
    {
        return v2;
    }
    else if (!(a0->field_6c >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 560, "ossl_cipher_generic_stream_final");
        sub_a36abc(57, 114, 0);
        return 0;
    }
    else
    {
        *(unsigned long long *)a2 = 0;
        return 1;
    }
}
