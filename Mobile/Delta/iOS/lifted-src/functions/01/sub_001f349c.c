/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f349c..0x1f35c4 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f349c_1 {
    unsigned long long field_0;
    unsigned int field_4;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
} st_1f349c_1;

typedef struct st_1f349c_0 {
    char field_0;
} st_1f349c_0;


unsigned long long sub_1f349c(unsigned long long *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v4;  // x19
    st_1f349c_1 *v5;  // x23
    unsigned long long v6;  // w9
    unsigned long long v7;  // x8
    unsigned int v8;  // w8
    unsigned long long v9;  // x0
    st_1f349c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f349c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 <= a1)
        return 0;
    v4 = 0;
    while (1)
    {
        v5 = *a0 + 40 * a1;
        v6 = (int)v5->field_0;
        if (v6 == 3)
        {
            switch (v8)
            {
            case 43:
                v7 = (unsigned long long)v5->padding_10;
                break;
            case 64:
                v9 = sub_1f3a14(v5);
                if (!sub_1fd084(*a0 + 40 * a1 + 40 * v9))
                    return 1;
                goto LABEL_1f3580;
            case 124:
                return 1;
            default:
LABEL_1f3580:
                if (v5->padding_10 <= (long long)v5->field_18)
                    v4 &= 0xffffffff;
                else
                    v4 = 0xffffffff;
                v7 = 1;
                break;
            }
        }
        else if (v6 != 4)
        {
            v7 = 1;
            if (v6 - 15 < 2)
                return 1;
        }
        else
        {
            if (!v5->field_4 && !sub_1fd084(v5[2].padding_10))
                return 1;
            if (v5->padding_10 <= (long long)v5->field_18)
                v4 &= 0xffffffff;
            else
                v4 = 0xffffffff;
            v7 = 3;
        }
        a1 += v7;
        if (a2 <= a1)
            return v4;
    }
}
