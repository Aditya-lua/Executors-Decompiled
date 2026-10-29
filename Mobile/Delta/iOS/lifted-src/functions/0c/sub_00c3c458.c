/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3c458..0xc3c5c8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3c458(void* a0)
{
    unsigned long v5;  // x8
    unsigned long long v6;  // x22
    unsigned long v7;  // x10
    unsigned long v8;  // x9
    unsigned int v9;  // w8
    unsigned long long v10;  // w21
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4107
    unsigned long long v13;  // 4107
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x3f]
    long long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *(long long *)a0;
    if (!v5)
        return 0;
    v6 = 0;
    do
    {
        v7 = (long long)a0[8];
        v8 = (long long)a0[16];
        if (v7 > v8 && *(char *)(v5 + v8) == 69)
        {
            *(unsigned long *)&a0[16] = v8 + 1;
            return 0;
        }
        if (v6 && (long long)a0[32])
        {
            if (sub_be7850((long long)a0[32], ", Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1)
                return 1;
            v5 = *(long long *)a0;
            if (!v5)
                goto LABEL_c3c514;
            v7 = (long long)a0[8];
            v8 = (long long)a0[16];
        }
        if (v7 <= v8)
        {
LABEL_c3c514:
            if (sub_c3bf6c(a0) & 1)
                return 1;
            goto LABEL_c3c520;
        }
        v9 = *(char *)(v5 + v8);
        if (v9 != 75)
        {
            if (v9 != 76)
                goto LABEL_c3c514;
            *(unsigned long *)&a0[16] = v8 + 1;
            sub_c3c5c8(&v0, a0);
            if (!(v0 & 1))
            {
                if (sub_c3ccb4(a0, v2) & 1)
                    return 1;
                goto LABEL_c3c520;
            }
            v10 = v1;
            if (!(long long)a0[32])
            {
                *(unsigned long long *)a0 = 0;
                *(char *)&a0[8] = v10;
                return 0;
            }
            v11 = v10 & 0xff;
            if (v10)
            {
                v12 = arm64g_calculate_condition(19, v11, 0, 0);
                if (!(v12 & 1))
                    goto LABEL_c3c5a6;
            }
            else
            {
                v13 = arm64g_calculate_condition(19, v11, 0, 0);
                if (!(v13 & 1))
                {
LABEL_c3c5a6:
                    if (!sub_be7850())
                    {
                        *(unsigned long long *)a0 = 0;
                        *(char *)&a0[8] = v10;
                        return 0;
                    }
                    return 1;
                }
            }
            goto LABEL_c3c5a6;
        }
        *(unsigned long *)&a0[16] = v8 + 1;
        if (sub_c3c6a0(a0, 0) & 1)
            return 1;
LABEL_c3c520:
        v5 = *(long long *)a0;
        v6 -= 1;
    } while (*(long long *)a0);
    return 0;
}
