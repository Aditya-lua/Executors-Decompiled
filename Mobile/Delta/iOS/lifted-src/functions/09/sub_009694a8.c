/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9694a8..0x9694fc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9694a8_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[1008];
    unsigned long long field_400;
} st_9694a8_0;


unsigned long long sub_9694a8(st_9694a8_0 *a0, long long a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_959f90(a1, &v0, a0->field_8);
    if (!v3)
        return v3;
    v4 = sub_9694fc(a0, v0);
    if (!v4)
        return v4;
    a0->field_400 = v4;
    return 1;
}
