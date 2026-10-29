/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95ef58..0x95efac (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95ef58_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_95ef58_0;


long long sub_95ef58(st_95ef58_0 *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_980da4();
    if (a0->field_8 != v2)
    {
        v3 = sub_980db0();
        if (a0->field_8 != v3)
        {
            v4 = sub_980dbc();
            return a0->field_8 == v4;
        }
    }
    return 1;
}
