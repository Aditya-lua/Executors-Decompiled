/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958170..0x9581bc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f08378;
extern unsigned int g_f1278c;

int sub_958170(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f08378 = sub_a6a3e8(5, 0, "SSL for verify callback", 0, 0, 0);
    g_f1278c = ~g_f08378 >> 31;
    return g_f08378;
}
