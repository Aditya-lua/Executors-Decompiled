/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08598..0xb0864c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b08598_2 {
    char padding_0[168];
    struct st_b08598_0 *field_a8;
} st_b08598_2;

typedef struct st_b08598_0 {
    char padding_0[24];
    struct st_b08598_1 *field_18;
} st_b08598_0;

typedef struct st_b08598_1 {
    unsigned long long field_0;
} st_b08598_1;


int sub_b08598(st_b08598_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
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
        sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", 305, "chacha20_poly1305_cipher");
        sub_a36abc(57, 106, 0);
        return 0;
    }
    a0->field_a8->field_18();
}
