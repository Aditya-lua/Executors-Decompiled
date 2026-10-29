/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe0248..0xe0340 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e0248_5 {
    unsigned long long field_0;
    struct st_e0248_4 *field_8;
} st_e0248_5;

typedef struct st_e0248_1 {
    char padding_0[80];
    struct st_e0248_0 *field_50;
} st_e0248_1;

typedef struct st_e0248_0 {
    char padding_0[96];
    unsigned long long field_60;
} st_e0248_0;

typedef struct st_e0248_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[55];
    unsigned long long field_58;
    struct st_e0248_1 *field_60;
    char field_68;
} st_e0248_4;

typedef struct st_e0248_2 {
    char padding_0[1376];
    struct st_e0248_1 *field_560;
} st_e0248_2;

typedef struct st_e0248_3 {
    char padding_0[96];
    struct st_e0248_2 *field_60;
} st_e0248_3;

extern char g_e6dbc0;
extern st_e0248_3 *g_f0d198;
extern char g_10002b0;

unsigned long long sub_e0248(st_e0248_1 **a0)
{
    st_e0248_1 *v7;  // x9
    st_e0248_5 *v8;  // x8
    unsigned long long v9;  // x0
    char v0;  // [bp-0x50]
    long long v1;  // [bp-0x48]
    void* v2;  // [bp-0x40]
    unsigned long v3;  // [bp-0x40]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v1 = 1;
    v2 = sub_e04cc(&v0, 1);
    *(char **)v2 = &g_e6dbc0;
    *(unsigned long long *)&v2[8] = 0;
    *(unsigned long long *)&v2[16] = 0;
    v7 = *a0;
    *(unsigned long long *)&v2[24] = 850045863;
    memset(v2 + 32, 0, 56);
    *(unsigned long long *)&v2[88] = v7->field_50->field_60;
    *(st_e0248_1 **)&v2[96] = v7;
    *(char *)&v2[104] = v7->field_50 != g_f0d198->field_60->field_560->field_50;
    v3 = 0;
    v8->field_0 = v2 + 24;
    v8->field_8 = v2;
    v9 = sub_60c14(&v0);
    if (*(long long *)&g_10002b0 == v4)
        return v9;
    __Unwind_Resume(___stack_chk_fail());
}
