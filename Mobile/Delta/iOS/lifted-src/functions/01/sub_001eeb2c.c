/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eeb2c..0x1eebe8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eeb2c_0 {
    char field_0;
} st_1eeb2c_0;

extern char g_e73160;

unsigned long long sub_1eeb2c(long long a0, long long a1, unsigned int a2, unsigned long long a3)
{
    long long *v4;  // x22
    unsigned long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned long v7;  // x8
    st_1eeb2c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1eeb2c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(unsigned int)a3)
        return 0;
    v4 = &(&g_e73160)[16 * a2];
    while (1)
    {
        v5 = (unsigned int)a3 >> 1;
        v6 = sub_1f6a4c(a0, a1, *(long long *)((char *)v4 + ((v5 * 16 | v5 >> 60) & 0xffffffff0 & 0xfffffffff)));
        if (v6 >> 31 & 1)
        {
            a3 = v5;
            if (!(unsigned int)a3)
                return 0;
        }
        else if ((unsigned int)v6)
        {
            v7 = (unsigned int)v5 + 1;
            a3 -= v7;
            v4 = &v4[2 * (v7 & 0xffffffff)];
            if (!(unsigned int)a3)
                return 0;
        }
        else
        {
            return (int)v4[1 + 2 * v5];
        }
    }
}
