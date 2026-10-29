/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb155cc..0xb1560c (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ed8ec8;

int sub_b155cc(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "providers/implementations/encode_decode/decode_msblob2key.c", 66);
    if (v2)
    {
        *v2 = a0;
        v2[1] = &g_ed8ec8;
    }
    return (unsigned int)v2;
}
