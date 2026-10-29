/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3be44..0xa3bea0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3be44_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_a3be44_1 *field_20;
    unsigned long long field_28;
} st_a3be44_0;

typedef struct st_a3be44_1 {
    unsigned long long field_0;
} st_a3be44_1;


int sub_a3be44(unsigned int a0, unsigned long a1, st_a3be44_0 *a2)
{
    unsigned int v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3aef4();
    if ((int)v2 < 1)
        return v2;
    if (a0 != 5 && a0 != 2 || a2->field_8 != 1)
        return 0;
    *(unsigned long long *)a2->field_20 = a2->field_28;
    return 1;
    return 0;
}
