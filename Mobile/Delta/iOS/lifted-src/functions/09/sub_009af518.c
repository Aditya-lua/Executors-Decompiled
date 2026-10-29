/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af518..0x9af614 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9af518(void* a0, void* a1)
{
    void* v2;  // x0
    long long v3;  // x1
    long long v4;  // x2
    unsigned long v5;  // x9
    unsigned int v6;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_992a0c(a0 + 3160))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 722, "tls_process_key_update");
        v2 = a0;
        v3 = 10;
        v4 = 182;
    }
    else
    {
        v5 = (long long)a1[8];
        if (!v5 || (v6 = *(char *)*(long long *)a1, *(long long *)a1 = *(long long *)a1 + 1, *(unsigned long *)&a1[8] = v5 - 1, v5 != 1))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 728, "tls_process_key_update");
            v2 = a0;
            v3 = 50;
        }
        else if (v6 >= 2)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 738, "tls_process_key_update");
            v2 = a0;
            v3 = 47;
        }
        else
        {
            if (v6 != 1)
                return sub_970188(a0, 0) != 0;
            *(unsigned int *)&a0[2980] = 0;
            return sub_970188(a0, 0) != 0;
        }
        v4 = 122;
    }
    sub_9a58a4(v2, v3, v4, 0);
    return 0;
}
