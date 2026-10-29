/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d954..0x4d9e0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d954_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_4d954_0;

typedef struct st_4d954_1 {
    char field_0;
} st_4d954_1;


unsigned long long * sub_4d954(st_4d954_0 *a0, unsigned long long *a1)
{
    unsigned long long *v2;  // x9
    unsigned long long *v3;  // x12
    unsigned long long v4;  // x11
    unsigned long long v5;  // x8
    unsigned long long v6;  // x15
    unsigned long long *v7;  // x8
    st_4d954_1 **v0;  // [bp-0x10], Other Possible Types: char
    st_4d954_1 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0->field_8 - 1;
    v4 = *a1;
    v5 = v4 >> 4 ^ v4 >> 9;
    while (1)
    {
        v6 = v5 & v3;
        v7 = a0->field_0 + 48 * v6;
        if (*v7 == a0->field_18)
        {
            *v7 = v4;
            a0->field_10 = a0->field_10 + 1;
            return v7;
        }
        else if (*v7 != v4)
        {
            v2 = (char *)v2 + 1;
            v5 = (char *)v2 + v6;
            if (v2 > v3)
                return 0;
        }
        else
        {
            return v7;
        }
    }
}
