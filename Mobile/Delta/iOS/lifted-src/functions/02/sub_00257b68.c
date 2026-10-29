/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x257b68..0x257d00 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_257b68_4 {
    char padding_0[8];
    struct st_257b68_3 *field_8;
} st_257b68_4;

typedef struct st_257b68_6 {
    unsigned long long field_0;
    struct st_257b68_7 *field_8;
    struct st_257b68_7 *field_10;
} st_257b68_6;

typedef struct st_257b68_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_257b68_3;

typedef struct st_257b68_5 {
    char padding_0[40];
    struct st_257b68_4 *field_28;
} st_257b68_5;

typedef struct st_257b68_7 {
    unsigned long long field_0;
} st_257b68_7;

typedef struct st_257b68_1 {
    char padding_0[259];
    char field_103;
    char padding_104[604];
    char field_360;
} st_257b68_1;

typedef struct st_257b68_0 {
    char field_0;
} st_257b68_0;

typedef struct st_257b68_2 {
    char padding_0[96];
    struct st_257b68_1 *field_60;
} st_257b68_2;

extern unsigned long long g_e7abb0;
extern st_257b68_2 *g_f0d198;
extern long long g_f11980;

void sub_257b68(unsigned long a0, unsigned long a1, unsigned long a2, st_257b68_5 **a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    st_257b68_6 *v19;  // x24
    unsigned long long *v20;  // x8
    st_257b68_1 *v21;  // x8
    st_257b68_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_257b68_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v19 = *(long long *)sub_2622c4(&g_f11980, &v2);
    if (v19)
    {
        v20 = v19->field_10;
        if (!v20)
        {
            v21 = g_f0d198->field_60;
            if (!(v21->field_360 & 1) && *(long long *)&v21[1].padding_104[539] && *(long long *)&v21[1].padding_104[283] && *(long long *)(*a3->field_28->field_8->field_18 + 48) == *(long long *)&v21[1].padding_104[283] && *a3->field_28[5].padding_0 != *(long long *)&v21[1].padding_104[539] && !(v21->field_103 >> 4 & 1))
                sub_d5c30();
            v19->field_8();
        }
        else if (v19->field_0 == 1)
        {
            v20();
        }
        else
        {
            v20();
        }
    }
    else
    {
        goto *((void *)(g_e7abb0));
    }
}
