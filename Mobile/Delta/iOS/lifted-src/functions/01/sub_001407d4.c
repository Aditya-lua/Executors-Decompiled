/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1407d4..0x140874 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1407d4_0 {
    char field_0;
} st_1407d4_0;

extern char g_1000188;

unsigned long long sub_1407d4(unsigned long long a0)
{
    unsigned long long v4;  // x21
    unsigned long long v5;  // x21
    unsigned long long v6;  // x0
    unsigned long long *v7;  // x8
    st_1407d4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1407d4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0 < 0xfffffffffffffff)
        v4 = a0;
    else
        v4 = 0xfffffffffffffff;
    if ((long long)a0 < 1)
    {
        *v7 = 0;
        v7[1] = v4;
        return 0;
    }
    while (1)
    {
        v5 = v4;
        v6 = operatornew(v5 * 8, &g_1000188);
        if (v6)
            break;
        v4 = v5 >> 1;
        if (2 > v5)
        {
            v6 = 0;
            v5 = v4;
            break;
        }
    }
    *v7 = v6;
    v7[1] = v5;
    return (unsigned int)v6;
}
