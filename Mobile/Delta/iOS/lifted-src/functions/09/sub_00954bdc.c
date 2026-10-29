/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954bdc..0x9552d8 (1788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954bdc_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_954bdc_0;

extern st_954bdc_0 g_d27900;

unsigned int * sub_954bdc(unsigned int *a0, unsigned int a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x8
    unsigned long long v17;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a0;
    if (!(unsigned int)v16)
    {
LABEL_954c30:
        if (138 >= a1 - 3)
            goto *((void *)(sub_954c58 + *(short *)((char *)&(&g_d27900.field_0)[a1] - 6) * 4));
        else
            v17 = 0;
    }
    else if (!(v16 >> 7 & 1))
    {
        v17 = 0;
    }
    else
    {
        v17 = sub_980dc8(a0);
        if (v17)
            goto LABEL_954c30;
    }
    return v17;
}
