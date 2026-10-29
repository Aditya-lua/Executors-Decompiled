/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x38650..0x38924 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_38650_2 {
    long long field_0;
    char padding_8[256];
    char field_108;
    char padding_109[1267];
    unsigned int field_5fc;
} st_38650_2;

typedef struct st_38650_1 {
    char padding_0[28];
    unsigned int field_1c;
    long long field_20;
    long long field_28;
} st_38650_1;

typedef struct st_38650_0 {
    char field_0;
} st_38650_0;

extern unsigned long long g_e66ee8;
extern unsigned long long g_e66f48;

unsigned long long sub_38650(st_38650_2 *a0, st_38650_1 *a1, unsigned long long a2, unsigned long a3)
{
    unsigned long long v11;  // x19
    unsigned int v12;  // w24
    unsigned long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x0
    st_38650_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_38650_0 *v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    char v5;  // [bp-0x59]
    st_38650_2 *v6;  // [bp-0x58]
    unsigned int v7;  // [bp-0x50]
    unsigned long long *v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a2;
    v1 = &v0;
    v0 = &v1;
    v12 = a1->field_1c;
    v6 = a0;
    v7 = a0->field_5fc;
    v13 = sub_3a7e0(&a0->field_108, &a1->field_20);
    if (v13 && *(int *)(v13 + 8))
    {
        v14 = sub_47e48();
    }
    else if (sub_40c6c(a0, a1->field_20) & 1)
    {
        v15 = v11;
        if (!(a3 & 1))
            v15 = sub_3b87c(a0, a1, 1);
        v5 = v15;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        sub_38188(a0, a1->field_20, &v5, &v2, v12 != 14);
        sub_47e48(a0, a1->field_28, v5, 1);
        sub_3a26c(a0, a1, &v2, sub_2bc4c(a0->field_0));
        if (v5 != (unsigned int)v11)
            sub_2ad10(a0->field_0, 6, v11);
        v8 = &v2;
        v14 = sub_10344(&v8);
    }
    else if (!(sub_42480(a0, a1->field_28) >> 31 & 1))
    {
        sub_385b8(a0, a1->field_20, &v6);
        sub_2ad10();
        goto *((void *)(g_e66f48));
    }
    else
    {
        goto *((void *)(g_e66ee8));
    }
    v6->field_5fc = v7;
    return v14;
}
