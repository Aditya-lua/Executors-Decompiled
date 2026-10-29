/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac4064..0xac40bc (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac4064_1 {
    char padding_0[128];
    unsigned long long field_80;
    char padding_88[16];
    unsigned int field_98;
    char padding_9c[4];
    struct st_ac4064_0 *field_a0;
} st_ac4064_1;

typedef struct st_ac4064_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac4064_0;


int sub_ac4064(st_ac4064_1 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_a0->field_10 * 4 != a2)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    _memcpy();
    a0->field_98 = 1;
    a0->field_80 = &a0->padding_0[2 * a0->field_a0->field_10];
    return 1;
}
