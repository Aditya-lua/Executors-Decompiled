/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x992b38..0x9930b0 (1400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_992b38_4 {
    char padding_0[3192];
    struct st_992b38_3 *field_c78;
} st_992b38_4;

typedef struct st_992b38_3 {
    char padding_0[40];
    struct st_992b38_1 *field_28;
} st_992b38_3;

typedef struct st_992b38_1 {
    unsigned long long field_0;
} st_992b38_1;

extern char g_10002b0;

int sub_992b38(void* a0, unsigned int a1, unsigned long a2, char a3, char *a4)
{
    char v6;  // x24
    char v7;  // x8
    st_992b38_4 *v16;  // x8
    char v8;  // x19
    char v9;  // x21
    unsigned long long v10;  // 4118
    void* v11;  // x22
    void* v12;  // x0
    long long v13;  // x2
    char v15;  // w21
    char *v0;  // [bp-0x380]
    unsigned long long v1;  // [bp-0x378]
    char v2;  // [bp-0x368]
    unsigned long v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a0 && !*(int *)a0)
    {
        *(unsigned int *)&a0[104] = 1;
        v6 = (long long)a0[3240];
        if (a3 < v6 || (v7 = (long long)a0[3264], (long long)a0[3264] + v6 > a3))
        {
            sub_a368c8();
            sub_a369bc("ssl/record/rec_layer_s3.c", 301, "ssl3_write_bytes");
            v12 = a0;
            v13 = 271;
            goto LABEL_992bc4;
        }
        v8 = (char)a0;
        if ((int)a0[240] != 4)
        {
LABEL_992c48:
            v9 = a3;
            *(unsigned long long *)&a0[3240] = 0;
            if (!v7)
            {
                v10 = arm64g_calculate_condition(0x11, (int)a0[2980], 1, 0);
                if (v10 & 1 || (int)a0[2660] >= 1)
                    sub_9a57a8(v8, 1);
            }
            v11 = (void*)v8;
            if (sub_9a5694(v11))
            {
                v11 = (void*)v8;
                if (!sub_9a5960(v8) && (int)v11[240] != 6)
                    (long long)v11[112]();
            }
            if ((long long)v11[3264])
            {
                if (v9 >= (unsigned long long)(long long)v11[3264] && ((char)((char)v11[2488]) >> 1 & 1 || (long long)v11[3280] == a2) && (char)v11[3272] == a1)
                    (*(long long *)((long long)v11[3192] + 56))();
                sub_a368c8();
                sub_a369bc("ssl/record/rec_layer_s3.c", 263, "tls_write_check_pending");
                v12 = v11;
                v13 = 127;
            }
            else
            {
                if (!v6)
                {
                    *(unsigned long long *)&v11[3264] = 0;
                    *(char *)&v11[3272] = a1;
                    *(unsigned long *)&v11[3280] = a2;
                }
                if (v9 == v6)
                {
                    *(unsigned long long *)a4 = v9;
                    if (*(long long *)&g_10002b0 == v3)
                        return 1;
                    ___stack_chk_fail();
                }
                else
                {
                    if ((int)v11[452] >= 1)
                        (*(long long *)((long long)v11[24] + 144))();
                    v15 = sub_963ccc(v11);
                    v1 = sub_963cf8(v11) & 0xffffffff;
                    if (v15 && (unsigned int)v1 && v15 >= (unsigned int)v1)
                    {
                        if (sub_9a565c() == 13)
                        {
                            v16 = (st_992b38_4 *)v8;
                            if (*(int *)(v8 + 2976))
                                goto LABEL_992e84;
                            if ((sub_962324(v16) & 0xffffff00) != 0x300)
                                goto LABEL_992e80;
                            v16 = (st_992b38_4 *)v8;
                        }
                        else
                        {
LABEL_992e80:
                            v16 = (st_992b38_4 *)v8;
LABEL_992e84:
                        }
                        v0 = &v2;
                        v16->field_c78->field_28();
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/record/rec_layer_s3.c", 391, "ssl3_write_bytes");
                    v12 = (void*)v8;
                    v13 = 786691;
                }
            }
LABEL_992bc4:
            sub_9a58a4(v12, 80, v13, 0);
        }
        else if (sub_9930b0())
        {
            a0 = (void*)v8;
            v7 = *(long long *)(v8 + 3264);
            goto LABEL_992c48;
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0xffffffff;
    ___stack_chk_fail();
}
