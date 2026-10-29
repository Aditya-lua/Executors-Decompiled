/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97e578..0x97e5f8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97e578_2 {
    char padding_0[120];
    struct st_97e578_0 *field_78;
    struct st_97e578_1 *field_80;
} st_97e578_2;

typedef struct st_97e578_0 {
    char padding_0[160];
    long long field_a0;
} st_97e578_0;

typedef struct st_97e578_1 {
    char padding_0[112];
    long long field_70;
} st_97e578_1;


st_97e578_2 * sub_97e578(st_97e578_2 *a0, unsigned int a1, unsigned long long a2, unsigned long a3, unsigned long long a4)
{
    st_97e578_2 *v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1)
    {
        v3 = sub_97724c(a0->field_78->field_a0);
        v2 = sub_98959c(v3, a0->field_80);
    }
    if (a2 && a3 & 1)
        v2 = sub_988eb8(a0->field_80->field_70);
    if (!a4)
        return v2;
    sub_977244(a0->field_78->field_a0);
}
