/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa63fc0..0xa64000 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a63fc0_0 {
    char padding_0[8];
    long long field_8;
} st_a63fc0_0;


void sub_a63fc0(st_a63fc0_0 *a0)
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
    sub_a6c2e4(a0->field_8, "crypto/hashtable/hashtable.c", 429);
    sub_a6c2e4();
    return;
}
