/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c3dec..0x3c3e90 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c3dec_3 {
    char padding_0[88];
    struct st_3c3dec_1 *field_58;
    char padding_60[32];
    struct st_3c3dec_2 *field_80;
} st_3c3dec_3;

typedef struct st_3c3dec_1 {
    char padding_0[12];
    unsigned int field_c;
} st_3c3dec_1;

typedef struct st_3c3dec_2 {
    char padding_0[7];
    char field_7;
} st_3c3dec_2;

typedef struct st_3c3dec_0 {
    char field_0;
} st_3c3dec_0;

typedef struct st_3c3dec_5 {
    unsigned long long field_0;
} st_3c3dec_5;

typedef struct st_3c3dec_4 {
    char padding_0[176];
    struct st_3c3dec_5 *field_b0;
} st_3c3dec_4;

extern st_3c3dec_4 *g_f0d3d8;

void sub_3c3dec(st_3c3dec_3 *a0, unsigned long a1, unsigned long long a2, unsigned int a3)
{
    st_3c3dec_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3c3dec_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned int v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    v3 = a3;
    if (!a0->field_80->field_7)
    {
        a0->field_58->field_c = 0;
        a0->field_58 = a0->field_58 + 1;
        return;
    }
    g_f0d3d8->field_b0();
}
