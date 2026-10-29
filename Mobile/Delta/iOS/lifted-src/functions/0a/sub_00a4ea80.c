/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ea80..0xa4eb1c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a4ea80(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v4;  // x0
    unsigned long v0;  // [bp-0x98]
    long long v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = sub_a7a42c();
    v1 = 0;
    v4 = sub_a4e750(&v0, a0, a1, a2, a3, a4, a5, a6);
    if (!v1)
        return v4;
    sub_aa52b4(v1);
    return v4;
}
