/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b378..0x1b464 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1b378(long long a0, long long a1, unsigned long a2)
{
    unsigned long long v9;  // x21
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x90]
    unsigned long v1;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    unsigned long v4;  // [bp-0x70]
    char v5;  // [bp-0x68]
    char v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 0;
    v4 = 0;
    sub_9f8c(&v5, &v3, a1);
    sub_b814(&v5);
    sub_b814(a0 + 128);
    v9 = sub_a0c8(&v6);
    v10 = sub_a0c8(&v5);
    if (a2)
    {
        v1 = a2;
        v2 = v10;
        v0 = v9;
        sub_1db64(a0, a0 + 132, "Expected %s when parsing %s, got %s");
    }
    else
    {
        v0 = v9;
        v1 = v10;
        sub_1db64(a0, a0 + 132, "Expected %s, got %s");
    }
    return &v6;
}
