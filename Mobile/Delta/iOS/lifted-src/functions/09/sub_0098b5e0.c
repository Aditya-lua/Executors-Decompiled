/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b5e0..0x98b620 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b5e0_0 {
    char padding_0[192];
    long long field_c0;
} st_98b5e0_0;


long long sub_98b5e0(long long a0, st_98b5e0_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_98952c(a1->field_c0, a0))
        return 0;
}
