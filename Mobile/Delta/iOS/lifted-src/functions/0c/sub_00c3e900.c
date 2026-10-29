/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3e900..0xc3ea4c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c3e900(void* a0)
{
    unsigned long v6;  // x8
    unsigned int v7;  // w9
    uint128_t v8;  // q0
    unsigned long long v9;  // w10
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4107
    unsigned long long v12;  // 4107
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (*(long long *)a0 && !(v6 = (long long)a0[16], (unsigned long long)(long long)a0[8] <= v6))
    {
        v7 = *(char *)(*(long long *)a0 + v6);
        switch (v7)
        {
        case 73:
            *(unsigned long *)&a0[16] = v6 + 1;
            if (!(sub_c3b0e8(a0, 0) & 1) && (!(long long)a0[32] || !(sub_be7850((long long)a0[32], "<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)))
            {
                break;
            }
            else
            {
LABEL_c3ea34:
                break;
            }
        case 66:
            *(unsigned long *)&a0[16] = v6 + 1;
            sub_c3df38(&v0, a0);
            if (*(unsigned long long *)&v0)
            {
                if (!(long long)a0[32])
                    goto LABEL_c3ea44;
                v2 = *(int128_t *)a0;
                v3 = (int128_t)a0[16];
                *(uint128_t *)a0 = v0;
                *(uint128_t *)&a0[16] = v1;
                sub_c3e900(a0);
                v8 = v2;
                *(uint128_t *)a0 = v8;
                *(uint128_t *)&a0[16] = v3;
                break;
            }
            else
            {
                if ((long long)a0[32])
                {
                    v9 = *(char *)((void*)&v0 + 8);
                    v10 = v9 & 0xff;
                    if (v9)
                    {
                        v11 = arm64g_calculate_condition(19, v10, 0, 0);
                        if (!(v11 & 1))
                            goto LABEL_c3ea2a;
LABEL_c3ea29:
                    }
                    else
                    {
                        v12 = arm64g_calculate_condition(19, v10, 0, 0);
                        if (v12 & 1)
                            goto LABEL_c3ea29;
LABEL_c3ea2a:
                    }
                    if (sub_be7850())
                        goto LABEL_c3ea34;
                }
                v8 = v0;
                *(uint128_t *)a0 = v8;
                *(uint128_t *)&a0[16] = v1;
LABEL_c3ea44:
                break;
            }
        default:
            goto LABEL_c3e988;
        }
    }
    else
    {
LABEL_c3e988:
    }
    return *(unsigned long long *)&v8;
}
