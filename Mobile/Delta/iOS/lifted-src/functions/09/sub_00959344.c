/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959344..0x959480 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_959298;
extern long long g_9592a8;

unsigned long long sub_959344(long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x19
    unsigned int i;  // w0
    unsigned long long v5;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_a66520(sub_a66530(&g_959298, &g_9592a8), " ", "@", " ", "@");
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 890, "SSL_add_file_cert_subjects_to_stack");
        sub_a36abc(20, 0xc0102, 0);
    }
    else if (v3)
    {
        i = sub_ad69e4(a0);
        if ((int)i >= 1)
        {
            v5 = 0;
            do
            {
                sub_a66794(v3, sub_ad69f8(a0, v5));
                v5 = (unsigned int)v5 + 1;
            } while (i != (unsigned int)v5);
        }
        v2 = sub_959480(a0, v2, v3);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 895, "SSL_add_file_cert_subjects_to_stack");
        sub_a36abc(20, 0x8000f, 0);
        v2 = 0;
    }
    sub_a66664(v3);
    return v2;
}
