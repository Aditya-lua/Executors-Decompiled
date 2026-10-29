/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c93f4..0x9c9580 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c93f4_0 {
    struct st_9c93f4_0 *field_0;
} st_9c93f4_0;

extern long long g_9cf1fc;

st_9c93f4_0 ** sub_9c93f4(st_9c93f4_0 **a0, unsigned long long *a1, long long a2, long long a3, long long a4)
{
    st_9c93f4_0 **v3;  // x0
    long long v4;  // x24
    unsigned long v5;  // x25
    st_9c93f4_0 **v6;  // x23
    st_9c93f4_0 **v7;  // x21
    st_9c93f4_0 **v8;  // x0
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c91b8(0, a0, a1, a2, a3, a4);
    if (v3)
        return v3;
    v0 = *a1;
    v4 = sub_9cf250();
    v0 = *a1;
    if (sub_ad69e4(v4, &v0, a2) == 6)
    {
        v5 = 116;
    }
    else if (sub_ad69e4(v4) == 4)
    {
        v5 = 408;
    }
    else
    {
        if (sub_ad69e4(v4) == 3)
        {
            v6 = sub_9ca7fc(0, &v0, a2);
            sub_ad6958(v4, &g_9cf1fc);
            if (!v6)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/d2i_pr.c", 218, "d2i_AutoPrivateKey_legacy");
                sub_a36abc(13, 167, 0);
                return 0;
            }
            v7 = sub_a51458(v6, a3, a4);
            sub_9ca820(v6);
            v8 = v7;
            if (!v8)
                return v8;
            *a1 = v0;
            if (!a0)
                return v8;
            *a0 = v8;
            return v8;
        }
        v5 = 6;
    }
    sub_ad6958(v4, &g_9cf1fc);
    return sub_9c8f34(v5, a0, a1, a2, a3, a4);
}
