/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0155c..0xb01610 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0155c_0 {
    char padding_0[8];
    struct st_b0155c_1 *field_8;
} st_b0155c_0;

typedef struct st_b0155c_1 {
    unsigned long long field_0;
} st_b0155c_1;


int sub_b0155c(st_b0155c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    if (a5 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", 148, "ossl_aes_gcm_siv_cipher");
        sub_a36abc(57, 106, 0);
        return 0;
    }
    (*(long long *)&a0->field_8[1])();
}
