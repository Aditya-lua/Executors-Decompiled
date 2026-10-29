/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ed6c..0x99ee44 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ed6c_2 {
    struct st_99ed6c_3 *field_0;
    long long field_8;
} st_99ed6c_2;

typedef struct st_99ed6c_1 {
    char padding_0[2304];
    struct st_99ed6c_0 *field_900;
    char padding_908[556];
    char field_b34;
} st_99ed6c_1;

typedef struct st_99ed6c_0 {
    char padding_0[856];
    char field_358;
} st_99ed6c_0;

typedef struct st_99ed6c_3 {
    char field_0;
} st_99ed6c_3;


long long sub_99ed6c(st_99ed6c_1 *a0, st_99ed6c_2 *a1)
{
    st_99ed6c_1 *v2;  // x19
    unsigned int v3;  // w8
    long long v4;  // x1
    long long v5;  // x1
    long long v6;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1->field_8 == 1)
    {
        v3 = *(char *)a1->field_0;
        a1->field_0 = a1->field_0 + 1;
        a1->field_8 = 0;
        if (4 > v3 - 1)
        {
            if (v3 == v2->field_b34)
            {
                v2->field_900->field_358 = v3;
                return 1;
            }
            sub_a368c8();
            v4 = 1384;
        }
        else
        {
            sub_a368c8();
            v4 = 1372;
        }
        sub_a369bc("ssl/statem/extensions_clnt.c", v4, "tls_parse_stoc_maxfragmentlen");
        v5 = 47;
        v6 = 232;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1365, "tls_parse_stoc_maxfragmentlen");
        v5 = 50;
        v6 = 110;
    }
    sub_9a58a4(v2, v5, v6, 0);
    return 0;
}
