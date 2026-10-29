/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38248..0xb3837c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b38248_0 {
    struct st_b38248_0 *field_0;
    struct st_b38248_0 *field_8;
    struct st_b38248_0 *field_10;
} st_b38248_0;


st_b38248_0 * sub_b38248(st_b38248_0 *a0, st_b38248_0 *a1, st_b38248_0 *a2, long long a3)
{
    st_b38248_0 *v4;  // x0
    st_b38248_0 *v5;  // x0
    st_b38248_0 *v6;  // x0
    st_b38248_0 *v7;  // x0
    st_b38248_0 *v0;  // [bp-0x3c]
    st_b38248_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v0 = (st_b38248_0 *)0;
    v4 = sub_a2f9e0();
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v5 = sub_afe6f0(a1, a3, &v0);
        if (!(unsigned int)v5)
            return v5;
        v6 = sub_ab146c(a1);
        if (!(unsigned int)v6)
            return v6;
        sub_ab1360(a0->field_8);
        a0->field_8 = a1;
        sub_ab1ac4(a1, 0, &v1, 0);
        if (v1 && (int)sub_9e5528(v1, sub_9e4624()) > 0)
        {
            if (!a2 || !a2->field_0)
                return 1;
            v7 = sub_a6fbc4(a2, "operation");
            if (v7)
            {
                if ((int)v7->field_8 != 4)
                {
                    return 0;
                }
                else if (!v7->field_10)
                {
                    return 0;
                }
                else if (!sub_a6e200("RSASVE"))
                {
                    *(unsigned int *)&a0->field_10 = 0;
                }
                else
                {
                    return 0;
                }
            }
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/rsa_kem.c", 158, "rsakem_init");
        sub_a36abc(57, 158, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
