/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc60c..0xafc7e4 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc60c_0 {
    char padding_0[200];
    char field_c8;
    char padding_c9[15];
    unsigned long long field_d8;
    unsigned long long field_e0;
    struct st_afc60c_0 *field_e8;
    struct st_afc60c_0 *field_f0;
    struct st_afc60c_0 *field_f8;
    long long field_100;
    long long field_108;
    long long field_110;
    long long field_118;
    long long field_120;
    long long field_128;
    long long field_130;
    char padding_138[24];
    struct st_afc60c_0 *field_150;
    char padding_158[8];
    struct st_afc60c_0 *field_160;
    struct st_afc60c_0 *field_168;
    struct st_afc60c_0 *field_170;
    struct st_afc60c_0 *field_178;
} st_afc60c_0;

typedef struct st_afc60c_1 {
    char padding_0[200];
    char field_c8;
    char padding_c9[15];
    unsigned long long field_d8;
    unsigned long long field_e0;
    struct st_afc60c_1 *field_e8;
    struct st_afc60c_1 *field_f0;
    struct st_afc60c_1 *field_f8;
    char field_100;
    char padding_101[7];
    unsigned long long field_108;
    unsigned long long field_110;
    unsigned long long field_118;
    unsigned long long field_120;
    unsigned long long field_128;
    unsigned long long field_130;
    char padding_138[24];
    struct st_afc60c_1 *field_150;
    char padding_158[8];
    struct st_afc60c_1 *field_160;
    struct st_afc60c_1 *field_168;
    struct st_afc60c_1 *field_170;
    struct st_afc60c_1 *field_178;
} st_afc60c_1;

extern long long g_adf878;

st_afc60c_1 * sub_afc60c(st_afc60c_1 *a0, st_afc60c_0 **a1, unsigned long a2, st_afc60c_1 **a3)
{
    st_afc60c_0 *v2;  // x19
    st_afc60c_0 *v3;  // x8
    st_afc60c_1 *v4;  // x0
    st_afc60c_1 *v5;  // x8
    st_afc60c_0 *v6;  // x20
    st_afc60c_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    if (14 >= a0)
    {
        switch (a0)
        {
        case 3:
            sub_a6a9e8();
            sub_afc7f0(v2->field_150);
            sub_9cf0f4(v2->field_f8);
            sub_ae2638(v2->field_100);
            sub_ae618c(v2->field_110);
            sub_add704(v2->field_108);
            sub_ae75d4(v2->field_118);
            sub_ae8704(v2->field_120);
            sub_ad6958(v2->field_128, &g_adf878);
            sub_ae2de4(v2->field_130);
            sub_9cf0f4(v2->field_168);
            sub_a6c2e4(v2->field_178, "crypto/x509/x_x509.c", 98);
            break;
        case 4:
            sub_a6a9e8(3, v2, &v2->field_c8);
            sub_afc7f0(v2->field_150);
            sub_9cf0f4(v2->field_f8);
            sub_ae2638(v2->field_100);
            sub_ae618c(v2->field_110);
            sub_add704(v2->field_108);
            sub_ae75d4(v2->field_118);
            sub_ae8704(v2->field_120);
            sub_ad6958(v2->field_128, &g_adf878);
            sub_ae2de4(v2->field_130);
            sub_9cf0f4(v2->field_168);
        case 1:
            *(unsigned int *)&v2->field_160 = 0;
            v2->field_e8 = 0;
            v2->field_f0 = 0;
            v2->field_d8 = 0xffffffffffffffff;
            v2->field_e0 = 0xffffffffffffffff;
            v2->field_168 = 0;
            v2->field_150 = 0;
            v3 = v2;
            *(uint128_t *)&v3->field_f8 = 0;
            memset(&v3->field_108, 0, 48);
            v4 = sub_a6a660(3, v2, &v2->field_c8);
            if (!(unsigned int)v4)
                return v4;
            break;
        default:
            break;
        }
    }
    else if (a0 != 15)
    {
        if (a0 != 16)
        {
            if (a0 == 0x11)
                v5 = v2->field_178;
            else
                return 1;
        }
        else
        {
            v5 = v2->field_170;
        }
        *a3 = v5;
    }
    else if (v2)
    {
        v6 = a3[47];
        v2->field_170 = a3[46];
        sub_a6c2e4(v2->field_178, "crypto/x509/x_x509.c", 144);
        v2->field_178 = 0;
        if (v6)
        {
            v7 = sub_a6d9b4(v6, "crypto/x509/x_x509.c", 147);
            v2->field_178 = v7;
            if (!v7)
                return v7;
        }
    }
    return 1;
}
