/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcc244..0xbcc508 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcc244_2 {
    char padding_0[8];
    struct st_bcc244_0 *field_8;
} st_bcc244_2;

typedef struct st_bcc244_0 {
    char padding_0[24];
    struct st_bcc244_1 *field_18;
} st_bcc244_0;

typedef struct st_bcc244_1 {
    unsigned long long field_0;
} st_bcc244_1;


void sub_bcc244(unsigned long long *a0, st_bcc244_2 *a1)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long long v17;  // 4162
    unsigned long long v18;  // x8
    unsigned long v0;  // [bp-0x80]
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
    v17 = arm64g_calculate_condition(0x44, *a0, 0, 0);
    if (v17 & 1)
        v18 = *a0 ^ 0x8000000000000000;
    else
        v18 = 1;
    if (!v18)
    {
        a1->field_8->field_18();
    }
    else if (v18 == 1)
    {
        a1->field_8->field_18();
    }
    else
    {
        v0 = a0 + 1;
        a1->field_8->field_18();
    }
}
