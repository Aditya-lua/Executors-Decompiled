/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2d090..0xb2d32c (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2d090_1 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
    struct st_b2d090_0 *field_38;
    long long field_40;
    char padding_48[48];
    unsigned long long field_78;
    long long field_80;
} st_b2d090_1;

typedef struct st_b2d090_0 {
    struct st_b2d090_0 *field_0;
} st_b2d090_0;

extern char g_10002b0;

st_b2d090_0 ** sub_b2d090(st_b2d090_1 *a0, long long a1, st_b2d090_0 **a2, st_b2d090_0 **a3)
{
    long long v5;  // x0
    st_b2d090_0 **v6;  // x0
    st_b2d090_0 **v7;  // x0
    st_b2d090_0 **v8;  // x25
    unsigned int v9;  // w0
    unsigned long v10;  // x26
    long long v11;  // x1
    unsigned long v0;  // [bp-0xb0]
    char v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v5 = sub_9f2aec(a0->field_0);
    v6 = sub_a2f9e0(v5);
    if ((unsigned int)v6 && (!a3 || !*a3 || !(v6 = sub_b2da4c(a0, a3), !(unsigned int)v6 || (v6 = sub_a71994(a3, "info", &a0->field_78, &a0->field_80, "(x"), !(unsigned int)v6))))
    {
        v7 = sub_954340(&a0->field_10);
        if (!v7)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hkdf.c", 225, "kdf_hkdf_derive");
            v11 = 129;
            goto LABEL_b2d20c;
        }
        if (!a0->field_38)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hkdf.c", 229, "kdf_hkdf_derive");
            v11 = 128;
            goto LABEL_b2d20c;
        }
        if (!a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hkdf.c", 233, "kdf_hkdf_derive");
            v11 = 105;
LABEL_b2d20c:
            sub_a36abc(57, v11, 0);
LABEL_b2d214:
            v6 = 0;
            goto LABEL_b2d218;
        }
        if (a0->field_8 != 1)
        {
            if (a0->field_8 != 2)
            {
                v8 = v7;
                v9 = sub_a50ac8();
                if ((int)v9 < 1)
                    goto LABEL_b2d214;
                v0 = a0->field_78;
                v10 = v9;
                v6 = sub_b2d798(v5, v8, a0->field_28, a0->field_30, a0->field_38, a0->field_40, &v1, v10, v0);
                if ((unsigned int)v6)
                {
                    v6 = sub_b2d890(v8, &v1, v10, v0, a0->field_80, a1, a2);
                    sub_a66ec0(&v1, 64);
                    goto LABEL_b2d218;
                }
            }
            else if (*(long long *)&g_10002b0 == v2)
            {
                return sub_b2d890();
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v2)
                return sub_b2d798();
        }
    }
    else
    {
LABEL_b2d218:
        if (*(long long *)&g_10002b0 == v2)
            return v6;
    }
    ___stack_chk_fail();
}
