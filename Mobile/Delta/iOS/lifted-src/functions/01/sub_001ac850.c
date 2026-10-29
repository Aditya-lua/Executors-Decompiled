/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac850..0x1aca30 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac850_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[23];
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[7];
    unsigned long long field_48;
    unsigned long long field_50;
    char field_58;
} st_1ac850_1;

typedef struct st_1ac850_0 {
    char field_0;
} st_1ac850_0;


unsigned int sub_1ac850(long long a0, long long a1, long long a2, st_1ac850_1 *a3, unsigned int a4)
{
    unsigned long v4;  // x22
    long long v5;  // x23
    unsigned long long v6;  // x8
    unsigned long v7;  // x8
    st_1ac850_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1ac850_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a4 & 128))
        v4 = a4;
    else
        v4 = a4 & 0xffa;
    sub_1b0298();
    if (sub_1b2da4(a0, a1, a2, a3, v4, !((unsigned int)v4 & 0x800)))
    {
        v6 = *(long long *)sub_1bc4cc(a3, 0);
        a3->field_38 = v6;
        a3->field_40 = a3->field_30 != v6;
        v7 = *(long long *)(sub_1bc4cc(a3, 0) + 8);
        a3->field_48 = v7;
        a3->field_58 = v7 != a3->field_50;
        return 1;
    }
    if (a1 != a2 && !(v4 >> 6 & 1))
    {
        v5 = a1 + 1;
        if (v5 != a2)
        {
            do
            {
                sub_1a7d34(a3, 12297829382473034411 * ((long long)(a3->field_8 - a3->field_0) >> 3), &a3->field_18);
                if (sub_1b2da4(a0, v5, a2, a3, (unsigned int)v4 | 128, 0))
                {
                    v6 = *(long long *)sub_1bc4cc(a3, 0);
                    a3->field_38 = v6;
                    a3->field_40 = a3->field_30 != v6;
                    v7 = *(long long *)(sub_1bc4cc(a3, 0) + 8);
                    a3->field_48 = v7;
                    a3->field_58 = v7 != a3->field_50;
                    return 1;
                }
            } while ((sub_1a7d34(a3, 12297829382473034411 * ((long long)(a3->field_8 - a3->field_0) >> 3), &a3->field_18), v5 += 1, v5 != a2));
        }
        sub_1a7d34(a3, 12297829382473034411 * ((long long)(a3->field_8 - a3->field_0) >> 3), &a3->field_18);
        if (sub_1b2da4(a0, v5, a2, a3, (unsigned int)v4 | 128, 0))
        {
            v6 = *(long long *)sub_1bc4cc(a3, 0);
            a3->field_38 = v6;
            a3->field_40 = a3->field_30 != v6;
            v7 = *(long long *)(sub_1bc4cc(a3, 0) + 8);
            a3->field_48 = v7;
            a3->field_58 = v7 != a3->field_50;
            return 1;
        }
    }
    sub_c84c(a3, a3->field_0);
    return 0;
}
