/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae61b0..0xae63b0 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_eb6a18;

unsigned long long sub_ae61b0(unsigned long a0, long long a1, long long a2)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x22
    unsigned long long *v8;  // x28
    unsigned long v9;  // x26
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9cde20(&g_eb6a18);
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_crld.c", 380, "v2i_idp");
        sub_a36abc(0x22, 0x8000d, 0);
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v7 = 0;
        while (1)
        {
            v8 = sub_ad69f8(a2, v7);
            v9 = v8[1];
            v10 = sub_ae6c10(v6, a1, v8);
            if (0 < (int)v10)
            {
LABEL_ae622c:
                v7 = (unsigned int)v7 + 1;
                if ((int)sub_ad69e4(a2) <= (int)v7)
                    return v6;
            }
            else
            {
                if (v10 >> 31 & 1)
                    break;
                if (_strcmp(v9, "onlyuser") && _strcmp(v9, "onlyCA") && _strcmp(v9, "onlyAA") && _strcmp(v9, "indirectCRL"))
                {
                    if (_strcmp(v9, "onlysomereasons"))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_crld.c", 408, "v2i_idp");
                        sub_a36abc(0x22, 106, 0);
                        v2 = ", value=";
                        v3 = v8[2];
                        v0 = "name=";
                        v1 = v8[1];
                        sub_a364a0(4);
                        break;
                    }
                    else if (!sub_ae6e1c(v6 + 16, v8[2]))
                    {
                        break;
                    }
                    else
                    {
                        goto LABEL_ae622c;
                    }
                    goto LABEL_ae622c;
                }
                if (!sub_aef6fc(v8))
                    break;
                else
                    goto LABEL_ae622c;
                goto LABEL_ae622c;
            }
        }
    }
    else
    {
        return v6;
    }
    sub_9cd960(v6, &g_eb6a18);
    return 0;
}
