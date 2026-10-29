/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ee44..0x99ef44 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ee44_2 {
    char padding_0[8];
    long long field_8;
} st_99ee44_2;

typedef struct st_99ee44_1 {
    char padding_0[1288];
    long long field_508;
    char padding_510[1008];
    struct st_99ee44_0 *field_900;
    char padding_908[280];
    long long field_a20;
} st_99ee44_1;

typedef struct st_99ee44_0 {
    char padding_0[800];
    long long field_320;
} st_99ee44_0;


long long sub_99ee44(st_99ee44_1 *a0, st_99ee44_2 *a1)
{
    st_99ee44_1 *v2;  // x19
    long long v3;  // x1
    long long v4;  // x2
    long long v5;  // x1
    long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a0->field_a20)
    {
        if (a1->field_8)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1407, "tls_parse_stoc_server_name");
            v3 = 50;
            v4 = 110;
        }
        else
        {
            if ((int)v2->field_508)
                return 1;
            if (v2->field_900->field_320)
            {
                sub_a368c8();
                v5 = 1413;
            }
            else
            {
                v6 = sub_a6d9b4();
                v2->field_900->field_320 = v6;
                if (v6)
                    return 1;
                sub_a368c8();
                v5 = 1418;
            }
LABEL_99eea8:
            sub_a369bc("ssl/statem/extensions_clnt.c", v5, "tls_parse_stoc_server_name");
            v3 = 80;
            v4 = 786691;
        }
        sub_9a58a4(v2, v3, v4, 0);
        return 0;
    }
    sub_a368c8(0);
    v5 = 1402;
    goto LABEL_99eea8;
}
