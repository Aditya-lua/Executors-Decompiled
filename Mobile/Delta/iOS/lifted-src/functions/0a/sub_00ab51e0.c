/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab51e0..0xab52c4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab51e0_0 {
    char padding_0[192];
    unsigned long long field_c0;
    unsigned long long field_c8;
    long long field_d0;
} st_ab51e0_0;


long long sub_ab51e0(st_ab51e0_0 *a0, unsigned int *a1, long long a2)
{
    unsigned long v2;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a7c17c(a0->field_d0))
        return 0;
    v2 = a0->field_c0;
    if (!v2)
    {
        sub_a7c1b4(a0->field_d0);
        if (!sub_a7c198(a0->field_d0))
            return 0;
        v2 = a0->field_c0;
        if (!v2 && !(v2 = sub_aafc34(a0, a2), a0->field_c0 = v2, v2))
            goto LABEL_ab526c;
    }
    if (sub_9dd4bc(v2))
    {
        *a1 = 1;
    }
    else
    {
        *a1 = 0;
        v2 = a0->field_c8;
        if (!v2)
        {
            sub_a7c1b4(a0->field_d0);
            if (!sub_a7c198(a0->field_d0))
                return 0;
            v2 = a0->field_c8;
            if (!v2)
            {
                v2 = sub_aafc34(a0, a2);
                a0->field_c8 = v2;
            }
        }
    }
LABEL_ab526c:
    sub_a7c1b4(a0->field_d0);
    return v2;
}
