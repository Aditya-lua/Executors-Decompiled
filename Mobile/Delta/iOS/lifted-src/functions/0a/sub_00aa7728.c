/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa7728..0xaa7894 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa7728_0 {
    char padding_0[4];
    long long field_4;
    char padding_c[4];
    long long field_10;
} st_aa7728_0;


long long sub_aa7728(char **a0, st_aa7728_0 *a1)
{
    long long v3;  // x21
    char *v4;  // x22
    char *v5;  // x22
    unsigned long v6;  // x8
    long long v7;  // w8
    char *v8;  // x22
    char *v9;  // x22
    char *v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 0;
    v4 = *a0 - 1;
    do
    {
        v5 = v4;
        if (!sub_a69974(v5[1]))
        {
            sub_a368c8();
            sub_a369bc("crypto/property/property_parse.c", 103, "parse_number");
            v0 = *a0;
            sub_a36abc(55, 105, "HERE-->%s");
            return 0;
        }
        v6 = v5[1];
        if ((long long)((9223372036854775855 - v6) / 10) < v3)
        {
            sub_a368c8();
            sub_a369bc("crypto/property/property_parse.c", 109, "parse_number");
            v0 = *a0;
            sub_a36abc(55, 108, "Property %s overflows");
            return 0;
        }
        v3 = v6 + 10 * v3 - 48;
        v4 = v5 + 1;
    } while (sub_a69974(v5[2]));
    if (!sub_a6994c(v4[1], 8))
    {
        v7 = v4[1];
        if (v7 && v7 != 44)
        {
            sub_a368c8();
            sub_a369bc("crypto/property/property_parse.c", 116, "parse_number");
            v0 = *a0;
            sub_a36abc(55, 105, "HERE-->%s");
            return 0;
        }
    }
    do
    {
        v8 = v4;
        v9 = v8 + 1;
        v4 = v9;
    } while (sub_a6994c(v8[1], 8));
    *a0 = v9;
    *(unsigned int *)(a1->padding_0)[1] = 1;
    *(long long *)a1->padding_c = v3;
    return 1;
}
