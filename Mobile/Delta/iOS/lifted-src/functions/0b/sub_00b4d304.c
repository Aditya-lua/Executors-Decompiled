/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d304..0xb4d3e8 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d304_0 {
    char padding_0[288];
    struct st_b4d304_0 *field_120;
    char padding_128[56];
    struct st_b4d304_0 *field_160;
} st_b4d304_0;


st_b4d304_0 * sub_b4d304(st_b4d304_0 *a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b4d304_0 *v12;  // x0
    st_b4d304_0 *v13;  // x0
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
        if (sub_a6fbc4(a1, "algorithm-id"))
        {
            v12 = sub_a715c0();
            if (!(unsigned int)v12)
                goto LABEL_b4d3d8;
        }
        if (!sub_a6fbc4(a1, "digest-size") || (v12 = sub_a70efc(), (unsigned int)v12))
        {
            v13 = sub_a6fbc4(a1, "digest");
            if (v13)
            {
                if (a0->field_160)
                {
                    v12 = sub_a71468(v13, sub_a50a58(a0->field_160));
                    if (!(unsigned int)v12)
                        goto LABEL_b4d3d8;
                }
                else
                {
                    v12 = sub_a71468();
                    if (!(unsigned int)v12)
                        goto LABEL_b4d3d8;
                }
            }
            if (!sub_a6fbc4(a1, "nonce-type") || (v12 = sub_a70210(), (unsigned int)v12))
                v12 = 1;
        }
LABEL_b4d3d8:
        a0 = v12;
    }
    return (unsigned int)a0;
}
