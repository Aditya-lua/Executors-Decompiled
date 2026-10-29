/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979d30..0x979e88 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_d28490[4];

unsigned long long sub_979d30(long long a0, long long a1, unsigned long long *a2)
{
    unsigned int v5;  // w8
    unsigned long long *v6;  // x22
    unsigned long long v7;  // w9
    unsigned long long v8;  // x23
    unsigned long long v9;  // x10
    unsigned long long v10;  // w10
    unsigned long long v11;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x4c]
    unsigned long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = 0;
    v5 = a2[196];
    v6 = a2 + 140;
    if (a2[196] & 0xe0000)
    {
        v7 = 0;
        do
        {
            v8 = v7;
            if (1 >= v7)
            {
                v9 = v8;
                if (!v7)
                    goto LABEL_979dbc;
                if (v7 == 1)
                    continue;
            }
            else if (v7 != 3 && v7 == 2)
            {
                v9 = 1;
                goto LABEL_979dbc;
            }
            v9 = 2;
LABEL_979dbc:
            v2 = 0;
            v1 = 0;
            if (v6[v9])
            {
                if (sub_986278(v6[v9], &v2, &v1) && !v2)
                {
                    v5 = a2[196];
                }
                else
                {
                    sub_979174(a2, 10, 6, "crypto stream data in wrong EL", 0, "ssl/quic/quic_channel.c", 1016, "ch_on_crypto_recv_record");
                    return 0;
                }
            }
        } while ((v7 = (unsigned int)v8 + 1, v10 = (v5 * 0x8000 | v5 >> 0x11) & 0xffff8007 & 7, v10 > v7));
        if (3 >= v10)
        {
            v11 = v6[g_d28490[v10]];
            if (!v11)
                return v11;
        }
        else
        {
            v11 = v6[2];
            if (!v11)
                return v11;
        }
    }
    else
    {
        v11 = *v6;
        if (!v11)
            return v11;
    }
    return sub_c633b8(v11, a0, a1, &v0);
}
