/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f174..0x1f214 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f174_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_1f174_1;

typedef struct st_1f174_0 {
    char field_0;
} st_1f174_0;

extern unsigned long long g_e625d8;
extern unsigned long long g_e625e0;

void sub_1f174(unsigned long a0)
{
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_1f174_1 *v13;  // x8
    st_1f174_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f174_0 *v1;  // [bp-0x48]
    uint128_t v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x30]
    char v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v5 = v10;
    v6 = v11;
    v7 = &v9;
    v8 = v12;
    v1 = &v0;
    v0 = &v1;
    sub_107a4();
    if (v4 == 1)
    {
        v13->field_0 = v2;
        v13->field_10 = v3;
        goto *((void *)(g_e625d8));
    }
    else
    {
        goto *((void *)(g_e625e0));
    }
}
