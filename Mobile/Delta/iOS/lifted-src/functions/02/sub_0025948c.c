/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25948c..0x2595d8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25948c_4 {
    char padding_0[8];
    struct st_25948c_3 *field_8;
} st_25948c_4;

typedef struct st_25948c_5 {
    char padding_0[8];
    struct st_25948c_6 *field_8;
    struct st_25948c_6 *field_10;
} st_25948c_5;

typedef struct st_25948c_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_25948c_3;

typedef struct st_25948c_6 {
    unsigned long long field_0;
} st_25948c_6;

typedef struct st_25948c_1 {
    char padding_0[259];
    char field_103;
    char padding_104[604];
    char field_360;
} st_25948c_1;

typedef struct st_25948c_0 {
    char field_0;
} st_25948c_0;

typedef struct st_25948c_2 {
    char padding_0[96];
    struct st_25948c_1 *field_60;
} st_25948c_2;

extern unsigned long long g_e7aae8;
extern st_25948c_2 *g_f0d198;
extern unsigned long long g_f0d528;
extern long long g_f11980;

void sub_25948c(unsigned long a0, unsigned long a1, st_25948c_4 *a2, unsigned long a3)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_25948c_5 *v15;  // x22
    st_25948c_1 *v16;  // x8
    st_25948c_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_25948c_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v15 = *(long long *)sub_2622c4(&g_f11980, &v2);
    if (!v15)
    {
        goto *((void *)(g_e7aae8));
    }
    else if (v15->field_10)
    {
        v15->field_10();
    }
    else
    {
        v16 = g_f0d198->field_60;
        if (!(v16->field_360 & 1) && *(long long *)&v16[1].padding_104[539] && *(long long *)&v16[1].padding_104[283] && *(long long *)(a2->field_8->field_18 + 48) == *(long long *)&v16[1].padding_104[283] && a2[5].padding_0 != *(long long *)&v16[1].padding_104[539] && !(v16->field_103 >> 4 & 1))
            sub_d5c30(a2, g_f0d528 + 5158);
        v15->field_8();
    }
}
