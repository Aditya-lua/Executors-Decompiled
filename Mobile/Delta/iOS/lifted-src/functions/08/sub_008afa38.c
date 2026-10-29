/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8afa38..0x8afb7c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8afa38_0 {
    char field_0;
} st_8afa38_0;


void* sub_8afa38(void* a0)
{
    unsigned long v9;  // x9
    unsigned long v10;  // x11
    long long v11;  // x8
    unsigned long v12;  // x1
    unsigned long v13;  // x8
    unsigned long long v14;  // x9
    unsigned long v15;  // x8
    st_8afa38_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_8afa38_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x40]
    unsigned long v4;  // [bp-0x40]
    uint128_t v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x30]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v9 = (long long)a0[16];
    v10 = (long long)a0[8];
    v11 = v10 + v9 + (v9 - v10 - (-v10 | v9) + (-v10 & ~v9)) * 2;
    if ((unsigned long long)((long long)a0[24] - *(long long *)a0) <= (unsigned long long)v11)
        return a0;
    sub_ec54(&v2, v11 >> 3, 0, a0);
    if ((unsigned long long)((long long)a0[24] - *(long long *)a0) > v2 + v6 + (v6 - v2 - (-v2 | v6) + (-v2 & ~v6)) * 2)
    {
        v12 = (long long)a0[8];
        v13 = (long long)a0[16];
        sub_159aa4(&v2, v12, (long long)(v13 + v12 + (v13 + (-v12 | ~v13) + (-v12 & ~v13)) * 2 + 2) >> 3);
        v14 = *(long long *)a0;
        v15 = (long long)a0[8];
        *(unsigned long long *)a0 = v2;
        *(unsigned long *)&a0[8] = v3;
        v2 = v14;
        v4 = v15;
        v5 = (int128_t)a0[16];
        *(unsigned long *)&a0[16] = v3 + (unsigned long long)((uint128_t)((int128_t)a0[16]) >> 0) - v4;
        *(unsigned long *)&a0[24] = v6;
    }
    return sub_1089c(&v2);
}
