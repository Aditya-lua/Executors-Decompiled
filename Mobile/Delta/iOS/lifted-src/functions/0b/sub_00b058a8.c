/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb058a8..0xb05904 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b058a8_2 {
    char padding_0[168];
    struct st_b058a8_0 *field_a8;
} st_b058a8_2;

typedef struct st_b058a8_0 {
    char padding_0[16];
    struct st_b058a8_1 *field_10;
} st_b058a8_0;

typedef struct st_b058a8_1 {
    unsigned long long field_0;
} st_b058a8_1;


int sub_b058a8(st_b058a8_2 *a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bf4c(472, "providers/implementations/ciphers/cipher_aria.c", 35);
        if (v2)
            a0->field_a8->field_10();
    }
    else
    {
        v2 = 0;
    }
    return v2;
}
