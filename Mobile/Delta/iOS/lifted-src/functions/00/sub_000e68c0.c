/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe68c0..0xe69f4 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e68c0_0 {
    char field_0;
} st_e68c0_0;

typedef struct st_e68c0_4 {
    unsigned long long field_0;
} st_e68c0_4;

typedef struct st_e68c0_1 {
    char padding_0[257];
    char field_101;
} st_e68c0_1;

typedef struct st_e68c0_3 {
    char padding_0[48];
    struct st_e68c0_4 *field_30;
} st_e68c0_3;

typedef struct st_e68c0_2 {
    char padding_0[96];
    struct st_e68c0_1 *field_60;
} st_e68c0_2;

extern st_e68c0_2 *g_f0d198;
extern st_e68c0_3 *g_f0d3d8;

void sub_e68c0(long long a0)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    char v12;  // x0
    st_e68c0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_e68c0_0 *v1;  // [bp-0x38]
    st_e68c0_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_e68c0_0 *v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v4 = v9;
    v5 = v10;
    v6 = &v8;
    v7 = v11;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v12 = sub_d5114(a0, 1);
        if (v12 && *(long long *)(v12 + 24))
            g_f0d3d8->field_30();
    }
    sub_c60ca0(a0);
}
