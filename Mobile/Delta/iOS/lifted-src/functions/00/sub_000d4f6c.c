/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd4f6c..0xd50a0 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d4f6c_1 {
    char padding_0[80];
    unsigned long long field_50;
} st_d4f6c_1;

typedef struct st_d4f6c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[55];
    unsigned int field_58;
} st_d4f6c_0;

typedef struct st_d4f6c_3 {
    unsigned long long field_0;
    char padding_8[56];
    unsigned long long field_40;
    unsigned long long field_48;
    struct st_d4f6c_0 *field_50;
    unsigned long long field_58;
} st_d4f6c_3;

typedef struct st_d4f6c_2 {
    char field_0;
} st_d4f6c_2;

extern char g_e6dbf8;
extern char g_e6dc30;
extern char g_10002b0;

void* sub_d4f6c(void* a0, st_d4f6c_1 **a1)
{
    st_d4f6c_1 *v9;  // x8
    st_d4f6c_3 *v10;  // x20
    st_d4f6c_2 **v0;  // [bp-0x60], Other Possible Types: char
    st_d4f6c_2 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    long long v3;  // [bp-0x48]
    void* v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    *(unsigned long long *)&a0[8] = 0;
    *(unsigned long long *)&a0[16] = 0;
    *(char **)a0 = &g_e6dbf8;
    v9 = *a1;
    *(unsigned long long *)&a0[24] = 850045863;
    v10 = a0 + 24;
    v1 = &v0;
    v0 = &v1;
    memset(v10->padding_8, 0, 56);
    v10->field_40 = v9->field_50;
    v3 = 1;
    v4 = sub_e3cdc(&v2, 1);
    *(char **)v4 = &g_e6dc30;
    *(unsigned long long *)&v4[8] = 0;
    *(unsigned long long *)&v4[16] = 0;
    *(unsigned long long *)&v4[24] = 850045863;
    memset(v4 + 32, 0, 56);
    *(unsigned int *)&v4[88] = (unsigned int)(3.2506e-319 >> 0);
    memset(v4 + 96, 0, 48);
    v5 = 0;
    *(void* *)&a0[96] = v4 + 24;
    *(void* *)&a0[104] = v4;
    sub_60c14(&v2);
    *(long long *)&a0[112] = (long long)a0[96];
    if (*(long long *)&g_10002b0 == v6)
        return a0;
    __Unwind_Resume(___stack_chk_fail());
}
