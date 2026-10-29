/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa033e4..0xa034e8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a033e4(unsigned long a0, long long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!_strcmp(a1, "dsa_paramgen_bits"))
    {
        _atoi(a2);
    }
    else if (!_strcmp(a1, "dsa_paramgen_q_bits"))
    {
        _atoi(a2);
    }
    else if (_strcmp(a1, "dsa_paramgen_md"))
    {
        return 0xfffffffe;
    }
    else if (!sub_a58d60(a2))
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_pmeth.c", 199, "pkey_dsa_ctrl_str");
        sub_a36abc(10, 106, 0);
        return 0;
    }
}
