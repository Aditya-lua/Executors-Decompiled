/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaba190..0xaba29c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aba190(void* a0, long long a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    unsigned long long v5;  // x21
    unsigned long long v7;  // x0
    unsigned long long v8;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_ab148c(a1);
    v2 = sub_aa8c58((long long)a0[8]);
    if (!v2)
        return v2;
    v3 = sub_9dddcc((long long)a0[8]);
    if (!v3)
        return v3;
    v4 = v3;
    v5 = a2;
    if (!a2)
    {
        v5 = sub_9e4958();
        if (!v5 || !sub_9e4d58(v5, 0x10001))
        {
            sub_9e48d4(v5);
            sub_9dded4(v4);
            return 0;
        }
    }
    while (sub_ab9c50(a0))
    {
        if (sub_9e5528((long long)a0[64], (long long)a0[72]) >> 31 & 1)
            *(uint128_t *)&a0[64] = __dirty_unsupported_Iop_SliceV128((int128_t)a0[64], (int128_t)a0[64], 8);
        v7 = sub_ab9edc(a0, a1, v5, v4);
        if (v7 >> 31 & 1)
            break;
        if ((unsigned int)v7)
        {
            v8 = sub_aba29c(a0, v4);
            if (a2)
            {
                sub_9dded4(v4);
                return v8;
            }
            sub_9e48d4(v5);
            sub_9dded4(v4);
            return v8;
        }
    }
    if (a2)
    {
        sub_9dded4(v4);
        return 0;
    }
    sub_9e48d4(v5);
    sub_9dded4(v4);
    return 0;
}
