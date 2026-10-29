/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64954..0xa64b24 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a64954(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10)
{
    long long len;  // x22
    long long len1;  // x0
    long long v5;  // x0
    long long v6;  // x19
    long long v7;  // x0
    char v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]

    v2 = &a8;
    len = _strlen(a5);
    len1 = _strlen(a8);
    v1 = a7 + len + a10 + len1 + 7;
    v5 = sub_a6bf4c(v1, "crypto/hpke/hpke_util.c", 316);
    if (!v5)
        return 0;
    v6 = v5;
    if (sub_c68800(&v0, v6, v1, 0) && sub_a6ebd4(&v0, "HPKE-v1", 7) && sub_a6ebd4(&v0, a5, len) && sub_a6ebd4(&v0, a6, a7) && sub_a6ebd4(&v0, a8, len1) && sub_a6ebd4(&v0, a9, a10) && sub_c68eb8(&v0, &v1) && sub_a6eaf8(&v0))
    {
        v7 = sub_a647a0(a0, a1, a2, 1, a3, a4, v6, v1, 0, 0);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/hpke/hpke_util.c", 329, "ossl_hpke_labeled_extract");
        sub_a36abc(57, 106, 0);
        v7 = 0;
    }
    sub_a6ed4c(&v0);
    sub_a66ec0(v6, v1);
    sub_a6c2e4(v6, "crypto/hpke/hpke_util.c", 338);
    return v7;
}
