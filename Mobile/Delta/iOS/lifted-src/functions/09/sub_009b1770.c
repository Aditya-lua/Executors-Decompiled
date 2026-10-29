/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b1770..0x9b1b7c (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b1770_0 {
    char padding_0[216];
    void* field_d8;
} st_9b1770_0;

typedef struct st_9b1770_1 {
    char padding_0[24];
    struct st_9b1770_0 *field_18;
    char padding_20[40];
    unsigned long long field_48;
    char padding_50[304];
    unsigned long long field_180;
    char padding_188[1864];
    unsigned int field_8d0;
    char padding_8d4[228];
    char field_9b8;
} st_9b1770_1;

typedef struct st_9b1770_2 {
    unsigned long long field_0;
    struct st_9b1770_3 *field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_9b1770_2;

typedef struct st_9b1770_3 {
    unsigned long long field_0;
} st_9b1770_3;

extern st_9b1770_2 g_e89520;
extern st_9b1770_2 g_e895b0;

unsigned long long sub_9b1770(st_9b1770_1 *a0, unsigned long long a1, unsigned long a2)
{
    unsigned long long v4;  // w21
    unsigned long long v5;  // w0
    unsigned int *v14;  // x27
    unsigned long long v7;  // w1
    st_9b1770_2 *v8;  // x8
    unsigned int *v13;  // x27
    st_9b1770_2 *v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (int)a0->field_48;
    *(unsigned int *)&a0->field_48 = a1;
    v5 = (unsigned int)sub_99af14();
    if (!v5)
    {
        *(unsigned int *)&a0->field_48 = v4;
        return v5;
    }
    if (a0->field_8d0 && (int)a0->field_48 != 772)
    {
        *(unsigned int *)&a0->field_48 = v4;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2367, "ssl_choose_client_version");
        sub_9a58a4(a0, 70, 266, 0);
        return 0;
    }
    switch (v7)
    {
    case 131071:
        v8 = &g_e895b0.field_0;
        if ((int)g_e895b0.field_0)
        {
LABEL_9b1834:
            v1 = 0;
            v0 = v8;
            v13 = &v8->field_18;
            do
            {
                v14 = v13;
                if (*(long long *)((char *)v14 - 16))
                    (*(long long *)((char *)v14 - 16))();
                v13 = v14 + 6;
            } while (*v14);
            break;
        }
        break;
    case 65536:
        v8 = &g_e89520.field_0;
        if ((int)g_e89520.field_0)
            goto LABEL_9b1834;
        break;
    default:
        if ((int)a0->field_48 != *(int *)&a0->field_18->padding_0[0])
        {
            *(unsigned int *)&a0->field_48 = v4;
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 2375, "ssl_choose_client_version");
            sub_9a58a4(a0, 70, 266, 0);
            return 0;
        }
        else if (sub_c64b00(a0))
        {
            return 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_lib.c", 2386, "ssl_choose_client_version");
            sub_9a58a4(a0, 80, 0xc0103, 0);
            return 0;
        }
    }
    *(unsigned int *)&a0->field_48 = v4;
    sub_a368c8();
    sub_a369bc("ssl/statem/statem_lib.c", 2401, "ssl_choose_client_version");
    sub_9a58a4(a0, 70, 191, 0);
    return 0;
}
