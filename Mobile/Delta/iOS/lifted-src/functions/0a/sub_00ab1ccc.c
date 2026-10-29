/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab1ccc..0xab1f90 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab1ccc_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[44];
    struct st_ab1ccc_0 *field_40;
    struct st_ab1ccc_0 *field_48;
    char padding_50[56];
    struct st_ab1ccc_0 *field_88;
    char padding_90[72];
    unsigned int field_d8;
} st_ab1ccc_1;

typedef struct st_ab1ccc_0 {
    struct st_ab1ccc_0 *field_0;
    struct st_ab1ccc_0 *field_8;
    struct st_ab1ccc_0 *field_10;
} st_ab1ccc_0;

extern long long g_ab2824;
extern long long g_ab2858;

st_ab1ccc_0 * sub_ab1ccc(st_ab1ccc_1 *a0, st_ab1ccc_0 *a1, st_ab1ccc_0 *a2, st_ab1ccc_0 *a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x27
    st_ab1ccc_0 *v14;  // x0
    st_ab1ccc_0 *v15;  // x26
    st_ab1ccc_0 *v16;  // w25
    st_ab1ccc_0 *v17;  // x20
    st_ab1ccc_0 *v18;  // x27
    st_ab1ccc_0 *v19;  // x28
    st_ab1ccc_0 *v20;  // x0
    st_ab1ccc_0 *v21;  // x0
    st_ab1ccc_0 *v22;  // x24
    st_ab1ccc_0 *v6;  // x24
    st_ab1ccc_0 *v7;  // x0
    st_ab1ccc_0 *v8;  // x24
    long long v9;  // x0
    long long v10;  // x0
    st_ab1ccc_0 *v11;  // x0
    st_ab1ccc_0 *v12;  // x24
    st_ab1ccc_0 *i;  // w25
    char *v0;  // [bp-0x6c]
    st_ab1ccc_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
    {
        return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    else if (a3)
    {
        v4 = sub_ad69e4(a1);
        if ((int)v4 < 2)
            return 0;
        v5 = v4;
        v6 = sub_ad69f8(a1, 0);
        v7 = sub_ad69f8(a1, 1);
        if ((v6 || a0->field_40) && (v7 || a0->field_48))
        {
            if (v6)
            {
                sub_9e4838(a0->field_40);
                a0->field_40 = v6;
                sub_9e5d14(v6, 4);
            }
            if (v7)
            {
                v8 = v7;
                sub_9e4838(a0->field_48);
                a0->field_48 = v8;
                sub_9e5d14(v8, 4);
            }
            a0->field_d8 = a0->field_d8 + 1;
            sub_ad664c(a1, 0);
            sub_ad664c(a1, 0);
            if ((unsigned int)v5 == sub_ad69e4(a2) && (unsigned int)v5 == sub_ad69e4(a3) + 1)
            {
                v9 = sub_ad69f8(a2, 0);
                v10 = sub_ad69f8(a2, 1);
                v11 = sub_ab19f0(a0, v9, v10, sub_ad69f8(a3, 0));
                if (!(unsigned int)v11)
                    return v11;
                sub_ad664c(a2, 0);
                sub_ad664c(a2, 0);
                sub_ad664c(a3, 0);
            }
            v12 = a0->field_88;
            i = (st_ab1ccc_0 *)((unsigned int)v5 - 2);
            if ((unsigned int)v5 != 2)
            {
                v14 = sub_ad61e0(0, v5);
                if (!v14)
                    return v14;
                v15 = v14;
                v0 = (char *)(unsigned int)v5;
                v1 = v12;
                do
                {
                    v16 = i;
                    v17 = v15;
                    v18 = sub_ad692c(a1);
                    v19 = sub_ad692c(a2);
                    v20 = sub_ad692c(a3);
                    if (!v18 || !v19 || !v20 || !(v21 = sub_a6bffc(40, "crypto/rsa/rsa_lib.c", 823), v21))
                        goto LABEL_ab1f7c;
                    v22 = v21;
                    v21->field_0 = v18;
                    v21->field_8 = v19;
                    v21->field_10 = v20;
                    sub_9e5d14(v18, 4);
                    sub_9e5d14(v22->field_8, 4);
                    sub_9e5d14(v22->field_10, 4);
                    v15 = v17;
                    sub_ad68a0(v17, v22);
                    i = (char *)v16 - 1;
                } while (i);
                a0->field_88 = v15;
                v12 = v1;
                v5 = v0;
                if (sub_ab2948(a0))
                    goto LABEL_ab1f44;
                a0->field_88 = v12;
LABEL_ab1f7c:
                sub_ad6958(v17, &g_ab2824);
            }
            else
            {
LABEL_ab1f44:
                if (v12)
                    sub_ad6958(v12, &g_ab2858);
                a0->field_10 = (unsigned int)v5 != 2;
                a0->field_d8 = a0->field_d8 + 1;
                return 1;
            }
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
