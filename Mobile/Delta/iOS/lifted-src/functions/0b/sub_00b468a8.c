/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb468a8..0xb469d4 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b468a8_2 {
    unsigned long long field_0;
} st_b468a8_2;

typedef struct st_b468a8_0 {
    struct st_b468a8_0 *field_0;
} st_b468a8_0;

typedef struct st_b468a8_1 {
    char padding_0[48];
    struct st_b468a8_0 *field_30;
    char padding_38[8];
    struct st_b468a8_0 *field_40;
    char padding_48[8];
    struct st_b468a8_2 *field_50;
} st_b468a8_1;

extern char g_10002b0;

void sub_b468a8(st_b468a8_1 *a0)
{
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_b468a8_0 **v0;  // [bp-0x84]
    st_b468a8_0 **v1;  // [bp-0x80]
    st_b468a8_0 **v2;  // [bp-0x70]
    st_b468a8_0 **v3;  // [bp-0x60]
    st_b468a8_0 **v4;  // [bp-0x50]
    st_b468a8_0 **v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v7 = v12;
    v8 = v13;
    v9 = &v11;
    v10 = v14;
    v6 = *(long long *)&g_10002b0;
    v4 = (st_b468a8_0 **)0;
    v5 = (st_b468a8_0 **)0;
    v2 = (st_b468a8_0 **)0;
    v3 = (st_b468a8_0 **)0;
    v1 = (st_b468a8_0 **)0;
    v0 = (st_b468a8_0 **)0;
    sub_a70404("reseed_counter", &v0);
    if (a0->field_30 && a0->field_40)
        a0->field_40();
    a0->field_50();
}
