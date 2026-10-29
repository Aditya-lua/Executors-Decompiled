/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5708..0x1a576c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5708_0 {
    char field_0;
} st_1a5708_0;

long long sub_1a5708(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    long long v5;  // x8
    long long v0;  // [bp-0x30]
    st_1a5708_0 **v1;  // [bp-0x20], Other Possible Types: char
    st_1a5708_0 *v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v5 = a3 - a2;
    if (a3 == a2)
    {
        return a0;
    }
    else if (v5 > (long long)(a1 - a0))
    {
        return a1;
    }
    else
    {
        v0 = v5;
        return sub_1b081c();
    }
}
