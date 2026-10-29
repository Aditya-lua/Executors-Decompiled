/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7b54..0x9d7cbc (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d7b54_4 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_9d7b54_1 *field_10;
} st_9d7b54_4;

typedef struct st_9d7b54_3 {
    long long field_0;
    struct st_9d7b54_1 *field_8;
    long long field_10;
    long long field_18;
    struct st_9d7b54_1 *field_20;
} st_9d7b54_3;

typedef struct st_9d7b54_1 {
    char padding_0[64];
    struct st_9d7b54_0 *field_40;
} st_9d7b54_1;

typedef struct st_9d7b54_2 {
    char padding_0[40];
    struct st_9d7b54_1 *field_28;
    char padding_30[16];
    struct st_9d7b54_0 *field_40;
} st_9d7b54_2;

typedef struct st_9d7b54_0 {
    struct st_9d7b54_1 *field_0;
    char padding_8[72];
    unsigned long long field_50;
} st_9d7b54_0;


st_9d7b54_1 * sub_9d7b54(st_9d7b54_2 *a0, st_9d7b54_3 *a1, unsigned long a2, st_9d7b54_1 *a3, unsigned long a4, st_9d7b54_1 **a5)
{
    st_9d7b54_0 *v2;  // x23
    st_9d7b54_1 *v3;  // x24
    st_9d7b54_4 *iter;  // x25
    st_9d7b54_1 *v5;  // x0
    st_9d7b54_1 *v6;  // x19
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a3)
    {
        *a5 = 0;
        return 1;
    }
    if ((int)a0->field_28)
    {
        v2 = a0->field_40;
        if (a0->field_40->field_0)
            v2 = a0->field_40->field_0->field_40;
        if (sub_a7c198(v2->field_50))
        {
            v3 = 0;
            iter = &a1->field_10;
            while (1)
            {
                v5 = sub_c660f0(a0, *(long long *)((char *)iter - 16), *(long long *)((char *)iter - 8), iter->field_8, iter->field_0, 1);
                if (v5 < 0)
                    break;
                *(st_9d7b54_1 **)((char *)iter - 8) = v5;
                iter->field_10 = 0;
                v3 = &v3->padding_0[1];
                iter = (char *)iter + a2;
                if (a3 == v3)
                {
                    *a5 = a3;
                    goto LABEL_9d7be4;
                }
            }
            *a5 = v3;
            if (v3)
            {
LABEL_9d7be4:
                v6 = 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/bio/bss_dgram_pair.c", 1092, "dgram_pair_recvmmsg");
                sub_a36abc(32, -(unsigned int)v5, 0);
                v6 = 0;
            }
            sub_a7c1b4(v2->field_50);
            return v6;
        }
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 1078, "dgram_pair_recvmmsg");
        v7 = 786704;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 1067, "dgram_pair_recvmmsg");
        v7 = 124;
    }
    sub_a36abc(32, v7, 0);
    *a5 = 0;
    return 0;
}
