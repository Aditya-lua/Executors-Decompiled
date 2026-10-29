/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb132cc..0xb13310 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ed7e58;

int sub_b132cc(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(280, "providers/implementations/encode_decode/decode_der2key.c", 163);
    if (v2)
    {
        *v2 = a0;
        v2[33] = &g_ed7e58;
    }
    return (unsigned int)v2;
}
