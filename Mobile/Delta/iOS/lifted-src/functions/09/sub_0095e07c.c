/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95e07c..0x95e0cc (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95e07c_1 {
    char padding_0[24];
    struct st_95e07c_0 *field_18;
} st_95e07c_1;

typedef struct st_95e07c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_95e07c_0;


st_95e07c_0 * sub_95e07c(st_95e07c_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0->field_18)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 570, "SSL_clear");
        sub_a36abc(20, 188, 0);
        return 0;
    }
    goto *((void *)(a0->field_18->field_20));
}
