/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffd74..0x9ffdd0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffd74_0 {
    char padding_0[112];
    long long field_70;
    long long field_78;
    char padding_80[72];
    unsigned long long field_c8;
} st_9ffd74_0;


int sub_9ffd74(st_9ffd74_0 *a0, long long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
    {
        sub_9e4838(a0->field_70);
        a0->field_70 = a1;
    }
    if (a2)
    {
        sub_9e4838(a0->field_78);
        a0->field_78 = a2;
    }
    a0->field_c8 = a0->field_c8 + 1;
    return 1;
}
