/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb162dc..0xb16314 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b162dc(unsigned long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(264, "providers/implementations/encode_decode/decode_spki2typespki.c", 41);
    if (v2)
        *v2 = a0;
    return (unsigned int)v2;
}
