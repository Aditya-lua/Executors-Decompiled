/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb51994..0xb51a70 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

char sub_b51994(char idx)
{
    char v5;  // w0
    char v6;  // x0
    char v0;  // [bp-0x6c]
    char v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = 0;
    v5 = sub_a2f9e0();
    v6 = 0;
    if (idx && v5)
    {
        v6 = *(long long *)(idx + 40);
        if (v6)
        {
            if (!((char)(*(char *)(idx + 28)) >> 4 & 1))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 1160, "rsa_verify_message_final");
                sub_a36abc(57, 237, 0);
                v6 = 0;
            }
            else
            {
                v6 = sub_a3ff7c();
                if (v6)
                {
                    *(char *)(idx + 28) = *(char *)(idx + 28) & 199;
                    v6 = sub_b52d08(idx, *(long long *)(idx + 184), *(long long *)(idx + 192), &v1, v0);
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
