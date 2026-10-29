/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a3dbc..0x2a3e68 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a3dbc_2 {
    char padding_0[24];
    struct st_2a3dbc_1 *field_18;
} st_2a3dbc_2;

typedef struct st_2a3dbc_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_2a3dbc_1;

typedef struct st_2a3dbc_0 {
    char field_0;
} st_2a3dbc_0;

typedef struct st_2a3dbc_3 {
    char padding_0[2];
    struct st_2a3dbc_3 *field_2;
    struct st_2a3dbc_2 *field_8;
    char padding_10[64];
    unsigned long long field_50;
    char padding_58[16];
    struct st_2a3dbc_3 *field_68;
} st_2a3dbc_3;

typedef struct st_2a3dbc_5 {
    char padding_0[1408];
    unsigned long long field_580;
    char padding_588[248];
    unsigned long long field_680;
} st_2a3dbc_5;

typedef struct st_2a3dbc_6 {
    unsigned long long field_0;
} st_2a3dbc_6;

typedef struct st_2a3dbc_4 {
    char padding_0[96];
    struct st_2a3dbc_5 *field_60;
} st_2a3dbc_4;

extern st_2a3dbc_4 *g_f0d198;
extern st_2a3dbc_6 *g_f0d370;

unsigned long long sub_2a3dbc(st_2a3dbc_3 *a0)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4120
    st_2a3dbc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2a3dbc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0 && *(long long *)(*(long long *)&a0->field_2->padding_10[0] + 48) == g_f0d198->field_60->field_580 && (char)(a0->padding_0)[1] < 0 && *(long long *)&a0->padding_58[8] && *(long long *)&a0->padding_10[56] != g_f0d198->field_60->field_680)
    {
        v4 = sub_2a3b28();
        v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 69, 0);
        if (!(v5 & 1))
            return v4;
    }
    g_f0d370();
}
