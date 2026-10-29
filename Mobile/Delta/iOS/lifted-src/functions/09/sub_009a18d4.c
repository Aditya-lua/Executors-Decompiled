/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a18d4..0x9a19b0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a18d4_0 {
    struct st_9a18d4_1 *field_0;
    long long field_8;
} st_9a18d4_0;

typedef struct st_9a18d4_1 {
    unsigned short field_0;
} st_9a18d4_1;


long long sub_9a18d4(long long *a0, st_9a18d4_0 *a1)
{
    unsigned long v4;  // x8
    long long v5;  // x8
    unsigned long v6;  // x9
    long long v7;  // x1
    unsigned long v0;  // [bp-0x30]
    long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if ((unsigned long long)a1->field_8 >= 2 && !(v4 = *(short *)a1->field_0, v5 = (unsigned int)((v4 & 0xff00) >> 8) | (unsigned int)v4 * 0x100 & 0xff00ff00, a1->field_8 - 2 != v5))
    {
        v6 = a1->field_0 + 1;
        a1->field_0 = v6 + v5;
        a1->field_8 = 0;
        v0 = v6;
        v1 = v5;
        if (!v1)
            goto LABEL_9a1934;
        if ((int)a0[15] && (int)a0[161])
            return 1;
        if (sub_96b598(a0, &v0, 1))
            return 1;
        sub_a368c8(1);
        v7 = 296;
    }
    else
    {
LABEL_9a1934:
        sub_a368c8();
        v7 = 285;
    }
    sub_a369bc("ssl/statem/extensions_srvr.c", v7, "tls_parse_ctos_sig_algs_cert");
    sub_9a58a4(a0, 50, 110, 0);
    return 0;
}
