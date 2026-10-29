/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105d20..0x105de8 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105d20_1 {
    char field_0;
    char padding_1[2];
    char field_3;
    char padding_4[36];
    long long field_28;
    char padding_30[16];
    long long field_40;
} st_105d20_1;

typedef struct st_105d20_0 {
    char field_0;
} st_105d20_0;


int sub_105d20(long long *a0, st_105d20_1 *a1)
{
    unsigned long v6;  // x22
    unsigned long v7;  // x24
    unsigned long iter;  // x22
    st_105d20_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_105d20_0 *v1;  // [bp-0x58]
    st_105d20_1 *v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_0 != 10)
    {
        return 0;
    }
    else if (a1->field_3 == 1)
    {
        v6 = a1->field_40;
        v7 = a1->field_28;
        if (v6 == a1->field_28)
            return 0;
        iter = v6;
        do
        {
            if (sub_1048e4(*a0, v6))
            {
                v2 = a1;
                v3 = 12297829382473034411 * ((long long)(iter - v7) >> 4);
                sub_15cac(a0[1], &v2);
                v7 = a1->field_28;
            }
        } while ((v6 -= 48, iter -= 48, v6 != v7));
        return 0;
    }
    else
    {
        return 0;
    }
}
