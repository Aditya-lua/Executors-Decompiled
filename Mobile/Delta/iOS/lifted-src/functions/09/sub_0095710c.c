/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95710c..0x95730c (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_95710c(void* a0, unsigned long a1, long long a2, long long a3, unsigned int a4)
{
    void* v3;  // x20
    long long v4;  // x19
    unsigned long v5;  // x21
    unsigned long v6;  // x20
    long long v7;  // x2
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v0 = 0;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x1560, "ssl_decapsulate");
        sub_9a58a4(v3, 80, 0xc0103, 0);
        return 0;
    }
    v4 = sub_a5d5a8(*(long long *)(long long)v3[8]);
    if ((int)sub_a54248(v4, 0, *(long long *)((long long)v3[8] + 1136)) < 1 || (int)sub_a54258(v4, 0, &v0, a2, a3) <= 0)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x1568, "ssl_decapsulate");
        sub_9a58a4(v3, 80, 0xc0103, 0);
        v5 = 0;
        goto LABEL_9572b4;
    }
    v5 = sub_a6bf4c(v0, "ssl/s3_lib.c", 0x156c);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x156e, "ssl_decapsulate");
        v7 = 524303;
        goto LABEL_9572ac;
    }
    else if ((int)sub_a54258(v4, v5, &v0, a2, a3) <= 0)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x1573, "ssl_decapsulate");
        v7 = 786691;
LABEL_9572ac:
        sub_9a58a4(v3, 80, v7, 0);
LABEL_9572b4:
        v6 = 0;
    }
    else if (a4)
    {
        v6 = sub_956e18(v3, v5, v0);
    }
    else
    {
        *(unsigned long *)&v3[944] = v5;
        *(unsigned long *)&v3[952] = v0;
        v6 = 1;
        v5 = 0;
    }
    sub_a6c4e8(v5, v0, "ssl/s3_lib.c", 0x1583);
    sub_a5d6b0(v4);
    return v6;
}
