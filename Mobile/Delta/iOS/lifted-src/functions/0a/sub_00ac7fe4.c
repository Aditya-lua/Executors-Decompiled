/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac7fe4..0xac80e8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac7fe4(long long a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x20
    unsigned long long v5;  // x19
    unsigned long long v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_9ffdd0();
        if (v2)
        {
            v3 = sub_962b90(a0);
            if (v3)
            {
                v4 = v3;
                if (sub_c4ba8(v2))
                {
                    v5 = sub_9e4b00();
                    if (!v5 || !sub_9ebaf8(v5, 1))
                    {
LABEL_ac808c:
                        v6 = 0;
                    }
                    else if (sub_9e5528(v4, sub_9e4624()) >> 31 & 1 || !(sub_9e5528(v4, v5) >> 31 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/sm2/sm2_key.c", 43, "ossl_sm2_key_private_check");
                        sub_a36abc(53, 113, 0);
                        goto LABEL_ac808c;
                    }
                    else
                    {
                        v6 = 1;
                    }
                    sub_9e48d4(v5);
                    return v6;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/sm2/sm2_key.c", 33, "ossl_sm2_key_private_check");
    sub_a36abc(53, 0xc0102, 0);
    return 0;
}
