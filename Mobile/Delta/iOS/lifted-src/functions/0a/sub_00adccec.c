/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadccec..0xadcf50 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adccec_0 {
    char padding_0[24];
    long long field_18;
} st_adccec_0;

extern unsigned int g_7fffff;
extern long long g_c7c2eb;

unsigned long long sub_adccec(st_adccec_0 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long i;  // x22
    unsigned long long v3;  // x19
    unsigned long long v4;  // x20
    unsigned long long v5;  // w0
    unsigned int v6;  // w8
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a1;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/by_file.c", 179, "X509_load_crl_file");
        sub_a36abc(11, 0xc0102, 0);
        v3 = 0;
        goto LABEL_adce28;
    }
    v3 = sub_9d3c1c(sub_9d82cc());
    if (!v3 || (int)sub_9d46fc(v3, 108, 3, i) <= 0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/by_file.c", 186, "X509_load_crl_file");
        v7 = 524320;
        goto LABEL_adcde0;
    }
    if (a2 == 2)
    {
        i = sub_af92ec(v3, 0);
        if (i)
        {
            v4 = sub_af311c(a0->field_18, i);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 218, "X509_load_crl_file");
            sub_a36abc(11, 137, 0);
LABEL_adce28:
            v4 = 0;
        }
    }
    else if (a2 == 1)
    {
        i = sub_a9b8b0(v3, 0, 0, &g_c7c2eb);
        if (i)
        {
            v4 = 0;
            do
            {
                if (!sub_af311c(a0->field_18, i))
                    goto LABEL_adce28;
                v4 = (unsigned int)v4 + 1;
                sub_af99a8(i);
                i = sub_a9b8b0(v3, 0, 0, &g_c7c2eb);
            } while (i);
        }
        else
        {
            v4 = 0;
        }
        v5 = (unsigned int)sub_a36000();
        if (0 <= v5)
            v6 = (unsigned int)&g_7fffff;
        else
            v6 = 0x7fffffff;
        if ((v6 & v5) == 108 && (unsigned int)v4)
        {
            sub_a35af4();
        }
        else
        {
            sub_a368c8();
            if ((unsigned int)v4)
            {
                sub_a369bc("crypto/x509/by_file.c", 201, "X509_load_crl_file");
                v7 = 524297;
LABEL_adcde0:
                sub_a36abc(11, v7, 0);
                v4 = 0;
            }
            else
            {
                sub_a369bc("crypto/x509/by_file.c", 199, "X509_load_crl_file");
                sub_a36abc(11, 137, 0);
            }
        }
        i = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/by_file.c", 223, "X509_load_crl_file");
        v7 = 100;
        goto LABEL_adcde0;
    }
    sub_af99a8(i);
    sub_9d3c28(v3);
    return v4;
}
