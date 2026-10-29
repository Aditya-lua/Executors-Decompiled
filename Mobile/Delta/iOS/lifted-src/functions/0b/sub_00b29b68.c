/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29b68..0xb29cb8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29b68_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    unsigned int field_18;
    struct st_b29b68_0 *field_1c;
    struct st_b29b68_0 *field_20;
} st_b29b68_0;


st_b29b68_0 * sub_b29b68(st_b29b68_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // 4118
    st_b29b68_0 *v13;  // x0
    st_b29b68_0 *v14;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        if (sub_a6fbc4(a1, "ecdh-cofactor-mode"))
        {
            v12 = arm64g_calculate_condition(0x11, a0->field_18, 1, 0);
            if (!(v12 & 1))
                sub_a198e8(a0->field_8);
            v13 = sub_a6fe3c();
            if (!(unsigned int)v13)
                goto LABEL_b29ca8;
        }
        if (!sub_a6fbc4(a1, "kdf-type"))
        {
LABEL_b29c10:
            v14 = sub_a6fbc4(a1, "kdf-digest");
            if (v14)
            {
                if (a0->field_1c)
                {
                    v13 = sub_a71468(v14, sub_a50a58(a0->field_1c));
                    if (!(unsigned int)v13)
                        goto LABEL_b29ca8;
                }
                else
                {
                    v13 = sub_a71468();
                    if (!(unsigned int)v13)
                        goto LABEL_b29ca8;
                }
            }
            if ((!sub_a6fbc4(a1, "kdf-outlen") || (v13 = sub_a70efc(), (unsigned int)v13)) && (!sub_a6fbc4(a1, "kdf-ukm") || (v13 = sub_a71800(), (unsigned int)v13)))
                v13 = 1;
        }
        else if (!(&a0->field_18)[1])
        {
            v13 = sub_a71468();
            if ((unsigned int)v13)
                goto LABEL_b29c10;
        }
        else if ((&a0->field_18)[1] == 1)
        {
            v13 = sub_a71468();
            if ((unsigned int)v13)
                goto LABEL_b29c10;
        }
        else
        {
            v13 = 0;
        }
LABEL_b29ca8:
        a0 = v13;
    }
    return (unsigned int)a0;
}
