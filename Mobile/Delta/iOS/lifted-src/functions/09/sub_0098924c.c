/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98924c..0x989300 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98924c_2 {
    struct st_98924c_2 *field_0;
    struct st_98924c_2 *field_8;
    struct st_98924c_1 *field_10;
    struct st_98924c_1 *field_18;
    struct st_98924c_0 *field_20;
    struct st_98924c_0 *field_28;
    unsigned long long field_30;
    char padding_38[40];
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned int field_80;
} st_98924c_2;

typedef struct st_98924c_3 {
    unsigned long long field_0;
    struct st_98924c_2 *field_8;
    struct st_98924c_2 *field_10;
    struct st_98924c_1 *field_18;
    struct st_98924c_1 *field_20;
    struct st_98924c_0 *field_28;
    struct st_98924c_0 *field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[39];
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    unsigned long long field_80;
    unsigned int field_88;
} st_98924c_3;

typedef struct st_98924c_0 {
    struct st_98924c_0 *field_0;
    struct st_98924c_0 *field_8;
    unsigned long long field_10;
    char padding_18[40];
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned int field_60;
} st_98924c_0;

typedef struct st_98924c_1 {
    struct st_98924c_1 *field_0;
    struct st_98924c_1 *field_8;
    struct st_98924c_0 *field_10;
    struct st_98924c_0 *field_18;
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned int field_70;
} st_98924c_1;

extern long long g_989300;
extern long long g_989308;

int sub_98924c(st_98924c_3 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned int a5)
{
    st_98924c_2 *v2;  // x8
    st_98924c_1 *v3;  // x9
    st_98924c_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_8;
    a0->field_0 = sub_a66520(sub_a66530(&g_989300, &g_989308), " ", "@", " ", "@");
    a0->field_8 = v2;
    v3 = &a0->field_18;
    a0->field_10 = v2;
    a0->field_18 = v3;
    v4 = &a0->field_28;
    a0->field_20 = v3;
    a0->field_28 = v4;
    a0->field_30 = v4;
    a0->field_38 = 1;
    memset(&a0->field_40, 0, 40);
    a0->field_68 = a1;
    a0->field_70 = a2;
    a0->field_78 = a3;
    a0->field_80 = a4;
    a0->field_88 = a5;
    return 1;
}
