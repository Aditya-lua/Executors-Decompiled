/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ba98..0x97bac0 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ba98_0 {
    struct st_97ba98_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_97ba98_0;

typedef struct st_97ba98_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
} st_97ba98_1;


unsigned long long sub_97ba98(st_97ba98_0 *a0, unsigned long a1)
{
    unsigned long long *v0;  // x8
    unsigned long long v1;  // x0
    unsigned long long v2;  // x8

    v0 = a0->field_0;
    v1 = a0->field_10 - a0->field_8;
    if (!v0)
        return v1;
    v2 = v0[2] - (v0[1] + a1);
    if (v2 >= v1)
        return v1;
    return v2;
}
