/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc49c..0xbc548 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bc49c_2 {
    unsigned int field_0;
} st_bc49c_2;

typedef struct st_bc49c_1 {
    struct st_bc49c_2 *field_0;
    char padding_8[56];
    unsigned int field_40;
    char padding_44[12];
    unsigned int field_50;
    char padding_54[12];
    unsigned int field_60;
} st_bc49c_1;

typedef struct st_bc49c_0 {
    char field_0;
} st_bc49c_0;


long long sub_bc49c(char *a0, unsigned long a1, st_bc49c_1 *a2, unsigned long long a3)
{
    unsigned long v2;  // x8
    unsigned int v3;  // w9
    unsigned int v4;  // w11
    unsigned int v5;  // w10
    unsigned int v6;  // w10
    unsigned long v7;  // x9
    unsigned int v8;  // w10
    unsigned long v9;  // x9
    st_bc49c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_bc49c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a2->field_60 == 2)
    {
        return 0x800;
    }
    else if (a2->field_50 == 1)
    {
        return 0x600;
    }
    else
    {
        v2 = a2->field_40;
        v3 = (unsigned int)v2 - 0x100;
        v4 = *(int *)&a2->field_0[*a0] + 1;
        if (!(v4 * 0x100000000))
            v5 = 32;
        else
            v5 = Clz(v4 * 0x100000000);
        if (a3)
        {
            v6 = (v4 * 0x100 >> ((char)~v5 & 31)) + (31 - v5) * 0x100;
            if (v6 < v3)
                v7 = v6;
            else
                v7 = v3;
            return v2 - v7;
        }
        else
        {
            v8 = 0x1f00 - v5 * 0x100;
            if (v8 < v3)
                v9 = v8;
            else
                v9 = v3;
            return v2 - v9;
        }
    }
}
