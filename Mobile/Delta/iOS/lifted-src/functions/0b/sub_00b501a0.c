/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb501a0..0xb502dc (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b501a0(unsigned long long a0, unsigned long long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = *(char *)(a0 + 28);
        if (!(v3 >> 5 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 892, "rsa_sign");
            v4 = 239;
        }
        else if (*(int *)(a0 + 24) == 0x4000 && a1)
        {
            if (!*(long long *)(a0 + 40))
            {
                return 0;
            }
            else if (!(v3 >> 3 & 1))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 836, "rsa_signverify_message_update");
                v4 = 240;
            }
            else
            {
                *(char *)(a0 + 28) = (char)v3 & 223;
                if (!sub_a3fe10())
                    return 0;
            }
        }
        sub_a36abc(57, v4, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
