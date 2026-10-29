/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f298..0x3f3c0 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f298_0 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_3f298_0;

typedef struct st_3f298_2 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_3f298_2;

typedef struct st_3f298_3 {
    char padding_0[12];
    char field_c;
    char padding_d[15];
    unsigned int field_1c;
    struct st_3f298_2 *field_20;
} st_3f298_3;

typedef struct st_3f298_1 {
    char field_0;
} st_3f298_1;

extern unsigned int g_f00b20;
extern unsigned int g_f0c9f0;

unsigned long long sub_3f298(st_3f298_0 *a0, st_3f298_3 *a1, long long a2)
{
    st_3f298_0 *v6;  // x19
    unsigned int v7;  // w22
    st_3f298_2 *v8;  // x8
    unsigned long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    st_3f298_1 **v0;  // [bp-0x60], Other Possible Types: char
    st_3f298_1 *v1;  // [bp-0x58]
    st_3f298_0 *v2;  // [bp-0x50]
    unsigned int v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    v7 = a0->field_5fc;
    v3 = a0->field_5fc;
    if (a1->field_20->field_8 == g_f00b20)
        v8 = a1->field_20;
    else
        v8 = 0;
    if ((char)g_f0c9f0 != 1 || a1->field_1c != 1 || !v8)
    {
        v10 = sub_385b8(v6);
        v11 = sub_40200(v6, a1->field_1c);
        v9 = sub_2ad10(v6->field_0, v11, a2, v10, 0);
        v7 = v3;
        v6 = v2;
    }
    else if (!(sub_2b8bc(v6->field_0, -v8->field_20) >> 31 & 1))
    {
        v9 = sub_3c904(v6, a2);
    }
    else
    {
        sub_45808(&a1->field_c, "Exceeded constant limit; simplify the code to compile");
        __debugbreak();
    }
    v6->field_5fc = v7;
    return v9;
}
