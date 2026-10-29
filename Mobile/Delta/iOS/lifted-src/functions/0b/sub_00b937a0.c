/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb937a0..0xb937e0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b937a0(unsigned long a0, unsigned long long *a1)
{
    unsigned long long *v6;  // x10
    unsigned long long *v7;  // x10
    unsigned long long v0;  // [bp-0x30]
    unsigned long long *v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (*a1 == 12)
        v6 = 0;
    else
        v6 = a1;
    v7 = v6;
    v2 = a1[9];
    v3 = a1[9] + a1[10] * 64;
    v0 = 1;
    v1 = v7;
    sub_b76b48();
    return;
}
