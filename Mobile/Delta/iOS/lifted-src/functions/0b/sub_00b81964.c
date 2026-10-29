/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb81964..0xb81a2c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b81964_0 {
    char padding_0[16];
    unsigned int field_10;
} st_b81964_0;

extern char g_e0eb50;

long long sub_b81964(unsigned int *a0, st_b81964_0 *a1)
{
    unsigned long v3;  // x8
    unsigned long v4;  // x11
    unsigned long long v5;  // x12
    unsigned long long v6;  // x8
    unsigned long v7;  // x13
    unsigned long v8;  // x11
    unsigned long long v9;  // x12
    unsigned long v10;  // x13
    unsigned long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1->field_10;
    if (v3 >> 25 & 1)
    {
        v8 = *a0;
        v9 = 7;
        do
        {
            v6 = v9;
            v10 = (unsigned int)v8 >> 4;
            *((char *)&v0 + v9) = (&g_e0eb50)[v8 & 15];
            v9 -= 1;
            v8 = v10;
        } while ((unsigned int)v8);
    }
    else if (v3 >> 26 & 1)
    {
        v4 = *a0;
        v5 = 7;
        do
        {
            v6 = v5;
            v7 = (unsigned int)v4 >> 4;
            *((char *)&v0 + v5) = *(char *)((v4 & 15) + 14740256);
            v5 -= 1;
            v4 = v7;
        } while ((unsigned int)v4);
    }
    return sub_be8310(a1, 1, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2, (char *)&v0 + v6, 9 - (v6 + 1));
}
