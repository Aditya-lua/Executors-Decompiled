/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953764..0x953888 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953764_0 {
    char padding_0[24];
    struct st_953764_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[1188];
    struct st_953764_2 *field_4f0;
    char padding_4f8[1244];
    unsigned int field_9d4;
} st_953764_0;

typedef struct st_953764_1 {
    unsigned int field_0;
} st_953764_1;

typedef struct st_953764_2 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[16];
    unsigned long long field_118;
    unsigned long long field_120;
    unsigned long long field_128;
    unsigned long long field_130;
    char padding_138[152];
    unsigned long long field_1d0;
} st_953764_2;


st_953764_0 * sub_953764(st_953764_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v19;  // x21
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long *v22;  // x8
    unsigned long long v23;  // x0
    unsigned long long *v24;  // x8
    unsigned int v25;  // w8
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x0
    unsigned long long *v17;  // x8
    unsigned long long v18;  // x20
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
    if (*(int *)&a0->padding_0[0])
    {
        v16 = 0;
    }
    else
    {
        sub_991c1c(&a0[1].padding_4c[564]);
        v17 = a0->field_4f0;
        if (v17)
        {
            v18 = v17[35];
            v19 = v17[36];
            v20 = v17[37];
            v21 = v17[38];
            sub_95369c(a0);
            memset(a0->field_4f0, 0, 472);
            v22 = a0->field_4f0;
            v22[58] = v17[58];
            if (*(int *)&a0->padding_4c[44])
                v22[32] = 0xff;
            v23 = sub_962ef0(a0);
            v24 = a0->field_4f0;
            if (v23 >> 12 & 1)
            {
                v24[37] = v20;
                v24[38] = v21;
            }
            v24[35] = v18;
            v24[36] = v19;
        }
        v16 = sub_954a28(a0);
        if ((unsigned int)v16)
        {
            v25 = *(int *)a0->field_18;
            if (*(int *)a0->field_18 == 0x1ffff)
            {
                v25 = 65277;
LABEL_95385c:
                a0->field_48 = v25;
            }
            else
            {
                if ((char)a0->padding_4f8[1209] >= 0)
                    goto LABEL_95385c;
                a0->field_48 = 0x100;
                a0->field_9d4 = 0x100;
            }
            v16 = 1;
        }
    }
    return v16;
}
