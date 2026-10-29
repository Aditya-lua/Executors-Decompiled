/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f444..0xb4f570 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f444_0 {
    char padding_0[16];
    struct st_b4f444_0 *field_10;
    long long field_18;
    struct st_b4f444_0 *field_20;
    char padding_28[8];
    struct st_b4f444_0 *field_30;
} st_b4f444_0;


st_b4f444_0 * sub_b4f444(st_b4f444_0 *a0, long long a1, st_b4f444_0 *a2, long long a3)
{
    st_b4f444_0 *v2;  // x22
    st_b4f444_0 *v3;  // w0
    st_b4f444_0 *v4;  // x0
    st_b4f444_0 *v5;  // x0
    st_b4f444_0 *v6;  // x23
    st_b4f444_0 *v7;  // x0
    st_b4f444_0 *v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = (st_b4f444_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (!v3)
    {
        return 0;
    }
    else if (!v2 && !a0->field_10)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/signature/mac_legacy_sig.c", 107, "mac_digest_sign_init");
        sub_a36abc(57, 114, 0);
        return 0;
    }
    else
    {
        if (v2)
        {
            v4 = sub_b3cf38(v2);
            if (!(unsigned int)v4)
                return v4;
            sub_b3d024(a0->field_10);
            a0->field_10 = v2;
            v5 = v2->field_20;
            if (!v2->field_20)
                goto LABEL_b4f510;
LABEL_b4f4e0:
            v6 = sub_a509dc(v5);
            v7 = a0->field_10->field_30;
            if (!v7)
                goto LABEL_b4f51c;
LABEL_b4f4f4:
            sub_954340(v7);
        }
        else
        {
            v2 = a0->field_10;
            v5 = v2->field_20;
            if (v5)
                goto LABEL_b4f4e0;
LABEL_b4f510:
            v6 = 0;
            v7 = v2->field_30;
            if (v7)
                goto LABEL_b4f4f4;
LABEL_b4f51c:
        }
        v8 = sub_afe250(a0->field_18, 0, v6, a1);
        if (!(unsigned int)v8)
            return v8;
        return sub_a58104(a0->field_18, a0->field_10->field_10, a0->field_10->field_18, a3) != 0;
    }
}
