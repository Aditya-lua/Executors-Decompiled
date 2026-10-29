/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3e4d0..0xc3e690 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3e4d0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_c3e4d0_0;

extern long long g_e0eb40;

unsigned long long sub_c3e4d0(st_c3e4d0_0 *a0)
{
    unsigned int v3;  // w8
    unsigned int v4;  // w8
    unsigned long v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0)
    {
        if (a0->field_8 > a0->field_10)
        {
            a0->field_10 = a0->field_10 + 1;
            switch (v3)
            {
            case 78:
                if (*(long long *)((char *)&a0[1].field_0 + 4))
                {
                    if (!(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "!nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 5) & 1))
                        return 0;
                }
                else
                {
                    return 0;
                }
            case 79:
                v4 = a0->field_18 + 1;
                a0->field_18 = v4;
                if (v4 > 500)
                {
                    if (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'", 25) & 1))
                    {
                        a0->field_0 = 0;
                        *(char *)&a0->field_8 = 1;
                        return 0;
                    }
                }
                else
                {
                    if (!(sub_c3e4d0(a0) & 1))
                    {
                        do
                        {
                            if (!a0->field_0)
                                goto LABEL_c3e63c;
                            v5 = a0->field_10;
                            if (a0->field_8 > v5 && *(char *)(a0->field_0 + v5) == 69)
                            {
                                a0->field_10 = v5 + 1;
                                a0->field_18 = a0->field_18 - 1;
                                return 0;
                            }
                        } while ((!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), " | ", 3) & 1)) && !(sub_c3e4d0(a0) & 1));
                    }
                }
            case 82:
                if (!(sub_c3c6a0(a0, 0) & 1) && (!*(long long *)((char *)&a0[1].field_0 + 4) || !(sub_be7850(*(long long *)((char *)&a0[1].field_0 + 4), "..=", 3) & 1)) && !(sub_c3c6a0(a0, 0) & 1))
                    return 0;
                break;
            default:
                goto LABEL_c3e63c;
            }
        }
        else
        {
LABEL_c3e63c:
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
        return *(long long *)((char *)&a0[1].field_0 + 4);
    }
}
