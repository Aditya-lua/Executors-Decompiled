/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4fba8..0xb4fc1c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4fba8_0 {
    struct st_b4fba8_0 *field_0;
} st_b4fba8_0;


st_b4fba8_0 ** sub_b4fba8(st_b4fba8_0 **a0, st_b4fba8_0 **a1, st_b4fba8_0 **a2, unsigned long a3)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a1 && *(char *)a1)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/ml_dsa_sig.c", 163, "ml_dsa_digest_signverify_init");
        sub_a36abc(57, 122, "Explicit digest not supported for ML-DSA operations");
        return 0;
    }
    *(unsigned int *)&a0[75] = 0;
}
