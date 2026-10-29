/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40bcc..0xa40ca8 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40bcc_0 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_a40bcc_0 *field_18;
} st_a40bcc_0;


st_a40bcc_0 * sub_a40bcc(unsigned long a0, unsigned long a1, unsigned long a2, long long a3, long long a4, long long a5, st_a40bcc_0 *a6)
{
    st_a40bcc_0 *v3;  // x0
    st_a40bcc_0 *v4;  // x20
    unsigned int v5;  // w8
    unsigned long long v6;  // 4102
    st_a40bcc_0 *v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a4e6ec();
    v0 = (st_a40bcc_0 *)0;
    if (v3)
    {
        v4 = v3;
        v3 = sub_a40abc(a3, a4, a5, &v0, v4, 0);
        if (!(int)v4->field_18)
        {
            do
            {
                /* unsupported instruction */;
                v5 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v6 = arm64g_calculate_condition(19, v5, 1, 0);
            if (!(v6 & 1))
            {
                /* unsupported instruction */;
            }
            else if (1 < (int)v5)
            {
                goto LABEL_a40c84;
            }
            sub_a50b58(v4);
        }
    }
LABEL_a40c84:
    if (a6)
        a6->field_0 = v0;
    return v3;
}
