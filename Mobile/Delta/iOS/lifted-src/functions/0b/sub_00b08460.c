/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08460..0xb0852c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b08460_2 {
    char padding_0[168];
    struct st_b08460_0 *field_a8;
} st_b08460_2;

typedef struct st_b08460_0 {
    char padding_0[24];
    struct st_b08460_1 *field_18;
} st_b08460_0;

typedef struct st_b08460_1 {
    unsigned long long field_0;
} st_b08460_1;


long long sub_b08460(st_b08460_2 *a0, unsigned long a1, long long *a2, long long a3, unsigned long a4, long long a5)
{
    long long v2;  // w0
    long long v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a5)
    {
        v2 = (unsigned int)sub_a2f9e0();
        if (!v2)
            return v2;
        if ((unsigned long long)a5 > (unsigned long long)a3)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", 305, "chacha20_poly1305_cipher");
            sub_a36abc(57, 106, 0);
            return 0;
        }
        a0->field_a8->field_18();
    }
    else
    {
        v3 = (unsigned int)sub_a2f9e0();
        if (!v3)
            return v3;
        *a2 = 0;
        return 1;
    }
}
