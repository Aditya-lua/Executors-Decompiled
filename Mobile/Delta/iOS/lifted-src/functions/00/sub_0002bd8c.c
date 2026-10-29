/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2bd8c..0x2be1c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2bd8c_0 {
    unsigned int field_0;
} st_2bd8c_0;


unsigned int * sub_2bd8c(st_2bd8c_0 **a0, unsigned int *a1, long long *a2)
{
    unsigned int *v2;  // x20
    long long len;  // x0
    unsigned int *v4;  // x0
    unsigned int *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[2] <= a0[1])
    {
        v5 = sub_30464(a0);
        a0[1] = v5;
        return (char *)v5 - 32;
    }
    v2 = a0[1];
    *v2 = *a1;
    len = _strlen(*a2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v2 + 2, *a2, len);
    v4 = v2 + 8;
    a0[1] = v4;
    a0[1] = v4;
    return (char *)v4 - 32;
}
