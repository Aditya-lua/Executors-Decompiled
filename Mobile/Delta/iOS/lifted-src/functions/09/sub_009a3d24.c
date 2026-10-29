/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a3d24..0x9a3de8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a3d24_1 {
    char padding_0[2304];
    struct st_9a3d24_0 *field_900;
} st_9a3d24_1;

typedef struct st_9a3d24_0 {
    char padding_0[856];
    char field_358;
} st_9a3d24_0;


long long sub_9a3d24(st_9a3d24_1 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (3 < a0->field_900->field_358 - 1)
        return 2;
    if (sub_c68d5c(a1, 1, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, a0->field_900->field_358, 1) && sub_a6e970(a1))
        return 1;
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1643, "tls_construct_stoc_maxfragmentlen");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
