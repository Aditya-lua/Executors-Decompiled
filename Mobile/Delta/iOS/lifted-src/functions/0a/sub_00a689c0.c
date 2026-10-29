/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa689c0..0xa68a6c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a689c0_0 {
    char padding_0[24];
    struct st_a689c0_1 *field_18;
} st_a689c0_0;

typedef struct st_a689c0_1 {
    unsigned long long field_0;
} st_a689c0_1;


void sub_a689c0(unsigned long a0, unsigned long a1, unsigned long long a2, unsigned int a3, st_a689c0_0 *a4, unsigned long long a5)
{
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    char *v0;  // [bp-0x60]
    char v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned int v3;  // [bp-0x44]
    st_a689c0_0 *v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = v16;
    v10 = &v12;
    v11 = v17;
    v2 = 0;
    v3 = a3;
    v4 = a4;
    v5 = a5;
    v0 = &v1;
    sub_c68020();
    if (!v2)
        a4->field_18();
    a4->field_18();
}
