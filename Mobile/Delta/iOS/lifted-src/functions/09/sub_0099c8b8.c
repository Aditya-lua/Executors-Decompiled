/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c8b8..0x99c9b4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c8b8_0 {
    char padding_0[2592];
    long long field_a20;
} st_99c8b8_0;


long long sub_99c8b8(st_99c8b8_0 *a0, long long a1)
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

    if (!a0->field_a20)
        return 2;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (sub_c68d5c(a1, 0, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, 0, 1))
    {
        len = _strlen(a0->field_a20);
        if (sub_a6ec4c(a1, a0->field_a20, len, 2) && sub_a6e970(a1) && sub_a6e970(a1))
            return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 80, "tls_construct_ctos_server_name");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
