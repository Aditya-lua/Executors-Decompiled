/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99e54c..0x99e6a0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99e54c_2 {
    char padding_0[8];
    long long field_8;
    char padding_10[2288];
    struct st_99e54c_1 *field_900;
    char padding_908[168];
    char field_9b0;
} st_99e54c_2;

typedef struct st_99e54c_0 {
    char padding_0[64];
    unsigned int field_40;
} st_99e54c_0;

typedef struct st_99e54c_1 {
    unsigned int field_0;
    char padding_4[756];
    struct st_99e54c_0 *field_2f8;
} st_99e54c_1;


long long sub_99e54c(st_99e54c_2 *a0, long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_99e54c_1 *v10;  // x8
    long long v11;  // w0
    long long v12;  // x9
    long long v0;  // [bp-0x30], Other Possible Types: unsigned long long
    char v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!(a0->field_9b0 >> 4 & 1))
        return 2;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    if (!sub_c68eb8(a1, &v0))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1006, "tls_construct_ctos_padding");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    v10 = a0->field_900;
    if (v10->field_0 == 772 && *(long long *)&v10[1].padding_4[44] && v10->field_2f8 && sub_95a688(a0->field_8, v10->field_2f8->field_40))
    {
        v11 = (unsigned int)sub_a50ac8();
        if (v11 < 1)
            return 0;
        v0 = *(long long *)&a0->field_900[1].padding_4[44] + v0 + v11 + 15;
    }
    if ((v0 & 0xffffffffffffff00) != 0x100)
        return 1;
    v12 = 508 - v0;
    if (v0 >= 508)
        v12 = 1;
    v0 = v12;
    if (!sub_c68d5c() || !sub_a6e86c(a1, v0, &v1, 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 1051, "tls_construct_ctos_padding");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    _bzero(v1, v0);
    return 1;
}
