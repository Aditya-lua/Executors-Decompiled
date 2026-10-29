/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51d108..0x51d188 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_51d108_0 {
    char field_0;
} st_51d108_0;

extern unsigned long long g_e81ed0;
extern char g_f047f0;

void sub_51d108(void)
{
    unsigned int v4;  // w10
    st_51d108_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_51d108_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = g_f047f0 + 1;
    if ((-((v4 & -(g_f047f0 | 1)) * 2) & 254) != ((v4 ^ -(g_f047f0 | 1)) & 0xff))
        return;
    g_f047f0 = 1;
    (g_e81ed0 - 0x76b39800)();
}
