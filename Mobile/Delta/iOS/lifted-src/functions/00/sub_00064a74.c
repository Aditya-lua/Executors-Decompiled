/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64a74..0x64b34 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64a74_0 {
    char field_0;
} st_64a74_0;


long long sub_64a74(long long a0, long long a1, char *a2, char *a3)
{
    long long v5;  // x19
    char *v6;  // x22
    char *v7;  // x8
    long long v8;  // x0
    st_64a74_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_64a74_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x31]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0;
    v1 = &v0;
    v0 = &v1;
    v6 = a3 - a2;
    if (a3 == a2)
        return v5;
    v7 = a1 - v5;
    if (v6 > v7)
        return a1;
    v2 = *a2;
    while (1)
    {
        v8 = sub_ca18(v5, v7 - v6 + 1, &v2);
        if (!v8)
        {
            return a1;
        }
        else if (!_memcmp())
        {
            return v8;
        }
        else
        {
            v5 = v8 + 1;
            v7 = a1 - v5;
            if (v6 > v7)
                return a1;
        }
    }
}
