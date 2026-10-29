/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9752f4..0x9754a0 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9752f4_0 {
    char padding_0[240];
    struct st_9752f4_1 *field_f0;
    char padding_f8[8];
    long long field_100;
} st_9752f4_0;

typedef struct st_9752f4_1 {
    unsigned long long field_0;
} st_9752f4_1;


void sub_9752f4(st_9752f4_0 *a0, int a1)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    uint128_t v27;  // x8
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    char v0;  // [bp-0x158]
    uint128_t v1;  // [bp-0x150]
    unsigned long long v2;  // [bp-0x138]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v2 = 0;
    sub_989228(a0->field_100, &v0);
    *(unsigned long long *)&a0[1].padding_0[72 + 8 * a1] = 0;
    v27 = v1;
    if (v0 >= v1)
        v27 = v0;
    a0->field_f0();
}
