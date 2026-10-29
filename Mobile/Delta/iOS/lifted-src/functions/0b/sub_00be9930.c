/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe9930..0xbe9d68 (1080 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be9930_2 {
    char padding_0[8];
    struct st_be9930_0 *field_8;
} st_be9930_2;

typedef struct st_be9930_0 {
    char padding_0[24];
    struct st_be9930_1 *field_18;
} st_be9930_0;

typedef struct st_be9930_1 {
    unsigned long long field_0;
} st_be9930_1;


void sub_be9930(st_be9930_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    a0->field_8->field_18();
}
