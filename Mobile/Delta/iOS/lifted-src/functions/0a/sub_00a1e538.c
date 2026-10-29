/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1e538..0xa1e6dc (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a1e538(unsigned long a0, long long a1, long long a2)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (_strcmp(a1, "ec_paramgen_curve"))
    {
        if (_strcmp(a1, "ec_param_enc"))
        {
            if (_strcmp(a1, "ecdh_kdf_md"))
            {
                if (!_strcmp(a1, "ecdh_cofactor_mode"))
                    _atoi(a2);
                else
                    return 0xfffffffe;
            }
            else
            {
                if (!sub_a58d60(a2))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_pmeth.c", 404, "pkey_ec_ctrl_str");
                    v2 = 151;
                }
            }
        }
        else
        {
            if (_strcmp(a2, "explicit") && _strcmp(a2, "named_curve"))
                return 0xfffffffe;
        }
    }
    else
    {
        if (!sub_a186b8(a2) && !sub_a998f4(a2) && !sub_a99a1c(a2))
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_pmeth.c", 388, "pkey_ec_ctrl_str");
            v2 = 141;
        }
    }
    sub_a36abc(16, v2, 0);
    return 0;
}
