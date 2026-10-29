/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc7bc..0x1bc870 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc7bc_2 {
    char padding_0[8];
    struct st_1bc7bc_3 *field_8;
} st_1bc7bc_2;

typedef struct st_1bc7bc_0 {
    char padding_0[48];
    struct st_1bc7bc_1 *field_30;
} st_1bc7bc_0;

typedef struct st_1bc7bc_1 {
    unsigned long long field_0;
} st_1bc7bc_1;

typedef struct st_1bc7bc_3 {
    struct st_1bc7bc_0 *field_0;
} st_1bc7bc_3;


void sub_1bc7bc(st_1bc7bc_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    sub_181f0(&v0);
    sub_9c78(&v0, 0);
    sub_9c78(&v0, 0);
    sub_6b08(&v0);
    (*(long long *)(*(long long *)a0->field_8 + 48))();
}
