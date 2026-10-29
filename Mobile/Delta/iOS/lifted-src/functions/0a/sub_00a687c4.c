/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa687c4..0xa6895c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a687c4(long long a0, void* a1)
{
    unsigned int v4;  // w8
    unsigned long v5;  // x21
    unsigned int v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (int)a1[8];
    if (1 < v4)
        v5 = v4;
    else
        v5 = 1;
    if (!v4)
        v4 = 22;
    if ((int)v4 < (int)v5)
        return 1;
    v0 = 0;
    sub_a7a468(a0, v5, &v0);
    v1 = 0;
    (long long)a1[24]();
}
