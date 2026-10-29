/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x362e0..0x363dc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_362e0_1 {
    char padding_0[8];
    struct st_362e0_0 *field_8;
} st_362e0_1;

typedef struct st_362e0_4 {
    char padding_0[8];
    long long field_8;
    char padding_10[256];
    unsigned long long field_110;
    long long field_118;
    long long field_120;
} st_362e0_4;

typedef struct st_362e0_2 {
    char padding_0[32];
    long long field_20;
    char padding_28[16];
    struct st_362e0_1 *field_38;
    unsigned long long field_40;
    char field_48;
} st_362e0_2;

typedef struct st_362e0_3 {
    char field_0;
} st_362e0_3;

typedef struct st_362e0_0 {
    char padding_0[8];
    unsigned int field_8;
} st_362e0_0;

extern unsigned int g_f00b60;

int sub_362e0(st_362e0_4 *a0, st_362e0_2 *a1)
{
    unsigned long long v7;  // x0
    st_362e0_3 **v0;  // [bp-0x48], Other Possible Types: char
    st_362e0_3 *v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    char v3;  // [bp-0x30], Other Possible Types: unsigned long
    st_362e0_2 *v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = a1;
    if (a1->field_48 == 1)
    {
        v2 = 0;
        v3 = 0;
        if (sub_3729c(&v2) & 1)
            return 1;
    }
    else
    {
        v2 = sub_36d28(a1->field_20, a0->field_110, a0->field_118);
        v3 = a0->field_110;
        if (sub_3729c(&v2) & 1)
            return 1;
    }
    v7 = sub_34a28(&v2, a0->field_120);
    if (v7 >> 31 & 1)
    {
        return 1;
    }
    else if (a0->padding_10[v7 & 0xffffffff] & 1)
    {
        return 1;
    }
    else
    {
        if ((unsigned int)v7 == 57)
        {
            if (a1->field_40 != 2)
            {
                return 1;
            }
            else if (a1->field_38->field_8->field_8 != g_f00b60)
            {
                return 1;
            }
        }
        sub_36400(a0->field_8, &v4);
        *(unsigned int *)(sub_12484(a0->field_8, &v4) + 8) = v7;
        return 1;
    }
}
