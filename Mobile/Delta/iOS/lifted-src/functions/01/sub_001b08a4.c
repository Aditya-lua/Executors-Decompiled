/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b08a4..0x1b08ec (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b08a4_2 {
    unsigned long long field_0;
    struct st_1b08a4_3 *field_8;
} st_1b08a4_2;

typedef struct st_1b08a4_0 {
    char padding_0[8];
    struct st_1b08a4_1 *field_8;
} st_1b08a4_0;

typedef struct st_1b08a4_1 {
    unsigned long long field_0;
} st_1b08a4_1;

typedef struct st_1b08a4_3 {
    struct st_1b08a4_0 *field_0;
} st_1b08a4_3;

extern char g_e6fa68;

void sub_1b08a4(st_1b08a4_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    a0->field_0 = &g_e6fa68;
    if (!a0->field_8)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    (*(long long *)(*(long long *)a0->field_8 + 8))();
}
