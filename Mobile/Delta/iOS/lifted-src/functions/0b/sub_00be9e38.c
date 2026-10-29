/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe9e38..0xbe9f94 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be9e38_2 {
    char padding_0[8];
    struct st_be9e38_0 *field_8;
} st_be9e38_2;

typedef struct st_be9e38_0 {
    char padding_0[24];
    struct st_be9e38_1 *field_18;
} st_be9e38_0;

typedef struct st_be9e38_1 {
    unsigned long long field_0;
} st_be9e38_1;


void sub_be9e38(st_be9e38_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11, unsigned long long a12, unsigned long long a13, unsigned long a14, unsigned long long a15, unsigned long long a16, unsigned long long a17, unsigned long long a18)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    unsigned long long v21;  // x26
    unsigned long long v22;  // x25
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
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

    v7 = v19;
    v8 = v20;
    v9 = v21;
    v10 = v22;
    v11 = v23;
    v12 = v24;
    v13 = v25;
    v14 = v26;
    v15 = v27;
    v16 = v28;
    v17 = &a8;
    v18 = v29;
    v2 = a7;
    v6 = a16;
    v5 = a17;
    v4 = a18;
    v1 = a12;
    v0 = a13;
    v3 = a15;
    a0->field_8->field_18();
}
