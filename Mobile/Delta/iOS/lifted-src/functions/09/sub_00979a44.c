/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979a44..0x979b18 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_979a44_0 {
    char padding_0[848];
    char field_350;
    char padding_351[607];
    long long field_5b0;
    char padding_5b8[104];
    unsigned int field_620;
    char field_623;
} st_979a44_0;


char sub_979a44(st_979a44_0 *a0, unsigned long long a1)
{
    char idx;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1 & 1 ^ a0->field_620 >> 25 & 1))
        return 0;
    idx = sub_989380(&a0->field_350, a1, (unsigned int)a1 & 3);
    if (!idx)
        return idx;
    if (sub_979918(a0, idx, !(a1 & 2), 1))
    {
        if (!((char)(*((char *)&a0->field_620 + 3)) >> 6 & 1))
        {
            sub_989cac(&a0->field_350, idx);
            return idx;
        }
        sub_989c00(&a0->field_350, idx, a0->field_5b0);
        sub_989934(&a0->field_350, idx, a0->field_5b0);
        *(unsigned long long *)(idx + 0x100) = *(long long *)(idx + 0x100) | 0x2000000000;
        sub_98959c(&a0->field_350, idx);
        return idx;
    }
    sub_989488(&a0->field_350, idx);
    return 0;
}
