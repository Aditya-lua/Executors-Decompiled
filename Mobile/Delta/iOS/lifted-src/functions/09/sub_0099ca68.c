/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99ca68..0x99cb5c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99ca68_0 {
    char padding_0[3056];
    long long field_bf0;
} st_99ca68_0;


long long sub_99ca68(st_99ca68_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long len;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_bf0)
        return 2;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (sub_c68d5c(a1, 12, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 1) && sub_c689f4(a1, 1))
    {
        len = _strlen(a0->field_bf0);
        if (sub_a6ebd4(a1, a0->field_bf0, len) && sub_a6e970(a1) && sub_a6e970(a1))
            return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 131, "tls_construct_ctos_srp");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
