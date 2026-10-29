/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ec78..0xb5ed78 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5ec78(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4() && !sub_a70efc())
    {
        v2 = 21;
    }
    else if (sub_a6fbc4(a0, "size") && !sub_a70efc())
    {
        v2 = 26;
    }
    else if (!sub_a6fbc4(a0, "xof") || sub_a6fe3c())
    {
        if (!sub_a6fbc4(a0, "algid-absent") || sub_a6fe3c())
            return 1;
        v2 = 38;
    }
    else
    {
        v2 = 32;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/digests/digestcommon.c", v2, "ossl_digest_default_get_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
