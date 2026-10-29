/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ac64..0x4ad28 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_4ac64(unsigned long a0, long long a1, long long a2, unsigned long a3)
{
    long long v8;  // x20
    long long i;  // x22
    unsigned long v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a1;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (a1 != a2)
    {
        i = v8;
        do
        {
            sub_4c714(a3, i);
            a3 = v5 + 40;
            v5 = a3;
            i += 40;
        } while (i != a2);
    }
    v3 = 1;
    sub_4a82c(a0, v8, a2);
    return sub_4dd64(&v0);
}
