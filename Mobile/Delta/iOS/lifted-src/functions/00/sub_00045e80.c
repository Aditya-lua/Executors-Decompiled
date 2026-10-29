/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x45e80..0x45fb8 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_45e80_0 {
    char field_0;
} st_45e80_0;


unsigned long long sub_45e80(long long *a0, unsigned long a1)
{
    void* v5;  // x0
    void* v6;  // x8
    unsigned int v7;  // w9
    unsigned long long v8;  // x0
    st_45e80_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_45e80_0 *v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_3a7e0(a0 + 33, &v2);
    if (!v5)
        return 0xffffffff;
    v6 = v5;
    v7 = (int)v5[8];
    if ((int)v7 > 3)
    {
        if (5 >= (int)v7)
        {
            if (v7 == 4)
            {
                v8 = sub_2b8bc(*a0, (long long)v6[16]);
            }
            else if (v7 == 5)
            {
                v8 = sub_31a20(*a0);
            }
            else
            {
                return 0xffffffff;
            }
        }
        else
        {
            if (v7 == 6)
            {
                v8 = sub_311ec(*a0);
            }
            else if (v7 == 7)
            {
                v8 = sub_2df40(*a0, (long long)v6[16], (int)v6[12]);
            }
            else
            {
                return 0xffffffff;
            }
        }
    }
    else
    {
        if (v7 == 1)
        {
            v8 = sub_3069c(*a0);
        }
        else if (v7 == 2)
        {
            v8 = sub_2b320(*a0, (char)v6[16]);
        }
        else if (v7 == 3)
        {
            v8 = sub_2d54c(*a0);
        }
        else
        {
            return 0xffffffff;
        }
    }
    if (!(v8 >> 31 & 1))
        return v8;
    sub_45808(v2 + 12, "Exceeded constant limit; simplify the code to compile");
}
