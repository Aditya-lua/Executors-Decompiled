/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b9a4..0x96baa8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b9a4_0 {
    unsigned short field_0;
    char padding_2[2];
    unsigned int field_4;
    char padding_8[4];
    unsigned int field_c;
} st_96b9a4_0;

typedef struct st_96b9a4_1 {
    char padding_0[64];
    long long field_40;
    unsigned long long field_48;
    long long field_50;
    unsigned long long field_58;
} st_96b9a4_1;

extern st_96b9a4_0 g_e878e0;

unsigned long long sub_96b9a4(st_96b9a4_1 *a0, unsigned int *a1, unsigned long long a2, unsigned long long a3)
{
    unsigned int *v2;  // x22
    unsigned long long v3;  // x0
    unsigned long long v12;  // x21
    unsigned long long i;  // x8
    unsigned short *iter;  // x10
    unsigned long long v8;  // x14
    st_96b9a4_0 *v9;  // x13
    unsigned long long v10;  // x14
    unsigned long long v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 & 1)
        return 0;
    v2 = a1;
    v3 = sub_a6bf4c(a2, "ssl/t1_lib.c", 0xeff);
    if (!v3)
        return v3;
    if (a2)
    {
        i = 0;
        iter = v3;
        do
        {
            v8 = 31;
            v9 = &g_e878e0.field_0;
            while (1)
            {
                v10 = v8;
                if (v9->field_4 == *v2 && v9->field_c == v2[1])
                    break;
                v9 = v9[4].padding_8;
                v8 = v10 - 1;
                if (v10 == 1)
                {
                    sub_a6c2e4();
                    return 0;
                }
            }
            *iter = v9->field_0;
            iter += 1;
            i += 2;
            v2 += 2;
        } while (i < a2);
    }
    v11 = v3;
    v12 = a2 >> 1;
    if (a3)
    {
        sub_a6c2e4(a0->field_50, "ssl/t1_lib.c", 3860);
        a0->field_50 = v11;
        a0->field_58 = v12;
    }
    else
    {
        sub_a6c2e4(a0->field_40, "ssl/t1_lib.c", 3864);
        a0->field_40 = v11;
        a0->field_48 = v12;
    }
    return 1;
}
