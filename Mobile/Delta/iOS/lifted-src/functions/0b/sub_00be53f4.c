/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe53f4..0xbe54b4 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be53f4_0 {
    char padding_0[16];
    unsigned int field_10;
} st_be53f4_0;

extern char g_e0eb50;

long long sub_be53f4(unsigned long a0, st_be53f4_0 *a1)
{
    unsigned long v3;  // x8
    unsigned long long j;  // x9
    unsigned long long v5;  // x12
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long i;  // x9
    unsigned long long v9;  // x12
    unsigned long long v10;  // x9
    uint128_t v0;  // [bp-0x20]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1->field_10;
    if (v3 >> 25 & 1)
    {
        i = *(long long *)a0;
        v9 = 15;
        do
        {
            v6 = v9;
            v10 = i >> 4;
            *((char *)&v0 + v6) = (&g_e0eb50)[i & 15];
            v9 = v6 - 1;
            i = v10;
        } while (i);
    }
    else if (v3 >> 26 & 1)
    {
        j = *(long long *)a0;
        v5 = 15;
        do
        {
            v6 = v5;
            v7 = j >> 4;
            *((char *)&v0 + v6) = *(char *)((j & 15) + 14740256);
            v5 = v6 - 1;
            j = v7;
        } while (j);
    }
    return sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, (char *)&v0 + v6, 0x11 - (v6 + 1));
}
