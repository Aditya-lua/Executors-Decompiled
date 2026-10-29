/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa31eec..0xa31fc4 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a31fc4;
extern long long g_a31fcc;
extern long long g_a31fd4;
extern long long g_e90ed8;

void sub_a31eec(void)
{
    long long v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a32f34();
    if (!v2)
        return;
    v3 = v2;
    if (sub_a33298() && sub_a332ec(v3, "Dynamic engine loading support") && sub_a3334c(v3, &g_a31fc4) && sub_a33358(v3, &g_a31fcc) && sub_a33364(v3, &g_a31fd4) && sub_a33370(v3, 4) && sub_a3337c(v3, &g_e90ed8))
    {
        sub_a36c8c();
        sub_a336c4(v3);
        sub_a330d4(v3);
    }
    sub_a330d4();
    return;
}
