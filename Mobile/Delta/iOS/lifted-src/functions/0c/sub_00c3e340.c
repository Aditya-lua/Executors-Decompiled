/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3e340..0xc3e4d0 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3e340_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[31];
    unsigned int field_28;
} st_c3e340_0;


unsigned long long sub_c3e340(st_c3e340_0 *a0)
{
    unsigned long long v5;  // w20
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // 4107
    unsigned long long v8;  // 4107
    unsigned long long v9;  // x22
    unsigned long long v10;  // x0
    char v0;  // [bp-0x50], Other Possible Types: unsigned long long
    char v1;  // [bp-0x4f]
    unsigned long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0->field_0)
    {
        sub_c3b814(&v0, a0, 71);
        if (v0 == 1)
        {
            v5 = v1;
            if (*(long long *)&a0->padding_9[23])
            {
                v6 = v5 & 0xff;
                if (v5)
                {
                    v7 = arm64g_calculate_condition(19, v6, 0, 0);
                    if (!(v7 & 1))
                        goto LABEL_c3e3ae;
LABEL_c3e3ad:
                }
                else
                {
                    v8 = arm64g_calculate_condition(19, v6, 0, 0);
                    if (v8 & 1)
                        goto LABEL_c3e3ad;
LABEL_c3e3ae:
                }
                if (sub_be7850() & 1)
                    return 1;
            }
            a0->field_0 = 0;
            a0->field_8 = v5;
            return 0;
        }
        else
        {
            if (*(long long *)&a0->padding_9[23])
            {
                if (v2)
                {
                    if (sub_be7850() & 1)
                        return 1;
                    v9 = 0;
                    while (1)
                    {
                        if (v2 != v9)
                        {
                            if (v9 && *(long long *)&a0->padding_9[23] && sub_be7850(*(long long *)&a0->padding_9[23], ", Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1)
                                break;
                            a0->field_28 = a0->field_28 + 1;
                            v9 += 1;
                            if (sub_c3ccb4(a0, 1) & 1)
                                return 1;
                        }
                        else
                        {
                            if (*(long long *)&a0->padding_9[23])
                            {
                                if (!(sub_be7850(*(long long *)&a0->padding_9[23], "> ", 2) & 1))
                                {
                                    v10 = sub_c3e690(a0);
                                    a0->field_28 = a0->field_28 - v2;
                                    return v10;
                                }
                                break;
                            }
                            else
                            {
                                v10 = sub_c3e690(a0);
                                a0->field_28 = a0->field_28 - v2;
                                return v10;
                            }
                        }
                    }
                    return 1;
                }
                else
                {
                    v10 = sub_c3e690(a0);
                    a0->field_28 = a0->field_28 - v2;
                    return v10;
                }
            }
            else
            {
                return sub_c3e690(a0);
            }
        }
    }
    else if (*(long long *)&a0->padding_9[23])
    {
        return sub_be7850();
    }
    else
    {
        return *(long long *)&a0->padding_9[23];
    }
}
