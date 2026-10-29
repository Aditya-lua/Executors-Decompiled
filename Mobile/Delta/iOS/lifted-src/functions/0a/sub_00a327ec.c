/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa327ec..0xa3285c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a3285c;

void sub_a327ec(unsigned long a0, long long *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a04184(*a1);
    sub_a6c2e4(a1[3], "crypto/engine/eng_dyn.c", 144);
    sub_a6c2e4(a1[5], "crypto/engine/eng_dyn.c", 145);
    sub_ad6958(a1[10], &g_a3285c);
    sub_a6c2e4();
    return;
}
