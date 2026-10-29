/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7e40..0xaa7eec (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa7e40(unsigned long a0, unsigned long long *a1, long long a2, long long a3, long long a4)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa96d4(a2, 1, a3, a4);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/rand/prov_seed.c", 28, "ossl_rand_get_entropy");
        sub_a36abc(36, 0x80024, 0);
        return 0;
    }
    v3 = v2;
    if (sub_b4b494())
    {
        v4 = sub_c4c40(v3);
        *a1 = sub_aa9818(v3);
    }
    else
    {
        v4 = 0;
    }
    sub_aa97ac(v3);
    return v4;
}
