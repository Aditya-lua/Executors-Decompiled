/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b5f0..0x96b718 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b5f0_0 {
    struct st_96b5f0_0 *field_0;
} st_96b5f0_0;

extern long long g_96b718;

st_96b5f0_0 ** sub_96b5f0(st_96b5f0_0 **a0, st_96b5f0_0 **a1, long long a2, st_96b5f0_0 **a3)
{
    st_96b5f0_0 **v5;  // x0
    st_96b5f0_0 **v6;  // x0
    unsigned long v7;  // cc_dep1
    unsigned long long v8;  // x20
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4107
    unsigned long long v12;  // 4107
    unsigned long long v13;  // x21
    long long v0;  // [bp-0xe0]
    st_96b5f0_0 **v1;  // [bp-0xd0]
    st_96b5f0_0 **v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    if (a0)
        v2 = a0;
    v5 = sub_9f5c88(a2, 58, 1, &g_96b718, &v1);
    if (!(unsigned int)v5)
    {
        return v5;
    }
    else if (v1)
    {
        if (!a1)
            return 1;
        v6 = sub_a6bf4c(v1 * 2, "ssl/t1_lib.c", 3815);
        if (!v6)
            return v6;
        _memcpy();
        v7 = a3;
        if (!a3)
        {
            v8 = 64;
            v9 = arm64g_calculate_condition(3, v7, 0, 0);
            if (!(v9 & 1))
                goto LABEL_96b696;
LABEL_96b695:
            v11 = arm64g_calculate_condition(3, v7, 0, 0);
            if (!(v11 & 1))
                goto LABEL_96b6a2;
LABEL_96b6a1:
            v13 = 72;
        }
        else
        {
            v8 = 80;
            v10 = arm64g_calculate_condition(3, v7, 0, 0);
            if (v10 & 1)
                goto LABEL_96b695;
LABEL_96b696:
            v12 = arm64g_calculate_condition(3, v7, 0, 0);
            if (v12 & 1)
                goto LABEL_96b6a1;
LABEL_96b6a2:
            v13 = 88;
        }
        sub_a6c2e4();
        *(st_96b5f0_0 ***)((char *)a1 + v8) = v6;
        *(st_96b5f0_0 ***)((char *)a1 + v13) = v1;
        return 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 3801, "tls1_set_sigalgs_list");
        v0 = a2;
        sub_a36abc(20, 0x80106, "No valid signature algorithms in '%s'");
        return 0;
    }
}
