/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a050c..0x9a05cc (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a050c_0 {
    char padding_0[2899];
    long long field_b53;
} st_9a050c_0;


long long sub_9a050c(st_9a050c_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    (a0->padding_0)[1] = 0;
    if (!*(long long *)&a0[1].padding_0[2632])
        return 2;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_c68d5c(a1, 20, 2) && sub_c6876c(a1, 2) && sub_a6ec4c(a1, *(long long *)&a0[1].padding_0[2632], *(long long *)&a0[1].padding_0[2640], 1) && sub_a6e970(a1))
    {
        (a0->padding_0)[1] = 1;
        return 1;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_clnt.c", 2234, "tls_construct_ctos_server_cert_type");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
