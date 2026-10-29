/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9af2d0..0x9af49c (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9af2d0_2 {
    int field_0;
    char padding_4[212];
    struct st_9af2d0_0 *field_d8;
} st_9af2d0_2;

typedef struct st_9af2d0_3 {
    char padding_0[24];
    struct st_9af2d0_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[68];
    unsigned int field_c0;
    char padding_c4[157];
    char field_161;
    char padding_162[2128];
    char field_9b2;
    char padding_9b3[501];
    unsigned int field_ba8;
} st_9af2d0_3;

typedef struct st_9af2d0_0 {
    char padding_0[16];
    struct st_9af2d0_1 *field_10;
    struct st_9af2d0_1 *field_18;
    char padding_20[48];
    char field_50;
} st_9af2d0_0;

typedef struct st_9af2d0_1 {
    unsigned long long field_0;
} st_9af2d0_1;


void sub_9af2d0(st_9af2d0_3 *a0, unsigned long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w8
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
    v12 = a0->field_78;
    if (!v12 && a0->field_ba8 != 4)
        a0->field_c0 = 1;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && !v12 && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        if (!(a0->field_161 >> 5 & 1) && (*(int *)&a0->padding_c4[44] || a0->field_9b2 >> 4 & 1) && !*(int *)&a0->padding_162[478])
            a0->field_18->field_d8->field_10();
LABEL_9af374:
    }
    else if (!v12)
    {
        goto LABEL_9af374;
    }
    a0->field_18->field_d8->field_18();
}
