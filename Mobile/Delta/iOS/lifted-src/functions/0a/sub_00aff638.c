/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff638..0xaff6b4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aff638_0 {
    struct st_aff638_0 *field_0;
    struct st_aff638_0 *field_8;
} st_aff638_0;


st_aff638_0 * sub_aff638(st_aff638_0 *a0, st_aff638_0 *a1, st_aff638_0 *a2)
{
    st_aff638_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v2 = sub_a18cf0(a1);
        if (!(unsigned int)v2)
            return v2;
        sub_a18c08(a0->field_8);
        a0->field_8 = a1;
        if (!a2 || !a2->field_0)
            return 1;
        return sub_afe114(a0 + 1, a2, a0->field_0) != 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
