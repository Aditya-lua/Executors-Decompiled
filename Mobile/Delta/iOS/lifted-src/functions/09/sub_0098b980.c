/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b980..0x98d7f8 (7800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b980_2 {
    char padding_0[232];
    struct st_98b980_0 *field_e8;
} st_98b980_2;

typedef struct st_98b980_0 {
    char padding_0[48];
    struct st_98b980_1 *field_30;
} st_98b980_0;

typedef struct st_98b980_1 {
    unsigned long long field_0;
} st_98b980_1;

extern char g_10002b0;

void sub_98b980(st_98b980_2 *a0, unsigned long a1)
{
    unsigned long long v14;  // x28
    unsigned long long v15;  // x27
    unsigned long long v24;  // x30
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = &v13;
    v12 = v24;
    v0 = *(long long *)&g_10002b0;
    a0->field_e8->field_30();
}
