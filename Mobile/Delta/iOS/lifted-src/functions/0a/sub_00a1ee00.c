/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1ee00..0xa1ee54 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1ee00_1 {
    char padding_0[24];
    struct st_a1ee00_2 *field_18;
} st_a1ee00_1;

typedef struct st_a1ee00_0 {
    char padding_0[392];
    long long field_188;
} st_a1ee00_0;

typedef struct st_a1ee00_2 {
    struct st_a1ee00_0 *field_0;
} st_a1ee00_2;


long long sub_a1ee00(unsigned long a0, unsigned long a1, unsigned long a2, st_a1ee00_1 *a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*(long long *)(*(long long *)a3->field_18 + 392))
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 67, "ossl_ecdsa_verify_sig");
        sub_a36abc(16, 0xaa, 0);
        return 0;
    }
    goto *((void *)(*(long long *)(*(long long *)a3->field_18 + 392)));
}
