/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d34f4..0x1d3520 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d34f4_0 {
    unsigned long long field_0;
    struct st_1d34f4_1 *field_8;
} st_1d34f4_0;

typedef struct st_1d34f4_1 {
    unsigned long long field_0;
} st_1d34f4_1;


unsigned long long sub_1d34f4(st_1d34f4_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    a0->field_0 = a1;
    if (!v2)
        return 0;
    a0->field_8();
}
