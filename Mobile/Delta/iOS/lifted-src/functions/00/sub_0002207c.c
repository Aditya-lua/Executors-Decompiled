/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2207c..0x2217c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2207c_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_2207c_1;

typedef struct st_2207c_0 {
    char field_0;
} st_2207c_0;

extern unsigned long long g_e63158;
extern unsigned long long g_e63160;

void sub_2207c(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    st_2207c_1 *v17;  // x8
    st_2207c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2207c_0 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x40]
    char v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v1 = &v0;
    v0 = &v1;
    sub_107a4();
    if (v4 == 1)
    {
        v17->field_0 = v2;
        v17->field_10 = v3;
        goto *((void *)(g_e63158));
    }
    else
    {
        goto *((void *)(g_e63160));
    }
}
