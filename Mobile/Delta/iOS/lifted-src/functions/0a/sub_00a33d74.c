/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33d74..0xa33ea0 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a33ea0;
extern long long g_a33eec;
extern long long g_a33fcc;
extern long long g_a34084;

void sub_a33d74(void)
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
    if (sub_a33298() && sub_a332ec(v3, "Software engine support") && sub_a33340(v3, &g_a33ea0) && sub_a356c4(v3, sub_ab386c()) && sub_a352dc(v3, sub_a02234()) && sub_971e40(v3, sub_a19d2c()) && sub_a350b4(v3, sub_9ff2f0()) && sub_9d5210(v3, sub_aa96c8()) && sub_9d521c(v3, &g_a33eec) && sub_9d5228(v3, &g_a33fcc) && sub_a344c0(v3, &g_a34084))
    {
        sub_a36c8c();
        sub_a336c4(v3);
        sub_a330d4(v3);
    }
    sub_a330d4();
    return;
}
