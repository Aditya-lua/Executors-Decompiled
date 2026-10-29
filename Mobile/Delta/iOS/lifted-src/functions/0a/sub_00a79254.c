/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79254..0xa792b8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79254_0 {
    char padding_0[48];
    long long field_30;
} st_a79254_0;


long long sub_a79254(st_a79254_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_30, "crypto/provider_core.c", 794);
    a0->field_30 = 0;
    if (!a1)
        return 1;
    v2 = sub_a6d9b4(a1, "crypto/provider_core.c", 798);
    a0->field_30 = v2;
    return v2 != 0;
}
