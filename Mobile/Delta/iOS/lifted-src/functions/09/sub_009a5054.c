/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a5054..0x9a5158 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a5054_0 {
    char padding_0[2840];
    long long field_b18;
} st_9a5054_0;


long long sub_9a5054(st_9a5054_0 *a0, long long a1, unsigned int a2)
{
    long long v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 == 0x2000)
    {
        if (!*(int *)&a0[1].padding_0[2592])
            return 2;
        if (sub_c68d5c(a1, 42, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, *(int *)&a0[1].padding_0[2592], 4) && sub_a6e970(a1))
            goto LABEL_9a5100;
        v2 = 2242;
    }
    else
    {
        if ((int)a0->field_b18 != 2)
            return 2;
        if (sub_c68d5c(a1, 42, 2) && sub_c6876c(a1, 2) && sub_a6e970(a1))
        {
LABEL_9a5100:
            return 1;
        }
        v2 = 2255;
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", v2, "tls_construct_stoc_early_data");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
