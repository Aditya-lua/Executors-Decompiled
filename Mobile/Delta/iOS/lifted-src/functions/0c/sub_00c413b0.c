/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc413b0..0xc41e90 (2784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c413b0_2 {
    char padding_0[8];
    struct st_c413b0_0 *field_8;
} st_c413b0_2;

typedef struct st_c413b0_0 {
    char padding_0[24];
    struct st_c413b0_1 *field_18;
} st_c413b0_0;

typedef struct st_c413b0_1 {
    unsigned long long field_0;
} st_c413b0_1;


void sub_c413b0(unsigned long long *a0, st_c413b0_2 *a1)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // x8
    unsigned int v18;  // w9
    unsigned int v0;  // [bp-0xf4]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    v17 = *a0 & 3;
    if (1 < (long long)v17)
    {
        v18 = *a0 >> 32;
        if (v17 != 2)
            a1->field_8->field_18();
        v0 = v18;
        a1->field_8->field_18();
    }
    else if (!v17)
    {
        a1->field_8->field_18();
    }
    else
    {
        a1->field_8->field_18();
    }
}
