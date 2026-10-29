/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb05500..0xb0564c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b05500_1 {
    char padding_0[72];
    unsigned long long field_48;
    char padding_50[28];
    char field_6c;
    char padding_6d[59];
    struct st_b05500_2 *field_a8;
} st_b05500_1;

typedef struct st_b05500_0 {
    unsigned long long field_0;
} st_b05500_0;

typedef struct st_b05500_2 {
    struct st_b05500_0 *field_0;
} st_b05500_2;


int sub_b05500(st_b05500_1 *a0, unsigned long a1, unsigned long long a2, unsigned long a3, long long a4, unsigned long a5, unsigned int a6)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    a0->field_6c = a0->field_6c & 0xfffffffd | (char)(__ROL__(a6, 1)) & 2 & 3;
    if (a3 && !sub_b5c520(a0, a3, a4))
        return 0;
    if (a1)
    {
        if (a0->field_48 != a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_xts.c", 90, "aes_xts_init");
            v2 = 105;
        }
        else if (!a6 || sub_a66f20(a1, a1 + (a2 >> 1), a2 >> 1))
        {
            (*(long long *)a0->field_a8)();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_xts.c", 59, "aes_xts_check_keys_differ");
            v2 = 149;
        }
        sub_a36abc(57, v2, 0);
        return 0;
    }
}
