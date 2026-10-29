/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb311f4..0xb31254 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b311f4_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    char padding_28[8];
    uint128_t field_30;
    uint128_t field_40;
} st_b311f4_0;


double sub_b311f4(st_b311f4_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_20, "providers/implementations/kdfs/scrypt.c", 94);
    a0->field_20 = 0;
    sub_a6c4e8(a0->field_10, a0->field_18, "providers/implementations/kdfs/scrypt.c", 96);
    a0->field_10 = 0;
    a0->field_30 = 0x80000000000100000;
    a0->field_40 = 0x401000000000000000000001;
    return 0x100000;
}
