/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18b774..0x18ba9c (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_18b774_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_18b774_1;

typedef struct st_18b774_0 {
    char field_0;
} st_18b774_0;

typedef struct st_18b774_5 {
    unsigned long long field_0;
} st_18b774_5;

typedef struct st_18b774_2 {
    char padding_0[1664];
    unsigned long long field_680;
} st_18b774_2;

typedef struct st_18b774_4 {
    char padding_0[376];
    struct st_18b774_5 *field_178;
} st_18b774_4;

typedef struct st_18b774_3 {
    char padding_0[96];
    struct st_18b774_2 *field_60;
} st_18b774_3;

extern st_18b774_3 *g_f0d198;
extern st_18b774_4 *g_f0d3d8;

int sub_18b774(st_18b774_1 *a0)
{
    st_18b774_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_18b774_0 *v1;  // [bp-0x88]
    st_18b774_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_18b774_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_50 == g_f0d198->field_60->field_680)
        return 0;
    v3 = &v2;
    v2 = &v3;
    g_f0d3d8->field_178();
}
