/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5eee8..0xc5ef10 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5eee8_1 {
    char padding_0[8];
    struct st_c5eee8_0 *field_8;
} st_c5eee8_1;

typedef struct st_c5eee8_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c5eee8_0;


void sub_c5eee8(unsigned long long *a0, st_c5eee8_1 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!*a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c769bc();
    }
    goto *((void *)(a1->field_8->field_18));
}
