/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc73a88..0xc73b38 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_be766c;
extern unsigned long long g_be767c;
extern unsigned long long g_be768c;
extern char g_e080aa;

void sub_c73a88(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v19;  // x30
    unsigned long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    unsigned long long v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    char *v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    char *v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    char *v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    char *v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v16 = &v18;
    v17 = v19;
    v0 = a0;
    v1 = a1;
    v2 = a2;
    v3 = a3;
    v4 = &g_e080aa;
    v5 = 2;
    if (!a4)
    {
        v8 = &v4;
        v9 = &g_be766c;
        v10 = &v0;
        v11 = &g_be768c;
        v12 = &v2;
        v13 = &g_be768c;
    }
    else
    {
        v6 = a4;
        v7 = 61;
        v8 = &v4;
        v9 = &g_be766c;
        v10 = &v6;
        v11 = &g_be767c;
        v12 = &v0;
        v13 = &g_be768c;
        v14 = &v2;
        v15 = &g_be768c;
    }
    13056824();
}
