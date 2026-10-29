/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaef2d4..0xaef3cc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_aef2d4(long long a0)
{
    char *v2;  // x0
    char *v3;  // x19
    long long len;  // x21
    char *v5;  // x20
    long long v6;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (127 < (int)sub_9e46a8())
    {
        v2 = sub_9dd574(a0);
        if (!v2)
            return 0;
        v3 = v2;
        len = _strlen();
        v5 = sub_a6bf4c(len + 3, "crypto/x509/v3_utl.c", 148);
        if (v5)
        {
            if (*v3 == 45)
                sub_a6db20(v5, "-0x", len + 3);
            else
                sub_a6db20(v5, "0x", len + 3);
            sub_a6db94(v5);
            v6 = 162;
        }
        else
        {
            v6 = 150;
        }
        sub_a6c2e4(v3, "crypto/x509/v3_utl.c", v6);
        return v5;
    }
}
