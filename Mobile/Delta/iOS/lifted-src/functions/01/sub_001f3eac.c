/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3eac..0x1f3f34 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3eac_0 {
    char field_0;
} st_1f3eac_0;


int sub_1f3eac(unsigned long a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    unsigned int *v3;  // x9
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    st_1f3eac_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f3eac_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a2 + 1;
    if (a1[1] <= v2)
        return 0;
    v3 = *a1 + 40 * a2 + 44;
    v4 = 1;
    while (1)
    {
        v5 = v4;
        if (*(int *)((char *)v3 - 4) == 3)
        {
            if (*v3 == 59)
            {
                v5 = v4 - 1;
                if (v4 == 1)
                    return v2;
            }
            else if (*v3 != 58)
            {
                v5 = v4;
            }
            else
            {
                v5 = v4 + 1;
            }
        }
        v2 += 1;
        v3 += 10;
        v4 = v5;
        if (a1[1] == v2)
            return 0;
    }
}
