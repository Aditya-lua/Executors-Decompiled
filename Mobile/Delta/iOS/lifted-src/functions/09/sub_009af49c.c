/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af49c..0x9af518 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af49c_0 {
    char padding_0[2980];
    int field_ba4;
} st_9af49c_0;


long long sub_9af49c(st_9af49c_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_c68d5c(a1, a0->field_ba4, 1))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 705, "tls_construct_key_update");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    a0->field_ba4 = -0x1;
    return 1;
}
