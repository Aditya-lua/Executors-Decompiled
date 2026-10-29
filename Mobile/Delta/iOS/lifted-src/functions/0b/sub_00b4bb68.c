/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bb68..0xb4bc3c (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bb68_0 {
    char padding_0[28];
    char field_1c;
} st_b4bb68_0;

extern char g_10002b0;

st_b4bb68_0 * sub_b4bb68(st_b4bb68_0 *a0, char a1, unsigned long a2, unsigned long a3)
{
    st_b4bb68_0 *v4;  // x0
    char v0;  // [bp-0x7c]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a0)
    {
        if (!(a0->field_1c & 1))
        {
            v0 = 0;
            v4 = sub_a2f9e0();
            if ((unsigned int)v4)
            {
                v4 = *(long long *)&a0[12].padding_0[20];
                if (*(long long *)&a0[12].padding_0[20])
                {
                    if (a1)
                    {
                        v4 = sub_a3ff7c();
                        if (!(unsigned int)v4)
                            goto LABEL_b4bc00;
                    }
                    v4 = sub_b4c6c0(a0);
                }
            }
LABEL_b4bc00:
            a0->field_1c = a0->field_1c | 2;
            a0 = v4;
        }
        else
        {
            a0 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return a0;
    ___stack_chk_fail();
}
