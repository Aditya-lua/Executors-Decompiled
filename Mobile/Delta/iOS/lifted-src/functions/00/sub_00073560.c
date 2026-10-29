/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73560..0x736ac (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73560_0 {
    char padding_0[496];
    long long field_1f0;
} st_73560_0;

typedef struct st_73560_1 {
    char field_0;
} st_73560_1;

extern long long g_f0d180;

long long sub_73560(st_73560_0 *a0, long long a1, long long a2, long long a3, long long a4)
{
    long long v7;  // x21
    unsigned long long v8;  // x22
    char v9;  // x0
    st_73560_1 **v0;  // [bp-0x60], Other Possible Types: char
    st_73560_1 *v1;  // [bp-0x58]
    long long v2;  // [bp-0x50]
    long long v3;  // [bp-0x49]
    unsigned long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a2;
    v1 = &v0;
    v0 = &v1;
    v8 = sub_6b08(a2);
    if (a1 != 4 && a3)
    {
        v9 = sub_71508(a0->field_1f0, v7, &a0[1].padding_0[8]);
        if (a1)
        {
            v4 = v8;
            v3 = v9 ^ 1;
            v2 = a1;
        }
        else if (sub_6bb1c(&a0[1].padding_0[8]))
        {
            v4 = v8;
            v3 = v9 ^ 1;
            v2 = 0;
        }
        else
        {
            return sub_74f58(a0, 1007, &g_f0d180, 0, 0);
        }
        v7 = &a0[1].padding_0[8];
    }
    else
    {
        if (a1)
        {
            v4 = v8;
            v3 = 0;
            v2 = a1;
        }
        else if (sub_6bb1c(v7))
        {
            v4 = v8;
            v3 = 0;
            v2 = 0;
        }
        else
        {
            return sub_74f58(a0, 1007, &g_f0d180, 0, 0);
        }
    }
    return sub_74cd0(a4, v7, &v4, &v3, &v2);
}
