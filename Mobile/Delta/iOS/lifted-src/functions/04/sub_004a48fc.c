/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a48fc..0x4a4af0 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a48fc_0 {
    char field_0;
} st_4a48fc_0;

extern unsigned int g_f00be0;
extern char g_f00be8;
extern unsigned int g_f0c948;

long long sub_4a48fc(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w11
    unsigned int v13;  // w12
    unsigned int v14;  // w10
    unsigned int v15;  // w9
    unsigned int v16;  // w10
    unsigned int v17;  // w9
    unsigned long v18;  // x0
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    char v6;  // x10
    unsigned int v8;  // w10
    unsigned int v9;  // w11
    unsigned int v10;  // w12
    unsigned int v11;  // w10
    st_4a48fc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4a48fc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v0;
    v3 = ((v2 & 69 ^ 69) + v2 ^ -(v2 & 69)) + ((v2 & 69 ^ 69) + v2 & -(v2 & 69)) * 2;
    v4 = v3 - v2 + (v3 + ~v3 * 2 + 1 & v2) * 2 + 2 & (~(v3 - v2) | 0xfffffffe);
    v5 = (v4 ^ -(v4 - 1 | 1)) + (v4 & -(v4 - 1 | 1)) * 2;
    v6 = (char)v5 + (char)~(v5 | g_f00be8);
    v8 = (char)v1;
    v9 = (char)v0;
    v10 = (v8 ^ -v9) + (v8 & -v9 | v9 & ~v8) * 2;
    v11 = ((v10 | v8) ^ -(v10 & v8)) + ((v10 | v8) & -(v10 & v8)) * 2;
    v12 = v10 - v9 + (v9 & ~v10) * 2;
    v13 = (v11 ^ -v12) + (v11 & -v12 | v12 & ~v11) * 2;
    v14 = (v12 ^ -v11) + ((v12 & -v11) + (v12 + ~v12 * 2 + 1 & v11)) * 2;
    if (((v6 ^ g_f00be8 + 1) + (v6 & g_f00be8 + 1) * 2 & 0xff) == (char)v13 + (char)v14 + ((char)(v13 - v14 - (v13 | -v14)) + ((char)-v14 & (char)~v13)) * 2)
    {
        v15 = (char)v0;
        v16 = (-(v15 * 2) & 50) + (-v15 ^ 25) + (v15 * 2 & 0xffffffcc);
        v17 = ((v16 | v15) ^ -(v16 & v15)) + ((v16 | v15) & -(v16 & v15)) * 2 + 2 & ((v16 | v15) ^ ~-(v16 & v15) | 0xfffffffe);
        g_f00be8 = (((char)-v17 | 1) ^ (char)v17) + (((char)-v17 | 1) & (char)v17) * 2;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00be0 = g_f0c948;
    }
    return v18;
}
