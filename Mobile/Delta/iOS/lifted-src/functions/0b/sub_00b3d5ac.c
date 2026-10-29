/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d5ac..0xb3d7c8 (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d5ac_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_b3d5ac_1;

typedef struct st_b3d5ac_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    char field_20;
    char padding_21[23];
    long long field_38;
} st_b3d5ac_0;


void* sub_b3d5ac(char index)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x21
    unsigned int v12;  // w8
    unsigned long long v13;  // 4102
    st_b3d5ac_0 *v14;  // x20
    char idx;  // x0
    st_b3d5ac_1 *v5;  // x21
    void* v6;  // x22
    unsigned long v7;  // x9
    unsigned int v8;  // w8
    unsigned long long v9;  // 4102
    long long v10;  // x1
    st_b3d5ac_0 *v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!index)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = *(long long *)index;
        if (sub_a2f9e0() && !(idx = sub_a6bffc(72, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 71), !idx))
        {
            /* unsupported instruction */;
            *(unsigned int *)(idx + 8) = 1;
            *(unsigned long *)idx = v3;
            *(unsigned int *)(idx + 64) = 0;
            if (!(*(char *)(index + 8) & 3))
                return idx;
            v5 = index + 16;
            if (*(long long *)(index + 16))
            {
                v6 = (void*)idx;
                if (sub_afde10(idx + 32, index + 32))
                {
                    sub_afdddc(index + 32);
                    v7 = *(long long *)(index + 24);
                    *(long long *)&v6[16] = *(long long *)(index + 16);
                    *(unsigned long *)&v6[24] = v7;
                    *(unsigned long long *)v5->padding_0 = 0;
                    v5->field_8 = 0;
                    return v6;
                }
                do
                {
                    /* unsupported instruction */;
                    v8 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v9 = arm64g_calculate_condition(19, v8, 1, 0);
                if (!(v9 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < (int)v8)
                {
                    goto LABEL_b3d79c;
                }
                sub_a6d4c0((long long)v6[16], (long long)v6[24], "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 96);
                sub_a6c2e4((long long)v6[56], "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 97);
                sub_afdddc(v6 + 32);
                sub_a6c2e4(v6, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 100);
LABEL_b3d79c:
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 503, "mac_gen");
                v10 = 786691;
            }
            else
            {
                v11 = (st_b3d5ac_0 *)idx;
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 490, "mac_gen");
                sub_a36abc(57, 158, 0);
                do
                {
                    /* unsupported instruction */;
                    v12 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v13 = arm64g_calculate_condition(19, v12, 1, 0);
                if (!(v13 & 1))
                {
                    /* unsupported instruction */;
                    v14 = v11;
                }
                else
                {
                    v14 = v11;
                    if (1 < (int)v12)
                        return 0;
                }
                sub_a6d4c0(v14->field_10, v14->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 96);
                sub_a6c2e4(v14->field_38, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 97);
                sub_afdddc(&v14->field_20);
                sub_a6c2e4(v14, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 100);
                return 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 481, "mac_gen");
            v10 = 524345;
        }
        sub_a36abc(57, v10, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
