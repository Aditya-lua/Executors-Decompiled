/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae78c4..0xae7ac8 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae78c4_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_ae78c4_0;

extern long long g_aef19c;
extern char g_10002b0;

unsigned long long sub_ae78c4(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v7;  // x26
    unsigned long long v8;  // x22
    long long *v9;  // x0
    unsigned long long v10;  // x0
    st_ae78c4_0 *v11;  // x26
    unsigned int v12;  // w27
    unsigned long long v13;  // x0
    unsigned long long v14;  // x23
    char *v0;  // [bp-0xd0]
    unsigned long long v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xc0]
    char v3;  // [bp-0xb8]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a2;
    v4 = *(long long *)&g_10002b0;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v8 = 0;
        v2 = v7;
        do
        {
            v9 = sub_ad69f8(a1, v8);
            v10 = sub_aec0c4(a0, v9[1], v7);
            if (v10)
            {
                v7 = v10;
                v11 = sub_ad69f8();
                sub_9c3058(&v3, 80, *v9);
                v12 = _strlen(&v3);
                v13 = sub_a6bf4c(v12 + _strlen(v11->field_8) + 4, "crypto/x509/v3_info.c", 83);
                if (!v13)
                {
                    v7 = v7;
LABEL_ae7a64:
                    v14 = 0;
                    if (!v2 && v7)
                    {
                        sub_ad6958(v7, &g_aef19c);
                        v14 = 0;
                        break;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_info.c", 76, "i2v_AUTHORITY_INFO_ACCESS");
                sub_a36abc(0x22, 0x8000d, 0);
                goto LABEL_ae7a64;
            }
            v0 = &v3;
            v1 = v11->field_8;
            sub_9d5b44();
            sub_a6c2e4(v11->field_8, "crypto/x509/v3_info.c", 87);
            v11->field_8 = v13;
            v8 = (unsigned int)v8 + 1;
            v14 = v7;
        } while ((int)v8 < (int)sub_ad69e4(a1));
LABEL_ae7a88:
        if (*(long long *)&g_10002b0 == v4)
            return v14;
    }
    else
    {
        v14 = v7;
        if (v7)
            goto LABEL_ae7a88;
    }
    ___stack_chk_fail();
}
