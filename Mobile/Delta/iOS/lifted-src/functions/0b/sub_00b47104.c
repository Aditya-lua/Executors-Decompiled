/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47104..0xb4715c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b47104(unsigned long a0, unsigned long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a50b14(a2))
        return 1;
    sub_a368c8();
    sub_a369bc("providers/implementations/rands/drbg.c", 0x3ff, "ossl_drbg_verify_digest");
    sub_a36abc(57, 183, 0);
    return 0;
}
