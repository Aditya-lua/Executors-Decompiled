/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9930b0..0x99319c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9930b0_1 {
    char padding_0[120];
    struct st_9930b0_0 *field_78;
    char padding_80[2176];
    struct st_9930b0_0 *field_900;
    struct st_9930b0_0 *field_908;
    char padding_910[520];
    unsigned int field_b18;
} st_9930b0_1;

typedef struct st_9930b0_0 {
    char padding_0[836];
    struct st_9930b0_0 *field_344;
} st_9930b0_0;


st_9930b0_0 * sub_9930b0(st_9930b0_1 *a0, unsigned long a1, unsigned long a2, st_9930b0_0 *a3)
{
    st_9930b0_0 *v2;  // w8
    st_9930b0_0 *v3;  // w9
    long long v4;  // x1
    unsigned long long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a0->field_78)
    {
        v2 = (st_9930b0_0 *)*(int *)&a0[1].padding_910[280];
        if (a0->field_b18 == 2)
        {
            v3 = (st_9930b0_0 *)*(int *)&(a0->field_900->padding_0)[1];
            if (v2 >= (unsigned int)*(int *)&(a0->field_900->padding_0)[1])
                v2 = v3;
        }
        if (!v2)
            goto LABEL_9930f0;
LABEL_993124:
        v5 = *(int *)&a0[1].padding_910[284] + a1;
        if (v5 <= a2 + (unsigned long long)v2)
        {
            *(unsigned int *)&a0[1].padding_910[284] = v5;
            return 1;
        }
        sub_a368c8();
        v4 = 168;
    }
    else
    {
        v2 = (st_9930b0_0 *)*(int *)&(a0->field_900->padding_0)[1];
        if (*(int *)&(a0->field_900->padding_0)[1] || a0->field_908 && !(v2 = (st_9930b0_0 *)*(int *)&(a0->field_908->padding_0)[1], !*(int *)&(a0->field_908->padding_0)[1]))
            goto LABEL_993124;
        sub_c64bb0(a0);
LABEL_9930f0:
        sub_a368c8();
        v4 = 159;
    }
    sub_a369bc("ssl/record/rec_layer_s3.c", v4, "ossl_early_data_count_ok");
    sub_9a58a4();
    return 0;
}
