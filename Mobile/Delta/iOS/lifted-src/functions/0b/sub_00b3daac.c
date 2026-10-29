/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3daac..0xb3dc30 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3daac_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    unsigned long long field_18;
} st_b3daac_0;

typedef struct st_b3daac_1 {
    long long field_0;
    char padding_8[8];
    struct st_b3daac_0 *field_10;
    long long field_18;
    char field_20;
    char padding_21[23];
    struct st_b3daac_0 *field_38;
    struct st_b3daac_0 *field_40;
} st_b3daac_1;


st_b3daac_0 * sub_b3daac(st_b3daac_1 *a0, long long a1)
{
    st_b3daac_0 *v2;  // x0
    st_b3daac_0 *v3;  // x21
    st_b3daac_0 *v4;  // x0
    long long v5;  // x1
    st_b3daac_0 *v6;  // x0
    st_b3daac_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "priv");
    if (v2)
    {
        v3 = v2;
        if (v2->field_8 == 5)
        {
            sub_a6d4c0(a0->field_10, a0->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 190);
            v4 = sub_a6c610();
            a0->field_10 = v4;
            if (!v4)
                return v4;
            _memcpy();
            a0->field_18 = v3->field_18;
            goto LABEL_b3db30;
        }
        else
        {
            sub_a368c8();
            v5 = 0xbb;
        }
    }
    else
    {
LABEL_b3db30:
        v6 = sub_a6fbc4(a1, "properties");
        if (!v6)
        {
LABEL_b3db88:
            if (!(int)a0->field_40 || sub_afde7c(&a0->field_20, a1, a0->field_0))
                return a0->field_10 != 0;
            sub_a368c8();
            v5 = 212;
        }
        else if (v6->field_8 == 4)
        {
            sub_a6c2e4(a0->field_38, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 205);
            v7 = sub_a6d9b4(v6->field_10, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 206);
            a0->field_38 = v7;
            if (!v7)
                return v7;
            goto LABEL_b3db88;
        }
        else
        {
            sub_a368c8();
            v5 = 202;
        }
    }
    sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", v5, "mac_key_fromdata");
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
