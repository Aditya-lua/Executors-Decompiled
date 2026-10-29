/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52b80..0xb52bd8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52b80_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[176];
    unsigned long long field_c8;
} st_b52b80_0;


long long sub_b52b80(st_b52b80_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_c8)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6bf4c(sub_aafbcc(a0->field_10), "providers/implementations/signature/rsa_sig.c", 614);
        a0->field_c8 = v8;
        return v8 != 0;
    }
    return 1;
}
