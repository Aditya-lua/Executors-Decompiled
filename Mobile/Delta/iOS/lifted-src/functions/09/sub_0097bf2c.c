/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97bf2c..0x97c044 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97bf2c_0 {
    char padding_0[8];
    struct st_97bf2c_0 *field_8;
} st_97bf2c_0;

typedef struct st_97bf2c_1 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_97bf2c_2 *field_18;
} st_97bf2c_1;

typedef struct st_97bf2c_2 {
    unsigned long long field_0;
} st_97bf2c_2;

typedef struct st_97bf2c_3 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    struct st_97bf2c_3 *field_40;
    char field_48;
    char padding_49[31];
    struct st_97bf2c_0 *field_68;
    struct st_97bf2c_1 *field_70;
} st_97bf2c_3;

extern char g_97c044;
extern char g_97c250;
extern char g_97c37c;

void sub_97bf2c(st_97bf2c_1 *a0, st_97bf2c_3 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_97bf2c_0 *iter;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    a1->field_70 = a0;
    a1->field_28 = &g_97c044;
    a1->field_30 = &g_97c250;
    a1->field_38 = &g_97c37c;
    a1->field_40 = a1;
    memset(&a1->field_48, 0, 32);
    iter = a1->field_68;
    if (a1->field_68)
    {
        do
        {
            sub_97632c(a0->field_0, iter);
            iter = iter->field_8;
        } while (iter);
    }
    sub_98e27c(a1);
    if (sub_98e304(a1))
        a0->field_18();
}
