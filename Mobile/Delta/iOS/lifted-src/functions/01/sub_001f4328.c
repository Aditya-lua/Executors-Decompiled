/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4328..0x1f4398 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4328_0 {
    char field_0;
} st_1f4328_0;


int sub_1f4328(unsigned long long *a0, unsigned int a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x9
    unsigned int *v4;  // x10
    unsigned long v5;  // x9
    st_1f4328_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f4328_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!(unsigned int)a2)
        return 0;
    v2 = *a0 + a1 * 8;
    while (1)
    {
        v3 = (unsigned int)a2 >> 1;
        v4 = v2 + (v3 & 0xffffffff) * 8;
        if (v4[1] < a3)
        {
            v5 = (unsigned int)v3 + 1;
            v3 = a2 - v5;
            v2 += (v5 & 0xffffffff) * 8;
        }
        else if (a3 >= *v4)
        {
            return 1;
        }
        a2 = v3;
        if (!(unsigned int)a2)
            return 0;
    }
}
