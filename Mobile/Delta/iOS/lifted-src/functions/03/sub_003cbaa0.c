/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cbaa0..0x3cbc38 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cbaa0_1 {
    struct st_3cbaa0_1 *field_0;
} st_3cbaa0_1;

typedef struct st_3cbaa0_0 {
    char field_0;
} st_3cbaa0_0;

typedef struct st_3cbaa0_2 {
    unsigned long long field_0;
} st_3cbaa0_2;

extern st_3cbaa0_2 *g_f0b120;

st_3cbaa0_1 ** sub_3cbaa0(uint128_t *a0, st_3cbaa0_1 **a1, st_3cbaa0_1 **a2, st_3cbaa0_1 **a3)
{
    unsigned int v5;  // w0
    unsigned int v6;  // w0
    unsigned long long v7;  // 4118
    st_3cbaa0_1 **v8;  // w8
    st_3cbaa0_1 **v9;  // w0
    st_3cbaa0_1 **v10;  // w0
    unsigned int v11;  // w0
    st_3cbaa0_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_3cbaa0_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x41]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    a0[12] = a0[13];
    v5 = sub_3d706c();
    v6 = sub_3d706c(a0);
    if (v5 == 80)
    {
        v7 = arm64g_calculate_condition(145, v6 - 55, 3, 0);
        if (!(v7 & 1))
        {
            if (a3)
            {
                if (v6 == 54)
                    v8 = (st_3cbaa0_1 **)3;
                else
                    v8 = (st_3cbaa0_1 **)1;
                *(unsigned int *)a3 = (unsigned int)v8;
            }
            v2 = sub_3d706c(a0);
            sub_3d386c(a0, &v2);
            v9 = (st_3cbaa0_1 **)(unsigned int)sub_3d3a38(a0, &v2);
            if (a1)
                *(unsigned int *)a1 = (unsigned int)v9;
            if (v9)
            {
                sub_3d386c(a0, &v2);
                v10 = (st_3cbaa0_1 **)(unsigned int)sub_3d3a38(a0, &v2);
                if (a2)
                    *(unsigned int *)a2 = (unsigned int)v10;
                if (v10)
                {
                    sub_3d386c(a0, &v2);
                    v11 = sub_3d3a38(a0, &v2);
                    if ((int)v11 >= 0x10000)
                    {
                        g_f0b120();
                    }
                    else if (0xff < (int)v11)
                    {
                        return 16;
                    }
                    else
                    {
                        return 8;
                    }
                }
            }
            g_f0b120();
        }
    }
    a0[12] = a0[13];
    return 0;
}
