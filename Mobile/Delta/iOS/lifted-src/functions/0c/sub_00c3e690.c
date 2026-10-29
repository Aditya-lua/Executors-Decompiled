/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3e690..0xc3e900 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3e690(void* a0)
{
    unsigned long v6;  // x8
    unsigned long long v7;  // x27
    unsigned long v8;  // x9
    unsigned long long v9;  // x8
    unsigned long v10;  // x9
    unsigned long v11;  // x10
    unsigned long v12;  // x9
    unsigned long long v13;  // w21
    unsigned long long v14;  // 4111
    uint128_t v0;  // [bp-0xa0]
    uint128_t v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *(long long *)a0;
    if (!v6)
        return 0;
    v7 = 0;
    do
    {
        v8 = (long long)a0[16];
        if ((unsigned long long)(long long)a0[8] > v8 && *(char *)(v6 + v8) == 69)
        {
            *(unsigned long *)&a0[16] = v8 + 1;
            return 0;
        }
        if (v7 && (long long)a0[32] && sub_be7850((long long)a0[32], " + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  }", 3) & 1)
            return 1;
        v9 = sub_c3e900(a0) & 0xff;
        if ((unsigned int)v9 == 2)
        {
LABEL_c3e8b8:
            return 1;
        }
        v10 = *(long long *)a0;
        if (!v10)
        {
LABEL_c3e83c:
            if (!(v9 & 1))
                continue;
LABEL_c3e840:
            if (!(long long)a0[32])
                continue;
            goto LABEL_c3e84c;
        }
        while (1)
        {
            v11 = (long long)a0[16];
            if ((unsigned long long)(long long)a0[8] <= v11 || *(char *)(v10 + v11) != 112)
                goto LABEL_c3e83c;
            *(unsigned long *)&a0[16] = v11 + 1;
            if (v9 & 1)
            {
                if (!(long long)a0[32])
                    goto LABEL_c3e794;
            }
            else
            {
                if (!(long long)a0[32])
                    goto LABEL_c3e794;
            }
            if (sub_be7850() & 1)
                return 1;
LABEL_c3e794:
            if (!*(long long *)a0)
                break;
            sub_c3b8ac(&v0, a0);
            if (!*(unsigned long long *)&v0)
            {
                v13 = *(char *)((void*)&v0 + 8);
                if ((long long)a0[32])
                {
                    v14 = arm64g_calculate_condition(19, v13 & 0xff, 0, 0);
                    if (sub_be7850())
                        return 1;
                }
                *(unsigned long long *)a0 = 0;
                *(char *)&a0[8] = v13;
                return 0;
            }
            v2 = v0;
            v3 = v1;
            if ((long long)a0[32] && (sub_c3bac4(&v2) & 1 || (long long)a0[32] && sub_be7850((long long)a0[32], " = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 3) & 1))
                goto LABEL_c3e8b8;
            if (*(long long *)a0 && !(v12 = (long long)a0[16], (unsigned long long)(long long)a0[8] <= v12 || *(char *)(*(long long *)a0 + v12) != 75))
            {
                *(unsigned long *)&a0[16] = v12 + 1;
                if (sub_c3c6a0(a0, 0) & 1)
                    return 1;
            }
            else if (sub_c3bf6c(a0) & 1)
            {
                return 1;
            }
            v10 = *(long long *)a0;
            v9 = 1;
            if (!v10)
                goto LABEL_c3e840;
        }
        if ((long long)a0[32])
        {
LABEL_c3e84c:
            if (sub_be7850() & 1)
                return 1;
        }
    } while ((v6 = *(long long *)a0, v7 += 1, *(long long *)a0));
    return 0;
}
