/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99fa50..0x99fb58 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99fa50_0 {
    char *field_0;
    unsigned long long field_8;
} st_99fa50_0;


int sub_99fa50(long long a0, st_99fa50_0 *a1, unsigned int a2)
{
    unsigned long long v2;  // x8
    char *v3;  // x11
    unsigned int v4;  // w9
    unsigned int v5;  // w10
    long long v6;  // x0
    long long v7;  // x1
    long long v8;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 >= 2)
    {
        v3 = a1->field_0;
        v4 = *v3;
        v5 = v3[1];
        a1->field_0 = v3 + 2;
        a1->field_8 = v2 - 2;
        if (v2 != 2)
            goto LABEL_99fa88;
        if ((v5 | v4 * 0x100) == 772)
        {
            if (a2 == 0x800 || !(*(unsigned int *)(a0 + 72) = 772, !sub_c64b00(a0, 772)))
                return 1;
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1865, "tls_parse_stoc_supported_versions");
            v6 = a0;
            v7 = 80;
            v8 = 786691;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1854, "tls_parse_stoc_supported_versions");
            v6 = a0;
            v7 = 47;
            v8 = 116;
        }
    }
    else
    {
LABEL_99fa88:
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1844, "tls_parse_stoc_supported_versions");
        v6 = a0;
        v7 = 50;
        v8 = 159;
    }
    sub_9a58a4(v6, v7, v8, 0);
    return 0;
}
