/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac6b74..0xac6d0c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac6b74_3 {
    char padding_0[168];
    struct st_ac6b74_0 *field_a8;
    struct st_ac6b74_2 *field_b0;
} st_ac6b74_3;

typedef struct st_ac6b74_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_ac6b74_2;

typedef struct st_ac6b74_0 {
    char padding_0[16];
    struct st_ac6b74_1 *field_10;
    char padding_18[24];
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
} st_ac6b74_0;

typedef struct st_ac6b74_1 {
    unsigned long long field_0;
} st_ac6b74_1;


void sub_ac6b74(st_ac6b74_3 **a0, unsigned long a1, unsigned long a2, unsigned long long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v17;  // x28
    unsigned long long v18;  // x27
    unsigned long long v27;  // x30
    st_ac6b74_0 *v28;  // x27
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    unsigned long v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v28 = *a0->field_a8;
    v2 = *a0->field_b0->field_20;
    v3 = a3;
    v0 = v28->field_30;
    v1 = v28->field_40;
    v28->field_10();
}
