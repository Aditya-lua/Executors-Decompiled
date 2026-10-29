/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9bf30..0xa9bfb0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9bf30(unsigned long a0, unsigned int a1)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long v5;  // x10
    unsigned long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    _strlen();
    v3 = "ENCRYPTED";
    v4 = "MIC-ONLY";
    v5 = "BAD-TYPE";
    if (a1 == 30)
        v5 = "MIC-CLEAR";
    if (a1 == 20)
        v5 = v4;
    if (a1 == 10)
        v5 = v3;
    v0 = v5;
    return sub_9d5b44();
}
