/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac40bc..0xac410c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac40bc_1 {
    char padding_0[128];
    struct st_ac40bc_1 *field_80;
    char padding_88[16];
    unsigned int field_98;
    char padding_9c[4];
    struct st_ac40bc_0 *field_a0;
} st_ac40bc_1;

typedef struct st_ac40bc_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac40bc_0;


int sub_ac40bc(st_ac40bc_1 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_ac40bc_1 *v8;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_a0->field_10 * 2 != a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = &a0->padding_0[a2];
    a0->field_80 = v8;
    _memcpy(v8);
    a0->field_98 = 0;
    return 1;
}
