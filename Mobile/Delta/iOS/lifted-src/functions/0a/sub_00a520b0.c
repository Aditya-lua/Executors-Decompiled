/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa520b0..0xa52154 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a520b0_1 {
    char padding_0[112];
    struct st_a520b0_0 *field_70;
    struct st_a520b0_0 *field_78;
} st_a520b0_1;

typedef struct st_a520b0_0 {
    unsigned long long field_0;
} st_a520b0_0;


unsigned long long sub_a520b0(st_a520b0_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0->field_70)
        *a0->field_70();
    v2 = sub_a52154(a0);
    if (!*a0->field_78)
        return v2;
    *a0->field_78();
}
