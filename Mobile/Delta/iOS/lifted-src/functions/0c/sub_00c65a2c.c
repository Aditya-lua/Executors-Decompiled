/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc65a2c..0xc65bfc (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c65a2c_0 {
    char padding_0[8];
    long long field_8;
} st_c65a2c_0;

typedef struct st_c65a2c_3 {
    char padding_0[72];
    unsigned int field_48;
    char padding_4c[172];
    struct st_c65a2c_0 *field_f8;
    char padding_100[8];
    struct st_c65a2c_1 *field_108;
    struct st_c65a2c_1 *field_110;
    char padding_118[984];
    struct st_c65a2c_2 *field_4f0;
    char padding_4f8[1920];
    unsigned long long field_c78;
    char padding_c80[8];
    unsigned long long field_c88;
} st_c65a2c_3;

typedef struct st_c65a2c_2 {
    char padding_0[288];
    long long field_120;
    char padding_128[16];
    char field_138;
    char padding_139[7];
    unsigned long long field_140;
    unsigned short field_148;
} st_c65a2c_2;

typedef struct st_c65a2c_1 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned short field_10;
    char padding_12[6];
    struct st_c65a2c_1 *field_18;
    unsigned long long field_20;
    struct st_c65a2c_1 *field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    struct st_c65a2c_1 *field_40;
    struct st_c65a2c_1 *field_48;
} st_c65a2c_1;

extern char g_10002b0;

int sub_c65a2c(st_c65a2c_3 *a0, st_c65a2c_1 *a1)
{
    st_c65a2c_1 *v6;  // x0
    st_c65a2c_1 *v7;  // x19
    st_c65a2c_1 *v16;  // x0
    st_c65a2c_1 *v17;  // x21
    st_c65a2c_1 *v8;  // x0
    long long v9;  // x2
    st_c65a2c_2 *v10;  // x9
    unsigned long long v11;  // x8
    unsigned long long v12;  // x10
    unsigned int v13;  // w10
    unsigned long long v14;  // x9
    unsigned int v15;  // w8
    st_c65a2c_1 *v0;  // [bp-0x40]
    char v1;  // [bp-0x3a]
    char v2;  // [bp-0x39]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!a0->field_110)
    {
        v6 = sub_a6bffc(80, "ssl/statem/statem_dtls.c", 76);
        if (!v6)
        {
            if (*(long long *)&g_10002b0 == v3)
                return (unsigned int)v6;
            ___stack_chk_fail();
        }
        v7 = v6;
        if (a0->field_108)
        {
            v8 = sub_a6bf4c(a0->field_108, "ssl/statem/statem_dtls.c", 80);
            if (v8)
                goto LABEL_c65ab4;
            v9 = 81;
            goto LABEL_c65b88;
        }
        else
        {
            v8 = 0;
LABEL_c65ab4:
            v7->field_40 = v8;
            v7->field_48 = 0;
            _memcpy(v8, a0->field_f8->field_8, a0->field_108);
            v10 = a0->field_4f0;
            v11 = v10->field_140;
            if (a1)
            {
                v12 = v11 + 3;
                if (a0->field_48 != 0x100)
                    v12 = v11 + 1;
            }
            else
            {
                v12 = v11 + 12;
            }
            if (v12 == (a0->field_108 & 0xffffffff))
            {
                v7->field_8 = v11;
                v13 = v10->field_148;
                v7->field_10 = v13;
                v7->field_0 = v10->field_138;
                v7->field_18 = 0;
                v7->field_20 = v11;
                *(unsigned int *)&v7->field_28 = (unsigned int)a1;
                v14 = a0->field_c88;
                v7->field_30 = a0->field_c78;
                v7->field_38 = v14;
                v0 = 0;
                v15 = (unsigned int)(struct st_c65a2c_1 *)(2 * v13 - (char *)a1);
                v1 = v15 >> 8;
                v2 = v15;
                v16 = sub_954220(&v0, v7);
                if (v16)
                {
                    v17 = v16;
                    if (sub_954298(a0->field_4f0->field_120, v17))
                    {
                        if (*(long long *)&g_10002b0 == v3)
                            return 1;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_9adea8(sub_9adeb8(v7->field_40));
                        sub_a6c2e4(v7, "ssl/statem/statem_dtls.c", 111);
                        sub_954264(v17);
                    }
                }
                else
                {
                    sub_9adea8(sub_9adeb8(v7->field_40));
                    v9 = 111;
LABEL_c65b88:
                    sub_a6c2e4(v7, "ssl/statem/statem_dtls.c", v9);
                }
            }
            else
            {
                sub_9aca2c(v7);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
