/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab7bdc..0xab7fd0 (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab7bdc_0 {
    char padding_0[120];
    struct st_ab7bdc_1 *field_78;
} st_ab7bdc_0;

typedef struct st_ab7bdc_1 {
    unsigned int field_0;
} st_ab7bdc_1;


long long sub_ab7bdc(st_ab7bdc_0 *a0, long long a1, unsigned long a2)
{
    unsigned long v3;  // x0
    unsigned long v4;  // x20
    unsigned long v5;  // x0
    unsigned long v6;  // x0
    char v0;  // [bp-0x38], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a2)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pmeth.c", 653, "pkey_rsa_ctrl_str");
        sub_a36abc(4, 147, 0);
        return 0;
    }
    else if (_strcmp(a1, "rsa_padding_mode"))
    {
        if (_strcmp(a1, "rsa_pss_saltlen"))
        {
            if (!_strcmp(a1, "rsa_keygen_bits"))
            {
                _atoi(a2);
            }
            else if (!_strcmp(a1, "rsa_keygen_pubexp"))
            {
                v0 = 0;
                v6 = sub_9ddd38(&v0, a2);
                if ((unsigned int)v6)
                {
                    v5 = sub_ab26a8(a0, v0);
                    sub_9e48d4(v0);
                    return v5;
                }
                return v6;
            }
            else if (_strcmp(a1, "rsa_keygen_primes"))
            {
                if (!_strcmp(a1, "rsa_mgf1_md"))
                    goto LABEL_ab7f30;
                if (*(int *)a0->field_78 != 912)
                {
LABEL_ab7cc4:
                    if (_strcmp(a1, "rsa_oaep_md"))
                    {
                        if (_strcmp(a1, "rsa_oaep_label"))
                            return 0xfffffffe;
                        v3 = sub_a6df78(a2, &v0);
                        if (!v3)
                            return v3;
                        v4 = v3;
                        v5 = sub_ab2314(a0, v4, v0);
                        if (0 >= (int)v5)
                        {
                            sub_a6c2e4(v4, "crypto/rsa/rsa_pmeth.c", 751);
                            return v5;
                        }
                        return v5;
                    }
                }
                else if (!_strcmp(a1, "rsa_pss_keygen_mgf1_md"))
                {
LABEL_ab7f30:
                }
                else if (_strcmp(a1, "rsa_pss_keygen_md"))
                {
                    if (!_strcmp(a1, "rsa_pss_keygen_saltlen"))
                        _atoi(a2);
                    goto LABEL_ab7cc4;
                }
            }
            else
            {
                _atoi(a2);
            }
        }
        else
        {
            if (_strcmp(a2, "digest") && _strcmp(a2, "max") && _strcmp(a2, "auto"))
                _atoi(a2);
        }
    }
    else
    {
        if (_strcmp(a2, "pkcs1") && _strcmp(a2, "none") && _strcmp(a2, "oeap") && _strcmp(a2, "oaep") && _strcmp(a2, "x931") && _strcmp(a2, "pss"))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pmeth.c", 672, "pkey_rsa_ctrl_str");
            sub_a36abc(4, 118, 0);
            return 0xfffffffe;
        }
    }
}
