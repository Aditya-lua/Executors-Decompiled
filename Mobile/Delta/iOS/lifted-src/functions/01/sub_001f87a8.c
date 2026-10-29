/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f87a8..0x1f8914 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f87a8_1 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[12];
    char field_14;
} st_1f87a8_1;

typedef struct st_1f87a8_2 {
    unsigned long long field_0;
} st_1f87a8_2;

typedef struct st_1f87a8_0 {
    char field_0;
} st_1f87a8_0;

extern unsigned long long g_e78d38;
extern unsigned long long g_e78d80;
extern unsigned long long g_e78db8;

void sub_1f87a8(unsigned long long *a0, st_1f87a8_2 **a1, unsigned long a2)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    st_1f87a8_1 *v26;  // x28
    unsigned int v27;  // w8
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // x26
    unsigned int *v30;  // x8
    unsigned long long v31;  // x8
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4110
    unsigned long long v17;  // x26
    unsigned long long v35;  // 4102
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_1f87a8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1f87a8_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = *a0 + 40 * a2;
    if (*(long long *)&v26[1].padding_8[3])
    {
        goto *((void *)(g_e78db8));
    }
    else
    {
        v27 = v26->field_0;
        v28 = v27;
        switch (v27)
        {
        case 3:
            v31 = 1 << ((char)v26->field_4 & 63) & 0x8000b0000000000;
            if (v26->field_4 <= 59)
            {
                v32 = arm64g_calculate_condition(147, v28, 3, 0);
                v33 = arm64g_calculate_condition(4, (v32 & 1 ? v31 : 0x40000000), 0, 0);
                if (v33 & 1)
                    goto LABEL_1f88d0;
            }
            else
            {
                v34 = arm64g_calculate_condition(147, v28, 3, 0);
                v35 = arm64g_calculate_condition(0, (v34 & 1 ? v31 : 0x40000000), 0, 0);
                if (v35 & 1)
                {
LABEL_1f88d0:
                    goto *((void *)(g_e78d80));
                }
            }
            goto *((void *)(g_e78db8));
        case 2:
            v30 = a0[12] + v26->field_4 * 8;
            sub_1eee04(a1, a0[9] + *v30 * 8, v30[1]);
            goto *((void *)(g_e78d38));
        case 0:
            v29 = v26->field_4;
            sub_1fb5d8(a1, 1);
            *(unsigned long long *)*a1 = v29 | v29 * 0x100000000;
            if (!(v26->field_14 & 1))
            {
                goto *((void *)(g_e78d38));
            }
            else
            {
                sub_1f0f04(a1);
                goto *((void *)(g_e78d38));
            }
        default:
            goto *((void *)(g_e78db8));
        }
    }
}
