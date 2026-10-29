/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0b29c..0xb0b2f8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0b29c_2 {
    char padding_0[168];
    struct st_b0b29c_0 *field_a8;
} st_b0b29c_2;

typedef struct st_b0b29c_0 {
    char padding_0[16];
    struct st_b0b29c_1 *field_10;
} st_b0b29c_0;

typedef struct st_b0b29c_1 {
    unsigned long long field_0;
} st_b0b29c_1;


int sub_b0b29c(st_b0b29c_2 *a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bf4c(584, "providers/implementations/ciphers/cipher_tdes_common.c", 48);
        if (v2)
            a0->field_a8->field_10();
    }
    else
    {
        v2 = 0;
    }
    return v2;
}
