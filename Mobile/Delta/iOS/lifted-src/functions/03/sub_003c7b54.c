/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c7b54..0x3c7c84 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c7b54_0 {
    char padding_0[120];
    struct st_3c7b54_1 *field_78;
} st_3c7b54_0;

typedef struct st_3c7b54_3 {
    char padding_0[257];
    char field_101;
    char padding_102[1150];
    struct st_3c7b54_2 *field_580;
} st_3c7b54_3;

typedef struct st_3c7b54_1 {
    long long field_0;
    long long field_8;
} st_3c7b54_1;

typedef struct st_3c7b54_2 {
    char padding_0[104];
    struct st_3c7b54_0 *field_68;
} st_3c7b54_2;

typedef struct st_3c7b54_5 {
    char field_0;
} st_3c7b54_5;

typedef struct st_3c7b54_4 {
    char padding_0[96];
    struct st_3c7b54_3 *field_60;
} st_3c7b54_4;

extern st_3c7b54_4 *g_f0d198;

unsigned long long sub_3c7b54(unsigned long a0)
{
    st_3c7b54_3 *v5;  // x9
    long long *v6;  // x8
    long long v7;  // x19
    st_3c7b54_5 **v0;  // [bp-0x70], Other Possible Types: char
    st_3c7b54_5 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = g_f0d198->field_60;
    if (!v5->field_580)
    {
        return 0;
    }
    else if (!(v5->field_101 >> 2 & 1))
    {
        return 0;
    }
    else if (g_f0d198->field_60->field_580->field_68)
    {
        v1 = &v0;
        v0 = &v1;
        v6 = &g_f0d198->field_60->field_580->field_68->field_78->field_0;
        v7 = v5->field_580->field_68->field_78->field_0;
        if (*v6 == v6[1])
            return 0;
        while (1)
        {
            if (!(sub_66dc4(v7) & 1))
            {
                sub_614bc(v7);
                if (v2)
                    (*(long long *)(*(long long *)v2 + 64))();
                sub_60b78(&v2);
            }
            v7 += 16;
            if (v7 == v6[1])
                return 0;
        }
    }
    else
    {
        return 0;
    }
}
