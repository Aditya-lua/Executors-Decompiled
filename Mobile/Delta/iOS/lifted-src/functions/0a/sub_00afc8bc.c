/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc8bc..0xafc97c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc8bc_0 {
    char padding_0[24];
    struct st_afc8bc_0 *field_18;
    char padding_20[304];
    struct st_afc8bc_0 *field_150;
} st_afc8bc_0;

extern long long g_ebaeb0;

st_afc8bc_0 * sub_afc8bc(st_afc8bc_0 *a0, st_afc8bc_0 *a1, unsigned long a2)
{
    st_afc8bc_0 *v2;  // x19
    st_afc8bc_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        if (!a0 || !a0->field_150 || !a0->field_150->field_18)
            return 1;
        sub_9cf0f4(a0->field_150->field_18);
        a0->field_150->field_18 = 0;
        return 1;
    }
    else if (a0)
    {
        v2 = a0->field_150;
        if (!v2)
        {
            v2 = sub_9cde20(&g_ebaeb0);
            a0->field_150 = v2;
            if (!v2)
                return v2;
        }
        if (!v2->field_18)
        {
            v3 = sub_9cf0ec(0);
            v2->field_18 = v3;
            if (!v3)
                return v3;
        }
    }
    else
    {
        return a0;
    }
}
