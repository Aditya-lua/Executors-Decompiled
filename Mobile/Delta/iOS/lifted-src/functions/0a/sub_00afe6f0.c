/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe6f0..0xafe820 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_afe6f0(unsigned long a0, unsigned long long a1, unsigned int *a2)
{
    unsigned int v3;  // w21
    unsigned long long v4;  // 4102
    unsigned long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    if ((int)a1 > 0x3ff)
    {
        if ((int)a1 >= 0x2000)
        {
            v4 = arm64g_calculate_condition(3, a1 & 0xffffffff, 0x2000, 0);
            if (v4 & 1)
                goto LABEL_afe7b4;
            if ((unsigned int)a1 == 0x8000)
            {
                *a2 = 0;
                return 1;
            }
            else if ((unsigned int)a1 == 0x4000)
            {
                *a2 = 1;
                return 1;
            }
        }
        else
        {
            if ((unsigned int)a1 != 0x400)
            {
                if ((unsigned int)a1 != 0x1000)
                    goto LABEL_afe77c;
LABEL_afe764:
                v3 = 1;
            }
LABEL_afe7b4:
            if (sub_ab1cb0() != 0x1000)
            {
                *a2 = v3;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/common/securitycheck.c", 47, "ossl_rsa_key_op_get_protect");
            v0 = a1;
            sub_a36abc(57, 178, "operation: %d");
            return 0;
        }
    }
    else
    {
        if (63 < (int)a1)
        {
            if ((unsigned int)a1 == 64)
                goto LABEL_afe7b4;
            if ((unsigned int)a1 == 0x200)
                goto LABEL_afe764;
        }
        else if ((unsigned int)a1 == 16)
        {
            *a2 = 1;
            return 1;
        }
        else if ((unsigned int)a1 == 32)
        {
            *a2 = 0;
            return 1;
        }
    }
LABEL_afe77c:
    sub_a368c8();
    sub_a369bc("providers/common/securitycheck.c", 54, "ossl_rsa_key_op_get_protect");
    v0 = a1;
    sub_a36abc(57, 0xc0103, "invalid operation: %d");
    return 0;
}
