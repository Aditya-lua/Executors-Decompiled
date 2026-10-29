/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5b40..0xaf5bf0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af5b40_3 {
    char padding_0[133];
    char field_85;
} st_af5b40_3;

typedef struct st_af5b40_1 {
    char padding_0[32];
    struct st_af5b40_0 *field_20;
    char padding_28[16];
    struct st_af5b40_2 *field_38;
    char padding_40[112];
    unsigned int field_b0;
} st_af5b40_1;

typedef struct st_af5b40_0 {
    char padding_0[24];
    char field_18;
} st_af5b40_0;

typedef struct st_af5b40_4 {
    char padding_0[48];
    unsigned int field_30;
} st_af5b40_4;

typedef struct st_af5b40_2 {
    unsigned long long field_0;
} st_af5b40_2;


int sub_af5b40(st_af5b40_1 *a0, st_af5b40_3 *a1, unsigned long a2)
{
    st_af5b40_4 *v0;  // [bp-0x38], Other Possible Types: char
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(a0->field_20->field_18 >> 4 & 1) && a1->field_85 >> 1 & 1)
    {
        a0->field_b0 = 36;
        a0->field_38();
    }
    if (!sub_af9a3c(a1, &v0))
        return 1;
    if (v0->field_30 == 8)
        return 2;
    a0->field_b0 = 23;
    a0->field_38();
}
