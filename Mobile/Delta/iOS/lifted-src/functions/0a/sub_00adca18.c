/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadca18..0xadccec (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adca18_0 {
    char padding_0[24];
    long long field_18;
} st_adca18_0;

extern unsigned int g_7fffff;
extern long long g_c7c2eb;

unsigned long long sub_adca18(st_adca18_0 *a0, unsigned long long a1, unsigned int a2, long long a3, long long a4)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x23
    long long v5;  // x1
    unsigned long long v6;  // w0
    unsigned int v7;  // w8
    unsigned long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/by_file.c", 98, "X509_load_cert_file_ex");
        sub_a36abc(11, 0xc0102, 0);
        sub_afc404(v0);
        sub_9d3c28(0);
        return 0;
    }
    v3 = sub_9d3c1c(sub_9d82cc());
    if (v3 && (int)sub_9d46fc(v3, 108, 3, a1) > 0)
    {
        v0 = sub_afc484(a3, a4);
        if (!v0)
        {
            sub_a368c8();
            v5 = 111;
LABEL_adcbc4:
            sub_a369bc("crypto/x509/by_file.c", v5, "X509_load_cert_file_ex");
        }
        else if (a2 == 2)
        {
            if (sub_af92c0(v3, &v0))
            {
                v4 = sub_af2f6c(a0->field_18, v0);
                sub_afc404(v0);
                sub_9d3c28(v3);
                return v4;
            }
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 0x99, "X509_load_cert_file_ex");
        }
        else if (a2 == 1)
        {
            sub_a36c8c();
            v4 = 0;
            if (sub_a9e46c(v3, &v0, 0, &g_c7c2eb))
            {
                do
                {
                    sub_a36e70();
                    if (!sub_af2f6c(a0->field_18, v0))
                    {
                        sub_afc404(v0);
                        sub_9d3c28(v3);
                        return 0;
                    }
                    sub_afc404(v0);
                    v0 = sub_afc484(a3, a4);
                    if (!v0)
                    {
                        sub_a368c8();
                        v5 = 145;
                        goto LABEL_adcbc4;
                    }
                } while ((v4 = (unsigned int)v4 + 1, sub_a36c8c(), sub_a9e46c(v3, &v0, 0, &g_c7c2eb)));
            }
            v6 = (unsigned int)sub_a36000();
            if (0 <= v6)
                v7 = (unsigned int)&g_7fffff;
            else
                v7 = 0x7fffffff;
            if ((v7 & v6) == 108 && (unsigned int)v4)
            {
                sub_a36cd4();
                sub_afc404(v0);
                sub_9d3c28(v3);
                return v4;
            }
            sub_a368c8(sub_a36e70());
            if (!(unsigned int)v4)
            {
                sub_a369bc("crypto/x509/by_file.c", 125, "X509_load_cert_file_ex");
                sub_a36abc(11, 135, 0);
                sub_afc404(v0);
                sub_9d3c28(v3);
                return v4;
            }
            sub_a369bc("crypto/x509/by_file.c", 127, "X509_load_cert_file_ex");
LABEL_adcb6c:
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 158, "X509_load_cert_file_ex");
        }
        sub_a36abc(11);
        sub_afc404(v0);
        sub_9d3c28(v3);
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/by_file.c", 105, "X509_load_cert_file_ex");
    goto LABEL_adcb6c;
}
