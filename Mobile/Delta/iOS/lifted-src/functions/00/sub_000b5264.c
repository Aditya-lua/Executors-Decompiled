/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5264..0xb52f4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5264_0 {
    char field_0;
} st_b5264_0;

unsigned long long sub_b5264(unsigned long a0, long long a1, unsigned long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v4;  // x0
    st_b5264_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_b5264_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_b510c();
    if (a3 == a4)
    {
        return v4;
    }
    else if (a2 - v4 == a3)
    {
        return sub_b510c(a0 + -v4, a1, a5, a4) + v4;
    }
    else
    {
        return v4;
    }
}
