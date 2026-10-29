/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x64b34..0x64b60 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_64b34_0 {
    unsigned long long field_0;
    struct st_64b34_1 *field_8;
} st_64b34_0;

typedef struct st_64b34_1 {
    unsigned long long field_0;
} st_64b34_1;


unsigned long long sub_64b34(st_64b34_0 *a0, unsigned long long a1)
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
