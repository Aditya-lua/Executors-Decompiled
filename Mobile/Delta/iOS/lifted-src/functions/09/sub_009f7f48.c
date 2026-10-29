/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7f48..0x9f8088 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f7f48(long long *a0, long long a1, unsigned long long *a2, long long *a3)
{
    unsigned long v4;  // x19
    unsigned long v5;  // x20
    unsigned int v6;  // w0
    unsigned long v7;  // x21
    char v0;  // [bp-0x4c]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v4 = sub_a40ca8(a0[10], "SHA2-256", a0[11]);
    if (v4)
    {
        v5 = *a2;
        if (*a2 && 31 < (unsigned long long)*a3 || (v5 = sub_a6bf4c(32, "crypto/ct/ct_sct_ctx.c", 216), v5))
        {
            v6 = sub_afb038(a1, &v1);
            if ((int)v6 >= 1 && sub_a40abc(v1, v6, v5, &v0, v4, 0))
            {
                if (v5 != *a2)
                {
                    sub_a6c2e4(*a2, "crypto/ct/ct_sct_ctx.c", 230);
                    *a2 = v5;
                    *a3 = 32;
                    v7 = 1;
                    v5 = 0;
                    goto LABEL_9f8030;
                }
                else
                {
                    v5 = 0;
                    v7 = 1;
                    goto LABEL_9f8030;
                }
            }
        }
    }
    else
    {
        v5 = 0;
    }
    v7 = 0;
LABEL_9f8030:
    sub_a3f52c(v4);
    sub_a6c2e4(v5, "crypto/ct/ct_sct_ctx.c", 239);
    sub_a6c2e4(v1, "crypto/ct/ct_sct_ctx.c", 240);
    return v7;
}
