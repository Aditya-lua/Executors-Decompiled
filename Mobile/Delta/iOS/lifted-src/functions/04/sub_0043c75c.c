/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43c75c..0x43c8c0 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43c75c_0 {
    char field_0;
} st_43c75c_0;

extern unsigned long long g_e80278;

unsigned long long sub_43c75c(unsigned long a0, unsigned long long a1, unsigned long long a2)
{
    st_43c75c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_43c75c_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    st_43c75c_0 **v4;  // [bp-0x50], Other Possible Types: char
    st_43c75c_0 *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    v3 = a1;
    if (a1 == a2)
        return a1;
    v5 = &v4;
    v4 = &v5;
    (g_e80278 - 0x3f07c00)();
}
