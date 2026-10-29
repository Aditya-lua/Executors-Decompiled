/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa34364..0xa34458 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a34458;
extern long long g_a3446c;
extern long long g_a34498;
extern long long g_f12830;

long long sub_a34364(void)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12830)
        return g_f12830;
    v2 = sub_a50b24(64, 65);
    if (!v2 || (v3 = v2, !sub_a50c1c() || !sub_a50c00(v3, 64) || !sub_a50c38(v3, 104) || !sub_a3ac90(v3, 0) || !sub_a3acc8(v3, &g_a34458) || !sub_a3ace4(v3, &g_a3446c) || !sub_a50c54(v3, &g_a34498)))
    {
        sub_a50ba0();
        v3 = 0;
    }
    g_f12830 = v3;
    return v3;
}
