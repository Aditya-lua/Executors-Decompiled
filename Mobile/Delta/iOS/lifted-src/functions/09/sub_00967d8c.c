/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967d8c..0x967dd8 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_967dd8;

unsigned long long sub_967d8c(long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a77648(*a0, &g_967dd8, a0);
    if (!(unsigned int)v2)
        return v2;
    return sub_960f58(a0, 92, 0, "?*X25519MLKEM768 / ?*X25519:?secp256r1 / ?X448:?secp384r1:?secp521r1 / ?ffdhe2048:?ffdhe3072");
}
