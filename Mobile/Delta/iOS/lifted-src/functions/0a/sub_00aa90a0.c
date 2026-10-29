/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa90a0..0xaa9158 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa90a0_0 {
    char padding_0[24];
    struct st_aa90a0_0 *field_18;
    struct st_aa90a0_0 *field_20;
} st_aa90a0_0;


st_aa90a0_0 * sub_aa90a0(unsigned long a0, st_aa90a0_0 *a1)
{
    st_aa90a0_0 *v2;  // x0
    st_aa90a0_0 *v3;  // x19
    long long v4;  // x21
    st_aa90a0_0 *v5;  // x0
    st_aa90a0_0 *v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
        return v2;
    v3 = v2;
    if (!a1)
    {
        sub_a6c2e4(v3->field_20, "crypto/rand/rand_lib.c", 1108);
        v3->field_18 = 0;
        v3->field_20 = 0;
    }
    else if (v3->field_18 != a1)
    {
        v4 = sub_a77644(a1);
        v5 = v3->field_20;
        if (v5)
        {
            if (!sub_a6e200(v5, v4))
                goto LABEL_aa9124;
            v5 = v3->field_20;
        }
        sub_a6c2e4(v5, "crypto/rand/rand_lib.c", 131);
        v6 = sub_a6d9b4(v4, "crypto/rand/rand_lib.c", 132);
        v3->field_20 = v6;
        if (!v6)
            return v6;
LABEL_aa9124:
        v3->field_18 = a1;
    }
    return 1;
}
