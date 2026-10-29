/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c70a0..0x3c70fc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c70a0_0 {
    char field_0;
} st_3c70a0_0;


unsigned long long sub_3c70a0(long long a0, long long a1, unsigned long a2)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    st_3c70a0_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_3c70a0_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    v5 = sub_3c7590(&v2);
    if (v5 & 1)
        return v5;
    do
    {
        std::__1::condition_variable::wait(a0, a1);
        v6 = sub_3c7590(&v2);
    } while (!(unsigned int)v6);
    return v6;
}
