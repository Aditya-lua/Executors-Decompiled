/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ab10..0xb4ab7c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ab10_0 {
    char padding_0[8];
    unsigned int field_8;
} st_b4ab10_0;


int sub_b4ab10(st_b4ab10_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_8 != 1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/seed_src.c", 138, "seed_src_reseed");
        sub_a36abc();
        return 0;
    }
    return 1;
}
