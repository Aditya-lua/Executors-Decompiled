/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa177f0..0xa179d4 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a177f0_0 {
    char padding_0[32];
    struct st_a177f0_1 *field_20;
} st_a177f0_0;

typedef struct st_a177f0_1 {
    unsigned int field_0;
} st_a177f0_1;

typedef struct st_a177f0_3 {
    long long field_0;
} st_a177f0_3;

typedef struct st_a177f0_2 {
    char padding_0[8];
    long long field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_a177f0_3 *field_18;
    char padding_20[16];
    double field_30;
    char padding_38[4];
    unsigned int field_3c;
    char field_40;
    char padding_41[15];
    long long field_50;
    long long field_58;
} st_a177f0_2;


st_a177f0_0 ** sub_a177f0(st_a177f0_2 *a0, unsigned long long a1)
{
    unsigned int idx;  // x0
    unsigned int index;  // x21
    unsigned int v4;  // x8
    unsigned int v5;  // x8
    unsigned int v6;  // x8
    st_a177f0_0 **v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_backend.c", 599, "ossl_ec_key_dup");
        sub_a36abc(16, 0xc0102, 0);
        return 0;
    }
    idx = sub_a19d38(a0->field_50, a0->field_58, a0->field_8);
    if (!idx)
        return idx;
    index = idx;
    if (a1 >> 2 & 1 && a0->field_18)
    {
        v4 = sub_a19fb4(a0->field_50, a0->field_58, *(long long *)a0->field_18);
        *(unsigned long long *)(index + 24) = v4;
        if (v4 && (idx = index, sub_a1a2e8(v4, a0->field_18)) && a0->padding_0)
        {
            *(char [8])idx = a0->padding_0;
            goto LABEL_a17870;
        }
    }
    else
    {
LABEL_a17870:
        if (!(a1 >> 1 & 1) || !*(long long *)&a0->padding_20[0] || *(long long *)(idx + 24) && (v5 = sub_a1a56c(*(long long *)(idx + 24)), *(unsigned long long *)(index + 32) = v5, v5 && (idx = index, sub_a1a654(v5, *(long long *)&a0->padding_20[0]))))
        {
            if (!(a1 & 1) || !*(long long *)&a0->padding_20[8])
            {
LABEL_a1791c:
                if (a1 >> 7 & 1)
                    *(double *)(idx + 48) = a0->field_30;
                *(unsigned int *)(idx + 16) = a0->field_10;
                *(unsigned int *)(idx + 60) = a0->field_3c;
                v7 = (st_a177f0_0 **)index;
                if (sub_a6a674(8, idx + 64, &a0->field_40))
                {
                    if (*v7)
                    {
                        if (*v7->field_20)
                        {
                            if (!~(a1 & 3))
                                *v7->field_20();
                        }
                        else
                        {
                            return v7;
                        }
                    }
                    else
                    {
                        return v7;
                    }
                }
            }
            else if (*(long long *)(idx + 24) && (v6 = sub_9e4958(), *(unsigned long long *)(index + 40) = v6, v6 && (idx = index, sub_9e4c34(v6, *(long long *)&a0->padding_20[8]))))
            {
                if (*(long long *)(*(long long *)*(long long *)(idx + 24) + 352))
                    (*(long long *)(*(long long *)*(long long *)(idx + 24) + 352))();
                goto LABEL_a1791c;
            }
        }
    }
    sub_a18c08();
    return 0;
}
