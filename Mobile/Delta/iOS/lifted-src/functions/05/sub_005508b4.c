/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5508b4..0x550938 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5508b4_0 {
    char field_0;
} st_5508b4_0;

extern unsigned long long g_e82958;
extern char g_f04910;

void sub_5508b4(void)
{
    unsigned int v4;  // w11
    st_5508b4_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_5508b4_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (1 & ~g_f04910) + (g_f04910 ^ 0xfffffffe);
    if ((-((v4 & g_f04910 + 1) * 2) & 254) != ((v4 ^ g_f04910 + 1) & 0xff))
        return;
    g_f04910 = 1;
    (g_e82958 - 0x92087200)();
}
