/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x68410..0x68478 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_68410_0 {
    char field_0;
} st_68410_0;

extern long long g_f0d0d8;

long long sub_68410(void)
{
    long long v4;  // w0
    st_68410_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_68410_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (unsigned int)sub_95de6c(64, 0);
    if (!v4)
        return v4;
    sub_95de6c(0, 0);
    sub_95de6c(0x200002, 0);
    return (unsigned int)sub_60b20(&g_f0d0d8, 1, 5);
}
