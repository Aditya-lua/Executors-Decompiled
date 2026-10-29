/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9640a8..0x96418c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9640a8(void* a0, long long a1, long long a2)
{
    unsigned long v2;  // x0
    unsigned long v3;  // x22
    unsigned int v4;  // w23
    unsigned int v5;  // w23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)a0 || (v2 = sub_ad61b4(), *(unsigned long *)a0 = v2, v2))
    {
        v3 = sub_ad692c(a1);
        if (!v3)
            return 0;
        v4 = 0;
        while (1)
        {
            v5 = v4;
            if (sub_9f78f0(v3, a2) != 1 || !sub_ad68a0(*(long long *)a0, v3))
                break;
            v4 = v5 + 1;
            v3 = sub_ad692c(a1);
            if (!v3)
                return v5 + 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 0x18e1, "ct_move_scts");
        sub_a36abc(20, 0x8000f, 0);
        v3 = 0;
    }
    sub_9f770c(v3);
    return 0xffffffff;
}
