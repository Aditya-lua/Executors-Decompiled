/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a8a20..0x9a8c5c (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a8a20_0 {
    char padding_0[172];
    unsigned int field_ac;
} st_9a8a20_0;

extern char g_d287f3;

long long sub_9a8a20(st_9a8a20_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (47 < a0->field_ac - 2)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 1098, "ossl_statem_client_process_message");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    goto *((void *)(sub_9a8a58 + *(&(&g_d287f3)[a0->field_ac] - 2) * 4));
}
