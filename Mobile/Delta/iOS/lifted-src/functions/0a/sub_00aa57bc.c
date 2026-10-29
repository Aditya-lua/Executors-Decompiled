/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa57bc..0xaa57f0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa57bc_0 {
    char padding_0[8];
    long long field_8;
} st_aa57bc_0;


void sub_aa57bc(st_aa57bc_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_ad6020(a0->field_8);
}
