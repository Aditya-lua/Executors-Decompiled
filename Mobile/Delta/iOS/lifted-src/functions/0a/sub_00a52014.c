/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52014..0xa520b0 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52014_1 {
    unsigned long long field_0;
} st_a52014_1;

typedef struct st_a52014_0 {
    char padding_0[64];
    struct st_a52014_1 *field_40;
    char padding_48[40];
    struct st_a52014_1 *field_70;
} st_a52014_0;


void sub_a52014(st_a52014_0 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_a52014_0 *v16;  // x8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a0;
    if (!v16->field_70)
        v16->field_40();
    v16->field_70();
}
