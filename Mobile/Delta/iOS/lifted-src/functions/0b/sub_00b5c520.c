/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c520..0xb5c5bc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c520_0 {
    char padding_0[32];
    char field_20;
    char padding_21[47];
    long long field_50;
    char padding_58[20];
    char field_6c;
} st_b5c520_0;


long long sub_b5c520(st_b5c520_0 *ptr, long long a1, long long n)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (16 >= (unsigned long long)n && ptr->field_50 == n)
    {
        ptr->field_6c = ptr->field_6c | 4;
        _memcpy(&ptr->field_20);
        _memcpy(ptr, a1, n);
        return 1;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 708, "ossl_cipher_generic_initiv");
    sub_a36abc(57, 109, 0);
    return 0;
}
