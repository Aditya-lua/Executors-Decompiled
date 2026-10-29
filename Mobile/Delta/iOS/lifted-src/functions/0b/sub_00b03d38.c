/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03d38..0xb03df4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03d38_0 {
    char padding_0[8];
    struct st_b03d38_1 *field_8;
} st_b03d38_0;

typedef struct st_b03d38_1 {
    unsigned long long field_0;
} st_b03d38_1;

typedef struct st_b03d38_2 {
    char padding_0[104];
    struct st_b03d38_0 *field_68;
} st_b03d38_2;


int sub_b03d38(st_b03d38_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    if (a1 && a5 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_siv.c", 122, "siv_cipher");
        sub_a36abc(57, 106, 0);
        return 0;
    }
    a0->field_68->field_8();
}
