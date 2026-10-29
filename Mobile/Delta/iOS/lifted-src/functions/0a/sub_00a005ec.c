/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa005ec..0xa007ac (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a005ec_1 {
    char padding_0[152];
    struct st_a005ec_0 *field_98;
} st_a005ec_1;

typedef struct st_a005ec_0 {
    char padding_0[32];
    unsigned int field_20;
} st_a005ec_0;


unsigned int sub_a005ec(st_a005ec_1 *a0, long long a1, long long a2)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (_strcmp(a1, "dh_paramgen_prime_len"))
    {
        if (!_strcmp(a1, "dh_rfc5114"))
        {
            v3 = _atoi(a2);
            if (3 >= v3)
            {
                a0->field_98->field_20 = v3;
                return 1;
            }
        }
        else if (!_strcmp(a1, "dh_param"))
        {
            v2 = sub_a998f4(a2);
            if (v2)
            {
                a0->field_98->field_20 = v2;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("crypto/dh/dh_pmeth.c", 243, "pkey_dh_ctrl_str");
            sub_a36abc(5, 110, 0);
        }
        else if (!_strcmp(a1, "dh_paramgen_generator"))
        {
            _atoi(a2);
        }
        else if (!_strcmp(a1, "dh_paramgen_subprime_len"))
        {
            _atoi(a2);
        }
        else if (!_strcmp(a1, "dh_paramgen_type"))
        {
            _atoi(a2);
        }
        else if (!_strcmp(a1, "dh_pad"))
        {
            _atoi(a2);
        }
        return 0xfffffffe;
    }
    _atoi(a2);
}
