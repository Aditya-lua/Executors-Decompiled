/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed3f4..0xbed46c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0eb20;

long long sub_bed3f4(char a0, long long a1)
{
    unsigned long v3;  // x11
    long long v4;  // x12
    long long v5;  // x12
    unsigned long v6;  // x13
    unsigned short v0;  // [bp-0x12]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = 1;
    do
    {
        v5 = v4;
        v6 = (unsigned int)v3 >> 4;
        *((char *)&v0 + v5) = (&g_e0eb20)[v3 & 15];
        v3 = v6;
        v4 = v5 - 1;
    } while ((unsigned int)v3);
    return sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, (char *)&v0 + v5, 3 - (v5 + 1));
}
