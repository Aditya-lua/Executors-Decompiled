/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed6a0..0xbed91c (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bed6a0_0 {
    unsigned short field_0;
    unsigned short field_2;
    char padding_4[4];
    unsigned long long field_8;
} st_bed6a0_0;

typedef struct st_bed6a0_2 {
    char padding_0[24];
    struct st_bed6a0_3 *field_18;
} st_bed6a0_2;

typedef struct st_bed6a0_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_bed6a0_0 *field_10;
    unsigned long long field_18;
} st_bed6a0_1;

typedef struct st_bed6a0_3 {
    unsigned long long field_0;
} st_bed6a0_3;


int sub_bed6a0(unsigned long a0, st_bed6a0_2 *a1, st_bed6a0_1 *a2)
{
    st_bed6a0_0 *v4;  // x8
    st_bed6a0_0 *v5;  // x27
    st_bed6a0_0 *v6;  // x8
    unsigned int v7;  // w9
    st_bed6a0_0 *v8;  // x27
    unsigned int v9;  // w8
    unsigned long v10;  // x11
    unsigned long v11;  // x2
    char *v12;  // x9
    unsigned int v13;  // w10
    char v0;  // [bp-0x68], Other Possible Types: unsigned int
    char v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a2->field_8)
    {
        a1->field_18();
    }
    else if (a2->field_18)
    {
        v4 = a2->field_10;
        v5 = v4;
        v6 = v4;
        while (1)
        {
            v7 = v5->field_0;
            v8 = &v5[1].field_8;
            if (v7)
                break;
            if (v6->field_8 >= 65)
            {
                a1->field_18();
            }
            else if (!v6->field_8)
            {
                v5 = v8;
                v6 = v8;
                if (v5 == (char *)v4 + 24 * a2->field_18)
                    return 0;
            }
            else
            {
                a1->field_18();
            }
        }
        if (v7 != 1)
            a1->field_18();
        v9 = v6->field_2;
        v1 = 0;
        v0 = 0;
        if (!v9)
        {
            v0 = (char)v9 | 48;
            a1->field_18();
        }
        v10 = (v9 + 0x5fff6 & v9 + 0x7ff9c ^ v9 + 916504 & v9 + 514288) >> 0x11;
        v11 = v10 + 1;
        v12 = (char *)&v0 + v10;
        v13 = 52429 * v9 >> 19;
        *v12 = (char)(v9 - 10 * v13) | 48;
        if (v10)
        {
            *(v12 - 1) = (char)(v13 - 10 * (6554 * v13 >> 16)) | 48;
            if (v11 != 2)
            {
                *(v12 - 2) = (char)((5243 * (v9 >> 2) >> 0x11) - 10 * (6554 * (5243 * (v9 >> 2) >> 0x11) >> 16)) | 48;
                if (v11 != 3)
                {
                    *(v12 - 3) = (char)((8389 * (v9 >> 3) >> 20) - 10 * (6554 * (8389 * (v9 >> 3) >> 20) >> 16)) | 48;
                    if (v11 != 4)
                        *(v12 - 4) = (char)(839 * (v9 >> 4) >> 19) | 48;
                }
            }
        }
        a1->field_18();
    }
    else
    {
        return 0;
    }
}
