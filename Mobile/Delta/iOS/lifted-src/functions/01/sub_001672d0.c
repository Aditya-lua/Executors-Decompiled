/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1672d0..0x167360 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1672d0_1 {
    char padding_0[80];
    char field_50;
    char padding_51[3];
    unsigned int field_54;
    char padding_58[8];
    unsigned int field_60;
} st_1672d0_1;

typedef struct st_1672d0_0 {
    char field_0;
} st_1672d0_0;

extern long long g_f01360;

char sub_1672d0(st_1672d0_1 *a0)
{
    unsigned int v4;  // w8
    char v5;  // x20
    st_1672d0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1672d0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&g_f01360);
    v4 = a0->field_54;
    if (v4)
    {
        v5 = 0;
        a0->field_54 = v4 - 1;
        if (v4 == 1 && !(a0->field_50 & 1))
            goto LABEL_167334;
    }
    else if (a0->field_50 & 1)
    {
        v5 = 0;
    }
    else
    {
LABEL_167334:
        v5 = a0->field_60;
        a0->field_60 = 0;
    }
    std::__1::mutex::unlock(&g_f01360);
    return v5;
}
