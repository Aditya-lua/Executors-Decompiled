/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5844..0xaf5b40 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af5844_2 {
    char padding_0[24];
    long long field_18;
    struct st_af5844_0 *field_20;
    char padding_28[16];
    struct st_af5844_3 *field_38;
    char padding_40[24];
    struct st_af5844_4 *field_58;
    struct st_af5844_3 *field_60;
    char padding_68[24];
    struct st_af5844_3 *field_80;
    char padding_88[16];
    long long field_98;
    char padding_a0[12];
    char field_ac;
    char padding_ad[3];
    unsigned int field_b0;
    char padding_b4[4];
    struct st_af5844_1 *field_b8;
    char padding_c0[8];
    char field_c8;
    char padding_c9[11];
    unsigned int field_d4;
    unsigned long long field_d8;
} st_af5844_2;

typedef struct st_af5844_1 {
    char padding_0[233];
    char field_e9;
} st_af5844_1;

typedef struct st_af5844_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_af5844_0;

typedef struct st_af5844_3 {
    unsigned long long field_0;
} st_af5844_3;

typedef struct st_af5844_4 {
    char field_0;
} st_af5844_4;


char sub_af5844(st_af5844_2 *a0)
{
    char v8;  // w25
    char v9;  // w0
    char v10;  // x20
    unsigned long long v11;  // x20
    st_af5844_1 *v12;  // x0
    char v13;  // w24
    char v0;  // [bp-0x88]
    char v1;  // [bp-0x80]
    char v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x70]
    char v4;  // [bp-0x6c]
    char v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (!(a0->field_20->field_18 >> 2 & 1))
        return 1;
    if (a0->field_20->field_18 >> 3 & 1)
    {
        v9 = sub_ad69e4(a0->field_98);
        v8 = v9 - 1;
        if (v9 >= 1)
            goto LABEL_af5898;
    }
    else if (!a0->field_d8)
    {
        v8 = 0;
LABEL_af5898:
        v10 = 0;
        while (1)
        {
            v11 = v10;
            *(unsigned int *)&a0->field_ac = v11;
            v0 = 0;
            v12 = sub_ad69f8(a0->field_98, v11);
            a0->field_b8 = v12;
            *(unsigned long long *)a0->padding_c0 = 0;
            *(unsigned long long *)&a0->padding_c9[7] = 0;
            if (!(v12->field_e9 >> 2 & 1))
                break;
            v10 = (unsigned int)v11 + 1;
            if ((unsigned int)v11 == v8)
                return 1;
        }
        if (a0->field_58)
        {
            v5 = 0;
            v2 = 0;
            a0->field_58();
        }
        v5 = 0;
        v4 = 0;
        v1 = 0;
        v2 = 0;
        sub_97725c(v12);
        v3 = a0->field_d4;
        if (!sub_af7c00(a0, &v2, &v1, &v5, &v4, &v3, a0->field_18))
            a0->field_80();
        if (!v2)
        {
            v13 = 0;
        }
        else
        {
            *(unsigned long long *)a0->padding_c0 = v5;
            *(unsigned int *)&a0->padding_c9[7] = v4;
            a0->field_d4 = v3;
            v0 = v2;
            v13 = 1;
        }
        if (v13)
        {
            *(unsigned long long *)&a0->field_c8 = v0;
            a0->field_60();
        }
        a0->field_b0 = 3;
        a0->field_38();
    }
    return 1;
}
