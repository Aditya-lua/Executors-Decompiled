/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf88ec..0xaf8a34 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af88ec_0 {
    char padding_0[56];
    long long field_38;
} st_af88ec_0;

extern long long g_af8388;

long long sub_af88ec(st_af88ec_0 *a0, long long a1, long long a2, long long a3)
{
    long long len;  // x22
    long long v3;  // x0
    long long v4;  // x20
    long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 && (len = a3, a3))
    {
        if (_memchr(a2, 0, len - ((unsigned long long)len > 1)))
            return 0;
        goto LABEL_af894c;
    }
    else
    {
        if (a2)
        {
            len = _strlen(a2);
            if (!len)
                goto LABEL_af8960;
LABEL_af894c:
            len -= !*(char *)(a2 + len - 1);
LABEL_af8960:
            if (!a1)
                goto LABEL_af8964;
        }
        else
        {
            len = 0;
            if (!a1)
            {
LABEL_af8964:
                sub_ad6958(a0->field_38, &g_af8388);
                a0->field_38 = 0;
            }
        }
        if (!a2)
        {
            return 1;
        }
        else if (len)
        {
            v3 = sub_a6da14(a2, len, "crypto/x509/x509_vpm.c", 60);
            if (!v3)
                return v3;
            v4 = v3;
            v5 = a0->field_38;
            if (!v5)
            {
                v5 = sub_ad61b4(0);
                a0->field_38 = v5;
                if (!v5)
                {
                    sub_a6c2e4(v4, "crypto/x509/x509_vpm.c", 65);
                    return 0;
                }
            }
            if (sub_ad68a0(v5, v4))
                return 1;
            sub_a6c2e4(v4, "crypto/x509/x509_vpm.c", 70);
            if (!sub_ad69e4(a0->field_38))
            {
                sub_ad6020(a0->field_38);
                a0->field_38 = 0;
                return 0;
            }
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
