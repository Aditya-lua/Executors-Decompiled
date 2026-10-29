/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6516c..0x651ec (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6516c_0 {
    char field_0;
} st_6516c_0;


unsigned long long sub_6516c(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long a4)
{
    long long v4;  // x19
    long long v5;  // x0
    st_6516c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_6516c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 > a1)
    {
        return 0xffffffffffffffff;
    }
    else if (!a4)
    {
        return a3;
    }
    else
    {
        v4 = a0 + a1;
        v5 = sub_64a74(a0 + a3, v4);
        if (v5 != v4)
            return v5 - a0;
        return 0xffffffffffffffff;
    }
}
