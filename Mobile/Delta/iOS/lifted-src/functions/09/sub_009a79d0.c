/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a79d0..0x9a7a40 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a79d0_0 {
    char padding_0[240];
    unsigned int field_f0;
} st_9a79d0_0;


long long sub_9a79d0(st_9a79d0_0 *a0)
{
    unsigned int v5;  // w8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a0->field_f0 | 4;
    if (v5 != 7)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 0x1083, "tls_construct_end_of_early_data");
        sub_9a58a4(a0, 80, 0xc0101, 0);
        return 0;
    }
    a0->field_f0 = v5;
    return 1;
}
