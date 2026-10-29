/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3c6a0..0xc3ccb4 (1556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3c6a0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_c3c6a0_0;

extern char g_e06cc2;
extern long long g_e0eb40;

unsigned long long sub_c3c6a0(st_c3c6a0_0 *a0, long long a1)
{
    unsigned long v2;  // x8
    unsigned int v3;  // w22
    unsigned int v4;  // w12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        v2 = a0->field_10;
        if (a0->field_8 > v2)
        {
            v3 = *(char *)(a0->field_0 + v2);
            a0->field_10 = v2 + 1;
            v4 = a0->field_18 + 1;
            a0->field_18 = v4;
            if (v4 > 500)
            {
                if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{", 25) & 1))
                {
                    a0->field_0 = 0;
                    *(char *)&a0->field_8 = 1;
                    return 0;
                }
            }
            else
            {
                if (40 >= v3 - 81)
                    goto *((void *)(sub_c3c744 + *(&(&g_e06cc2)[v3] - 81) * 4));
                if (v3 != 65)
                {
                    if (v3 != 66)
                        goto LABEL_c3ca3c;
                    if (!(sub_c3cf30(a0, a1) & 1))
                        goto LABEL_c3c790;
                }
                else
                {
                    if (!(a1 & 1) && *(long long *)((char *)&a0[1].field_0 + 4) && sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
                        return 1;
                    if (*(long long *)((char *)&a0[1].field_0 + 4) && sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "[]::::{closure:#<>& *const ; (,_false", 1) & 1)
                        return 1;
                    if (!(sub_c3d794(a0) & 1))
                    {
                        if (*(long long *)((char *)&a0[1].field_0 + 4))
                        {
                            if (sub_be7850() & 1)
                                return 1;
                            if (!(a1 & 1) && *(long long *)((char *)&a0[1].field_0 + 4) && sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "}.llvm.0", 1) & 1)
                                return 1;
                        }
LABEL_c3c790:
                        if (!a0->field_0)
                            return 0;
                        a0->field_18 = a0->field_18 - 1;
                        return 0;
                    }
                }
            }
        }
        else
        {
LABEL_c3ca3c:
            if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), &g_e0eb40, 16) & 1))
            {
                a0->field_0 = 0;
                *(char *)&a0->field_8 = 0;
                return 0;
            }
        }
        return 1;
    }
    else if (*(long long *)((char *)&a0[1].field_0 + 4))
    {
        return sub_be7850();
    }
    else
    {
        return 0;
    }
}
