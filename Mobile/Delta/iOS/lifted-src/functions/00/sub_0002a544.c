/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a544..0x2a60c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a544_0 {
    char field_0;
} st_2a544_0;


long long sub_2a544(unsigned long long *a0, long long a1)
{
    long long v4;  // x22
    unsigned long long v5;  // x0
    long long v6;  // x23
    unsigned long long v7;  // x26
    long long v8;  // x21
    st_2a544_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2a544_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1] - 1;
    v5 = sub_2af88();
    v6 = 0;
    while (1)
    {
        v7 = v5 & v4;
        v8 = *a0 + 268 * v7;
        if (sub_2a4ac(v8, a0 + 3))
        {
            _memcpy(v8, a1, 261);
            a0[2] = a0[2] + 1;
            return v8;
        }
        else if (!sub_2a4ac(v8, a1))
        {
            v6 += 1;
            v5 = v6 + v7;
            if ((unsigned long long)v6 > (unsigned long long)v4)
                return 0;
        }
        else
        {
            return v8;
        }
    }
}
