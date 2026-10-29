/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a570..0xb2a5bc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b2a570(unsigned long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a537e4(sub_9f2aec(a1), "SCRYPT", 0);
    if (!v2)
        return v2;
    v3 = sub_a53c14();
    sub_a53b90(v2);
    return v3;
}
