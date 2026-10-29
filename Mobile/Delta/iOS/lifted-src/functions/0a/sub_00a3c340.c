/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3c340..0xa3c484 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3c340_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    unsigned int field_1c;
    unsigned long long field_20;
} st_a3c340_0;


unsigned long long sub_a3c340(unsigned long long a0, long long a1, st_a3c340_0 *a2)
{
    unsigned long long v2;  // x0
    long long v3;  // x8
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3bbe8();
    if ((int)v2 < 1)
    {
        return v2;
    }
    else if (a2->field_8 != 2)
    {
        return 0;
    }
    else if ((unsigned int)a0 == 1)
    {
        if (a2->field_1c)
        {
            if (a2->field_1c != 1)
                goto LABEL_a3c3fc;
            v3 = "named_curve";
        }
        else
        {
            v3 = "explicit";
        }
        a2->field_20 = v3;
        a2->field_1c = 0;
        return sub_a3aef4();
    }
    else
    {
        v4 = sub_a3aef4(a0, a1, a2);
        if ((unsigned int)a0 != 7)
            return v4;
        if ((int)v4 <= 0)
            return v4;
        if (_strcmp(a2->field_20, "explicit"))
        {
            if (_strcmp(a2->field_20, "named_curve"))
            {
                a2->field_1c = 0xfffffffe;
                a2->field_20 = 0;
LABEL_a3c3fc:
                sub_a368c8();
                sub_a369bc("crypto/evp/ctrl_params_translate.c", 1133, "fix_ec_param_enc");
                sub_a36abc(6, 147, 0);
                return 0xfffffffe;
            }
            a2->field_1c = 1;
        }
        else
        {
            a2->field_1c = 0;
        }
        a2->field_20 = 0;
        return v4;
    }
}
