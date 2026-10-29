/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e984..0xa1e9d8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1e984_1 {
    char padding_0[24];
    struct st_a1e984_2 *field_18;
} st_a1e984_1;

typedef struct st_a1e984_0 {
    char padding_0[368];
    long long field_170;
} st_a1e984_0;

typedef struct st_a1e984_2 {
    struct st_a1e984_0 *field_0;
} st_a1e984_2;


long long sub_a1e984(unsigned long a0, unsigned long a1, unsigned long a2, st_a1e984_1 *a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*(long long *)(*(long long *)a3->field_18 + 368))
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdh_ossl.c", 32, "ossl_ecdh_compute_key");
        sub_a36abc(16, 160, 0);
        return 0;
    }
    goto *((void *)(*(long long *)(*(long long *)a3->field_18 + 368)));
}
