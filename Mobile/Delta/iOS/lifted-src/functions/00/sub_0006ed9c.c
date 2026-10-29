/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ed9c..0x70268 (5324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ed9c_4 {
    long long field_0;
    struct st_6ed9c_3 *field_8;
} st_6ed9c_4;

typedef struct st_6ed9c_1 {
    char padding_0[24];
    struct st_6ed9c_2 *field_18;
} st_6ed9c_1;

typedef struct st_6ed9c_2 {
    unsigned long long field_0;
} st_6ed9c_2;

typedef struct st_6ed9c_3 {
    struct st_6ed9c_1 *field_0;
} st_6ed9c_3;

typedef struct st_6ed9c_0 {
    char field_0;
} st_6ed9c_0;

extern char g_10002b0;

void sub_6ed9c(st_6ed9c_4 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, long long a7)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x30
    unsigned long long v31;  // x8
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    unsigned long long v0;  // [bp-0x550]
    st_6ed9c_0 **v1;  // [bp-0x548], Other Possible Types: char
    st_6ed9c_0 *v2;  // [bp-0x540]
    long long v3;  // [bp-0x1c0]
    long long v4;  // [bp-0x1b8]
    long long v5;  // [bp-0x1b0]
    unsigned long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = &v19;
    v18 = v30;
    v0 = v31;
    v6 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    sub_60b20(a0->field_0, 0, 5);
    sub_6086c(a7, a0->field_0);
    v4 = 0;
    v3 = 0;
    v5 = 0;
    (*(long long *)(*(long long *)*(long long *)a0->field_8 + 24))();
}
