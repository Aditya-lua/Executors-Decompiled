/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ab9c..0xb3ac64 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3ab9c_0 {
    struct st_b3ab9c_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b3ab9c_0;


st_b3ab9c_0 * sub_b3ab9c(st_b3ab9c_0 *a0, st_b3ab9c_0 *a1)
{
    st_b3ab9c_0 *v2;  // x0
    st_b3ab9c_0 *v3;  // x0
    st_b3ab9c_0 *v4;  // x21
    st_b3ab9c_0 *v5;  // x0
    st_b3ab9c_0 *v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2)
    {
        if (a1 && a1->field_0)
        {
            v2 = sub_a1bc24(sub_9ffdd0(), a1);
            if ((unsigned int)v2)
            {
                v3 = sub_a6fbc4(a1, "encoded-pub-key");
                if (v3)
                {
                    v4 = v3;
                    v5 = sub_9dddcc(sub_a19700(a0));
                    if (v5 && v4->field_8 == 5)
                    {
                        v6 = v5;
                        if (sub_a19954(a0, v4->field_10, v4->field_18, v6))
                            sub_9dded4(v6);
                    }
                    sub_9dded4();
                    v2 = 0;
                }
            }
        }
        else
        {
            v2 = 1;
        }
    }
    return (unsigned int)v2;
}
