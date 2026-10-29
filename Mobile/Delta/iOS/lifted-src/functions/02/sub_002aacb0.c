/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aacb0..0x2aad70 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aacb0_1 {
    char padding_0[1];
    char field_1;
} st_2aacb0_1;

typedef struct st_2aacb0_2 {
    char padding_0[104];
    unsigned long long field_68;
} st_2aacb0_2;

typedef struct st_2aacb0_0 {
    char field_0;
} st_2aacb0_0;

extern unsigned long long g_e7bd28;
extern unsigned long long g_e7bd30;

void sub_2aacb0(st_2aacb0_2 *a0, st_2aacb0_1 *a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    char v21;  // x0
    char *v22;  // x22
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    char *v18;  // x22
    unsigned long long v19;  // x23
    unsigned long long v20;  // x23
    st_2aacb0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2aacb0_0 *v1;  // [bp-0x48]
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
    if (a2 >= 2)
    {
        v18 = &a1->field_1;
        v19 = a2 - 1;
        while (1)
        {
            v20 = v19;
            v21 = sub_2aa6a8(a0);
            v22 = v18 + 1;
            if (*v18 == v21)
            {
                v19 = v20 - 1;
                v18 = v22;
                if (v20 == 1)
                    goto *((void *)(g_e7bd30));
            }
            else
            {
                a0->field_68 = "invalid literal";
                goto *((void *)(g_e7bd28));
            }
        }
    }
    else
    {
        goto *((void *)(g_e7bd30));
    }
}
