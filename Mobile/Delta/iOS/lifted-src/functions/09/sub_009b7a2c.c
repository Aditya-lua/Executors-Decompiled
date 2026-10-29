/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b7a2c..0x9b7ac4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b7a2c_0 {
    char padding_0[196];
    long long field_c4;
    char padding_cc[220];
    long long field_1a8;
    char padding_1b0[1872];
    struct st_9b7a2c_1 *field_900;
} st_9b7a2c_0;

typedef struct st_9b7a2c_1 {
    char padding_0[696];
    long long field_2b8;
    long long field_2c0;
} st_9b7a2c_1;


long long sub_9b7a2c(st_9b7a2c_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(int *)&(a0->padding_0)[1] && (*(long long *)(*(long long *)&a0->padding_1b0[1864] + 696) || *(long long *)(*(long long *)&a0->padding_1b0[1864] + 704)) && !*(long long *)&a0->padding_cc[216])
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 3553, "tls_post_process_client_key_exchange");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    return (sub_9545a8() != 0) * 2;
}
