/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a20bc..0x9a2198 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a20bc_0 {
    char *field_0;
    unsigned long long field_8;
} st_9a20bc_0;


char sub_9a20bc(void* a0, st_9a20bc_0 *a1)
{
    unsigned long v2;  // x10
    char *v3;  // x9
    char v4;  // x8
    char *v5;  // x9
    char v6;  // w10
    char v7;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2)
    {
        v3 = a1->field_0;
        v4 = v2 - 1;
        if (v4 == *v3)
        {
            a1->field_0 = &v3[v2];
            a1->field_8 = 0;
            if (v4)
            {
                v5 = v3 + 1;
                do
                {
                    v6 = *v5;
                    v5 += 1;
                    if (v6 == 1)
                    {
                        v7 = 2;
                    }
                    else
                    {
                        if (v6 || !((char)((char)a0[2481]) >> 2 & 1))
                            continue;
                        v7 = 1;
                    }
                    *(int *)&a0[2832] = (int)a0[2832] | v7;
                } while ((v4 -= 1, v4));
                if (!((char)a0[2832] & 1))
                    return 1;
                if (!((char)((char)a0[2484]) >> 3 & 1))
                    return 1;
                *(unsigned int *)&a0[2832] = 1;
                return 1;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 578, "tls_parse_ctos_psk_kex_modes");
    sub_9a58a4(a0, 50, 110, 0);
    return 0;
}
