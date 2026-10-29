/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae44a8..0xae4628 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_eb6190;

unsigned long long sub_ae44a8(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x21
    unsigned long long *v8;  // x24
    unsigned long long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9cde20(&g_eb6190);
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_battcons.c", 65, "v2i_OSSL_BASIC_ATTR_CONSTRAINTS");
        sub_a36abc(0x22, 0x8000d, 0);
        return v6;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v7 = 0;
        while (1)
        {
            v8 = sub_ad69f8(a2, v7);
            if (!_strcmp(v8[1], "authority"))
            {
                if (!sub_aef6fc(v8, v6))
                    break;
            }
            else
            {
                if (_strcmp(v8[1], "pathlen"))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_battcons.c", 77, "v2i_OSSL_BASIC_ATTR_CONSTRAINTS");
                    sub_a36abc(0x22, 106, 0);
                    v2 = ", value=";
                    v3 = v8[2];
                    v0 = "name=";
                    v1 = v8[1];
                    sub_a364a0(4);
                    break;
                }
                else if (!sub_aef870(v8, v6 + 8))
                {
                    break;
                }
            }
            v7 = (unsigned int)v7 + 1;
            if ((int)sub_ad69e4(a2) <= (int)v7)
                return v6;
        }
        sub_9cd960(v6, &g_eb6190);
        return 0;
    }
    else
    {
        return v6;
    }
}
