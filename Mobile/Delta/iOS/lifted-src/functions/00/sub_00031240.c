/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31240..0x3131c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31240_1 {
    int field_0;
} st_31240_1;

typedef struct st_31240_0 {
    char field_0;
} st_31240_0;

extern char g_1000000;

int sub_31240(st_31240_1 **a0)
{
    int *v4;  // x19
    long long index;  // x20
    unsigned long v14;  // x8
    long long i;  // x21
    int v7;  // w0
    unsigned int v8;  // w8
    unsigned long v9;  // x9
    long long v10;  // x10
    unsigned int v11;  // w8
    long long idx;  // x11
    unsigned int v13;  // w13
    st_31240_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_31240_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[9];
    if (a0[10] == v4)
        return &g_1000000;
    index = 0;
    i = (long long)(a0[10] - v4) >> 2;
    v7 = (int)&g_1000000;
    do
    {
        v8 = v4[index];
        v9 = v7;
        v10 = index + v9;
        if ((unsigned long long)v10 < (unsigned long long)index)
            v10 = index;
        v11 = v8;
        idx = index;
        do
        {
            if (v10 != idx)
            {
                v13 = v4[idx];
                if ((int)v13 < (int)v8)
                    v8 = v13;
                if ((int)v13 >= (int)v11)
                    v11 = v13;
                if (0x100 <= (int)(v11 - v8))
                {
                    v10 = idx;
                    goto LABEL_312e8;
                }
            }
            else
            {
LABEL_312e8:
                v14 = v10 - index;
                if (v9 > v14)
                {
                    v7 = 1 << ((char)sub_30814(v14) & 31);
                    break;
                }
            }
        } while ((idx += 1, (unsigned long long)idx < (unsigned long long)i));
        index += v7;
    } while ((unsigned long long)i > (unsigned long long)index);
    return v7;
}
