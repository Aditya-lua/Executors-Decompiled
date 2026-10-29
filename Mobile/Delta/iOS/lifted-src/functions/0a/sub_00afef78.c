/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafef78..0xaff194 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afef78_0 {
    char padding_0[8];
    struct st_afef78_0 *field_8;
    struct st_afef78_0 *field_10;
    struct st_afef78_0 *field_18;
    struct st_afef78_0 *field_20;
} st_afef78_0;

extern st_afef78_0 *g_eca278;
extern st_afef78_0 *g_eca288;
extern st_afef78_0 *g_eca298;

st_afef78_0 * sub_afef78(st_afef78_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_afef78_0 *v17;  // x8
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_afef78_0 *v12;  // x0
    st_afef78_0 *v13;  // w8
    st_afef78_0 *v14;  // x0
    st_afef78_0 *v15;  // x0
    st_afef78_0 *v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_a6fbc4(a1, "pad-mode");
    if (v12)
    {
        if ((int)v12->field_8 != 1)
        {
            if ((int)v12->field_8 != 4)
                return 0;
            switch (v13)
            {
            case 1:
                if (!g_eca278)
                    goto LABEL_aff030;
LABEL_aff014:
                v14 = sub_a71468();
                if (!(unsigned int)v14)
                    return v14;
                break;
            case 3:
                if (g_eca288)
                    goto LABEL_aff014;
                goto LABEL_aff030;
            case 4:
                if (g_eca298)
                    goto LABEL_aff014;
            default:
LABEL_aff030:
                sub_a368c8();
                sub_a369bc("providers/implementations/asymciphers/rsa_enc.c", 401, "rsa_get_ctx_params");
                sub_a36abc(57, 0xc0103, 0);
            }
        }
        else
        {
            v14 = sub_a6fe3c();
            if (!(unsigned int)v14)
                return v14;
        }
    }
    v15 = sub_a6fbc4(a1, "digest");
    if (v15)
    {
        if (a0->field_18)
        {
            v14 = sub_a71468(v15, sub_a50a58(a0->field_18));
            if (!(unsigned int)v14)
                return v14;
        }
        else
        {
            v14 = sub_a71468();
            if (!(unsigned int)v14)
                return v14;
        }
    }
    v16 = sub_a6fbc4(a1, "mgf1-digest");
    if (v16)
    {
        v17 = a0->field_20;
        if (a0->field_20 || (v17 = a0->field_18, a0->field_18))
        {
            v14 = sub_a71468(v16, sub_a50a58(v17));
            if (!(unsigned int)v14)
                return v14;
        }
        else
        {
            v14 = sub_a71468();
            if (!(unsigned int)v14)
                return v14;
        }
    }
    if ((!sub_a6fbc4(a1, "oaep-label") || (v14 = sub_a71800(), (unsigned int)v14)) && (!sub_a6fbc4(a1, "tls-client-version") || (v14 = sub_a70210(), (unsigned int)v14)) && (!sub_a6fbc4(a1, "tls-negotiated-version") || (v14 = sub_a70210(), (unsigned int)v14)) && (!sub_a6fbc4(a1, "implicit-rejection") || (v14 = sub_a70210(), (unsigned int)v14)))
        v14 = 1;
    return v14;
}
