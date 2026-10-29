/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99f160..0x99f240 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99f160_1 {
    int field_0;
    char padding_4[212];
    struct st_99f160_0 *field_d8;
} st_99f160_1;

typedef struct st_99f160_2 {
    char padding_0[24];
    struct st_99f160_1 *field_18;
    char padding_20[2568];
    unsigned int field_a28;
    char padding_a2c[16];
    unsigned int field_a3c;
} st_99f160_2;

typedef struct st_99f160_0 {
    char padding_0[80];
    char field_50;
} st_99f160_0;


int sub_99f160(st_99f160_2 *a0, unsigned long a1, unsigned int a2, unsigned long a3, char a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 == 0x4000)
        return 1;
    if (a0->field_a28 != 1)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1506, "tls_parse_stoc_status_request");
        sub_9a58a4(a0, 110, 110, 0);
        return 0;
    }
    else if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
    {
        if (*(long long *)(a1 + 8))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 1510, "tls_parse_stoc_status_request");
            sub_9a58a4(a0, 50, 110, 0);
            return 0;
        }
        a0->field_a3c = 1;
    }
    return 1;
}
