/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4114..0xaf4144 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af4114_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
} st_af4114_0;


long long sub_af4114(long long a0, st_af4114_0 *a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = &v2;
    v1 = v3;
    return sub_9c026c(a0 + 16, a1->field_8, a1->field_0) != 0;
}
