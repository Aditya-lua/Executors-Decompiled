/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb03b54..0xb03bc8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b03b54_0 {
    char padding_0[40];
    struct st_b03b54_1 *field_28;
} st_b03b54_0;

typedef struct st_b03b54_1 {
    unsigned long long field_0;
} st_b03b54_1;

typedef struct st_b03b54_2 {
    char padding_0[104];
    struct st_b03b54_0 *field_68;
} st_b03b54_2;


long long sub_b03b54(st_b03b54_2 *a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bf4c(120, "providers/implementations/ciphers/cipher_aes_siv.c", 67);
    if (!v2)
        return v2;
    a0->field_68->field_28();
}
