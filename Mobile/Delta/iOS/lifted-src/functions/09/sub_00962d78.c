/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962d78..0x962ea8 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962d78_0 {
    char padding_0[432];
    long long field_1b0;
} st_962d78_0;


unsigned long long sub_962d78(st_962d78_0 *a0, long long a1, unsigned long long a2, unsigned long long *a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x24
    unsigned long long v4;  // x0
    unsigned long long v5;  // x21
    unsigned long long v6;  // x19
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50c70(a0->field_1b0);
    if (v2 >> 31 & 1 || (v3 = v2 & 0xffffffff, v3 > a2))
    {
        sub_a368c8();
        v7 = 6097;
        goto LABEL_962dd0;
    }
    else
    {
        v4 = sub_a3f728();
        if (v4)
        {
            v5 = v4;
            if (sub_a40520() && (int)sub_a3ff7c(v5, a1, 0) > 0)
            {
                *a3 = v3;
                v6 = 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", 0x17dd, "ssl_handshake_hash");
                sub_9a58a4(a0, 80, 0xc0103, 0);
                v6 = 0;
            }
        }
        else
        {
            sub_a368c8();
            v7 = 6103;
LABEL_962dd0:
            sub_a369bc("ssl/ssl_lib.c", v7, "ssl_handshake_hash");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            v5 = 0;
            v6 = 0;
        }
    }
    sub_a3f73c(v5);
    return v6;
}
