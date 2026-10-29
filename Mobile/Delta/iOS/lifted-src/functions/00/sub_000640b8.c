/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x640b8..0x64128 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_640b8_1 {
    char padding_0[120];
    long long field_78;
    char padding_80[268];
    long long field_18c;
} st_640b8_1;

typedef struct st_640b8_0 {
    char field_0;
} st_640b8_0;


st_640b8_1 * sub_640b8(st_640b8_1 *a0, long long a1, long long a2)
{
    long long v4;  // w8
    st_640b8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_640b8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2)
    {
        return a0;
    }
    else if (a1)
    {
        return a0;
    }
    else if (*(int *)&(a0->padding_80)[1] == 32)
    {
        if (a0->field_78)
        {
            _setbuf(a0->field_78, 0);
            v4 = 0;
        }
        else
        {
            v4 = 0x22;
        }
        *(int *)&(a0->padding_80)[1] = v4;
        return a0;
    }
    else
    {
        return a0;
    }
}
