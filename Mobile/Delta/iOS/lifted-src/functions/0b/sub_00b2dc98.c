/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2dc98..0xb2dd98 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2dc98_1 {
    char padding_0[8];
    struct st_b2dc98_0 *field_8;
    char field_10;
    char padding_11[103];
    struct st_b2dc98_0 *field_78;
    struct st_b2dc98_0 *field_80;
} st_b2dc98_1;

typedef struct st_b2dc98_0 {
    struct st_b2dc98_0 *field_0;
    char padding_8[24];
    struct st_b2dc98_0 *field_20;
} st_b2dc98_0;


st_b2dc98_0 * sub_b2dc98(st_b2dc98_1 *a0, st_b2dc98_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b2dc98_0 *v12;  // x0
    st_b2dc98_0 *v13;  // x0
    st_b2dc98_0 *v14;  // x0
    st_b2dc98_0 *v15;  // x0
    st_b2dc98_0 *v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
    {
        return 1;
    }
    else if (a1->field_0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = sub_a6fbc4(a1, "size");
        if (v12)
        {
            v13 = sub_954340(&a0->field_10);
            if ((int)a0->field_8 == 1)
            {
                if (!v13)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/hkdf.c", 185, "kdf_hkdf_size");
                    sub_a36abc(57, 129, 0);
                    return 0;
                }
                else if ((int)sub_a50ac8() < 1)
                {
                    return 0;
                }
            }
            v14 = sub_a70efc(v12);
            if (!(unsigned int)v14)
                return v14;
        }
        v15 = sub_a6fbc4(a1, "info");
        if (!v15)
            return 1;
        if (a0->field_78 && a0->field_80)
        {
            v16 = sub_a715c0();
            if (!(unsigned int)v16)
                return v16;
        }
        else
        {
            v15->field_20 = 0;
        }
        return 1;
    }
    else
    {
        return 1;
    }
}
