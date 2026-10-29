/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a157c..0x9a1638 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a157c_2 {
    struct st_9a157c_3 *field_0;
    long long field_8;
} st_9a157c_2;

typedef struct st_9a157c_1 {
    char padding_0[2304];
    struct st_9a157c_0 *field_900;
} st_9a157c_1;

typedef struct st_9a157c_0 {
    char padding_0[856];
    char field_358;
} st_9a157c_0;

typedef struct st_9a157c_3 {
    char field_0;
} st_9a157c_3;


long long sub_9a157c(st_9a157c_1 *a0, st_9a157c_2 *a1)
{
    st_9a157c_1 *v2;  // x19
    unsigned int v3;  // w8
    long long v4;  // x1
    long long v5;  // x2
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
            if (v2->field_900->field_358 != 0xff)
                return 1;
            v2->field_900->field_358 = v3;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 191, "tls_parse_ctos_maxfragmentlen");
        v4 = 47;
        v5 = 232;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 184, "tls_parse_ctos_maxfragmentlen");
        v4 = 50;
        v5 = 110;
    }
    sub_9a58a4(v2, v4, v5, 0);
    return 0;
}
