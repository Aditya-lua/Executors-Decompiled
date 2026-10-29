/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18dbc..0xa18dfc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18dbc_2 {
    char padding_0[24];
    struct st_a18dbc_3 *field_18;
} st_a18dbc_2;

typedef struct st_a18dbc_0 {
    char padding_0[328];
    struct st_a18dbc_1 *field_148;
} st_a18dbc_0;

typedef struct st_a18dbc_1 {
    unsigned long long field_0;
} st_a18dbc_1;

typedef struct st_a18dbc_3 {
    struct st_a18dbc_0 *field_0;
} st_a18dbc_3;


void sub_a18dbc(st_a18dbc_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    (*(long long *)(*(long long *)a0->field_18 + 328))();
}
