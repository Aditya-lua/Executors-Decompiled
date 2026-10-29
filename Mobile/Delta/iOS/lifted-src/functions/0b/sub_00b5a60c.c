/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a60c..0xb5a6c4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_b5a60c(long long *a0)
{
    long long *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b5a528(*a0);
    if (!v2)
        return v2;
    if (sub_afe694(a0[3], a0[4], v2 + 3, v2 + 4) && sub_afe694(a0[1], a0[2], v2 + 1, v2 + 2) && sub_afe05c(v2 + 5, a0 + 5))
        return v2;
    sub_afe028(v2 + 5);
    sub_a6c2e4(v2[3], "providers/implementations/kdfs/pvkkdf.c", 59);
    sub_a6c4e8(v2[1], v2[2], "providers/implementations/kdfs/pvkkdf.c", 60);
    sub_a66ec0(v2, 64);
    sub_a6c2e4(v2, "providers/implementations/kdfs/pvkkdf.c", 70);
    return 0;
}
