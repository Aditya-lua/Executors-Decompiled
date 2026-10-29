/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50f5f8..0x50f918 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50f5f8_0 {
    char field_0;
} st_50f5f8_0;

extern unsigned short g_f047a8;
extern unsigned short g_f047aa;
extern unsigned short g_f047ac;
extern unsigned short g_f047ae;
extern unsigned short g_f047b0;
extern unsigned short g_f047b2;
extern unsigned short g_f047b4;
extern unsigned short g_f047b6;
extern unsigned long long g_f047b8;

int sub_50f5f8(void)
{
    st_50f5f8_0 *v2;  // x8
    st_50f5f8_0 **v3;  // x9
    unsigned long long v12;  // x12
    unsigned long long v13;  // x10
    unsigned long v14;  // x10
    unsigned long long v15;  // x9
    unsigned short v16;  // x15
    unsigned short v17;  // x10
    unsigned short v18;  // x12
    unsigned short v19;  // x10
    unsigned short v20;  // x12
    unsigned short v21;  // x10
    unsigned long long v4;  // x10
    unsigned short v22;  // x11
    unsigned long long v23;  // x11
    unsigned long long v24;  // x9
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x10
    unsigned long long v9;  // x9
    unsigned long v10;  // x10
    unsigned long long v11;  // x11
    st_50f5f8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_50f5f8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = v1;
    v3 = v0;
    v4 = (v2 ^ -v3) + (v3 & ~v2) * 2 + (v2 & -v3) * 2;
    v5 = (v3 | v2) + (char *)~(st_50f5f8_0 **)((v2 | ~v3) + (char *)v3);
    v6 = v4 + 1 + v5 + (-v5 & ~v4) * 2 + ((-v5 | ~v4) + v4 + 1) * 2;
    v0 = v6 + 15;
    v1 = v6 + 16;
    v7 = 15746984 >> ((char)(((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2 - 1) & 63);
    v8 = v1 + (v0 ^ v1) - (v0 + (v0 + ~v0 * 2 + 1 & v1) * 2);
    v0 = ~((17592849377830416058 & v8 * 2) + (v8 ^ 8796424688915208029)) + ((17592849377830416058 & v8 * 2) + (v8 ^ 8796424688915208029)) * 2;
    v1 = v8 + (9601254605804615025 | ~v8) + (v8 | 9601254605804615025) + 1;
    v9 = (v1 + v0) * ((-v7 ^ 15746984) + (v7 & ~&g_f047a8 | -v7 & 15746984) * 2);
    v10 = v1;
    v11 = v0;
    v12 = v10 - v11 + (v10 + ~v10 * 2 + 1 & v11) * 2;
    v13 = (v11 | v10) - ((v10 | ~v11) + v11) + v12 + ((v10 | ~v11) + v11 - (v11 | v10) + 1 & ~v12) * 2 + (v12 + ((v10 | ~v11) + v11 - (v11 | v10) + 1 | ~v12)) * 2;
    v0 = ~(((v13 + 1) * 2 & 4) + (v13 + 1 ^ 2)) + (((v13 + 1) * 2 & 4) + (v13 + 1 ^ 2)) * 2;
    v1 = v13 + 29;
    v14 = v9 >> (((char)v0 | (char)v1) + ((char)v1 & (char)v0) & 63);
    v15 = v9 - v14 + (v14 & v9 + ~v9 * 2 + 1) * 2;
    g_f047aa = (unsigned short)((~(unsigned int)v15 + (unsigned int)v15 * 2) * 2 - v15) + 2;
    g_f047ac = ((unsigned short)(__ROL__((unsigned int)(v15 >> 16) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v15 >> 16) + 0xffff ^ 1);
    g_f047ae = v15 >> 32;
    g_f047b0 = v15 >> 48;
    v16 = g_f047aa | g_f047a8;
    v17 = -(g_f047aa & g_f047a8);
    g_f047a8 = (v16 ^ v17) + (v16 & v17) * 2;
    v18 = g_f047ac | g_f047b2;
    v19 = ~g_f047b2 - (g_f047ac | ~g_f047b2);
    g_f047b2 = (v19 ^ v18) + (v19 & v18) * 2;
    v20 = g_f047ae | g_f047b4;
    v21 = -(g_f047ae & g_f047b4);
    g_f047b4 = (v20 ^ v21) + (v20 & v21) * 2;
    v22 = -g_f047b0;
    g_f047b6 = (v22 ^ g_f047b6) + (g_f047b0 & ~g_f047b6 | v22 & g_f047b6) * 2;
    v23 = g_f047b8 | v15;
    v24 = ~g_f047b8 - (v15 | ~g_f047b8);
    g_f047b8 = (v23 ^ v24) + (v23 & v24) * 2;
    return 0;
}
