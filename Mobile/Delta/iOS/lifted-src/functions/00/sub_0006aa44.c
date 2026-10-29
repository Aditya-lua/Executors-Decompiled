/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6aa44..0x6aba4 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6aa44_1 {
    unsigned short field_0;
    char padding_2[6];
    char field_8;
    char padding_9[23];
    char field_20;
} st_6aa44_1;

typedef struct st_6aa44_0 {
    uint128_t field_0;
    unsigned int field_10;
    char padding_14[4];
    char field_18;
    char padding_19[23];
    char field_30;
} st_6aa44_0;


char * sub_6aa44(unsigned int *a0, long long a1, int *a2, st_6aa44_0 *a3, long long a4, st_6aa44_1 *a5)
{
    long long v13;  // x19
    long long *v14;  // x8
    unsigned short v0;  // [bp-0x110]
    char v1;  // [bp-0x108]
    char v2;  // [bp-0xf0]
    char v3;  // [bp-0xe8]
    char v4;  // [bp-0xd0]
    long long v5;  // [bp-0xc8]
    char v6;  // [bp-0xb8]
    uint128_t v7;  // [bp-0xa0]
    unsigned int v8;  // [bp-0x90]
    char v9;  // [bp-0x88]
    char v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = operatornew(200);
    v7 = a3->field_0;
    v8 = a3->field_10;
    sub_5c38(&v9, &a3->field_18);
    v10 = a3->field_30;
    sub_5c38(&v3, a4);
    sub_6c5f8(&v4, a4 + 24);
    sub_5c38(&v6, a4 + 48);
    v0 = a5->field_0;
    sub_5c38(&v1, &a5->field_8);
    v2 = a5->field_20;
    sub_6af00(v13, *a0, a1, *a2, &v7, &v3, &v0, 0);
    *v14 = v13;
    sub_62aa0(&v4, v5);
    return &v9;
}
