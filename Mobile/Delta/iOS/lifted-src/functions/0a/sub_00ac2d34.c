/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2d34..0xac31bc (1160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac2d34_3 {
    char padding_0[152];
    struct st_ac2d34_4 *field_98;
    struct st_ac2d34_1 *field_a0;
    struct st_ac2d34_2 *field_a8;
    unsigned long long field_b0;
} st_ac2d34_3;

typedef struct st_ac2d34_1 {
    char padding_0[32];
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    char padding_2c[8];
    unsigned int field_34;
} st_ac2d34_1;

typedef struct st_ac2d34_2 {
    char padding_0[72];
    struct st_ac2d34_0 *field_48;
} st_ac2d34_2;

typedef struct st_ac2d34_0 {
    unsigned long long field_0;
} st_ac2d34_0;

typedef struct st_ac2d34_4 {
    char field_0;
} st_ac2d34_4;

extern char g_10002b0;

char * sub_ac2d34(st_ac2d34_3 **a0, char *a1, long long a2, long long a3, long long a4, char *a5, long long a6, char *a7, unsigned long long *a8, unsigned long a9)
{
    char *v17;  // x0
    char *v18;  // x22
    st_ac2d34_3 *v19;  // x25
    st_ac2d34_1 *v20;  // x21
    unsigned long v21;  // x23
    unsigned long long v0;  // [bp-0x580]
    unsigned long v1;  // [bp-0x578]
    st_ac2d34_2 *v2;  // [bp-0x570]
    unsigned long v3;  // [bp-0x568]
    unsigned long long *v4;  // [bp-0x560]
    unsigned int v5;  // [bp-0x554]
    unsigned int v6;  // [bp-0x550]
    char *v7;  // [bp-0x548]
    unsigned long v8;  // [bp-0x540]
    char *v9;  // [bp-0x538]
    char v10;  // [bp-0x530]
    char *v11;  // [bp-0x4f8]
    unsigned long v12;  // [bp-0x4f0]
    char v13;  // [bp-0x4e1]
    char v14;  // [bp-0xa1]
    unsigned long v15;  // [bp-0x70]
    st_ac2d34_0 **v16;  // [bp-0x10]

    v16 = &a8;
    v15 = *(long long *)&g_10002b0;
    v9 = 0;
    if (a7)
    {
        v17 = sub_ac31bc(a1, a2, a3, a4, a6, &v13, &v9);
        if (v17)
        {
LABEL_ac2db8:
            v19 = *a0;
            v20 = v19->field_a0;
            v21 = v20->field_34;
            if (a7)
            {
                if (v21 > a9)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/slh_dsa/slh_dsa.c", 74, "slh_sign_internal");
                    v0 = a9;
                    v1 = v21;
                    sub_a36abc(57, 179, "is %zu, should be at least %zu");
                }
                else if ((int)v19->field_98)
                {
                    v4 = a8;
                    v5 = v20->field_20;
                    v6 = v20->field_24;
                    v8 = v19->field_b0;
                    if (sub_c68800(&v10, a7, v21, 0))
                    {
                        v11 = &v14;
                        v12 = v20->field_28;
                        v3 = v12;
                        v7 = v9;
                        v2 = v19->field_a8;
                        v19->field_a8->field_48();
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/slh_dsa/slh_dsa.c", 80, "slh_sign_internal");
                    sub_a36abc(57, 128, 0);
                }
                v18 = 0;
            }
            else
            {
                *a8 = v21;
                v18 = 1;
            }
            if (v17 != a1)
            {
                if (v17 != &v13)
                    sub_a6c4e8(v17, v9, "crypto/slh_dsa/slh_dsa.c", 309);
                else
                    sub_a66ec0(&v13, 0x400);
            }
        }
        else
        {
            v18 = 0;
        }
        if (*(long long *)&g_10002b0 == v15)
            return v18;
        ___stack_chk_fail();
    }
    else
    {
        v9 = 0;
        v17 = &v13;
        goto LABEL_ac2db8;
    }
}
