/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8a3c..0xaa8c1c (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8a3c_1 {
    long long field_0;
    struct st_aa8a3c_0 *field_8;
    struct st_aa8a3c_0 *field_10;
} st_aa8a3c_1;

typedef struct st_aa8a3c_0 {
    char padding_0[88];
    struct st_aa8a3c_0 *field_58;
} st_aa8a3c_0;


st_aa8a3c_0 * sub_aa8a3c(long long a0, st_aa8a3c_1 *a1)
{
    st_aa8a3c_0 *v2;  // x21
    st_aa8a3c_0 *v3;  // x23
    st_aa8a3c_0 *v5;  // x0
    long long v6;  // x22
    long long v7;  // x23
    st_aa8a3c_0 *v8;  // x0
    st_aa8a3c_0 *v9;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a7c17c(a1->field_0))
        return 0;
    v2 = a1->field_8;
    sub_a7c1b4(a1->field_0);
    if (a1->field_10)
        return a1->field_10;
    if (a1->field_8)
    {
        v3 = 0;
    }
    else
    {
        sub_a36c8c();
        if (sub_a6820c(a0, 5))
        {
            v5 = sub_a51810();
            if (v5)
            {
                v2 = sub_a51d8c();
                sub_a51d08(v5);
                if (v2)
                {
                    if (sub_a52014(v2, 0, 0, 0, 0, 0))
                        goto LABEL_aa8b4c;
                    v6 = 108;
                    v7 = 641;
                }
                else
                {
                    v6 = 143;
                    v7 = 637;
                }
            }
            else
            {
                v2 = 0;
                v6 = 144;
                v7 = 631;
            }
            sub_a368c8();
            sub_a369bc("crypto/rand/rand_lib.c", v7, "rand_new_seed");
            sub_a36abc(36, v6, 0);
            sub_a51ef0(v2);
        }
        v2 = 0;
LABEL_aa8b4c:
        sub_a36cd4();
        v3 = v2;
    }
    v8 = sub_aa91f8(a0, v2, 0x100, 3600);
    if (v8)
    {
        v9 = v8;
        if (sub_a517bc())
            goto LABEL_aa8bb4;
        sub_a368c8();
        sub_a369bc("crypto/rand/rand_lib.c", 797, "rand_get0_primary");
        sub_a36abc(6, 212, 0);
        sub_a51ef0(v9);
    }
    v9 = 0;
    if (!v3)
        return 0;
LABEL_aa8bb4:
    if (sub_a7c198(a1->field_0))
    {
        if (a1->field_10)
        {
            sub_a7c1b4(a1->field_0);
            sub_a51ef0(v9);
            sub_a51ef0(v3);
            return a1->field_10;
        }
        if (v3)
            a1->field_8 = v3;
        a1->field_10 = v9;
        sub_a7c1b4(a1->field_0);
        return v9;
    }
    return 0;
}
