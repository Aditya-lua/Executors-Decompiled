/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf057c..0xaf06a4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_af057c(long long a0)
{
    long long ptr;  // x0
    long long v5;  // x0
    long long v6;  // x19
    long long *v7;  // x21
    long long v8;  // w0
    long long v9;  // w0
    long long v10;  // x0
    long long v11;  // x20
    char v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    ptr = _strchr();
    v5 = ptr;
    if (v5)
    {
        v5 = sub_a6d9b4(a0, "crypto/x509/v3_utl.c", 1129);
        if (v5)
        {
            v6 = v5;
            v7 = v5 + ptr - a0;
            *(char *)v7 = 0;
            v8 = (unsigned int)sub_af0158(&v0, v6);
            if (v8)
            {
                v9 = (unsigned int)sub_af0158(&(&v0)[v8], (char *)v7 + 1);
                sub_a6c2e4(v6, "crypto/x509/v3_utl.c", 1142);
                if (v8 == v9 && !(v10 = sub_9cf0ec(), !v10))
                {
                    v11 = v10;
                    if (sub_9c026c())
                    {
                        v5 = v11;
                    }
                    else
                    {
                        v6 = 0;
LABEL_af064c:
                        sub_a6c2e4(v6, "crypto/x509/v3_utl.c", 1157);
                        sub_9cf0f4(v11);
                        v5 = 0;
                    }
                }
                else
                {
                    v6 = 0;
                    goto LABEL_af0648;
                }
            }
            else
            {
LABEL_af0648:
                v11 = 0;
                goto LABEL_af064c;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
