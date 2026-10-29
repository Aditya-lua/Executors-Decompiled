/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5861c..0xb5868c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b5861c(unsigned int a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    switch (a0)
    {
    case 58:
        return 128;
    case 160:
        return 40;
    case 120:
        return 64;
    default:
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_rc2.c", 84, "rc2_magic_to_keybits");
        sub_a36abc(57, 0x99, 0);
        return 0;
    }
}
