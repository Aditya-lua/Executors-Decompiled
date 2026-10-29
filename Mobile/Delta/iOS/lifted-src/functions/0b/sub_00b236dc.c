/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb236dc..0xb237d4 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b236dc(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long *a4, unsigned long a5)
{
    long long v3;  // x0
    long long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_afb044();
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 163, "key_to_pubkey");
        sub_a36abc(57, 0x8000b, 0);
        sub_afb050(v3);
        sub_a6c2e4(v0, "providers/implementations/encode_decode/encode_key2any.c", 165);
        return 0;
    }
    a4();
}
