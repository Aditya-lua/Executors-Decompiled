/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33a3c..0xa33ca4 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33a3c_0 {
    long long field_0;
    char padding_8[144];
    char field_98;
} st_a33a3c_0;

extern long long g_a32f08;
extern long long g_f086d8;
extern unsigned int g_f0d558;
extern long long g_f0d560;
extern st_a33a3c_0 *g_f12820;

char sub_a33a3c(long long a0)
{
    unsigned long v4;  // cc_op
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    long long v12;  // x1
    char v13;  // x2
    st_a33a3c_0 *v14;  // x20
    st_a33a3c_0 *v15;  // x20
    char v16;  // x0
    char v17;  // x20
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    long long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0)
    {
        sub_a31468();
        if (sub_a7c208(&g_f086d8, &g_a32f08))
        {
            v5 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
            v6 = arm64g_calculate_condition(19, (v5 & 1 ? g_f0d558 : 0x40000000), 0, 0);
            if (v6 & 1)
                goto LABEL_a33ae8;
LABEL_a33a88:
            sub_a368c8();
            sub_a369bc("crypto/engine/eng_list.c", 420, "ENGINE_by_id");
            v12 = 524303;
            v13 = 0;
        }
        else
        {
            v8 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
            v9 = arm64g_calculate_condition(16, (v8 & 1 ? g_f0d558 : 0x40000000), 0, 0);
            if (!(v9 & 1))
                goto LABEL_a33a88;
LABEL_a33ae8:
            if (!sub_a7c198(g_f0d560))
                return 0;
            v14 = g_f12820;
            if (g_f12820)
            {
                do
                {
                    v15 = v14;
                    if (!_strcmp(a0, v15->field_0))
                    {
                        if (!(v15->field_98 >> 2 & 1))
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            sub_a7c1b4(g_f0d560);
                            return v15;
                        }
                        v15 = sub_a32f34();
                        if (v15)
                        {
                            sub_a33ca4();
                            sub_a7c1b4(g_f0d560);
                            return v15;
                        }
                        break;
                    }
                } while ((v14 = *(long long *)&v15[1].padding_8[31], *(long long *)&v15[1].padding_8[31]));
            }
            sub_a7c1b4(g_f0d560);
            if (_strcmp(a0, "dynamic"))
            {
                v16 = sub_a6ac44("OPENSSL_ENGINES");
                if (!v16)
                    v16 = sub_a69ac8();
                v17 = sub_a33a3c("dynamic");
                if (v17 && sub_a31c3c(v17, "ID", a0, 0) && sub_a31c3c(v17, "DIR_LOAD", "2", 0) && sub_a31c3c(v17, "DIR_ADD", v16, 0) && sub_a31c3c(v17, "LIST_ADD", "1", 0) && sub_a31c3c(v17, "LOAD", 0, 0))
                    return v17;
            }
            else
            {
                v17 = 0;
            }
            sub_a368c8(sub_a330d4(v17));
            sub_a369bc("crypto/engine/eng_list.c", 470, "ENGINE_by_id");
            v0 = a0;
            v13 = (char)"id=%s";
            v12 = 116;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_list.c", 413, "ENGINE_by_id");
        v12 = 786690;
        v13 = 0;
    }
    sub_a36abc(38, v12, v13);
    return 0;
}
