/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03c80..0xb03d38 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03c80_0 {
    unsigned long long field_0;
} st_b03c80_0;

typedef struct st_b03c80_2 {
    struct st_b03c80_0 *field_0;
} st_b03c80_2;

typedef struct st_b03c80_1 {
    char padding_0[4];
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
    char padding_10[88];
    struct st_b03c80_2 *field_68;
} st_b03c80_1;


int sub_b03c80(st_b03c80_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    a0->field_4 = a0->field_4 & 254;
    if (a1)
    {
        if (a0->field_8 == a2)
            (*(long long *)a0->field_68)();
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_siv.c", 90, "siv_init");
        sub_a36abc(57, 105, 0);
        return 0;
    }
}
