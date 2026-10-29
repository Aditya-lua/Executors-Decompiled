/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecd4..0xed8c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ecd4_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_ecd4_0 *field_20;
} st_ecd4_1;

typedef struct st_ecd4_0 {
    char padding_0[48];
    char field_30;
} st_ecd4_0;

typedef struct st_ecd4_2 {
    char field_0;
} st_ecd4_2;

extern unsigned int g_f00b40;
extern unsigned int g_f00b50;
extern unsigned int g_f00b80;
extern unsigned int g_f00b90;
extern char g_f0ca50;

long long sub_ecd4(unsigned long a0, st_ecd4_1 *a1)
{
    unsigned int v4;  // w8
    st_ecd4_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_ecd4_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_8;
    if (v4 == g_f00b40 && a1->field_20->field_30 != 1)
        return 1;
    if (v4 == g_f00b50)
    {
        if (g_f0ca50 != 1)
        {
            return 1;
        }
        else if (sub_21544())
        {
            v4 = a1->field_8;
        }
        else
        {
            return 1;
        }
    }
    if (v4 != g_f00b90)
        return v4 == g_f00b80;
    return 1;
}
