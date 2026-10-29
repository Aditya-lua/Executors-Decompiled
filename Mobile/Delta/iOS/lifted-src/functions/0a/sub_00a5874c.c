/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5874c..0xa58a04 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5874c_0 {
    char padding_0[16];
    struct st_a5874c_1 *field_10;
    unsigned long long field_18;
} st_a5874c_0;

typedef struct st_a5874c_2 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a5874c_2 *field_10;
    unsigned long long field_18;
    unsigned int field_20;
} st_a5874c_2;

typedef struct st_a5874c_1 {
    unsigned int field_0;
} st_a5874c_1;


st_a5874c_2 * sub_a5874c(unsigned int a0, st_a5874c_0 *a1, unsigned long a2)
{
    unsigned int *v2;  // x24
    st_a5874c_2 *v3;  // x19
    st_a5874c_2 *v4;  // x0
    unsigned long i;  // x10
    unsigned int v6;  // w8
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(144, "crypto/evp/mac_meth.c", 49);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/mac_meth.c", 66, "evp_mac_from_algorithm");
        sub_a36abc(6, 0x80006, 0);
        return v3;
    }
    /* unsupported instruction */;
    v3->field_20 = 1;
    v3->field_8 = a0;
    v4 = sub_a6895c(a1);
    v3->field_10 = v4;
    if (v4)
    {
        v3->field_18 = a1->field_18;
        for (i = v2 + 2; 13 < (unsigned int)*(int *)(i - 8); i += 16);
        goto *((void *)(sub_a587f4 + *(char *)(*(int *)(i - 8) + 14611254) * 4));
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            v6 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v7 = arm64g_calculate_condition(19, v6, 1, 0);
        if (!(v7 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < (int)v6)
        {
            return 0;
        }
        sub_a6c2e4(v3->field_10, "crypto/evp/mac_meth.c", 39);
        sub_a78ccc(v3->field_0);
        sub_a6c2e4(v3, "crypto/evp/mac_meth.c", 42);
        return 0;
    }
}
