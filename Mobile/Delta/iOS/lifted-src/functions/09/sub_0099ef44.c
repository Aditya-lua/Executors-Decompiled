/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ef44..0x99f07c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ef44_0 {
    struct st_99ef44_1 *field_0;
    unsigned long long field_8;
} st_99ef44_0;

typedef struct st_99ef44_2 {
    char padding_0[1288];
    unsigned int field_508;
    char padding_50c[1388];
    unsigned long long field_a78;
    long long field_a80;
} st_99ef44_2;

typedef struct st_99ef44_1 {
    char field_0;
} st_99ef44_1;


int sub_99ef44(st_99ef44_2 *a0, st_99ef44_0 *a1)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x20
    unsigned long v4;  // x0
    st_99ef44_2 *v5;  // x0
    long long v6;  // x1
    long long v7;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 && !(v3 = v2 - 1, v3 != *(char *)a1->field_0))
    {
        a1->field_0 = &a1->field_0[v2];
        a1->field_8 = 0;
        if (a0->field_508)
            return 1;
        if (v3)
        {
            a0->field_a78 = 0;
            sub_a6c2e4(a0->field_a80, "ssl/statem/extensions_clnt.c", 1445);
            v4 = sub_a6bf4c(v3, "ssl/statem/extensions_clnt.c", 1446);
            a0->field_a80 = v4;
            if (v4)
            {
                a0->field_a78 = v3;
                _memcpy();
                return 1;
            }
            a0->field_a78 = 0;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1449, "tls_parse_stoc_ec_pt_formats");
            v5 = a0;
            v6 = 80;
            v7 = 786691;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1440, "tls_parse_stoc_ec_pt_formats");
            v5 = a0;
            v6 = 50;
            v7 = 271;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1434, "tls_parse_stoc_ec_pt_formats");
        v5 = a0;
        v6 = 50;
        v7 = 110;
    }
    sub_9a58a4(v5, v6, v7, 0);
    return 0;
}
