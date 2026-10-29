/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a4b08..0x9a4f6c (1124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a4b08_1 {
    char padding_0[176];
    struct st_9a4b08_2 *field_b0;
} st_9a4b08_1;

typedef struct st_9a4b08_0 {
    char padding_0[224];
    unsigned long long field_e0;
} st_9a4b08_0;

typedef struct st_9a4b08_2 {
    unsigned long long field_0;
} st_9a4b08_2;

typedef struct st_9a4b08_3 {
    char padding_0[8];
    struct st_9a4b08_0 *field_8;
    char padding_10[8];
    struct st_9a4b08_1 *field_18;
    char padding_20[321];
    char field_161;
    char padding_162[892];
    unsigned short field_4de;
} st_9a4b08_3;


long long sub_9a4b08(st_9a4b08_3 *a0, long long a1)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    long long v18;  // x2
    char v0;  // [bp-0x80]
    char v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!(a0->field_161 >> 3 & 1))
        return 2;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    if (a0->field_8->field_e0)
    {
        a0 = a0;
        if (sub_c68d5c(a1, 44, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 2) && sub_c68eb8(a1, &v0) && sub_c68684(a1, 0x1076, &v1) && sub_c68d5c(a1, 1, 2) && sub_c68d5c(a1, 772, 2) && sub_c68d5c(a1, a0->field_4de, 2))
            a0->field_18->field_b0();
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 2108, "tls_construct_stoc_cookie");
        v18 = 786691;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 2089, "tls_construct_stoc_cookie");
        v18 = 287;
    }
    sub_9a58a4(a0, 80, v18, 0);
    return 0;
}
