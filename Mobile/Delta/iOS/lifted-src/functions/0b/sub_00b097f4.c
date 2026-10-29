/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb097f4..0xb099ec (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b097f4_0 {
    char padding_0[8];
    struct st_b097f4_1 *field_8;
} st_b097f4_0;

typedef struct st_b097f4_2 {
    char padding_0[32];
    uint128_t field_20;
    char padding_30[120];
    struct st_b097f4_0 *field_a8;
} st_b097f4_2;

typedef struct st_b097f4_1 {
    unsigned long long field_0;
} st_b097f4_1;

extern char g_10002b0;

void sub_b097f4(st_b097f4_2 *a0, uint128_t *a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v14;  // x26
    unsigned long long v15;  // x25
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    unsigned long long v23;  // x22
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v2 = *(long long *)&g_10002b0;
    v23 = a3 & 15;
    if (!(a3 & 15))
    {
        a0->field_a8->field_8();
    }
    else if (a3 != (v23 | 16))
    {
        a0->field_a8->field_8();
    }
    else
    {
        v1 = a0->field_20;
        v0 = *(int128_t *)((char *)a1 + v23);
        *(unsigned long long *)&a0->field_20 = 0;
        *(unsigned long long *)((char *)&a0->field_20 + 8) = 0;
        a0->field_a8->field_8();
    }
}
