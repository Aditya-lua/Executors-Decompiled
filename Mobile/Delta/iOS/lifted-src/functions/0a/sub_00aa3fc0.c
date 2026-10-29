/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3fc0..0xaa4190 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa3fc0_0 {
    char padding_0[32];
    long long field_20;
} st_aa3fc0_0;

typedef struct st_aa3fc0_1 {
    struct st_aa3fc0_1 *field_0;
    char padding_8[8];
    struct st_aa3fc0_1 *field_10;
    long long field_18;
    struct st_aa3fc0_1 *field_20;
    long long field_28;
    long long field_30;
    char padding_38[8];
    struct st_aa3fc0_1 *field_40;
} st_aa3fc0_1;


st_aa3fc0_1 * sub_aa3fc0(st_aa3fc0_1 *a0)
{
    st_aa3fc0_1 *v2;  // x8
    unsigned long long v3;  // x8
    st_aa3fc0_1 *v12;  // x19
    st_aa3fc0_1 *v13;  // x0
    st_aa3fc0_1 *v14;  // x0
    st_aa3fc0_1 *v4;  // x22
    st_aa3fc0_1 *v5;  // x21
    st_aa3fc0_1 *v6;  // x24
    st_aa3fc0_1 *v7;  // x23
    long long v8;  // x0
    st_aa3fc0_1 *v9;  // x23
    st_aa3fc0_0 *v10;  // x0
    st_aa3fc0_1 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_28;
    if (!a0)
        v2 = 0;
    if (!a0)
    {
        return a0;
    }
    else if (a0->field_20)
    {
        if (sub_a99eac(a0->field_18) == 24)
        {
            v3 = 48;
            goto LABEL_aa4024;
        }
        else
        {
            if (sub_a99eac(a0->field_18) == 23)
            {
                v3 = 8;
LABEL_aa4024:
                v4 = *(long long *)((char *)a0->field_20 + v3);
            }
            else
            {
                v4 = 0;
                v5 = 0;
                v6 = 0;
                if (!a0->field_20)
                    goto LABEL_aa40b0;
            }
            if (sub_a99eac(a0->field_18) == 22 || sub_a99eac(a0->field_18) == 24)
            {
                v5 = a0->field_20->field_20;
LABEL_aa4054:
                if (sub_a99eac(a0->field_18) == 22 || sub_a99eac(a0->field_18) == 24)
                    v6 = a0->field_20->field_10;
                else
                    v6 = 0;
            }
            else
            {
                v5 = 0;
                if (a0->field_20)
                    goto LABEL_aa4054;
                v6 = 0;
            }
        }
LABEL_aa40b0:
        if ((int)sub_ad69e4(v6) >= 1)
        {
            v7 = 0;
            do
            {
                v8 = sub_ad69f8(v6, v7);
                sub_afc420(v8, a0->field_28, a0->field_30);
                v7 = (unsigned int)v7 + 1;
            } while ((int)(unsigned int)v7 < (int)sub_ad69e4(v6));
        }
        if ((int)sub_ad69e4(v4) >= 1)
        {
            v9 = 0;
            do
            {
                v10 = sub_ad69f8(v4, v9);
                sub_afc420(v10->field_20, a0->field_28, a0->field_30);
                v9 = (unsigned int)v9 + 1;
            } while ((int)(unsigned int)v9 < (int)sub_ad69e4(v4));
        }
        v11 = sub_ad69e4(v5);
        if ((int)(unsigned int)v11 < 1)
            return v11;
        v12 = 0;
        do
        {
            v13 = sub_ad69f8(v5, v12);
            if (v13)
                v13->field_40 = v2;
        } while ((v12 = (unsigned int)v12 + 1, v14 = sub_ad69e4(v5), (int)(unsigned int)v14 > (int)(unsigned int)v12));
        return v14;
    }
    else
    {
        return a0;
    }
}
