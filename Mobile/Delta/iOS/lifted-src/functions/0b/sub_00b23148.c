/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23148..0xb23244 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b23148(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long *a4, unsigned long a5)
{
    long long v3;  // x0
    long long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9ca814();
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 100, "key_to_p8info");
        sub_a36abc(57, 0x8000d, 0);
        sub_9ca820(v3);
        sub_a6c2e4(v0, "providers/implementations/encode_decode/encode_key2any.c", 0x66);
        return 0;
    }
    a4();
}
