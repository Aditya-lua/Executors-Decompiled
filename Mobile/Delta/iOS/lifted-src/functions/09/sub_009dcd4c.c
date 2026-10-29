/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dcd4c..0x9dce90 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dcd4c_0 {
    struct st_9dcd4c_0 *field_0;
    struct st_9dcd4c_0 *field_8;
    long long field_10;
    struct st_9dcd4c_0 *field_18;
    unsigned long long field_20;
    unsigned int field_28;
    char padding_2c[28];
    struct st_9dcd4c_0 *field_48;
} st_9dcd4c_0;


st_9dcd4c_0 * sub_9dcd4c(st_9dcd4c_0 *a0, st_9dcd4c_0 *a1, long long a2)
{
    st_9dcd4c_0 *v2;  // x19
    st_9dcd4c_0 *v3;  // x0
    st_9dcd4c_0 *v4;  // x0
    st_9dcd4c_0 *v5;  // x0
    st_9dcd4c_0 *v6;  // x0
    st_9dcd4c_0 *v7;  // x0
    long long v8;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(80, "crypto/bn/bn_blind.c", 36);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    v2->field_48 = v3;
    if (v3)
    {
        v2->field_20 = sub_a7c260();
        if ((!a0 || (v4 = sub_9e4b00(a0), v2->field_0 = v4, v4)) && (!a1 || (v5 = sub_9e4b00(a1), v2->field_8 = v5, v5)))
        {
            v6 = sub_9e4b00(a2);
            v2->field_18 = v6;
            if (v6)
            {
                if (sub_9e48c8(a2, 4))
                    sub_9e5d14(v2->field_18, 4);
                v2->field_28 = 0xffffffff;
                return v2;
            }
        }
        sub_9e48d4(v2->field_0);
        sub_9e48d4(v2->field_8);
        sub_9e48d4(v2->field_10);
        sub_9e48d4(v2->field_18);
        sub_a7c1d0(v2->field_48);
        v7 = v2;
        v8 = 88;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_blind.c", 41, "BN_BLINDING_new");
        sub_a36abc(3, 0x8000f, 0);
        v7 = v2;
        v8 = 42;
    }
    sub_a6c2e4(v7, "crypto/bn/bn_blind.c", v8);
    return 0;
}
