/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4bf4..0x1f4d6c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4bf4_0 {
    char field_0;
} st_1f4bf4_0;


unsigned long long sub_1f4bf4(long long a0, unsigned int **a1, unsigned int *a2)
{
    unsigned int *v5;  // x8
    unsigned long long v6;  // x0
    unsigned int *v7;  // x8
    unsigned long long v8;  // x0
    unsigned int *v9;  // x8
    unsigned int v10;  // w0
    st_1f4bf4_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_1f4bf4_0 *v1;  // [bp-0x40]
    unsigned int *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = *a1;
    if (v5 == a2)
    {
        return 0xffffffff;
    }
    else if (*v5 == 123)
    {
        *a1 = v5 + 1;
        v6 = sub_1f07f8();
        v7 = *a1;
        if (v7 == a2)
        {
            return 0xffffffff;
        }
        else if (*v7 == 125)
        {
            *a1 = v7 + 1;
            return v6;
        }
        else
        {
            return 0xffffffff;
        }
    }
    else
    {
        v8 = sub_1f07f8();
        if (((unsigned int)v8 & 0xfffffc00) != 0xd800)
            return v8;
        v9 = *a1;
        if (a2 < v9 + 6)
        {
            return v8;
        }
        else if (*v9 != 92)
        {
            return v8;
        }
        else if (v9[1] == 117)
        {
            v2 = v9 + 2;
            v10 = sub_1f07f8(a0, &v2, a2, 16, 4, 4, 0xffff);
            if ((v10 & 0xfffffc00) != 0xdc00)
                return v8;
            *a1 = v2;
            return v10 + (unsigned int)v8 * 0x400 + 0xfca02400;
        }
        else
        {
            return v8;
        }
    }
}
