/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9949d0..0x994ac4 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9949d0_0 {
    char padding_0[8];
    struct st_9949d0_1 *field_8;
} st_9949d0_0;

typedef struct st_9949d0_1 {
    long long field_0;
    long long field_8;
} st_9949d0_1;

typedef struct st_9949d0_2 {
    char padding_0[72];
    long long field_48;
    char padding_50[1616];
    unsigned long long field_6a0;
    char padding_6a8[16];
    unsigned long long field_6b8;
    struct st_9949d0_0 *field_6c0;
} st_9949d0_2;


long long sub_9949d0(st_9949d0_2 *a0)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long v20;  // x23
    st_9949d0_0 *v21;  // x22
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long v27;  // 4112
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long long v12;  // x22
    unsigned long v30;  // 4112
    unsigned long long v31;  // 4124
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned int v17;  // w20
    st_9949d0_0 *v18;  // x0
    st_9949d0_0 *i;  // x0
    char v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if (a0->field_6c0)
    {
        v17 = sub_9d4248(a0->field_48, a0->field_6a0 + a0->field_6b8);
        a0->field_6c0 = 0;
        v18 = *(long long *)&a0[2].padding_50[0x300];
        if (*(long long *)&a0[2].padding_50[0x300])
            goto LABEL_994a2c;
    }
    else
    {
        v17 = 1;
        v18 = *(long long *)&a0[2].padding_50[0x300];
        if (v18)
        {
LABEL_994a2c:
            i = sub_954348(v18);
            if (i)
            {
                do
                {
                    v20 = i->field_8;
                    v21 = i;
                    v17 &= sub_9d4248(a0->field_48, *(long long *)v20, *(long long *)(v20 + 8), &v0);
                    sub_a6c2e4(*(long long *)v20, "ssl/record/methods/dtls_meth.c", 563);
                    sub_a6c2e4(v21->field_8, "ssl/record/methods/dtls_meth.c", 564);
                    sub_954264(v21);
                    i = sub_954348(*(long long *)&a0[2].padding_50[0x300]);
                } while (i);
            }
            sub_954288(*(long long *)&a0[2].padding_50[0x300]);
        }
    }
    if (sub_998cf8(a0))
    {
        v27 = arm64g_calculate_condition(v23 | 16, v24, v25, v26);
        v28 = 3;
        v29 = (v27 & 1 ? v17 : 0x40000000);
    }
    else
    {
        v30 = arm64g_calculate_condition(v23 | 16, v24, v25, v26);
        v28 = 0;
        v29 = (v30 & 1 ? v17 : 0x40000000);
    }
    v31 = arm64g_calculate_condition(v28, v29, 0, 0);
    return !(v31 & 1);
}
