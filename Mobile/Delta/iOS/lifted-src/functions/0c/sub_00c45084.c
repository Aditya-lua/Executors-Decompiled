/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45084..0xc4513c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e0eb50;
extern char g_1000000;

unsigned long long sub_c45084(unsigned long long *a0, void* a1)
{
    unsigned long long i;  // x8
    unsigned long v4;  // x20
    unsigned int v5;  // w9
    unsigned long long v6;  // x12
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    unsigned long long v9;  // x0
    uint128_t v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = *a0;
    v4 = (long long)a1[16];
    if (!(v4 >> 23 & 1))
    {
        v5 = v4;
    }
    else if (!(v4 >> 27 & 1))
    {
        v5 = (unsigned int)v4 | 0x9000000;
        *(unsigned short *)&a1[20] = 18;
    }
    else
    {
        v5 = (unsigned int)v4 | &g_1000000;
    }
    *(unsigned int *)&a1[16] = v5 | 0x800000;
    v6 = 15;
    do
    {
        v7 = v6;
        v8 = i >> 4;
        *((char *)&v0 + v7) = (&g_e0eb50)[i & 15];
        v6 = v7 - 1;
        i = v8;
    } while (i);
    v9 = sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, (char *)&v0 + v7, 0x11 - (v7 + 1));
    *(unsigned long *)&a1[16] = v4;
    return v9;
}
