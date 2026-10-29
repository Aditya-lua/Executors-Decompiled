/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d3bc..0xb2d600 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2d3bc_0 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    long long field_60;
    char padding_68[8];
    unsigned long long field_70;
} st_b2d3bc_0;

extern unsigned long long g_dfe450;
extern char g_10002b0;

unsigned long long sub_b2d3bc(st_b2d3bc_0 *a0, long long a1, long long a2, long long a3)
{
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v22;  // 4108
    unsigned long long v23;  // x21
    long long v14;  // x0
    unsigned long long v15;  // x24
    unsigned long long v16;  // x23
    unsigned int v17;  // w0
    unsigned long v18;  // x22
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // x25
    unsigned long long v21;  // 4108
    unsigned long v0;  // [bp-0x130]
    long long v1;  // [bp-0x128]
    long long v2;  // [bp-0x120]
    unsigned long v3;  // [bp-0x110]
    unsigned long v4;  // [bp-0x108]
    unsigned long v5;  // [bp-0x100]
    long long v6;  // [bp-0xf8]
    char v7;  // [bp-0xf0]
    char v8;  // [bp-0xb0]
    unsigned long v9;  // [bp-0x70]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v12 = sub_a2f9e0();
    if ((unsigned int)v12)
    {
        v12 = sub_b2d60c(a0, a3);
        if ((unsigned int)v12)
        {
            v13 = sub_954340(&a0->field_10);
            if (!v13)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/hkdf.c", 809, "kdf_tls1_3_derive");
                sub_a36abc(57, 129, 0);
                goto LABEL_b2d568;
            }
            else if (a0->field_8 != 2)
            {
                if (a0->field_8 != 1)
                    goto LABEL_b2d568;
                v14 = sub_9f2aec(a0->field_0);
                v5 = a0->field_30;
                v6 = v14;
                v15 = a0->field_38;
                v3 = a0->field_58;
                v4 = a0->field_50;
                v16 = v13;
                v17 = sub_a50ac8(v16);
                if ((int)v17 < 1)
                    goto LABEL_b2d568;
                v18 = v17;
                v19 = v15;
                if (!v15)
                {
                    v20 = v18;
                    v21 = arm64g_calculate_condition(4, v19, 0, 0);
                    if (!(v21 & 1))
                        goto LABEL_b2d486;
LABEL_b2d485:
                    v15 = &g_dfe450;
                }
                else
                {
                    v20 = a0->field_40;
                    v22 = arm64g_calculate_condition(4, v19, 0, 0);
                    if (v22 & 1)
                        goto LABEL_b2d485;
LABEL_b2d486:
                }
                if (a0->field_28)
                {
                    v23 = sub_a3f728();
                    if (v23 && (int)sub_a3fe04(v23, v16, 0) >= 1 && (int)sub_a3ff7c(v23, &v7, 0) > 0)
                    {
                        sub_a3f73c(v23);
                        v12 = sub_b2dd98(v16, a0->field_28, v5, a0->field_48, v4, v3, a0->field_60, &v7, v18, &v8, v18);
                        if ((unsigned int)v12)
                        {
                            v12 = sub_b2d798(v6, v16, &v8, v18, v15, v20, a1, a2);
                            sub_a66ec0(&v8, v18);
                        }
                    }
                    else
                    {
                        sub_a3f73c(v23);
LABEL_b2d568:
                        v12 = 0;
                    }
                }
                else
                {
                    v12 = sub_b2d798(v6, v16, &g_dfe450, v18, v15, v20, a1, a2);
                }
            }
            else
            {
                v1 = a1;
                v2 = a2;
                v0 = a0->field_70;
                v12 = sub_b2dd98();
            }
        }
    }
    if (*(long long *)&g_10002b0 == v9)
        return v12;
    ___stack_chk_fail();
}
