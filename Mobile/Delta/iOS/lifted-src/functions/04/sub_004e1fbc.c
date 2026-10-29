/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e1fbc..0x4e21bc (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e1fbc_0 {
    char field_0;
} st_4e1fbc_0;

extern unsigned int g_f00ba0;
extern char g_f00ba8;
extern unsigned int g_f0c948;

long long sub_4e1fbc(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w11
    unsigned int v13;  // w12
    unsigned int v14;  // w10
    unsigned int v15;  // w9
    unsigned int v16;  // w10
    unsigned int v17;  // w9
    unsigned int v18;  // w10
    unsigned int v19;  // w11
    unsigned int v20;  // w10
    unsigned int v21;  // w10
    unsigned int v4;  // w11
    unsigned long v22;  // x0
    unsigned int v5;  // w10
    char v6;  // x10
    unsigned int v8;  // w10
    unsigned int v9;  // w11
    unsigned int v10;  // w12
    unsigned int v11;  // w10
    st_4e1fbc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4e1fbc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v0;
    v3 = v2 + (0xffffffe2 | ~v2) + 30;
    v4 = (v3 ^ -(v2 & 29)) + (v3 & -(v2 & 29)) * 2;
    v5 = ((v4 | v2) ^ -(v4 & v2)) + ((v4 | v2) & -(v4 & v2)) * 2;
    v6 = (((char)v5 | 1) + 1 ^ ((char)~v5 | 1)) + (((char)v5 | 1) + 1 & (char)~v5) * 2 | ~g_f00ba8;
    v8 = (char)v1;
    v9 = (char)v0;
    v10 = (~v8 - (v9 | ~v8) ^ (v9 | v8)) + (~v8 - (v9 | ~v8) & (v9 | v8)) * 2;
    v11 = (v10 ^ -v8) + (v10 & -v8 | v8 & ~v10) * 2;
    v12 = v10 - v9 + (v9 & ~v10) * 2;
    v13 = (v11 ^ -v12) + (v11 & -v12 | v12 & ~v11) * 2;
    v14 = (v11 | v12) + ~((v11 | ~v12) + v12);
    if (((v6 ^ g_f00ba8 + 1) + (v6 & g_f00ba8 + 1) * 2 & 0xff) != (char)v13 + (char)v14 + ((char)v13 + ((char)-v14 | (char)~v13) + ((char)-v14 & (char)~v13)) * 2 + 2)
        return v22;
    v15 = (char)v0;
    v16 = (-(v15 * 2) & 14) + (-v15 ^ 7) + (v15 * 2 & 0xfffffff0);
    v17 = (v16 + (v15 | ~v16) ^ ~(v16 | v15)) + ((v16 | v15) & ~(v16 + (v15 | ~v16))) * 2 | 1;
    g_f00ba8 = ((char)v17 + 1 ^ (char)-v17) + ((char)v17 + 1 & (char)-v17) * 2;
    v18 = (unsigned int)v0;
    v19 = (0xffffff38 & v18 * 2 | 1) - v18;
    v20 = (v19 - v18 + 99 | 0xfffffffe) + v19 - v18 + 99 + ((unsigned int)(0x7fffff9d - v19) & v18) * 2;
    v21 = (unsigned int)(0xfffffffe - v20) | 1;
    g_f0c948 = (v21 ^ v20 + 2) + g_f0c948 + (v21 & v20 + 2) * 2;
    g_f00ba0 = g_f0c948;
    return v22;
}
