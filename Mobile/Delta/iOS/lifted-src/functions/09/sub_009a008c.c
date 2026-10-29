/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a008c..0x9a01ec (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a008c_0 {
    char *field_0;
    unsigned long long field_8;
} st_9a008c_0;

typedef struct st_9a008c_2 {
    char padding_0[353];
    char field_161;
    char padding_162[1950];
    struct st_9a008c_1 *field_900;
    char padding_908[528];
    unsigned int field_b18;
} st_9a008c_2;

typedef struct st_9a008c_1 {
    char padding_0[836];
    unsigned int field_344;
} st_9a008c_1;

extern char _NSHomeDirectory;

int sub_9a008c(st_9a008c_2 *a0, st_9a008c_0 *a1, unsigned int a2)
{
    unsigned long long v2;  // x8
    char *v3;  // x13
    unsigned long v4;  // x9
    unsigned long v5;  // x10
    unsigned long v6;  // x11
    unsigned long v7;  // x12
    unsigned long long v8;  // x9
    st_9a008c_1 *v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (a2 == 0x2000)
    {
        if (v2 >= 4)
        {
            v3 = a1->field_0;
            v4 = *v3;
            v5 = v3[1];
            v6 = v3[2];
            v7 = v3[3];
            a1->field_0 = v3 + 4;
            a1->field_8 = v2 - 4;
            if (v2 != 4)
                goto LABEL_9a00d4;
            v8 = v4 * &_NSHomeDirectory | v5 * 0x10000 | v6 * 0x100 | v7;
            v9 = a0->field_900;
            v9->field_344 = v8;
            if (!(a0->field_161 >> 5 & 1))
                return 1;
            if (v8 == 0xffffffff)
                return 1;
            v9->field_344 = 1;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 2084, "tls_parse_stoc_early_data");
        }
        else
        {
LABEL_9a00d4:
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 2066, "tls_parse_stoc_early_data");
        }
    }
    else
    {
        if (v2)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 2092, "tls_parse_stoc_early_data");
        }
        else
        {
            if (*(int *)&a0[1].padding_0[0] && *(int *)&a0->padding_162[934])
            {
                a0->field_b18 = 2;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 2103, "tls_parse_stoc_early_data");
        }
    }
    sub_9a58a4();
    return 0;
}
