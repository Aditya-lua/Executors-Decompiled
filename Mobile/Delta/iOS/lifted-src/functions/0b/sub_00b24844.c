/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb24844..0xb248d0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b24844(unsigned long a0, unsigned long a1, unsigned long a2, long long a3, unsigned long a4)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 700, "dhx2text_encode");
        sub_a36abc(57, 0x80106, 0);
    }
    else
    {
        v2 = sub_afd760();
        if (v2)
        {
            v3 = sub_b25db8();
            sub_9d3c28(v2);
            return v3;
        }
    }
    return 0;
}
