/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02150..0xa021ac (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02150_0 {
    char padding_0[104];
    long long field_68;
    long long field_70;
    char padding_78[72];
    unsigned long long field_c0;
} st_a02150_0;


int sub_a02150(st_a02150_0 *a0, long long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        sub_9e48d4(a0->field_68);
        a0->field_68 = a1;
    }
    if (a2)
    {
        sub_9e48d4(a0->field_70);
        a0->field_70 = a2;
    }
    a0->field_c0 = a0->field_c0 + 1;
    return 1;
}
