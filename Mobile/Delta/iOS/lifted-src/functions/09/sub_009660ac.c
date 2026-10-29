/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9660ac..0x96612c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9660ac_0 {
    char padding_0[8];
    struct st_9660ac_1 *field_8;
} st_9660ac_0;

typedef struct st_9660ac_1 {
    long long field_0;
} st_9660ac_1;


long long sub_9660ac(st_9660ac_0 *a0, long long a1, unsigned int *a2)
{
    long long v2;  // w22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    do
    {
        if ((int)sub_aa8658(*(long long *)a0->field_8, a1, *a2, 0) < 1)
            return 0;
    } while (sub_95efcc(a0, a1, *a2) && (v2 += 1, v2 != 10));
    return 10 > v2;
}
