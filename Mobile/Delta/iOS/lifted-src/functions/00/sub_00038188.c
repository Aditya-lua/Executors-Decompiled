/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x38188..0x3858c (1028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_38188_1 {
    char field_0;
    char padding_1[7];
    struct st_38188_1 *field_8;
} st_38188_1;

typedef struct st_38188_0 {
    char field_0;
} st_38188_0;

extern unsigned long long g_e66310;
extern unsigned long long g_e66400;

void sub_38188(long long *a0, unsigned long a1, st_38188_1 *a2, long long a3, unsigned int a4)
{
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_38188_1 *v20;  // x0
    st_38188_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_38188_0 *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = &v12;
    v11 = v19;
    v1 = &v0;
    v0 = &v1;
    v3 = a1;
    v20 = sub_3a7e0(a0 + 33, &v3);
    if (!v20)
    {
        goto *((void *)(g_e66310));
    }
    else if ((int)v20->field_8)
    {
        if (sub_3a988(&v20->field_8) == a4)
        {
            if (a2)
                sub_47e48(a0, v3, a2->field_0, 1);
            v2 = sub_2bc4c(*a0);
            sub_103a8(a3, &v2);
            sub_2fdb0(*a0, 23, 0, 0);
        }
        goto *((void *)(g_e66400));
    }
    else
    {
        goto *((void *)(g_e66310));
    }
}
