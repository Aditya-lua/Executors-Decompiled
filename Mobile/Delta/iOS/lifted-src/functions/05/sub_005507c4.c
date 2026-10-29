/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5507c4..0x5508b4 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5507c4_0 {
    char field_0;
} st_5507c4_0;

extern unsigned long long g_e82960;
extern char g_f04920;

void sub_5507c4(void)
{
    char v4;  // x10
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w10
    st_5507c4_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_5507c4_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = g_f04920 + 1;
    v6 = (char)v1;
    v7 = (char)v0;
    v8 = (~v6 - (v7 | ~v6) ^ (v7 | v6)) + (~v6 - (v7 | ~v6) & (v7 | v6)) * 2;
    v9 = (~v8 - (v6 | ~v8) ^ (v8 | v6)) + (~v8 - (v6 | ~v8) & (v8 | v6)) * 2;
    if (((v4 ^ -(g_f04920 | 1) & 0xff) + (v4 & -(g_f04920 | 1) & 0xff) * 2 & 0xff) != ((unsigned int)((char)v9 + 1 + (v9 | ~(v8 ^ v7)) - (v9 | v8 ^ v7)) + ((char)v9 + 1 + ~v9 * 2 & (v8 ^ v7)) * 2 & 0xff))
        return;
    g_f04920 = 1;
    (g_e82960 - 0x8a471300)();
}
