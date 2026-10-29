/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b35b0..0x9b36a4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b35b0_2 {
    char padding_0[8];
    struct st_9b35b0_0 *field_8;
} st_9b35b0_2;

typedef struct st_9b35b0_0 {
    char padding_0[208];
    struct st_9b35b0_1 *field_d0;
} st_9b35b0_0;

typedef struct st_9b35b0_1 {
    unsigned long long field_0;
} st_9b35b0_1;


unsigned long long * sub_9b35b0(st_9b35b0_2 *a0, unsigned long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8->field_d0)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1404, "dtls_construct_hello_verify_request");
        sub_9a58a4(a0, 0xffffffff, 400, 0);
        return 0;
    }
    a0->field_8->field_d0();
}
