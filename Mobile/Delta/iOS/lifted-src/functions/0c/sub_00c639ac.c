/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc639ac..0xc639ec (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_c639ac(char *a0, long long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!(*a0 & 1))
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a6ed4c(a1 + 64);
    *a0 = *a0 & 254;
    *(unsigned long long *)a2 = 0;
    return v8;
}
