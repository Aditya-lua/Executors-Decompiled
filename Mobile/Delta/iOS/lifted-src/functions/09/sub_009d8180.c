/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8180..0x9d82cc (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8b570;

long long sub_9d8180(unsigned long long a0, long long a1)
{
    long long v4;  // x21
    long long v5;  // x22
    long long v6;  // x0
    unsigned int *v7;  // x0
    long long v8;  // x1
    unsigned long long v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6d9a8();
    if (!_strchr(a1, 98))
        v5 = 0x11;
    else
        v5 = 1;
    if (v4)
    {
        v6 = sub_9d3c1c(&g_e8b570);
        if (v6)
        {
            sub_9d3d58();
            sub_9d46fc(v6, 106, v5, v4);
            return v6;
        }
        _fclose(v4);
    }
    else
    {
        sub_a368c8();
        v7 = ___error(sub_a369bc("crypto/bio/bss_file.c", 67, "BIO_new_file"), 67, "BIO_new_file");
        v0 = a0;
        v1 = a1;
        if (*(int *)___error(sub_a36abc(2, *v7, "calling fopen(%s, %s)"), *v7, "calling fopen(%s, %s)") == 2 || *(int *)___error() == 6)
        {
            sub_a368c8();
            sub_a369bc("crypto/bio/bss_file.c", 75, "BIO_new_file");
            v8 = 128;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/bio/bss_file.c", 77, "BIO_new_file");
            v8 = 524290;
        }
        sub_a36abc(32, v8, 0);
    }
    return 0;
}
