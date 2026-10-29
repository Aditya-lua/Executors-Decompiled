/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61b44..0xc61ba0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61b44_0 {
    char padding_0[56];
    long long field_38;
} st_c61b44_0;


void sub_c61b44(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // 4102
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_c61b44_0 *v12;  // x0
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_97b0c0();
    v17 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
}
