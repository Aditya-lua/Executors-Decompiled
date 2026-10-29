/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaadff4..0xaae01c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aadff4_0 {
    char padding_0[32];
    long long field_20;
} st_aadff4_0;


int sub_aadff4(unsigned int a0, st_aadff4_0 **a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 != 2)
        return 1;
    v0 = &v2;
    v1 = v3;
    sub_9cf6c8(*a1->field_20);
    return 1;
}
