/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac480..0x1ac520 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac480_0 {
    char field_0;
} st_1ac480_0;


int sub_1ac480(long long a0, unsigned int *a1)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    st_1ac480_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1ac480_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = _poll();
    if (!(v5 >> 31 & 1))
    {
        return v5;
    }
    else if (*(int *)___error() == 4)
    {
        while (1)
        {
            v2 = 1;
            sub_1adc88(&v2);
            v6 = _poll(a0, 1, *a1);
            if (!(v6 >> 31 & 1))
            {
                return v6;
            }
            else if (*(int *)___error() != 4)
            {
                return v6;
            }
        }
    }
    else
    {
        return v5;
    }
}
