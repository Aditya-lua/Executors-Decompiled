/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d6f0..0x95d86c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95d6f0_0 {
    char padding_0[8];
    struct st_95d6f0_1 *field_8;
} st_95d6f0_0;

typedef struct st_95d6f0_1 {
    unsigned long long field_0;
    char padding_8[1128];
    unsigned long long field_470;
} st_95d6f0_1;


st_95d6f0_0 * sub_95d6f0(st_95d6f0_0 **a0, long long a1)
{
    st_95d6f0_0 *v3;  // x10
    st_95d6f0_0 **v4;  // x22
    st_95d6f0_1 **v5;  // x8
    st_95d6f0_0 *v6;  // x19
    st_95d6f0_0 *v7;  // x20
    st_95d6f0_0 *v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0[4];
    v4 = a0 + 3;
    v0 = 0;
    v5 = &v3->field_8;
    if (!v3)
        v5 = v4;
    if (!v3 && !a0[3])
        return 1;
    v6 = sub_9d3c1c(sub_9d82cc());
    if (v6 && (int)sub_9d46fc(v6, 108, 3, a1) >= 1)
    {
        v7 = sub_a2e274(&v0, "PEM", 0, "DH", 4, *v5->field_0, *v5->field_470);
        if (v7)
        {
            sub_a36c8c();
            do
            { } while (!sub_a2beb4(v7, v6) && !v0 && !sub_9d46fc(v6, 2, 0, 0));
            sub_a2d974(v7);
            if (v0)
            {
                sub_a36cd4();
                if (*v4)
                {
                    v7 = sub_963f58(*v4, v0);
                    if ((int)(unsigned int)v7 >= 1)
                        v0 = 0;
                }
                else
                {
                    v7 = 0;
                }
                if (a0[4])
                {
                    v7 = sub_963ea4(a0[4], v0);
                    if ((int)(unsigned int)v7 >= 1)
                        v0 = 0;
                }
            }
            else
            {
                sub_a36e70();
                v7 = 0;
            }
        }
    }
    else
    {
        v7 = 0;
    }
    sub_a5a4c8(v0);
    sub_9d3c28(v6);
    return (int)(unsigned int)v7 > 0;
}
