/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb6e8..0xafb880 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb6e8_0 {
    struct st_afb6e8_0 *field_0;
    struct st_afb6e8_0 *field_8;
    char padding_10[24];
    struct st_afb6e8_0 *field_28;
    char padding_30[48];
    struct st_afb6e8_0 *field_60;
} st_afb6e8_0;

extern long long g_ebab00;

st_afb6e8_0 * sub_afb6e8(st_afb6e8_0 *a0, st_afb6e8_0 *a1)
{
    st_afb6e8_0 *v3;  // x0
    long long v4;  // x19
    st_afb6e8_0 *v5;  // x21
    st_afb6e8_0 *v6;  // x20
    unsigned long n;  // x22
    st_afb6e8_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0)
        return a0;
    if (a0->field_8)
    {
        v3 = sub_9cde20(&g_ebab00);
        if (v3)
        {
            if (a0->field_8->field_28)
                a0->field_8->field_28();
            sub_9cd960(v3, &g_ebab00);
            return 0xffffffff;
        }
    }
    else if (a0->field_60)
    {
        v4 = sub_a30d3c(a0, 134, "DER", "SubjectPublicKeyInfo", 0);
        v5 = sub_9d3c1c(sub_9d8844(v4, 134, "DER", "SubjectPublicKeyInfo", 0));
        v0 = 0;
        v6 = 0xffffffff;
        if (sub_a2c0c0(v4) && v5)
        {
            if (sub_a2f068(v4, v5) && sub_9d46fc(v5, 115, 0, &v0) >= 1)
            {
                v6 = v0->field_0;
                if (a1)
                {
                    if (a1->field_0)
                    {
                        n = (unsigned int)v6;
                        _memcpy(a1->field_0, v0->field_8, n);
                        a1->field_0 = (char *)a1->field_0 + n;
                    }
                    else
                    {
                        a1->field_0 = v0->field_8;
                        v0->field_0 = 0;
                        v0->field_8 = 0;
                    }
                }
            }
            else
            {
                v6 = 0xffffffff;
            }
        }
        sub_9d3c28(v5);
        sub_a3050c(v4);
        return v6;
    }
    return 0xffffffff;
}
