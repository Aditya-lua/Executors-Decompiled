/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef050..0x1ef140 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef050_1 {
    char padding_0[48];
    char field_30;
    char padding_31[23];
    unsigned long long field_48;
    unsigned long long field_50;
} st_1ef050_1;

typedef struct st_1ef050_0 {
    char field_0;
} st_1ef050_0;

extern unsigned long long g_e78230;
extern unsigned long long g_e78238;

void sub_1ef050(st_1ef050_1 *a0, long long a1)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long v18;  // x23
    unsigned long long v19;  // x21
    unsigned int *v20;  // x8
    st_1ef050_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1ef050_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50)
    {
        v18 = 0;
        v19 = 0;
        while (1)
        {
            v20 = a0->field_48 + v18;
            if (!sub_1f3dd4(&a0->field_30, *v20, v20[1], a1))
            {
                v19 += 1;
                v18 += 8;
                if (v19 >= a0->field_50)
                    goto *((void *)(g_e78238));
            }
            else
            {
                goto *((void *)(g_e78230));
            }
        }
    }
    else
    {
        goto *((void *)(g_e78238));
    }
}
