/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fabc..0xa7fb0c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a7fabc(long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a3f52c(a0[2]);
    sub_a3f52c(a0[3]);
    sub_a7fbd8(a0);
}
