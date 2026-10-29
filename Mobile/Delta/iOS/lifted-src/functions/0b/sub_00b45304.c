/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45304..0xb45370 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45304_0 {
    char padding_0[8];
    unsigned int field_8;
    long long field_c;
} st_b45304_0;


long long sub_b45304(st_b45304_0 *a0, unsigned long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(&a0->field_8)[1])
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/macs/poly1305_prov.c", 115, "poly1305_update");
        sub_a36abc(57, 114, 0);
        return 0;
    }
    a0->field_8 = 1;
    if (!a2)
        return 1;
    sub_aa4dc0(&a0->field_c);
    return 1;
}
