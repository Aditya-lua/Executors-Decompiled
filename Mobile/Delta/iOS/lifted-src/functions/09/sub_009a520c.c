/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a520c..0x9a5348 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9a520c(void* a0, long long a1)
{
    void* v2;  // x19
    long long v3;  // x1
    long long v4;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if ((char)a0[2897] == 2 && (sub_9b2814(v2) || (int)v2[2984] == 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 2288, "tls_construct_stoc_client_cert_type");
        v3 = 43;
        v4 = 110;
    }
    else if (!(char)v2[2896])
    {
        *(char *)&v2[2897] = 0;
        return 2;
    }
    else if ((sub_9b2814(v2) || (int)v2[2984] == 2) && (char)v2[2897] == 1 && (long long)v2[5528])
    {
        if (sub_c68d5c(a1, 19, 2) && sub_c6876c(a1, 2) && sub_c68d5c(a1, (char)v2[2896], 1) && sub_a6e970(a1))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 2314, "tls_construct_stoc_client_cert_type");
        v3 = 80;
        v4 = 786691;
    }
    else
    {
        *(unsigned short *)&v2[2896] = 0;
        return 2;
    }
    sub_9a58a4(v2, v3, v4, 0);
    return 0;
}
