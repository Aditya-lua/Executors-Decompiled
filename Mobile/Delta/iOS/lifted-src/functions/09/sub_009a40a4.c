/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a40a4..0x9a414c (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a40a4_0 {
    char padding_0[2656];
    long long field_a60;
} st_9a40a4_0;


long long sub_9a40a4(st_9a40a4_0 *a0, long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a0->field_a60 && sub_96a380(a0))
    {
        if (sub_c68d5c(a1, 35, 2) && sub_c68d5c(a1, 0, 2))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 1747, "tls_construct_stoc_session_ticket");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    *(unsigned int *)&a0->field_a60 = 0;
    return 2;
}
