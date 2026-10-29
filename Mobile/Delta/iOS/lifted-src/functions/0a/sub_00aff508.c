/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff508..0xaff5ec (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aff508_0 {
    char padding_0[8];
    struct st_aff508_0 *field_8;
    unsigned int field_10;
    unsigned int field_14;
    char padding_18[40];
    unsigned int field_40;
} st_aff508_0;


st_aff508_0 * sub_aff508(st_aff508_0 *a0, st_aff508_0 *a1, long long a2, unsigned long long a3)
{
    st_aff508_0 *v3;  // w0
    st_aff508_0 *v4;  // x0
    st_aff508_0 *v5;  // x0
    st_aff508_0 *v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = (st_aff508_0 *)0;
    v3 = (st_aff508_0 *)(unsigned int)sub_a2f9e0();
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        v4 = sub_afe6f0(a1, a3, &v0);
        if (!(unsigned int)v4)
            return v4;
        v5 = sub_ab146c(a1);
        if (!(unsigned int)v5)
            return v5;
        sub_ab1360(a0->field_8);
        a0->field_8 = a1;
        a0->field_14 = a3;
        a0->field_40 = 1;
        if (!sub_ab1cb0(a1, 0xf000))
        {
            a0->field_10 = 1;
            return sub_aff1a0(a0, a2);
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 120, "rsa_init");
        sub_a36abc(57, 0xc0103, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
