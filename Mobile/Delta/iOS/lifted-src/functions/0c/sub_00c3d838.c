/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d838..0xc3d8e8 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c3d838(unsigned long long *a0)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x19
    unsigned long v4;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!*a0)
        return 0;
    v3 = 0;
    do
    {
        v4 = a0[2];
        if (a0[1] > v4 && *(char *)(v2 + v4) == 69)
        {
            a0[2] = v4 + 1;
            return 0;
        }
        if (v3 && a0[4] && sub_be7850(a0[4], ", Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1)
            return 1;
        if (sub_c3c6a0(a0, 1) & 1)
            return 1;
        v3 += 1;
        v2 = *a0;
    } while (*a0);
    return 0;
}
