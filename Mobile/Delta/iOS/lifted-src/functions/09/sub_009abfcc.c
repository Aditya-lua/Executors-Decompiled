/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9abfcc..0x9ac05c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9abfcc_1 {
    char padding_0[2304];
    struct st_9abfcc_0 *field_900;
} st_9abfcc_1;

typedef struct st_9abfcc_0 {
    char padding_0[696];
    long long field_2b8;
} st_9abfcc_0;


long long sub_9abfcc(st_9abfcc_1 *a0)
{
    long long v3;  // w0
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = (unsigned int)sub_9afc38();
    if (!v3)
    {
        return v3;
    }
    else if (v0)
    {
        sub_a5a4c8(a0->field_900->field_2b8);
        a0->field_900->field_2b8 = v0;
        return 2;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1916, "tls_process_server_rpk");
        sub_9a58a4(a0, 50, 348, 0);
        return 0;
    }
}
