/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e290..0xb3e398 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3e290(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v4;  // x19
    unsigned long long v5;  // x20
    unsigned long long *v6;  // x20
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v4 = 0;
    if (a1 == 8 && sub_a2f9e0())
    {
        v4 = *a0;
        *a0 = 0;
        if (!v4)
            return v4;
        if (sub_a01e1c(v4))
            return v4;
        v5 = sub_a8002c(v4);
        if (sub_a7f878(v4))
        {
            if (v5 && !(sub_a7f880(v4) & 1))
                goto LABEL_b3e314;
            if (sub_a80554(v4))
                return v4;
        }
        else
        {
            if (!v5)
                return v4;
LABEL_b3e314:
            if (sub_a7e86c(v4, v5, sub_a80958(v4)))
                return v4;
            v6 = sub_c4c40(v4);
            sub_a368c8(v6);
            sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 435, "ml_dsa_load");
            v0 = *v6;
            sub_a36abc(57, 158, "error parsing %s private key");
        }
    }
    sub_a7fabc(v4);
    return 0;
}
