/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9588a8..0x958910 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9588a8(long long a0, long long a1, long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
    long long v13;  // x19
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a2)
        return sub_9587c0();
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_af23d8(a2);
    if (!v12)
        return v12;
    v13 = v12;
    if (!sub_9587c0(a0, a1, v13))
    {
        sub_aded90(v13);
        return 0;
    }
    return 1;
}
