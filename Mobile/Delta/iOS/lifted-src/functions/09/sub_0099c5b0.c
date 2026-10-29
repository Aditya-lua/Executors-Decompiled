/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c5b0..0x99c61c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c5b0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_99c5b0_0;


int sub_99c5b0(long long a0, st_99c5b0_0 *a1)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9b1e94();
    if (!v2)
    {
        return v2;
    }
    else if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions.c", 1272, "tls_parse_certificate_authorities");
        sub_9a58a4(a0, 50, 110, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
