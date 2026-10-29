/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45a18..0xb45d18 (768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45a18_0 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_b45a18_1 *field_18;
    char padding_20[8];
    struct st_b45a18_1 *field_28;
    unsigned long long field_30;
    char padding_38[56];
    unsigned int field_70;
    char padding_74[4];
    unsigned int field_78;
    char padding_7c[4];
    unsigned long long field_80;
    char padding_88[40];
    long long field_b0;
    unsigned int field_b8;
    unsigned int field_bc;
    long long field_c0;
    unsigned long long field_c8;
    char padding_d0[8];
    unsigned int field_d8;
    char padding_dc[12];
    unsigned int field_e8;
} st_b45a18_0;

typedef struct st_b45a18_1 {
    unsigned long long field_0;
} st_b45a18_1;


unsigned long long sub_b45a18(st_b45a18_0 *a0, unsigned long a1, unsigned long a2, unsigned int a3, unsigned long long a4, long long a5, long long a6)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // w8
    long long v5;  // x1
    unsigned int v6;  // w0
    unsigned long long v7;  // w25
    long long t;  // x0
    unsigned int v9;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (a0->field_0)
    {
        v3 = sub_a7c198(a0->field_0);
        if (!(unsigned int)v3)
            return v3;
    }
    v4 = a0->field_e8;
    if (v4 != 1)
    {
        if (v4 == 2)
            a0->field_18();
        if (v4)
        {
LABEL_b45a90:
            if (v4 != 2)
                goto LABEL_b45ac0;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 640, "ossl_prov_drbg_generate");
            v5 = 192;
        }
        else
        {
            sub_b45dd0(a0, a0->field_78, 0, 0, 0);
            v4 = a0->field_e8;
            if (a0->field_e8)
                goto LABEL_b45a90;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 644, "ossl_prov_drbg_generate");
            v5 = 193;
        }
    }
    else
    {
LABEL_b45ac0:
        if (a3 > a0->field_78)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 649, "ossl_prov_drbg_generate");
            v5 = 181;
        }
        else if (a2 > a0->field_80)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 654, "ossl_prov_drbg_generate");
            v5 = 196;
        }
        else if ((unsigned long long)a6 > (unsigned long long)a0->field_b0)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg.c", 658, "ossl_prov_drbg_generate");
            v5 = 184;
        }
        else
        {
            v6 = sub_a7c2bc();
            if (a0->field_70 == v6)
            {
                v7 = 0;
            }
            else
            {
                a0->field_70 = v6;
                v7 = 1;
            }
            if (a0->field_bc && a0->field_b8 >= a0->field_bc)
                v7 = 1;
            if ((long long)a0->field_c8 >= 1)
            {
                t = _time(0);
                if (t < a0->field_c0 || t - a0->field_c0 >= (long long)a0->field_c8)
                    v7 = 1;
            }
            if (a0->field_30)
            {
                v9 = sub_b468a8(a0);
                if (v9 != a0->field_d8)
                    v7 = 1;
            }
            if (!v7 && !(unsigned int)a4)
            {
                a0->field_28();
            }
            else if (sub_b46598(a0, a4, 0, 0, a5, a6))
            {
                a0->field_28();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/rands/drbg.c", 686, "ossl_prov_drbg_generate");
                v5 = 197;
            }
        }
    }
    sub_a36abc(57, v5, 0);
    if (!a0->field_0)
        return 0;
    sub_a7c1b4(a0->field_0);
    return 0;
}
