/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf298..0x9cf394 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf298_0 {
    char padding_0[8];
    char field_8;
    char padding_9[3];
    int field_c;
    int field_10;
} st_9cf298_0;

typedef struct st_9cf298_1 {
    char field_0;
    char padding_1[31];
    struct st_9cf298_0 *field_20;
} st_9cf298_1;


unsigned int sub_9cf298(void* *a0, char a1, st_9cf298_1 *a2)
{
    unsigned int v5;  // w8
    unsigned long v6;  // cc_op
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    st_9cf298_0 *v14;  // x9
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    void* v18;  // x19
    unsigned long v19;  // x20
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    char v22;  // x8
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a2->field_0;
    if (v5 != 6)
    {
        v7 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
        v8 = arm64g_calculate_condition(19, (v7 & 1 ? v5 & 0xff : 0x40000000), v7 & 1, 0);
        if (v8 & 1)
            return 0;
    }
    else
    {
        v10 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
        v11 = arm64g_calculate_condition(16, (v10 & 1 ? v5 & 0xff : 0x40000000), v10 & 1, 0);
        if (v11 & 1)
            return 0;
    }
    v14 = a2->field_20;
    if (!v14)
        return 0;
    v0 = v15;
    v1 = v16;
    v2 = &v4;
    v3 = v17;
    if (!(v14->field_8 & 1))
        return 0;
    v18 = *a0;
    if (a1 != 1)
    {
        v19 = v14->field_10;
        if (a1)
        {
            v20 = arm64g_calculate_condition(0x11, a1, 1, 0);
            if (!(v20 & 1))
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v21 = arm64g_calculate_condition(19, /* unsupported instruction */, 1, 0);
                if (v21 & 1)
                    return /* unsupported instruction */ - 1;
                /* unsupported instruction */;
                sub_a7c1d0(*(long long *)((char *)v18 + v19));
                *(unsigned long long *)((char *)v18 + v19) = 0;
                return 0;
            }
        }
        else
        {
            /* unsupported instruction */;
            *(unsigned int *)((char *)v18 + v14->field_c) = 1;
            v22 = sub_a7c11c();
            *(unsigned long long *)((char *)v18 + v19) = v22;
            if (v22)
                return 1;
            sub_a368c8(1);
            sub_a369bc("crypto/asn1/tasn_utl.c", 91, "ossl_asn1_do_lock");
            sub_a36abc(13, 0x8000f, 0);
        }
        return 0xffffffff;
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        return /* unsupported instruction */ + 1;
    }
}
