/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac410c..0xac428c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac410c(unsigned long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long v3;  // x19
    long long v5;  // x1
    unsigned long long v6;  // x2
    long long v7;  // x1
    unsigned long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/slh_dsa/slh_dsa_key.c", 491, "ossl_slh_dsa_key_to_text");
        v7 = 786690;
        v6 = 0;
        goto LABEL_ac4274;
    }
    v3 = *(long long *)*(long long *)(a1 + 160);
    if (*(long long *)(a1 + 128))
    {
        if (!(a2 & 1))
        {
            if (a2 >> 1 & 1)
            {
                v0 = v3;
                if (1 <= (int)sub_9d524c())
                    return sub_a2fd10() != 0;
            }
            else
            {
                return sub_a2fd10() != 0;
            }
        }
        else
        {
            if (*(int *)(a1 + 152))
            {
                v0 = v3;
                if ((int)sub_9d524c() >= 1 && sub_a2fd10())
                    return sub_a2fd10() != 0;
            }
            else
            {
                sub_a368c8();
                v5 = 504;
LABEL_ac425c:
                sub_a369bc("crypto/slh_dsa/slh_dsa_key.c", v5, "ossl_slh_dsa_key_to_text");
                v0 = v3;
                v6 = "no %s key material available";
                v7 = 128;
LABEL_ac4274:
                sub_a36abc(57, v7, v6);
            }
        }
        return 0;
    }
    sub_a368c8();
    v5 = 497;
    goto LABEL_ac425c;
}
