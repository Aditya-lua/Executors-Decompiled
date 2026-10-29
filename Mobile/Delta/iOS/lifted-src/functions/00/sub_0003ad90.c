/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ad90..0x3ae84 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ad90_1 {
    char padding_0[144];
    char field_90;
    char padding_91[1439];
    unsigned long long field_630;
    unsigned long long field_638;
} st_3ad90_1;

typedef struct st_3ad90_2 {
    char padding_0[10];
    char field_a;
} st_3ad90_2;

typedef struct st_3ad90_0 {
    char field_0;
} st_3ad90_0;

extern unsigned long long g_e662d8;
extern unsigned long long g_e66300;

void sub_3ad90(st_3ad90_1 *a0, long long a1)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    st_3ad90_2 *v21;  // x8
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long v18;  // x8
    unsigned long long v19;  // x22
    st_3ad90_2 *v20;  // x0
    st_3ad90_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3ad90_0 *v1;  // [bp-0x48]
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
    v18 = a0->field_630;
    if ((long long)(a0->field_638 - a0->field_630) >> 3 > (unsigned long long)a1)
    {
        v19 = a1 * 8;
        while (1)
        {
            v20 = sub_34930(&a0->field_90, v18 + v19);
            v21 = &v20->padding_0[8];
            if (!v20)
                v21 = 0;
            if (v21->padding_0[2] != 1)
            {
                a1 += 1;
                v18 = a0->field_630;
                v19 += 8;
                if ((unsigned long long)a1 >= (long long)(a0->field_638 - a0->field_630) >> 3)
                    goto *((void *)(g_e66300));
            }
            else
            {
                goto *((void *)(g_e662d8));
            }
        }
    }
    else
    {
        goto *((void *)(g_e66300));
    }
}
