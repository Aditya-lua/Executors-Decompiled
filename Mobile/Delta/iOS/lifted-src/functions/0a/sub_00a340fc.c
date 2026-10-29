/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa340fc..0xa341c0 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a34284;
extern long long g_a3431c;
extern unsigned long long g_f12838;

unsigned long long sub_a340fc(void)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12838)
        return g_f12838;
    v2 = sub_a3ac18(5, 1, 16);
    if (!v2 || (v3 = v2, !sub_a3ac74() || !sub_a3ac90(v3, 8) || !sub_a3acc8(v3, &g_a34284) || !sub_a3ace4(v3, &g_a3431c) || !sub_a3acac(v3, 274)))
    {
        sub_a3ac5c();
        v3 = 0;
    }
    g_f12838 = v3;
    return v3;
}
