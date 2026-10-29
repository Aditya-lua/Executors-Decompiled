/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d798..0xb2d890 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b2d798(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, unsigned long a7)
{
    unsigned int v2;  // w0
    long long v3;  // x0
    unsigned long v4;  // x8
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50ac8(a1);
    if ((int)v2 >= 1)
    {
        if (v2 == a7)
        {
            v3 = sub_a50a58(a1);
            v4 = sub_a50ac8(a1);
            v5 = sub_a58460(a0, "HMAC", 0, v3, 0, a2, a3, a4, a5, a6, v4, 0) != 0;
            return v5;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/hkdf.c", 515, "HKDF_Extract");
        sub_a36abc(57, 139, 0);
    }
    return 0;
}
