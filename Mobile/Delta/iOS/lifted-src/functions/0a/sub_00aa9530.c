/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa9530..0xaa95a0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_aa9530(void)
{
    long long v2;  // x0
    long long v3;  // x20
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
        return;
    v3 = v2;
    v4 = sub_a7bbe0(v2 + 40);
    sub_a7bbe8(v3 + 40, 0);
    sub_a51ef0(v4);
    sub_a7bbe0(v3 + 48);
    sub_a7bbe8(v3 + 48, 0);
    sub_a51ef0();
    return;
}
