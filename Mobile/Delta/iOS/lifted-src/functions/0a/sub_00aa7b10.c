/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7b10..0xaa7d48 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_aa7b10(unsigned long a0, void* a1, void* a2, unsigned long ptr)
{
    void* v3;  // x0
    void* v4;  // x19
    unsigned int v13;  // w8
    unsigned long long v14;  // 4134
    void* v15;  // x0
    long long v16;  // x2
    unsigned long long v17;  // x8
    long long v18;  // x1
    unsigned long long v5;  // x8
    unsigned long v6;  // x20
    void* v7;  // x23
    unsigned long long v8;  // x26
    long long len;  // x0
    void* v10;  // x0
    unsigned long v11;  // x24
    unsigned int v12;  // w8
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6820c();
    if (!v3)
        return (unsigned int)v3;
    v4 = v3;
    v5 = 8;
    if (!a1)
        v5 = 16;
    v6 = *(long long *)((char *)v3 + v5);
    v0 = ptr;
    if (!sub_a7c17c())
    {
        sub_a368c8();
        sub_a369bc("crypto/property/property_string.c", 158, "ossl_property_string");
        v18 = 786703;
        goto LABEL_aa7c2c;
    }
    v7 = sub_a66b6c(v6, &v0);
    sub_a7c1b4(*(long long *)v4);
    if (a2 && !v7)
    {
        if (sub_a7c198(*(long long *)v4))
        {
            if (!a1)
                v8 = 28;
            else
                v8 = 24;
            v7 = sub_a66b6c();
            if (v7)
            {
                sub_a7c1b4(*(long long *)v4);
                return (int)v7[8];
            }
            len = _strlen(ptr);
            v10 = sub_a6bf4c(len + 16, "crypto/property/property_string.c", 129);
            if (v10)
            {
                v7 = v10;
                v11 = v10 + 12;
                _memcpy(v11, ptr, len + 1);
                *(unsigned long *)v7 = v11;
                v12 = *(int *)((char *)v4 + v8);
                v13 = v12 + 1;
                *(unsigned int *)((char *)v4 + v8) = v13;
                *(unsigned int *)&v7[8] = v13;
                v14 = arm64g_calculate_condition(49, v12, 1, 0);
                if (!(v14 & 1))
                {
                    v15 = v7;
                    v16 = 0x88;
                    goto LABEL_aa7d38;
                }
                else
                {
                    v17 = 32;
                    if (!a1)
                        v17 = 40;
                    if ((int)sub_ad68a0() > 0)
                    {
                        sub_a66794(v6, v7);
                        if (!sub_a66e38(v6))
                        {
                            sub_a7c1b4(*(long long *)v4);
                            return (int)v7[8];
                        }
                        sub_ad692c(*(long long *)((char *)v4 + v17));
                        sub_a6c2e4(v7, "crypto/property/property_string.c", 62);
                        *(int *)((char *)v4 + v8) = *(int *)((char *)v4 + v8) - 1;
                    }
                    else
                    {
                        v15 = v7;
                        v16 = 62;
LABEL_aa7d38:
                        sub_a6c2e4(v15, "crypto/property/property_string.c", v16);
                    }
                }
            }
            sub_a7c1b4(*(long long *)v4);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/property/property_string.c", 165, "ossl_property_string");
            v18 = 786704;
LABEL_aa7c2c:
            sub_a36abc(15, v18, 0);
        }
    }
    else
    {
        if (v7)
            return (int)v7[8];
    }
    return 0;
}
