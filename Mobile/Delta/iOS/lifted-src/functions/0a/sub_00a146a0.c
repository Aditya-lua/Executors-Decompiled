/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa146a0..0xa14894 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a146a0_0 {
    char padding_0[32];
    struct st_a146a0_0 *field_20;
} st_a146a0_0;


st_a146a0_0 * sub_a146a0(st_a146a0_0 *a0, unsigned long a1, unsigned long long *a2, long long a3, long long a4)
{
    st_a146a0_0 *v4;  // x22
    st_a146a0_0 *v5;  // x0
    st_a146a0_0 *v6;  // x23
    st_a146a0_0 *v7;  // x0
    st_a146a0_0 *v8;  // x20
    st_a146a0_0 *v9;  // x19
    st_a146a0_0 *v10;  // x24
    st_a146a0_0 *v11;  // x0
    st_a146a0_0 *v12;  // x0
    unsigned int v13;  // w0
    st_a146a0_0 *v0;  // [bp-0x60]
    st_a146a0_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a0)
        return a0;
    v4 = a0->field_20;
    if (!v4)
        return 0;
    v5 = sub_9ffdd0(v4);
    if (!v5)
        return v5;
    v6 = v5;
    v7 = sub_a6ee78();
    if (!v7)
        return v7;
    v8 = v7;
    v9 = sub_9dddcc(a3);
    if (v9 && (sub_9de064(v9), sub_a16ddc(v6, v8, 0, a3, a4, v9, &v0)))
    {
        v10 = sub_962b90(v4);
        v11 = sub_975ff4(v4);
        if (v11)
        {
            v12 = sub_a1dbcc(v6, v11, sub_9d4f84(v4), &v1, v9);
            if (v12 && sub_a6f460(v8, "pub", v1, v12))
            {
LABEL_a14790:
                if (!v10)
                {
                    sub_a6f570(v8);
                    a2();
                }
                v13 = sub_a1ab64(v6);
                if ((int)v13 >= 1 && sub_a6f274(v8, "priv", v10, v13 + 7 >> 3) && sub_a6ef50(v8, "use-cofactor-flag", __ROL__(sub_a198e8(v4), 20) & 0xfff00001 & 1))
                {
                    sub_a6f570(v8);
                    a2();
                }
            }
        }
        else
        {
            goto LABEL_a14790;
        }
    }
    sub_a6eed4(v8);
    sub_a71e38(0);
    sub_a6c2e4(v1, "crypto/ec/ec_ameth.c", 601);
    sub_a6c2e4(v0, "crypto/ec/ec_ameth.c", 602);
    sub_9de17c(v9);
    sub_9dded4(v9);
    return 0;
}
