/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fb4dc..0x1fb59c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fb4dc_0 {
    char field_0;
} st_1fb4dc_0;


char sub_1fb4dc(unsigned long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long v6;  // x0
    char v7;  // w9
    char v8;  // w12
    unsigned long v9;  // x8
    st_1fb4dc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1fb4dc_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v3 = a2 - a1;
    v6 = sub_1fab7c(a0 + 38, &v2);
    if (!v6)
        return 0;
    v7 = *(int *)v6;
    if (!v7)
        return 0;
    v8 = 1;
    while (1)
    {
        v9 = *(int *)(v6 + v8 * 4);
        v8 += 1;
        if ((unsigned int)(a0[26] - a0[25] >> 3) * 2863311531 <= (unsigned int)v9)
        {
            if (v7 < v8)
                return v9;
        }
        else
        {
            if (v7 < v8 || *(char *)(a0[25] + (unsigned int)v9 * 24 + 16) & 1)
                break;
        }
    }
    return v9;
}
