/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbef158..0xbef1c8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0eb50;

long long sub_bef158(unsigned long long i, long long a1)
{
    unsigned long long v3;  // x11
    unsigned long long v4;  // x8
    unsigned long long v5;  // x0
    uint128_t v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 15;
    do
    {
        v4 = v3;
        v5 = i >> 4;
        *((char *)&v0 + v4) = (&g_e0eb50)[i & 15];
        v3 = v4 - 1;
        i = v5;
    } while (i);
    return sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, (char *)&v0 + v4, 0x11 - (v4 + 1));
}
