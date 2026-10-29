/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c7ff8..0x4c81cc (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c7ff8_0 {
    char field_0;
} st_4c7ff8_0;

extern unsigned int g_f00b20;
extern char g_f00b28;
extern unsigned int g_f0c948;

long long sub_4c7ff8(void)
{
    char v2;  // x10
    unsigned int v12;  // w10
    unsigned int v13;  // w9
    char v14;  // x10
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned long v18;  // x0
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w12
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w12
    unsigned int v10;  // w12
    unsigned int v11;  // w9
    st_4c7ff8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4c7ff8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = ~g_f00b28 | 1;
    v4 = (char)v1;
    v5 = (char)v0;
    v6 = (v4 ^ -v5) + (v4 & -v5 | v5 & ~v4) * 2;
    v7 = (~v6 - (v4 | ~v6) ^ (v6 | v4)) + (~v6 - (v4 | ~v6) & (v6 | v4)) * 2;
    v8 = (v6 | v5) + ~((v5 | ~v6) + v6);
    v9 = v7 + ~v7 * 2 + 1;
    v10 = (v7 ^ -v8) + (v9 + (v7 & -v8) + (v8 | ~v9)) * 2 + 2;
    if (((v2 ^ g_f00b28 + 1) + (v2 & g_f00b28 + 1) * 2 & 0xff) != (char)v10 + (char)((v8 | v7) - (v7 & v8)) + ((char)-((v8 | v7) - (v7 & v8)) & (char)~v10) * 2 + (char)(v10 - ((v8 | v7) - (v7 & v8)) - (v10 | -((v8 | v7) - (v7 & v8)))) * 2)
        return v18;
    v11 = (char)v0;
    v12 = (-(v11 * 2) & 78) + (-v11 ^ 39) + (v11 * 2 & 0xffffffb0);
    v13 = ((v11 | ~v12) + v12 - (v12 | v11) | 0xfffffffe) + (v12 | v11) - ((v11 | ~v12) + v12);
    v14 = -(v13 + 1 | 1);
    g_f00b28 = ((char)v13 + 2 ^ v14) + ((char)v13 + 2 & v14) * 2;
    v15 = ((((unsigned int)v0 & 61 ^ 61) + (unsigned int)v0 ^ -((unsigned int)v0 & 61)) + (((unsigned int)v0 & 61 ^ 61) + (unsigned int)v0 & -((unsigned int)v0 & 61)) * 2 | (unsigned int)v0) - ((((unsigned int)v0 & 61 ^ 61) + (unsigned int)v0 ^ -((unsigned int)v0 & 61)) + (((unsigned int)v0 & 61 ^ 61) + (unsigned int)v0 & -((unsigned int)v0 & 61)) * 2 & (unsigned int)v0);
    v16 = v15 + (~v15 | 0xfffffffe);
    v17 = (unsigned int)(0xfffffffd - v16) | 1;
    g_f0c948 = (v17 ^ v16 + 3) + g_f0c948 + (v17 & v16 + 3) * 2;
    g_f00b20 = g_f0c948;
    return v18;
}
