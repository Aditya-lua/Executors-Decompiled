/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a05cc..0x9a06b8 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a05cc_0 {
    struct st_9a05cc_1 *field_0;
    long long field_8;
} st_9a05cc_0;

typedef struct st_9a05cc_1 {
    char field_0;
} st_9a05cc_1;


long long sub_9a05cc(char *a0, st_9a05cc_0 *a1)
{
    unsigned long v2;  // x20
    char *v3;  // x0
    long long v4;  // x2
    long long v5;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8 == 1)
    {
        v2 = *(char *)a1->field_0;
        a1->field_0 = a1->field_0 + 1;
        a1->field_8 = 0;
        if (a0[2899] == 1)
        {
            if (*(long long *)&a0[5544])
            {
                if (_memchr(*(long long *)&a0[5544], v2, *(long long *)&a0[5552]))
                {
                    a0[2898] = v2;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions_clnt.c", 2267, "tls_parse_stoc_server_cert_type");
                v3 = a0;
                v4 = 384;
            }
            else
            {
                sub_a368c8(0);
                v5 = 2262;
LABEL_9a0658:
                sub_a369bc("ssl/statem/extensions_clnt.c", v5, "tls_parse_stoc_server_cert_type");
                v3 = a0;
                v4 = 110;
            }
            sub_9a58a4(v3, 50, v4, 0);
        }
        else
        {
            sub_c652c0(a0);
        }
        return 0;
    }
    sub_a368c8();
    v5 = 2248;
    goto LABEL_9a0658;
}
