/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c774..0xb5c848 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b5c774(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    char *v2;  // x8
    unsigned long v3;  // x9
    char *v12;  // x8
    long long v13;  // x1
    char *v4;  // x8
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    long long v9;  // x1
    unsigned long v10;  // x11
    unsigned long v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a1 == a2)
    {
        v2 = a0 + a2;
        v3 = *(v2 - 1);
        v4 = v2 - 1;
        if ((unsigned int)v3)
        {
            v5 = arm64g_calculate_condition(20, *a1, a2, 0);
            v6 = arm64g_calculate_condition(36, (v5 & 1 ? a2 : 0), (v5 & 1 ? v3 : 0), 0);
            if (v6 & 1)
                goto LABEL_b5c7e4;
LABEL_b5c79c:
            sub_a368c8();
            v9 = 107;
        }
        else
        {
            v7 = arm64g_calculate_condition(20, *a1, a2, 0);
            v8 = arm64g_calculate_condition(32, (v7 & 1 ? a2 : 0), (v7 & 1 ? v3 : 0), 0);
            if (!(v8 & 1))
                goto LABEL_b5c79c;
LABEL_b5c7e4:
            v10 = v3;
            while (1)
            {
                v11 = v10;
                v12 = v4 - 1;
                if (*v4 != (unsigned int)v3)
                    break;
                v10 = v11 - 1;
                v4 = v12;
                if (v11 == 1)
                {
                    *a1 = a2 - v3;
                    return 1;
                }
            }
            sub_a368c8();
            v9 = 112;
        }
        sub_a369bc("providers/implementations/ciphers/ciphercommon_block.c", v9, "ossl_cipher_unpadblock");
        v13 = 100;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon_block.c", 97, "ossl_cipher_unpadblock");
        v13 = 786691;
    }
    sub_a36abc(57, v13, 0);
    return 0;
}
