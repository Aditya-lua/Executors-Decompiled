/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xefe0..0xf18c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_efe0_1 {
    char padding_0[20];
    unsigned int field_14;
} st_efe0_1;

typedef struct st_efe0_0 {
    char field_0;
} st_efe0_0;


st_efe0_1 * sub_efe0(void* a0, unsigned long a1)
{
    unsigned long v10;  // x21
    st_efe0_1 *v11;  // x0
    unsigned int v12;  // w8
    st_efe0_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_efe0_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88], Other Possible Types: unsigned int
    char v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    unsigned long v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x60]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = (long long)a0[132];
    v11 = sub_17248();
    while (1)
    {
        v12 = (int)a0[128];
        if (90 >= (int)v12)
        {
            switch (v12)
            {
            case 40:
                if (!(a1 & 1) && v11->field_14 != (int)a0[132])
                {
                    sub_16d40(a0);
                    *(int *)&a0[276] = (int)a0[276];
                    return v11;
                }
                break;
            case 46:
                v7 = (long long)a0[132];
                sub_f8d0(a0);
                sub_2207c(a0, 0, &v7);
                v5 = v10;
                v6 = v4;
                v11 = sub_6148(sub_404c((long long)a0[216], 80), &v5, v11, &v2, &v3, &v7, 46);
                break;
            case 58:
                v11 = sub_22228(a0, v10, v11);
                break;
            default:
                if (v12 != 60)
                {
                    *(int *)&a0[276] = (int)a0[276];
                    return v11;
                }
                goto LABEL_f0b0;
            }
            goto LABEL_f044;
        }
        else
        {
            if (v12 - 278 < 2)
                goto LABEL_f034;
            switch (v12)
            {
            case 91:
                v11 = sub_145a8(a0, v10, v11);
LABEL_f044:
                sub_16844(a0, "expression");
            case 123:
LABEL_f034:
                v11 = sub_146a8(a0, v11, 0);
                goto LABEL_f044;
            default:
                if (v12 != 60)
                {
                    *(int *)&a0[276] = (int)a0[276];
                    return v11;
                }
LABEL_f0b0:
                sub_b1a4(a0 + 96);
                if (v2 != 60)
                {
                    *(int *)&a0[276] = (int)a0[276];
                    return v11;
                }
                v11 = sub_1d628(a0, v10, v11);
                goto LABEL_f044;
            }
        }
    }
}
