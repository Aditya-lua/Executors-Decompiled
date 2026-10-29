/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbffd28..0xbffdfc (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bffd28_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    long long field_10;
} st_bffd28_0;

typedef struct st_bffd28_1 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    long long field_18;
    struct st_bffd28_0 *field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    long long field_50;
    char padding_58[8];
    unsigned long long field_60;
} st_bffd28_1;


st_bffd28_1 * sub_bffd28(st_bffd28_1 *a0)
{
    st_bffd28_1 *v2;  // x0
    unsigned long v3;  // x21
    unsigned long long *v4;  // x22
    unsigned long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
        v2 = _free(a0->field_8);
    v3 = a0->field_28;
    if (a0->field_28)
    {
        v4 = &a0->field_20->field_8;
        do
        {
            v5 = v3;
            if ((*((char *)v4 - 8) == 8 || *((char *)v4 - 8) == 5) && *v4)
                v2 = _free(v4[1]);
        } while ((v4 += 4, v3 = v5 - 1, v5 != 1));
    }
    if (a0->field_18)
        v2 = _free(a0->field_20);
    if (a0->field_30)
        v2 = _free(a0->field_38);
    if ((long long)a0->field_48 >= 1)
        v2 = _free(a0->field_50);
    if (a0->field_60 == 0x8000000000000000)
    {
        return v2;
    }
    else if (a0->field_60)
    {
        return _free();
    }
    else
    {
        return v2;
    }
}
