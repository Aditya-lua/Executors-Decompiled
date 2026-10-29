/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ed58..0xa1edac (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ed58_1 {
    char padding_0[24];
    struct st_a1ed58_2 *field_18;
} st_a1ed58_1;

typedef struct st_a1ed58_0 {
    char padding_0[376];
    long long field_178;
} st_a1ed58_0;

typedef struct st_a1ed58_2 {
    struct st_a1ed58_0 *field_0;
} st_a1ed58_2;


long long sub_a1ed58(st_a1ed58_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*(long long *)(*(long long *)a0->field_18 + 376))
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 43, "ossl_ecdsa_sign_setup");
        sub_a36abc(16, 0xaa, 0);
        return 0;
    }
    goto *((void *)(*(long long *)(*(long long *)a0->field_18 + 376)));
}
