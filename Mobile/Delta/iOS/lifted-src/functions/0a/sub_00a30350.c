/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa30350..0xa30378 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a30350_0 {
    char padding_0[8];
    struct st_a30350_1 *field_8;
} st_a30350_0;

typedef struct st_a30350_1 {
    char padding_0[24];
    struct st_a30350_0 *field_18;
} st_a30350_1;


st_a30350_1 * sub_a30350(st_a30350_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_c66e58();
        return 0;
    }
    return a0->field_18->field_8;
}
