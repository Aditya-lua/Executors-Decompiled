/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c21c..0xb0c2a0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b0c21c(unsigned long a0, unsigned long a1, long long *a2, long long a3, unsigned long a4, long long a5)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x19
    long long v9;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    *a2 = 0;
    if (!a5)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if ((unsigned long long)a5 > (unsigned long long)a3)
    {
        v8 = 106;
        v9 = 158;
    }
    else
    {
        if (sub_b0be90())
            return 1;
        v8 = 0x66;
        v9 = 163;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_tdes_wrap.c", v9, "tdes_wrap_update");
    sub_a36abc(57, v8, 0);
    return 0;
}
