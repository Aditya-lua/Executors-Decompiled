/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29164..0xb292a0 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29164_0 {
    char padding_0[28];
    struct st_b29164_0 *field_1c;
    struct st_b29164_0 *field_20;
    char padding_28[24];
    struct st_b29164_0 *field_40;
} st_b29164_0;


st_b29164_0 * sub_b29164(st_b29164_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b29164_0 *v12;  // x0
    st_b29164_0 *v13;  // x0
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
        if (!sub_a6fbc4(a1, "kdf-type"))
        {
LABEL_b291c8:
            v13 = sub_a6fbc4(a1, "kdf-digest");
            if (v13)
            {
                if (a0->field_1c)
                {
                    v12 = sub_a71468(v13, sub_a50a58(a0->field_1c));
                    if (!(unsigned int)v12)
                        goto LABEL_b29290;
                }
                else
                {
                    v12 = sub_a71468();
                    if (!(unsigned int)v12)
                        goto LABEL_b29290;
                }
            }
            if ((!sub_a6fbc4(a1, "kdf-outlen") || (v12 = sub_a70efc(), (unsigned int)v12)) && (!sub_a6fbc4(a1, "kdf-ukm") || (v12 = sub_a71800(), (unsigned int)v12)))
            {
                if (sub_a6fbc4(a1, "cekalg"))
                {
                    v12 = sub_a71468();
                    if (!(unsigned int)v12)
                        goto LABEL_b29290;
                }
                v12 = 1;
            }
        }
        else if (!*(int *)&(a0->padding_0)[1])
        {
            v12 = sub_a71468();
            if ((unsigned int)v12)
                goto LABEL_b291c8;
        }
        else if (*(int *)&(a0->padding_0)[1] == 1)
        {
            v12 = sub_a71468();
            if ((unsigned int)v12)
                goto LABEL_b291c8;
        }
        else
        {
            v12 = 0;
        }
LABEL_b29290:
        a0 = v12;
    }
    return (unsigned int)a0;
}
