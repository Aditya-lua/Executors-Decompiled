/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c58c..0x95c7c8 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c58c_1 {
    unsigned int field_0;
} st_95c58c_1;

typedef struct st_95c58c_0 {
    struct st_95c58c_1 *field_0;
    char padding_8[32];
    struct st_95c58c_2 *field_28;
} st_95c58c_0;

typedef struct st_95c58c_2 {
    unsigned long long field_0;
} st_95c58c_2;

extern void g_d27d00;
extern char g_e86ac8;

unsigned long long sub_95c58c(st_95c58c_0 *a0, unsigned long long a1, unsigned int a2)
{
    unsigned int v4;  // x0
    long long v5;  // x8
    unsigned long long v14;  // x8
    unsigned int v15;  // x9
    long long v6;  // x1
    unsigned long long *v7;  // x10
    void* v8;  // x9
    unsigned long long v9;  // x8
    unsigned long v10;  // x9
    unsigned int v11;  // w11
    unsigned long long v12;  // x10
    unsigned int v13;  // w8
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_conf.c", 970, "SSL_CONF_cmd");
        v6 = 385;
    }
    else if (!(sub_95c7c8() && (v4 = sub_95c8ac(a0, a1), v4)))
    {
        if (!((char)((char)a0->field_0) >> 4 & 1))
            return 0xfffffffe;
        sub_a368c8();
        sub_a369bc("ssl/ssl_conf.c", 1003, "SSL_CONF_cmd");
        v0 = a1;
        sub_a36abc(20, 386, "cmd=%s");
        return 0xfffffffe;
    }
    else if (*(short *)(v4 + 26) == 4)
    {
        v5 = v4 - &g_e86ac8 >> 5;
        if ((unsigned long long)v5 >= 30)
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_conf.c", 957, "ctrl_switch_option");
            v6 = 786691;
        }
        else
        {
            v7 = a0->field_28;
            if (!v7)
            {
LABEL_95c710:
                return 1;
            }
            v8 = &(&g_d27d00)[16 * v5];
            v9 = *(long long *)v8;
            v10 = (int)v8[8];
            v11 = (unsigned int)v10 & 0xf00;
            if ((unsigned int)v10 & 0xf00)
            {
                switch (v11)
                {
                case 256:
                    v12 = 64;
                    break;
                case 512:
                    v12 = 72;
                    break;
                default:
                    goto LABEL_95c710;
                }
                if (!(v10 & 1))
                    v13 = *(int *)*(long long *)((char *)a0 + v12) | (unsigned int)v9;
                else
                    v13 = *(int *)*(long long *)((char *)a0 + v12) & ~(unsigned int)v9;
                *(unsigned int *)*(long long *)((char *)a0 + v12) = v13;
                return 1;
            }
            else
            {
                if (!(v10 & 1))
                    v14 = *v7 | v9;
                else
                    v14 = *v7 & ~v9;
                *v7 = v14;
                return 1;
            }
        }
    }
    else if (a2)
    {
        (*(long long *)v4)();
    }
    else if (!((char)((char)a0->field_0) >> 4 & 1))
    {
        return 0xfffffffd;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_conf.c", 995, "SSL_CONF_cmd");
        v15 = (unsigned int)"<EMPTY>";
        v0 = a1;
        v1 = v15;
        sub_a36abc();
        return 0xfffffffd;
    }
    sub_a36abc(20, v6, 0);
    return 0;
}
