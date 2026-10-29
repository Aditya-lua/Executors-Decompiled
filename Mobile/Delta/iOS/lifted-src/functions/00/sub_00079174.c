/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x79174..0x791f4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_79174_0 {
    char field_0;
} st_79174_0;


unsigned long long sub_79174(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    st_79174_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_79174_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (1499 >= a3)
    {
        return sub_79064() & 0xffffffff;
    }
    else if (a4 & 3)
    {
        return 0xffffffffffffffff;
    }
    else if (0x1000 > a5)
    {
        return 0xffffffffffffffbe;
    }
    else
    {
        return sub_791f4();
    }
}
