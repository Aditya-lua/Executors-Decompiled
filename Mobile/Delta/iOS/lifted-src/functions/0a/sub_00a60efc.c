/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60efc..0xa610f8 (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a60efc(void* ptr, void* a1)
{
    unsigned long v2;  // x21
    unsigned long v3;  // x21
    unsigned long v4;  // x21
    unsigned long v5;  // x21
    unsigned long v6;  // x0
    long long v7;  // x1
    unsigned long v8;  // x0
    uint128_t v9;  // q0
    unsigned int v10;  // w8
    unsigned long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(long long *)a1;
    if (!v2 || sub_9e48c8(v2, 2) && !sub_9e48c8(v2, 1) || (v2 = sub_9e4b00(v2), v2))
    {
        sub_9e4838(*(long long *)ptr);
        *(unsigned long *)ptr = v2;
        v3 = (long long)a1[16];
        if (v3 && (!sub_9e48c8(v3, 2) || sub_9e48c8(v3, 1)) && !(v3 = sub_9e4b00(v3), v3))
            goto LABEL_a61064;
        sub_9e4838((long long)ptr[16]);
        *(unsigned long *)&ptr[16] = v3;
        v4 = (long long)a1[8];
        if (v4 && (!sub_9e48c8(v4, 2) || sub_9e48c8(v4, 1)) && !(v4 = sub_9e4b00(v4), v4))
            goto LABEL_a61064;
        sub_9e4838((long long)ptr[8]);
        *(unsigned long *)&ptr[8] = v4;
        v5 = (long long)a1[24];
        if (v5 && (!sub_9e48c8(v5, 2) || sub_9e48c8(v5, 1)) && (v5 = sub_9e4b00(v5), !v5))
            goto LABEL_a61064;
        sub_9e4838((long long)ptr[24]);
        *(unsigned long *)&ptr[24] = v5;
        *(int128_t *)&ptr[72] = (int128_t)a1[72];
        sub_a6c2e4((long long)ptr[32], "crypto/ffc/ffc_params.c", 192);
        v6 = (long long)a1[32];
        v7 = (long long)a1[40];
        *(long long *)&ptr[40] = v7;
        if (v6)
        {
            v8 = sub_a6dac4(v6, v7, "crypto/ffc/ffc_params.c", 195);
            *(unsigned long *)&ptr[32] = v8;
            if (v8)
                goto LABEL_a610c8;
            goto LABEL_a61064;
        }
        else
        {
            *(unsigned long long *)&ptr[32] = 0;
LABEL_a610c8:
            v9 = (int128_t)a1[48];
            *(uint128_t *)&ptr[48] = v9;
            *(int *)&ptr[64] = (int)a1[64];
            v10 = (int)a1[88];
            v11 = 88;
        }
    }
    else
    {
LABEL_a61064:
        sub_9e48d4(*(long long *)ptr);
        sub_9e48d4((long long)ptr[8]);
        sub_9e48d4((long long)ptr[16]);
        sub_9e48d4((long long)ptr[24]);
        sub_a6c2e4((long long)ptr[32], "crypto/ffc/ffc_params.c", 41);
        v9 = 0;
        memset(ptr, 0, 96);
        *(unsigned int *)&ptr[48] = 0xffffffff;
        v10 = 3;
        v11 = 64;
        *(unsigned int *)&ptr[56] = 0xffffffff;
    }
    *(unsigned int *)((char *)ptr + v11) = v10;
    return *(unsigned long long *)&v9;
}
