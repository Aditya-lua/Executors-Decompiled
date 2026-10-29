/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d8e8..0xc3dabc (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3d8e8(void* a0)
{
    unsigned long v6;  // x8
    unsigned long long v7;  // x24
    unsigned long v8;  // x9
    unsigned long long v9;  // w20
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4107
    unsigned long long v12;  // 4107
    unsigned long long v13;  // 4111
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    uint128_t v3;  // [bp-0x50]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *(long long *)a0;
    if (!*(long long *)a0)
        return 0;
    v7 = 0;
    while (1)
    {
        v8 = (long long)a0[16];
        if ((unsigned long long)(long long)a0[8] > v8 && *(char *)(v6 + v8) == 69)
        {
            *(unsigned long *)&a0[16] = v8 + 1;
            return 0;
        }
        if (v7 && (long long)a0[32])
        {
            if (sub_be7850((long long)a0[32], ", Cunsafe \" -fn() + ", 2) & 1)
                return 1;
            if (!*(long long *)a0)
                goto LABEL_c3d9e8;
        }
        sub_c3b814(&v0, a0, 115);
        if (*(char *)&v0 == 1)
        {
            v9 = *(char *)((void*)&v0 + 1);
            if (!(long long)a0[32])
                goto LABEL_c3da84;
            v10 = v9 & 0xff;
            if (v9)
            {
                v11 = arm64g_calculate_condition(19, v10, 0, 0);
                if (!(v11 & 1))
                    goto LABEL_c3da3e;
            }
            else
            {
                v12 = arm64g_calculate_condition(19, v10, 0, 0);
                if (!(v12 & 1))
                {
LABEL_c3da3e:
                    goto LABEL_c3da74;
                }
            }
            goto LABEL_c3da3e;
        }
        if (*(long long *)a0)
        {
            sub_c3b8ac(&v0, a0);
            if (*(unsigned long long *)&v0)
            {
                v2 = v0;
                v3 = v1;
                if ((long long)a0[32] && (sub_c3bac4(&v2) & 1 || (long long)a0[32] && sub_be7850((long long)a0[32], ": punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1))
                    goto LABEL_c3da7c;
                if (sub_c3c6a0(a0, 1) & 1)
                    return 1;
            }
            else
            {
                v9 = *(char *)((void*)&v0 + 8);
                if ((long long)a0[32])
                {
                    v13 = arm64g_calculate_condition(19, v9 & 0xff, 0, 0);
LABEL_c3da74:
                    if (!sub_be7850())
                        goto LABEL_c3da84;
LABEL_c3da7c:
                    return 1;
                }
LABEL_c3da84:
                *(unsigned long long *)a0 = 0;
                *(char *)&a0[8] = v9;
                break;
            }
            goto LABEL_c3da00;
        }
LABEL_c3d9e8:
        if ((long long)a0[32] && sub_be7850((long long)a0[32], "?`fmt::Error`s should be impossible without a `fmt::Formatter`> ", 1) & 1)
            return 1;
LABEL_c3da00:
        v6 = *(long long *)a0;
        v7 -= 1;
        if (!*(long long *)a0)
            break;
    }
    return 0;
}
