/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x962378..0x9623d8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_962378_0 {
    char padding_0[32];
    char field_20;
} st_962378_0;

typedef struct st_962378_1 {
    char padding_0[768];
    struct st_962378_0 *field_300;
} st_962378_1;


unsigned long long sub_962378(unsigned long a0, st_962378_1 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1->field_300->field_20 >> 3 & 1))
    {
        return 1;
    }
    else if (!(sub_aeb46c() >> 7 & 1))
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x124b, "ssl_check_srvr_ecc_cert_and_alg");
        sub_a36abc(20, 318, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
