/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1edac..0xa1ee00 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1edac_1 {
    char padding_0[24];
    struct st_a1edac_2 *field_18;
} st_a1edac_1;

typedef struct st_a1edac_0 {
    char padding_0[384];
    long long field_180;
} st_a1edac_0;

typedef struct st_a1edac_2 {
    struct st_a1edac_0 *field_0;
} st_a1edac_2;


long long sub_a1edac(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, st_a1edac_1 *a4)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*(long long *)(*(long long *)a4->field_18 + 384))
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 55, "ossl_ecdsa_sign_sig");
        sub_a36abc(16, 0xaa, 0);
        return 0;
    }
    goto *((void *)(*(long long *)(*(long long *)a4->field_18 + 384)));
}
