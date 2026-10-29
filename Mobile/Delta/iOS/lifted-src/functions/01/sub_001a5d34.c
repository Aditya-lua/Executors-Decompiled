/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5d34..0x1a5e08 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5d34_3 {
    char padding_0[8];
    struct st_1a5d34_2 *field_8;
    unsigned long long field_10;
} st_1a5d34_3;

typedef struct st_1a5d34_0 {
    char padding_0[24];
    struct st_1a5d34_1 *field_18;
} st_1a5d34_0;

typedef struct st_1a5d34_1 {
    unsigned long long field_0;
} st_1a5d34_1;

typedef struct st_1a5d34_2 {
    struct st_1a5d34_0 *field_0;
} st_1a5d34_2;

extern char g_10002b0;

void sub_1a5d34(st_1a5d34_3 *a0, unsigned long a1, unsigned long a2, unsigned long long *a3, unsigned long long *a4)
{
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long v0;  // [bp-0x88]
    char *v1;  // [bp-0x80]
    char *v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68]
    char v5;  // [bp-0x59]
    char v6;  // [bp-0x58]
    unsigned long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v8 = v15;
    v9 = v16;
    v10 = v17;
    v11 = v18;
    v12 = &v14;
    v13 = v19;
    v7 = *(long long *)&g_10002b0;
    v3 = *a4;
    v4 = *a3;
    v0 = a0->field_10;
    v1 = &v4;
    v2 = &v3;
    sub_1acd0c(&v6, &v0, &v5);
    (*(long long *)(*(long long *)*(long long *)a0->field_8 + 24))();
}
