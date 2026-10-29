/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb502f0..0xb50420 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b502f0(unsigned long long a0, long long a1, long long a2, unsigned long a3, unsigned long a4)
{
    unsigned int v2;  // w0
    long long v3;  // x1
    unsigned long v4;  // x8
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
        if (!((char)(*(char *)(a0 + 28)) >> 5 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1192, "rsa_verify");
            v3 = 239;
        }
        else if (*(int *)(a0 + 24) == 0x8000)
        {
            if (!sub_b52c14(a0, a1, a2))
            {
                return 0;
            }
            else if (!*(long long *)(a0 + 40))
            {
                return 0;
            }
            else
            {
                v4 = *(char *)(a0 + 28);
                if (!(v4 >> 3 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 836, "rsa_signverify_message_update");
                    v3 = 240;
                }
                else
                {
                    *(char *)(a0 + 28) = (char)v4 & 223;
                    if (!sub_a3fe10())
                        return 0;
                }
            }
        }
        sub_a36abc(57, v3, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
