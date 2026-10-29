/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54a84..0xa54ac0 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54a84_0 {
    char padding_0[120];
    struct st_a54a84_0 *field_78;
} st_a54a84_0;

extern long long g_a54b88;

int sub_a54a84(st_a54a84_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_ad6958(a0->field_78, &g_a54b88);
    a0->field_78 = 0;
    return 1;
}
