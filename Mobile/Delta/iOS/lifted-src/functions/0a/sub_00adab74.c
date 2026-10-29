/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadab74..0xadae5c (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_adae5c;
extern char g_f12fc8;
extern long long g_f12fd0;
extern long long g_f12fd8;
extern uint128_t g_f12fe0;
extern uint128_t g_f12ff0;
extern uint128_t g_f13000;
extern uint128_t g_f13010;
extern unsigned long long g_f13020;
extern unsigned int g_f13028;
extern unsigned int g_f1302c;
extern long long g_f13040;
extern uint128_t g_f13230;
extern uint128_t g_f13240;
extern unsigned long long g_f13248;
extern uint128_t g_f13250;
extern uint128_t g_f13260;
extern unsigned long long g_f13270;
extern char g_10002b0;

unsigned int sub_adab74(long long a0, long long a1, unsigned int a2, unsigned int a3)
{
    unsigned long long v7;  // x26
    long long v8;  // x23
    unsigned int v17;  // w8
    unsigned long long v18;  // 4116
    unsigned long long v19;  // x21
    long long v20;  // x19
    unsigned long long v21;  // x0
    unsigned long long v22;  // x21
    unsigned long long v23;  // 4109
    unsigned long long v9;  // 4106
    unsigned long long v10;  // x0
    unsigned long long v11;  // x26
    unsigned long long v12;  // 4109
    unsigned long long v13;  // 4112
    unsigned int v14;  // x20
    unsigned int ptr;  // x0
    unsigned int v16;  // w8
    char v0;  // [bp-0x46d]
    unsigned long v1;  // [bp-0x468]
    unsigned int v2;  // [bp-0x468]
    unsigned int v3;  // [bp-0x460]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    g_f1302c = 0;
    g_f13028 = 0;
    v1 = &g_adae5c;
    v3 = 0;
    v7 = 0xffffffffffffffe1;
    v8 = &g_f13040;
    do
    {
        v9 = arm64g_calculate_condition(2, v7, 23, 0);
        if (!(v9 & 1))
        {
            v10 = v7 + 32;
            if (((unsigned int)v10 & 30) != 30)
                _sigaction(v10, &v1, v8);
        }
    } while ((v8 += 16, v11 = v7 + 1, v12 = arm64g_calculate_condition(0x22, v7, 1, 0), v7 += 1, !(v12 & 1)));
    _signal(28, 0);
    g_f13028 = 1;
    if (!a2)
    {
        g_f13250 = g_f13000;
        g_f13260 = g_f13010;
        g_f13270 = g_f13020;
        g_f13230 = g_f12fe0;
        g_f13240 = g_f12ff0;
        g_f13248 = g_f13248 & 0xfffffffffffffff7;
        if (g_f12fc8 != 1)
            goto LABEL_adac94;
        v13 = arm64g_calculate_condition(1, _tcsetattr(_fileno(g_f12fd0), 0, &g_f13230) & 0xffffffff, 1, 0);
        if (!(v13 & 1))
            goto LABEL_adac94;
        if (g_f1302c != 2)
            v14 = 0;
        else
            v14 = 0xffffffff;
LABEL_adaddc:
        _fputc(10, g_f12fd8);
        v17 = g_f13028;
        if (a2 || (int)g_f13028 <= 1)
            goto LABEL_adace8;
        g_f13250 = g_f13000;
        g_f13260 = g_f13010;
        g_f13270 = g_f13020;
        g_f13230 = g_f12fe0;
        g_f13240 = g_f12ff0;
        if (g_f12fc8 == 1)
        {
            v18 = arm64g_calculate_condition(1, _tcsetattr(_fileno(g_f12fd0), 0, &g_f13230) & 0xffffffff, 1, 0);
            if (v18 & 1)
                v14 = 0;
            else
                v14 &= 0xffffffff;
        }
LABEL_adace4:
        v17 = g_f13028;
    }
    else
    {
LABEL_adac94:
        g_f13028 = 2;
        v2 = 0;
        if (!_fgets(&v2, 0x3ff, g_f12fd0) || _feof(g_f12fd0) || _ferror(g_f12fd0))
        {
LABEL_adacd0:
            v16 = 0;
        }
        else
        {
            ptr = _strchr(&v2, 10);
            if (!ptr)
            {
                do
                {
                    if (!_fgets(&v0, 4, g_f12fd0))
                        goto LABEL_adacd0;
                } while (!_strchr(&v0, 10));
            }
            else if (a3)
            {
                *(char *)ptr = 0;
            }
            v16 = ~(unsigned int)sub_ada4b0(a0, a1, &v2) >> 31;
        }
        if (g_f1302c != 2)
            v14 = v16;
        else
            v14 = 0xffffffff;
        if (a2)
            goto LABEL_adace4;
        goto LABEL_adaddc;
    }
LABEL_adace8:
    if ((int)v17 >= 1)
    {
        v19 = 0xffffffffffffffe1;
        v20 = &g_f13040;
        do
        {
            v21 = v19 + 32;
            if (~((unsigned int)v21 >> 1 & 15))
                _sigaction(v21, v20, 0);
        } while ((v20 += 16, v22 = v19 + 1, v23 = arm64g_calculate_condition(0x22, v19, 1, 0), v19 += 1, !(v23 & 1)));
    }
    sub_a66ec0(&v2, 0x400);
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    ___stack_chk_fail();
}
