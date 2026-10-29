/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafafac..0xafb020 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_ebab80;

long long sub_afafac(long long a0, long long a1, long long a2, long long a3)
{
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = sub_a6bffc(48, "crypto/x509/x_pubkey.c", 71);
    if (!v0)
        return v0;
    return sub_9cad7c(&v0, a0, a1, &g_ebab80, a2, a3);
}
