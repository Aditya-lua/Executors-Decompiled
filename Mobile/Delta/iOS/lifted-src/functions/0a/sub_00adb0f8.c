/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadb0f8..0xadb144 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_adb0f8(unsigned long a0, unsigned long a1, long long *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!*a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a6dac4(*a2, 16, "crypto/ui/ui_util.c", 74);
    *a2 = v8;
    if (!v8)
        return 0;
    return 1;
}
