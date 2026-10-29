/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc7fc..0xafc8bc (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc7fc_0 {
    char padding_0[16];
    struct st_afc7fc_0 *field_10;
    char padding_18[312];
    struct st_afc7fc_0 *field_150;
} st_afc7fc_0;

extern long long g_ebaeb0;

st_afc7fc_0 * sub_afc7fc(st_afc7fc_0 *a0, st_afc7fc_0 *a1, unsigned long a2)
{
    st_afc7fc_0 *v2;  // x19
    st_afc7fc_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        if (!a0 || !a0->field_150 || !a0->field_150->field_10)
            return 1;
        sub_9cf0f4(a0->field_150->field_10);
        a0->field_150->field_10 = 0;
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
        if (!v2->field_10)
        {
            v3 = sub_9cf160(0);
            v2->field_10 = v3;
            if (!v3)
                return v3;
        }
    }
    else
    {
        return a0;
    }
}
